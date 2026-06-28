package com.lody.virtual.client.hook.base;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ReplaceSpecPkgMethodProxy extends StaticMethodProxy {
    private int index;

    public ReplaceSpecPkgMethodProxy(String str, int i5) {
        super(str);
        this.index = i5;
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        if (objArr != null) {
            int i5 = this.index;
            if (i5 < 0) {
                i5 += objArr.length;
            }
            if (i5 >= 0 && i5 < objArr.length && (objArr[i5] instanceof String)) {
                objArr[i5] = MethodProxy.getHostPkg();
            }
        }
        return super.beforeCall(obj, method, objArr);
    }
}
