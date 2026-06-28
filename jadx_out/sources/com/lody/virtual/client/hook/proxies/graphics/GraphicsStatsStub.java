package com.lody.virtual.client.hook.proxies.graphics;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.view.IGraphicsStats;

/* loaded from: classes3.dex */
public class GraphicsStatsStub extends BinderInvocationProxy {
    public GraphicsStatsStub() {
        super(IGraphicsStats.Stub.asInterface, "graphicsstats");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("requestBufferForProcess"));
    }
}
