package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;
import kotlin.v2;

@g1(version = "1.5")
@v2(markerClass = {kotlin.t.class})
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0018\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R \u0010\b\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-s-VKNKU$annotations", "()V", "getEndExclusive-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getStart-s-VKNKU", "contains", "", t0.b.f22420d, "contains-VKZWuLQ", "(J)Z", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a0 extends y implements g<g2>, r<g2> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static final a f19528e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final a0 f19529f = new a0(-1, 0, null);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final a0 a() {
            return a0.f19529f;
        }
    }

    private a0(long j5, long j6) {
        super(j5, j6, 1L, null);
    }

    public /* synthetic */ a0(long j5, long j6, kotlin.jvm.internal.w wVar) {
        this(j5, j6);
    }

    @g1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @v2(markerClass = {kotlin.r.class})
    public static /* synthetic */ void m() {
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ g2 c() {
        return g2.e(l());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean contains(g2 g2Var) {
        return k(g2Var.l0());
    }

    @Override // kotlin.ranges.y
    public boolean equals(@p4.m Object obj) {
        if (obj instanceof a0) {
            if (!isEmpty() || !((a0) obj).isEmpty()) {
                a0 a0Var = (a0) obj;
                if (e() != a0Var.e() || g() != a0Var.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ g2 getEndInclusive() {
        return g2.e(n());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ g2 getStart() {
        return g2.e(o());
    }

    @Override // kotlin.ranges.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) g2.l(e() ^ g2.l(e() >>> 32))) * 31) + ((int) g2.l(g() ^ g2.l(g() >>> 32)));
    }

    @Override // kotlin.ranges.y, kotlin.ranges.g
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(e() ^ Long.MIN_VALUE, g() ^ Long.MIN_VALUE);
        return compare > 0;
    }

    public boolean k(long j5) {
        int compare;
        int compare2;
        compare = Long.compare(e() ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, g() ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public long l() {
        if (g() != -1) {
            return g2.l(g() + g2.l(1 & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public long n() {
        return g();
    }

    public long o() {
        return e();
    }

    @Override // kotlin.ranges.y
    @p4.l
    public String toString() {
        return ((Object) g2.g0(e())) + ".." + ((Object) g2.g0(g()));
    }
}
