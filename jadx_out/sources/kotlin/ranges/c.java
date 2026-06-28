package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.v2;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001aB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(CC)V", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "()Ljava/lang/Character;", "getEndInclusive", "getStart", "contains", "", t0.b.f22420d, "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends kotlin.ranges.a implements g<Character>, r<Character> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static final a f19534e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final c f19535f = new c(1, 0);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final c a() {
            return c.f19535f;
        }
    }

    public c(char c5, char c6) {
        super(c5, c6, 1);
    }

    @g1(version = "1.9")
    @kotlin.k(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @v2(markerClass = {kotlin.r.class})
    public static /* synthetic */ void n() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean contains(Character ch) {
        return l(ch.charValue());
    }

    @Override // kotlin.ranges.a
    public boolean equals(@p4.m Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (e() != cVar.e() || g() != cVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + g();
    }

    @Override // kotlin.ranges.a, kotlin.ranges.g
    public boolean isEmpty() {
        return l0.t(e(), g()) > 0;
    }

    public boolean l(char c5) {
        return l0.t(e(), c5) <= 0 && l0.t(c5, g()) <= 0;
    }

    @Override // kotlin.ranges.r
    @p4.l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Character c() {
        if (g() != 65535) {
            return Character.valueOf((char) (g() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.g
    @p4.l
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(g());
    }

    @Override // kotlin.ranges.g
    @p4.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(e());
    }

    @Override // kotlin.ranges.a
    @p4.l
    public String toString() {
        return e() + ".." + g();
    }
}
