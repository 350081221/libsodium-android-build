package com.lody.virtual.client.hook.proxies.oem.vivo;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import mirror.oem.vivo.ISystemDefenceManager;

/* loaded from: classes3.dex */
public class SystemDefenceManagerStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "system_defence_service";

    public SystemDefenceManagerStub() {
        super(ISystemDefenceManager.Stub.TYPE, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstPkgMethodProxy("checkTransitionTimoutErrorDefence"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("checkSkipKilledByRemoveTask"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("checkSmallIconNULLPackage"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("checkDelayUpdate"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("onSetActivityResumed"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("checkReinstallPacakge"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("reportFgCrashData"));
    }
}
