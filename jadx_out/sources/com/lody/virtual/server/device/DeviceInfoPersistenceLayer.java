package com.lody.virtual.server.device;

import android.os.Parcel;
import com.lody.virtual.helper.PersistenceLayer;
import com.lody.virtual.helper.collection.SparseArray;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.VDeviceConfig;

/* loaded from: classes3.dex */
public class DeviceInfoPersistenceLayer extends PersistenceLayer {
    private VDeviceManagerService mService;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceInfoPersistenceLayer(VDeviceManagerService vDeviceManagerService) {
        super(VEnvironment.getDeviceInfoFile());
        this.mService = vDeviceManagerService;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public int getCurrentVersion() {
        return 3;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void onPersistenceFileDamage() {
        getPersistenceFile().delete();
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void readPersistenceData(Parcel parcel, int i5) {
        SparseArray<VDeviceConfig> sparseArray = this.mService.mDeviceConfigs;
        sparseArray.clear();
        int readInt = parcel.readInt();
        while (true) {
            int i6 = readInt - 1;
            if (readInt > 0) {
                sparseArray.put(parcel.readInt(), new VDeviceConfig(parcel));
                readInt = i6;
            } else {
                return;
            }
        }
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public boolean verifyMagic(Parcel parcel) {
        return true;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void writeMagic(Parcel parcel) {
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void writePersistenceData(Parcel parcel) {
        SparseArray<VDeviceConfig> sparseArray = this.mService.mDeviceConfigs;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = sparseArray.keyAt(i5);
            VDeviceConfig valueAt = sparseArray.valueAt(i5);
            parcel.writeInt(keyAt);
            valueAt.writeToParcel(parcel, 0);
        }
    }
}
