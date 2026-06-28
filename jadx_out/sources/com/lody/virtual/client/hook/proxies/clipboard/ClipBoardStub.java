package com.lody.virtual.client.hook.proxies.clipboard;

import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstCallingPkgAndFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import mirror.RefStaticMethod;
import mirror.RefStaticObject;
import mirror.android.content.ClipboardManager;
import mirror.android.content.ClipboardManagerOreo;

/* loaded from: classes3.dex */
public class ClipBoardStub extends BinderInvocationProxy {
    public ClipBoardStub() {
        super(getInterface(), "clipboard");
    }

    private static IInterface getInterface() {
        RefStaticMethod<IInterface> refStaticMethod = ClipboardManager.getService;
        if (refStaticMethod != null) {
            return refStaticMethod.call(new Object[0]);
        }
        if (ClipboardManagerOreo.mService != null) {
            return ClipboardManagerOreo.mService.get((android.content.ClipboardManager) VirtualCore.get().getContext().getSystemService("clipboard"));
        }
        RefStaticObject<IInterface> refStaticObject = ClipboardManagerOreo.sService;
        if (refStaticObject != null) {
            return refStaticObject.get();
        }
        return null;
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        if (ClipboardManagerOreo.mService != null) {
            ClipboardManagerOreo.mService.set((android.content.ClipboardManager) VirtualCore.get().getContext().getSystemService("clipboard"), getInvocationStub().getProxyInterface());
        } else {
            RefStaticObject<IInterface> refStaticObject = ClipboardManagerOreo.sService;
            if (refStaticObject != null) {
                refStaticObject.set(getInvocationStub().getProxyInterface());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("setPrimaryClip"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("setPrimaryClipAsPackage"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("clearPrimaryClip"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("getPrimaryClip"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("getPrimaryClipDescription"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("hasPrimaryClip"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("addPrimaryClipChangedListener"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("removePrimaryClipChangedListener"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("hasClipboardText"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("getPrimaryClipSource"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("areClipboardAccessNotificationsEnabledForUser"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("setClipboardAccessNotificationsEnabledForUser"));
    }
}
