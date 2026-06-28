package com.lody.virtual.server.vs;

import android.os.Parcel;
import android.util.SparseArray;
import com.lody.virtual.helper.PersistenceLayer;
import com.lody.virtual.os.VEnvironment;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
class VSPersistenceLayer extends PersistenceLayer {
    private static final int CURRENT_VERSION = 1;
    private static final char[] MAGIC = {'v', 's', 'a'};
    private final VirtualStorageService mService;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VSPersistenceLayer(VirtualStorageService virtualStorageService) {
        super(VEnvironment.getVSConfigFile());
        this.mService = virtualStorageService;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public int getCurrentVersion() {
        return 1;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void onPersistenceFileDamage() {
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void readPersistenceData(Parcel parcel, int i5) {
        SparseArray<HashMap<String, VSConfig>> configs = this.mService.getConfigs();
        int readInt = parcel.readInt();
        while (true) {
            int i6 = readInt - 1;
            if (readInt > 0) {
                configs.put(parcel.readInt(), parcel.readHashMap(VSConfig.class.getClassLoader()));
                readInt = i6;
            } else {
                return;
            }
        }
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public boolean verifyMagic(Parcel parcel) {
        return Arrays.equals(parcel.createCharArray(), MAGIC);
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void writeMagic(Parcel parcel) {
        parcel.writeCharArray(MAGIC);
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void writePersistenceData(Parcel parcel) {
        SparseArray<HashMap<String, VSConfig>> configs = this.mService.getConfigs();
        int size = configs.size();
        parcel.writeInt(size);
        while (true) {
            int i5 = size - 1;
            if (size > 0) {
                int keyAt = configs.keyAt(i5);
                HashMap<String, VSConfig> valueAt = configs.valueAt(i5);
                parcel.writeInt(keyAt);
                parcel.writeMap(valueAt);
                size = i5;
            } else {
                return;
            }
        }
    }
}
