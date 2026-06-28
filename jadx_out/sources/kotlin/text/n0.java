package kotlin.text;

import java.util.Locale;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n0 {
    @p4.l
    public static final String a(char c5) {
        String valueOf = String.valueOf(c5);
        kotlin.jvm.internal.l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c5 != 329) {
                char charAt = upperCase.charAt(0);
                kotlin.jvm.internal.l0.n(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String).substring(startIndex)");
                kotlin.jvm.internal.l0.n(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c5));
    }
}
