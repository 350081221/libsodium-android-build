package com.bytedance.sdk.openadsdk.k.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5007a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final TTNativeAd.EasyPlayWidgetListener f5008b;

    public b(TTNativeAd.EasyPlayWidgetListener easyPlayWidgetListener) {
        this.f5008b = easyPlayWidgetListener;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTNativeAd.EasyPlayWidgetListener easyPlayWidgetListener = this.f5008b;
        if (easyPlayWidgetListener == null) {
            return null;
        }
        switch (i5) {
            case 144101:
                this.f5008b.onInfo((JSONObject) valueSet.objectValue(0, JSONObject.class));
                break;
            case 144102:
                return (T) easyPlayWidgetListener.getEstimatedInteractionArea();
            case 144103:
                this.f5008b.onCanRenderSuccess((JSONObject) valueSet.objectValue(0, JSONObject.class));
                break;
            case 144104:
                this.f5008b.onCanRenderFail((JSONObject) valueSet.objectValue(0, JSONObject.class));
                break;
            case 144105:
                easyPlayWidgetListener.onClose();
                break;
        }
        a(i5, valueSet, cls);
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5007a;
    }
}
