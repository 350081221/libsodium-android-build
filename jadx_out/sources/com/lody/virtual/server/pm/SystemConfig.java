package com.lody.virtual.server.pm;

import com.lody.virtual.helper.utils.VLog;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SystemConfig {
    private static final String TAG = "SystemConfig";
    private final Map<String, SharedLibraryEntry> mSharedLibraries = new HashMap();

    /* loaded from: classes3.dex */
    public static class SharedLibraryEntry {
        public String[] dependencies;
        public String name;
        public String path;

        public SharedLibraryEntry(String str, String str2, String[] strArr) {
            this.name = str;
            this.path = str2;
            this.dependencies = strArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readPermissionsFromXml(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.pm.SystemConfig.readPermissionsFromXml(java.io.File):void");
    }

    public SharedLibraryEntry getSharedLibrary(String str) {
        return this.mSharedLibraries.get(str);
    }

    public void load() {
        long currentTimeMillis = System.currentTimeMillis();
        readSharedLibraries(new File("/etc/permissions/"));
        VLog.e(TAG, "load cost time: " + (System.currentTimeMillis() - currentTimeMillis) + "ms.");
    }

    public void readSharedLibraries(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isFile() && file2.getName().endsWith(".xml")) {
                readPermissionsFromXml(file2);
            }
        }
    }
}
