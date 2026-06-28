package com.lody.virtual.client.hook.proxies.content.integrity;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.helper.compat.ParceledListSliceCompat;
import java.util.Collections;
import mirror.android.content.integrity.IAppIntegrityManager;

/* loaded from: classes3.dex */
public class AppIntegrityManagerStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "app_integrity";

    public AppIntegrityManagerStub() {
        super(IAppIntegrityManager.Stub.asInterface, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("updateRuleSet", null));
        addMethodProxy(new ResultStaticMethodProxy("getCurrentRuleSetVersion", ""));
        addMethodProxy(new ResultStaticMethodProxy("getCurrentRuleSetProvider", ""));
        addMethodProxy(new ResultStaticMethodProxy("getCurrentRules", ParceledListSliceCompat.create(Collections.emptyList())));
        addMethodProxy(new ResultStaticMethodProxy("getWhitelistedRuleProviders", Collections.emptyList()));
    }
}
