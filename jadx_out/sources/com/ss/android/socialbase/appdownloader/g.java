package com.ss.android.socialbase.appdownloader;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class g {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f10361a;

        /* renamed from: b, reason: collision with root package name */
        private String f10362b;

        /* renamed from: c, reason: collision with root package name */
        private Drawable f10363c;

        /* renamed from: d, reason: collision with root package name */
        private String f10364d;

        /* renamed from: e, reason: collision with root package name */
        private String f10365e;

        /* renamed from: f, reason: collision with root package name */
        private int f10366f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10367g;

        public a(String str, String str2, Drawable drawable, String str3, String str4, int i5, boolean z4) {
            b(str2);
            a(drawable);
            a(str);
            c(str3);
            d(str4);
            a(i5);
            a(z4);
        }

        public Drawable a() {
            return this.f10363c;
        }

        public boolean b() {
            return this.f10367g;
        }

        public String c() {
            return this.f10361a;
        }

        public String d() {
            return this.f10362b;
        }

        public String e() {
            return this.f10364d;
        }

        public int f() {
            return this.f10366f;
        }

        public String g() {
            return this.f10365e;
        }

        public String toString() {
            return "{\n  pkg name: " + c() + "\n  app icon: " + a() + "\n  app name: " + d() + "\n  app path: " + e() + "\n  app v name: " + g() + "\n  app v code: " + f() + "\n  is system: " + b() + a1.i.f138d;
        }

        public void a(Drawable drawable) {
            this.f10363c = drawable;
        }

        public void b(String str) {
            this.f10362b = str;
        }

        public void c(String str) {
            this.f10364d = str;
        }

        public void d(String str) {
            this.f10365e = str;
        }

        public void a(boolean z4) {
            this.f10367g = z4;
        }

        public void a(String str) {
            this.f10361a = str;
        }

        public void a(int i5) {
            this.f10366f = i5;
        }
    }

    public static int a(String str) {
        if (c(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = com.ss.android.socialbase.downloader.downloader.c.O().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public static a b(String str) {
        try {
            PackageManager packageManager = com.ss.android.socialbase.downloader.downloader.c.O().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return a(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static boolean c(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!Character.isWhitespace(str.charAt(i5))) {
                return false;
            }
        }
        return true;
    }

    private static a a(PackageManager packageManager, PackageInfo packageInfo) {
        Drawable drawable = null;
        if (packageInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String str = packageInfo.packageName;
        String charSequence = (applicationInfo == null || applicationInfo.loadLabel(packageManager) == null) ? "" : applicationInfo.loadLabel(packageManager).toString();
        try {
            drawable = applicationInfo.loadIcon(packageManager);
        } catch (Exception unused) {
        }
        return new a(str, charSequence, drawable, applicationInfo.sourceDir, packageInfo.versionName, packageInfo.versionCode, (applicationInfo.flags & 1) != 0);
    }
}
