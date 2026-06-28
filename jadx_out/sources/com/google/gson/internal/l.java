package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class l {
    private static String a(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i5);
                }
                return "MMM d, y";
            }
            return "MMMM d, y";
        }
        return "EEEE, MMMM d, y";
    }

    private static String b(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i5);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String c(int i5) {
        if (i5 != 0 && i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: " + i5);
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat d(int i5) {
        return new SimpleDateFormat(a(i5), Locale.US);
    }

    public static DateFormat e(int i5, int i6) {
        return new SimpleDateFormat(b(i5) + " " + c(i6), Locale.US);
    }
}
