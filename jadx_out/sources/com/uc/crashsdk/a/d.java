package com.uc.crashsdk.a;

import android.content.pm.SharedLibraryInfo;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f11900a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f11901b = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f11903d = false;

    /* renamed from: e, reason: collision with root package name */
    private static String f11904e = "hsdk";

    /* renamed from: f, reason: collision with root package name */
    private static String f11905f = "alid ";

    /* renamed from: g, reason: collision with root package name */
    private static String f11906g;

    /* renamed from: i, reason: collision with root package name */
    private static String f11908i;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f11902c = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f11907h = new Object();

    public static void a() {
        f.a(0, new e(500), com.uc.crashsdk.b.H() ? 900000L : 90000L);
    }

    public static String b() {
        try {
            return "inv" + f11905f + "cras" + f11904e;
        } catch (Throwable th) {
            g.b(th);
            return "";
        }
    }

    public static void c() {
        synchronized (f11907h) {
            f11908i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] d() {
        return new byte[]{6, 0, 23, 8};
    }

    public static boolean e() {
        if (!com.uc.crashsdk.e.F() && !com.uc.crashsdk.b.L()) {
            a(true);
            return f11901b;
        }
        return true;
    }

    private static String f() {
        String str = f11908i;
        if (g.a(str)) {
            synchronized (f11907h) {
                String str2 = "https://errlog.umeng.com";
                if (com.uc.crashsdk.g.R()) {
                    str2 = "https://errlogos.umeng.com";
                }
                str = g.a(com.uc.crashsdk.b.j(), str2 + "/api/crashsdk/validate", true);
                f11908i = str;
            }
        }
        return str;
    }

    private static String g() {
        String str;
        byte[] bArr;
        String f5;
        byte[] a5;
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        a(sb, EventType.PLATFORM, com.uc.crashsdk.g.e());
        a(sb, "pkgname", com.uc.crashsdk.a.f11869a);
        a(sb, UMModuleRegister.PROCESS, com.uc.crashsdk.e.h());
        a(sb, "version", com.uc.crashsdk.a.a());
        a(sb, "cver", "3.3.2.2");
        a(sb, "ctag", "release");
        if (com.uc.crashsdk.g.R()) {
            str = "true";
        } else {
            str = "false";
        }
        a(sb, "inter", str);
        a(sb, bi.f12278x, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        String sb2 = sb.toString();
        byte[] bArr3 = new byte[16];
        c.a(bArr3, 0, h.j());
        c.a(bArr3, 4, c.a());
        c.a(bArr3, 8, d());
        c.a(bArr3, 12, com.uc.crashsdk.a.f());
        try {
            bArr = c.a(sb2.getBytes(), bArr3, true);
        } catch (Throwable th) {
            g.a(th);
            bArr = null;
        }
        if (bArr == null || (f5 = f()) == null || (a5 = c.a(f5, bArr)) == null) {
            return null;
        }
        try {
            bArr2 = c.a(a5, bArr3, false);
        } catch (Throwable th2) {
            g.a(th2);
            bArr2 = null;
        }
        if (bArr2 == null) {
            return null;
        }
        return new String(bArr2);
    }

    public static void a(int i5) {
        if (i5 != 500) {
            if (!f11900a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f11902c) {
            f11906g = null;
            a(!com.uc.crashsdk.b.F());
            if (g.b(f11906g)) {
                h.a(f11906g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(boolean r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.d.a(boolean):boolean");
    }

    private static StringBuilder a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        sb.append(str);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(str2);
        return sb;
    }
}
