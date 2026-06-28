package com.lody.virtual.client.stub;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.IJobService;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import com.lody.virtual.helper.utils.VLog;

@TargetApi(21)
/* loaded from: classes3.dex */
public class ShadowJobService extends Service {
    private final IJobService mService = new IJobService.Stub() { // from class: com.lody.virtual.client.stub.ShadowJobService.1
        void getTransferredDownloadBytes(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        }

        void getTransferredUploadBytes(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        }

        void onNetworkChanged(JobParameters jobParameters) {
        }

        @Override // android.app.job.IJobService
        public void startJob(JobParameters jobParameters) {
            ShadowJobWorkService.startJob(ShadowJobService.this, jobParameters);
        }

        @Override // android.app.job.IJobService
        public void stopJob(JobParameters jobParameters) {
            ShadowJobWorkService.stopJob(ShadowJobService.this, jobParameters);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        VLog.e("ShadowJobService", "-> onBind: " + intent);
        return this.mService.asBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        VLog.e("ShadowJobService", "-> onCreate");
    }
}
