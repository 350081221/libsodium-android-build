package org.osmdroid.config;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static c f21630a;

    public static synchronized c a() {
        c cVar;
        synchronized (a.class) {
            if (f21630a == null) {
                f21630a = new b();
            }
            cVar = f21630a;
        }
        return cVar;
    }

    public static void b(c cVar) {
        f21630a = cVar;
    }
}
