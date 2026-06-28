package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class a implements Iterable<Character>, w3.a {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final C0560a f19524d = new C0560a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f19525a;

    /* renamed from: b, reason: collision with root package name */
    private final char f19526b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19527c;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0560a {
        private C0560a() {
        }

        public /* synthetic */ C0560a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final a a(char c5, char c6, int i5) {
            return new a(c5, c6, i5);
        }
    }

    public a(char c5, char c6, int i5) {
        if (i5 != 0) {
            if (i5 != Integer.MIN_VALUE) {
                this.f19525a = c5;
                this.f19526b = (char) kotlin.internal.n.c(c5, c6, i5);
                this.f19527c = i5;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char e() {
        return this.f19525a;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f19525a != aVar.f19525a || this.f19526b != aVar.f19526b || this.f19527c != aVar.f19527c) {
                }
            }
            return true;
        }
        return false;
    }

    public final char g() {
        return this.f19526b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19525a * 31) + this.f19526b) * 31) + this.f19527c;
    }

    public final int i() {
        return this.f19527c;
    }

    public boolean isEmpty() {
        if (this.f19527c > 0) {
            if (l0.t(this.f19525a, this.f19526b) > 0) {
                return true;
            }
        } else if (l0.t(this.f19525a, this.f19526b) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @p4.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public kotlin.collections.t iterator() {
        return new b(this.f19525a, this.f19526b, this.f19527c);
    }

    @p4.l
    public String toString() {
        StringBuilder sb;
        int i5;
        if (this.f19527c > 0) {
            sb = new StringBuilder();
            sb.append(this.f19525a);
            sb.append("..");
            sb.append(this.f19526b);
            sb.append(" step ");
            i5 = this.f19527c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f19525a);
            sb.append(" downTo ");
            sb.append(this.f19526b);
            sb.append(" step ");
            i5 = -this.f19527c;
        }
        sb.append(i5);
        return sb.toString();
    }
}
