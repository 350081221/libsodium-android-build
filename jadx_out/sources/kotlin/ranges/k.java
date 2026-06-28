package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.s0;
import kotlin.i0;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends s0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f19548a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19549b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19550c;

    /* renamed from: d, reason: collision with root package name */
    private int f19551d;

    public k(int i5, int i6, int i7) {
        this.f19548a = i7;
        this.f19549b = i6;
        boolean z4 = true;
        if (i7 <= 0 ? i5 < i6 : i5 > i6) {
            z4 = false;
        }
        this.f19550c = z4;
        this.f19551d = z4 ? i5 : i6;
    }

    public final int a() {
        return this.f19548a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19550c;
    }

    @Override // kotlin.collections.s0
    public int nextInt() {
        int i5 = this.f19551d;
        if (i5 == this.f19549b) {
            if (this.f19550c) {
                this.f19550c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f19551d = this.f19548a + i5;
        }
        return i5;
    }
}
