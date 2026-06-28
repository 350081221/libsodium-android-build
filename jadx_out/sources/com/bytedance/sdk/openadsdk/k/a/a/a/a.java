package com.bytedance.sdk.openadsdk.k.a.a.a;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.c.a.a.n;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5005a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTNativeAd.AdInteractionListener f5006b;

    public a(TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f5006b = adInteractionListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5006b == null) {
            return null;
        }
        switch (i5) {
            case 141101:
                this.f5006b.onAdClicked((View) valueSet.objectValue(0, View.class), new n((Bridge) valueSet.objectValue(1, Bridge.class)));
                break;
            case 141102:
                this.f5006b.onAdCreativeClick((View) valueSet.objectValue(0, View.class), new n((Bridge) valueSet.objectValue(1, Bridge.class)));
                break;
            case 141103:
                this.f5006b.onAdShow(new n((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5005a;
    }
}
