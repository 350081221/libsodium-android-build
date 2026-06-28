package com.lody.virtual.client.hook.proxies.dropbox;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.os.DropBoxManager;
import mirror.com.android.internal.os.IDropBoxManagerService;

/* loaded from: classes3.dex */
public class DropBoxManagerStub extends BinderInvocationProxy {
    public DropBoxManagerStub() {
        super(IDropBoxManagerService.Stub.asInterface, "dropbox");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        try {
            DropBoxManager.mService.set((android.os.DropBoxManager) VirtualCore.get().getContext().getSystemService("dropbox"), getInvocationStub().getProxyInterface());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("getNextEntry", null));
        addMethodProxy(new ResultStaticMethodProxy("getNextEntryWithAttribution", null));
    }
}
