package com.lody.virtual.client.hook.base;

import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class AutoResultStaticMethodProxy extends StaticMethodProxy {
    public AutoResultStaticMethodProxy(String str) {
        super(str);
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public Object call(Object obj, Method method, Object... objArr) throws Throwable {
        return getDefaultValue(obj, method, objArr);
    }

    public Object getDefaultValue(Object obj, Method method, Object... objArr) {
        Class<?> wrapper = Reflect.wrapper(method.getReturnType());
        if (wrapper == null) {
            return 0;
        }
        if (wrapper.isPrimitive()) {
            if (Boolean.class == wrapper) {
                return Boolean.FALSE;
            }
            if (Integer.class == wrapper) {
                return 0;
            }
            if (Long.class == wrapper) {
                return 0L;
            }
            if (Short.class == wrapper) {
                return (short) 0;
            }
            if (Byte.class == wrapper) {
                return (byte) 0;
            }
            if (Double.class == wrapper) {
                return Double.valueOf(0.0d);
            }
            if (Float.class == wrapper) {
                return Float.valueOf(0.0f);
            }
            if (Character.class == wrapper) {
                return (char) 0;
            }
            return null;
        }
        return null;
    }
}
