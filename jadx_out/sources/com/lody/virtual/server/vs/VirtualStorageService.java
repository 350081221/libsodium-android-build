package com.lody.virtual.server.vs;

import android.util.SparseArray;
import com.lody.virtual.server.interfaces.IVirtualStorageService;
import com.lody.virtual.server.pm.VUserManagerService;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class VirtualStorageService extends IVirtualStorageService.Stub {
    private final SparseArray<HashMap<String, VSConfig>> mConfigs;
    private final VSPersistenceLayer mLayer;
    private static final VirtualStorageService sService = new VirtualStorageService();
    private static final String[] sPublicDirs = {"DCIM", "Music", "Pictures"};

    private VirtualStorageService() {
        VSPersistenceLayer vSPersistenceLayer = new VSPersistenceLayer(this);
        this.mLayer = vSPersistenceLayer;
        this.mConfigs = new SparseArray<>();
        vSPersistenceLayer.read();
    }

    private void checkUserId(int i5) {
        if (VUserManagerService.get().exists(i5)) {
            return;
        }
        throw new IllegalStateException("Invalid userId " + i5);
    }

    public static VirtualStorageService get() {
        return sService;
    }

    private VSConfig getOrCreateVSConfigLocked(String str, int i5) {
        HashMap<String, VSConfig> hashMap = this.mConfigs.get(i5);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.mConfigs.put(i5, hashMap);
        }
        VSConfig vSConfig = hashMap.get(str);
        if (vSConfig == null) {
            VSConfig vSConfig2 = new VSConfig();
            vSConfig2.enable = true;
            hashMap.put(str, vSConfig2);
            return vSConfig2;
        }
        return vSConfig;
    }

    private void preInitPublicPath(String str) {
        new File(str, "DCIM");
        for (String str2 : sPublicDirs) {
            File file = new File(str, str2);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<HashMap<String, VSConfig>> getConfigs() {
        return this.mConfigs;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
    public String getVirtualStorage(String str, int i5) {
        String str2;
        checkUserId(i5);
        synchronized (this.mConfigs) {
            str2 = getOrCreateVSConfigLocked(str, i5).vsPath;
        }
        return str2;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
    public boolean isVirtualStorageEnable(String str, int i5) {
        boolean z4;
        checkUserId(i5);
        synchronized (this.mConfigs) {
            z4 = getOrCreateVSConfigLocked(str, i5).enable;
        }
        return z4;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
    public void setVirtualStorage(String str, int i5, String str2) {
        checkUserId(i5);
        synchronized (this.mConfigs) {
            getOrCreateVSConfigLocked(str, i5).vsPath = str2;
            this.mLayer.save();
        }
        preInitPublicPath(str2);
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
    public void setVirtualStorageState(String str, int i5, boolean z4) {
        checkUserId(i5);
        synchronized (this.mConfigs) {
            getOrCreateVSConfigLocked(str, i5).enable = z4;
            this.mLayer.save();
        }
    }
}
