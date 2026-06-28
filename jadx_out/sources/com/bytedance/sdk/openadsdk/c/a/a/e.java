package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.DownloadStatusController;

/* loaded from: classes2.dex */
public class e implements DownloadStatusController {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4894a;

    public e(Bridge bridge) {
        this.f4894a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.DownloadStatusController
    public void cancelDownload() {
        this.f4894a.call(222102, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.DownloadStatusController
    public void changeDownloadStatus() {
        this.f4894a.call(222101, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }
}
