package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTWidgetManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q extends TTWidgetManager {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4908a;

    public q(Bridge bridge) {
        this.f4908a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTWidgetManager
    public boolean updateWidgetWithType(int i5, JSONObject jSONObject) {
        com.bykv.a.a.a.a.b b5 = com.bykv.a.a.a.a.b.b(2);
        b5.e(0, i5);
        b5.g(1, jSONObject);
        return ((Boolean) this.f4908a.call(264001, b5.k(), Boolean.TYPE)).booleanValue();
    }
}
