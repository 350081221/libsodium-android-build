package com.ss.android.downloadlib.addownload.b;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SharedLibraryInfo;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.k;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f9649a;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f9650c = {"com", SharedLibraryInfo.PLATFORM_PACKAGE_NAME, "ss"};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f9651d = {3101, 3102, 3103, 3201, 3202, 3203};

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList<a> f9652b = new LinkedList<>();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f9653a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9654b;

        /* renamed from: c, reason: collision with root package name */
        public final String f9655c;

        /* renamed from: d, reason: collision with root package name */
        public final String f9656d;

        /* renamed from: e, reason: collision with root package name */
        public final long f9657e;

        private a(String str, int i5, String str2, String str3, long j5) {
            this.f9653a = str;
            this.f9654b = i5;
            this.f9655c = str2 != null ? str2.toLowerCase() : null;
            this.f9656d = str3 != null ? str3.toLowerCase() : null;
            this.f9657e = j5;
        }
    }

    private d() {
    }

    public static d a() {
        if (f9649a == null) {
            synchronized (d.class) {
                if (f9649a == null) {
                    f9649a = new d();
                }
            }
        }
        return f9649a;
    }

    private a c(String str) {
        try {
            PackageManager packageManager = k.a().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return new a(str, packageInfo.versionCode, packageInfo.versionName, (String) packageManager.getApplicationLabel(packageInfo.applicationInfo), System.currentTimeMillis());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void b(String str) {
        b();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f9652b) {
            Iterator<a> it = this.f9652b.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().f9653a)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public void a(String str) {
        a c5;
        b();
        if (TextUtils.isEmpty(str) || (c5 = c(str)) == null) {
            return;
        }
        synchronized (this.f9652b) {
            this.f9652b.add(c5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        r7[1] = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<com.ss.android.downloadlib.addownload.b.d.a, java.lang.Integer> b(com.ss.android.downloadad.api.a.b r18) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.b.d.b(com.ss.android.downloadad.api.a.b):android.util.Pair");
    }

    public a a(com.ss.android.downloadad.api.a.b bVar) {
        if (bVar == null) {
            return null;
        }
        b();
        synchronized (this.f9652b) {
            Iterator<a> it = this.f9652b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f9657e > bVar.C()) {
                    return next;
                }
            }
            return null;
        }
    }

    private static boolean a(String str, String str2) {
        String[] split;
        String[] split2;
        boolean z4;
        try {
            split = str.split("\\.");
            split2 = str2.split("\\.");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (split.length != 0 && split2.length != 0) {
            int i5 = 0;
            int i6 = 0;
            for (String str3 : split) {
                String[] strArr = f9650c;
                int length = strArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        z4 = false;
                        break;
                    }
                    String str4 = strArr[i7];
                    if (str4.equals(str3)) {
                        if (i5 < split2.length && str4.equals(split2[i5])) {
                            i5++;
                        }
                        z4 = true;
                    } else {
                        i7++;
                    }
                }
                if (!z4) {
                    int i8 = i6;
                    int i9 = i5;
                    while (i5 < split2.length) {
                        if (str3.equals(split2[i5])) {
                            if (i5 == i9) {
                                i9++;
                            }
                            i8++;
                            if (i8 >= 2) {
                                return true;
                            }
                        }
                        i5++;
                    }
                    i5 = i9;
                    i6 = i8;
                }
            }
            return false;
        }
        return false;
    }

    private void b() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f9652b) {
            Iterator<a> it = this.f9652b.iterator();
            while (it.hasNext() && currentTimeMillis - it.next().f9657e > 1800000) {
                it.remove();
            }
        }
    }
}
