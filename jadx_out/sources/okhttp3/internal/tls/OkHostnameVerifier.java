package okhttp3.internal.tls;

import com.umeng.analytics.pro.d;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import k0.c;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.f0;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.q1;
import p4.l;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", c.f19042f, d.aC, "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
/* loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;

    @l
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale US = Locale.US;
        l0.o(US, "US");
        String lowerCase = str.toLowerCase(US);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i5) {
        List<String> E;
        Object obj;
        List<String> E2;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                E2 = w.E();
                return E2;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && l0.g(list.get(0), Integer.valueOf(i5)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            E = w.E();
            return E;
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) q1.l(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (l0.g(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @l
    public final List<String> allSubjectAltNames(@l X509Certificate certificate) {
        List<String> A4;
        l0.p(certificate, "certificate");
        A4 = e0.A4(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
        return A4;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@l String host, @l SSLSession session) {
        Certificate certificate;
        l0.p(host, "host");
        l0.p(session, "session");
        if (isAscii(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                l0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(host, (X509Certificate) certificate);
    }

    public final boolean verify(@l String host, @l X509Certificate certificate) {
        l0.p(host, "host");
        l0.p(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        boolean s22;
        boolean J1;
        boolean s23;
        boolean J12;
        boolean J13;
        boolean J14;
        String str3;
        boolean T2;
        boolean s24;
        int o32;
        boolean J15;
        int C3;
        String str4 = str;
        if (!(str4 == null || str.length() == 0)) {
            s22 = kotlin.text.e0.s2(str4, ".", false, 2, null);
            if (!s22) {
                J1 = kotlin.text.e0.J1(str4, "..", false, 2, null);
                if (!J1) {
                    if (!(str2 == null || str2.length() == 0)) {
                        s23 = kotlin.text.e0.s2(str2, ".", false, 2, null);
                        if (!s23) {
                            J12 = kotlin.text.e0.J1(str2, "..", false, 2, null);
                            if (!J12) {
                                J13 = kotlin.text.e0.J1(str4, ".", false, 2, null);
                                if (!J13) {
                                    str4 = str4 + external.org.apache.commons.lang3.d.f15957a;
                                }
                                String str5 = str4;
                                J14 = kotlin.text.e0.J1(str2, ".", false, 2, null);
                                if (J14) {
                                    str3 = str2;
                                } else {
                                    str3 = str2 + external.org.apache.commons.lang3.d.f15957a;
                                }
                                String asciiToLowercase = asciiToLowercase(str3);
                                T2 = f0.T2(asciiToLowercase, org.slf4j.d.ANY_MARKER, false, 2, null);
                                if (!T2) {
                                    return l0.g(str5, asciiToLowercase);
                                }
                                s24 = kotlin.text.e0.s2(asciiToLowercase, "*.", false, 2, null);
                                if (s24) {
                                    o32 = f0.o3(asciiToLowercase, '*', 1, false, 4, null);
                                    if (o32 != -1 || str5.length() < asciiToLowercase.length() || l0.g("*.", asciiToLowercase)) {
                                        return false;
                                    }
                                    String substring = asciiToLowercase.substring(1);
                                    l0.o(substring, "this as java.lang.String).substring(startIndex)");
                                    J15 = kotlin.text.e0.J1(str5, substring, false, 2, null);
                                    if (!J15) {
                                        return false;
                                    }
                                    int length = str5.length() - substring.length();
                                    if (length > 0) {
                                        C3 = f0.C3(str5, external.org.apache.commons.lang3.d.f15957a, length - 1, false, 4, null);
                                        if (C3 != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
