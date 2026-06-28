package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.i0;
import kotlin.v2;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0019B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\b\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(II)V", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "()Ljava/lang/Integer;", "getEndInclusive", "getStart", "contains", "", t0.b.f22420d, "equals", "other", "", TTDownloadField.TT_HASHCODE, "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static final a f19552e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final l f19553f = new l(1, 0);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final l a() {
            return l.f19553f;
        }
    }

    public l(int i5, int i6) {
        super(i5, i6, 1);
    }

    @g1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @v2(markerClass = {kotlin.r.class})
    public static /* synthetic */ void n() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean contains(Integer num) {
        return l(num.intValue());
    }

    @Override // kotlin.ranges.j
    public boolean equals(@p4.m Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (e() != lVar.e() || g() != lVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + g();
    }

    @Override // kotlin.ranges.j, kotlin.ranges.g
    public boolean isEmpty() {
        return e() > g();
    }

    public boolean l(int i5) {
        return e() <= i5 && i5 <= g();
    }

    @Override // kotlin.ranges.r
    @p4.l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        if (g() != Integer.MAX_VALUE) {
            return Integer.valueOf(g() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.g
    @p4.l
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(g());
    }

    @Override // kotlin.ranges.g
    @p4.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(e());
    }

    @Override // kotlin.ranges.j
    @p4.l
    public String toString() {
        return e() + ".." + g();
    }
}
