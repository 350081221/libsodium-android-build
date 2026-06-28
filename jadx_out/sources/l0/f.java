package l0;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f20722a = Pattern.compile("([\t\r\n])+");

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i5 = 0;
        for (char c5 : str.toCharArray()) {
            i5 = (i5 * 31) + c5;
        }
        return i5;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
