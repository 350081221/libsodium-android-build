package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import kotlin.text.k0;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9046a = "EncodeUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f9047b = {',', external.org.apache.commons.lang3.d.f15957a, '-', '_'};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f9048c = new String[256];

    static {
        for (char c5 = 0; c5 < 255; c5 = (char) (c5 + 1)) {
            if ((c5 >= '0' && c5 <= '9') || ((c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z'))) {
                f9048c[c5] = null;
            } else {
                f9048c[c5] = f(c5).intern();
            }
        }
    }

    private static Character a(n nVar) {
        nVar.f();
        Character h5 = nVar.h();
        if (h5 == null) {
            nVar.m();
            return null;
        }
        if (h5.charValue() != '\\') {
            nVar.m();
            return null;
        }
        Character h6 = nVar.h();
        if (h6 == null) {
            nVar.m();
            return null;
        }
        if (h6.charValue() == 'b') {
            return '\b';
        }
        if (h6.charValue() == 't') {
            return '\t';
        }
        if (h6.charValue() == 'n') {
            return '\n';
        }
        if (h6.charValue() == 'v') {
            return (char) 11;
        }
        if (h6.charValue() == 'f') {
            return '\f';
        }
        if (h6.charValue() == 'r') {
            return Character.valueOf(external.org.apache.commons.lang3.c.f15956c);
        }
        if (h6.charValue() == '\"') {
            return Character.valueOf(k0.f19765b);
        }
        if (h6.charValue() == '\'') {
            return '\'';
        }
        if (h6.charValue() == '\\') {
            return '\\';
        }
        int i5 = 0;
        if (Character.toLowerCase(h6.charValue()) == 'x') {
            StringBuilder sb = new StringBuilder();
            while (i5 < 2) {
                Character i6 = nVar.i();
                if (i6 != null) {
                    sb.append(i6);
                    i5++;
                } else {
                    nVar.m();
                    return null;
                }
            }
            try {
                int parseInt = Integer.parseInt(sb.toString(), 16);
                if (Character.isValidCodePoint(parseInt)) {
                    return Character.valueOf((char) parseInt);
                }
            } catch (NumberFormatException unused) {
                nVar.m();
                return null;
            }
        } else if (Character.toLowerCase(h6.charValue()) == 'u') {
            StringBuilder sb2 = new StringBuilder();
            while (i5 < 4) {
                Character i7 = nVar.i();
                if (i7 != null) {
                    sb2.append(i7);
                    i5++;
                } else {
                    nVar.m();
                    return null;
                }
            }
            try {
                int parseInt2 = Integer.parseInt(sb2.toString(), 16);
                if (Character.isValidCodePoint(parseInt2)) {
                    return Character.valueOf((char) parseInt2);
                }
            } catch (NumberFormatException unused2) {
                nVar.m();
                return null;
            }
        } else if (n.g(h6)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(h6);
            Character h7 = nVar.h();
            if (!n.g(h7)) {
                nVar.a(h7);
            } else {
                sb3.append(h7);
                Character h8 = nVar.h();
                if (!n.g(h8)) {
                    nVar.a(h8);
                } else {
                    sb3.append(h8);
                }
            }
            try {
                int parseInt3 = Integer.parseInt(sb3.toString(), 8);
                if (Character.isValidCodePoint(parseInt3)) {
                    return Character.valueOf((char) parseInt3);
                }
            } catch (NumberFormatException unused3) {
                nVar.m();
                return null;
            }
        }
        return h6;
    }

    private static String b(char c5) {
        if (c5 < 255) {
            return f9048c[c5];
        }
        return f(c5);
    }

    private static String c(char[] cArr, Character ch) {
        if (e(ch.charValue(), cArr)) {
            return "" + ch;
        }
        if (b(ch.charValue()) == null) {
            return "" + ch;
        }
        String hexString = Integer.toHexString(ch.charValue());
        if (ch.charValue() < 256) {
            return "\\x" + "00".substring(hexString.length()) + hexString.toUpperCase(Locale.ENGLISH);
        }
        return "\\u" + "0000".substring(hexString.length()) + hexString.toUpperCase(Locale.ENGLISH);
    }

    private static String d(char[] cArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb.append(c(cArr, Character.valueOf(str.charAt(i5))));
        }
        return sb.toString();
    }

    private static boolean e(char c5, char[] cArr) {
        for (char c6 : cArr) {
            if (c5 == c6) {
                return true;
            }
        }
        return false;
    }

    private static String f(char c5) {
        return Integer.toHexString(c5);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            n nVar = new n(str);
            while (nVar.b()) {
                Character a5 = a(nVar);
                if (a5 != null) {
                    sb.append(a5);
                } else {
                    sb.append(nVar.h());
                }
            }
            return sb.toString();
        } catch (Exception e5) {
            Log.e(f9046a, "decode js: " + e5.getMessage());
            return "";
        }
    }

    public static String h(String str) {
        return i(str, f9047b);
    }

    public static String i(String str, char[] cArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return d(cArr, str);
        } catch (Exception e5) {
            Log.e(f9046a, "encode js: " + e5.getMessage());
            return "";
        }
    }
}
