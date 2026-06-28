package com.lody.virtual.client.hook.proxies.appops;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.oem.IFlymePermissionService;

/* loaded from: classes3.dex */
public class FlymePermissionServiceStub extends BinderInvocationProxy {
    public FlymePermissionServiceStub() {
        super(IFlymePermissionService.Stub.TYPE, "flyme_permission");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("noteIntentOperation"));
    }
}
