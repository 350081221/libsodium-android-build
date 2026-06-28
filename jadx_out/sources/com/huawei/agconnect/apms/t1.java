package com.huawei.agconnect.apms;

/* loaded from: classes3.dex */
public class t1 {
    public static final Number abc = Float.valueOf(Float.NaN);
    public static final Boolean bcd = Boolean.FALSE;

    public static Boolean abc(Boolean bool) {
        return bool == null ? bcd : bool;
    }

    public static String abc(String str) {
        return str == null ? "null" : str;
    }

    public static Number abc(Number number) {
        return number == null ? abc : number;
    }

    public static Double abc(Double d5) {
        if (d5.floatValue() <= 2.14748365E9f || d5.longValue() != d5.doubleValue()) {
            return null;
        }
        return Double.valueOf(d5.longValue());
    }
}
