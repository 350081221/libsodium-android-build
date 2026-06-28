package com.lody.virtual.client.hook.proxies.permissionmgr;

import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.BinderInvocationStub;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.RefObjUtil;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;
import mirror.android.app.ActivityThread;
import mirror.android.permission.IPermissionManager;

/* loaded from: classes3.dex */
public class PermissionManagerStub extends BinderInvocationProxy {
    public PermissionManagerStub() {
        super(IPermissionManager.Stub.asInterface, "permissionmgr");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        try {
            VirtualCore.get().getPackageManager().getAllPermissionGroups(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        IInterface proxyInterface = getInvocationStub().getProxyInterface();
        ActivityThread.sPermissionManager.set(proxyInterface);
        try {
            Object obj = Reflect.on(VirtualCore.getPM()).field("mPermissionManager").get();
            Object pm = VirtualCore.getPM();
            if (BuildCompat.isS()) {
                pm = obj;
                obj = Reflect.on(obj).field("mPermissionManager").get();
            }
            if (obj != proxyInterface) {
                Reflect.on(pm).set("mPermissionManager", proxyInterface);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        BinderInvocationStub binderInvocationStub = new BinderInvocationStub(getInvocationStub().getBaseInterface());
        binderInvocationStub.copyMethodProxies(getInvocationStub());
        binderInvocationStub.replaceService("permissionmgr");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return getInvocationStub().getProxyInterface() != RefObjUtil.getRefObjectValue(ActivityThread.sPermissionManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("addOnPermissionsChangeListener") { // from class: com.lody.virtual.client.hook.proxies.permissionmgr.PermissionManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return 0;
            }
        });
        addMethodProxy(new StaticMethodProxy("removeOnPermissionsChangeListener") { // from class: com.lody.virtual.client.hook.proxies.permissionmgr.PermissionManagerStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return 0;
            }
        });
        addMethodProxy(new StaticMethodProxy("addPermission") { // from class: com.lody.virtual.client.hook.proxies.permissionmgr.PermissionManagerStub.3
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) {
                return Boolean.TRUE;
            }
        });
        addMethodProxy(new StaticMethodProxy("checkPermission") { // from class: com.lody.virtual.client.hook.proxies.permissionmgr.PermissionManagerStub.4
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                if (objArr.length >= 4) {
                    return Integer.valueOf(VPackageManager.get().checkPermission((String) objArr[1], (String) objArr[0], ((Integer) objArr[3]).intValue()));
                }
                return Integer.valueOf(VPackageManager.get().checkPermission((String) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()));
            }
        });
        addMethodProxy(new ReplaceFirstPkgMethodProxy("shouldShowRequestPermissionRationale"));
    }
}
