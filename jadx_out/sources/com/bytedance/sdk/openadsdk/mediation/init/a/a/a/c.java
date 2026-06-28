package com.bytedance.sdk.openadsdk.mediation.init.a.a.a;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;

/* loaded from: classes2.dex */
public class c {
    public static final ValueSet a(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        if (mediationConfigUserInfoForSegment == null) {
            return null;
        }
        a5.g(265007, mediationConfigUserInfoForSegment.getCustomInfos());
        a5.h(265001, mediationConfigUserInfoForSegment.getUserId());
        a5.h(265002, mediationConfigUserInfoForSegment.getChannel());
        a5.h(265003, mediationConfigUserInfoForSegment.getSubChannel());
        a5.e(265004, mediationConfigUserInfoForSegment.getAge());
        a5.h(265005, mediationConfigUserInfoForSegment.getGender());
        a5.h(265006, mediationConfigUserInfoForSegment.getUserValueGroup());
        return a5.k();
    }
}
