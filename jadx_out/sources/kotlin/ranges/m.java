package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.collections.t0;
import kotlin.i0;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class m implements Iterable<Long>, w3.a {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final a f19554d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f19555a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19556b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19557c;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final m a(long j5, long j6, long j7) {
            return new m(j5, j6, j7);
        }
    }

    public m(long j5, long j6, long j7) {
        if (j7 != 0) {
            if (j7 != Long.MIN_VALUE) {
                this.f19555a = j5;
                this.f19556b = kotlin.internal.n.d(j5, j6, j7);
                this.f19557c = j7;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long e() {
        return this.f19555a;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f19555a != mVar.f19555a || this.f19556b != mVar.f19556b || this.f19557c != mVar.f19557c) {
                }
            }
            return true;
        }
        return false;
    }

    public final long g() {
        return this.f19556b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j5 = 31;
        long j6 = this.f19555a;
        long j7 = this.f19556b;
        long j8 = j5 * (((j6 ^ (j6 >>> 32)) * j5) + (j7 ^ (j7 >>> 32)));
        long j9 = this.f19557c;
        return (int) (j8 + (j9 ^ (j9 >>> 32)));
    }

    public final long i() {
        return this.f19557c;
    }

    public boolean isEmpty() {
        long j5 = this.f19557c;
        long j6 = this.f19555a;
        long j7 = this.f19556b;
        if (j5 > 0) {
            if (j6 > j7) {
                return true;
            }
        } else if (j6 < j7) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @p4.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public t0 iterator() {
        return new n(this.f19555a, this.f19556b, this.f19557c);
    }

    @p4.l
    public String toString() {
        StringBuilder sb;
        long j5;
        if (this.f19557c > 0) {
            sb = new StringBuilder();
            sb.append(this.f19555a);
            sb.append("..");
            sb.append(this.f19556b);
            sb.append(" step ");
            j5 = this.f19557c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f19555a);
            sb.append(" downTo ");
            sb.append(this.f19556b);
            sb.append(" step ");
            j5 = -this.f19557c;
        }
        sb.append(j5);
        return sb.toString();
    }
}
