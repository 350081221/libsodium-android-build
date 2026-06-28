package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.Comparable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.ranges.g;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "start", "endInclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndInclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
class i<T extends Comparable<? super T>> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final T f19542a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final T f19543b;

    public i(@p4.l T start, @p4.l T endInclusive) {
        l0.p(start, "start");
        l0.p(endInclusive, "endInclusive");
        this.f19542a = start;
        this.f19543b = endInclusive;
    }

    @Override // kotlin.ranges.g
    public boolean contains(@p4.l T t5) {
        return g.a.a(this, t5);
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!l0.g(getStart(), iVar.getStart()) || !l0.g(getEndInclusive(), iVar.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    @p4.l
    public T getEndInclusive() {
        return this.f19543b;
    }

    @Override // kotlin.ranges.g
    @p4.l
    public T getStart() {
        return this.f19542a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // kotlin.ranges.g
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @p4.l
    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
