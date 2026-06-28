package com.lody.virtual.client.hook.proxies.pm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationStub;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstCallingPkgAndFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.Reflect;
import mirror.RefObject;
import mirror.android.app.ActivityThread;
import mirror.huawei.android.app.HwApiCacheManagerEx;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public final class PackageManagerStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
    public PackageManagerStub() {
        super(new MethodInvocationStub(ActivityThread.sPackageManager.get()));
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        IInterface proxyInterface = getInvocationStub().getProxyInterface();
        ActivityThread.sPackageManager.set(proxyInterface);
        BinderInvocationStub binderInvocationStub = new BinderInvocationStub(getInvocationStub().getBaseInterface());
        binderInvocationStub.copyMethodProxies(getInvocationStub());
        binderInvocationStub.replaceService("package");
        try {
            Context context = (Context) Reflect.on(VirtualCore.mainThread()).call("getSystemContext").get();
            if (Reflect.on(context).field("mPackageManager").get() != null) {
                Reflect.on(context).field("mPackageManager").set("mPM", proxyInterface);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ContextFixer.fixContext(VirtualCore.get().getContext(), null);
        RefObject<PackageManager> refObject = HwApiCacheManagerEx.mPkg;
        if (refObject != null) {
            refObject.set(HwApiCacheManagerEx.getDefault.call(new Object[0]), VirtualCore.getPM());
        }
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return getInvocationStub().getProxyInterface() != ActivityThread.sPackageManager.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        Boolean bool = Boolean.TRUE;
        addMethodProxy(new ResultStaticMethodProxy("addPermissionAsync", bool));
        addMethodProxy(new ResultStaticMethodProxy("addPermission", bool));
        addMethodProxy(new ResultStaticMethodProxy("performDexOpt", bool));
        Boolean bool2 = Boolean.FALSE;
        addMethodProxy(new ResultStaticMethodProxy("performDexOptIfNeeded", bool2));
        addMethodProxy(new ResultStaticMethodProxy("performDexOptSecondary", bool));
        addMethodProxy(new ResultStaticMethodProxy("addOnPermissionsChangeListener", 0));
        addMethodProxy(new ResultStaticMethodProxy("removeOnPermissionsChangeListener", 0));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("shouldShowRequestPermissionRationale"));
        if (BuildCompat.isOreo()) {
            addMethodProxy(new ResultStaticMethodProxy("notifyDexLoad", 0));
            addMethodProxy(new ResultStaticMethodProxy("notifyPackageUse", 0));
            addMethodProxy(new ResultStaticMethodProxy("setInstantAppCookie", bool2));
            addMethodProxy(new ResultStaticMethodProxy("isInstantApp", bool2));
        }
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isPackageSuspendedForUser"));
        addMethodProxy(new ResultStaticMethodProxy("checkPackageStartable", 0));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("setSplashScreenTheme"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("getSplashScreenTheme"));
        addMethodProxy(new ResultStaticMethodProxy("setComponentEnabledSettings", null));
    }
}
