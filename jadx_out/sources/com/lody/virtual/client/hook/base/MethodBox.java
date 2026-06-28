package com.lody.virtual.client.hook.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class MethodBox {
    public final Object[] args;
    public final Method method;
    public final Object who;

    public MethodBox(Method method, Object obj, Object[] objArr) {
        this.method = method;
        this.who = obj;
        this.args = objArr;
    }

    public <T> T call() throws InvocationTargetException {
        try {
            return (T) this.method.invoke(this.who, this.args);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        }
    }

    public <T> T callSafe() {
        try {
            return (T) this.method.invoke(this.who, this.args);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
