package com.bytedance.sdk.openadsdk.live.a;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.android.live.base.api.ILiveHostActionParam;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements ILiveHostActionParam {

    /* renamed from: a, reason: collision with root package name */
    private Bridge f5022a;

    public b(Bridge bridge) {
        this.f5022a = bridge;
    }

    @Override // com.bytedance.android.live.base.api.ILiveHostActionParam
    public void logEvent(boolean z4, String str, String str2, Map<String, String> map) {
        Bridge bridge = this.f5022a;
        if (bridge != null) {
            bridge.call(1, com.bykv.a.a.a.a.b.a().i(0, z4).h(1, str).h(2, str2).g(3, map).k(), null);
        }
    }
}
