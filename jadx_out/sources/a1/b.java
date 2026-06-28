package a1;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f90a = 3000;

    /* renamed from: b, reason: collision with root package name */
    public static long f91b = -1;

    public static synchronized boolean a() {
        synchronized (b.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - f91b >= f90a) {
                f91b = elapsedRealtime;
                return false;
            }
            return true;
        }
    }
}
