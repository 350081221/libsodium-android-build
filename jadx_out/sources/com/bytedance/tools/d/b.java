package com.bytedance.tools.d;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.security.SecureRandom;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    public static String a() {
        String b5 = b(16);
        if (b5 == null || b5.length() != 32) {
            return null;
        }
        return b5;
    }

    public static String b(int i5) {
        try {
            byte[] bArr = new byte[i5];
            h().nextBytes(bArr);
            return e.a(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a5 = a();
        String d5 = d(a5, 32);
        String f5 = f();
        if (d5 != null && f5 != null) {
            str2 = a.a(str, f5, d5);
        } else {
            str2 = null;
        }
        return 3 + a5 + f5 + str2;
    }

    public static String d(String str, int i5) {
        if (str != null && str.length() == i5) {
            int i6 = i5 / 2;
            return str.substring(i6, i5) + str.substring(0, i6);
        }
        return null;
    }

    public static JSONObject e(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            try {
                String c5 = c(jSONObject.toString());
                if (!TextUtils.isEmpty(c5)) {
                    jSONObject2.put(CrashHianalyticsData.MESSAGE, c5);
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

    public static String f() {
        String b5 = b(8);
        if (b5 == null || b5.length() != 16) {
            return null;
        }
        return b5;
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 49) {
            String d5 = d(str.substring(1, 33), 32);
            String substring = str.substring(33, 49);
            if (substring != null && d5 != null) {
                return a.b(str.substring(49), substring, d5);
            }
            return str;
        }
        return str;
    }

    private static SecureRandom h() {
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
}
