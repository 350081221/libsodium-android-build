package com.bytedance.sdk.openadsdk.api.a;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
import com.bytedance.sdk.openadsdk.downloadnew.core.ValueSetConstants;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;

/* loaded from: classes2.dex */
public class g extends com.bytedance.sdk.openadsdk.api.b implements OnItemClickListener {
    public g(EventListener eventListener) {
        this.f4829a = eventListener;
    }

    @Override // com.ss.android.download.api.config.OnItemClickListener
    public void onItemClick(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        Result f5;
        if (a()) {
            f5 = null;
        } else {
            f5 = com.bykv.a.a.a.a.a.a().c(com.bykv.a.a.a.a.b.a().g(ValueSetConstants.VALUE_DOWNLOAD_MODEL, new c(downloadModel)).g(ValueSetConstants.VALUE_DOWNLOAD_EVENT_CONFIG, new b(downloadEventConfig)).g(ValueSetConstants.VALUE_DOWNLOAD_CONTROLLER, new a(downloadController)).k()).f();
        }
        a(ValueSetConstants.VALUE_ON_ITEM_CLICK, f5);
    }
}
