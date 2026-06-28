package com.huawei.agconnect.credential.obs;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f7855b = "";

    /* renamed from: c, reason: collision with root package name */
    private static final String f7856c = "move_to_de_records";

    /* renamed from: a, reason: collision with root package name */
    protected SharedPreferences f7857a;

    public e(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("context is null!");
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(f7856c, 0);
        if (!sharedPreferences.getBoolean(str, false)) {
            if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(str, true);
                edit.apply();
            }
            this.f7857a = context.getSharedPreferences(str, 0);
        }
        context = createDeviceProtectedStorageContext;
        this.f7857a = context.getSharedPreferences(str, 0);
    }

    public ContentValues a() {
        Map<String, ?> all;
        Float f5;
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                contentValues.put(key, String.valueOf(value));
            } else if ((value instanceof Integer) || (value instanceof Short) || (value instanceof Byte)) {
                contentValues.put(key, (Integer) value);
            } else if (value instanceof Long) {
                contentValues.put(key, (Long) value);
            } else {
                if (value instanceof Float) {
                    f5 = (Float) value;
                } else if (value instanceof Double) {
                    f5 = Float.valueOf((float) ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    contentValues.put(key, (Boolean) value);
                }
                contentValues.put(key, f5);
            }
        }
        return contentValues;
    }

    public void a(String str, Integer num) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putInt(str, num.intValue()).commit();
    }

    public void a(String str, Long l5) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong(str, l5.longValue()).commit();
    }

    public void a(String str, boolean z4) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putBoolean(str, z4).commit();
    }

    public void a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(ContentValues contentValues) {
        if (this.f7857a == null || contentValues == null) {
            return false;
        }
        boolean z4 = true;
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            if (!a(entry.getKey(), entry.getValue())) {
                z4 = false;
            }
        }
        return z4;
    }

    public boolean a(String str) {
        SharedPreferences sharedPreferences = this.f7857a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    public boolean a(String str, Object obj) {
        float doubleValue;
        int byteValue;
        SharedPreferences.Editor edit = this.f7857a.edit();
        if (obj instanceof String) {
            edit.putString(str, String.valueOf(obj));
        } else {
            if (obj instanceof Integer) {
                byteValue = ((Integer) obj).intValue();
            } else if (obj instanceof Short) {
                byteValue = ((Short) obj).shortValue();
            } else if (obj instanceof Byte) {
                byteValue = ((Byte) obj).byteValue();
            } else if (obj instanceof Long) {
                edit.putLong(str, ((Long) obj).longValue());
            } else {
                if (obj instanceof Float) {
                    doubleValue = ((Float) obj).floatValue();
                } else if (obj instanceof Double) {
                    doubleValue = (float) ((Double) obj).doubleValue();
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                }
                edit.putFloat(str, doubleValue);
            }
            edit.putInt(str, byteValue);
        }
        return edit.commit();
    }

    public boolean a(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return false;
        }
        return edit.putString(str, str2).commit();
    }

    public boolean a(String[] strArr) {
        if (this.f7857a == null) {
            return false;
        }
        for (String str : strArr) {
            if (this.f7857a.contains(str)) {
                this.f7857a.edit().remove(str);
            }
        }
        this.f7857a.edit().commit();
        return true;
    }

    public String b(String str) {
        SharedPreferences sharedPreferences = this.f7857a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    public Map<String, ?> b() {
        SharedPreferences sharedPreferences = this.f7857a;
        return sharedPreferences != null ? sharedPreferences.getAll() : new HashMap();
    }

    public int c(String str) {
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public boolean c() {
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().clear().commit();
        }
        return false;
    }

    public long d(String str) {
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public boolean e(String str) {
        SharedPreferences sharedPreferences = this.f7857a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    public boolean f(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = this.f7857a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (edit = this.f7857a.edit()) == null) {
            return false;
        }
        return edit.remove(str).commit();
    }
}
