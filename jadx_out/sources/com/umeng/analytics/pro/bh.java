package com.umeng.analytics.pro;

import android.util.Log;

/* loaded from: classes3.dex */
public class bh {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12253a = "OpenId";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f12254b = false;

    public static void a(boolean z4) {
        Log.d("OpenId", "setDebug:" + z4);
        f12254b = z4;
    }

    public static void b(String str, Object... objArr) {
        if (f12254b) {
            Log.i("OpenId", e(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (f12254b) {
            Log.w("OpenId", e(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        if (f12254b) {
            Log.e("OpenId", e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        int i5 = 0;
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i6 = i5 + 1;
                if (i6 >= objArr.length) {
                    break;
                }
                sb.append(a(objArr[i5], objArr[i6]));
                if (i6 < length - 1) {
                    sb.append(",");
                }
                i5 = i6 + 1;
            }
            if (i5 == objArr.length - 1) {
                sb.append(objArr[i5]);
            }
        }
        return sb.toString();
    }

    public static void a(String str, Object... objArr) {
        if (f12254b) {
            Log.d("OpenId", e(str, objArr));
        }
    }

    private static String a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }
}
