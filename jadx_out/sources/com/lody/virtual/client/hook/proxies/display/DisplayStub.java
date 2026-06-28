package com.lody.virtual.client.hook.proxies.display;

import android.annotation.TargetApi;
import android.os.IInterface;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.hardware.display.DisplayManagerGlobal;

@TargetApi(17)
/* loaded from: classes3.dex */
public class DisplayStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
    public DisplayStub() {
        super(new MethodInvocationStub(DisplayManagerGlobal.mDm.get(DisplayManagerGlobal.getInstance.call(new Object[0]))));
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        DisplayManagerGlobal.mDm.set(DisplayManagerGlobal.getInstance.call(new Object[0]), getInvocationStub().getProxyInterface());
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        if (DisplayManagerGlobal.mDm.get(DisplayManagerGlobal.getInstance.call(new Object[0])) == getInvocationStub().getProxyInterface()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("createVirtualDisplay"));
    }
}
