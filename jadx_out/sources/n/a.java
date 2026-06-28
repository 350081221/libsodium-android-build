package n;

import a1.e;
import android.content.Context;
import android.os.SystemClock;
import y0.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f20806a;

    /* renamed from: n.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0623a {
        void a(String str);
    }

    public static boolean a(Context context) {
        try {
            b.e().b(context);
            long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (elapsedRealtime - f20806a < 600) {
                return false;
            }
            f20806a = elapsedRealtime;
            i0.a.a(context);
            return true;
        } catch (Exception e5) {
            e.d(e5);
            return false;
        }
    }

    public static void b(InterfaceC0623a interfaceC0623a) {
        e.e(interfaceC0623a);
    }
}
