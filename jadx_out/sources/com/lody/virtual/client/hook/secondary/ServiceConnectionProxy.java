package com.lody.virtual.client.hook.secondary;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.collection.ArrayMap;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.server.IBinderProxyService;
import mirror.android.app.ActivityThread;
import mirror.android.app.ContextImpl;
import mirror.android.app.IServiceConnectionO;
import mirror.android.app.LoadedApk;

/* loaded from: classes3.dex */
public class ServiceConnectionProxy extends IServiceConnection.Stub {
    private static final ArrayMap<IBinder, ServiceConnectionProxy> sProxyMap = new ArrayMap<>();
    private IServiceConnection mConn;

    private ServiceConnectionProxy(IServiceConnection iServiceConnection) {
        this.mConn = iServiceConnection;
    }

    public static IServiceConnection getDispatcher(Context context, ServiceConnection serviceConnection, int i5) {
        IServiceConnection iServiceConnection;
        if (serviceConnection != null) {
            try {
                Object call = ActivityThread.currentActivityThread.call(new Object[0]);
                iServiceConnection = LoadedApk.getServiceDispatcher.call(ContextImpl.mPackageInfo.get(VirtualCore.get().getContext()), serviceConnection, context, ActivityThread.getHandler.call(call, new Object[0]), Integer.valueOf(i5));
            } catch (Exception e5) {
                Log.e("ConnectionDelegate", "getServiceDispatcher", e5);
                iServiceConnection = null;
            }
            if (iServiceConnection != null) {
                return iServiceConnection;
            }
            throw new RuntimeException("Not supported in system context");
        }
        throw new IllegalArgumentException("connection is null");
    }

    public static ServiceConnectionProxy getOrCreateProxy(IServiceConnection iServiceConnection) {
        ServiceConnectionProxy serviceConnectionProxy;
        if (iServiceConnection instanceof ServiceConnectionProxy) {
            return (ServiceConnectionProxy) iServiceConnection;
        }
        IBinder asBinder = iServiceConnection.asBinder();
        ArrayMap<IBinder, ServiceConnectionProxy> arrayMap = sProxyMap;
        synchronized (arrayMap) {
            serviceConnectionProxy = arrayMap.get(asBinder);
            if (serviceConnectionProxy == null) {
                serviceConnectionProxy = new ServiceConnectionProxy(iServiceConnection);
                arrayMap.put(asBinder, serviceConnectionProxy);
            }
        }
        return serviceConnectionProxy;
    }

    public static IServiceConnection removeDispatcher(Context context, ServiceConnection serviceConnection) {
        try {
            return LoadedApk.forgetServiceDispatcher.call(ContextImpl.mPackageInfo.get(VirtualCore.get().getContext()), context, serviceConnection);
        } catch (Exception e5) {
            Log.e("ConnectionDelegate", "forgetServiceDispatcher", e5);
            return null;
        }
    }

    public static ServiceConnectionProxy removeProxy(IServiceConnection iServiceConnection) {
        ServiceConnectionProxy remove;
        if (iServiceConnection == null) {
            return null;
        }
        ArrayMap<IBinder, ServiceConnectionProxy> arrayMap = sProxyMap;
        synchronized (arrayMap) {
            remove = arrayMap.remove(iServiceConnection.asBinder());
        }
        return remove;
    }

    @Override // android.app.IServiceConnection
    public void connected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        connected(componentName, iBinder, false);
    }

    public IServiceConnection getBase() {
        return this.mConn;
    }

    public void connected(ComponentName componentName, IBinder iBinder, boolean z4) throws RemoteException {
        IBinder proxyService;
        if (iBinder == null) {
            return;
        }
        IBinderProxyService asInterface = IBinderProxyService.Stub.asInterface(iBinder);
        if (asInterface != null) {
            componentName = asInterface.getComponent();
            iBinder = asInterface.getService();
            if (VirtualCore.get().isVAppProcess() && (proxyService = ProxyServiceFactory.getProxyService(VClient.get().getCurrentApplication(), componentName, iBinder)) != null) {
                iBinder = proxyService;
            }
        }
        if (BuildCompat.isOreo()) {
            IServiceConnectionO.connected.call(this.mConn, componentName, iBinder, Boolean.valueOf(z4));
        } else {
            this.mConn.connected(componentName, iBinder);
        }
    }
}
