package com.bytedance.tools.b;

import com.bytedance.sdk.openadsdk.api.TTILog;
import java.util.UUID;

/* loaded from: classes2.dex */
public class c implements TTILog {

    /* renamed from: a, reason: collision with root package name */
    private final a f6284a;

    public c(String str) {
        this.f6284a = new a(str);
    }

    private void a(String str, String str2) {
        String uuid = UUID.randomUUID().toString();
        com.a.a.a.a.n(str, "log big String with key:" + uuid);
        this.f6284a.c(uuid, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void d(String str, String str2) {
        if (str2 != null && str != null) {
            if (str2.length() > 4096) {
                a(str, str2);
            } else {
                com.a.a.a.a.n(str, str2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void e(String str, String str2) {
        if (str2 == null || str == null) {
            return;
        }
        if (str2.length() > 4096) {
            a(str, str2);
        } else {
            com.a.a.a.a.v(str, str2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void flush() {
        com.a.a.a.a.l();
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void forceLogSharding() {
        com.a.a.a.a.q();
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void i(String str, String str2) {
        if (str2 != null && str != null) {
            if (str2.length() > 4096) {
                a(str, str2);
            } else {
                com.a.a.a.a.r(str, str2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void v(String str, String str2) {
        if (str2 != null && str != null) {
            if (str2.length() > 4096) {
                a(str, str2);
            } else {
                com.a.a.a.a.g(str, str2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void w(String str, String str2) {
        if (str2 == null || str == null) {
            return;
        }
        if (str2.length() > 4096) {
            a(str, str2);
        } else {
            com.a.a.a.a.t(str, str2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void e(String str, String str2, Throwable th) {
        com.a.a.a.a.o(str, str2, th);
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void w(String str, Throwable th) {
        if (str == null) {
            return;
        }
        com.a.a.a.a.h(str, "", th);
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void e(String str, Throwable th) {
        com.a.a.a.a.o(str, "", th);
    }

    @Override // com.bytedance.sdk.openadsdk.api.TTILog
    public void w(String str, String str2, Throwable th) {
        if (str2 == null || str == null) {
            return;
        }
        com.a.a.a.a.h(str, str2, th);
    }
}
