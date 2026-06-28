package com.zzhoujay.richtext.drawable;

import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15669a;

    /* renamed from: b, reason: collision with root package name */
    private float f15670b;

    /* renamed from: c, reason: collision with root package name */
    @ColorInt
    private int f15671c;

    /* renamed from: d, reason: collision with root package name */
    private float f15672d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z4, float f5, @ColorInt int i5, float f6) {
        this.f15669a = z4;
        this.f15670b = f5;
        this.f15671c = i5;
        this.f15672d = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int a() {
        return this.f15671c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f15670b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f15672d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f15669a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f15669a = aVar.f15669a;
        this.f15670b = aVar.f15670b;
        this.f15671c = aVar.f15671c;
        this.f15672d = aVar.f15672d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15669a == aVar.f15669a && Float.compare(aVar.f15670b, this.f15670b) == 0 && this.f15671c == aVar.f15671c && Float.compare(aVar.f15672d, this.f15672d) == 0) {
            return true;
        }
        return false;
    }

    public void f(@ColorInt int i5) {
        this.f15671c = i5;
    }

    public void g(float f5) {
        this.f15670b = f5;
    }

    public void h(float f5) {
        this.f15672d = f5;
    }

    public int hashCode() {
        int i5;
        int i6 = (this.f15669a ? 1 : 0) * 31;
        float f5 = this.f15670b;
        int i7 = 0;
        if (f5 != 0.0f) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i8 = (((i6 + i5) * 31) + this.f15671c) * 31;
        float f6 = this.f15672d;
        if (f6 != 0.0f) {
            i7 = Float.floatToIntBits(f6);
        }
        return i8 + i7;
    }

    public void i(boolean z4) {
        this.f15669a = z4;
    }

    public a() {
        this(false, 5.0f, ViewCompat.MEASURED_STATE_MASK, 0.0f);
    }

    public a(a aVar) {
        this(aVar.f15669a, aVar.f15670b, aVar.f15671c, aVar.f15672d);
    }
}
