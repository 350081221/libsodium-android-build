package kotlin.jvm.internal;

import java.util.NoSuchElementException;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayFloatIterator;", "Lkotlin/collections/FloatIterator;", "array", "", "([F)V", "index", "", "hasNext", "", "nextFloat", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class f extends kotlin.collections.k0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final float[] f19404a;

    /* renamed from: b, reason: collision with root package name */
    private int f19405b;

    public f(@p4.l float[] array) {
        l0.p(array, "array");
        this.f19404a = array;
    }

    @Override // kotlin.collections.k0
    public float b() {
        try {
            float[] fArr = this.f19404a;
            int i5 = this.f19405b;
            this.f19405b = i5 + 1;
            return fArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f19405b--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19405b < this.f19404a.length;
    }
}
