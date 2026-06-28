package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.annotation.Result;
import com.huawei.agconnect.https.h;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class JSONDecodeUtil {
    private static Object buildObjByType(Class<?> cls) throws IllegalAccessException, InstantiationException, JSONException {
        if (cls.isInterface()) {
            if (cls.equals(List.class)) {
                cls = ArrayList.class;
            } else if (cls.equals(Set.class)) {
                cls = HashSet.class;
            } else {
                if (!cls.equals(Map.class)) {
                    throw new JSONException("the type of " + cls + "cannot be interface");
                }
                cls = HashMap.class;
            }
        }
        return cls.newInstance();
    }

    public static <T> T getObject(String str, Class<T> cls) throws JSONException, IllegalAccessException, InstantiationException {
        T newInstance = cls.newInstance();
        JSONObject jSONObject = new JSONObject(str);
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (final Field field : declaredFields) {
                    String name = field.getName();
                    if (!jSONObject.has(name) && field.isAnnotationPresent(Result.class)) {
                        name = ((Result) field.getAnnotation(Result.class)).value();
                    }
                    if (jSONObject.has(name)) {
                        if (!field.isAccessible()) {
                            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.adapter.JSONDecodeUtil.1
                                @Override // java.security.PrivilegedAction
                                public Object run() {
                                    field.setAccessible(true);
                                    return null;
                                }
                            });
                        }
                        Object value = getValue(jSONObject.optString(name), field.getGenericType());
                        if (value != null) {
                            field.set(newInstance, value);
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != Object.class);
        return newInstance;
    }

    private static Object getValue(String str, Type type) throws IllegalAccessException, JSONException, InstantiationException {
        if (h.a(str)) {
            return null;
        }
        Class<?> a5 = h.a(type);
        int i5 = 0;
        if (isCollectionType(a5)) {
            Object buildObjByType = buildObjByType(a5);
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            while (i5 < length) {
                ((Collection) buildObjByType).add(getValue(jSONArray.optString(i5), type2));
                i5++;
            }
            return buildObjByType;
        }
        if (isMapType(a5)) {
            Object buildObjByType2 = buildObjByType(a5);
            Type type3 = ((ParameterizedType) type).getActualTypeArguments()[1];
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                ((Map) buildObjByType2).put(next, getValue(jSONObject.optString(next), type3));
            }
            return buildObjByType2;
        }
        if (!a5.isArray()) {
            return getValue2(str, a5);
        }
        Class<?> componentType = a5.getComponentType();
        JSONArray jSONArray2 = new JSONArray(str);
        int length2 = jSONArray2.length();
        Object newInstance = Array.newInstance(componentType, length2);
        while (i5 < length2) {
            Array.set(newInstance, i5, getValue(jSONArray2.optString(i5), componentType));
            i5++;
        }
        return newInstance;
    }

    private static Object getValue2(String str, Type type) throws IllegalAccessException, JSONException, InstantiationException {
        Object valueOf;
        Class<?> a5 = h.a(type);
        if (isIntType(a5)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        try {
            if (isDoubleType(a5)) {
                valueOf = Double.valueOf(Double.parseDouble(str));
            } else {
                if (!isFloat(a5)) {
                    if (isBooleanType(a5)) {
                        return Boolean.valueOf(Boolean.parseBoolean(str));
                    }
                    if (!isLongType(a5)) {
                        return isStringType(a5) ? isNull(str) ? "" : String.valueOf(str) : getObject(str, a5);
                    }
                    try {
                        return Long.valueOf(Long.parseLong(str));
                    } catch (NumberFormatException unused2) {
                        return 0L;
                    }
                }
                valueOf = Float.valueOf(Float.parseFloat(str));
            }
            return valueOf;
        } catch (NumberFormatException unused3) {
            return Double.valueOf(0.0d);
        }
    }

    private static boolean isBooleanType(Class<?> cls) {
        return cls == Boolean.TYPE || cls == Boolean.class;
    }

    private static boolean isCollectionType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }

    private static boolean isDoubleType(Class<?> cls) {
        return cls == Double.TYPE || cls == Double.class;
    }

    private static boolean isFloat(Class<?> cls) {
        return cls == Float.TYPE || cls == Float.class;
    }

    private static boolean isIntType(Class<?> cls) {
        return cls == Integer.TYPE || cls == Integer.class;
    }

    private static boolean isLongType(Class<?> cls) {
        return cls == Long.TYPE || cls == Long.class;
    }

    private static boolean isMapType(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }

    private static boolean isNull(String str) {
        return "null".equals(str) || h.a(str);
    }

    private static boolean isStringType(Class<?> cls) {
        return cls == String.class;
    }
}
