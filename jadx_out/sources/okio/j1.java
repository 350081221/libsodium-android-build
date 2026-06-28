package okio;

import java.util.concurrent.atomic.AtomicReference;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0015"}, d2 = {"Lokio/SegmentPool;", "", "()V", "HASH_BUCKET_COUNT", "", "LOCK", "Lokio/Segment;", "MAX_SIZE", "getMAX_SIZE", "()I", "byteCount", "getByteCount", "hashBuckets", "", "Ljava/util/concurrent/atomic/AtomicReference;", "[Ljava/util/concurrent/atomic/AtomicReference;", "firstRef", "recycle", "", "segment", "take", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final j1 f20982a = new j1();

    /* renamed from: b, reason: collision with root package name */
    private static final int f20983b = 65536;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final i1 f20984c = new i1(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f20985d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final AtomicReference<i1>[] f20986e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20985d = highestOneBit;
        AtomicReference<i1>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i5 = 0; i5 < highestOneBit; i5++) {
            atomicReferenceArr[i5] = new AtomicReference<>();
        }
        f20986e = atomicReferenceArr;
    }

    private j1() {
    }

    private final AtomicReference<i1> a() {
        return f20986e[(int) (Thread.currentThread().getId() & (f20985d - 1))];
    }

    @u3.m
    public static final void d(@p4.l i1 segment) {
        boolean z4;
        AtomicReference<i1> a5;
        i1 i1Var;
        i1 andSet;
        int i5;
        kotlin.jvm.internal.l0.p(segment, "segment");
        if (segment.f20933f == null && segment.f20934g == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (segment.f20931d || (andSet = (a5 = f20982a.a()).getAndSet((i1Var = f20984c))) == i1Var) {
                return;
            }
            if (andSet != null) {
                i5 = andSet.f20930c;
            } else {
                i5 = 0;
            }
            if (i5 >= f20983b) {
                a5.set(andSet);
                return;
            }
            segment.f20933f = andSet;
            segment.f20929b = 0;
            segment.f20930c = i5 + 8192;
            a5.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @p4.l
    @u3.m
    public static final i1 e() {
        AtomicReference<i1> a5 = f20982a.a();
        i1 i1Var = f20984c;
        i1 andSet = a5.getAndSet(i1Var);
        if (andSet == i1Var) {
            return new i1();
        }
        if (andSet == null) {
            a5.set(null);
            return new i1();
        }
        a5.set(andSet.f20933f);
        andSet.f20933f = null;
        andSet.f20930c = 0;
        return andSet;
    }

    public final int b() {
        i1 i1Var = a().get();
        if (i1Var == null) {
            return 0;
        }
        return i1Var.f20930c;
    }

    public final int c() {
        return f20983b;
    }
}
