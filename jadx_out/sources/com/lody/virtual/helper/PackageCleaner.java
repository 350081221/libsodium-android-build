package com.lody.virtual.helper;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserInfo;
import com.lody.virtual.os.VUserManager;
import com.lody.virtual.remote.InstalledAppInfo;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class PackageCleaner {
    public static void cleanAllUserPackage(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            File file3 = new File(file2, str);
            if (file3.exists()) {
                FileUtils.deleteDir(file3);
            }
        }
    }

    public static void cleanUninstalledPackages() {
        List<InstalledAppInfo> installedApps = VirtualCore.get().getInstalledApps(0);
        HashSet hashSet = new HashSet(installedApps.size());
        Iterator<InstalledAppInfo> it = installedApps.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().packageName);
        }
        File[] listFiles = VEnvironment.getDataAppDirectoryExt().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                if (!name.equals("system") && !hashSet.contains(name)) {
                    cleanAllUserPackage(VEnvironment.getDataUserDirectoryExt(), name);
                    cleanAllUserPackage(VEnvironment.getDeDataUserDirectoryExt(), name);
                    FileUtils.deleteDir(file);
                }
            }
        }
    }

    public static void cleanUsers(File file) {
        boolean z4;
        List<VUserInfo> users = VUserManager.get().getUsers();
        HashSet hashSet = new HashSet(users.size());
        Iterator<VUserInfo> it = users.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().id));
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                z4 = hashSet.contains(Integer.valueOf(Integer.parseInt(file2.getName())));
            } catch (NumberFormatException e5) {
                e5.printStackTrace();
                z4 = false;
            }
            if (!z4) {
                FileUtils.deleteDir(file2);
            }
        }
    }
}
