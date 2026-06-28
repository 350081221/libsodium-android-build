package com.lody.virtual.client.hook.base;

import android.os.IInterface;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes3.dex */
public abstract class ResultBinderMethodProxy extends StaticMethodProxy {
    public ResultBinderMethodProxy(String str) {
        super(str);
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public Object call(Object obj, Method method, Object... objArr) throws Throwable {
        IInterface iInterface = (IInterface) super.call(obj, method, objArr);
        if (iInterface == null) {
            return null;
        }
        return newProxyInstance(iInterface, createProxy(iInterface));
    }

    public abstract InvocationHandler createProxy(IInterface iInterface);

    public Object newProxyInstance(IInterface iInterface, InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(iInterface.getClass().getClassLoader(), iInterface.getClass().getInterfaces(), invocationHandler);
    }
}
