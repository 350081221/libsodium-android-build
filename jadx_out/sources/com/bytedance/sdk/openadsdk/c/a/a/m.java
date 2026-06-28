package com.bytedance.sdk.openadsdk.c.a.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTImage;

/* loaded from: classes2.dex */
public class m extends TTImage {

    /* renamed from: a, reason: collision with root package name */
    private final Bridge f4904a;

    public m(Bridge bridge) {
        this.f4904a = bridge == null ? com.bykv.a.a.a.a.b.f3107d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public double getDuration() {
        return this.f4904a.values().doubleValue(230004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public int getHeight() {
        return this.f4904a.values().intValue(230002);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public String getImageUrl() {
        return (String) this.f4904a.values().objectValue(230003, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public int getWidth() {
        return this.f4904a.values().intValue(230001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public boolean isValid() {
        return this.f4904a.values().booleanValue(230005);
    }
}
