package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "first", "", "last", "step", "", "(CCI)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextChar", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends kotlin.collections.t {

    /* renamed from: a, reason: collision with root package name */
    private final int f19530a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19531b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19532c;

    /* renamed from: d, reason: collision with root package name */
    private int f19533d;

    public b(char c5, char c6, int i5) {
        this.f19530a = i5;
        this.f19531b = c6;
        boolean z4 = true;
        if (i5 <= 0 ? l0.t(c5, c6) < 0 : l0.t(c5, c6) > 0) {
            z4 = false;
        }
        this.f19532c = z4;
        this.f19533d = z4 ? c5 : c6;
    }

    @Override // kotlin.collections.t
    public char b() {
        int i5 = this.f19533d;
        if (i5 == this.f19531b) {
            if (this.f19532c) {
                this.f19532c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f19533d = this.f19530a + i5;
        }
        return (char) i5;
    }

    public final int c() {
        return this.f19530a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19532c;
    }
}
