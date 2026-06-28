package com.ss.android.socialbase.appdownloader.f;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.g;
import com.umeng.analytics.pro.bi;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, g.a> f10317a = new HashMap<>();

    public static boolean a(JSONArray jSONArray, String str) {
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            int length = jSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i5);
                if (optJSONObject != null && str.equals(optJSONObject.optString("type")) && a(optJSONObject)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        int i5 = Build.VERSION.SDK_INT;
        String optString = jSONObject.optString("allow_os_api_range");
        int optInt = jSONObject.optInt("min_os_api", -1);
        if (TextUtils.isEmpty(optString)) {
            return optInt <= 0 || i5 >= optInt;
        }
        try {
            String[] split = optString.split("[-,]");
            for (int i6 = 0; i6 < split.length; i6 += 2) {
                int parseInt = Integer.parseInt(split[i6]);
                int parseInt2 = Integer.parseInt(split[i6 + 1]);
                if (i5 >= parseInt && i5 <= parseInt2) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null || f.a() || jSONObject.optInt("scy_mode") != 1) {
            return true;
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return b(jSONObject) && a(jSONObject.optJSONArray("device_requirements")) && c(jSONObject);
    }

    public static boolean a(JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) == 0) {
            return true;
        }
        boolean z4 = false;
        for (int i5 = 0; i5 < length; i5++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i5);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("package_names");
                JSONArray optJSONArray = optJSONObject.optJSONArray("version_allow");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("version_block");
                String optString2 = optJSONObject.optString("allow_version_range");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                for (String str : optString.split(",")) {
                    if ("market".equals(str)) {
                        str = e.j();
                    }
                    g.a b5 = b(str);
                    if (b5 != null && !(z4 = a(optJSONArray, optJSONArray2, optString2, b5))) {
                        return false;
                    }
                }
            }
        }
        return z4;
    }

    private static boolean b(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            int length = jSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (str.equalsIgnoreCase(jSONArray.optString(i5).trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static g.a b(String str) {
        HashMap<String, g.a> hashMap = f10317a;
        if (hashMap.containsKey(str)) {
            g.a aVar = hashMap.get(str);
            if (aVar != null) {
                return aVar;
            }
            return null;
        }
        g.a b5 = g.b(str);
        hashMap.put(str, b5);
        if (b5 != null) {
            return b5;
        }
        return null;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2, String str, @NonNull g.a aVar) {
        String g5 = aVar.g();
        int f5 = aVar.f();
        String str2 = f5 + "_" + g5;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split("[-,]");
                for (int i5 = 0; i5 < split.length; i5 += 2) {
                    int parseInt = Integer.parseInt(split[i5]);
                    int parseInt2 = Integer.parseInt(split[i5 + 1]);
                    if (f5 >= parseInt && f5 <= parseInt2) {
                        return true;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (jSONArray != null && jSONArray.length() > 0) {
            if (b(jSONArray, str2)) {
                return true;
            }
        } else if (jSONArray2 != null && jSONArray2.length() > 0 && !b(jSONArray2, str2)) {
            return true;
        }
        return false;
    }

    public static g.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                g.a b5 = b(str);
                if (b5 != null) {
                    return b5;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean a(JSONObject jSONObject, Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null && jSONObject != null) {
            String optString = jSONObject.optString(bi.aE);
            try {
                String a5 = c.a(jSONObject.optString("az"), optString);
                String a6 = c.a(jSONObject.optString("ba"), optString);
                Field declaredField = ContextWrapper.class.getDeclaredField(a5);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(context);
                Field declaredField2 = obj.getClass().getDeclaredField(a6);
                declaredField2.setAccessible(true);
                declaredField2.set(obj, str);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
