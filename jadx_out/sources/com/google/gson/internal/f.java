package com.google.gson.internal;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7672a = a();

    private f() {
    }

    private static int a() {
        return d(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f7672a;
    }

    static int d(String str) {
        int f5 = f(str);
        if (f5 == -1) {
            f5 = b(str);
        }
        if (f5 == -1) {
            return 6;
        }
        return f5;
    }

    public static boolean e() {
        return f7672a >= 9;
    }

    private static int f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
