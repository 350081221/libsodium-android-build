package kotlin;

@g1(version = "1.7")
@v2(markerClass = {r.class})
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J5\u0010\u0005\u001a\u0002H\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\b*\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\n2\u0006\u0010\u0006\u001a\u0002H\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0087\u0002\u0082\u0001\u0001\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlin/DeepRecursiveScope;", "T", "R", "", "()V", "callRecursive", t0.b.f22420d, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S", "U", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "", "Lkotlin/DeepRecursiveScopeImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.j
/* loaded from: classes3.dex */
public abstract class i<T, R> {
    private i() {
    }

    public /* synthetic */ i(kotlin.jvm.internal.w wVar) {
        this();
    }

    @p4.m
    public abstract Object b(T t5, @p4.l kotlin.coroutines.d<? super R> dVar);

    @p4.m
    public abstract <U, S> Object c(@p4.l g<U, S> gVar, U u4, @p4.l kotlin.coroutines.d<? super S> dVar);

    @p4.l
    @k(level = m.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @b1(expression = "this.callRecursive(value)", imports = {}))
    public final Void f(@p4.l g<?, ?> gVar, @p4.m Object obj) {
        kotlin.jvm.internal.l0.p(gVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
