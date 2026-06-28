package com.lody.virtual.client.ipc;

import android.os.RemoteException;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.server.interfaces.IVirtualStorageService;

/* loaded from: classes3.dex */
public class VirtualStorageManager {
    private static final VirtualStorageManager sInstance = new VirtualStorageManager();
    private IVirtualStorageService mService;

    public static VirtualStorageManager get() {
        return sInstance;
    }

    private Object getRemoteInterface() {
        return IVirtualStorageService.Stub.asInterface(ServiceManagerNative.getService(ServiceManagerNative.VS));
    }

    public IVirtualStorageService getService() {
        IVirtualStorageService iVirtualStorageService = this.mService;
        if (iVirtualStorageService == null || !IInterfaceUtils.isAlive(iVirtualStorageService)) {
            synchronized (this) {
                this.mService = (IVirtualStorageService) LocalProxyUtils.genProxy(IVirtualStorageService.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public String getVirtualStorage(String str, int i5) {
        try {
            return getService().getVirtualStorage(str, i5);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public boolean isVirtualStorageEnable(String str, int i5) {
        try {
            return getService().isVirtualStorageEnable(str, i5);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void setVirtualStorage(String str, int i5, String str2) {
        try {
            getService().setVirtualStorage(str, i5, str2);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setVirtualStorageState(String str, int i5, boolean z4) {
        try {
            getService().setVirtualStorageState(str, i5, z4);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }
}
