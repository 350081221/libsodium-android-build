package a1;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f135a = "pref_trade_token";

    /* renamed from: b, reason: collision with root package name */
    public static final String f136b = ";";

    /* renamed from: c, reason: collision with root package name */
    public static final String f137c = "result={";

    /* renamed from: d, reason: collision with root package name */
    public static final String f138d = "}";

    /* renamed from: e, reason: collision with root package name */
    public static final String f139e = "trade_token=\"";

    /* renamed from: f, reason: collision with root package name */
    public static final String f140f = "\"";

    /* renamed from: g, reason: collision with root package name */
    public static final String f141g = "trade_token=";

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(f136b);
        for (int i5 = 0; i5 < split.length; i5++) {
            if (split[i5].startsWith(f137c) && split[i5].endsWith(f138d)) {
                String[] split2 = split[i5].substring(8, r3.length() - 1).split("&");
                int i6 = 0;
                while (true) {
                    if (i6 >= split2.length) {
                        break;
                    }
                    if (split2[i6].startsWith(f139e) && split2[i6].endsWith("\"")) {
                        str2 = split2[i6].substring(13, r1.length() - 1);
                        break;
                    }
                    if (split2[i6].startsWith(f141g)) {
                        str2 = split2[i6].substring(12);
                        break;
                    }
                    i6++;
                }
            }
        }
        return str2;
    }

    public static String b(y0.a aVar, Context context) {
        String b5 = j.b(aVar, context, f135a, "");
        e.g(k0.a.A, "get trade token: " + b5);
        return b5;
    }

    public static void c(y0.a aVar, Context context, String str) {
        try {
            String a5 = a(str);
            e.g(k0.a.A, "trade token: " + a5);
            if (!TextUtils.isEmpty(a5)) {
                j.e(aVar, context, f135a, a5);
            }
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.I, th);
            e.d(th);
        }
    }
}
