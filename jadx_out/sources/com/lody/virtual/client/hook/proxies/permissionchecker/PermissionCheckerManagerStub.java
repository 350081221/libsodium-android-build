package com.lody.virtual.client.hook.proxies.permissionchecker;

import android.os.IInterface;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.FixAttributionSourceMethodProxy;
import com.lody.virtual.helper.utils.VLog;
import mirror.android.permission.IPermissionChecker;
import mirror.android.permission.PermissionCheckerManager;

/* loaded from: classes3.dex */
public class PermissionCheckerManagerStub extends BinderInvocationProxy {
    public PermissionCheckerManagerStub() {
        super(IPermissionChecker.Stub.asInterface, "permission_checker");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        try {
            if (PermissionCheckerManager.TYPE != null) {
                IInterface proxyInterface = getInvocationStub().getProxyInterface();
                Object systemService = getContext().getSystemService(PermissionCheckerManager.TYPE);
                if (systemService != null && proxyInterface != null) {
                    PermissionCheckerManager.mService.set(systemService, proxyInterface);
                }
            }
        } catch (Throwable th) {
            VLog.e(VLog.TAG_DEFAULT, "PermissionCheckerManagerStub inject error.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new FixAttributionSourceMethodProxy("checkPermission"));
        addMethodProxy(new FixAttributionSourceMethodProxy("finishDataDelivery"));
        addMethodProxy(new FixAttributionSourceMethodProxy("checkOp"));
    }
}
