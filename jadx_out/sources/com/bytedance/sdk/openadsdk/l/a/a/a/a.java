package com.bytedance.sdk.openadsdk.l.a.a.a;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;

/* loaded from: classes2.dex */
public class a implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5011a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTNativeExpressAd.AdInteractionListener f5012b;

    public a(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        this.f5012b = adInteractionListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTNativeExpressAd.AdInteractionListener adInteractionListener = this.f5012b;
        if (adInteractionListener == null) {
            return null;
        }
        switch (i5) {
            case 151101:
                this.f5012b.onAdClicked((View) valueSet.objectValue(0, View.class), valueSet.intValue(1));
                break;
            case 151102:
                this.f5012b.onAdShow((View) valueSet.objectValue(0, View.class), valueSet.intValue(1));
                break;
            case 151103:
                this.f5012b.onRenderFail((View) valueSet.objectValue(0, View.class), (String) valueSet.objectValue(1, String.class), valueSet.intValue(2));
                break;
            case 151104:
                this.f5012b.onRenderSuccess((View) valueSet.objectValue(0, View.class), valueSet.floatValue(1), valueSet.floatValue(2));
                break;
            case 151105:
                adInteractionListener.onAdDismiss();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5011a;
    }
}
