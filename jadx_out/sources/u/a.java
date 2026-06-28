package u;

import android.util.Log;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22486a = "OpenId";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f22487b = false;

    public static String a(Object obj, Object obj2) {
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

    public static String b(String str, Object... objArr) {
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

    public static void c(boolean z4) {
        Log.d(f22486a, "setDebug:" + z4);
        f22487b = z4;
    }

    public static void d(String str, Object... objArr) {
        if (f22487b) {
            Log.d(f22486a, b(str, objArr));
        }
    }

    public static void e(String str, Object... objArr) {
        if (f22487b) {
            Log.e(f22486a, b(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        if (f22487b) {
            Log.i(f22486a, b(str, objArr));
        }
    }

    public static void g(String str, Object... objArr) {
        if (f22487b) {
            Log.w(f22486a, b(str, objArr));
        }
    }
}
