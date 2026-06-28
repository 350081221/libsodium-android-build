package com.lody.virtual.client.hook.proxies.app;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.hook.proxies.am.MethodProxies;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.os.VUserHandle;
import java.lang.reflect.Method;
import mirror.RefObject;
import mirror.android.app.ActivityClient;
import mirror.android.util.Singleton;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class ActivityClientControllerStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
    private static IInterface sActivityClientControllerProxy;

    public ActivityClientControllerStub() {
        super(new MethodInvocationStub(ActivityClient.getActivityClientController.call(new Object[0])));
    }

    public static IInterface getProxyInterface() {
        return sActivityClientControllerProxy;
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() {
        if (ActivityClient.INTERFACE_SINGLETON != null) {
            RefObject<IInterface> refObject = ActivityClient.ActivityClientControllerSingleton.mKnownInstance;
            if (refObject != null) {
                refObject.set(ActivityClient.INTERFACE_SINGLETON.get(), getInvocationStub().getProxyInterface());
            }
            Singleton.mInstance.set(ActivityClient.INTERFACE_SINGLETON.get(), getInvocationStub().getProxyInterface());
            sActivityClientControllerProxy = getInvocationStub().getProxyInterface();
        }
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return ActivityClient.getActivityClientController.call(new Object[0]) != getInvocationStub().getProxyInterface();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("activityDestroyed") { // from class: com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
                VActivityManager.get().onActivityDestroy((IBinder) objArr[0]);
                return super.afterCall(obj, method, objArr, obj2);
            }
        });
        addMethodProxy(new StaticMethodProxy("activityResumed") { // from class: com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                VActivityManager.get().onActivityResumed((IBinder) objArr[0]);
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new StaticMethodProxy("finishActivity") { // from class: com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub.3
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                IBinder iBinder = (IBinder) objArr[0];
                Intent intent = (Intent) objArr[2];
                if (intent != null) {
                    objArr[2] = ComponentUtils.processOutsideIntent(VUserHandle.myUserId(), VirtualCore.get().isExtPackage(), intent);
                }
                VActivityManager.get().onFinishActivity(iBinder);
                return super.call(obj, method, objArr);
            }

            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public boolean isEnable() {
                return MethodProxy.isAppProcess();
            }
        });
        addMethodProxy(new StaticMethodProxy("finishActivityAffinity") { // from class: com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub.4
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return Boolean.valueOf(VActivityManager.get().finishActivityAffinity(MethodProxy.getAppUserId(), (IBinder) objArr[0]));
            }

            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public boolean isEnable() {
                return MethodProxy.isAppProcess();
            }
        });
        if (BuildCompat.isSamsung()) {
            addMethodProxy(new StaticMethodProxy("startAppLockService") { // from class: com.lody.virtual.client.hook.proxies.app.ActivityClientControllerStub.5
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) {
                    return 0;
                }
            });
        }
    }
}
