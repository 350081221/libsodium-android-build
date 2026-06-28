package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.Comparable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.ranges.r;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Lkotlin/ranges/ComparableOpenEndRange;", "T", "", "Lkotlin/ranges/OpenEndRange;", "start", "endExclusive", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getEndExclusive", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getStart", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
class h<T extends Comparable<? super T>> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final T f19540a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final T f19541b;

    public h(@p4.l T start, @p4.l T endExclusive) {
        l0.p(start, "start");
        l0.p(endExclusive, "endExclusive");
        this.f19540a = start;
        this.f19541b = endExclusive;
    }

    @Override // kotlin.ranges.r
    @p4.l
    public T c() {
        return this.f19541b;
    }

    @Override // kotlin.ranges.r
    public boolean contains(@p4.l T t5) {
        return r.a.a(this, t5);
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!l0.g(getStart(), hVar.getStart()) || !l0.g(c(), hVar.c())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    @p4.l
    public T getStart() {
        return this.f19540a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + c().hashCode();
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        return r.a.b(this);
    }

    @p4.l
    public String toString() {
        return getStart() + "..<" + c();
    }
}
