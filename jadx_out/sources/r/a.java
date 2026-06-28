package r;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        String a5;
        synchronized (a.class) {
            String str3 = null;
            if (context != null) {
                try {
                    if (!f1.a.c(str) && !f1.a.c(str2)) {
                        try {
                            a5 = e.a(context, str, str2, "");
                        } catch (Throwable unused) {
                        }
                        if (f1.a.c(a5)) {
                            return null;
                        }
                        str3 = e1.c.e(e1.c.a(), a5);
                        return str3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            if (f1.a.c(str) || f1.a.c(str2) || context == null) {
                return;
            }
            try {
                String b5 = e1.c.b(e1.c.a(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, b5);
                e.b(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }
}
