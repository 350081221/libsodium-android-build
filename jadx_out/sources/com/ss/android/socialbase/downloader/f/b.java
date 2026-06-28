package com.ss.android.socialbase.downloader.f;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
class b implements c, d, e {

    /* renamed from: a, reason: collision with root package name */
    private final int f10707a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10708b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f10709c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f10710d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private a f10711e;

    /* renamed from: f, reason: collision with root package name */
    private a f10712f;

    /* renamed from: g, reason: collision with root package name */
    private a f10713g;

    /* renamed from: h, reason: collision with root package name */
    private a f10714h;

    /* renamed from: i, reason: collision with root package name */
    private a f10715i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f10716j;

    /* renamed from: k, reason: collision with root package name */
    private int f10717k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i5, int i6) {
        i5 = i5 < 64 ? 64 : i5;
        i6 = i6 < 8192 ? 8192 : i6;
        this.f10707a = i5;
        this.f10708b = i6;
    }

    @Override // com.ss.android.socialbase.downloader.f.d
    @NonNull
    public a a() throws p, InterruptedException {
        a aVar;
        a aVar2 = this.f10715i;
        if (aVar2 != null) {
            this.f10715i = aVar2.f10706d;
            aVar2.f10706d = null;
            return aVar2;
        }
        synchronized (this.f10710d) {
            aVar = this.f10713g;
            while (aVar == null) {
                if (!this.f10716j) {
                    this.f10710d.wait();
                    aVar = this.f10713g;
                } else {
                    throw new p("read");
                }
            }
            this.f10715i = aVar.f10706d;
            this.f10714h = null;
            this.f10713g = null;
            aVar.f10706d = null;
        }
        return aVar;
    }

    @Override // com.ss.android.socialbase.downloader.f.c
    @NonNull
    public a b() throws p, InterruptedException {
        synchronized (this.f10709c) {
            if (!this.f10716j) {
                a aVar = this.f10711e;
                if (aVar == null) {
                    int i5 = this.f10717k;
                    if (i5 < this.f10707a) {
                        this.f10717k = i5 + 1;
                        return new a(this.f10708b);
                    }
                    do {
                        this.f10709c.wait();
                        if (!this.f10716j) {
                            aVar = this.f10711e;
                        } else {
                            throw new p("obtain");
                        }
                    } while (aVar == null);
                }
                this.f10711e = aVar.f10706d;
                if (aVar == this.f10712f) {
                    this.f10712f = null;
                }
                aVar.f10706d = null;
                return aVar;
            }
            throw new p("obtain");
        }
    }

    public void c() {
        this.f10716j = true;
        synchronized (this.f10709c) {
            this.f10709c.notifyAll();
        }
        synchronized (this.f10710d) {
            this.f10710d.notifyAll();
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.c
    public void a(@NonNull a aVar) {
        synchronized (this.f10709c) {
            a aVar2 = this.f10712f;
            if (aVar2 == null) {
                this.f10712f = aVar;
                this.f10711e = aVar;
            } else {
                aVar2.f10706d = aVar;
                this.f10712f = aVar;
            }
            this.f10709c.notify();
        }
    }

    @Override // com.ss.android.socialbase.downloader.f.e
    public void b(@NonNull a aVar) {
        synchronized (this.f10710d) {
            a aVar2 = this.f10714h;
            if (aVar2 == null) {
                this.f10714h = aVar;
                this.f10713g = aVar;
                this.f10710d.notify();
            } else {
                aVar2.f10706d = aVar;
                this.f10714h = aVar;
            }
        }
    }
}
