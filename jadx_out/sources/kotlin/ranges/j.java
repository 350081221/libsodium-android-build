package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.collections.s0;
import kotlin.i0;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class j implements Iterable<Integer>, w3.a {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final a f19544d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f19545a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19546b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19547c;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final j a(int i5, int i6, int i7) {
            return new j(i5, i6, i7);
        }
    }

    public j(int i5, int i6, int i7) {
        if (i7 != 0) {
            if (i7 != Integer.MIN_VALUE) {
                this.f19545a = i5;
                this.f19546b = kotlin.internal.n.c(i5, i6, i7);
                this.f19547c = i7;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int e() {
        return this.f19545a;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f19545a != jVar.f19545a || this.f19546b != jVar.f19546b || this.f19547c != jVar.f19547c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f19546b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19545a * 31) + this.f19546b) * 31) + this.f19547c;
    }

    public final int i() {
        return this.f19547c;
    }

    public boolean isEmpty() {
        if (this.f19547c > 0) {
            if (this.f19545a > this.f19546b) {
                return true;
            }
        } else if (this.f19545a < this.f19546b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @p4.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s0 iterator() {
        return new k(this.f19545a, this.f19546b, this.f19547c);
    }

    @p4.l
    public String toString() {
        StringBuilder sb;
        int i5;
        if (this.f19547c > 0) {
            sb = new StringBuilder();
            sb.append(this.f19545a);
            sb.append("..");
            sb.append(this.f19546b);
            sb.append(" step ");
            i5 = this.f19547c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f19545a);
            sb.append(" downTo ");
            sb.append(this.f19546b);
            sb.append(" step ");
            i5 = -this.f19547c;
        }
        sb.append(i5);
        return sb.toString();
    }
}
