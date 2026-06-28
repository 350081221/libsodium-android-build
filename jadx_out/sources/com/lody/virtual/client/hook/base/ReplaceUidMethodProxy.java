package com.lody.virtual.client.hook.base;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ReplaceUidMethodProxy extends StaticMethodProxy {
    private final int index;

    public ReplaceUidMethodProxy(String str, int i5) {
        super(str);
        this.index = i5;
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        int intValue = ((Integer) objArr[this.index]).intValue();
        if (intValue == MethodProxy.getVUid() || intValue == MethodProxy.getBaseVUid()) {
            objArr[this.index] = Integer.valueOf(MethodProxy.getRealUid());
        }
        return super.beforeCall(obj, method, objArr);
    }
}
