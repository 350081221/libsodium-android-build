package com.bytedance.sdk.openadsdk.c.a.c;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.AdSlot;

/* loaded from: classes2.dex */
public class b {
    public static final ValueSet b(final AdSlot adSlot) {
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        if (adSlot == null) {
            return null;
        }
        a5.h(260001, adSlot.getAdId());
        a5.h(260002, adSlot.getCreativeId());
        a5.h(260003, adSlot.getExt());
        a5.h(260004, adSlot.getCodeId());
        a5.i(260005, adSlot.isAutoPlay());
        a5.e(260006, adSlot.getImgAcceptedWidth());
        a5.e(260007, adSlot.getImgAcceptedHeight());
        a5.d(260008, adSlot.getExpressViewAcceptedWidth());
        a5.d(260009, adSlot.getExpressViewAcceptedHeight());
        a5.i(260010, adSlot.isSupportDeepLink());
        a5.i(260011, adSlot.isSupportRenderConrol());
        a5.e(2600012, adSlot.getAdCount());
        a5.h(260013, adSlot.getMediaExtra());
        a5.h(260014, adSlot.getUserID());
        a5.e(260015, adSlot.getOrientation());
        a5.e(260016, adSlot.getNativeAdType());
        a5.g(260017, adSlot.getExternalABVid());
        a5.e(260018, adSlot.getAdloadSeq());
        a5.h(260019, adSlot.getPrimeRit());
        a5.e(260020, adSlot.getAdType());
        a5.h(260021, adSlot.getBidAdm());
        a5.h(260022, adSlot.getUserData());
        a5.g(260023, adSlot.getAdLoadType());
        a5.g(260024, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.b.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return AdSlot.this.getRewardName();
            }
        });
        a5.g(260025, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.b.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get() {
                return Integer.valueOf(AdSlot.this.getRewardAmount());
            }
        });
        a5.g(260026, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.b.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(AdSlot.this.isSupportIconStyle());
            }
        });
        a5.g(8260028, adSlot.getMediationAdSlot());
        return a5.k();
    }
}
