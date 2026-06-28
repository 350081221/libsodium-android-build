package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdDislike;

/* loaded from: classes2.dex */
public class h implements TTAdDislike {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4898a;

    public h(Bridge bridge) {
        this.f4898a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public boolean isShow() {
        return ((Boolean) this.f4898a.call(240105, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void resetDislikeStatus() {
        this.f4898a.call(240104, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new com.bytedance.sdk.openadsdk.f.a.a.a.a(dislikeInteractionCallback));
        this.f4898a.call(240102, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void setDislikeSource(String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.h(0, str);
        this.f4898a.call(240103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void showDislikeDialog() {
        this.f4898a.call(240101, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }
}
