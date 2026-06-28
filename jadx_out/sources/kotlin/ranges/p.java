package kotlin.ranges;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/OpenEndDoubleRange;", "Lkotlin/ranges/OpenEndRange;", "", "start", "endExclusive", "(DD)V", "_endExclusive", "_start", "getEndExclusive", "()Ljava/lang/Double;", "getStart", "contains", "", t0.b.f22420d, "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "isEmpty", "lessThanOrEquals", bi.ay, "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class p implements r<Double> {

    /* renamed from: a, reason: collision with root package name */
    private final double f19564a;

    /* renamed from: b, reason: collision with root package name */
    private final double f19565b;

    public p(double d5, double d6) {
        this.f19564a = d5;
        this.f19565b = d6;
    }

    private final boolean e(double d5, double d6) {
        return d5 <= d6;
    }

    public boolean a(double d5) {
        return d5 >= this.f19564a && d5 < this.f19565b;
    }

    @Override // kotlin.ranges.r
    @p4.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double c() {
        return Double.valueOf(this.f19565b);
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ boolean contains(Double d5) {
        return a(d5.doubleValue());
    }

    @Override // kotlin.ranges.r
    @p4.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double getStart() {
        return Double.valueOf(this.f19564a);
    }

    public boolean equals(@p4.m Object obj) {
        boolean z4;
        boolean z5;
        if (!(obj instanceof p)) {
            return false;
        }
        if (!isEmpty() || !((p) obj).isEmpty()) {
            p pVar = (p) obj;
            if (this.f19564a == pVar.f19564a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (this.f19565b == pVar.f19565b) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f19564a) * 31) + Double.hashCode(this.f19565b);
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        return this.f19564a >= this.f19565b;
    }

    @p4.l
    public String toString() {
        return this.f19564a + "..<" + this.f19565b;
    }
}
