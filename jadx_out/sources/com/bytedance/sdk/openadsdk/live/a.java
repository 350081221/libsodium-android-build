package com.bytedance.sdk.openadsdk.live;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.android.live.base.api.callback.Callback;

/* loaded from: classes2.dex */
public class a implements Callback<Object> {

    /* renamed from: a, reason: collision with root package name */
    private Bridge f5017a;

    public a(Bridge bridge) {
        this.f5017a = bridge;
    }

    @Override // com.bytedance.android.live.base.api.callback.Callback
    public void invoke(Object obj) {
        Bridge bridge = this.f5017a;
        if (bridge != null) {
            bridge.call(1, com.bykv.a.a.a.a.b.a().g(0, obj).k(), null);
        }
    }
}
