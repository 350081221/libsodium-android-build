package com.bytedance.sdk.openadsdk.c.a.c;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.AdConfig;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public static final ValueSet a(final AdConfig adConfig) {
        ValueSet valueSet;
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        ValueSet valueSet2 = null;
        if (adConfig == null) {
            return null;
        }
        a5.h(261001, adConfig.getAppId());
        a5.h(261002, adConfig.getAppName());
        a5.i(261003, adConfig.isPaid());
        a5.h(261004, adConfig.getKeywords());
        a5.h(261005, adConfig.getData());
        a5.e(261006, adConfig.getTitleBarTheme());
        a5.i(261007, adConfig.isAllowShowNotify());
        a5.i(261008, adConfig.isDebug());
        a5.g(261009, adConfig.getDirectDownloadNetworkType());
        a5.i(261011, adConfig.isSupportMultiProcess());
        if (adConfig.getCustomController() != null) {
            valueSet = d.a(adConfig.getCustomController());
        } else {
            valueSet = null;
        }
        a5.g(261012, valueSet);
        a5.g(261013, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.a.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get() {
                return Integer.valueOf(AdConfig.this.getPluginUpdateConfig());
            }
        });
        a5.g(261014, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.a.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get() {
                return Integer.valueOf(AdConfig.this.getAgeGroup());
            }
        });
        a5.g(261015, new ValueSet.ValueGetter<Integer>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.a.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get() {
                return Integer.valueOf(AdConfig.this.getThemeStatus());
            }
        });
        if (adConfig.getMediationConfig() != null) {
            valueSet2 = com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.a(adConfig.getMediationConfig());
        }
        a5.g(261016, valueSet2);
        a5.i(261017, adConfig.isUseMediation());
        a5.g(261018, new ValueSet.ValueGetter<Map>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.a.4
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map get() {
                return AdConfig.this.getInitExtra();
            }
        });
        return a5.k();
    }
}
