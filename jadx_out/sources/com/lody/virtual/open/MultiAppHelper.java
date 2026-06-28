package com.lody.virtual.open;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.os.VUserManager;
import com.lody.virtual.remote.InstalledAppInfo;

/* loaded from: classes3.dex */
public class MultiAppHelper {
    public static int installExistedPackage(String str) throws IllegalStateException {
        return installExistedPackage(VirtualCore.get().getInstalledAppInfo(str, 0));
    }

    public static int installExistedPackage(InstalledAppInfo installedAppInfo) throws IllegalStateException {
        if (installedAppInfo != null) {
            int[] installedUsers = installedAppInfo.getInstalledUsers();
            int length = installedUsers.length;
            int i5 = 0;
            while (true) {
                if (i5 >= installedUsers.length) {
                    break;
                }
                if (installedUsers[i5] != i5) {
                    length = i5;
                    break;
                }
                i5++;
            }
            if (VUserManager.get().getUserInfo(length) == null) {
                if (VUserManager.get().createUser("Space " + (length + 1), 2) != null) {
                    VirtualCore.get().scanApps();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (VirtualCore.get().installPackageAsUser(length, installedAppInfo.packageName)) {
                return length;
            }
            throw new IllegalStateException("install fail");
        }
        throw new IllegalStateException("pkg must be installed.");
    }
}
