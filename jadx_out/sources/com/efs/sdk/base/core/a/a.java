package com.efs.sdk.base.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile long f6478b = -1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6479a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0139a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f6480a = new a(0);
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static a a() {
        return C0139a.f6480a;
    }

    public static long b() {
        if (f6478b == -1) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + f6478b;
    }

    private a() {
        this.f6479a = true;
    }

    @NonNull
    public final HttpResponse a(String str, c cVar, File file, boolean z4) {
        String b5 = cVar.b();
        String a5 = a(str, cVar);
        if (this.f6479a) {
            Log.i("efs.px.api", "Upload file, url is ".concat(String.valueOf(a5)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", b5);
        com.efs.sdk.base.core.util.a.d a6 = new com.efs.sdk.base.core.util.a.d(a5).a(hashMap);
        a6.f6642a.f6637d = file;
        com.efs.sdk.base.core.util.a.d a7 = a6.a("type", cVar.f6489h);
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f6494m);
        return a7.a("size", sb.toString()).a("flow_limit", Boolean.toString(z4)).a(d.a()).a().b();
    }

    public static String a(@NonNull String str, @NonNull c cVar) {
        byte b5 = cVar.f6488g;
        return str + (b5 != 1 ? b5 != 2 ? b5 != 3 ? "/api/v1/raw/upload" : "/api/v1/mix/upload" : "/perf_upload" : "/apm_logs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String optString = jSONObject.optString(PluginConstants.KEY_ERROR_CODE, "-1");
            httpResponse.setBizCode(optString);
            if (!"0".equals(optString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j5 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j5 - b()) > 1500000) {
                f6478b = j5 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            Log.e("efs.px.api", "checkPxReturn error", th);
        }
    }
}
