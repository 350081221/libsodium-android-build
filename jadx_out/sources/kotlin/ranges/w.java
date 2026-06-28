package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.c2;
import kotlin.g1;
import kotlin.i0;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0016\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "first", "last", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "I", "hasNext", "", "next", "next-pVg5ArA", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes4.dex */
final class w implements Iterator<c2>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f19572a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19573b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19574c;

    /* renamed from: d, reason: collision with root package name */
    private int f19575d;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if (r2 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private w(int r4, int r5, int r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.f19572a = r5
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L10
            int r2 = kotlin.v1.a(r4, r5)
            if (r2 > 0) goto L17
            goto L18
        L10:
            int r2 = kotlin.v1.a(r4, r5)
            if (r2 < 0) goto L17
            goto L18
        L17:
            r0 = r1
        L18:
            r3.f19573b = r0
            int r6 = kotlin.c2.l(r6)
            r3.f19574c = r6
            boolean r6 = r3.f19573b
            if (r6 == 0) goto L25
            goto L26
        L25:
            r4 = r5
        L26:
            r3.f19575d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.w.<init>(int, int, int):void");
    }

    public /* synthetic */ w(int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(i5, i6, i7);
    }

    public int a() {
        int i5 = this.f19575d;
        if (i5 == this.f19572a) {
            if (this.f19573b) {
                this.f19573b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f19575d = c2.l(this.f19574c + i5);
        }
        return i5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19573b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ c2 next() {
        return c2.e(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
