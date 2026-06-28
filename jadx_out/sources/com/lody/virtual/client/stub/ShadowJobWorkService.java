package com.lody.virtual.client.stub;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.IJobCallback;
import android.app.job.IJobService;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.client.core.InvocationStubManager;
import com.lody.virtual.client.hook.proxies.am.ActivityManagerStub;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.collection.SparseArray;
import com.lody.virtual.helper.compat.JobWorkItemCompat;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.server.job.VJobSchedulerService;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes3.dex */
public class ShadowJobWorkService extends Service {
    private static final String TAG = "ShadowJobWorkService";
    private static final boolean debug = true;
    private final SparseArray<JobSession> mJobSessions = new SparseArray<>();
    private JobScheduler mScheduler;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class JobSession extends IJobCallback.Stub implements ServiceConnection {
        private IJobCallback clientCallback;
        private IJobService clientJobService;
        private boolean isWorking;
        private int jobId;
        private JobParameters jobParams;
        private JobWorkItem lastWorkItem;
        private String packageName;

        JobSession(int i5, IJobCallback iJobCallback, JobParameters jobParameters, String str) {
            this.jobId = i5;
            this.clientCallback = iJobCallback;
            this.jobParams = jobParameters;
            this.packageName = str;
        }

        @Override // android.app.job.IJobCallback
        public void acknowledgeStartMessage(int i5, boolean z4) throws RemoteException {
            this.isWorking = true;
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:acknowledgeStartMessage:%d", Integer.valueOf(this.jobId));
            this.clientCallback.acknowledgeStartMessage(this.jobId, z4);
        }

        @Override // android.app.job.IJobCallback
        public void acknowledgeStopMessage(int i5, boolean z4) throws RemoteException {
            this.isWorking = false;
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:acknowledgeStopMessage:%d", Integer.valueOf(this.jobId));
            this.clientCallback.acknowledgeStopMessage(this.jobId, z4);
        }

        @Override // android.app.job.IJobCallback
        public boolean completeWork(int i5, int i6) throws RemoteException {
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:completeWork:%d", Integer.valueOf(this.jobId));
            return this.clientCallback.completeWork(this.jobId, i6);
        }

        @Override // android.app.job.IJobCallback
        public JobWorkItem dequeueWork(int i5) throws RemoteException {
            JobWorkItem dequeueWork;
            try {
                this.lastWorkItem = null;
                VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:dequeueWork:%d", Integer.valueOf(this.jobId));
                dequeueWork = this.clientCallback.dequeueWork(this.jobId);
            } catch (Exception e5) {
                e5.printStackTrace();
                VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:dequeueWork:" + e5, new Object[0]);
            }
            if (dequeueWork != null) {
                JobWorkItem parse = JobWorkItemCompat.parse(dequeueWork);
                this.lastWorkItem = parse;
                return parse;
            }
            this.isWorking = false;
            stopSessionLocked();
            return null;
        }

        void forceFinishJob() {
            try {
                try {
                    this.clientCallback.jobFinished(this.jobId, false);
                    synchronized (ShadowJobWorkService.this.mJobSessions) {
                        stopSessionLocked();
                    }
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                    synchronized (ShadowJobWorkService.this.mJobSessions) {
                        stopSessionLocked();
                    }
                }
            } catch (Throwable th) {
                synchronized (ShadowJobWorkService.this.mJobSessions) {
                    stopSessionLocked();
                    throw th;
                }
            }
        }

        @Override // android.app.job.IJobCallback
        public void jobFinished(int i5, boolean z4) throws RemoteException {
            this.isWorking = false;
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:jobFinished:%d", Integer.valueOf(this.jobId));
            this.clientCallback.jobFinished(this.jobId, z4);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:onServiceConnected:%s", componentName);
            this.clientJobService = IJobService.Stub.asInterface(iBinder);
            startJob(false);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public void startJob(boolean z4) {
            if (this.isWorking) {
                VLog.w(ShadowJobWorkService.TAG, "ShadowJobService:startJob:%d,but is working", Integer.valueOf(this.jobId));
                return;
            }
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:startJob:%d", Integer.valueOf(this.jobId));
            IJobService iJobService = this.clientJobService;
            if (iJobService == null) {
                if (!z4) {
                    ShadowJobWorkService.this.emptyCallback(this.clientCallback, this.jobId);
                    synchronized (ShadowJobWorkService.this.mJobSessions) {
                        stopSessionLocked();
                    }
                    return;
                }
                return;
            }
            try {
                iJobService.startJob(this.jobParams);
            } catch (RemoteException e5) {
                forceFinishJob();
                Log.e(ShadowJobWorkService.TAG, "ShadowJobService:startJob", e5);
            }
        }

        void stopSessionLocked() {
            VLog.i(ShadowJobWorkService.TAG, "ShadowJobService:stopSession:%d", Integer.valueOf(this.jobId));
            try {
                IJobService iJobService = this.clientJobService;
                if (iJobService != null) {
                    try {
                        iJobService.stopJob(this.jobParams);
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                }
            } finally {
                try {
                    ShadowJobWorkService.this.mJobSessions.remove(this.jobId);
                    ShadowJobWorkService.this.unbindService(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emptyCallback(IJobCallback iJobCallback, int i5) {
        try {
            iJobCallback.acknowledgeStartMessage(i5, false);
            iJobCallback.jobFinished(i5, false);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public static void startJob(Context context, JobParameters jobParameters) {
        Intent intent = new Intent(context, (Class<?>) ShadowJobWorkService.class);
        intent.setAction("action.startJob");
        intent.putExtra("jobParams", jobParameters);
        context.startService(intent);
    }

    public static void stopJob(Context context, JobParameters jobParameters) {
        Intent intent = new Intent(context, (Class<?>) ShadowJobWorkService.class);
        intent.setAction("action.stopJob");
        intent.putExtra("jobParams", jobParameters);
        context.startService(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        InvocationStubManager.getInstance().checkEnv(ActivityManagerStub.class);
        this.mScheduler = (JobScheduler) getSystemService("jobscheduler");
    }

    @Override // android.app.Service
    public void onDestroy() {
        VLog.i(TAG, "ShadowJobService:onDestroy", new Object[0]);
        synchronized (this.mJobSessions) {
            for (int size = this.mJobSessions.size() - 1; size >= 0; size--) {
                this.mJobSessions.valueAt(size).stopSessionLocked();
            }
            this.mJobSessions.clear();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        if (intent != null) {
            String action = intent.getAction();
            if ("action.startJob".equals(action)) {
                startJob((JobParameters) intent.getParcelableExtra("jobParams"));
                return 2;
            }
            if ("action.stopJob".equals(action)) {
                stopJob((JobParameters) intent.getParcelableExtra("jobParams"));
                return 2;
            }
            return 2;
        }
        return 2;
    }

    public void startJob(JobParameters jobParameters) {
        JobSession jobSession;
        boolean z4;
        int jobId = jobParameters.getJobId();
        IJobCallback asInterface = IJobCallback.Stub.asInterface(mirror.android.app.job.JobParameters.callback.get(jobParameters));
        Map.Entry<VJobSchedulerService.JobId, VJobSchedulerService.JobConfig> findJobByVirtualJobId = VJobSchedulerService.get().findJobByVirtualJobId(jobId);
        if (findJobByVirtualJobId == null) {
            emptyCallback(asInterface, jobId);
            this.mScheduler.cancel(jobId);
            return;
        }
        VJobSchedulerService.JobId key = findJobByVirtualJobId.getKey();
        VJobSchedulerService.JobConfig value = findJobByVirtualJobId.getValue();
        synchronized (this.mJobSessions) {
            jobSession = this.mJobSessions.get(jobId);
        }
        if (jobSession != null) {
            jobSession.startJob(true);
            return;
        }
        synchronized (this.mJobSessions) {
            mirror.android.app.job.JobParameters.jobId.set(jobParameters, key.clientJobId);
            JobSession jobSession2 = new JobSession(jobId, asInterface, jobParameters, key.packageName);
            mirror.android.app.job.JobParameters.callback.set(jobParameters, jobSession2.asBinder());
            this.mJobSessions.put(jobId, jobSession2);
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(key.packageName, value.serviceName));
            z4 = false;
            try {
                VLog.i(TAG, "ShadowJobService:binService:%s, jobId=%s", intent.getComponent(), Integer.valueOf(jobId));
                z4 = VActivityManager.get().bindService(this, intent, jobSession2, 5, VUserHandle.getUserId(key.vuid));
            } catch (Throwable th) {
                VLog.e(TAG, th);
            }
        }
        if (z4) {
            return;
        }
        synchronized (this.mJobSessions) {
            this.mJobSessions.remove(jobId);
        }
        emptyCallback(asInterface, jobId);
        this.mScheduler.cancel(jobId);
        VJobSchedulerService.get().cancel(-1, jobId);
    }

    public void stopJob(JobParameters jobParameters) {
        int jobId = jobParameters.getJobId();
        synchronized (this.mJobSessions) {
            JobSession jobSession = this.mJobSessions.get(jobId);
            if (jobSession != null) {
                VLog.i(TAG, "stopJob:%d", Integer.valueOf(jobId));
                jobSession.stopSessionLocked();
            }
        }
    }
}
