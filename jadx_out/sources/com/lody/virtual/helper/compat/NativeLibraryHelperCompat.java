package com.lody.virtual.helper.compat;

import com.lody.virtual.helper.utils.VLog;
import java.io.File;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import mirror.com.android.internal.content.NativeLibraryHelper;

/* loaded from: classes3.dex */
public class NativeLibraryHelperCompat {
    private static String TAG = "NativeLibraryHelperCompat";
    private Object handle;

    public NativeLibraryHelperCompat(File file) {
        try {
            this.handle = NativeLibraryHelper.Handle.create.callWithException(file);
        } catch (Throwable th) {
            VLog.e(TAG, "failed to create NativeLibraryHelper handle.");
            th.printStackTrace();
        }
    }

    public static String findSupportedAbi(String[] strArr, Set<String> set) {
        for (String str : strArr) {
            if (set.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public static Set<String> getPackageAbiList(String str) {
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(str).entries();
            HashSet hashSet = new HashSet();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                if (!name.contains("../") && name.startsWith("lib/") && !nextElement.isDirectory() && name.endsWith(".so")) {
                    hashSet.add(name.substring(name.indexOf("/") + 1, name.lastIndexOf("/")));
                }
            }
            return hashSet;
        } catch (Exception e5) {
            e5.printStackTrace();
            return Collections.emptySet();
        }
    }

    public static boolean is64bitAbi(String str) {
        if (str == null || str.isEmpty() || "arm64-v8a".equals(str) || "x86_64".equals(str) || "mips64".equals(str)) {
            return true;
        }
        return false;
    }

    public int copyNativeBinaries(File file, String str) {
        try {
            return NativeLibraryHelper.copyNativeBinaries.callWithException(this.handle, file, str).intValue();
        } catch (Throwable th) {
            VLog.e(TAG, "failed to copyNativeBinaries.");
            th.printStackTrace();
            return -1;
        }
    }
}
