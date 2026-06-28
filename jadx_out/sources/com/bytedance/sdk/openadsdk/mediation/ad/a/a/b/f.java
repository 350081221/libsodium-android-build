package com.bytedance.sdk.openadsdk.mediation.ad.a.a.b;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;

/* loaded from: classes2.dex */
public class f implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5162a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final MediationExpressRenderListener f5163b;

    public f(MediationExpressRenderListener mediationExpressRenderListener) {
        this.f5163b = mediationExpressRenderListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        MediationExpressRenderListener mediationExpressRenderListener = this.f5163b;
        if (mediationExpressRenderListener == null) {
            return null;
        }
        switch (i5) {
            case 142101:
                this.f5163b.onRenderSuccess((View) valueSet.objectValue(0, View.class), valueSet.floatValue(1), valueSet.floatValue(2), valueSet.booleanValue(3));
                break;
            case 142102:
                this.f5163b.onRenderFail((View) valueSet.objectValue(0, View.class), (String) valueSet.objectValue(1, String.class), valueSet.intValue(2));
                break;
            case 142103:
                mediationExpressRenderListener.onAdClick();
                break;
            case 142104:
                mediationExpressRenderListener.onAdShow();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5162a;
    }
}
