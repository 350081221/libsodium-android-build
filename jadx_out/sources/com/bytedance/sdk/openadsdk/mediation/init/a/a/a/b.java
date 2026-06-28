package com.bytedance.sdk.openadsdk.mediation.init.a.a.a;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.init.IMediationPrivacyConfig;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    public static final ValueSet a(final IMediationPrivacyConfig iMediationPrivacyConfig) {
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        if (iMediationPrivacyConfig == null) {
            return null;
        }
        a5.g(262114, new ValueSet.ValueGetter<List>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.b.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List get() {
                return IMediationPrivacyConfig.this.getCustomAppList();
            }
        });
        a5.g(262115, new ValueSet.ValueGetter<List>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.b.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List get() {
                return IMediationPrivacyConfig.this.getCustomDevImeis();
            }
        });
        a5.g(262116, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.b.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationPrivacyConfig.this.isCanUseOaid());
            }
        });
        a5.g(262117, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.b.4
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationPrivacyConfig.this.isLimitPersonalAds());
            }
        });
        a5.g(262118, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.b.5
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationPrivacyConfig.this.isProgrammaticRecommend());
            }
        });
        return a5.k();
    }
}
