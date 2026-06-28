package com.bytedance.sdk.openadsdk.mediation.a.a;

import android.app.Activity;
import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeAdTokenCallback;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdClassLoader;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends com.bytedance.sdk.openadsdk.mediation.a.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private Bridge f5081a;

    public g(Bridge bridge) {
        super(bridge);
        this.f5081a = bridge;
    }

    private ValueSet a(AdSlot adSlot) {
        com.bykv.a.a.a.a.b j5 = com.bykv.a.a.a.a.b.j(com.bytedance.sdk.openadsdk.c.a.c.b.b(adSlot));
        j5.g(8302, MediationAdClassLoader.getInstance());
        if (adSlot != null && adSlot.getMediationAdSlot() != null) {
            j5.g(8260028, new e(adSlot.getMediationAdSlot()));
        }
        return j5.k();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.a.a.a.b, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadDrawToken(Context context, AdSlot adSlot, IMediationDrawAdTokenCallback iMediationDrawAdTokenCallback) {
        if (this.f5081a != null) {
            com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
            b5.g(0, context);
            b5.g(1, a(adSlot));
            b5.g(2, new com.bytedance.sdk.openadsdk.mediation.a.a.b.a(iMediationDrawAdTokenCallback));
            b5.g(3, MediationAdClassLoader.getInstance());
            this.f5081a.call(270022, b5.k(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.a.a.a.b, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void loadNativeToken(Context context, AdSlot adSlot, IMediationNativeAdTokenCallback iMediationNativeAdTokenCallback) {
        if (this.f5081a != null) {
            com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(3);
            b5.g(0, context);
            b5.g(1, a(adSlot));
            b5.g(2, new com.bytedance.sdk.openadsdk.mediation.a.a.b.c(iMediationNativeAdTokenCallback));
            b5.g(3, MediationAdClassLoader.getInstance());
            this.f5081a.call(270021, b5.k(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.a.a.a.b, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void preload(Activity activity, List<IMediationPreloadRequestInfo> list, int i5, int i6) {
        if (this.f5081a != null) {
            com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(4);
            b5.g(0, activity);
            if (list != null) {
                LinkedList linkedList = new LinkedList();
                Iterator<IMediationPreloadRequestInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new h(it.next()));
                }
                b5.g(1, linkedList);
            }
            b5.e(2, i5);
            b5.e(3, i6);
            b5.g(4, MediationAdClassLoader.getInstance());
            this.f5081a.call(270013, b5.k(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.a.a.a.b, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void setUserInfoForSegment(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
        if (this.f5081a != null) {
            com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
            b5.g(0, com.bytedance.sdk.openadsdk.mediation.init.a.a.a.c.a(mediationConfigUserInfoForSegment));
            this.f5081a.call(270014, b5.k(), Void.class);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.a.a.a.b, com.bytedance.sdk.openadsdk.mediation.IMediationManager
    public void updatePrivacyConfig(TTCustomController tTCustomController) {
        if (this.f5081a != null) {
            com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
            b5.g(0, com.bytedance.sdk.openadsdk.c.a.c.d.a(tTCustomController));
            this.f5081a.call(270016, b5.k(), Void.class);
        }
    }
}
