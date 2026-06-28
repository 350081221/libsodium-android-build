package com.lody.virtual.client.hook.proxies.oem.vivo;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import mirror.oem.vivo.IPhysicalFlingManagerStub;

/* loaded from: classes3.dex */
public class PhysicalFlingManagerStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "physical_fling_service";

    public PhysicalFlingManagerStub() {
        super(IPhysicalFlingManagerStub.Stub.TYPE, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstPkgMethodProxy("isSupportPhysicalFling"));
    }
}
