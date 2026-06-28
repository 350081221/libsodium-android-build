package com.lody.virtual.client.hook.proxies.clipboard;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import mirror.android.sec.clipboard.IClipboardService;

/* loaded from: classes3.dex */
public class SemClipBoardStub extends BinderInvocationProxy {
    public SemClipBoardStub() {
        super(IClipboardService.Stub.asInterface, "semclipboard");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("getClipData"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("setClipData"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getClip"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getClips"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("updateClip"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("removeClip"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("addClip"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("removeAll"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("pasteClip"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("addUserChangedListener"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("addClipboardEventListener"));
    }
}
