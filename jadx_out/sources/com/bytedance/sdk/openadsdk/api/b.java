package com.bytedance.sdk.openadsdk.api;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected EventListener f4829a;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i5, Result result) {
        if (a()) {
            return;
        }
        this.f4829a.onEvent(i5, result);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i5) {
        a(i5, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a() {
        return this.f4829a == null;
    }
}
