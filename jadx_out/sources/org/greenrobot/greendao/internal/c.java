package org.greenrobot.greendao.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private a<T>[] f21374a;

    /* renamed from: b, reason: collision with root package name */
    private int f21375b;

    /* renamed from: c, reason: collision with root package name */
    private int f21376c;

    /* renamed from: d, reason: collision with root package name */
    private int f21377d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        final long f21378a;

        /* renamed from: b, reason: collision with root package name */
        T f21379b;

        /* renamed from: c, reason: collision with root package name */
        a<T> f21380c;

        a(long j5, T t5, a<T> aVar) {
            this.f21378a = j5;
            this.f21379b = t5;
            this.f21380c = aVar;
        }
    }

    public c() {
        this(16);
    }

    public void a() {
        this.f21377d = 0;
        Arrays.fill(this.f21374a, (Object) null);
    }

    public boolean b(long j5) {
        for (a<T> aVar = this.f21374a[((((int) (j5 >>> 32)) ^ ((int) j5)) & Integer.MAX_VALUE) % this.f21375b]; aVar != null; aVar = aVar.f21380c) {
            if (aVar.f21378a == j5) {
                return true;
            }
        }
        return false;
    }

    public T c(long j5) {
        for (a<T> aVar = this.f21374a[((((int) (j5 >>> 32)) ^ ((int) j5)) & Integer.MAX_VALUE) % this.f21375b]; aVar != null; aVar = aVar.f21380c) {
            if (aVar.f21378a == j5) {
                return aVar.f21379b;
            }
        }
        return null;
    }

    public void d() {
        int i5 = 0;
        for (a<T> aVar : this.f21374a) {
            while (aVar != null) {
                aVar = aVar.f21380c;
                if (aVar != null) {
                    i5++;
                }
            }
        }
        org.greenrobot.greendao.e.a("load: " + (this.f21377d / this.f21375b) + ", size: " + this.f21377d + ", capa: " + this.f21375b + ", collisions: " + i5 + ", collision ratio: " + (i5 / this.f21377d));
    }

    public T e(long j5, T t5) {
        int i5 = ((((int) (j5 >>> 32)) ^ ((int) j5)) & Integer.MAX_VALUE) % this.f21375b;
        a<T> aVar = this.f21374a[i5];
        for (a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f21380c) {
            if (aVar2.f21378a == j5) {
                T t6 = aVar2.f21379b;
                aVar2.f21379b = t5;
                return t6;
            }
        }
        this.f21374a[i5] = new a<>(j5, t5, aVar);
        int i6 = this.f21377d + 1;
        this.f21377d = i6;
        if (i6 > this.f21376c) {
            h(this.f21375b * 2);
            return null;
        }
        return null;
    }

    public T f(long j5) {
        int i5 = ((((int) (j5 >>> 32)) ^ ((int) j5)) & Integer.MAX_VALUE) % this.f21375b;
        a<T> aVar = this.f21374a[i5];
        a<T> aVar2 = null;
        while (aVar != null) {
            a<T> aVar3 = aVar.f21380c;
            if (aVar.f21378a == j5) {
                if (aVar2 == null) {
                    this.f21374a[i5] = aVar3;
                } else {
                    aVar2.f21380c = aVar3;
                }
                this.f21377d--;
                return aVar.f21379b;
            }
            aVar2 = aVar;
            aVar = aVar3;
        }
        return null;
    }

    public void g(int i5) {
        h((i5 * 5) / 3);
    }

    public void h(int i5) {
        a<T>[] aVarArr = new a[i5];
        int length = this.f21374a.length;
        for (int i6 = 0; i6 < length; i6++) {
            a<T> aVar = this.f21374a[i6];
            while (aVar != null) {
                long j5 = aVar.f21378a;
                int i7 = ((((int) j5) ^ ((int) (j5 >>> 32))) & Integer.MAX_VALUE) % i5;
                a<T> aVar2 = aVar.f21380c;
                aVar.f21380c = aVarArr[i7];
                aVarArr[i7] = aVar;
                aVar = aVar2;
            }
        }
        this.f21374a = aVarArr;
        this.f21375b = i5;
        this.f21376c = (i5 * 4) / 3;
    }

    public int i() {
        return this.f21377d;
    }

    public c(int i5) {
        this.f21375b = i5;
        this.f21376c = (i5 * 4) / 3;
        this.f21374a = new a[i5];
    }
}
