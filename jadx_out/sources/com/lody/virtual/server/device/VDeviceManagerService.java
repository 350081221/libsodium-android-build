package com.lody.virtual.server.device;

import com.lody.virtual.helper.collection.SparseArray;
import com.lody.virtual.remote.VDeviceConfig;
import com.lody.virtual.server.interfaces.IDeviceManager;

/* loaded from: classes3.dex */
public class VDeviceManagerService extends IDeviceManager.Stub {
    private static final VDeviceManagerService sInstance = new VDeviceManagerService();
    final SparseArray<VDeviceConfig> mDeviceConfigs = new SparseArray<>();
    private DeviceInfoPersistenceLayer mPersistenceLayer;

    private VDeviceManagerService() {
        DeviceInfoPersistenceLayer deviceInfoPersistenceLayer = new DeviceInfoPersistenceLayer(this);
        this.mPersistenceLayer = deviceInfoPersistenceLayer;
        deviceInfoPersistenceLayer.read();
        for (int i5 = 0; i5 < this.mDeviceConfigs.size(); i5++) {
            VDeviceConfig.addToPool(this.mDeviceConfigs.valueAt(i5));
        }
    }

    public static VDeviceManagerService get() {
        return sInstance;
    }

    @Override // com.lody.virtual.server.interfaces.IDeviceManager
    public VDeviceConfig getDeviceConfig(int i5) {
        VDeviceConfig vDeviceConfig;
        synchronized (this.mDeviceConfigs) {
            vDeviceConfig = this.mDeviceConfigs.get(i5);
            if (vDeviceConfig == null) {
                vDeviceConfig = VDeviceConfig.random();
                this.mDeviceConfigs.put(i5, vDeviceConfig);
                this.mPersistenceLayer.save();
            }
        }
        return vDeviceConfig;
    }

    @Override // com.lody.virtual.server.interfaces.IDeviceManager
    public boolean isEnable(int i5) {
        return getDeviceConfig(i5).enable;
    }

    @Override // com.lody.virtual.server.interfaces.IDeviceManager
    public void setEnable(int i5, boolean z4) {
        synchronized (this.mDeviceConfigs) {
            VDeviceConfig vDeviceConfig = this.mDeviceConfigs.get(i5);
            if (vDeviceConfig == null) {
                vDeviceConfig = VDeviceConfig.random();
                this.mDeviceConfigs.put(i5, vDeviceConfig);
            }
            vDeviceConfig.enable = z4;
            this.mPersistenceLayer.save();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IDeviceManager
    public void updateDeviceConfig(int i5, VDeviceConfig vDeviceConfig) {
        synchronized (this.mDeviceConfigs) {
            if (vDeviceConfig != null) {
                this.mDeviceConfigs.put(i5, vDeviceConfig);
                this.mPersistenceLayer.save();
            }
        }
    }
}
