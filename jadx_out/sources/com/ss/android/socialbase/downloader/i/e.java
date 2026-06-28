package com.ss.android.socialbase.downloader.i;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private a f10887a;

    /* renamed from: b, reason: collision with root package name */
    private a f10888b;

    /* renamed from: c, reason: collision with root package name */
    private int f10889c;

    /* renamed from: d, reason: collision with root package name */
    private int f10890d = 10;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f10891a;

        /* renamed from: b, reason: collision with root package name */
        long f10892b;

        /* renamed from: c, reason: collision with root package name */
        a f10893c;

        /* renamed from: d, reason: collision with root package name */
        a f10894d;

        private a() {
        }
    }

    public boolean a(long j5, long j6) {
        synchronized (this) {
            a aVar = this.f10887a;
            if (aVar != null) {
                if (j5 >= aVar.f10891a && j6 >= aVar.f10892b) {
                    a aVar2 = aVar.f10893c;
                    if (aVar2 != null && j6 - aVar2.f10892b < 1000) {
                        aVar.f10891a = j5;
                        aVar.f10892b = j6;
                        return true;
                    }
                }
                return false;
            }
            a a5 = a();
            a5.f10891a = j5;
            a5.f10892b = j6;
            if (aVar != null) {
                a5.f10893c = aVar;
                aVar.f10894d = a5;
            }
            this.f10887a = a5;
            return true;
        }
    }

    public long b(long j5, long j6) {
        synchronized (this) {
            a aVar = this.f10887a;
            if (aVar == null) {
                return -1L;
            }
            a a5 = a(j5);
            if (a5 == null) {
                return -1L;
            }
            long j7 = aVar.f10891a - a5.f10891a;
            long j8 = j6 - a5.f10892b;
            if (j7 < 0 || j8 <= 0) {
                return -1L;
            }
            return j7 / j8;
        }
    }

    private a a() {
        a aVar;
        int i5 = this.f10889c;
        if (i5 >= this.f10890d && (aVar = this.f10888b) != null) {
            a aVar2 = aVar.f10894d;
            aVar.f10894d = null;
            this.f10888b = aVar2;
            if (aVar2 != null) {
                aVar2.f10893c = null;
            }
            return aVar;
        }
        this.f10889c = i5 + 1;
        return new a();
    }

    private a a(long j5) {
        a aVar = this.f10887a;
        a aVar2 = null;
        while (aVar != null && aVar.f10892b > j5) {
            aVar2 = aVar;
            aVar = aVar.f10893c;
        }
        return (aVar == null || aVar2 == null || aVar == aVar2 || j5 - aVar.f10892b >= aVar2.f10892b - j5) ? aVar2 : aVar;
    }
}
