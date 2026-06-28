package i2;

import com.huawei.secure.android.common.ssl.util.i;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import kotlin.text.k0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16206a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f16207b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", i0.b.f16155k, "or", "org"};
        f16207b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z4) throws SSLException {
        String[] d5 = d(x509Certificate);
        String[] f5 = f(x509Certificate);
        i.b("", "cn is : " + Arrays.toString(d5));
        i.b("", "san is : " + Arrays.toString(f5));
        b(str, d5, f5, z4);
    }

    public static final void b(String str, String[] strArr, String[] strArr2, boolean z4) throws SSLException {
        boolean z5;
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                stringBuffer.append(" <");
                stringBuffer.append(lowerCase2);
                stringBuffer.append(k0.f19769f);
                if (it.hasNext()) {
                    stringBuffer.append(" OR");
                }
                if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1 && c(lowerCase2) && !g(str)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (endsWith && z4) {
                        if (e(lowerCase) == e(lowerCase2)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = endsWith;
                    }
                } else {
                    z6 = lowerCase.equals(lowerCase2);
                }
                if (z6) {
                    break;
                }
            }
            if (z6) {
                return;
            }
            throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
        }
        throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i5 = length - 3;
        if (str.charAt(i5) != '.') {
            return true;
        }
        if (Arrays.binarySearch(f16207b, str.substring(2, i5)) < 0) {
            return true;
        }
        return false;
    }

    public static String[] d(X509Certificate x509Certificate) {
        List<String> e5 = new c(x509Certificate.getSubjectX500Principal()).e("cn");
        if (!e5.isEmpty()) {
            String[] strArr = new String[e5.size()];
            e5.toArray(strArr);
            return strArr;
        }
        return null;
    }

    public static int e(String str) {
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) == '.') {
                i5++;
            }
        }
        return i5;
    }

    public static String[] f(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e5) {
            i.c("", "Error parsing certificate.", e5);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    private static boolean g(String str) {
        return f16206a.matcher(str).matches();
    }
}
