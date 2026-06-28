package com.tendcloud.tenddata;

import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private static volatile HashMap<String, ak> f11393a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final String f11394b = "TD_IP_CACHE";

    /* renamed from: c, reason: collision with root package name */
    private String f11395c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f11396d = null;

    /* renamed from: e, reason: collision with root package name */
    private String f11397e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f11398f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f11399g = null;

    /* loaded from: classes3.dex */
    public static class a {
        static final int resolvedIp = 1;
        static final int savedIp = 3;
        static final int staticIp = 4;
        static final int successIp = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static URL a(URL url, String str) {
        return o.b() ? url : new URL(url.getProtocol(), str, url.getPort(), url.getFile());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b(String str, String str2) {
        synchronized (ak.class) {
            if (!y.b(str) && !f11393a.containsKey(str)) {
                if (f11393a == null) {
                    return;
                }
                try {
                    ak akVar = new ak();
                    akVar.f11399g = str;
                    akVar.f11395c = str2;
                    akVar.f11397e = s.b(ab.f11351g, f11394b, y.e(str), (String) null);
                    akVar.f11396d = b(akVar.f11399g);
                    f11393a.put(akVar.f11399g, akVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        String a5 = a(str, 1);
        if (a5 == null || a5.equalsIgnoreCase(a(str, 3)) || ab.f11351g == null) {
            return;
        }
        s.a(ab.f11351g, f11394b, y.e(str), a(str, 1));
        a(str, a(str, 1), 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2) {
        if (ab.f11351g != null) {
            s.a(ab.f11351g, f11394b, y.e(str), str2);
            a(str, str2, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(String str, String str2, int i5) {
        synchronized (ak.class) {
            if (!y.b(str) && f11393a.containsKey(str)) {
                if (f11393a == null) {
                    return;
                }
                ak akVar = f11393a.get(str);
                if (i5 == 1) {
                    akVar.f11396d = str2;
                } else if (i5 == 2) {
                    akVar.f11398f = str2;
                } else if (i5 == 3) {
                    akVar.f11397e = str2;
                } else if (i5 == 4) {
                    akVar.f11395c = str2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized String a(String str, int i5) {
        synchronized (ak.class) {
            if (!y.b(str) && f11393a.containsKey(str)) {
                if (f11393a == null) {
                    return null;
                }
                ak akVar = f11393a.get(str);
                if (akVar == null) {
                    return null;
                }
                if (i5 == 1) {
                    return akVar.f11396d;
                }
                if (i5 == 2) {
                    return akVar.f11398f;
                }
                if (i5 == 3) {
                    return akVar.f11397e;
                }
                if (i5 != 4) {
                    return null;
                }
                return akVar.f11395c;
            }
            return null;
        }
    }
}
