package com.lody.virtual.client.hook.proxies.textservices;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import mirror.com.android.internal.textservice.ITextServicesManager;

/* loaded from: classes3.dex */
public class TextServicesManagerServiceStub extends BinderInvocationProxy {
    public TextServicesManagerServiceStub() {
        super(ITextServicesManager.Stub.asInterface, "textservices");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getCurrentSpellChecker"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getCurrentSpellCheckerSubtype"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getSpellCheckerService"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("finishSpellCheckerService"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("isSpellCheckerEnabled"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getEnabledSpellCheckers"));
    }
}
