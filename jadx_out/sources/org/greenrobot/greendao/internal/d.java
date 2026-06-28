package org.greenrobot.greendao.internal;

import kotlin.text.k0;
import kotlin.y1;
import org.greenrobot.greendao.i;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f21381a = "0123456789ABCDEF".toCharArray();

    public static StringBuilder a(StringBuilder sb, String str) {
        sb.append(k0.f19765b);
        sb.append(str);
        sb.append(k0.f19765b);
        return sb;
    }

    public static StringBuilder b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append(k0.f19765b);
        return sb;
    }

    public static StringBuilder c(StringBuilder sb, String str, String[] strArr) {
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            b(sb, str, strArr[i5]);
            if (i5 < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder d(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(k0.f19765b);
            sb.append(strArr[i5]);
            sb.append(k0.f19765b);
            if (i5 < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder e(StringBuilder sb, String str, String[] strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            b(sb, str, strArr[i5]).append("=?");
            if (i5 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder f(StringBuilder sb, String[] strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            a(sb, strArr[i5]).append("=?");
            if (i5 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder g(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 < i5 - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static StringBuilder h(StringBuilder sb, String str, i iVar) {
        if (str != null) {
            sb.append(str);
            sb.append(external.org.apache.commons.lang3.d.f15957a);
        }
        sb.append(k0.f19765b);
        sb.append(iVar.f21360e);
        sb.append(k0.f19765b);
        return sb;
    }

    public static String i(String str) {
        return "SELECT COUNT(*) FROM \"" + str + k0.f19765b;
    }

    public static String j(String str, String[] strArr) {
        String str2 = k0.f19765b + str + k0.f19765b;
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str2);
        if (strArr != null && strArr.length > 0) {
            sb.append(" WHERE ");
            e(sb, str2, strArr);
        }
        return sb.toString();
    }

    public static String k(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(k0.f19765b);
        sb.append(str2);
        sb.append(k0.f19765b);
        sb.append(" (");
        d(sb, strArr);
        sb.append(") VALUES (");
        g(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static String l(String str, String str2, String[] strArr, boolean z4) {
        String str3;
        if (str2 != null && str2.length() >= 0) {
            if (z4) {
                str3 = "SELECT DISTINCT ";
            } else {
                str3 = "SELECT ";
            }
            StringBuilder sb = new StringBuilder(str3);
            c(sb, str2, strArr).append(" FROM ");
            sb.append(k0.f19765b);
            sb.append(str);
            sb.append(k0.f19765b);
            sb.append(' ');
            sb.append(str2);
            sb.append(' ');
            return sb.toString();
        }
        throw new org.greenrobot.greendao.d("Table alias required");
    }

    public static String m(String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT COUNT(*) FROM ");
        sb.append(k0.f19765b);
        sb.append(str);
        sb.append(k0.f19765b);
        sb.append(' ');
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static String n(String str, String[] strArr, String[] strArr2) {
        String str2 = k0.f19765b + str + k0.f19765b;
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str2);
        sb.append(" SET ");
        f(sb, strArr);
        sb.append(" WHERE ");
        e(sb, str2, strArr2);
        return sb.toString();
    }

    public static String o(byte[] bArr) {
        return "X'" + p(bArr) + '\'';
    }

    public static String p(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & y1.f19838d;
            int i7 = i5 * 2;
            char[] cArr2 = f21381a;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }
}
