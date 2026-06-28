package com.bytedance.sdk.openadsdk.mediation.manager.a.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdLoadInfo;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements MediationSplashManager {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f5312a;

    public f(Bridge bridge) {
        this.f5312a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager
    public void destroy() {
        this.f5312a.call(270007, com.bykv.a.a.a.a.b.b(0).k(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public List<MediationAdLoadInfo> getAdLoadInfo() {
        List list = (List) this.f5312a.call(270002, com.bykv.a.a.a.a.b.b(0).k(), List.class);
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
        return new a((Bridge) this.f5312a.call(270004, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public List<MediationAdEcpmInfo> getCacheList() {
        List list = (List) this.f5312a.call(270005, com.bykv.a.a.a.a.b.b(0).k(), List.class);
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
        List list = (List) this.f5312a.call(270003, com.bykv.a.a.a.a.b.b(0).k(), List.class);
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
        return new a((Bridge) this.f5312a.call(270006, com.bykv.a.a.a.a.b.b(0).k(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.manager.MediationBaseManager
    public boolean isReady() {
        return ((Boolean) this.f5312a.call(270001, com.bykv.a.a.a.a.b.b(0).k(), Boolean.TYPE)).booleanValue();
    }
}
