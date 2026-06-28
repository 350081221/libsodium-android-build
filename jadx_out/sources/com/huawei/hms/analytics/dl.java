package com.huawei.hms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import java.io.File;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes3.dex */
public final class dl {
    private static SharedPreferences hij(Context context, String str) {
        return context.getSharedPreferences(lmn(context, str), 0);
    }

    public static boolean ijk(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            HiLog.w("SharedPreToolsKit", "deleteSPFile(): spName is empty,or context is null");
            return false;
        }
        File file = new File(context.getFilesDir(), "../shared_prefs/" + str + ".xml");
        return file.exists() && file.delete();
    }

    public static long ikl(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            HiLog.w("SharedPreToolsKit", "deleteSPFile(): spName is empty,or context is null");
            return -1L;
        }
        return new File(context.getFilesDir(), "../shared_prefs/" + str + ".xml").length();
    }

    public static int klm(Context context, String str, String str2, int i5) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.w("SharedPreToolsKit", "context is null or spName empty or spkey is empty");
            return i5;
        }
        SharedPreferences hij = hij(context, str);
        return hij != null ? hij.getInt(str2, i5) : i5;
    }

    public static long klm(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return -1L;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            return hij.getLong(str2, -1L);
        }
        return -1L;
    }

    public static String klm(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences hij = hij(context, str);
        return hij != null ? hij.getString(str2, str3) : str3;
    }

    public static Map<String, ?> klm(Context context, String str) {
        return hij(context, str).getAll();
    }

    public static boolean klm(Context context, String str, String str2, boolean z4) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return z4;
        }
        SharedPreferences hij = hij(context, str);
        return hij != null ? hij.getBoolean(str2, z4) : z4;
    }

    public static String lmn(Context context, String str) {
        return "openness_" + str + "_" + context.getPackageName();
    }

    public static void lmn(Context context, String str, String str2, int i5) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.w("SharedPreToolsKit", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            SharedPreferences.Editor edit = hij.edit();
            edit.putInt(str2, i5);
            edit.commit();
        }
    }

    public static void lmn(Context context, String str, String str2, long j5) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            SharedPreferences.Editor edit = hij.edit();
            edit.putLong(str2, j5);
            edit.commit();
        }
    }

    public static void lmn(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            SharedPreferences.Editor edit = hij.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static void lmn(Context context, String str, String str2, boolean z4) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            SharedPreferences.Editor edit = hij.edit();
            edit.putBoolean(str2, z4);
            edit.commit();
        }
    }

    public static void lmn(Context context, String str, Object... objArr) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "context is null or spName empty";
        } else {
            if (objArr.length != 0 && objArr.length % 2 != 1) {
                SharedPreferences hij = hij(context, str);
                if (hij != null) {
                    SharedPreferences.Editor edit = hij.edit();
                    int i5 = 0;
                    while (i5 < objArr.length) {
                        Object obj = objArr[i5];
                        int i6 = i5 + 1;
                        if (obj instanceof String) {
                            Object obj2 = objArr[i6];
                            if (obj2 instanceof String) {
                                edit.putString((String) obj, (String) obj2);
                            } else if (obj2 instanceof Integer) {
                                edit.putInt((String) obj, ((Integer) obj2).intValue());
                            } else if (obj2 instanceof Long) {
                                edit.putLong((String) obj, ((Long) obj2).longValue());
                            } else if (obj2 instanceof Boolean) {
                                edit.putBoolean((String) obj, ((Boolean) obj2).booleanValue());
                            }
                        }
                        i5 = i6 + 1;
                    }
                    edit.commit();
                    return;
                }
                return;
            }
            str2 = "putInfos: objects parameter error";
        }
        HiLog.w("SharedPreToolsKit", str2);
    }

    public static void lmn(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            HiLog.w("SharedPreToolsKit", "clearData(): parameter error.context,spname");
            return;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            SharedPreferences.Editor edit = hij.edit();
            if (strArr.length == 0) {
                edit.clear();
                edit.commit();
                return;
            }
            boolean z4 = false;
            for (String str2 : strArr) {
                if (hij.contains(str2)) {
                    edit.remove(str2);
                    z4 = true;
                }
            }
            if (z4) {
                edit.commit();
            }
        }
    }

    public static boolean lmn(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HiLog.e("SharedPreToolsKit", HiLog.ErrorCode.PE001, "context is null or spName empty or spkey is empty");
            return false;
        }
        SharedPreferences hij = hij(context, str);
        if (hij != null) {
            return hij.contains(str2);
        }
        return false;
    }
}
