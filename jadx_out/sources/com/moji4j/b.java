package com.moji4j;

/* loaded from: classes3.dex */
public class b {
    private static boolean d(char c5) {
        return c5 >= 'a' && c5 <= 'z' && !e(c5);
    }

    private static boolean e(char c5) {
        return c5 == 'a' || c5 == 'i' || c5 == 'u' || c5 == 'e' || c5 == 'o';
    }

    private String f(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i5 = 1; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            char charAt2 = str.charAt(i5 - 1);
            if (charAt == '-' && e(charAt2)) {
                sb.deleteCharAt(i5);
                sb.insert(i5, charAt2);
            }
        }
        return sb.toString();
    }

    private String g(String str, char c5) {
        boolean z4;
        StringBuilder sb = new StringBuilder(str);
        int i5 = 1;
        while (i5 < str.length() - 1) {
            char charAt = str.charAt(i5);
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i6);
            boolean z5 = false;
            if (charAt == charAt2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (charAt == 't' && charAt2 == 'c') {
                z5 = true;
            }
            if (d(charAt) && (z4 || z5)) {
                sb.deleteCharAt(i5);
                sb.insert(i5, c5);
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private String h(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i5 = 1; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            char charAt2 = str.charAt(i5 - 1);
            if (e(charAt) && charAt == charAt2) {
                sb.deleteCharAt(i5);
                sb.insert(i5, (char) 12540);
            }
        }
        return sb.toString();
    }

    private String i(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i5 < str.length() - 1) {
                char charAt = str.charAt(i5);
                int i6 = i5 + 1;
                char charAt2 = str.charAt(i6);
                if (charAt != 12483 && charAt != 12387) {
                    z4 = false;
                }
                if (z4 && d(charAt2)) {
                    if (charAt2 == 'c') {
                        charAt2 = 't';
                    }
                    sb.deleteCharAt(i5);
                    sb.insert(i5, charAt2);
                }
                i5 = i6;
            } else {
                return sb.toString();
            }
        }
    }

    private String j(String str, a aVar) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (i5 < str.length()) {
            int min = Math.min(aVar.d(), str.length() - i5);
            while (true) {
                if (min <= 0) {
                    break;
                }
                String substring = str.substring(i5, i5 + min);
                String b5 = aVar.b(substring);
                if (b5 != null) {
                    sb.append(b5);
                    i5 += substring.length();
                    break;
                }
                if (min == 1) {
                    sb.append(substring);
                    i5++;
                    break;
                }
                min--;
            }
        }
        return sb.toString();
    }

    public String a(String str) {
        return i(f(j(str, a.c())));
    }

    public String b(String str) {
        return j(g(str.toLowerCase(), (char) 12387), a.e());
    }

    public String c(String str) {
        return j(g(h(str.toLowerCase()), (char) 12483), a.f());
    }
}
