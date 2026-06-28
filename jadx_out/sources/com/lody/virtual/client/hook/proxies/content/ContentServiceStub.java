package com.lody.virtual.client.hook.proxies.content;

import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.annotations.LogInvocation;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.content.ContentResolver;
import mirror.android.content.IContentService;

@Inject(MethodProxies.class)
@LogInvocation
/* loaded from: classes3.dex */
public class ContentServiceStub extends BinderInvocationProxy {
    private static final String TAG = "ContentServiceStub";

    public ContentServiceStub() {
        super(IContentService.Stub.asInterface, "content");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        ContentResolver.sContentService.set(getInvocationStub().getProxyInterface());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("sync", null));
        addMethodProxy(new ResultStaticMethodProxy("syncAsUser", null));
    }
}
