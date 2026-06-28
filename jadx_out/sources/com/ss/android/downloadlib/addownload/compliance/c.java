package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: classes3.dex */
public class c extends com.ss.android.socialbase.downloader.i.h<Long, com.ss.android.downloadlib.addownload.b.b> {

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f9740a = new c();
    }

    public static c a() {
        return a.f9740a;
    }

    private c() {
        super(16, 16);
    }

    public void a(com.ss.android.downloadlib.addownload.b.b bVar) {
        if (bVar == null) {
            return;
        }
        put(Long.valueOf(bVar.a()), bVar);
    }

    public com.ss.android.downloadlib.addownload.b.b a(long j5, long j6) {
        return get(get(Long.valueOf(j5)) != null ? Long.valueOf(j5) : Long.valueOf(j6));
    }

    public com.ss.android.downloadlib.addownload.b.b a(long j5) {
        return get(Long.valueOf(j5));
    }
}
