package com.lody.virtual.client.hook.base;

import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ReplaceSequencePkgMethodProxy extends StaticMethodProxy {
    private int sequence;

    public ReplaceSequencePkgMethodProxy(String str, int i5) {
        super(str);
        this.sequence = i5;
    }

    @Override // com.lody.virtual.client.hook.base.MethodProxy
    public boolean beforeCall(Object obj, Method method, Object... objArr) {
        MethodParameterUtils.replaceSequenceAppPkg(objArr, this.sequence);
        return super.beforeCall(obj, method, objArr);
    }
}
