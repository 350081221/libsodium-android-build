package com.umeng.umcrash;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.SharedLibraryInfo;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.uc.crashsdk.export.CrashApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes3.dex */
public class UMCrashUtils {
    private static final int DEF_CLOSE_RATE = 0;
    private static final int MAX_TRACE_RATE = 100;
    public static final String UNKNOW = "";

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String[] getActiveUser(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.utils.UMUtils");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getActiveUser", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke == null) {
                return null;
            }
            return (String[]) invoke;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static int getInnerConfig(Context context, String str, int i5) {
        SharedPreferences sharedPreferences;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) != null) {
                    return sharedPreferences.getInt(str, i5);
                }
                return i5;
            } catch (Throwable th) {
                th.printStackTrace();
                return i5;
            }
        }
        return i5;
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static boolean isHarmony(final Context context) {
        final SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0);
        } catch (Throwable unused) {
        }
        if (sharedPreferences.contains("um_apm_harmony")) {
            return sharedPreferences.getBoolean("um_apm_harmony", false);
        }
        WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrashUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    sharedPreferences.edit().putBoolean("um_apm_harmony", context.getString(Resources.getSystem().getIdentifier("config_os_brand", TypedValues.Custom.S_STRING, SharedLibraryInfo.PLATFORM_PACKAGE_NAME)).equals("harmony")).apply();
                } catch (Throwable unused2) {
                }
            }
        });
        return false;
    }

    public static boolean random(int i5) {
        if (i5 == 0) {
            return false;
        }
        if (i5 != 100 && new Random().nextInt(100) > i5) {
            return false;
        }
        return true;
    }

    public static void saveInnerConfig(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && obj != null && (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) != null && (edit = sharedPreferences.edit()) != null) {
                    edit.putInt(str, Integer.parseInt(obj.toString()));
                    edit.commit();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void setCommonTag(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.UMConfigure");
            Class<?> cls2 = Class.forName("com.umeng.commonsdk.UMConfigure$BS_TYPE");
            Method declaredMethod = cls.getDeclaredMethod("setModuleTag", cls2, String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                for (Enum r9 : (Enum[]) cls2.getEnumConstants()) {
                    if (r9 != null && r9.name().equals("APM")) {
                        declaredMethod.invoke(cls, r9, str, str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setIntegrationTesingParams(String str) {
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().addHeaderInfo("um_dk", str);
        }
        if (UMCrash.getReporter() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("um_dk", str);
            UMCrash.getReporter().addPublicParams(hashMap);
        }
    }

    public static void setPuidAndProvider(String str, String str2) {
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PUID, str);
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PROVIDER, str2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMCrash.KEY_HEADER_PUID, str);
        hashMap.put(UMCrash.KEY_HEADER_PROVIDER, str2);
        if (UMCrash.getReporter() != null) {
            UMCrash.getReporter().addPublicParams(hashMap);
        }
    }

    public static String splitByByte(String str, int i5) {
        StringBuffer stringBuffer = new StringBuffer(i5);
        try {
            int length = str.length();
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                String valueOf = String.valueOf(str.charAt(i7));
                i6 += valueOf.getBytes().length;
                if (i5 < i6) {
                    break;
                }
                stringBuffer.append(valueOf);
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
