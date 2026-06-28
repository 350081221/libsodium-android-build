package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.LocationProvider;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.init.IMediationPrivacyConfig;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends TTCustomController implements Bridge {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4899a;

    /* renamed from: b, reason: collision with root package name */
    private TTCustomController f4900b;

    public i(Bridge bridge) {
        this.f4899a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    protected void a(int i5, ValueSet valueSet, Class cls) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean alist() {
        return ((Boolean) this.f4899a.call(262103, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
        TTCustomController tTCustomController = this.f4900b;
        if (tTCustomController == null) {
            return null;
        }
        if (i5 != 262119) {
            switch (i5) {
                case 262101:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.isCanUseLocation()));
                case 262102:
                    return (T) tTCustomController.getTTLocation();
                case 262103:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.alist()));
                case 262104:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.isCanUsePhoneState()));
                case 262105:
                    return (T) tTCustomController.getDevImei();
                case 262106:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.isCanUseWifiState()));
                case 262107:
                    return (T) tTCustomController.getMacAddress();
                case 262108:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.isCanUseWriteExternal()));
                case 262109:
                    return (T) tTCustomController.getDevOaid();
                case 262110:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.isCanUseAndroidId()));
                case 262111:
                    return (T) Boolean.class.cast(Boolean.valueOf(tTCustomController.isCanUsePermissionRecordAudio()));
                case 262112:
                    return (T) tTCustomController.getAndroidId();
                default:
                    a(i5, valueSet, cls);
                    return null;
            }
        }
        return (T) tTCustomController.userPrivacyConfig();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public String getAndroidId() {
        return (String) this.f4899a.call(262112, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public String getDevImei() {
        return (String) this.f4899a.call(262105, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public String getDevOaid() {
        return (String) this.f4899a.call(262109, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public String getMacAddress() {
        return (String) this.f4899a.call(262107, com.bykv.a.a.a.a.b.b(0).k(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public IMediationPrivacyConfig getMediationPrivacyConfig() {
        return (IMediationPrivacyConfig) this.f4899a.values().objectValue(262113, IMediationPrivacyConfig.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public LocationProvider getTTLocation() {
        return (LocationProvider) this.f4899a.call(262102, com.bykv.a.a.a.a.b.b(0).k(), LocationProvider.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean isCanUseAndroidId() {
        return ((Boolean) this.f4899a.call(262110, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean isCanUseLocation() {
        return ((Boolean) this.f4899a.call(262101, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean isCanUsePermissionRecordAudio() {
        return ((Boolean) this.f4899a.call(262111, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean isCanUsePhoneState() {
        return ((Boolean) this.f4899a.call(262104, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean isCanUseWifiState() {
        return ((Boolean) this.f4899a.call(262106, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public boolean isCanUseWriteExternal() {
        return ((Boolean) this.f4899a.call(262108, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTCustomController
    public Map<String, Object> userPrivacyConfig() {
        return (Map) this.f4899a.call(262119, com.bykv.a.a.a.a.b.b(0).k(), Map.class);
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bykv.a.a.a.a.b.f3106c;
    }

    public i(TTCustomController tTCustomController) {
        this.f4900b = tTCustomController;
        this.f4899a = com.bykv.a.a.a.a.b.f3107d;
    }
}
