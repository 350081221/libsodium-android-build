package com.lody.virtual.client.hook.base;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ReplaceFirstUserIdMethodProxy extends StaticMethodProxy {
    public ReplaceFirstUserIdMethodProxy(String str) {
        super(str);
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        MethodProxy.replaceFirstUserId(objArr);
        return super.beforeCall(obj, method, objArr);
    }
}
