package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.t0;
import kotlin.i0;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n extends t0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f19558a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19559b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19560c;

    /* renamed from: d, reason: collision with root package name */
    private long f19561d;

    public n(long j5, long j6, long j7) {
        this.f19558a = j7;
        this.f19559b = j6;
        boolean z4 = true;
        if (j7 <= 0 ? j5 < j6 : j5 > j6) {
            z4 = false;
        }
        this.f19560c = z4;
        this.f19561d = z4 ? j5 : j6;
    }

    public final long a() {
        return this.f19558a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19560c;
    }

    @Override // kotlin.collections.t0
    public long nextLong() {
        long j5 = this.f19561d;
        if (j5 == this.f19559b) {
            if (this.f19560c) {
                this.f19560c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f19561d = this.f19558a + j5;
        }
        return j5;
    }
}
