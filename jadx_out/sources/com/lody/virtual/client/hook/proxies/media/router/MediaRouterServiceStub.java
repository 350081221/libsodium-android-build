package com.lody.virtual.client.hook.proxies.media.router;

import android.annotation.TargetApi;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.media.IMediaRouterService;

@TargetApi(16)
/* loaded from: classes3.dex */
public class MediaRouterServiceStub extends BinderInvocationProxy {
    public MediaRouterServiceStub() {
        super(IMediaRouterService.Stub.asInterface, "media_router");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("registerClientAsUser"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("registerRouter2"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getSystemSessionInfoForPackage"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("registerManager"));
    }
}
