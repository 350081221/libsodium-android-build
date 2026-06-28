package com.lody.virtual.client.hook.base;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ResultStaticMethodProxy extends StaticMethodProxy {
    Object mResult;

    public ResultStaticMethodProxy(String str, Object obj) {
        super(str);
        this.mResult = obj;
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public Object call(Object obj, Method method, Object... objArr) throws Throwable {
        return this.mResult;
    }

    public Object getResult() {
        return this.mResult;
    }
}
