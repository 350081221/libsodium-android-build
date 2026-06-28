package com.lody.virtual.client.hook.proxies.app;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstCallingPkgAndFirstUserIdMethodProxy;
import mirror.android.app.ILocaleManager;

/* loaded from: classes3.dex */
public class LocaleManagerStub extends BinderInvocationProxy {
    public LocaleManagerStub() {
        super(ILocaleManager.Stub.asInterface, "locale");
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("setApplicationLocales"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("getApplicationLocales"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("setOverrideLocaleConfig"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy(" getOverrideLocaleConfig"));
    }
}
