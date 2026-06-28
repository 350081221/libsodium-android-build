package com.bytedance.sdk.openadsdk.j.a.a.a;

import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5003a = b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f5004b;

    public a(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f5004b = fullScreenVideoAdInteractionListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f5004b;
        if (fullScreenVideoAdInteractionListener == null) {
            return null;
        }
        switch (i5) {
            case 131101:
                fullScreenVideoAdInteractionListener.onAdShow();
                break;
            case 131102:
                fullScreenVideoAdInteractionListener.onAdVideoBarClick();
                break;
            case 131103:
                fullScreenVideoAdInteractionListener.onAdClose();
                break;
            case 131104:
                fullScreenVideoAdInteractionListener.onVideoComplete();
                break;
            case 131105:
                fullScreenVideoAdInteractionListener.onSkippedVideo();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5003a;
    }
}
