package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.c2;
import kotlin.g1;
import kotlin.i0;
import kotlin.v2;

@g1(version = "1.5")
@v2(markerClass = {kotlin.t.class})
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0018\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R \u0010\b\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-pVg5ArA$annotations", "()V", "getEndExclusive-pVg5ArA", "()I", "getEndInclusive-pVg5ArA", "getStart-pVg5ArA", "contains", "", t0.b.f22420d, "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class x extends v implements g<c2>, r<c2> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static final a f19576e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final x f19577f;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final x a() {
            return x.f19577f;
        }
    }

    static {
        kotlin.jvm.internal.w wVar = null;
        f19576e = new a(wVar);
        f19577f = new x(-1, 0, wVar);
    }

    private x(int i5, int i6) {
        super(i5, i6, 1, null);
    }

    public /* synthetic */ x(int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(i5, i6);
    }

    @g1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @v2(markerClass = {kotlin.r.class})
    public static /* synthetic */ void m() {
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ c2 c() {
        return c2.e(l());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean contains(c2 c2Var) {
        return k(c2Var.l0());
    }

    @Override // kotlin.ranges.v
    public boolean equals(@p4.m Object obj) {
        if (obj instanceof x) {
            if (!isEmpty() || !((x) obj).isEmpty()) {
                x xVar = (x) obj;
                if (e() != xVar.e() || g() != xVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ c2 getEndInclusive() {
        return c2.e(n());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ c2 getStart() {
        return c2.e(o());
    }

    @Override // kotlin.ranges.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + g();
    }

    @Override // kotlin.ranges.v, kotlin.ranges.g
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(e() ^ Integer.MIN_VALUE, g() ^ Integer.MIN_VALUE);
        return compare > 0;
    }

    public boolean k(int i5) {
        int compare;
        int compare2;
        compare = Integer.compare(e() ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, g() ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public int l() {
        if (g() != -1) {
            return c2.l(g() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public int n() {
        return g();
    }

    public int o() {
        return e();
    }

    @Override // kotlin.ranges.v
    @p4.l
    public String toString() {
        return ((Object) c2.g0(e())) + ".." + ((Object) c2.g0(g()));
    }
}
