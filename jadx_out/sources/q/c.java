package q;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static b f22283a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f22284b = false;

    public static synchronized String a(Context context) {
        synchronized (c.class) {
            if (context != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    b(context);
                    b bVar = f22283a;
                    if (bVar != null) {
                        try {
                            return bVar.a(context);
                        } catch (Exception unused) {
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            throw new RuntimeException("Context is null");
        }
    }

    public static void b(Context context) {
        if (f22283a == null && !f22284b) {
            synchronized (c.class) {
                if (f22283a == null && !f22284b) {
                    f22283a = s.a.b(context);
                    f22284b = true;
                }
            }
        }
    }
}
