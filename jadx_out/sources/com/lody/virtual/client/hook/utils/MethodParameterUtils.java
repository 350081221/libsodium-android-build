package com.lody.virtual.client.hook.utils;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import mirror.android.content.AttributionSource;
import mirror.android.content.AttributionSourceState;

/* loaded from: classes3.dex */
public class MethodParameterUtils {
    public static void fixAttributionSource(Object[] objArr) {
        if (BuildCompat.isS() && objArr != null) {
            for (Object obj : objArr) {
                if (AttributionSource.TYPE.isInstance(obj)) {
                    ContextFixer.fixAttributionSource(obj, VirtualCore.get().myUid());
                    return;
                }
            }
        }
    }

    public static void fixAttributionSourceState(Object[] objArr) {
        if (BuildCompat.isS() && objArr != null) {
            for (Object obj : objArr) {
                if (AttributionSourceState.TYPE.isInstance(obj)) {
                    ContextFixer.fixAttributionSourceState(obj, VirtualCore.get().myUid());
                    return;
                }
            }
        }
    }

    public static Class<?>[] getAllInterface(Class cls) {
        HashSet hashSet = new HashSet();
        getAllInterfaces(cls, hashSet);
        Class<?>[] clsArr = new Class[hashSet.size()];
        hashSet.toArray(clsArr);
        return clsArr;
    }

    public static void getAllInterfaces(Class cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length != 0) {
            hashSet.addAll(Arrays.asList(interfaces));
        }
        if (cls.getSuperclass() != Object.class) {
            getAllInterfaces(cls.getSuperclass(), hashSet);
        }
    }

    public static List<Method> getAttributionSourceMethod(Class<?> cls) {
        if (!cls.isInterface()) {
            return null;
        }
        Method[] methods = cls.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            int length = parameterTypes.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (parameterTypes[i5].equals(AttributionSource.TYPE)) {
                    arrayList.add(method);
                    break;
                }
                i5++;
            }
        }
        return arrayList;
    }

    public static <T> T getFirstParam(Object[] objArr, Class<T> cls) {
        int indexOfFirst;
        if (objArr == null || (indexOfFirst = ArrayUtils.indexOfFirst(objArr, cls)) == -1) {
            return null;
        }
        return (T) objArr[indexOfFirst];
    }

    public static int getIndex(Object[] objArr, Class<?> cls) {
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj != null && obj.getClass() == cls) {
                return i5;
            }
            if (cls.isInstance(obj)) {
                return i5;
            }
        }
        return -1;
    }

    public static int getParamsIndex(Class[] clsArr, Class<?> cls) {
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            if (clsArr[i5].equals(cls)) {
                return i5;
            }
        }
        return -1;
    }

    public static String replaceFirstAppPkg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj instanceof String) {
                String str = (String) obj;
                if (VirtualCore.get().isAppInstalled(str)) {
                    objArr[i5] = VirtualCore.get().getHostPkg();
                    return str;
                }
            }
        }
        return null;
    }

    public static String replaceLastAppPkg(Object[] objArr) {
        int indexOfLast = ArrayUtils.indexOfLast(objArr, String.class);
        if (indexOfLast != -1) {
            String str = (String) objArr[indexOfLast];
            objArr[indexOfLast] = VirtualCore.get().getHostPkg();
            return str;
        }
        return null;
    }

    public static String replaceSequenceAppPkg(Object[] objArr, int i5) {
        int indexOf = ArrayUtils.indexOf(objArr, String.class, i5);
        if (indexOf != -1) {
            String str = (String) objArr[indexOf];
            objArr[indexOf] = VirtualCore.get().getHostPkg();
            return str;
        }
        return null;
    }
}
