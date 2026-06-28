package com.lody.virtual.server.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.lody.virtual.helper.PersistenceLayer;
import com.lody.virtual.helper.collection.SparseArray;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.vloc.VCell;
import com.lody.virtual.remote.vloc.VLocation;
import com.lody.virtual.server.interfaces.IVirtualLocationManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class VirtualLocationService extends IVirtualLocationManager.Stub {
    private static final VirtualLocationService sInstance = new VirtualLocationService();
    private final PersistenceLayer mPersistenceLayer;
    private final SparseArray<Map<String, VLocConfig>> mLocConfigs = new SparseArray<>();
    private final VLocConfig mGlobalConfig = new VLocConfig();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class VLocConfig implements Parcelable {
        public static final Parcelable.Creator<VLocConfig> CREATOR = new Parcelable.Creator<VLocConfig>() { // from class: com.lody.virtual.server.location.VirtualLocationService.VLocConfig.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public VLocConfig createFromParcel(Parcel parcel) {
                return new VLocConfig(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public VLocConfig[] newArray(int i5) {
                return new VLocConfig[i5];
            }
        };
        List<VCell> allCell;
        VCell cell;
        VLocation location;
        int mode;
        List<VCell> neighboringCell;

        VLocConfig() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void set(VLocConfig vLocConfig) {
            this.mode = vLocConfig.mode;
            this.cell = vLocConfig.cell;
            this.allCell = vLocConfig.allCell;
            this.neighboringCell = vLocConfig.neighboringCell;
            this.location = vLocConfig.location;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.mode);
            parcel.writeParcelable(this.cell, i5);
            parcel.writeTypedList(this.allCell);
            parcel.writeTypedList(this.neighboringCell);
            parcel.writeParcelable(this.location, i5);
        }

        VLocConfig(Parcel parcel) {
            this.mode = parcel.readInt();
            this.cell = (VCell) parcel.readParcelable(VCell.class.getClassLoader());
            Parcelable.Creator<VCell> creator = VCell.CREATOR;
            this.allCell = parcel.createTypedArrayList(creator);
            this.neighboringCell = parcel.createTypedArrayList(creator);
            this.location = (VLocation) parcel.readParcelable(VLocation.class.getClassLoader());
        }
    }

    private VirtualLocationService() {
        PersistenceLayer persistenceLayer = new PersistenceLayer(VEnvironment.getVirtualLocationFile()) { // from class: com.lody.virtual.server.location.VirtualLocationService.1
            @Override // com.lody.virtual.helper.PersistenceLayer
            public int getCurrentVersion() {
                return 1;
            }

            @Override // com.lody.virtual.helper.PersistenceLayer
            public void readPersistenceData(Parcel parcel, int i5) {
                VirtualLocationService.this.mGlobalConfig.set(new VLocConfig(parcel));
                VirtualLocationService.this.mLocConfigs.clear();
                int readInt = parcel.readInt();
                while (true) {
                    int i6 = readInt - 1;
                    if (readInt > 0) {
                        VirtualLocationService.this.mLocConfigs.put(parcel.readInt(), parcel.readHashMap(getClass().getClassLoader()));
                        readInt = i6;
                    } else {
                        return;
                    }
                }
            }

            @Override // com.lody.virtual.helper.PersistenceLayer
            public void writePersistenceData(Parcel parcel) {
                VirtualLocationService.this.mGlobalConfig.writeToParcel(parcel, 0);
                parcel.writeInt(VirtualLocationService.this.mLocConfigs.size());
                for (int i5 = 0; i5 < VirtualLocationService.this.mLocConfigs.size(); i5++) {
                    int keyAt = VirtualLocationService.this.mLocConfigs.keyAt(i5);
                    Map map = (Map) VirtualLocationService.this.mLocConfigs.valueAt(i5);
                    parcel.writeInt(keyAt);
                    parcel.writeMap(map);
                }
            }
        };
        this.mPersistenceLayer = persistenceLayer;
        persistenceLayer.read();
    }

    public static VirtualLocationService get() {
        return sInstance;
    }

    private VLocConfig getOrCreateConfig(int i5, String str) {
        Map<String, VLocConfig> map = this.mLocConfigs.get(i5);
        if (map == null) {
            map = new HashMap<>();
            this.mLocConfigs.put(i5, map);
        }
        VLocConfig vLocConfig = map.get(str);
        if (vLocConfig == null) {
            VLocConfig vLocConfig2 = new VLocConfig();
            vLocConfig2.mode = 0;
            map.put(str, vLocConfig2);
            return vLocConfig2;
        }
        return vLocConfig;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public List<VCell> getAllCell(int i5, String str) {
        VLocConfig orCreateConfig = getOrCreateConfig(i5, str);
        this.mPersistenceLayer.save();
        int i6 = orCreateConfig.mode;
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return orCreateConfig.allCell;
        }
        return this.mGlobalConfig.allCell;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public VCell getCell(int i5, String str) {
        VLocConfig orCreateConfig = getOrCreateConfig(i5, str);
        this.mPersistenceLayer.save();
        int i6 = orCreateConfig.mode;
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return orCreateConfig.cell;
        }
        return this.mGlobalConfig.cell;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public VLocation getGlobalLocation() {
        return this.mGlobalConfig.location;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public VLocation getLocation(int i5, String str) {
        VLocConfig orCreateConfig = getOrCreateConfig(i5, str);
        this.mPersistenceLayer.save();
        int i6 = orCreateConfig.mode;
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return orCreateConfig.location;
        }
        return this.mGlobalConfig.location;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public int getMode(int i5, String str) {
        int i6;
        synchronized (this.mLocConfigs) {
            VLocConfig orCreateConfig = getOrCreateConfig(i5, str);
            this.mPersistenceLayer.save();
            i6 = orCreateConfig.mode;
        }
        return i6;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public List<VCell> getNeighboringCell(int i5, String str) {
        VLocConfig orCreateConfig = getOrCreateConfig(i5, str);
        this.mPersistenceLayer.save();
        int i6 = orCreateConfig.mode;
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return orCreateConfig.neighboringCell;
        }
        return this.mGlobalConfig.neighboringCell;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setAllCell(int i5, String str, List<VCell> list) {
        getOrCreateConfig(i5, str).allCell = list;
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setCell(int i5, String str, VCell vCell) {
        getOrCreateConfig(i5, str).cell = vCell;
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setGlobalAllCell(List<VCell> list) {
        this.mGlobalConfig.allCell = list;
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setGlobalCell(VCell vCell) {
        this.mGlobalConfig.cell = vCell;
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setGlobalLocation(VLocation vLocation) {
        this.mGlobalConfig.location = vLocation;
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setGlobalNeighboringCell(List<VCell> list) {
        this.mGlobalConfig.neighboringCell = list;
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setLocation(int i5, String str, VLocation vLocation) {
        getOrCreateConfig(i5, str).location = vLocation;
        this.mPersistenceLayer.save();
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setMode(int i5, String str, int i6) {
        synchronized (this.mLocConfigs) {
            getOrCreateConfig(i5, str).mode = i6;
            this.mPersistenceLayer.save();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
    public void setNeighboringCell(int i5, String str, List<VCell> list) {
        getOrCreateConfig(i5, str).neighboringCell = list;
        this.mPersistenceLayer.save();
    }
}
