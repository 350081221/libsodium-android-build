package com.lody.virtual.client.hook.proxies.cross_profile;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.content.pm.ICrossProfileApps;

/* loaded from: classes3.dex */
public class CrossProfileAppsStub extends BinderInvocationProxy {
    public CrossProfileAppsStub() {
        super(ICrossProfileApps.Stub.asInterface, "crossprofileapps");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getTargetUserProfiles"));
        addMethodProxy(new ResultStaticMethodProxy("startActivityAsUser", null));
    }
}
