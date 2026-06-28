package com.bytedance.sdk.openadsdk.mediation.a.a.a;

import android.app.Activity;
import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.c.a.a.i;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationManager;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.MediationAppDialogClickListener;
import com.bytedance.sdk.openadsdk.mediation.a.a.b.e;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements IMediationManager {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5064a;

    public b(Bridge bridge) {
        this.f5064a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public Map<String, Object> getMediationExtraInfo() {
        return (Map) this.f5064a.call(270024, com.bykv.a.a.a.a.b.b(0).k(), Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadDrawToken(Context context, AdSlot adSlot, IMediationDrawAdTokenCallback iMediationDrawAdTokenCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, context);
        b5.g(1, adSlot);
        b5.g(2, new com.bytedance.sdk.openadsdk.mediation.a.a.b.a(iMediationDrawAdTokenCallback));
        this.f5064a.call(270022, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadNativeToken(Context context, AdSlot adSlot, IMediationNativeAdTokenCallback iMediationNativeAdTokenCallback) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
        b5.g(0, context);
        b5.g(1, adSlot);
        b5.g(2, new com.bytedance.sdk.openadsdk.mediation.a.a.b.c(iMediationNativeAdTokenCallback));
        this.f5064a.call(270021, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public Object mtool(int i5, ValueSet valueSet) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.e(0, i5);
        b5.g(1, valueSet);
        return this.f5064a.call(271043, b5.k(), Object.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void preload(Activity activity, List<IMediationPreloadRequestInfo> list, int i5, int i6) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(4);
        b5.g(0, activity);
        b5.g(1, list);
        b5.e(2, i5);
        b5.e(3, i6);
        this.f5064a.call(270013, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void requestPermissionIfNecessary(Context context) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, context);
        this.f5064a.call(270017, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setPulisherDid(String str) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.h(0, str);
        this.f5064a.call(270015, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setThemeStatus(int i5) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.e(0, i5);
        this.f5064a.call(270019, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setUserInfoForSegment(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, mediationConfigUserInfoForSegment);
        this.f5064a.call(270014, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public int showOpenOrInstallAppDialog(MediationAppDialogClickListener mediationAppDialogClickListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new e(mediationAppDialogClickListener));
        return ((Integer) this.f5064a.call(270020, b5.k(), Integer.TYPE)).intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void updateLocalExtra(Map<String, Object> map) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, map);
        this.f5064a.call(271050, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void updatePrivacyConfig(TTCustomController tTCustomController) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new i(tTCustomController));
        this.f5064a.call(270016, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void requestPermissionIfNecessary(Context context, int[] iArr) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.g(0, context);
        b5.g(1, iArr);
        this.f5064a.call(270018, b5.k(), Void.class);
    }
}
