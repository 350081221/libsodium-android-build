package com.tendcloud.tenddata;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes3.dex */
final class av {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11436a = "mPBE";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11437b = "_Ladder_Project";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11438c = "Pythagoras_phase";

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b5 : bArr) {
            sb.append((int) b5);
            sb.append(",");
        }
        a(ab.f11351g.getFilesDir() + File.separator + f11436a, str, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, String str2) {
        a(ab.f11351g.getFilesDir().getPath(), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str, String str2) {
        System.getProperties().setProperty(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r4 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String d(java.lang.String r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            java.lang.String r1 = ""
            if (r4 != 0) goto L1a
            boolean r4 = r0.isDirectory()
            if (r4 != 0) goto L1a
            boolean r4 = r0.mkdirs()
            if (r4 != 0) goto L1a
            return r1
        L1a:
            r4 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r0, r5)     // Catch: java.lang.Throwable -> L4f
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L42
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            long r2 = r2.length()     // Catch: java.lang.Throwable -> L40
            int r4 = (int) r2     // Catch: java.lang.Throwable -> L40
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L40
            int r0 = r5.read(r4)     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L3e
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L40
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L40
            r1 = r0
        L3e:
            r4 = r5
            goto L49
        L40:
            r4 = r5
            goto L4f
        L42:
            boolean r5 = r2.createNewFile()     // Catch: java.lang.Throwable -> L4f
            if (r5 != 0) goto L49
            return r1
        L49:
            if (r4 == 0) goto L52
        L4b:
            r4.close()     // Catch: java.lang.Throwable -> L52
            goto L52
        L4f:
            if (r4 == 0) goto L52
            goto L4b
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.av.d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return System.getProperties().getProperty(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        return d(ab.f11351g.getFilesDir().getPath(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2) {
        a(ab.f11351g.getFilesDir() + File.separator + f11437b, str, str2);
    }

    private static void a(String str, String str2, String str3) {
        File file;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                file = new File(str);
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable unused2) {
        }
        if (file.exists() || file.isDirectory() || file.mkdirs()) {
            File file2 = new File(file, str2);
            if (file2.exists() || file2.createNewFile()) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    fileOutputStream2.write(str3.getBytes());
                    fileOutputStream2.close();
                } catch (Throwable unused3) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(String str, int i5) {
        SharedPreferences sharedPreferences = ab.f11351g.getSharedPreferences(f11436a, 0);
        String string = sharedPreferences.getString(str, "");
        String str2 = ab.f11351g.getFilesDir() + File.separator + f11436a;
        String d5 = d(str2, str);
        if (y.b(d5)) {
            if (y.b(string)) {
                return null;
            }
            a(str2, str, string);
            sharedPreferences.edit().putString(str, "").apply();
            return a(i5, string);
        }
        return a(i5, d5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        SharedPreferences sharedPreferences = ab.f11351g.getSharedPreferences(f11438c, 0);
        String string = sharedPreferences.getString(str, "");
        String str2 = ab.f11351g.getFilesDir() + File.separator + f11437b;
        String d5 = d(str2, str);
        if (!y.b(d5) || y.b(string)) {
            return d5;
        }
        a(str2, str, string);
        sharedPreferences.edit().putString(str, "").apply();
        return string;
    }

    private static byte[] a(int i5, String str) {
        try {
            if (y.b(str)) {
                return null;
            }
            byte[] bArr = new byte[i5];
            String[] split = str.split(",");
            for (int i6 = 0; i6 < split.length; i6++) {
                bArr[i6] = Byte.parseByte(split[i6]);
            }
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }
}
