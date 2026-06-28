package kotlin.jvm.internal;

import java.util.NoSuchElementException;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/ArrayCharIterator;", "Lkotlin/collections/CharIterator;", "array", "", "([C)V", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class d extends kotlin.collections.t {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final char[] f19400a;

    /* renamed from: b, reason: collision with root package name */
    private int f19401b;

    public d(@p4.l char[] array) {
        l0.p(array, "array");
        this.f19400a = array;
    }

    @Override // kotlin.collections.t
    public char b() {
        try {
            char[] cArr = this.f19400a;
            int i5 = this.f19401b;
            this.f19401b = i5 + 1;
            return cArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f19401b--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19401b < this.f19400a.length;
    }
}
