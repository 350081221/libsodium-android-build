package com.lody.virtual.client.hook.proxies.input;

import android.annotation.TargetApi;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUserIdMethodProxy;
import mirror.com.android.internal.view.inputmethod.InputMethodManager;

@Inject(MethodProxies.class)
@TargetApi(16)
/* loaded from: classes3.dex */
public class InputMethodManagerStub extends BinderInvocationProxy {
    public InputMethodManagerStub() {
        super(InputMethodManager.mService.get(VirtualCore.get().getContext().getSystemService("input_method")), "input_method");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        InputMethodManager.mService.set(getContext().getSystemService("input_method"), getInvocationStub().getProxyInterface());
        getInvocationStub().replaceService("input_method");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        if (InputMethodManager.mService.get(getContext().getSystemService("input_method")) != getInvocationStub().getBaseInterface()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getInputMethodList"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getEnabledInputMethodList"));
    }
}
