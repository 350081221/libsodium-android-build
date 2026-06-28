package p0;

import android.content.Context;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static b f22264a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f22265b = new Object();

    public static long a(b bVar) {
        if (bVar != null) {
            String format = String.format("%s%s%s%s%s", bVar.g(), bVar.i(), Long.valueOf(bVar.a()), bVar.k(), bVar.d());
            if (!l0.f.b(format)) {
                Adler32 adler32 = new Adler32();
                adler32.reset();
                adler32.update(format.getBytes());
                return adler32.getValue();
            }
            return 0L;
        }
        return 0L;
    }

    public static b b(Context context) {
        if (context != null) {
            synchronized (f22265b) {
                String e5 = d.c(context).e();
                if (!l0.f.b(e5)) {
                    if (e5.endsWith("\n")) {
                        e5 = e5.substring(0, e5.length() - 1);
                    }
                    b bVar = new b();
                    long currentTimeMillis = System.currentTimeMillis();
                    String b5 = l0.d.b(context);
                    String d5 = l0.d.d(context);
                    bVar.h(b5);
                    bVar.c(b5);
                    bVar.e(currentTimeMillis);
                    bVar.f(d5);
                    bVar.j(e5);
                    bVar.b(a(bVar));
                    return bVar;
                }
                return null;
            }
        }
        return null;
    }

    public static synchronized b c(Context context) {
        synchronized (c.class) {
            b bVar = f22264a;
            if (bVar != null) {
                return bVar;
            }
            if (context != null) {
                b b5 = b(context);
                f22264a = b5;
                return b5;
            }
            return null;
        }
    }
}
