package com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;

/* loaded from: classes2.dex */
public class MediationCustomizeVideoImpl implements Bridge, IMediationCustomizeVideo {

    /* renamed from: a, reason: collision with root package name */
    private TTFeedAd.CustomizeVideo f5216a;

    public MediationCustomizeVideoImpl(TTFeedAd.CustomizeVideo customizeVideo) {
        this.f5216a = customizeVideo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (i5 == 8165) {
            reportVideoStart();
            return null;
        }
        if (i5 == 8168) {
            reportVideoFinish();
            return null;
        }
        if (i5 == 8166) {
            reportVideoPause(valueSet.longValue(8074));
            return null;
        }
        if (i5 == 8167) {
            reportVideoContinue(valueSet.longValue(8074));
            return null;
        }
        if (i5 == 8169) {
            reportVideoBreak(valueSet.longValue(8074));
            return null;
        }
        if (i5 == 8170) {
            reportVideoAutoStart();
            return null;
        }
        if (i5 == 8171) {
            reportVideoStartError(valueSet.intValue(8014), valueSet.intValue(8075));
            return null;
        }
        if (i5 == 8172) {
            reportVideoError(valueSet.longValue(8074), valueSet.intValue(8014), valueSet.intValue(8075));
            return null;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public String getVideoUrl() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoAutoStart() {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoAutoStart();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoBreak(long j5) {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoBreak(j5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoContinue(long j5) {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoContinue(j5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoError(long j5, int i5, int i6) {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoError(j5, i5, i6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoFinish() {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoFinish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoPause(long j5) {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoPause(j5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoStart() {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoStart();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoStartError(int i5, int i6) {
        TTFeedAd.CustomizeVideo customizeVideo = this.f5216a;
        if (customizeVideo != null) {
            customizeVideo.reportVideoStartError(i5, i6);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
