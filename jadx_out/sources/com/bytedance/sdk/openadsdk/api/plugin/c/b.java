package com.bytedance.sdk.openadsdk.api.plugin.c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.security.SecureRandom;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    @JProtect
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a5 = a();
        String a6 = a(a5, 32);
        String b5 = b();
        return 3 + a5 + b5 + ((a6 == null || b5 == null) ? null : a.a(str, b5, a6));
    }

    public static String b() {
        String a5 = a(8);
        if (a5 == null || a5.length() != 16) {
            return null;
        }
        return a5;
    }

    private static SecureRandom c() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    @JProtect
    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            try {
                String a5 = a(jSONObject.toString());
                if (!TextUtils.isEmpty(a5)) {
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, a5);
                    jSONObject2.put("cypher", 3);
                } else {
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject2.put(CrashHianalyticsData.MESSAGE, jSONObject.toString());
            jSONObject2.put("cypher", 0);
        }
        return jSONObject2;
    }

    public static String a() {
        String a5 = a(16);
        if (a5 == null || a5.length() != 32) {
            return null;
        }
        return a5;
    }

    public static String a(String str, int i5) {
        if (str == null || str.length() != i5) {
            return null;
        }
        int i6 = i5 / 2;
        return str.substring(i6, i5) + str.substring(0, i6);
    }

    public static String a(int i5) {
        try {
            byte[] bArr = new byte[i5];
            c().nextBytes(bArr);
            return c.a(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
