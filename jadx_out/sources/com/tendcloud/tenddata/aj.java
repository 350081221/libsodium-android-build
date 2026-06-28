package com.tendcloud.tenddata;

import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11384a = "https://dns.qq.com";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11385b = "biYRrllT";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11386c = "3658";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11387d = "DES";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11388e = "DES/ECB/PKCS5Padding";

    /* renamed from: f, reason: collision with root package name */
    private static final String f11389f = "utf-8";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11390g = "TD_ts_cache_profile";

    /* renamed from: h, reason: collision with root package name */
    private static final long f11391h = 86400000;

    /* renamed from: i, reason: collision with root package name */
    private static Map<String, Integer> f11392i = new ConcurrentHashMap();

    public static String a(String str) {
        try {
            return e(d(new String(al.a(al.a().url(f11384a + "/d?dn=" + f(str) + "&id=" + f11386c).method(aq.GET).build()).c(), f11389f)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b(String str) {
        try {
            if (f11392i.get(str) == null) {
                f11392i.put(str, 0);
            }
        } catch (Throwable unused) {
        }
        return f11392i.get(str).intValue();
    }

    public static boolean c(String str) {
        try {
            if (System.currentTimeMillis() - s.b(ab.f11351g, f11390g, y.e(str), 0L) <= 86400000) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String d(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f11385b.getBytes(f11389f), f11387d);
            Cipher cipher = Cipher.getInstance(f11388e);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(y.d(str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String e(String str) {
        try {
            if (!y.b(str)) {
                for (String str2 : str.split(a1.i.f136b)) {
                    if (!g(str2)) {
                        return str2;
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String f(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f11385b.getBytes(f11389f), f11387d);
            Cipher cipher = Cipher.getInstance(f11388e);
            cipher.init(1, secretKeySpec);
            return y.a(cipher.doFinal(str.getBytes(f11389f)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g(String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(InetAddress.getByName(str).getAddress());
            if (byAddress.isSiteLocalAddress() || byAddress.isLoopbackAddress()) {
                return true;
            }
            if (byAddress.isAnyLocalAddress()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void updateFailureCountWithHost(String str) {
        f11392i.put(str, Integer.valueOf(b(str) + 1));
    }

    public static void updateTimeStamp(String str) {
        try {
            s.a(ab.f11351g, f11390g, y.e(str), System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }
}
