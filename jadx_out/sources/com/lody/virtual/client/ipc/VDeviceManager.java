package com.lody.virtual.client.ipc;

import android.os.RemoteException;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.ReflectException;
import com.lody.virtual.remote.VDeviceConfig;
import com.lody.virtual.server.interfaces.IDeviceManager;
import java.util.Map;
import mirror.android.os.Build;

/* loaded from: classes3.dex */
public class VDeviceManager {
    private static final VDeviceManager sInstance = new VDeviceManager();
    private IDeviceManager mService;

    public static VDeviceManager get() {
        return sInstance;
    }

    private Object getRemoteInterface() {
        return IDeviceManager.Stub.asInterface(ServiceManagerNative.getService("device"));
    }

    public void applyBuildProp(VDeviceConfig vDeviceConfig) {
        for (Map.Entry<String, String> entry : vDeviceConfig.buildProp.entrySet()) {
            try {
                Reflect.on(Build.TYPE).set(entry.getKey(), entry.getValue());
            } catch (ReflectException e5) {
                e5.printStackTrace();
            }
        }
        if (vDeviceConfig.serial != null) {
            Reflect.on(Build.TYPE).set("SERIAL", vDeviceConfig.serial);
        }
    }

    public VDeviceConfig getDeviceConfig(int i5) {
        try {
            return getService().getDeviceConfig(i5);
        } catch (RemoteException e5) {
            return (VDeviceConfig) VirtualRuntime.crash(e5);
        }
    }

    public IDeviceManager getService() {
        if (!IInterfaceUtils.isAlive(this.mService)) {
            synchronized (this) {
                this.mService = (IDeviceManager) LocalProxyUtils.genProxy(IDeviceManager.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public boolean isEnable(int i5) {
        try {
            return getService().isEnable(i5);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public void setEnable(int i5, boolean z4) {
        try {
            getService().setEnable(i5, z4);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }

    public void updateDeviceConfig(int i5, VDeviceConfig vDeviceConfig) {
        try {
            getService().updateDeviceConfig(i5, vDeviceConfig);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }
}
