package a1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f146a = "resultStatus";

    /* renamed from: b, reason: collision with root package name */
    public static final String f147b = "memo";

    /* renamed from: c, reason: collision with root package name */
    public static final String f148c = "result";

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (Throwable th) {
            e.d(th);
        }
        return "?";
    }

    public static Map<String, String> b() {
        g0.c b5 = g0.c.b(g0.c.CANCELED.b());
        HashMap hashMap = new HashMap();
        hashMap.put(f146a, Integer.toString(b5.b()));
        hashMap.put(f147b, b5.a());
        hashMap.put("result", "");
        return hashMap;
    }

    public static Map<String, String> c(String str) {
        String[] split = str.split(i.f136b);
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, e(str2, substring));
        }
        return hashMap;
    }

    public static Map<String, String> d(y0.a aVar, String str) {
        Map<String, String> b5 = b();
        try {
            return c(str);
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.f16167q, th);
            return b5;
        }
    }

    public static String e(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(i.f138d));
    }
}
