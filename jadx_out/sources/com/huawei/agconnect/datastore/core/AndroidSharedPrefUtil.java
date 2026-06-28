package com.huawei.agconnect.datastore.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import java.util.Map;

/* loaded from: classes3.dex */
public class AndroidSharedPrefUtil {
    private static AndroidSharedPrefUtil INSTANCE = new AndroidSharedPrefUtil();
    private static final String TAG = "AndroidSharedPrefUtil";
    private static Context context;

    private AndroidSharedPrefUtil() {
    }

    public static synchronized Object get(String str, String str2, Class<?> cls, Object obj, Class<?> cls2) {
        synchronized (AndroidSharedPrefUtil.class) {
            ICrypto helper = CryptoUtil.getHelper(cls2);
            Context context2 = context;
            if (context2 == null) {
                Log.e(TAG, "context is `null`, please call ` AGConnectInstance.initialize()` first");
                return null;
            }
            SharedPreferences sharedPreferences = context2.getSharedPreferences(str, 0);
            if (sharedPreferences == null) {
                Log.e(TAG, "sp is null");
                return obj;
            }
            try {
                return Integer.class.equals(cls) ? Integer.valueOf(getInt(sharedPreferences, str2, helper, obj)) : Long.class.equals(cls) ? Long.valueOf(getLong(sharedPreferences, str2, helper, obj)) : Float.class.equals(cls) ? Float.valueOf(getFloat(sharedPreferences, str2, helper, obj)) : Boolean.class.equals(cls) ? Boolean.valueOf(getBoolean(sharedPreferences, str2, helper, obj)) : String.class.equals(cls) ? getString(sharedPreferences, str2, helper, obj) : getObject(sharedPreferences, str2, helper, obj, cls);
            } catch (ClassCastException e5) {
                Log.e(TAG, "save type error for key :" + str2, e5);
                return obj;
            }
        }
    }

    public static Map<String, ?> getAll(String str) {
        Context context2 = context;
        if (context2 != null) {
            return context2.getSharedPreferences(str, 0).getAll();
        }
        Log.e(TAG, "context is `null`, please call ` AGConnectInstance.initialize()` first");
        return null;
    }

    private static boolean getBoolean(SharedPreferences sharedPreferences, String str, ICrypto iCrypto, Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (iCrypto == null) {
            return sharedPreferences.getBoolean(str, booleanValue);
        }
        try {
            return Boolean.parseBoolean(iCrypto.decrypt(sharedPreferences.getString(str, String.valueOf(booleanValue))));
        } catch (NumberFormatException unused) {
            return booleanValue;
        }
    }

    private static float getFloat(SharedPreferences sharedPreferences, String str, ICrypto iCrypto, Object obj) {
        if (obj == null) {
            obj = Float.valueOf(Float.NaN);
        }
        float floatValue = ((Float) obj).floatValue();
        if (iCrypto == null) {
            return sharedPreferences.getFloat(str, floatValue);
        }
        try {
            return Float.parseFloat(iCrypto.decrypt(sharedPreferences.getString(str, String.valueOf(floatValue))));
        } catch (NumberFormatException unused) {
            return floatValue;
        }
    }

    private static int getInt(SharedPreferences sharedPreferences, String str, ICrypto iCrypto, Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (iCrypto == null) {
            return sharedPreferences.getInt(str, intValue);
        }
        try {
            return Integer.parseInt(iCrypto.decrypt(sharedPreferences.getString(str, String.valueOf(intValue))));
        } catch (NumberFormatException unused) {
            return intValue;
        }
    }

    private static long getLong(SharedPreferences sharedPreferences, String str, ICrypto iCrypto, Object obj) {
        if (obj == null) {
            obj = 0L;
        }
        long longValue = ((Long) obj).longValue();
        if (iCrypto == null) {
            return sharedPreferences.getLong(str, longValue);
        }
        try {
            return Long.parseLong(iCrypto.decrypt(sharedPreferences.getString(str, String.valueOf(longValue))));
        } catch (NumberFormatException unused) {
            return longValue;
        }
    }

    private static Object getObject(SharedPreferences sharedPreferences, String str, ICrypto iCrypto, Object obj, Class<?> cls) {
        StringBuilder sb;
        String str2;
        if (!Parcelable.class.isAssignableFrom(cls)) {
            Log.e(TAG, "Only Support Parcelable Object");
            return obj;
        }
        try {
            return ParcelableSerializer.deserializeFromString(getString(sharedPreferences, str, iCrypto, null), (Parcelable.Creator) cls.getField("CREATOR").get(null));
        } catch (IllegalAccessException unused) {
            sb = new StringBuilder();
            str2 = "IllegalAccessException:";
            sb.append(str2);
            sb.append(cls);
            Log.e(TAG, sb.toString());
            return obj;
        } catch (NoSuchFieldException unused2) {
            sb = new StringBuilder();
            str2 = "NoSuchFieldException:";
            sb.append(str2);
            sb.append(cls);
            Log.e(TAG, sb.toString());
            return obj;
        }
    }

