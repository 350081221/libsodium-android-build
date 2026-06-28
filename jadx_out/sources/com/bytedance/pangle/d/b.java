package com.bytedance.pangle.d;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.g;
import com.bytedance.pangle.util.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f4314a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, Integer> f4315b;

    static {
        HashMap hashMap = new HashMap();
        f4315b = hashMap;
        hashMap.put("arm64-v8a", 64);
        f4315b.put("armeabi-v7a", 32);
        f4315b.put("armeabi", 32);
        f4315b.put("x86_64", 64);
        f4315b.put("x86", 32);
        f4315b.put("mips64", 64);
        f4315b.put("mips", 32);
        f4314a = c();
    }

    private static Map<String, List<ZipEntry>> a(ZipFile zipFile) {
        String[] split;
        HashMap hashMap = new HashMap();
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && !nextElement.getName().contains("../") && nextElement.getName().startsWith("lib/") && compile.matcher(nextElement.getName()).matches() && (split = nextElement.getName().split(File.separator)) != null && split.length >= 2) {
                String str = split[split.length - 2];
                if (f4315b.containsKey(str)) {
                    if (hashMap.get(str) == null) {
                        hashMap.put(str, new LinkedList());
                    }
                    ((List) hashMap.get(str)).add(nextElement);
                }
            }
        }
        ZeusLogger.i(ZeusLogger.TAG_SO, "NativeLibHelper getAllSoZipEntries, zipFile=" + zipFile.getName() + ", soEntries=" + hashMap.toString());
        return hashMap;
    }

    public static int b() {
        return f4315b.get(a()).intValue();
    }

    private static String c() {
        JSONObject d5 = d();
        String a5 = a(d5);
        if (a5 == null) {
            return b(d5);
        }
        return a5;
    }

    private static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("primaryCpuAbi", "0");
            jSONObject.put("processMode", "0");
            jSONObject.put("supportedABI0", "0");
            jSONObject.put("matchCpuAbi", "0");
            jSONObject.put("defaultABI0", "0");
            jSONObject.put("defaultABI", "0");
            jSONObject.put("autoError", "0");
            jSONObject.put("manualError", "0");
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    private static String b(JSONObject jSONObject) {
        HashSet hashSet;
        String[] strArr;
        try {
            ZipFile zipFile = new ZipFile(new File(Zeus.getAppApplication().getPackageManager().getPackageInfo(Zeus.getAppApplication().getPackageName(), 0).applicationInfo.sourceDir));
            hashSet = new HashSet(a(zipFile).keySet());
            try {
                zipFile.close();
            } catch (IOException unused) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual, close sourceApkZipFile error!");
            }
            strArr = i.a() ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        } catch (Throwable th) {
            ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual failed!", th);
            a(jSONObject, "manualError", "1");
        }
        if (hashSet.isEmpty()) {
            ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual, host source apk .so is empty, use supportedABIs[0]=" + strArr[0]);
            a(jSONObject, "supportedABI0", strArr[0]);
            return strArr[0];
        }
        for (String str : strArr) {
            if (hashSet.contains(str)) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper inferHostAbiManual, match cpuAbi=".concat(String.valueOf(str)));
                a(jSONObject, "matchCpuAbi", str);
                return str;
            }
        }
        if (i.a()) {
            String[] strArr2 = Build.SUPPORTED_ABIS;
            a(jSONObject, "defaultABI0", strArr2[0]);
            return strArr2[0];
        }
        String str2 = Build.CPU_ABI;
        a(jSONObject, "defaultABI", str2);
        return str2;
    }

    private static void a(Map<String, List<ZipEntry>> map, String str, List<ZipEntry> list, Set<String> set) {
        List<ZipEntry> list2 = map.get(str);
        if (list2 == null || list2.size() == 0) {
            return;
        }
        for (ZipEntry zipEntry : list2) {
            String substring = zipEntry.getName().substring(zipEntry.getName().lastIndexOf(File.separator) + 1);
            if (!set.contains(substring)) {
                list.add(zipEntry);
                set.add(substring);
            }
        }
    }

    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file) {
        String name = zipEntry.getName();
        if (name.contains("..")) {
            return;
        }
        File file2 = new File(file, name.substring(name.lastIndexOf(File.separator) + 1));
        int i5 = 0;
        boolean z4 = false;
        do {
            if (file2.exists()) {
                file2.delete();
            }
            try {
                ZeusLogger.i(ZeusLogger.TAG_INSTALL, "NativeLibHelper copySoZipEntry, soZipEntry=" + zipEntry + ", targetSoFile=" + file2);
                g.a(zipFile.getInputStream(zipEntry), new FileOutputStream(file2));
                z4 = true;
            } catch (IOException e5) {
                if (i5 >= 3) {
                    throw e5;
                }
                i5++;
            }
        } while (!z4);
    }

    public static boolean b(File file) {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e = e5;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && compile.matcher(nextElement.getName()).matches()) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (IOException unused) {
                        ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
            } catch (IOException unused2) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
            }
            return false;
        } catch (IOException e6) {
            e = e6;
            zipFile2 = zipFile;
            ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, get sourceApk ZipFile failed!", e);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused3) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper hasNativeLib, close sourceApkZipFile error!");
                }
            }
            throw th;
        }
    }

    public static String a() {
        String str = f4314a;
        if (str != null) {
            return str;
        }
        String c5 = c();
        f4314a = c5;
        return c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:4:0x000a, B:24:0x0044, B:12:0x0051, B:14:0x005c, B:16:0x006a, B:20:0x0074), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:4:0x000a, B:24:0x0044, B:12:0x0051, B:14:0x005c, B:16:0x006a, B:20:0x0074), top: B:3:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(org.json.JSONObject r5) {
        /*
            java.lang.String r0 = "primaryCpuAbi"
            java.lang.String r1 = "Zeus/so_pangle"
            boolean r2 = com.bytedance.pangle.util.i.a()
            if (r2 == 0) goto L8b
            android.app.Application r2 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Exception -> L7e
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r2 = com.bytedance.pangle.util.FieldUtils.readField(r2, r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "NativeLibHelper inferHostAbiAuto, primaryCpuAbi="
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Exception -> L7e
            com.bytedance.pangle.log.ZeusLogger.w(r1, r3)     // Catch: java.lang.Exception -> L7e
            a(r5, r0, r2)     // Catch: java.lang.Exception -> L7e
            if (r2 == 0) goto L8b
            boolean r0 = android.os.Process.is64Bit()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L33
            r0 = 64
            goto L35
        L33:
            r0 = 32
        L35:
            java.lang.String r3 = "NativeLibHelper inferHostAbiAuto, processMode="
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Exception -> L44
            com.bytedance.pangle.log.ZeusLogger.w(r1, r3)     // Catch: java.lang.Exception -> L44
            goto L51
        L43:
            r0 = 0
        L44:
            java.lang.String r3 = "NativeLibHelper inferHostAbiAuto, processMode exception default="
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Exception -> L7e
            com.bytedance.pangle.log.ZeusLogger.w(r1, r3)     // Catch: java.lang.Exception -> L7e
        L51:
            java.lang.String r3 = "processMode"
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L7e
            a(r5, r3, r4)     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L74
            java.util.Map<java.lang.String, java.lang.Integer> r3 = com.bytedance.pangle.d.b.f4315b     // Catch: java.lang.Exception -> L7e
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L7e
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L7e
            if (r3 != r0) goto L8b
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto2, sHostAbi="
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L7e
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L7e
            return r2
        L74:
            java.lang.String r0 = "NativeLibHelper inferHostAbiAuto1, sHostAbi="
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L7e
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)     // Catch: java.lang.Exception -> L7e
            return r2
        L7e:
            r0 = move-exception
            java.lang.String r2 = "NativeLibHelper inferHostAbiAuto failed!"
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)
            java.lang.String r0 = "autoError"
            java.lang.String r1 = "1"
            a(r5, r0, r1)
        L8b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.d.b.a(org.json.JSONObject):java.lang.String");
    }

    public static com.bytedance.pangle.util.e<Boolean, Map<String, List<ZipEntry>>> a(File file) {
        ZipFile zipFile;
        boolean z4;
        HashMap hashMap = new HashMap();
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e = e5;
        }
        try {
            hashMap.putAll(a(zipFile));
            if (hashMap.isEmpty()) {
                ZeusLogger.i(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi [true] soEntries empty, ".concat(String.valueOf(file)));
                z4 = true;
            } else {
                boolean a5 = a(hashMap, f4314a);
                if (a5) {
                    ZeusLogger.i(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi [" + a5 + "], " + file);
                } else {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi [" + a5 + "], " + file);
                }
                z4 = a5;
            }
            com.bytedance.pangle.util.e<Boolean, Map<String, List<ZipEntry>>> eVar = new com.bytedance.pangle.util.e<>(Boolean.valueOf(z4), hashMap);
            try {
                zipFile.close();
            } catch (IOException unused) {
                ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!");
            }
            return eVar;
        } catch (IOException e6) {
            e = e6;
            zipFile2 = zipFile;
            ZeusLogger.errReport(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, get sourceApk ZipFile failed!", e);
            com.bytedance.pangle.util.e<Boolean, Map<String, List<ZipEntry>>> eVar2 = new com.bytedance.pangle.util.e<>(Boolean.FALSE, hashMap);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused2) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!");
                }
            }
            return eVar2;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused3) {
                    ZeusLogger.w(ZeusLogger.TAG_SO, "NativeLibHelper isPluginApkMatchHostAbi, close sourceApkZipFile error!");
                }
            }
            throw th;
        }
    }

    private static boolean a(Map<String, List<ZipEntry>> map, String str) {
        if (TextUtils.equals(str, "armeabi") || TextUtils.equals(str, "armeabi-v7a")) {
            return map.containsKey("armeabi") || map.containsKey("armeabi-v7a");
        }
        return map.containsKey(str);
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
    
        if (r1.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        if (r17.exists() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
    
        r17.mkdirs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015d, code lost:
    
        if (r1.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        a(r2, (java.util.zip.ZipEntry) r1.next(), r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.File r16, java.io.File r17, java.lang.String r18, java.util.Map<java.lang.String, java.util.List<java.util.zip.ZipEntry>> r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.d.b.a(java.io.File, java.io.File, java.lang.String, java.util.Map):void");
    }
}
