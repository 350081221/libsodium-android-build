package com.lody.virtual.client.hook.proxies.am;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationStub;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.os.VUserHandle;
import java.lang.reflect.Method;
import mirror.android.app.ActivityManagerNative;
import mirror.android.app.ActivityManagerOreo;
import mirror.android.app.IActivityManager;
import mirror.android.os.ServiceManager;
import mirror.android.util.Singleton;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class ActivityManagerStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {

    /* loaded from: classes3.dex */
    public static class GetUidProcessState extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return 230;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getUidProcessState";
        }
    }

    /* loaded from: classes3.dex */
    public static class IsUidActive extends MethodProxy {
        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (VUserHandle.isApp(((Integer) MethodParameterUtils.getFirstParam(objArr, Integer.TYPE)).intValue())) {
                return Boolean.TRUE;
            }
            MethodParameterUtils.replaceFirstAppPkg(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isUidActive";
        }
    }

    public ActivityManagerStub() {
        super(new MethodInvocationStub(ActivityManagerNative.getDefault.call(new Object[0])));
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() {
        if (BuildCompat.isOreo()) {
            Singleton.mInstance.set(ActivityManagerOreo.IActivityManagerSingleton.get(), getInvocationStub().getProxyInterface());
        } else if (ActivityManagerNative.gDefault.type() == IActivityManager.TYPE) {
            ActivityManagerNative.gDefault.set(getInvocationStub().getProxyInterface());
        } else if (ActivityManagerNative.gDefault.type() == Singleton.TYPE) {
            Singleton.mInstance.set(ActivityManagerNative.gDefault.get(), getInvocationStub().getProxyInterface());
        }
        BinderInvocationStub binderInvocationStub = new BinderInvocationStub(getInvocationStub().getBaseInterface());
        binderInvocationStub.copyMethodProxies(getInvocationStub());
        ServiceManager.sCache.get().put("activity", binderInvocationStub);
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return ActivityManagerNative.getDefault.call(new Object[0]) != getInvocationStub().getProxyInterface();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        if (VirtualCore.get().isVAppProcess()) {
            addMethodProxy(new StaticMethodProxy("setRequestedOrientation") { // from class: com.lody.virtual.client.hook.proxies.am.ActivityManagerStub.1
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    try {
                        return super.call(obj, method, objArr);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return 0;
                    }
                }
            });
            addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getHistoricalProcessExitReasons"));
            addMethodProxy(new ResultStaticMethodProxy("registerUidObserver", 0));
            addMethodProxy(new ResultStaticMethodProxy("unregisterUidObserver", 0));
            addMethodProxy(new ResultStaticMethodProxy("registerUidObserverForUids", new Binder()));
            addMethodProxy(new ResultStaticMethodProxy("addUidToObserver", null));
            addMethodProxy(new ResultStaticMethodProxy("removeUidFromObserver", null));
            addMethodProxy(new IsUidActive());
            addMethodProxy(new GetUidProcessState());
            addMethodProxy(new ResultStaticMethodProxy("logFgsApiBegin", null));
            addMethodProxy(new ResultStaticMethodProxy("logFgsApiEnd", null));
            addMethodProxy(new ResultStaticMethodProxy("logFgsApiStateChanged", null));
            addMethodProxy(new ReplaceFirstPkgMethodProxy("moveTaskToFront"));
            addMethodProxy(new ReplaceFirstPkgMethodProxy("isBackgroundRestricted"));
            addMethodProxy(new ReplaceLastPkgMethodProxy("getAppStartMode"));
            addMethodProxy(new ResultStaticMethodProxy("updateConfiguration", 0));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("setAppLockedVerifying"));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("reportJunkFromApp"));
            addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("isForcedImmersiveFullScreen"));
            addMethodProxy(new StaticMethodProxy("activityResumed") { // from class: com.lody.virtual.client.hook.proxies.am.ActivityManagerStub.2
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    VActivityManager.get().onActivityResumed((IBinder) objArr[0]);
                    return super.call(obj, method, objArr);
                }
            });
            addMethodProxy(new StaticMethodProxy("activityDestroyed") { // from class: com.lody.virtual.client.hook.proxies.am.ActivityManagerStub.3
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object afterCall(Object obj, Method method, Object[] objArr, Object obj2) throws Throwable {
                    VActivityManager.get().onActivityDestroy((IBinder) objArr[0]);
                    return super.afterCall(obj, method, objArr, obj2);
                }
            });
            addMethodProxy(new StaticMethodProxy("checkUriPermission") { // from class: com.lody.virtual.client.hook.proxies.am.ActivityManagerStub.4
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    int i5 = 0;
                    Object obj2 = objArr[0];
                    if ((obj2 instanceof Uri) && obj2.toString().equals("content://telephony/carriers/preferapn")) {
                        if (!VirtualCore.get().checkSelfPermission("Manifest.permission.WRITE_APN_SETTINGS", VirtualCore.get().isExtPackage())) {
                            i5 = -1;
                        }
                        return Integer.valueOf(i5);
                    }
                    return 0;
                }
            });
            addMethodProxy(new StaticMethodProxy("finishActivity") { // from class: com.lody.virtual.client.hook.proxies.am.ActivityManagerStub.5
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    VActivityManager.get().onFinishActivity((IBinder) objArr[0]);
                    return super.call(obj, method, objArr);
                }

                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public boolean isEnable() {
                    return MethodProxy.isAppProcess();
                }
            });
            addMethodProxy(new StaticMethodProxy("finishActivityAffinity") { // from class: com.lody.virtual.client.hook.proxies.am.ActivityManagerStub.6
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) {
                    return Boolean.valueOf(VActivityManager.get().finishActivityAffinity(MethodProxy.getAppUserId(), (IBinder) objArr[0]));
                }

                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public boolean isEnable() {
                    return MethodProxy.isAppProcess();
                }
            });
        }
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getIntentSenderWithFeature"));
    }
}
