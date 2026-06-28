package external.org.apache.commons.lang3;

import java.io.File;

/* loaded from: classes3.dex */
public class h {
    public static final String A;
    public static final boolean A0;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final boolean W;
    public static final boolean X;
    public static final boolean Y;
    public static final boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private static final String f15977a = "Windows";

    /* renamed from: a0, reason: collision with root package name */
    public static final boolean f15978a0;

    /* renamed from: b, reason: collision with root package name */
    private static final String f15979b = "user.home";

    /* renamed from: b0, reason: collision with root package name */
    public static final boolean f15980b0;

    /* renamed from: c, reason: collision with root package name */
    private static final String f15981c = "user.dir";

    /* renamed from: c0, reason: collision with root package name */
    public static final boolean f15982c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final boolean f15984d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final boolean f15986e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final boolean f15988f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final boolean f15990g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final boolean f15992h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final boolean f15994i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f15996j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f15998k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f16000l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f16002m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final boolean f16004n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f16006o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f16008p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final boolean f16010q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final boolean f16012r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final boolean f16014s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final boolean f16016t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final boolean f16018u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final boolean f16020v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final boolean f16022w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final boolean f16024x0;

    /* renamed from: y, reason: collision with root package name */
    public static final String f16025y;

    /* renamed from: y0, reason: collision with root package name */
    public static final boolean f16026y0;

    /* renamed from: z, reason: collision with root package name */
    private static final e f16027z;

    /* renamed from: z0, reason: collision with root package name */
    public static final boolean f16028z0;

    /* renamed from: f, reason: collision with root package name */
    public static final String f15987f = f("awt.toolkit");

    /* renamed from: g, reason: collision with root package name */
    public static final String f15989g = f("file.encoding");

    /* renamed from: h, reason: collision with root package name */
    public static final String f15991h = f("file.separator");

    /* renamed from: i, reason: collision with root package name */
    public static final String f15993i = f("java.awt.fonts");

    /* renamed from: j, reason: collision with root package name */
    public static final String f15995j = f("java.awt.graphicsenv");

    /* renamed from: k, reason: collision with root package name */
    public static final String f15997k = f("java.awt.headless");

    /* renamed from: l, reason: collision with root package name */
    public static final String f15999l = f("java.awt.printerjob");

    /* renamed from: m, reason: collision with root package name */
    public static final String f16001m = f("java.class.path");

    /* renamed from: n, reason: collision with root package name */
    public static final String f16003n = f("java.class.version");

    /* renamed from: o, reason: collision with root package name */
    public static final String f16005o = f("java.compiler");

    /* renamed from: p, reason: collision with root package name */
    public static final String f16007p = f("java.endorsed.dirs");

    /* renamed from: q, reason: collision with root package name */
    public static final String f16009q = f("java.ext.dirs");

    /* renamed from: e, reason: collision with root package name */
    private static final String f15985e = "java.home";

    /* renamed from: r, reason: collision with root package name */
    public static final String f16011r = f(f15985e);

    /* renamed from: d, reason: collision with root package name */
    private static final String f15983d = "java.io.tmpdir";

    /* renamed from: s, reason: collision with root package name */
    public static final String f16013s = f(f15983d);

    /* renamed from: t, reason: collision with root package name */
    public static final String f16015t = f("java.library.path");

    /* renamed from: u, reason: collision with root package name */
    public static final String f16017u = f("java.runtime.name");

    /* renamed from: v, reason: collision with root package name */
    public static final String f16019v = f("java.runtime.version");

    /* renamed from: w, reason: collision with root package name */
    public static final String f16021w = f("java.specification.name");

    /* renamed from: x, reason: collision with root package name */
    public static final String f16023x = f("java.specification.vendor");

    static {
        boolean z4;
        String f5 = f("java.specification.version");
        f16025y = f5;
        f16027z = e.get(f5);
        A = f("java.util.prefs.PreferencesFactory");
        B = f("java.vendor");
        C = f("java.vendor.url");
        D = f("java.version");
        E = f("java.vm.info");
        F = f("java.vm.name");
        G = f("java.vm.specification.name");
        H = f("java.vm.specification.vendor");
        I = f("java.vm.specification.version");
        J = f("java.vm.vendor");
        K = f("java.vm.version");
        L = f("line.separator");
        M = f("os.arch");
        N = f("os.name");
        O = f("os.version");
        P = f("path.separator");
        String str = "user.country";
        if (f("user.country") == null) {
            str = "user.region";
        }
        Q = f(str);
        R = f(f15981c);
        S = f(f15979b);
        T = f("user.language");
        U = f("user.name");
        V = f("user.timezone");
        W = c("1.1");
        X = c("1.2");
        Y = c("1.3");
        Z = c("1.4");
        f15978a0 = c("1.5");
        f15980b0 = c("1.6");
        f15982c0 = c("1.7");
        boolean e5 = e("AIX");
        f15984d0 = e5;
        boolean e6 = e("HP-UX");
        f15986e0 = e6;
        boolean e7 = e("Irix");
        f15988f0 = e7;
        boolean z5 = false;
        if (!e("Linux") && !e("LINUX")) {
            z4 = false;
        } else {
            z4 = true;
        }
        f15990g0 = z4;
        f15992h0 = e("Mac");
        boolean e8 = e("Mac OS X");
        f15994i0 = e8;
        boolean e9 = e("FreeBSD");
        f15996j0 = e9;
        boolean e10 = e("OpenBSD");
        f15998k0 = e10;
        boolean e11 = e("NetBSD");
        f16000l0 = e11;
        f16002m0 = e("OS/2");
        boolean e12 = e("Solaris");
        f16004n0 = e12;
        boolean e13 = e("SunOS");
        f16006o0 = e13;
        if (e5 || e6 || e7 || z4 || e8 || e12 || e13 || e9 || e10 || e11) {
            z5 = true;
        }
        f16008p0 = z5;
        f16010q0 = e(f15977a);
        f16012r0 = d(f15977a, "5.0");
        f16014s0 = d(f15977a, "5.2");
        f16016t0 = d("Windows Server 2008", "6.1");
        f16018u0 = d("Windows 9", "4.0");
        f16020v0 = d("Windows 9", "4.1");
        f16022w0 = d(f15977a, "4.9");
        f16024x0 = e("Windows NT");
        f16026y0 = d(f15977a, "5.1");
        f16028z0 = d(f15977a, "6.0");
        A0 = d(f15977a, "6.1");
    }

    public static File a() {
        return new File(System.getProperty(f15985e));
    }

    public static File b() {
        return new File(System.getProperty(f15983d));
    }

    private static boolean c(String str) {
        return k(f16025y, str);
    }

    private static boolean d(String str, String str2) {
        return l(N, O, str, str2);
    }

    private static boolean e(String str) {
        return m(N, str);
    }

    private static String f(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static File g() {
        return new File(System.getProperty(f15981c));
    }

    public static File h() {
        return new File(System.getProperty(f15979b));
    }

    public static boolean i() {
        String str = f15997k;
        if (str != null) {
            return str.equals(Boolean.TRUE.toString());
        }
        return false;
    }

    public static boolean j(e eVar) {
        return f16027z.atLeast(eVar);
    }

    static boolean k(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    static boolean l(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && str.startsWith(str3) && str2.startsWith(str4);
    }

    static boolean m(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }
}
