package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.PersonalizationPrompt;

/* loaded from: classes2.dex */
public class g implements PersonalizationPrompt {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4897a;

    public g(Bridge bridge) {
        this.f4897a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.PersonalizationPrompt
    public String getName() {
        return (String) this.f4897a.values().objectValue(242002, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.PersonalizationPrompt
    public String getUrl() {
        return (String) this.f4897a.values().objectValue(242001, String.class);
    }
}
