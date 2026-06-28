package x1;

import android.text.TextUtils;
import android.util.Log;
import org.slf4j.d;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22641a = "Anonymizer";

    public static String a(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() <= 1) {
                return d.ANY_MARKER;
            }
            if (str.length() < 8) {
                return d(str, 0, 1);
            }
            return d(str, 0, 4);
        }
        return "";
    }

    public static String b(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() <= 2) {
                return b.b(str, '*');
            }
            if (str.length() >= 11 && str.length() < 20) {
                return d(str, 4, 4);
            }
            return d(str, 6, 4);
        }
        return "";
    }

    public static String c(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (str.length() <= 4) {
            return b.b(str, '*');
        }
        String[] f5 = b.f(str, 4);
        return b.d("", b.e(f5, 0), b.c(b.e(f5, 1), "0123456789", d.ANY_MARKER));
    }

    public static String d(String str, int i5, int i6) {
        int length;
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (str.length() <= i5 + i6) {
            length = str.length() - 1;
            i5 = 1;
        } else {
            length = str.length() - i6;
        }
        String[] g5 = b.g(str, i5, length);
        return b.d("", b.e(g5, 0), b.b(b.e(g5, 1), '*'), b.e(g5, 2));
    }

    public static String e(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (str.length() <= 1) {
            return d.ANY_MARKER;
        }
        int indexOf = str.indexOf(64);
        if (indexOf < 0) {
            String[] f5 = b.f(str, 1);
            return b.d("", b.e(f5, 0), b.b(b.e(f5, 1), '*'));
        }
        String[] h5 = b.h(str, indexOf, indexOf + 1, str.lastIndexOf(46));
        return b.d("", b.b(b.e(h5, 0), '*'), b.e(h5, 1), b.b(b.e(h5, 2), '*'), b.e(h5, 3));
    }

    public static String f(String str) {
        if (str != null && str.length() > 0) {
            return d(str, str.length() - 12, 0);
        }
        return "";
    }

    public static String g(String str) {
        if (str != null && str.length() > 0) {
            return d(str, str.length() - 4, 0);
        }
        return "";
    }

    public static String h(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return b.b(str, '*');
        }
        String[] f5 = b.f(str, lastIndexOf + 1);
        return b.d("", b.e(f5, 0), b.b(b.e(f5, 1), '*'));
    }

    public static String i(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        String[] l5 = b.l(str, ':');
        if (l5.length <= 1) {
            return b.b(str, '*');
        }
        if (l5.length != 8) {
            String[] f5 = b.f(str, str.indexOf(58) + 1);
            return b.d("", b.e(f5, 0), b.c(b.e(f5, 1), "0123456789ABCDEFabcdef", d.ANY_MARKER));
        }
        l5[2] = j(l5[2]);
        for (int i5 = 3; i5 < l5.length; i5++) {
            l5[i5] = b.b(l5[i5], '*');
        }
        return b.d(":", l5);
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f22641a, "maskLower8Bit: s is null");
            return "";
        }
        if (str.length() <= 2) {
            return b.b(str, '*');
        }
        String[] f5 = b.f(str, str.length() - 2);
        return b.d("", b.e(f5, 0), b.b(b.e(f5, 1), '*'));
    }

    public static String k(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int a5 = b.a(str, '-', 2);
        if (a5 < 0) {
            return b.c(str, "0123456789ABCDEFabcdef", d.ANY_MARKER);
        }
        String[] f5 = b.f(str, a5);
        return b.d("", b.e(f5, 0), b.c(b.e(f5, 1), "0123456789ABCDEFabcdef", d.ANY_MARKER));
    }

    public static String l(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() <= 1) {
                return d.ANY_MARKER;
            }
            return d(str, 1, 0);
        }
        return "";
    }

    public static String m(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() <= 2) {
                return b.b(str, '*');
            }
            if (str.length() >= 8 && str.length() < 11) {
                return d(str, 2, 2);
            }
            return d(str, 3, 4);
        }
        return "";
    }
}
