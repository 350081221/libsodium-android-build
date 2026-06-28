package com.lody.virtual.client.hook.proxies.atm;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.IBinder;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.os.VUserHandle;
import java.lang.reflect.Method;
import mirror.android.app.IActivityTaskManager;
import mirror.android.util.Singleton;

@Inject(MethodProxies.class)
@TargetApi(29)
/* loaded from: classes3.dex */
public class ActivityTaskManagerStub extends BinderInvocationProxy {
    public ActivityTaskManagerStub() {
        super(IActivityTaskManager.Stub.asInterface, "activity_task");
        try {
            Singleton.mInstance.set(Reflect.on("android.app.ActivityTaskManager").field("IActivityTaskManagerSingleton").get(), getInvocationStub().getProxyInterface());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("activityDestroyed") { // from class: com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
                VActivityManager.get().onActivityDestroy((IBinder) objArr[0]);
                return super.afterCall(obj, method, objArr, obj2);
            }
        });
        addMethodProxy(new StaticMethodProxy("activityResumed") { // from class: com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                VActivityManager.get().onActivityResumed((IBinder) objArr[0]);
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new StaticMethodProxy("finishActivity") { // from class: com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub.3
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
        addMethodProxy(new StaticMethodProxy("finishActivityAffinity") { // from class: com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub.4
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return Boolean.valueOf(VActivityManager.get().finishActivityAffinity(MethodProxy.getAppUserId(), (IBinder) objArr[0]));
            }

            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public boolean isEnable() {
                return MethodProxy.isAppProcess();
            }
        });
        String str = "startAppLockService";
        if (BuildCompat.isSamsung()) {
            addMethodProxy(new StaticMethodProxy(str) { // from class: com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub.5
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) {
                    return 0;
                }
            });
        }
        addMethodProxy(new StaticMethodProxy(str) { // from class: com.lody.virtual.client.hook.proxies.atm.ActivityTaskManagerStub.6
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return 0;
            }
        });
    }
}
