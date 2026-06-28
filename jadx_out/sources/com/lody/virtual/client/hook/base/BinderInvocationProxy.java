package com.lody.virtual.client.hook.base;

import android.os.IBinder;
import android.os.IInterface;
import com.lody.virtual.helper.utils.VLog;
import mirror.RefStaticMethod;
import mirror.android.os.ServiceManager;

/* loaded from: classes3.dex */
public abstract class BinderInvocationProxy extends MethodInvocationProxy<BinderInvocationStub> {
    protected String mServiceName;

    public BinderInvocationProxy(IInterface iInterface, String str) {
        this(new BinderInvocationStub(iInterface), str);
    }

    public static IBinder getService(String str) {
        return ServiceManager.getService.call(str);
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        getInvocationStub().replaceService(this.mServiceName);
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        IBinder call = ServiceManager.getService.call(this.mServiceName);
        if (call != null && getInvocationStub() != call) {
            return true;
        }
        return false;
    }

    public BinderInvocationProxy(RefStaticMethod<IInterface> refStaticMethod, String str) {
        this(new BinderInvocationStub(refStaticMethod, getService(str)), str);
    }

    public BinderInvocationProxy(Class<?> cls, String str) {
        this(new BinderInvocationStub(cls, getService(str)), str);
    }

    public BinderInvocationProxy(BinderInvocationStub binderInvocationStub, String str) {
        super(binderInvocationStub);
        if (binderInvocationStub.getBaseInterface() == null) {
            VLog.d("BinderInvocationProxy", "Unable to build HookDelegate: %s.", str);
        }
        this.mServiceName = str;
    }
}
