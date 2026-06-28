package com.lody.virtual.client.hook.proxies.context_hub;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.helper.compat.BuildCompat;
import java.util.ArrayList;
import mirror.android.hardware.location.IContextHubService;

/* loaded from: classes3.dex */
public class ContextHubServiceStub extends BinderInvocationProxy {
    public ContextHubServiceStub() {
        super(IContextHubService.Stub.asInterface, getServiceName());
    }

    private static String getServiceName() {
        return BuildCompat.isOreo() ? "contexthub" : "contexthub_service";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("registerCallback", 0));
        addMethodProxy(new ResultStaticMethodProxy("getContextHubInfo", null));
        addMethodProxy(new ResultStaticMethodProxy("getContextHubHandles", new int[0]));
        addMethodProxy(new ResultStaticMethodProxy("getContextHubs", new ArrayList()));
        addMethodProxy(new ResultStaticMethodProxy("unloadNanoApp", -1));
        addMethodProxy(new ResultStaticMethodProxy("loadNanoApp", -1));
        addMethodProxy(new ResultStaticMethodProxy("getNanoAppInstanceInfo", null));
        addMethodProxy(new ResultStaticMethodProxy("findNanoAppOnHub", new int[0]));
        addMethodProxy(new ResultStaticMethodProxy("sendMessage", -1));
        addMethodProxy(new ResultStaticMethodProxy("loadNanoAppOnHub", null));
        addMethodProxy(new ResultStaticMethodProxy("unloadNanoAppFromHub", null));
        addMethodProxy(new ResultStaticMethodProxy("enableNanoApp", null));
        addMethodProxy(new ResultStaticMethodProxy("disableNanoApp", null));
        addMethodProxy(new ResultStaticMethodProxy("queryNanoApps", null));
        addMethodProxy(new ResultStaticMethodProxy("createClient", null));
        addMethodProxy(new ResultStaticMethodProxy("createPendingIntentClient", null));
    }
}
