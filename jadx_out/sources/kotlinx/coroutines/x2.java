package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/x2;", "Lkotlinx/coroutines/n0;", "", "toString", "", "parallelism", "limitedParallelism", "D0", "C0", "()Lkotlinx/coroutines/x2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class x2 extends n0 {
    @p4.l
    public abstract x2 C0();

    /* JADX INFO: Access modifiers changed from: protected */
    @g2
    @p4.m
    public final String D0() {
        x2 x2Var;
        x2 e5 = k1.e();
        if (this == e5) {
            return "Dispatchers.Main";
        }
        try {
            x2Var = e5.C0();
        } catch (UnsupportedOperationException unused) {
            x2Var = null;
        }
        if (this != x2Var) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public n0 limitedParallelism(int i5) {
        kotlinx.coroutines.internal.u.a(i5);
        return this;
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        String D0 = D0();
        if (D0 != null) {
            return D0;
        }
        return x0.a(this) + '@' + x0.b(this);
    }
}
