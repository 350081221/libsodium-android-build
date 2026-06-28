package com.lody.virtual.client.ipc;

import android.os.RemoteException;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.remote.vloc.VCell;
import com.lody.virtual.remote.vloc.VLocation;
import com.lody.virtual.server.interfaces.IVirtualLocationManager;
import java.util.List;

/* loaded from: classes3.dex */
public class VirtualLocationManager {
    public static final int MODE_CLOSE = 0;
    public static final int MODE_USE_GLOBAL = 1;
    public static final int MODE_USE_SELF = 2;
    private static final VirtualLocationManager sInstance = new VirtualLocationManager();
    private IVirtualLocationManager mService;

    public static VirtualLocationManager get() {
        return sInstance;
    }

    private Object getRemoteInterface() {
        return IVirtualLocationManager.Stub.asInterface(ServiceManagerNative.getService(ServiceManagerNative.VIRTUAL_LOC));
    }

    public List<VCell> getAllCell(int i5, String str) {
        try {
            return getService().getAllCell(i5, str);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public VCell getCell(int i5, String str) {
        try {
            return getService().getCell(i5, str);
        } catch (RemoteException e5) {
            return (VCell) VirtualRuntime.crash(e5);
        }
    }

    public VLocation getGlobalLocation() {
        try {
            return getService().getGlobalLocation();
        } catch (RemoteException e5) {
            return (VLocation) VirtualRuntime.crash(e5);
        }
    }

    public VLocation getLocation(int i5, String str) {
        try {
            return getService().getLocation(i5, str);
        } catch (RemoteException e5) {
            return (VLocation) VirtualRuntime.crash(e5);
        }
    }

    public int getMode(int i5, String str) {
        try {
            return getService().getMode(i5, str);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public List<VCell> getNeighboringCell(int i5, String str) {
        try {
            return getService().getNeighboringCell(i5, str);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public IVirtualLocationManager getService() {
        IVirtualLocationManager iVirtualLocationManager = this.mService;
        if (iVirtualLocationManager == null || !IInterfaceUtils.isAlive(iVirtualLocationManager)) {
            synchronized (this) {
                this.mService = (IVirtualLocationManager) LocalProxyUtils.genProxy(IVirtualLocationManager.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public boolean isUseVirtualLocation(int i5, String str) {
        return getMode(i5, str) != 0;
    }

    public void setAllCell(int i5, String str, List<VCell> list) {
        try {
            getService().setAllCell(i5, str, list);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setCell(int i5, String str, VCell vCell) {
        try {
            getService().setCell(i5, str, vCell);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setGlobalAllCell(List<VCell> list) {
        try {
            getService().setGlobalAllCell(list);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setGlobalCell(VCell vCell) {
        try {
            getService().setGlobalCell(vCell);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setGlobalLocation(VLocation vLocation) {
        try {
            getService().setGlobalLocation(vLocation);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setGlobalNeighboringCell(List<VCell> list) {
        try {
            getService().setGlobalNeighboringCell(list);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setLocation(int i5, String str, VLocation vLocation) {
        try {
            getService().setLocation(i5, str, vLocation);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setMode(int i5, String str, int i6) {
        try {
            getService().setMode(i5, str, i6);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void setNeighboringCell(int i5, String str, List<VCell> list) {
        try {
            getService().setNeighboringCell(i5, str, list);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public VLocation getLocation() {
        return getLocation(MethodProxy.getAppUserId(), MethodProxy.getAppPkg());
    }

    public int getMode() {
        return getMode(MethodProxy.getAppUserId(), MethodProxy.getAppPkg());
    }
}
