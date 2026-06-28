package com.lody.virtual.client.hook.proxies.power;

import android.os.Build;
import android.os.WorkSource;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceSequencePkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import mirror.android.os.IPowerManager;

/* loaded from: classes3.dex */
public class PowerManagerStub extends BinderInvocationProxy {
    public PowerManagerStub() {
        super(IPowerManager.Stub.asInterface, "power");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object onHandleError(InvocationTargetException invocationTargetException) throws Throwable {
        if (invocationTargetException.getCause() instanceof SecurityException) {
            return 0;
        }
        throw invocationTargetException.getCause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceWorkSource(Object[] objArr) {
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] instanceof WorkSource) {
                objArr[i5] = null;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("wakeUp"));
        addMethodProxy(new ReplaceSequencePkgMethodProxy("acquireWakeLock", 2) { // from class: com.lody.virtual.client.hook.proxies.power.PowerManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                PowerManagerStub.this.replaceWorkSource(objArr);
                try {
                    return super.call(obj, method, objArr);
                } catch (InvocationTargetException e5) {
                    return PowerManagerStub.this.onHandleError(e5);
                }
            }
        });
        addMethodProxy(new ReplaceLastPkgMethodProxy("acquireWakeLockWithUid") { // from class: com.lody.virtual.client.hook.proxies.power.PowerManagerStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                PowerManagerStub.this.replaceWorkSource(objArr);
                try {
                    return super.call(obj, method, objArr);
                } catch (InvocationTargetException e5) {
                    return PowerManagerStub.this.onHandleError(e5);
                }
            }
        });
        addMethodProxy(new ResultStaticMethodProxy("updateWakeLockWorkSource", 0) { // from class: com.lody.virtual.client.hook.proxies.power.PowerManagerStub.3
            @Override // com.lody.virtual.client.hook.base.ResultStaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                PowerManagerStub.this.replaceWorkSource(objArr);
                return super.call(obj, method, objArr);
            }
        });
        if (Build.MANUFACTURER.equalsIgnoreCase("FUJITSU")) {
            addMethodProxy(new StaticMethodProxy("acquireWakeLockWithLogging") { // from class: com.lody.virtual.client.hook.proxies.power.PowerManagerStub.4
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    Object obj2 = objArr[3];
                    if ((obj2 instanceof String) && isAppPkg((String) obj2)) {
                        objArr[3] = MethodProxy.getHostPkg();
                    }
                    PowerManagerStub.this.replaceWorkSource(objArr);
                    return super.call(obj, method, objArr);
                }
            });
        }
    }
}
