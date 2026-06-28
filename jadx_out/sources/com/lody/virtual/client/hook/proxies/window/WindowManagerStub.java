package com.lody.virtual.client.hook.proxies.window;

import android.os.IInterface;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import mirror.RefStaticObject;
import mirror.android.view.IWindowManager;
import mirror.android.view.WindowManagerGlobal;
import mirror.com.android.internal.policy.PhoneWindow;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class WindowManagerStub extends BinderInvocationProxy {
    public WindowManagerStub() {
        super(IWindowManager.Stub.asInterface, "window");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        RefStaticObject<IInterface> refStaticObject = WindowManagerGlobal.sWindowManagerService;
        if (refStaticObject != null) {
            refStaticObject.set(getInvocationStub().getProxyInterface());
        }
        if (PhoneWindow.TYPE != null) {
            PhoneWindow.sWindowManager.set(getInvocationStub().getProxyInterface());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("addAppToken"));
        addMethodProxy(new StaticMethodProxy("setScreenCaptureDisabled"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isPackageWaterfallExpanded"));
    }
}
