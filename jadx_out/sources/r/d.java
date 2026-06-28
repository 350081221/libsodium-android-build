package r;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (d.class) {
            if (!f1.a.c(str)) {
                if (!f1.a.c(str2) && context != null) {
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
    }
}
