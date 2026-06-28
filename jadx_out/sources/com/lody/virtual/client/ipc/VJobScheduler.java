package com.lody.virtual.client.ipc;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.os.RemoteException;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.remote.VJobWorkItem;
import com.lody.virtual.server.interfaces.IJobService;
import java.util.List;

/* loaded from: classes3.dex */
public class VJobScheduler {
    private static final VJobScheduler sInstance = new VJobScheduler();
    private IJobService mService;

    public static VJobScheduler get() {
        return sInstance;
    }

    private Object getRemoteInterface() {
        return IJobService.Stub.asInterface(ServiceManagerNative.getService(ServiceManagerNative.JOB));
    }

    public void cancel(int i5) {
        try {
            getService().cancel(VClient.get().getVUid(), i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public void cancelAll() {
        try {
            getService().cancelAll(VClient.get().getVUid());
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @TargetApi(26)
    public int enqueue(JobInfo jobInfo, JobWorkItem jobWorkItem) {
        if (jobWorkItem == null || !BuildCompat.isOreo()) {
            return -1;
        }
        try {
            return getService().enqueue(VClient.get().getVUid(), jobInfo, new VJobWorkItem(jobWorkItem));
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public List<JobInfo> getAllPendingJobs() {
        try {
            return getService().getAllPendingJobs(VClient.get().getVUid());
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public JobInfo getPendingJob(int i5) {
        try {
            return getService().getPendingJob(VClient.get().getVUid(), i5);
        } catch (RemoteException e5) {
            return (JobInfo) VirtualRuntime.crash(e5);
        }
    }

    public IJobService getService() {
        IJobService iJobService = this.mService;
        if (iJobService == null || !IInterfaceUtils.isAlive(iJobService)) {
            synchronized (this) {
                this.mService = (IJobService) LocalProxyUtils.genProxy(IJobService.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public int schedule(JobInfo jobInfo) {
        try {
            return getService().schedule(VClient.get().getVUid(), jobInfo);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }
}
