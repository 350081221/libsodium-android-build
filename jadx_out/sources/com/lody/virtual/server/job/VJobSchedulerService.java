package com.lody.virtual.server.job;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VJobScheduler;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.VJobWorkItem;
import com.lody.virtual.server.interfaces.IJobService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes3.dex */
public class VJobSchedulerService extends IJobService.Stub {
    private static final int JOB_FILE_VERSION = 1;
    private static final String TAG = VJobScheduler.class.getSimpleName();
    private static final Singleton<VJobSchedulerService> gDefault = new Singleton<VJobSchedulerService>() { // from class: com.lody.virtual.server.job.VJobSchedulerService.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VJobSchedulerService create() {
            return new VJobSchedulerService();
        }
    };
    private final ComponentName mJobProxyComponent;
    private final Map<JobId, JobConfig> mJobStore;
    private int mNextJobId;
    private final JobScheduler mScheduler;

    public static VJobSchedulerService get() {
        return gDefault.get();
    }

    private void readJobs() {
        int length;
        byte[] bArr;
        int read;
        File jobConfigFile = VEnvironment.getJobConfigFile();
        if (!jobConfigFile.exists()) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(jobConfigFile);
                length = (int) jobConfigFile.length();
                bArr = new byte[length];
                read = fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (read == length) {
                obtain.unmarshall(bArr, 0, length);
                obtain.setDataPosition(0);
                int readInt = obtain.readInt();
                if (readInt == 1) {
                    if (!this.mJobStore.isEmpty()) {
                        this.mJobStore.clear();
                    }
                    int readInt2 = obtain.readInt();
                    int i5 = 0;
                    for (int i6 = 0; i6 < readInt2; i6++) {
                        JobId jobId = new JobId(obtain);
                        JobConfig jobConfig = new JobConfig(obtain);
                        this.mJobStore.put(jobId, jobConfig);
                        i5 = Math.max(i5, jobConfig.virtualJobId);
                    }
                    this.mNextJobId = i5 + 1;
                    return;
                }
                throw new IOException("Bad version of job file: " + readInt);
            }
            throw new IOException("Unable to read job config.");
        } finally {
            obtain.recycle();
        }
    }

    private void saveJobs() {
        File jobConfigFile = VEnvironment.getJobConfigFile();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeInt(1);
                obtain.writeInt(this.mJobStore.size());
                for (Map.Entry<JobId, JobConfig> entry : this.mJobStore.entrySet()) {
                    entry.getKey().writeToParcel(obtain, 0);
                    entry.getValue().writeToParcel(obtain, 0);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(jobConfigFile);
                fileOutputStream.write(obtain.marshall());
                fileOutputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IJobService
    public void cancel(int i5, int i6) {
        boolean z4;
        synchronized (this.mJobStore) {
            Iterator<Map.Entry<JobId, JobConfig>> it = this.mJobStore.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<JobId, JobConfig> next = it.next();
                    JobId key = next.getKey();
                    JobConfig value = next.getValue();
                    if (i5 == -1 || key.vuid == i5) {
                        if (key.clientJobId == i6) {
                            this.mScheduler.cancel(value.virtualJobId);
                            it.remove();
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                saveJobs();
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IJobService
    public void cancelAll(int i5) {
        boolean z4;
        synchronized (this.mJobStore) {
            Iterator<Map.Entry<JobId, JobConfig>> it = this.mJobStore.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<JobId, JobConfig> next = it.next();
                    if (next.getKey().vuid == i5) {
                        this.mScheduler.cancel(next.getValue().virtualJobId);
                        it.remove();
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                saveJobs();
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.IJobService
    @TargetApi(26)
    public int enqueue(int i5, JobInfo jobInfo, VJobWorkItem vJobWorkItem) {
        JobConfig jobConfig;
        int enqueue;
        if (vJobWorkItem.get() == null) {
            return -1;
        }
        int id = jobInfo.getId();
        ComponentName service = jobInfo.getService();
        JobId jobId = new JobId(i5, service.getPackageName(), id);
        synchronized (this.mJobStore) {
            jobConfig = this.mJobStore.get(jobId);
            if (jobConfig == null) {
                int i6 = this.mNextJobId;
                this.mNextJobId = i6 + 1;
                JobConfig jobConfig2 = new JobConfig(i6, service.getClassName(), jobInfo.getExtras());
                this.mJobStore.put(jobId, jobConfig2);
                jobConfig = jobConfig2;
            }
        }
        jobConfig.serviceName = service.getClassName();
        jobConfig.extras = jobInfo.getExtras();
        saveJobs();
        mirror.android.app.job.JobInfo.jobId.set(jobInfo, jobConfig.virtualJobId);
        mirror.android.app.job.JobInfo.service.set(jobInfo, this.mJobProxyComponent);
        enqueue = this.mScheduler.enqueue(jobInfo, vJobWorkItem.get());
        return enqueue;
    }

    public Map.Entry<JobId, JobConfig> findJobByVirtualJobId(int i5) {
        synchronized (this.mJobStore) {
            for (Map.Entry<JobId, JobConfig> entry : this.mJobStore.entrySet()) {
                if (entry.getValue().virtualJobId == i5) {
                    return entry;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IJobService
    public List<JobInfo> getAllPendingJobs(int i5) {
        List<JobInfo> allPendingJobs = this.mScheduler.getAllPendingJobs();
        synchronized (this.mJobStore) {
            ListIterator<JobInfo> listIterator = allPendingJobs.listIterator();
            while (listIterator.hasNext()) {
                JobInfo next = listIterator.next();
                if (!StubManifest.STUB_JOB.equals(next.getService().getClassName())) {
                    listIterator.remove();
                } else {
                    Map.Entry<JobId, JobConfig> findJobByVirtualJobId = findJobByVirtualJobId(next.getId());
                    if (findJobByVirtualJobId == null) {
                        listIterator.remove();
                    } else {
                        JobId key = findJobByVirtualJobId.getKey();
                        JobConfig value = findJobByVirtualJobId.getValue();
                        if (key.vuid != i5) {
                            listIterator.remove();
                        } else {
                            mirror.android.app.job.JobInfo.jobId.set(next, key.clientJobId);
                            mirror.android.app.job.JobInfo.service.set(next, new ComponentName(key.packageName, value.serviceName));
                        }
                    }
                }
            }
        }
        return allPendingJobs;
    }

    @Override // com.lody.virtual.server.interfaces.IJobService
    @TargetApi(24)
    public JobInfo getPendingJob(int i5, int i6) {
        JobInfo jobInfo;
        int i7;
        synchronized (this.mJobStore) {
            Iterator<Map.Entry<JobId, JobConfig>> it = this.mJobStore.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    JobId key = it.next().getKey();
                    if (key.vuid == i5 && (i7 = key.clientJobId) == i6) {
                        jobInfo = this.mScheduler.getPendingJob(i7);
                        break;
                    }
                } else {
                    jobInfo = null;
                    break;
                }
            }
        }
        return jobInfo;
    }

    @Override // com.lody.virtual.server.interfaces.IJobService
    public int schedule(int i5, JobInfo jobInfo) {
        JobConfig jobConfig;
        int id = jobInfo.getId();
        ComponentName service = jobInfo.getService();
        JobId jobId = new JobId(i5, service.getPackageName(), id);
        synchronized (this.mJobStore) {
            jobConfig = this.mJobStore.get(jobId);
            if (jobConfig == null) {
                int i6 = this.mNextJobId;
                this.mNextJobId = i6 + 1;
                JobConfig jobConfig2 = new JobConfig(i6, service.getClassName(), jobInfo.getExtras());
                this.mJobStore.put(jobId, jobConfig2);
                jobConfig = jobConfig2;
            }
        }
        jobConfig.serviceName = service.getClassName();
        jobConfig.extras = jobInfo.getExtras();
        saveJobs();
        mirror.android.app.job.JobInfo.jobId.set(jobInfo, jobConfig.virtualJobId);
        mirror.android.app.job.JobInfo.service.set(jobInfo, this.mJobProxyComponent);
        try {
            Reflect.on(jobInfo).set("isPersisted", Boolean.FALSE);
        } catch (Throwable unused) {
        }
        return this.mScheduler.schedule(jobInfo);
    }

    private VJobSchedulerService() {
        this.mJobStore = new HashMap();
        this.mNextJobId = 1;
        this.mScheduler = (JobScheduler) VirtualCore.get().getContext().getSystemService("jobscheduler");
        this.mJobProxyComponent = new ComponentName(VirtualCore.get().getHostPkg(), StubManifest.STUB_JOB);
        readJobs();
    }

    /* loaded from: classes3.dex */
    public static final class JobConfig implements Parcelable {
        public static final Parcelable.Creator<JobConfig> CREATOR = new Parcelable.Creator<JobConfig>() { // from class: com.lody.virtual.server.job.VJobSchedulerService.JobConfig.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public JobConfig createFromParcel(Parcel parcel) {
                return new JobConfig(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public JobConfig[] newArray(int i5) {
                return new JobConfig[i5];
            }
        };
        public PersistableBundle extras;
        public String serviceName;
        public int virtualJobId;

        JobConfig(int i5, String str, PersistableBundle persistableBundle) {
            this.virtualJobId = i5;
            this.serviceName = str;
            this.extras = persistableBundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.virtualJobId);
            parcel.writeString(this.serviceName);
            parcel.writeParcelable(this.extras, i5);
        }

        JobConfig(Parcel parcel) {
            this.virtualJobId = parcel.readInt();
            this.serviceName = parcel.readString();
            this.extras = (PersistableBundle) parcel.readParcelable(PersistableBundle.class.getClassLoader());
        }
    }

    /* loaded from: classes3.dex */
    public static final class JobId implements Parcelable {
        public static final Parcelable.Creator<JobId> CREATOR = new Parcelable.Creator<JobId>() { // from class: com.lody.virtual.server.job.VJobSchedulerService.JobId.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public JobId createFromParcel(Parcel parcel) {
                return new JobId(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public JobId[] newArray(int i5) {
                return new JobId[i5];
            }
        };
        public int clientJobId;
        public String packageName;
        public int vuid;

        JobId(int i5, String str, int i6) {
            this.vuid = i5;
            this.packageName = str;
            this.clientJobId = i6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || JobId.class != obj.getClass()) {
                return false;
            }
            JobId jobId = (JobId) obj;
            if (this.vuid == jobId.vuid && this.clientJobId == jobId.clientJobId && TextUtils.equals(this.packageName, jobId.packageName)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i5;
            int i6 = this.vuid * 31;
            String str = this.packageName;
            if (str != null) {
                i5 = str.hashCode();
            } else {
                i5 = 0;
            }
            return ((i6 + i5) * 31) + this.clientJobId;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.vuid);
            parcel.writeString(this.packageName);
            parcel.writeInt(this.clientJobId);
        }

        JobId(Parcel parcel) {
            this.vuid = parcel.readInt();
            this.packageName = parcel.readString();
            this.clientJobId = parcel.readInt();
        }
    }
}
