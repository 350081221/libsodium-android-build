package kotlin.jvm.internal;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/DoubleSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "size", "", "(I)V", "values", "add", "", t0.b.f22420d, "", "toArray", "getSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y extends c1<double[]> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final double[] f19491d;

    public y(int i5) {
        super(i5);
        this.f19491d = new double[i5];
    }

    public final void h(double d5) {
        double[] dArr = this.f19491d;
        int b5 = b();
        e(b5 + 1);
        dArr[b5] = d5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.c1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@p4.l double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length;
    }

    @p4.l
    public final double[] j() {
        return g(this.f19491d, new double[f()]);
    }
}
