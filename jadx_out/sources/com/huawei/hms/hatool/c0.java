package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public String f8526a = b.i().getFilesDir().getPath();

    public static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    y.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    public static boolean d() {
        return b(new File(b.i().getFilesDir().getPath() + "/hms"));
    }

    public String a() {
        String b5;
        String b6;
        String b7;
        String b8;
        String c5 = c();
        if (b()) {
            y.c("hmsSdk", "refresh components");
            b5 = f2.b.e(128);
            a("aprpap", b5);
            b6 = f2.b.e(128);
            a("febdoc", b6);
            b7 = f2.b.e(128);
            a("marfil", b7);
            b8 = f2.b.e(128);
            a("maywnj", b8);
            g0.b(b.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            b5 = b("aprpap");
            b6 = b("febdoc");
            b7 = b("marfil");
            b8 = b("maywnj");
        }
        return f2.c.b(b2.c.c(a(b5, b6, b7, c5), f2.c.c(b8), 10000, 16));
    }

    public final String a(String str) {
        return this.f8526a + "/hms/component/".replace("component", str);
    }

    public final void a(String str, String str2) {
        File file = new File(a(str));
        File file2 = new File(a(str), "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            y.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            t0.a(file2, str2);
        } else {
            y.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    public final boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            y.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    public final char[] a(String str, String str2, String str3, String str4) {
        byte[] c5 = f2.c.c(str);
        byte[] c6 = f2.c.c(str2);
        byte[] c7 = f2.c.c(str3);
        byte[] c8 = f2.c.c(str4);
        int length = c5.length;
        if (length > c6.length) {
            length = c6.length;
        }
        if (length > c7.length) {
            length = c7.length;
        }
        if (length > c8.length) {
            length = c8.length;
        }
        char[] cArr = new char[length];
        for (int i5 = 0; i5 < length; i5++) {
            cArr[i5] = (char) (((c5[i5] ^ c6[i5]) ^ c7[i5]) ^ c8[i5]);
        }
        return cArr;
    }

    public final String b(String str) {
        File file = new File(a(str), "hianalytics_" + str);
        if (a(file)) {
            return t0.a(file);
        }
        String e5 = f2.b.e(128);
        t0.a(file, e5);
        return e5;
    }

    public final boolean b() {
        long a5 = g0.a(b.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a5) {
            return System.currentTimeMillis() - a5 > OpenStreetMapTileProviderConstants.ONE_YEAR;
        }
        y.c("hmsSdk", "First init components");
        return true;
    }

    public final String c() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }
}
