package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import kotlin.y1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9051a = "";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9052b = "HexUtil";

    private c() {
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e5) {
            Log.e(f9052b, "byte array 2 hex string UnsupportedEncodingException : " + e5.getMessage());
            return "";
        } catch (Exception e6) {
            Log.e(f9052b, "byte array 2 hex string exception : " + e6.getMessage());
            return "";
        }
    }

    public static String b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (byte b5 : bArr) {
                String hexString = Integer.toHexString(b5 & y1.f19838d);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return "";
    }

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes("UTF-8");
            for (int i5 = 0; i5 < length; i5++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i6 = i5 * 2;
                sb.append(new String(new byte[]{bytes[i6]}, "UTF-8"));
                bArr[i5] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i6 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException e5) {
            e = e5;
            Log.e(f9052b, "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (NumberFormatException e6) {
            e = e6;
            Log.e(f9052b, "hex string 2 byte UnsupportedEncodingException or NumberFormatException : " + e.getMessage());
        } catch (Exception e7) {
            Log.e(f9052b, "byte array 2 hex string exception : " + e7.getMessage());
        }
        return bArr;
    }
}
