package org.slf4j;

import org.slf4j.helpers.l;
import org.slf4j.impl.StaticMarkerBinder;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    static IMarkerFactory f22236a;

    static {
        try {
            f22236a = StaticMarkerBinder.SINGLETON.getMarkerFactory();
        } catch (Exception e5) {
            l.b("Unexpected failure while binding MarkerFactory", e5);
        } catch (NoClassDefFoundError unused) {
            f22236a = new org.slf4j.helpers.c();
        }
    }

    private e() {
    }

    public static d a(String str) {
        return f22236a.c(str);
    }

    public static IMarkerFactory b() {
        return f22236a;
    }

    public static d c(String str) {
        return f22236a.a(str);
    }
}
