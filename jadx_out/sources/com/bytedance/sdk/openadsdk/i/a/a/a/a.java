package com.bytedance.sdk.openadsdk.i.a.a.a;

import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTFeedAd;

/* loaded from: classes2.dex */
public class a implements TTFeedAd.CustomizeVideo {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4998a;

    public a(Bridge bridge) {
        this.f4998a = bridge == null ? b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public String getVideoUrl() {
        return (String) this.f4998a.call(162101, b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoAutoStart() {
        this.f4998a.call(162107, b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoBreak(long j5) {
        b b5 = b.b(1);
        b5.f(0, j5);
        this.f4998a.call(162106, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoContinue(long j5) {
        b b5 = b.b(1);
        b5.f(0, j5);
        this.f4998a.call(162104, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoError(long j5, int i5, int i6) {
        b b5 = b.b(3);
        b5.f(0, j5);
        b5.e(1, i5);
        b5.e(2, i6);
        this.f4998a.call(162109, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoFinish() {
        this.f4998a.call(162105, b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoPause(long j5) {
        b b5 = b.b(1);
        b5.f(0, j5);
        this.f4998a.call(162103, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoStart() {
        this.f4998a.call(162102, b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoStartError(int i5, int i6) {
        b b5 = b.b(2);
        b5.e(0, i5);
        b5.e(1, i6);
        this.f4998a.call(162108, b5.k(), Void.class);
    }
}
