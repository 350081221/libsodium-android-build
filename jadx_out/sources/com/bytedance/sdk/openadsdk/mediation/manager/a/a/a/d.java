package com.bytedance.sdk.openadsdk.mediation.manager.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationShakeViewListener;
import com.bytedance.sdk.openadsdk.mediation.ad.a.a.b.g;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdLoadInfo;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class d implements MediationNativeManager {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5310a;

    public d(Bridge bridge) {
        this.f5310a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public List<MediationAdLoadInfo> getAdLoadInfo() {
        List list = (List) this.f5310a.call(270002, com.bykv.a.a.a.a.b.b(0).k(), List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b((Bridge) it.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public MediationAdEcpmInfo getBestEcpm() {
        return new a((Bridge) this.f5310a.call(270004, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public List<MediationAdEcpmInfo> getCacheList() {
        List list = (List) this.f5310a.call(270005, com.bykv.a.a.a.a.b.b(0).k(), List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a((Bridge) it.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public List<MediationAdEcpmInfo> getMultiBiddingEcpm() {
        List list = (List) this.f5310a.call(270003, com.bykv.a.a.a.a.b.b(0).k(), List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a((Bridge) it.next()));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public MediationAdEcpmInfo getShowEcpm() {
        return new a((Bridge) this.f5310a.call(270006, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager
    public boolean hasDislike() {
        return this.f5310a.values().booleanValue(270008);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager
    public boolean isExpress() {
        return this.f5310a.values().booleanValue(270011);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public boolean isReady() {
        return ((Boolean) this.f5310a.call(270001, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager
    public void onPause() {
        this.f5310a.call(271049, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager
    public void onResume() {
        this.f5310a.call(271048, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager
    public void setShakeViewListener(MediationShakeViewListener mediationShakeViewListener) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.g(0, new g(mediationShakeViewListener));
        this.f5310a.call(270010, b5.k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager
    public void setUseCustomVideo(boolean z4) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(1);
        b5.i(0, z4);
        this.f5310a.call(270009, b5.k(), Void.class);
    }
}
