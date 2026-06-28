package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.helpers.h;
import org.slf4j.helpers.k;
import org.slf4j.helpers.l;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final String f22215a = "http://www.slf4j.org/codes.html";

    /* renamed from: b, reason: collision with root package name */
    static final String f22216b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";

    /* renamed from: c, reason: collision with root package name */
    static final String f22217c = "http://www.slf4j.org/codes.html#multiple_bindings";

    /* renamed from: d, reason: collision with root package name */
    static final String f22218d = "http://www.slf4j.org/codes.html#null_LF";

    /* renamed from: e, reason: collision with root package name */
    static final String f22219e = "http://www.slf4j.org/codes.html#version_mismatch";

    /* renamed from: f, reason: collision with root package name */
    static final String f22220f = "http://www.slf4j.org/codes.html#substituteLogger";

    /* renamed from: g, reason: collision with root package name */
    static final String f22221g = "http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* renamed from: h, reason: collision with root package name */
    static final String f22222h = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* renamed from: i, reason: collision with root package name */
    static final int f22223i = 0;

    /* renamed from: j, reason: collision with root package name */
    static final int f22224j = 1;

    /* renamed from: k, reason: collision with root package name */
    static final int f22225k = 2;

    /* renamed from: l, reason: collision with root package name */
    static final int f22226l = 3;

    /* renamed from: m, reason: collision with root package name */
    static final int f22227m = 4;

    /* renamed from: n, reason: collision with root package name */
    static int f22228n;

    /* renamed from: o, reason: collision with root package name */
    static k f22229o = new k();

    /* renamed from: p, reason: collision with root package name */
    static h f22230p = new h();

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f22231q = {"1.6", "1.7"};

    /* renamed from: r, reason: collision with root package name */
    private static String f22232r = "org/slf4j/impl/StaticLoggerBinder.class";

    private b() {
    }

    private static final void a() {
        try {
            Set d5 = d();
            l(d5);
            StaticLoggerBinder.getSingleton();
            f22228n = 3;
            k(d5);
            b();
        } catch (Exception e5) {
            c(e5);
            throw new IllegalStateException("Unexpected initialization failure", e5);
        } catch (NoClassDefFoundError e6) {
            if (i(e6.getMessage())) {
                f22228n = 4;
                l.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                l.a("Defaulting to no-operation (NOP) logger implementation");
                l.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            c(e6);
            throw e6;
        } catch (NoSuchMethodError e7) {
            String message = e7.getMessage();
            if (message != null && message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                f22228n = 2;
                l.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                l.a("Your binding is version 1.5.5 or earlier.");
                l.a("Upgrade your binding to version 1.6.x.");
            }
            throw e7;
        }
    }

    private static final void b() {
        List b5 = f22229o.b();
        if (b5.size() == 0) {
            return;
        }
        l.a("The following loggers will not work because they were created");
        l.a("during the default configuration phase of the underlying logging system.");
        l.a("See also http://www.slf4j.org/codes.html#substituteLogger");
        for (int i5 = 0; i5 < b5.size(); i5++) {
            l.a((String) b5.get(i5));
        }
    }

    static void c(Throwable th) {
        f22228n = 2;
        l.b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static Set d() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(f22232r);
            } else {
                resources = classLoader.getResources(f22232r);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e5) {
            l.b("Error getting resources from path", e5);
        }
        return linkedHashSet;
    }

    public static ILoggerFactory e() {
        if (f22228n == 0) {
            f22228n = 1;
            j();
        }
        int i5 = f22228n;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        return f22230p;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            throw new IllegalStateException(f22222h);
        }
        return f22229o;
    }

    public static a f(Class cls) {
        return g(cls.getName());
    }

    public static a g(String str) {
        return e().a(str);
    }

    private static boolean h(Set set) {
        return set.size() > 1;
    }

    private static boolean i(String str) {
        if (str == null) {
            return false;
        }
        if (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) {
            return false;
        }
        return true;
    }

    private static final void j() {
        a();
        if (f22228n == 3) {
            n();
        }
    }

    private static void k(Set set) {
        if (h(set)) {
            l.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
        }
    }

    private static void l(Set set) {
        if (h(set)) {
            l.a("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                l.a("Found binding in [" + ((URL) it.next()) + "]");
            }
            l.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    static void m() {
        f22228n = 0;
        f22229o = new k();
    }

    private static final void n() {
        String[] strArr;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            int i5 = 0;
            boolean z4 = false;
            while (true) {
                strArr = f22231q;
                if (i5 >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i5])) {
                    z4 = true;
                }
                i5++;
            }
            if (!z4) {
                l.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(strArr).toString());
                l.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            l.b("Unexpected problem occured during version sanity check", th);
        }
    }
}
