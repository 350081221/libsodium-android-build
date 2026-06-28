package org.osmdroid.tileprovider.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21830a = "sdCard";

    /* renamed from: b, reason: collision with root package name */
    public static final String f21831b = "externalSdCard";

    /* renamed from: c, reason: collision with root package name */
    private static final String f21832c = "StorageUtils";

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f21833a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21834b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21835c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21836d;

        /* renamed from: e, reason: collision with root package name */
        public long f21837e;

        /* renamed from: f, reason: collision with root package name */
        public String f21838f;

        public a(String str, boolean z4, boolean z5, int i5) {
            this.f21837e = 0L;
            this.f21833a = str;
            this.f21834b = z4;
            this.f21836d = i5;
            this.f21837e = new StatFs(str).getAvailableBytes();
            if (!z5) {
                this.f21835c = !b.p(new File(str));
            }
            StringBuilder sb = new StringBuilder();
            if (z4) {
                sb.append("Internal SD card");
            } else if (i5 > 1) {
                sb.append("SD card ");
                sb.append(i5);
            } else {
                sb.append("SD card");
            }
            if (z5) {
                sb.append(" (Read only)");
            }
            this.f21838f = sb.toString();
        }

        public String a() {
            return this.f21838f;
        }

        public void b(String str) {
            this.f21838f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f21834b != aVar.f21834b || this.f21835c != aVar.f21835c || this.f21836d != aVar.f21836d || this.f21837e != aVar.f21837e) {
                return false;
            }
            String str = this.f21833a;
            if (str == null ? aVar.f21833a != null : !str.equals(aVar.f21833a)) {
                return false;
            }
            String str2 = this.f21838f;
            String str3 = aVar.f21838f;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i5;
            String str = this.f21833a;
            int i6 = 0;
            if (str != null) {
                i5 = str.hashCode();
            } else {
                i5 = 0;
            }
            int i7 = ((((((i5 * 31) + (this.f21834b ? 1 : 0)) * 31) + (this.f21835c ? 1 : 0)) * 31) + this.f21836d) * 31;
            long j5 = this.f21837e;
            int i8 = (i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            String str2 = this.f21838f;
            if (str2 != null) {
                i6 = str2.hashCode();
            }
            return i8 + i6;
        }
    }

    public static Map<String, File> a() {
        HashMap hashMap = new HashMap(10);
        hashMap.putAll(r());
        if (!hashMap.containsValue(Environment.getExternalStorageDirectory())) {
            hashMap.put(f21830a, Environment.getExternalStorageDirectory());
        }
        for (File file : s()) {
            if (file.exists() && !hashMap.containsValue(file)) {
                hashMap.put(f21830a, file);
            }
        }
        return hashMap;
    }

    private static Set<File> b() {
        HashSet hashSet = new HashSet();
        for (File file : s()) {
            if (p(file)) {
                hashSet.add(file);
            }
        }
        if (Environment.getExternalStorageDirectory() != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (p(externalStorageDirectory)) {
                hashSet.add(externalStorageDirectory);
            }
        }
        for (File file2 : r().values()) {
            if (p(file2)) {
                hashSet.add(file2);
            }
        }
        return hashSet;
    }

    public static a c() {
        return d(null);
    }

    public static a d(Context context) {
        List<a> j5 = j(context);
        a aVar = null;
        for (int i5 = 0; i5 < j5.size(); i5++) {
            a aVar2 = j5.get(i5);
            if (!aVar2.f21835c && p(new File(aVar2.f21833a)) && (aVar == null || aVar.f21837e < aVar2.f21837e)) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private static a e() {
        boolean z4;
        String str = "";
        try {
            if (Environment.getExternalStorageDirectory() != null) {
                str = Environment.getExternalStorageDirectory().getPath();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean z5 = false;
        boolean z6 = true;
        try {
            z4 = !Environment.isExternalStorageRemovable();
        } catch (Throwable th2) {
            th2.printStackTrace();
            z4 = false;
        }
        try {
            z5 = n();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            z6 = Environment.getExternalStorageState().equals("mounted_ro");
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        if (z5) {
            return new a(str, z4, z6, -1);
        }
        return null;
    }

    @Deprecated
    public static String f() {
        return Environment.getExternalStorageDirectory().getPath() + "/";
    }

    @Deprecated
    public static File g() {
        return h(null);
    }

    @Deprecated
    public static File h(Context context) {
        a d5 = d(context);
        if (d5 != null) {
            return new File(d5.f21833a);
        }
        return null;
    }

    public static List<a> i() {
        return j(null);
    }

    public static List<a> j(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (context != null) {
                return k(context);
            }
            return l();
        }
        List<a> l5 = l();
        if (context != null) {
            List<a> k5 = k(context);
            k5.removeAll(l5);
            l5.addAll(k5);
        }
        return l5;
    }

    @SuppressLint({"NewApi"})
    private static List<a> k(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(context.getFilesDir().getAbsolutePath(), true, false, -1));
        ArrayList arrayList2 = new ArrayList();
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null && "mounted".equals(Environment.getStorageState(file))) {
                arrayList2.add(file);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((File) it.next()).getAbsolutePath(), false, false, -1));
        }
        return arrayList;
    }

    private static List<a> l() {
        String str;
        boolean z4;
        ArrayList arrayList = new ArrayList();
        a e5 = e();
        if (e5 != null) {
            arrayList.add(e5);
        }
        if (e5 != null) {
            str = e5.f21833a;
        } else {
            str = "";
        }
        arrayList.addAll(q(str));
        for (File file : b()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).f21833a.equals(file.getAbsolutePath())) {
                        z4 = true;
                        break;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                arrayList.add(new a(file.getAbsolutePath(), false, false, -1));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static boolean m() {
        return n();
    }

    private static boolean n() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean o() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean p(File file) {
        FileOutputStream fileOutputStream = null;
        try {
            File file2 = new File(file.getAbsolutePath() + File.separator + UUID.randomUUID().toString());
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                fileOutputStream2.write("hi".getBytes());
                file2.delete();
                Log.i(f21832c, file.getAbsolutePath() + " is writable");
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (Throwable unused2) {
                fileOutputStream = fileOutputStream2;
                try {
                    Log.i(f21832c, file.getAbsolutePath() + " is NOT writable");
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return false;
                        } catch (IOException unused3) {
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused5) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e6, code lost:
    
        if (r3 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00de, code lost:
    
        r3.close();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00dc, code lost:
    
        if (r3 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<org.osmdroid.tileprovider.util.b.a> q(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.b.q(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b6, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ad, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ae, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0180, code lost:
    
        if (r8 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0185, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0182, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00b4, code lost:
    
        if (r8 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0058, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0064, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r10 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r10 = new java.io.File("/system/etc/vold.fstab");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r10.exists() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r11 = new java.util.Scanner(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r8 = r11.nextLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r8.startsWith("dev_mount") != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        r8 = r8.split(" ")[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r8.contains(":") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r8 = r8.substring(0, r8.indexOf(":"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if (r8.equals("/mnt/sdcard") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r8 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        if (r5.contains((java.lang.String) r3.get(r0)) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        r3.remove(r0);
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r5.clear();
        r0 = new java.util.ArrayList(10);
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
    
        r5 = new java.io.File((java.lang.String) r3.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
    
        if (r5.exists() != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010e, code lost:
    
        r4 = r5.listFiles();
        r6 = new java.lang.StringBuilder("[");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0119, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        r8 = r4.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        r11 = r4[r10];
        r6.append(r11.getName().hashCode());
        r6.append(":");
        r6.append(r11.length());
        r6.append(", ");
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
    
        r6.append("]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014b, code lost:
    
        if (r0.contains(r6.toString()) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:
    
        r4 = "sdCard_" + r2.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0166, code lost:
    
        if (r2.size() == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0168, code lost:
    
        r4 = org.osmdroid.tileprovider.util.b.f21830a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0173, code lost:
    
        r0.add(r6.toString());
        r2.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016f, code lost:
    
        if (r2.size() == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0171, code lost:
    
        r4 = org.osmdroid.tileprovider.util.b.f21831b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017f, code lost:
    
        return r2;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0187: MOVE (r8 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:392), block:B:126:0x0187 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.String, java.io.File> r() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.util.b.r():java.util.Map");
    }

    private static Set<File> s() {
        HashSet hashSet = new HashSet();
        String str = System.getenv("EXTERNAL_STORAGE");
        if (str != null) {
            hashSet.add(new File(str + File.separator));
        }
        String str2 = System.getenv("SECONDARY_STORAGE");
        if (str2 != null) {
            for (String str3 : str2.split(File.pathSeparator)) {
                hashSet.add(new File(str3 + File.separator));
            }
        }
        return hashSet;
    }
}
