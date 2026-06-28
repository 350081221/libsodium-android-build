package z1;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22729a = "ReflectUtil";

    public static int a(Class<?> cls, String str, int i5) {
        try {
            return cls.getField(str).getInt(null);
        } catch (IllegalAccessException e5) {
            c.d(f22729a, "IllegalAccessException err:" + e5.getMessage());
            return i5;
        } catch (IllegalArgumentException e6) {
            c.d(f22729a, "IllegalArgumentException err:" + e6.getMessage());
            return i5;
        } catch (NoSuchFieldException e7) {
            c.d(f22729a, "NoSuchFieldException err:" + e7.getMessage());
            return i5;
        }
    }

    public static int b(String str, String str2, int i5) {
        try {
            return a(Class.forName(str), str2, i5);
        } catch (Exception e5) {
            c.d(f22729a, "getIntFiled exception" + e5.getMessage());
            return i5;
        }
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e5) {
            c.d(f22729a, "ClassNotFoundException" + e5.getMessage());
            return null;
        } catch (Exception e6) {
            c.d(f22729a, "Exception" + e6.getMessage());
            return null;
        } catch (Throwable th) {
            c.d(f22729a, "Throwable" + th.getMessage());
            return null;
        }
    }

    private static Object d(Class<?> cls, Object obj, String str, Class<?>[] clsArr, Object[] objArr) throws Exception {
        h(cls, clsArr, objArr);
        try {
            try {
                try {
                    try {
                        return cls.getMethod(str, clsArr).invoke(obj, objArr);
                    } catch (IllegalAccessException e5) {
                        c.d(f22729a, "IllegalAccessException" + e5.getMessage());
                        return null;
                    }
                } catch (InvocationTargetException e6) {
                    c.d(f22729a, "InvocationTargetException" + e6.getMessage());
                    return null;
                }
            } catch (IllegalArgumentException e7) {
                c.d(f22729a, "IllegalArgumentException" + e7.getMessage());
                return null;
            }
        } catch (NoSuchMethodException e8) {
            c.d(f22729a, "NoSuchMethodException" + e8.getMessage());
            return null;
        }
    }

    public static Object e(Class<?> cls, String str, Object obj) {
        try {
            return cls.getField(str).get(null);
        } catch (IllegalAccessException e5) {
            c.d(f22729a, "IllegalAccessException" + e5.getMessage());
            return obj;
        } catch (IllegalArgumentException e6) {
            c.d(f22729a, "IllegalArgumentException" + e6.getMessage());
            return obj;
        } catch (NoSuchFieldException e7) {
            c.d(f22729a, "NoSuchFieldException" + e7.getMessage());
            return obj;
        } catch (Exception e8) {
            c.d(f22729a, "Exception" + e8.getMessage());
            return obj;
        }
    }

    public static Object f(String str, String str2, Object obj) {
        try {
            return Class.forName(str).getField(str2).get(null);
        } catch (ClassNotFoundException e5) {
            c.d(f22729a, "ClassNotFoundException" + e5.getMessage());
            return obj;
        } catch (IllegalAccessException e6) {
            c.d(f22729a, "IllegalAccessException" + e6.getMessage());
            return obj;
        } catch (IllegalArgumentException e7) {
            c.d(f22729a, "IllegalArgumentException" + e7.getMessage());
            return obj;
        } catch (NoSuchFieldException e8) {
            c.d(f22729a, "NoSuchMethodException" + e8.getMessage());
            return obj;
        } catch (Exception e9) {
            c.d(f22729a, "Exception" + e9.getMessage());
            return obj;
        }
    }

    public static Object g(String str, String str2, Class<?>[] clsArr, Object[] objArr) throws Exception {
        Class<?> cls = Class.forName(str);
        return d(cls, cls.newInstance(), str2, clsArr, objArr);
    }

    private static void h(Class cls, Class[] clsArr, Object[] objArr) throws Exception {
        if (cls != null) {
            if (clsArr == null) {
                if (objArr != null) {
                    throw new Exception("paramsType is null, but params is not null");
                }
                return;
            } else {
                if (objArr != null) {
                    if (clsArr.length == objArr.length) {
                        return;
                    }
                    throw new Exception("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
                }
                throw new Exception("paramsType or params should be same");
            }
        }
        throw new Exception("class is null in staticFun");
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Object g5 = g("android.os.SystemProperties", "get", new Class[]{String.class}, new Object[]{str});
            if (!(g5 instanceof String)) {
                return null;
            }
            return (String) g5;
        } catch (Exception e5) {
            c.d(f22729a, "getSystemProperties, Excetion." + e5.getMessage());
            return null;
        }
    }
}
