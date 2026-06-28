package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Iterator;
import kotlin.c2;
import kotlin.g1;
import kotlin.i0;
import kotlin.v2;

@g1(version = "1.5")
@v2(markerClass = {kotlin.t.class})
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0086\u0002ø\u0001\u0000J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0019\u0010\b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-pVg5ArA", "()I", "I", "last", "getLast-pVg5ArA", "getStep", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class v implements Iterable<c2>, w3.a {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final a f19568d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f19569a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19570b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19571c;

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final v a(int i5, int i6, int i7) {
            return new v(i5, i6, i7, null);
        }
    }

    private v(int i5, int i6, int i7) {
        if (i7 != 0) {
            if (i7 != Integer.MIN_VALUE) {
                this.f19569a = i5;
                this.f19570b = kotlin.internal.r.d(i5, i6, i7);
                this.f19571c = i7;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public /* synthetic */ v(int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(i5, i6, i7);
    }

    public final int e() {
        return this.f19569a;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof v) {
            if (!isEmpty() || !((v) obj).isEmpty()) {
                v vVar = (v) obj;
                if (this.f19569a != vVar.f19569a || this.f19570b != vVar.f19570b || this.f19571c != vVar.f19571c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f19570b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19569a * 31) + this.f19570b) * 31) + this.f19571c;
    }

    public final int i() {
        return this.f19571c;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        if (this.f19571c > 0) {
            compare2 = Integer.compare(this.f19569a ^ Integer.MIN_VALUE, this.f19570b ^ Integer.MIN_VALUE);
            if (compare2 > 0) {
                return true;
            }
        } else {
            compare = Integer.compare(this.f19569a ^ Integer.MIN_VALUE, this.f19570b ^ Integer.MIN_VALUE);
            if (compare < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @p4.l
    public final Iterator<c2> iterator() {
        return new w(this.f19569a, this.f19570b, this.f19571c, null);
    }

    @p4.l
    public String toString() {
        StringBuilder sb;
        int i5;
        if (this.f19571c > 0) {
            sb = new StringBuilder();
            sb.append((Object) c2.g0(this.f19569a));
            sb.append("..");
            sb.append((Object) c2.g0(this.f19570b));
            sb.append(" step ");
            i5 = this.f19571c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) c2.g0(this.f19569a));
            sb.append(" downTo ");
            sb.append((Object) c2.g0(this.f19570b));
            sb.append(" step ");
            i5 = -this.f19571c;
        }
        sb.append(i5);
        return sb.toString();
    }
}
