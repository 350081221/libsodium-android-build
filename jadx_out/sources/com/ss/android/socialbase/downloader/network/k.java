package com.ss.android.socialbase.downloader.network;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11191a = "k";

    /* renamed from: b, reason: collision with root package name */
    private final d f11192b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f11193c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<l> f11194d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicReference<l> f11195e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<b> f11196f;

    /* renamed from: g, reason: collision with root package name */
    private int f11197g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.network.k$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11198a;

        static {
            int[] iArr = new int[l.values().length];
            f11198a = iArr;
            try {
                iArr[l.POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11198a[l.MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11198a[l.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11198a[l.EXCELLENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f11199a = new k(null);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(l lVar);
    }

    /* synthetic */ k(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static k a() {
        return a.f11199a;
    }

    private boolean c() {
        double d5;
        if (this.f11192b == null) {
            return false;
        }
        try {
            int i5 = AnonymousClass1.f11198a[this.f11194d.get().ordinal()];
            double d6 = 150.0d;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            return true;
                        }
                        d6 = 3.4028234663852886E38d;
                        d5 = 2000.0d;
                    } else {
                        d5 = 550.0d;
                        d6 = 2000.0d;
                    }
                } else {
                    d6 = 550.0d;
                    d5 = 150.0d;
                }
            } else {
                d5 = 0.0d;
            }
            double a5 = this.f11192b.a();
            if (a5 > d6) {
                if (a5 > d6 * 1.25d) {
                    return true;
                }
            } else if (a5 < d5 * 0.8d) {
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    private void d() {
        try {
            int size = this.f11196f.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f11196f.get(i5).a(this.f11194d.get());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public synchronized l b() {
        d dVar = this.f11192b;
        if (dVar == null) {
            return l.UNKNOWN;
        }
        try {
            return a(dVar.a());
        } catch (Throwable th) {
            th.printStackTrace();
            return l.UNKNOWN;
        }
    }

    private k() {
        this.f11192b = new d(0.05d);
        this.f11193c = false;
        this.f11194d = new AtomicReference<>(l.UNKNOWN);
        this.f11196f = new ArrayList<>();
    }

    public synchronized void a(long j5, long j6) {
        l b5;
        double d5 = ((j5 * 1.0d) / j6) * 8.0d;
        if (j6 == 0 || d5 < 3.0d) {
            return;
        }
        try {
            this.f11192b.a(d5);
            b5 = b();
        } catch (Throwable unused) {
        }
        if (this.f11193c) {
            this.f11197g++;
            if (b5 != this.f11195e.get()) {
                this.f11193c = false;
                this.f11197g = 1;
            }
            if (this.f11197g >= 5.0d && c()) {
                this.f11193c = false;
                this.f11197g = 1;
                this.f11194d.set(this.f11195e.get());
                d();
            }
            return;
        }
        if (this.f11194d.get() != b5) {
            this.f11193c = true;
            this.f11195e = new AtomicReference<>(b5);
        }
    }

    private l a(double d5) {
        if (d5 < 0.0d) {
            return l.UNKNOWN;
        }
        if (d5 < 150.0d) {
            return l.POOR;
        }
        if (d5 < 550.0d) {
            return l.MODERATE;
        }
        if (d5 < 2000.0d) {
            return l.GOOD;
        }
        return l.EXCELLENT;
    }
}
