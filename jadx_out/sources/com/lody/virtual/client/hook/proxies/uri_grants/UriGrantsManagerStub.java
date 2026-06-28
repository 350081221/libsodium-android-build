package com.lody.virtual.client.hook.proxies.uri_grants;

import android.annotation.TargetApi;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.app.IUriGrantsManager;

@TargetApi(29)
/* loaded from: classes3.dex */
public class UriGrantsManagerStub extends BinderInvocationProxy {
    public UriGrantsManagerStub() {
        super(IUriGrantsManager.Stub.asInterface, "uri_grants");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getUriPermissions"));
    }
}
