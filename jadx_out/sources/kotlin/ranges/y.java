package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Iterator;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;
import kotlin.v2;

@g1(version = "1.5")
@v2(markerClass = {kotlin.t.class})
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0086\u0002ø\u0001\u0000J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0019\u0010\b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-s-VKNKU", "()J", "J", "last", "getLast-s-VKNKU", "getStep", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class y implements Iterable<g2>, w3.a {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final a f19578d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f19579a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19580b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19581c;

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final y a(long j5, long j6, long j7) {
            return new y(j5, j6, j7, null);
        }
    }

    private y(long j5, long j6, long j7) {
        if (j7 != 0) {
            if (j7 != Long.MIN_VALUE) {
                this.f19579a = j5;
                this.f19580b = kotlin.internal.r.c(j5, j6, j7);
                this.f19581c = j7;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public /* synthetic */ y(long j5, long j6, long j7, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7);
    }

    public final long e() {
        return this.f19579a;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (this.f19579a != yVar.f19579a || this.f19580b != yVar.f19580b || this.f19581c != yVar.f19581c) {
                }
            }
            return true;
        }
        return false;
    }

    public final long g() {
        return this.f19580b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j5 = this.f19579a;
        int l5 = ((int) g2.l(j5 ^ g2.l(j5 >>> 32))) * 31;
        long j6 = this.f19580b;
        int l6 = (l5 + ((int) g2.l(j6 ^ g2.l(j6 >>> 32)))) * 31;
        long j7 = this.f19581c;
        return l6 + ((int) ((j7 >>> 32) ^ j7));
    }

    public final long i() {
        return this.f19581c;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        long j5 = this.f19581c;
        long j6 = this.f19579a;
        long j7 = this.f19580b;
        if (j5 > 0) {
            compare2 = Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
            if (compare2 > 0) {
                return true;
            }
        } else {
            compare = Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
            if (compare < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @p4.l
    public final Iterator<g2> iterator() {
        return new z(this.f19579a, this.f19580b, this.f19581c, null);
    }

    @p4.l
    public String toString() {
        StringBuilder sb;
        long j5;
        if (this.f19581c > 0) {
            sb = new StringBuilder();
            sb.append((Object) g2.g0(this.f19579a));
            sb.append("..");
            sb.append((Object) g2.g0(this.f19580b));
            sb.append(" step ");
            j5 = this.f19581c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) g2.g0(this.f19579a));
            sb.append(" downTo ");
            sb.append((Object) g2.g0(this.f19580b));
            sb.append(" step ");
            j5 = -this.f19581c;
        }
        sb.append(j5);
        return sb.toString();
    }
}
