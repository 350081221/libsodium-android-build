package com.ss.android.socialbase.downloader.impls;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.downloader.m f11027a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.downloader.m f11028b;

    public static com.ss.android.socialbase.downloader.downloader.m a(boolean z4) {
        if (z4 && com.ss.android.socialbase.downloader.downloader.c.T()) {
            if (f11028b == null) {
                synchronized (l.class) {
                    if (f11028b == null) {
                        f11028b = com.ss.android.socialbase.downloader.downloader.c.U().b();
                    }
                }
            }
            return f11028b;
        }
        if (f11027a == null) {
            synchronized (l.class) {
                if (f11027a == null) {
                    f11027a = new p();
                }
            }
        }
        return f11027a;
    }
}
