package com.huawei.hms.framework.common;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public class StringUtils {
    private static final int INIT_CAPACITY = 1024;
    private static boolean IS_AEGIS_STRING_LIBRARY_LOADED = false;
    private static final String SAFE_STRING_PATH = "com.huawei.secure.android.common.util.SafeString";
    private static final String TAG = "StringUtils";

    public static String anonymizeMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i5 = 0; i5 < charArray.length; i5++) {
            if (i5 % 2 != 0) {
                charArray[i5] = '*';
            }
        }
        return new String(charArray);
    }

    public static String byte2Str(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            Logger.w("StringUtils.byte2str error: UnsupportedEncodingException", anonymizeMessage(e5.getMessage()));
            return "";
        }
    }

    private static boolean checkCompatible(String str) {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass(str);
            synchronized (StringUtils.class) {
                IS_AEGIS_STRING_LIBRARY_LOADED = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String collection2String(Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(a1.i.f136b);
            }
            return sb.toString().substring(0, sb.length() - 1);
        }
        return null;
    }

    public static String format(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        return String.format(Locale.ROOT, str, objArr);
    }

    public static byte[] getBytes(long j5) {
        return getBytes(String.valueOf(j5));
    }

    public static String getTraceInfo(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(1024);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append(a1.i.f136b);
        }
        return sb.toString();
    }

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (IS_AEGIS_STRING_LIBRARY_LOADED || checkCompatible(SAFE_STRING_PATH)) {
            try {
                return SafeString.replace(str, charSequence, charSequence2);
            } catch (Throwable unused) {
                Logger.w(TAG, "SafeString.substring error");
            }
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence)) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception unused2) {
                return str;
            }
        }
        return str;
    }

    public static byte[] str2Byte(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            Logger.w("StringUtils.str2Byte error: UnsupportedEncodingException", anonymizeMessage(e5.getMessage()));
            return new byte[0];
        }
    }

    public static boolean strEquals(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public static boolean stringToBoolean(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return z4;
        }
        try {
            return Boolean.valueOf(str).booleanValue();
        } catch (NumberFormatException e5) {
            Logger.w(TAG, "String to Integer catch NumberFormatException." + anonymizeMessage(e5.getMessage()));
            return z4;
        }
    }

    public static int stringToInteger(String str, int i5) {
        if (TextUtils.isEmpty(str)) {
            return i5;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e5) {
            Logger.w(TAG, "String to Integer catch NumberFormatException." + anonymizeMessage(e5.getMessage()));
            return i5;
        }
    }

    public static long stringToLong(String str, long j5) {
        if (TextUtils.isEmpty(str)) {
            return j5;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e5) {
            Logger.w(TAG, "String to Long catch NumberFormatException." + anonymizeMessage(e5.getMessage()));
            return j5;
        }
    }

    public static String substring(String str, int i5) {
        if (checkCompatible(SAFE_STRING_PATH)) {
            try {
                return SafeString.substring(str, i5);
            } catch (Throwable unused) {
                Logger.w(TAG, "SafeString.substring error");
            }
        }
        if (!TextUtils.isEmpty(str) && str.length() >= i5 && i5 >= 0) {
            try {
                return str.substring(i5);
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    public static String toLowerCase(String str) {
        if (str == null) {
            return "";
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static byte[] getBytes(String str) {
        byte[] bArr = new byte[0];
        if (str == null) {
            return bArr;
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Logger.w(TAG, "the content has error while it is converted to bytes");
            return bArr;
        }
    }

    public static String substring(String str, int i5, int i6) {
        if (IS_AEGIS_STRING_LIBRARY_LOADED || checkCompatible(SAFE_STRING_PATH)) {
            try {
                return SafeString.substring(str, i5, i6);
            } catch (Throwable unused) {
                Logger.w(TAG, "SafeString.substring error");
            }
        }
        if (!TextUtils.isEmpty(str) && i5 >= 0 && i6 <= str.length() && i6 >= i5) {
            try {
                return str.substring(i5, i6);
            } catch (Exception unused2) {
            }
        }
        return "";
    }
}
