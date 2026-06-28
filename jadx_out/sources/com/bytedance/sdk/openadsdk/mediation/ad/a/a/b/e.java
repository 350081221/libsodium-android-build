package com.bytedance.sdk.openadsdk.mediation.ad.a.a.b;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder;

/* loaded from: classes2.dex */
public class e implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private ValueSet f5160a = com.bykv.a.a.a.a.b.f3106c;

    /* renamed from: b, reason: collision with root package name */
    private final IMediationViewBinder f5161b;

    public e(IMediationViewBinder iMediationViewBinder) {
        this.f5161b = iMediationViewBinder;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        IMediationViewBinder iMediationViewBinder = this.f5161b;
        if (iMediationViewBinder == null) {
            return null;
        }
        switch (i5) {
            case 271021:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getLayoutId()));
            case 271022:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getTitleId()));
            case 271023:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getDecriptionTextId()));
            case 271024:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getCallToActionId()));
            case 271025:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getIconImageId()));
            case 271026:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getMainImageId()));
            case 271027:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getMediaViewId()));
            case 271028:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getSourceId()));
            case 271029:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getGroupImage1Id()));
            case 271030:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getGroupImage2Id()));
            case 271031:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getGroupImage3Id()));
            case 271032:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getLogoLayoutId()));
            case 271033:
                return (T) Integer.class.cast(Integer.valueOf(iMediationViewBinder.getShakeViewContainerId()));
            case 271034:
                return (T) iMediationViewBinder.getExtras();
            default:
                a(i5, valueSet, cls);
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.f5160a;
    }
}
