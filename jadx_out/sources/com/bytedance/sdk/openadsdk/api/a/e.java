package com.bytedance.sdk.openadsdk.api.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.DownloadShortInfo;

/* loaded from: classes2.dex */
public class e extends com.bytedance.sdk.openadsdk.api.b implements DownloadStatusChangeListener {
    public e(EventListener eventListener) {
        this.f4829a = eventListener;
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadActive(DownloadShortInfo downloadShortInfo, int i5) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_SHORT, new d(downloadShortInfo)).e(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_PERCENT, i5).k()).f();
        }
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE, f5);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadFailed(DownloadShortInfo downloadShortInfo) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_SHORT, new d(downloadShortInfo)).k()).f();
        }
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_FAILED, f5);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadFinished(DownloadShortInfo downloadShortInfo) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_SHORT, new d(downloadShortInfo)).k()).f();
        }
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ON_FINISHED, f5);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadPaused(DownloadShortInfo downloadShortInfo, int i5) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_SHORT, new d(downloadShortInfo)).e(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_PERCENT, i5).k()).f();
        }
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_PAUSED, f5);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadStart(@NonNull DownloadModel downloadModel, @Nullable DownloadController downloadController) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_MODEL, new c(downloadModel)).g(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER, new a(downloadController)).k()).f();
        }
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_START, f5);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onIdle() {
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_IDLE);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onInstalled(DownloadShortInfo downloadShortInfo) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ACTIVE_SHORT, new d(downloadShortInfo)).k()).f();
        }
        a(ValueSetConstants.VALUE_DOWNLOAD_STATUS_CHANGE_ON_DOWNLOAD_ON_INSTALLED, f5);
    }
}
