package x1;

/* loaded from: classes3.dex */
public class b {
    public static int a(String str, char c5, int i5) {
        int length = str.length() - 1;
        while (length >= 0 && (str.charAt(length) != c5 || i5 - 1 > 0)) {
            length--;
        }
        return length;
    }

    public static String b(String str, char c5) {
        if (str != null && str.length() > 0) {
            int length = str.length();
            char[] cArr = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr[i5] = c5;
            }
            return new String(cArr);
        }
        return "";
    }

    public static String c(String str, String str2, String str3) {
        char charAt;
        if (str != null && str.length() > 0 && str2.length() > 0 && str3.length() > 0) {
            char[] charArray = str.toCharArray();
            char[] cArr = new char[str.length()];
            char charAt2 = str3.charAt(str3.length() - 1);
            for (int i5 = 0; i5 < charArray.length; i5++) {
                char c5 = charArray[i5];
                int lastIndexOf = str2.lastIndexOf(c5);
                if (lastIndexOf < 0) {
                    cArr[i5] = c5;
                } else {
                    if (lastIndexOf >= str3.length()) {
                        charAt = charAt2;
                    } else {
                        charAt = str3.charAt(lastIndexOf);
                    }
                    cArr[i5] = charAt;
                }
            }
            return new String(cArr);
        }
        return str;
    }

    public static String d(String str, String... strArr) {
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder(strArr[0]);
            for (int i5 = 1; i5 < strArr.length; i5++) {
                if (strArr[i5] != null) {
                    sb.append(str);
                    sb.append(strArr[i5]);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String e(String[] strArr, int i5) {
        if (strArr == null || strArr.length <= 0 || i5 < 0 || i5 >= strArr.length) {
            return "";
        }
        return strArr[i5];
    }

    public static String[] f(String str, int i5) {
        if (str == null) {
            return new String[]{"", ""};
        }
        if (i5 >= 0 && i5 <= str.length()) {
            return new String[]{str.substring(0, i5), str.substring(i5)};
        }
        return new String[]{str, ""};
    }

    public static String[] g(String str, int i5, int i6) {
        String[] f5 = f(str, i5);
        return m(e(f5, 0), f(e(f5, 1), i6 - i5));
    }

    public static String[] h(String str, int i5, int i6, int i7) {
        String[] f5 = f(str, i5);
        return m(e(f5, 0), g(e(f5, 1), i6 - i5, i7 - i5));
    }

    public static String[] i(String str, int... iArr) {
        if (str == null) {
            return new String[]{""};
        }
        if (str.length() > 1 && iArr.length > 0) {
            if (iArr.length <= 1) {
                return f(str, iArr[0]);
            }
            int i5 = iArr[0];
            int length = iArr.length - 1;
            int[] iArr2 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = i6 + 1;
                iArr2[i6] = iArr[i7] - i5;
                i6 = i7;
            }
            String[] f5 = f(str, i5);
            return m(e(f5, 0), i(e(f5, 1), iArr2));
        }
        return new String[]{str};
    }

    public static String[] j(String[] strArr, String str) {
        return k(strArr, new String[]{str});
    }

    public static String[] k(String[] strArr, String[] strArr2) {
        if (strArr.length <= 0) {
            if (strArr2.length <= 0) {
                return new String[0];
            }
            return strArr2;
        }
        if (strArr2.length <= 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static String[] l(String str, char c5) {
        if (str == null) {
            return new String[0];
        }
        if (str.length() <= 0) {
            return new String[]{str};
        }
        int i5 = 1;
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) == c5) {
                i5++;
            }
        }
        if (i5 <= 1) {
            return new String[]{str};
        }
        String[] strArr = new String[i5];
        StringBuilder sb = new StringBuilder(str.length());
        int i7 = 0;
        for (int i8 = 0; i8 < str.length() && i7 < i5; i8++) {
            char charAt = str.charAt(i8);
            if (charAt == c5) {
                strArr[i7] = sb.toString();
                sb.setLength(0);
                i7++;
            } else {
                sb.append(charAt);
            }
        }
        strArr[i7] = sb.toString();
        return strArr;
    }

    public static String[] m(String str, String[] strArr) {
        return k(new String[]{str}, strArr);
    }
}
