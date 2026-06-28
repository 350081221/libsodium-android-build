package r1;

import external.org.apache.commons.lang3.d;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22302a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    private static final TimeZone f22303b = TimeZone.getTimeZone(f22302a);

    private static boolean a(String str, int i5, char c5) {
        return i5 < str.length() && str.charAt(i5) == c5;
    }

    public static String b(Date date) {
        return d(date, false, f22303b);
    }

    public static String c(Date date, boolean z4) {
        return d(date, z4, f22303b);
    }

    public static String d(Date date, boolean z4, TimeZone timeZone) {
        int i5;
        int i6;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        if (z4) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        int i7 = 19 + i5;
        if (timeZone.getRawOffset() == 0) {
            i6 = 1;
        } else {
            i6 = 6;
        }
        StringBuilder sb = new StringBuilder(i7 + i6);
        f(sb, gregorianCalendar.get(1), 4);
        char c5 = '-';
        sb.append('-');
        f(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        f(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        f(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(13), 2);
        if (z4) {
            sb.append(d.f15957a);
            f(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i8 = offset / 60000;
            int abs = Math.abs(i8 / 60);
            int abs2 = Math.abs(i8 % 60);
            if (offset >= 0) {
                c5 = '+';
            }
            sb.append(c5);
            f(sb, abs, 2);
            sb.append(':');
            f(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int e(String str, int i5) {
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if (charAt >= '0' && charAt <= '9') {
                i5++;
            } else {
                return i5;
            }
        }
        return str.length();
    }

    private static void f(StringBuilder sb, int i5, int i6) {
        String num = Integer.toString(i5);
        for (int length = i6 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:42:0x00c9, B:44:0x00cf, B:46:0x00d6, B:47:0x0183, B:52:0x00e0, B:53:0x00fb, B:54:0x00fc, B:57:0x0118, B:59:0x0125, B:62:0x012e, B:64:0x014d, B:67:0x015c, B:68:0x017e, B:70:0x0181, B:71:0x0107, B:72:0x01b4, B:73:0x01bb, B:74:0x00b0, B:75:0x00b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, NumberFormatException -> 0x01be, IndexOutOfBoundsException -> 0x01c0, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:42:0x00c9, B:44:0x00cf, B:46:0x00d6, B:47:0x0183, B:52:0x00e0, B:53:0x00fb, B:54:0x00fc, B:57:0x0118, B:59:0x0125, B:62:0x012e, B:64:0x014d, B:67:0x015c, B:68:0x017e, B:70:0x0181, B:71:0x0107, B:72:0x01b4, B:73:0x01bb, B:74:0x00b0, B:75:0x00b3), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date g(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a.g(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int h(String str, int i5, int i6) throws NumberFormatException {
        int i7;
        int i8;
        if (i5 >= 0 && i6 <= str.length() && i5 <= i6) {
            if (i5 < i6) {
                i8 = i5 + 1;
                int digit = Character.digit(str.charAt(i5), 10);
                if (digit >= 0) {
                    i7 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i5, i6));
                }
            } else {
                i7 = 0;
                i8 = i5;
            }
            while (i8 < i6) {
                int i9 = i8 + 1;
                int digit2 = Character.digit(str.charAt(i8), 10);
                if (digit2 >= 0) {
                    i7 = (i7 * 10) - digit2;
                    i8 = i9;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i5, i6));
                }
            }
            return -i7;
        }
        throw new NumberFormatException(str);
    }
}
