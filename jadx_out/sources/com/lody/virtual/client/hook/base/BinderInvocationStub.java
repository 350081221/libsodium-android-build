package com.lody.virtual.client.hook.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.client.core.ServiceLocalManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.VLog;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import mirror.RefStaticMethod;
import mirror.android.os.ServiceManager;

/* loaded from: classes3.dex */
public class BinderInvocationStub extends MethodInvocationStub<IInterface> implements IBinder {
    private static final String TAG = "BinderInvocationStub";
    private IBinder mBaseBinder;

    /* loaded from: classes3.dex */
    private final class AsBinder extends MethodProxy {
        private AsBinder() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return BinderInvocationStub.this;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "asBinder";
        }
    }

    public BinderInvocationStub(RefStaticMethod<IInterface> refStaticMethod, IBinder iBinder) {
        this(asInterface(refStaticMethod, iBinder));
    }

    private static IInterface asInterface(RefStaticMethod<IInterface> refStaticMethod, IBinder iBinder) {
        if (refStaticMethod != null && iBinder != null) {
            return refStaticMethod.call(iBinder);
        }
        VLog.d(TAG, "Could not create stub because asInterfaceMethod = " + refStaticMethod + ", binder = " + iBinder, new Object[0]);
        return null;
    }

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.mBaseBinder.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    @TargetApi(13)
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.mBaseBinder.dumpAsync(fileDescriptor, strArr);
    }

    public IBinder getBaseBinder() {
        return this.mBaseBinder;
    }

    public Context getContext() {
        return VirtualCore.get().getContext();
    }

    public IBinder getExtension() throws RemoteException {
        try {
            return (IBinder) Reflect.on(this.mBaseBinder).call("getExtension").get();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause instanceof RemoteException) {
                throw ((RemoteException) cause);
            }
            throw new IllegalStateException("Unknown exception", cause);
        }
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() throws RemoteException {
        return this.mBaseBinder.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.mBaseBinder.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i5) throws RemoteException {
        this.mBaseBinder.linkToDeath(deathRecipient, i5);
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.mBaseBinder.pingBinder();
    }

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        return getProxyInterface();
    }

    public void replaceService(String str) {
        if (this.mBaseBinder != null) {
            ServiceManager.sCache.get().put(str, this);
            ServiceLocalManager.addService(str, this);
        }
    }

    @Override // android.os.IBinder
    public boolean transact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        return this.mBaseBinder.transact(i5, parcel, parcel2, i6);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i5) {
        return this.mBaseBinder.unlinkToDeath(deathRecipient, i5);
    }

    public BinderInvocationStub(Class<?> cls, IBinder iBinder) {
        this(asInterface(cls, iBinder));
    }

    public BinderInvocationStub(IInterface iInterface) {
        super(iInterface);
        this.mBaseBinder = getBaseInterface() != null ? getBaseInterface().asBinder() : null;
        addMethodProxy(new AsBinder());
    }

    private static IInterface asInterface(Class<?> cls, IBinder iBinder) {
        if (cls == null) {
            return null;
        }
        try {
            if (iBinder == null) {
                Log.w(TAG, "Could not create stub because binder = null, stubClass=" + cls);
                return null;
            }
            return (IInterface) cls.getMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Exception e5) {
            Log.d(TAG, "Could not create stub " + cls.getName() + ". Cause: " + e5);
            return null;
        }
    }
}