    private static String getString(SharedPreferences sharedPreferences, String str, ICrypto iCrypto, Object obj) {
        if (obj == null) {
            obj = "";
        }
        String string = sharedPreferences.getString(str, (String) obj);
        return iCrypto != null ? iCrypto.decrypt(string) : string;
    }

    public static synchronized void init(Object obj) {
        synchronized (AndroidSharedPrefUtil.class) {
            if (obj instanceof Context) {
                Context applicationContext = ((Context) obj).getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = (Context) obj;
                }
                context = applicationContext;
            }
        }
    }

    public static synchronized void put(String str, String str2, Class<?> cls, Object obj, Class<?> cls2) {
        synchronized (AndroidSharedPrefUtil.class) {
            ICrypto helper = CryptoUtil.getHelper(cls2);
            Context context2 = context;
            if (context2 == null) {
                Log.e(TAG, "context is `null`, please call ` AGConnectInstance.initialize()` first");
                return;
            }
            SharedPreferences.Editor edit = context2.getSharedPreferences(str, 0).edit();
            if (obj != null && edit != null) {
                if (Integer.class.equals(cls)) {
                    putInt(edit, helper, str2, ((Integer) obj).intValue());
                } else if (Long.class.equals(cls)) {
                    putLong(edit, helper, str2, ((Long) obj).longValue());
                } else if (Float.class.equals(cls)) {
                    putFloat(edit, helper, str2, ((Float) obj).floatValue());
                } else if (Boolean.class.equals(cls)) {
                    putBoolean(edit, helper, str2, ((Boolean) obj).booleanValue());
                } else if (String.class.equals(cls)) {
                    putString(edit, helper, str2, (String) obj);
                } else {
                    putObject(edit, helper, str2, obj);
                }
                edit.commit();
                return;
            }
            Log.e(TAG, "value or editor is null");
        }
    }

    private static void putBoolean(SharedPreferences.Editor editor, ICrypto iCrypto, String str, boolean z4) {
        if (iCrypto != null) {
            editor.putString(str, iCrypto.encrypt(String.valueOf(z4)));
        } else {
            editor.putBoolean(str, z4);
        }
    }

    private static void putFloat(SharedPreferences.Editor editor, ICrypto iCrypto, String str, float f5) {
        if (iCrypto != null) {
            editor.putString(str, iCrypto.encrypt(String.valueOf(f5)));
        } else {
            editor.putFloat(str, f5);
        }
    }

    private static void putInt(SharedPreferences.Editor editor, ICrypto iCrypto, String str, int i5) {
        if (iCrypto != null) {
            editor.putString(str, iCrypto.encrypt(String.valueOf(i5)));
        } else {
            editor.putInt(str, i5);
        }
    }

    private static void putLong(SharedPreferences.Editor editor, ICrypto iCrypto, String str, long j5) {
        if (iCrypto != null) {
            editor.putString(str, iCrypto.encrypt(String.valueOf(j5)));
        } else {
            editor.putLong(str, j5);
        }
    }

    private static void putObject(SharedPreferences.Editor editor, ICrypto iCrypto, String str, Object obj) {
        if (!Parcelable.class.isAssignableFrom(obj.getClass())) {
            Log.e(TAG, "Only Support Parcelable Object");
            return;
        }
        String serializeToString = ParcelableSerializer.serializeToString((Parcelable) obj);
        if (iCrypto != null) {
            editor.putString(str, iCrypto.encrypt(serializeToString));
        } else {
            editor.putString(str, serializeToString);
        }
    }

    private static void putString(SharedPreferences.Editor editor, ICrypto iCrypto, String str, String str2) {
        if (iCrypto != null) {
            editor.putString(str, iCrypto.encrypt(str2));
        } else {
            editor.putString(str, str2);
        }
    }

    public static void remove(String str, String str2) {
        Context context2 = context;
        if (context2 == null) {
            Log.e(TAG, "context is `null`, please call ` AGConnectInstance.initialize()` first");
        } else {
            context2.getSharedPreferences(str, 0).edit().remove(str2).commit();
        }
    }
}
