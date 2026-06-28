package com.bytedance.sdk.openadsdk.h.a.a.a;

import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTDrawFeedAd;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f4996a = b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTDrawFeedAd.DrawVideoListener f4997b;

    public a(TTDrawFeedAd.DrawVideoListener drawVideoListener) {
        this.f4997b = drawVideoListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTDrawFeedAd.DrawVideoListener drawVideoListener = this.f4997b;
        if (drawVideoListener == null) {
            return null;
        }
        switch (i5) {
            case 171101:
                drawVideoListener.onClick();
                break;
            case 171102:
                drawVideoListener.onClickRetry();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f4996a;
    }
}
