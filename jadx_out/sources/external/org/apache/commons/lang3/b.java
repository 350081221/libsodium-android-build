package external.org.apache.commons.lang3;

/* loaded from: classes3.dex */
public class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, int i5, int i6) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i5, i6);
        }
        int length = charSequence.length();
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < length) {
            if (charSequence.charAt(i6) == i5) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(CharSequence charSequence, CharSequence charSequence2, int i5) {
        return charSequence.toString().indexOf(charSequence2.toString(), i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(CharSequence charSequence, int i5, int i6) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i5, i6);
        }
        int length = charSequence.length();
        if (i6 < 0) {
            return -1;
        }
        if (i6 >= length) {
            i6 = length - 1;
        }
        while (i6 >= 0) {
            if (charSequence.charAt(i6) == i5) {
                return i6;
            }
            i6--;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(CharSequence charSequence, CharSequence charSequence2, int i5) {
        return charSequence.toString().lastIndexOf(charSequence2.toString(), i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(CharSequence charSequence, boolean z4, int i5, CharSequence charSequence2, int i6, int i7) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z4, i5, (String) charSequence2, i6, i7);
        }
        return charSequence.toString().regionMatches(z4, i5, charSequence2.toString(), i6, i7);
    }

    public static CharSequence f(CharSequence charSequence, int i5) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i5, charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char[] g(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i5 = 0; i5 < length; i5++) {
            cArr[i5] = charSequence.charAt(i5);
        }
        return cArr;
    }
}
