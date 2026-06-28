package com.lody.virtual.client.hook.base;

import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ReplaceFirstPkgAndFirstUidMethodProxy extends StaticMethodProxy {
    public ReplaceFirstPkgAndFirstUidMethodProxy(String str) {
        super(str);
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        int intValue;
        int index = MethodParameterUtils.getIndex(objArr, Integer.TYPE);
        if (index >= 0 && ((intValue = ((Integer) objArr[index]).intValue()) == MethodProxy.getVUid() || intValue == MethodProxy.getBaseVUid())) {
            objArr[index] = Integer.valueOf(MethodProxy.getRealUid());
        }
        MethodParameterUtils.replaceFirstAppPkg(objArr);
        return super.beforeCall(obj, method, objArr);
    }
}
