package com.lody.virtual.client.hook.base;

import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ReplaceLastCallingPkgAndLastUserIdMethodProxy extends StaticMethodProxy {
    public ReplaceLastCallingPkgAndLastUserIdMethodProxy(String str) {
        super(str);
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        MethodProxy.replaceLastUserId(objArr);
        MethodParameterUtils.replaceLastAppPkg(objArr);
        return super.beforeCall(obj, method, objArr);
    }
}
