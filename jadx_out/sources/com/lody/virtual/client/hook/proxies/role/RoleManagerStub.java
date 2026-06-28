package com.lody.virtual.client.hook.proxies.role;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.role.IRoleManager;

/* loaded from: classes3.dex */
public class RoleManagerStub extends BinderInvocationProxy {
    public RoleManagerStub() {
        super(IRoleManager.Stub.TYPE, "role");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isRoleHeld"));
    }
}
