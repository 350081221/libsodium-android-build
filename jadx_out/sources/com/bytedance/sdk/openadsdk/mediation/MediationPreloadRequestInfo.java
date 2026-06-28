package com.bytedance.sdk.openadsdk.mediation;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.List;

/* loaded from: classes2.dex */
public class MediationPreloadRequestInfo implements IMediationPreloadRequestInfo {

    /* renamed from: a, reason: collision with root package name */
    private int f5055a;

    /* renamed from: b, reason: collision with root package name */
    private AdSlot f5056b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f5057c;

    public MediationPreloadRequestInfo(int i5, AdSlot adSlot, List<String> list) {
        this.f5055a = i5;
        this.f5056b = adSlot;
        this.f5057c = list;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo
    public AdSlot getAdSlot() {
        return this.f5056b;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo
    public int getAdType() {
        return this.f5055a;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo
    public List<String> getPrimeRitList() {
        return this.f5057c;
    }
}
