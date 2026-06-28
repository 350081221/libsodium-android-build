package com.lody.virtual.oem.apps;

import com.lody.virtual.client.VClient;
import com.lody.virtual.os.VEnvironment;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public class DouYin {
    public static void cleanFiles(String str, String str2) {
        File[] listFiles;
        if (!isEnableFix() || !isDouYin(str2)) {
            return;
        }
        File file = new File(VEnvironment.getDataUserDirectory(VClient.get().getVUserHandle()).getAbsolutePath() + "/" + str2 + "/files/keva/repo/config_center_repo");
        if (file.exists() && (listFiles = file.listFiles(new FilenameFilter() { // from class: com.lody.virtual.oem.apps.DouYin.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str3) {
                return str3.startsWith("config_center_repo.");
            }
        })) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    public static boolean isDouYin(String str) {
        if (!isEnableFix()) {
            return false;
        }
        if (!"com.ss.android.ugc.aweme.lite".equals(str) && !"com.ss.android.ugc.aweme".equals(str)) {
            return false;
        }
        return true;
    }

    private static boolean isEnableFix() {
        return true;
    }
}
