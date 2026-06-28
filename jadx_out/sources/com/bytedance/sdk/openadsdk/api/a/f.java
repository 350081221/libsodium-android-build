package com.bytedance.sdk.openadsdk.api.a;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.config.IDownloadButtonClickListener;

/* loaded from: classes2.dex */
public class f extends com.bytedance.sdk.openadsdk.api.b implements IDownloadButtonClickListener {
    public f(EventListener eventListener) {
        this.f4829a = eventListener;
    }

    @Override // com.ss.android.download.api.config.IDownloadButtonClickListener
    public void handleComplianceDialog(boolean z4) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().i(ValueSetConstants.VALUE_HANDLE_COMPLIANCE_DIALOG_SHOULD_SHOW, z4).k()).f();
        }
        a(ValueSetConstants.VALUE_HANDLE_COMPLIANCE_DIALOG, f5);
    }

    @Override // com.ss.android.download.api.config.IDownloadButtonClickListener
    public void handleMarketFailedComplianceDialog() {
        a(ValueSetConstants.VALUE_HANDLE_MARKET_FAILED_COMPLIANCE_DIALOG);
    }
}
