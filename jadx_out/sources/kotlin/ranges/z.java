package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0016\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "first", "last", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "J", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes4.dex */
final class z implements Iterator<g2>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f19582a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19583b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19584c;

    /* renamed from: d, reason: collision with root package name */
    private long f19585d;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (r0 >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private z(long r4, long r6, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.f19582a = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L14
            int r0 = androidx.collection.a.a(r4, r6)
            if (r0 > 0) goto L1b
            goto L1c
        L14:
            int r0 = androidx.collection.a.a(r4, r6)
            if (r0 < 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3.f19583b = r1
            long r8 = kotlin.g2.l(r8)
            r3.f19584c = r8
            boolean r8 = r3.f19583b
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.f19585d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.z.<init>(long, long, long):void");
    }

    public /* synthetic */ z(long j5, long j6, long j7, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7);
    }

    public long a() {
        long j5 = this.f19585d;
        if (j5 == this.f19582a) {
            if (this.f19583b) {
                this.f19583b = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f19585d = g2.l(this.f19584c + j5);
        }
        return j5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19583b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ g2 next() {
        return g2.e(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
