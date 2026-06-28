package com.huawei.secure.android.common.ssl;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8928a = "SSLUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8929b = "TLSv1.3";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8930c = "TLSv1.2";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8931d = "TLS";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8932e = "TLSv1";

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f8933f = {"TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f8934g = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f8935h = {"TLS_RSA", "CBC", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    public static String[] a(SSLSocket sSLSocket) {
        return sSLSocket.getEnabledCipherSuites();
    }

    public static String[] b(SSLSocket sSLSocket) {
        return sSLSocket.getEnabledProtocols();
    }

    public static void c(SSLSocket sSLSocket) {
        for (String str : sSLSocket.getEnabledProtocols()) {
            com.huawei.secure.android.common.ssl.util.i.e(f8928a, "new enable protocols is : " + str);
        }
        for (String str2 : sSLSocket.getEnabledCipherSuites()) {
            com.huawei.secure.android.common.ssl.util.i.e(f8928a, "new cipher suites is : " + str2);
        }
    }

    public static boolean d(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return e(sSLSocket, f8935h);
    }

    public static boolean e(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        int length = enabledCipherSuites.length;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i5 >= length) {
                break;
            }
            String str = enabledCipherSuites[i5];
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length2 = strArr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length2) {
                    if (upperCase.contains(strArr[i6].toUpperCase(Locale.ENGLISH))) {
                        break;
                    }
                    i6++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                arrayList.add(str);
            }
            i5++;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    public static void f(SSLSocket sSLSocket) {
        if (sSLSocket != null && !k(sSLSocket)) {
            d(sSLSocket);
        }
    }

    public static void g(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            sSLSocket.setEnabledProtocols(new String[]{f8929b, f8930c});
        }
        if (i5 < 29) {
            sSLSocket.setEnabledProtocols(new String[]{f8930c});
        }
    }

    public static boolean h(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket != null && strArr != null) {
            try {
                sSLSocket.setEnabledProtocols(strArr);
                return true;
            } catch (Exception e5) {
                com.huawei.secure.android.common.ssl.util.i.d(f8928a, "setEnabledProtocols: exception : " + e5.getMessage());
            }
        }
        return false;
    }

    public static SSLContext i() throws NoSuchAlgorithmException {
        if (Build.VERSION.SDK_INT >= 29) {
            return SSLContext.getInstance(f8929b);
        }
        return SSLContext.getInstance(f8930c);
    }

    public static void j(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return;
        }
        g(sSLSocket);
        f(sSLSocket);
    }

    public static boolean k(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return l(sSLSocket, f8934g);
    }

    public static boolean l(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (asList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }
}
