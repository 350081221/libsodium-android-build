package com.bytedance.sdk.openadsdk.c.a.c;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTCustomController;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {
    public static final ValueSet a(final TTCustomController tTCustomController) {
        com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
        ValueSet valueSet = null;
        if (tTCustomController == null) {
            return null;
        }
        a5.g(262101, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.1
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseLocation());
            }
        });
        a5.g(262102, new ValueSet.ValueGetter<ValueSet>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.6
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ValueSet get() {
                return c.a(TTCustomController.this.getTTLocation());
            }
        });
        a5.g(262103, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.7
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.alist());
            }
        });
        a5.g(262104, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.8
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUsePhoneState());
            }
        });
        a5.g(262105, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.9
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return TTCustomController.this.getDevImei();
            }
        });
        a5.g(262106, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.10
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseWifiState());
            }
        });
        a5.g(262107, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.11
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return TTCustomController.this.getMacAddress();
            }
        });
        a5.g(262108, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.12
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseWriteExternal());
            }
        });
        a5.g(262109, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.13
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return TTCustomController.this.getDevOaid();
            }
        });
        a5.g(262110, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.2
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUseAndroidId());
            }
        });
        if (tTCustomController.getMediationPrivacyConfig() != null) {
            valueSet = com.bytedance.sdk.openadsdk.mediation.init.a.a.a.b.a(tTCustomController.getMediationPrivacyConfig());
        }
        a5.g(262113, valueSet);
        a5.g(262112, new ValueSet.ValueGetter<String>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.3
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return TTCustomController.this.getAndroidId();
            }
        });
        a5.g(262111, new ValueSet.ValueGetter<Boolean>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.4
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean get() {
                return Boolean.valueOf(TTCustomController.this.isCanUsePermissionRecordAudio());
            }
        });
        a5.g(262119, new ValueSet.ValueGetter<Map>() { // from class: com.bytedance.sdk.openadsdk.c.a.c.d.5
            @Override // com.bykv.vk.openvk.api.proto.ValueSet.ValueGetter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map get() {
                return TTCustomController.this.userPrivacyConfig();
            }
        });
        return a5.k();
    }
}
