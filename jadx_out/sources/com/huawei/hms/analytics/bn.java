package com.huawei.hms.analytics;

import android.content.Context;
import com.huawei.hms.analytics.core.crypto.RandomUtil;
import com.huawei.hms.analytics.core.log.HiLog;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class bn {
    private String klm;
    Context lmn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bn() {
        Context context = ar.lmn().lmn.ghi;
        this.lmn = context;
        this.klm = context.getFilesDir().getPath();
    }

    private String klm(String str) {
        return this.klm + "/openness/component/".replace("component", str);
    }

    private static boolean klm(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            HiLog.w("ComponentCommander", "create new file error!");
            return false;
        }
    }

    public static boolean lmn() {
        return lmn(new File(ar.lmn().lmn.ghi.getFilesDir().getPath() + "/openness"));
    }

    private static boolean lmn(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    HiLog.i("ComponentCommander", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                lmn(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String lmn(String str) {
        File file = new File(klm(str), "hianalytics_".concat(String.valueOf(str)));
        if (klm(file)) {
            return dm.lmn(file);
        }
        String generateSecureRandomStr = RandomUtil.getInstance().generateSecureRandomStr(128);
        dm.lmn(file, generateSecureRandomStr);
        return generateSecureRandomStr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void lmn(String str, String str2) {
        File file = new File(klm(str));
        File file2 = new File(klm(str), "hianalytics_".concat(String.valueOf(str)));
        if (!file.exists() && file.mkdirs()) {
            HiLog.i("ComponentCommander", "file directory is mkdirs");
        }
        if (klm(file2)) {
            dm.lmn(file2, str2);
        } else {
            HiLog.w("ComponentCommander", "refreshComponent():file is not found,and file is create failed");
        }
    }
}
