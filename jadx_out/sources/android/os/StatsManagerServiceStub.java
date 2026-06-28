package android.os;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.os.IStatsManagerService;

/* loaded from: classes.dex */
public class StatsManagerServiceStub extends BinderInvocationProxy {
    public static final String SERVER_NAME = "statsmanager";

    public StatsManagerServiceStub() {
        super(IStatsManagerService.Stub.asInterface, SERVER_NAME);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("setDataFetchOperation", null));
        addMethodProxy(new ResultStaticMethodProxy("removeDataFetchOperation", null));
        addMethodProxy(new ResultStaticMethodProxy("setActiveConfigsChangedOperation", new long[0]));
        addMethodProxy(new ResultStaticMethodProxy("removeActiveConfigsChangedOperation", null));
        addMethodProxy(new ResultStaticMethodProxy("setBroadcastSubscriber", null));
        addMethodProxy(new ResultStaticMethodProxy("unsetBroadcastSubscriber", null));
        addMethodProxy(new ResultStaticMethodProxy("getRegisteredExperimentIds", new long[0]));
        addMethodProxy(new ResultStaticMethodProxy("getMetadata", new byte[0]));
        addMethodProxy(new ResultStaticMethodProxy("getData", new byte[0]));
        addMethodProxy(new ResultStaticMethodProxy("addConfiguration", null));
        addMethodProxy(new ResultStaticMethodProxy("registerPullAtomCallback", null));
        addMethodProxy(new ResultStaticMethodProxy("unregisterPullAtomCallback", null));
        addMethodProxy(new ResultStaticMethodProxy("removeConfiguration", null));
    }
}
