package com.yuanqi.group.utils;

import android.content.Context;
import com.yqtech.multiapp.R;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14076a = true;

    public static double a(double d5) {
        if (f14076a) {
            return d5;
        }
        return Double.parseDouble(b(d5));
    }

    public static String b(double d5) {
        if (f14076a) {
            return String.valueOf(d5);
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(6);
        return decimalFormat.format(d5);
    }

    public static double c(double d5) {
        if (f14076a) {
            return d5;
        }
        return Double.parseDouble(d(d5));
    }

    public static String d(double d5) {
        if (f14076a) {
            return String.valueOf(d5);
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(8);
        return decimalFormat.format(d5);
    }

    public static String e(long j5) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        calendar.setTimeInMillis(j5);
        return String.format("%02d:%02d:%02d", Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static String f(long j5) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        calendar.setTimeInMillis(j5);
        return String.format("%02d:%02d", Integer.valueOf((calendar.get(11) * 60) + calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static boolean g(String str) {
        if (str != null && !"".equals(str)) {
            return true;
        }
        return false;
    }

    public static String h(Context context, long j5) {
        Calendar.getInstance(Locale.getDefault()).setTimeInMillis(j5);
        return new SimpleDateFormat("yyyy-MM-dd [" + context.getResources().getStringArray(R.array.weeks)[r0.get(7) - 1] + "] hh:mm").format(Long.valueOf(j5));
    }
}
