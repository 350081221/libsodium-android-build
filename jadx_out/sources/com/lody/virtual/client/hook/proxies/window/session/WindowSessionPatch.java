package com.lody.virtual.client.hook.proxies.window.session;

import android.os.Build;
import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.MethodProxy;
import java.lang.reflect.Method;
import mirror.RefStaticInt;
import mirror.android.view.WindowManagerGlobal;

/* loaded from: classes3.dex */
public class WindowSessionPatch extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
    private static final int ADD_PERMISSION_DENIED;

    /* loaded from: classes3.dex */
    static class AddToDisplay extends BaseMethodProxy {
        public AddToDisplay(String str) {
            super(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (isDrawOverlays() && VirtualCore.getConfig().isDisableDrawOverlays(MethodProxy.getAppPkg())) {
                return Integer.valueOf(WindowSessionPatch.ADD_PERMISSION_DENIED);
            }
            return super.call(obj, method, objArr);
        }
    }

    /* loaded from: classes3.dex */
    static class AddToDisplayAsUser extends BaseMethodProxy {
        public AddToDisplayAsUser(String str) {
            super(str);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (isDrawOverlays() && VirtualCore.getConfig().isDisableDrawOverlays(MethodProxy.getAppPkg())) {
                return Integer.valueOf(WindowSessionPatch.ADD_PERMISSION_DENIED);
            }
            MethodProxy.replaceLastUserId(objArr);
            return super.call(obj, method, objArr);
        }
    }

    static {
        int i5;
        RefStaticInt refStaticInt = WindowManagerGlobal.ADD_PERMISSION_DENIED;
        if (refStaticInt != null) {
            i5 = refStaticInt.get();
        } else {
            i5 = -8;
        }
        ADD_PERMISSION_DENIED = i5;
    }

    public WindowSessionPatch(IInterface iInterface) {
        super(new MethodInvocationStub(iInterface));
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return getInvocationStub().getProxyInterface() != null;
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        addMethodProxy(new BaseMethodProxy("add"));
        addMethodProxy(new AddToDisplayAsUser("addToDisplayAsUser"));
        addMethodProxy(new AddToDisplay("addToDisplay"));
        addMethodProxy(new BaseMethodProxy("addToDisplayWithoutInputChannel"));
        addMethodProxy(new BaseMethodProxy("addWithoutInputChannel"));
        addMethodProxy(new BaseMethodProxy("relayout"));
        if (Build.VERSION.SDK_INT >= 30) {
            addMethodProxy(new BaseMethodProxy("addToDisplayAsUser"));
            addMethodProxy(new BaseMethodProxy("grantInputChannel"));
        }
    }
}
