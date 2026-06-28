package com.bytedance.sdk.openadsdk.l.a.a.a;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5013a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTNativeExpressAd.ExpressAdInteractionListener f5014b;

    public b(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f5014b = expressAdInteractionListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        if (this.f5014b == null) {
            return null;
        }
        switch (i5) {
            case 151101:
                this.f5014b.onAdClicked((View) valueSet.objectValue(0, View.class), valueSet.intValue(1));
                break;
            case 151102:
                this.f5014b.onAdShow((View) valueSet.objectValue(0, View.class), valueSet.intValue(1));
                break;
            case 151103:
                this.f5014b.onRenderFail((View) valueSet.objectValue(0, View.class), (String) valueSet.objectValue(1, String.class), valueSet.intValue(2));
                break;
            case 151104:
                this.f5014b.onRenderSuccess((View) valueSet.objectValue(0, View.class), valueSet.floatValue(1), valueSet.floatValue(2));
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5013a;
    }
}
