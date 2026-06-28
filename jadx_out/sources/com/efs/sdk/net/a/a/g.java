package com.efs.sdk.net.a.a;

import android.text.TextUtils;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.NetManager;
import com.efs.sdk.net.a.a.f;
import com.huawei.hms.utils.FileUtil;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;
import p4.m;

/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f6790a = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private static g f6791c;

    /* renamed from: b, reason: collision with root package name */
    private b f6792b = new b();

    private g() {
    }

    public static g c() {
        if (f6791c == null) {
            f6791c = new g();
        }
        return f6791c;
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a(f.b bVar) {
        String str;
        Log.d("NetTrace-Interceptor", "request will be sent");
        b bVar2 = this.f6792b;
        try {
            String a5 = bVar.a();
            bVar2.f6781a.put(bVar.a(), Long.valueOf(System.currentTimeMillis()));
            Log.i("NetTrace-Interceptor", "save request");
            com.efs.sdk.net.a.c a6 = com.efs.sdk.net.a.a.a().a(a5);
            String b5 = bVar.b();
            if (!TextUtils.isEmpty(b5)) {
                a6.f6804d = b5;
            }
            a6.f6805e = bVar.c();
            HashMap hashMap = new HashMap();
            int e5 = bVar.e();
            for (int i5 = 0; i5 < e5; i5++) {
                hashMap.put(bVar.a(i5), bVar.b(i5));
            }
            a6.f6806f = b.a(bVar);
            if (NetManager.getNetConfigManager().getNetRequestBodyCollectState()) {
                String str2 = a6.f6805e;
                if ((str2 == null || !str2.equalsIgnoreCase("get")) && (str = a6.f6805e) != null && str.equalsIgnoreCase("post") && a6.f6806f < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
                    if (hashMap.containsKey(HTTP.CONTENT_TYPE) || hashMap.containsKey("content-type")) {
                        String str3 = (String) hashMap.get(HTTP.CONTENT_TYPE);
                        if (TextUtils.isEmpty(str3)) {
                            str3 = (String) hashMap.get("content-type");
                        }
                        if (str3 != null) {
                            if (str3.contains("application/json") || str3.contains(URLEncodedUtils.CONTENT_TYPE)) {
                                a6.f6807g = new String(bVar.d());
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.efs.sdk.net.a.a.f
    public final String b() {
        Log.d("NetTrace-Interceptor", "next request id");
        return String.valueOf(f6790a.getAndIncrement());
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a(f.d dVar) {
        Log.d("NetTrace-Interceptor", "response headers received");
        b bVar = this.f6792b;
        Log.i("NetTrace-Interceptor", "save response");
        String a5 = dVar.a();
        if (bVar.f6781a != null) {
            com.efs.sdk.net.a.a.a().a(a5).f6808h = dVar.b();
        }
    }

    @Override // com.efs.sdk.net.a.a.f
    @m
    public final InputStream a(String str, @m String str2, @m String str3, @m InputStream inputStream) {
        Log.d("NetTrace-Interceptor", "interpret response stream");
        return b.a(str, str2, str3, inputStream);
    }

    @Override // com.efs.sdk.net.a.a.f
    public final void a() {
        Log.d("NetTrace-Interceptor", "data sent");
    }
}
