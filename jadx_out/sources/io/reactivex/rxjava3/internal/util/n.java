package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    final int f18689a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f18690b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f18691c;

    /* renamed from: d, reason: collision with root package name */
    volatile int f18692d;

    /* renamed from: e, reason: collision with root package name */
    int f18693e;

    public n(int i5) {
        this.f18689a = i5;
    }

    public void a(Object obj) {
        if (this.f18692d == 0) {
            Object[] objArr = new Object[this.f18689a + 1];
            this.f18690b = objArr;
            this.f18691c = objArr;
            objArr[0] = obj;
            this.f18693e = 1;
            this.f18692d = 1;
            return;
        }
        int i5 = this.f18693e;
        int i6 = this.f18689a;
        if (i5 == i6) {
            Object[] objArr2 = new Object[i6 + 1];
            objArr2[0] = obj;
            this.f18691c[i6] = objArr2;
            this.f18691c = objArr2;
            this.f18693e = 1;
            this.f18692d++;
            return;
        }
        this.f18691c[i5] = obj;
        this.f18693e = i5 + 1;
        this.f18692d++;
    }

    public Object[] b() {
        return this.f18690b;
    }

    public int c() {
        return this.f18692d;
    }

    public String toString() {
        int i5 = this.f18689a;
        int i6 = this.f18692d;
        ArrayList arrayList = new ArrayList(i6 + 1);
        Object[] b5 = b();
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            arrayList.add(b5[i8]);
            i7++;
            i8++;
            if (i8 == i5) {
                b5 = (Object[]) b5[i5];
                i8 = 0;
            }
        }
        return arrayList.toString();
    }
}
