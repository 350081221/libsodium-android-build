package kotlin.jvm.internal;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f19397a;

    /* renamed from: b, reason: collision with root package name */
    private int f19398b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final T[] f19399c;

    public c1(int i5) {
        this.f19397a = i5;
        this.f19399c = (T[]) new Object[i5];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@p4.l T spreadArgument) {
        l0.p(spreadArgument, "spreadArgument");
        T[] tArr = this.f19399c;
        int i5 = this.f19398b;
        this.f19398b = i5 + 1;
        tArr[i5] = spreadArgument;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f19398b;
    }

    protected abstract int c(@p4.l T t5);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i5) {
        this.f19398b = i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f() {
        int i5;
        int i6 = 0;
        kotlin.collections.s0 it = new kotlin.ranges.l(0, this.f19397a - 1).iterator();
        while (it.hasNext()) {
            T t5 = this.f19399c[it.nextInt()];
            if (t5 != null) {
                i5 = c(t5);
            } else {
                i5 = 1;
            }
            i6 += i5;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final T g(@p4.l T values, @p4.l T result) {
        l0.p(values, "values");
        l0.p(result, "result");
        kotlin.collections.s0 it = new kotlin.ranges.l(0, this.f19397a - 1).iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t5 = this.f19399c[nextInt];
            if (t5 != null) {
                if (i5 < nextInt) {
                    int i7 = nextInt - i5;
                    System.arraycopy(values, i5, result, i6, i7);
                    i6 += i7;
                }
                int c5 = c(t5);
                System.arraycopy(t5, 0, result, i6, c5);
                i6 += c5;
                i5 = nextInt + 1;
            }
        }
        int i8 = this.f19397a;
        if (i5 < i8) {
            System.arraycopy(values, i5, result, i6, i8 - i5);
        }
        return result;
    }
}
