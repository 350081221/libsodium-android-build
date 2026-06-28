package com.ss.android.socialbase.downloader.i;

import kotlin.text.k0;

/* loaded from: classes3.dex */
public class i {
    public static StringBuilder a(StringBuilder sb, String str) {
        sb.append(k0.f19765b);
        sb.append(str);
        sb.append(k0.f19765b);
        return sb;
    }

    public static StringBuilder b(StringBuilder sb, String[] strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            a(sb, strArr[i5]).append("=?");
            if (i5 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append(k0.f19765b);
        return sb;
    }

    public static StringBuilder a(StringBuilder sb, String[] strArr) {
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

    public static String b(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
        sb.append(k0.f19765b + str + k0.f19765b);
        sb.append(" (");
        a(sb, strArr);
        sb.append(") VALUES (");
        a(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static StringBuilder a(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 < i5 - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static StringBuilder a(StringBuilder sb, String str, String[] strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            a(sb, str, strArr[i5]).append("=?");
            if (i5 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static String a(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(k0.f19765b);
        sb.append(str2);
        sb.append(k0.f19765b);
        sb.append(" (");
        a(sb, strArr);
        sb.append(") VALUES (");
        a(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static String a(String str, String[] strArr) {
        String str2 = k0.f19765b + str + k0.f19765b;
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str2);
        if (strArr != null && strArr.length > 0) {
            sb.append(" WHERE ");
            a(sb, str2, strArr);
        }
        return sb.toString();
    }

    public static String a(String str, String[] strArr, String[] strArr2) {
        String str2 = k0.f19765b + str + k0.f19765b;
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str2);
        sb.append(" SET ");
        b(sb, strArr);
        if (strArr2 != null && strArr2.length > 0) {
            sb.append(" WHERE ");
            a(sb, str2, strArr2);
        }
        return sb.toString();
    }
}
