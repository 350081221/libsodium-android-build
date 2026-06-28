package io.reactivex.rxjava3.internal.util;

/* loaded from: classes3.dex */
public final class s<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final int f18696f = -1640531527;

    /* renamed from: a, reason: collision with root package name */
    final float f18697a;

    /* renamed from: b, reason: collision with root package name */
    int f18698b;

    /* renamed from: c, reason: collision with root package name */
    int f18699c;

    /* renamed from: d, reason: collision with root package name */
    int f18700d;

    /* renamed from: e, reason: collision with root package name */
    T[] f18701e;

    public s() {
        this(16, 0.75f);
    }

    static int c(int i5) {
        int i6 = i5 * f18696f;
        return i6 ^ (i6 >>> 16);
    }

    public boolean a(T t5) {
        T t6;
        T[] tArr = this.f18701e;
        int i5 = this.f18698b;
        int c5 = c(t5.hashCode()) & i5;
        T t7 = tArr[c5];
        if (t7 != null) {
            if (t7.equals(t5)) {
                return false;
            }
            do {
                c5 = (c5 + 1) & i5;
                t6 = tArr[c5];
                if (t6 == null) {
                }
            } while (!t6.equals(t5));
            return false;
        }
        tArr[c5] = t5;
        int i6 = this.f18699c + 1;
        this.f18699c = i6;
        if (i6 >= this.f18700d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f18701e;
    }

    void d() {
        T t5;
        T[] tArr = this.f18701e;
        int length = tArr.length;
        int i5 = length << 1;
        int i6 = i5 - 1;
        T[] tArr2 = (T[]) new Object[i5];
        int i7 = this.f18699c;
        while (true) {
            int i8 = i7 - 1;
            if (i7 == 0) {
                this.f18698b = i6;
                this.f18700d = (int) (i5 * this.f18697a);
                this.f18701e = tArr2;
                return;
            }
            do {
                length--;
                t5 = tArr[length];
            } while (t5 == null);
            int c5 = c(t5.hashCode()) & i6;
            if (tArr2[c5] == null) {
                tArr2[c5] = tArr[length];
                i7 = i8;
            }
            do {
                c5 = (c5 + 1) & i6;
            } while (tArr2[c5] != null);
            tArr2[c5] = tArr[length];
            i7 = i8;
        }
    }

    public boolean e(T t5) {
        T t6;
        T[] tArr = this.f18701e;
        int i5 = this.f18698b;
        int c5 = c(t5.hashCode()) & i5;
        T t7 = tArr[c5];
        if (t7 == null) {
            return false;
        }
        if (t7.equals(t5)) {
            return f(c5, tArr, i5);
        }
        do {
            c5 = (c5 + 1) & i5;
            t6 = tArr[c5];
            if (t6 == null) {
                return false;
            }
        } while (!t6.equals(t5));
        return f(c5, tArr, i5);
    }

    boolean f(int i5, T[] tArr, int i6) {
        int i7;
        T t5;
        this.f18699c--;
        while (true) {
            int i8 = i5 + 1;
            while (true) {
                i7 = i8 & i6;
                t5 = tArr[i7];
                if (t5 == null) {
                    tArr[i5] = null;
                    return true;
                }
                int c5 = c(t5.hashCode()) & i6;
                if (i5 <= i7) {
                    if (i5 < c5 && c5 <= i7) {
                        i8 = i7 + 1;
                    }
                } else {
                    if (i5 >= c5 && c5 > i7) {
                        break;
                    }
                    i8 = i7 + 1;
                }
            }
            tArr[i5] = t5;
            i5 = i7;
        }
    }

    public int g() {
        return this.f18699c;
    }

    public s(int i5) {
        this(i5, 0.75f);
    }

    public s(int i5, float f5) {
        this.f18697a = f5;
        int b5 = t.b(i5);
        this.f18698b = b5 - 1;
        this.f18700d = (int) (f5 * b5);
        this.f18701e = (T[]) new Object[b5];
    }
}
