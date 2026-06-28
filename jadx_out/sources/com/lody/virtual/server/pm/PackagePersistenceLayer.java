package com.lody.virtual.server.pm;

import android.net.Uri;
import android.os.Parcel;
import android.util.ArrayMap;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.PersistenceLayer;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.server.pm.legacy.PackageSettingV1;
import com.lody.virtual.server.pm.legacy.PackageSettingV5;
import com.lody.virtual.server.pm.parser.VPackage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class PackagePersistenceLayer extends PersistenceLayer {
    private static final int CURRENT_VERSION = 7;
    private static final char[] MAGIC = {'v', 'p', 'k', 'g'};
    public boolean changed;
    private VAppManagerService mService;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PackagePersistenceLayer(VAppManagerService vAppManagerService) {
        super(VEnvironment.getPackageListFile());
        this.changed = false;
        this.mService = vAppManagerService;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public int getCurrentVersion() {
        return 7;
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void onPersistenceFileDamage() {
    }

    @Override // com.lody.virtual.helper.PersistenceLayer
    public void readPersistenceData(Parcel parcel, int i5) {
        Uri parse;
        PackageSettingV5 packageSettingV5;
        if (i5 != 7) {
            if (i5 <= 5) {
                int readInt = parcel.readInt();
                ArrayList<PackageSettingV5> arrayList = new ArrayList(readInt);
                while (true) {
                    int i6 = readInt - 1;
                    if (readInt <= 0) {
                        break;
                    }
                    if (i5 < 5) {
                        this.changed = true;
                        PackageSettingV1 packageSettingV1 = new PackageSettingV1();
                        packageSettingV1.readFromParcel(parcel, i5);
                        packageSettingV5 = new PackageSettingV5();
                        packageSettingV5.packageName = packageSettingV1.packageName;
                        packageSettingV5.appMode = packageSettingV1.notCopyApk ? 1 : 0;
                        packageSettingV5.appId = packageSettingV1.appId;
                        packageSettingV5.flag = packageSettingV1.flag;
                        packageSettingV5.userState = packageSettingV1.userState;
                        long currentTimeMillis = System.currentTimeMillis();
                        packageSettingV5.firstInstallTime = currentTimeMillis;
                        packageSettingV5.lastUpdateTime = currentTimeMillis;
                    } else {
                        packageSettingV5 = new PackageSettingV5(i5, parcel);
                    }
                    arrayList.add(packageSettingV5);
                    readInt = i6;
                }
                for (PackageSettingV5 packageSettingV52 : arrayList) {
                    if (packageSettingV52.appMode == 1) {
                        parse = Uri.parse("package:" + packageSettingV52.packageName);
                    } else {
                        File packageFile = VEnvironment.getPackageFile(packageSettingV52.packageName);
                        if (!packageFile.exists()) {
                            packageFile = VEnvironment.getPackageFileExt(packageSettingV52.packageName);
                        }
                        if (packageFile.exists()) {
                            parse = Uri.fromFile(packageFile);
                        } else {
                            parse = Uri.parse("package:" + packageSettingV52.packageName);
                        }
                    }
                    if (parse != null) {
                        if (VirtualCore.get().installPackage(parse, new VAppInstallerParams(26, 1)).status == 0) {
                            PackageCacheManager.getSetting(packageSettingV52.packageName).userState = packageSettingV52.userState;
                        } else {
                            VLog.e("PackagePersistenceLayer", "update package info failed : install %s failed", packageSettingV52.packageName);
                        }
                    }
                }
                save();
                this.changed = true;
                return;
            }
            onPersistenceFileDamage();
            return;
        }
        int readInt2 = parcel.readInt();
        while (true) {
            int i7 = readInt2 - 1;
            if (readInt2 > 0) {
                if (!this.mService.loadPackage(new PackageSetting(i5, parcel))) {
                    this.changed = true;
                }
                readInt2 = i7;
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
        ArrayMap<String, VPackage> arrayMap = PackageCacheManager.PACKAGE_CACHE;
        synchronized (arrayMap) {
            parcel.writeInt(arrayMap.size());
            Iterator<VPackage> it = arrayMap.values().iterator();
            while (it.hasNext()) {
                ((PackageSetting) it.next().mExtras).writeToParcel(parcel, 0);
            }
        }
    }
}
