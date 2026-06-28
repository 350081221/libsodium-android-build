package com.bytedance.sdk.openadsdk.mediation;

import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.mediation.a.a.a.b;
import com.bytedance.sdk.openadsdk.mediation.a.a.g;

/* loaded from: classes2.dex */
public class MediationManagerVisitor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile MediationManagerVisitor f5052a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Bridge f5053b;

    /* renamed from: c, reason: collision with root package name */
    private b f5054c;

    private MediationManagerVisitor() {
    }

    public static MediationManagerVisitor getInstance() {
        if (f5052a == null) {
            synchronized (MediationManagerVisitor.class) {
                if (f5052a == null) {
                    f5052a = new MediationManagerVisitor();
                }
            }
        }
        return f5052a;
    }

    public synchronized IMediationManager getMediationManager() {
        Bundle bundle = new Bundle();
        bundle.putString("mediation_manager", "mediation_manager");
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            f5053b = (Bridge) adManager.getExtra(null, bundle);
        }
        if (f5053b == null) {
            return null;
        }
        if (this.f5054c == null) {
            this.f5054c = new g(f5053b);
        }
        return this.f5054c;
    }
}
