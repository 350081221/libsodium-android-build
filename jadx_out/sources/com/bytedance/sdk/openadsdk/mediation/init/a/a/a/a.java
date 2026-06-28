package com.bytedance.sdk.openadsdk.mediation.init.a.a.a;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.init.IMediationConfig;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final ValueSet a(final IMediationConfig iMediationConfig) {
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        ValueSet valueSet = null;
        if (iMediationConfig == null) {
            return null;
        }
        a5.g(264101, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return IMediationConfig.this.getPublisherDid();
            }
        });
        a5.g(264102, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationConfig.this.isOpenAdnTest());
            }
        });
        if (iMediationConfig.getMediationConfigUserInfoForSegment() != null) {
            valueSet = c.a(iMediationConfig.getMediationConfigUserInfoForSegment());
        }
        a5.g(264103, valueSet);
        a5.g(264104, new ValueSet.ValueGetter<Map>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.4
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map get() {
                return IMediationConfig.this.getLocalExtra();
            }
        });
        a5.g(264105, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.5
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationConfig.this.getHttps());
            }
        });
        a5.g(264106, new ValueSet.ValueGetter<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.6
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public JSONObject get() {
                return IMediationConfig.this.getCustomLocalConfig();
            }
        });
        a5.g(264107, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.7
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return IMediationConfig.this.getOpensdkVer();
            }
        });
        a5.g(264108, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.8
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationConfig.this.isWxInstalled());
            }
        });
        a5.g(264109, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.9
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationConfig.this.isSupportH265());
            }
        });
        a5.g(264110, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.10
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(IMediationConfig.this.isSupportSplashZoomout());
            }
        });
        a5.g(264111, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.mediation.init.a.a.a.a.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return IMediationConfig.this.wxAppId();
            }
        });
        return a5.k();
    }
}
