package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;
import kotlinx.coroutines.n3;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "b", "countOrElement", "c", "oldState", "Lkotlin/r2;", bi.ay, "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/internal/t0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "Lv3/p;", "countAll", "Lkotlinx/coroutines/n3;", "findOne", "Lkotlinx/coroutines/internal/f1;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final t0 f20411a = new t0("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final v3.p<Object, g.b, Object> f20412b = a.INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final v3.p<n3<?>, g.b, n3<?>> f20413c = b.INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final v3.p<f1, g.b, f1> f20414d = c.INSTANCE;

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/g$b;", "element", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/g$b;)Ljava/lang/Object;", "<no name provided>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.p<Object, g.b, Object> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.m Object obj, @p4.l g.b bVar) {
            if (!(bVar instanceof n3)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/n3;", "found", "Lkotlin/coroutines/g$b;", "element", "invoke", "(Lkotlinx/coroutines/n3;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/n3;", "<no name provided>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.n0 implements v3.p<n3<?>, g.b, n3<?>> {
        public static final b INSTANCE = new b();

        b() {
            super(2);
        }

        @Override // v3.p
        @p4.m
        public final n3<?> invoke(@p4.m n3<?> n3Var, @p4.l g.b bVar) {
            if (n3Var != null) {
                return n3Var;
            }
            if (bVar instanceof n3) {
                return (n3) bVar;
            }
            return null;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/f1;", "state", "Lkotlin/coroutines/g$b;", "element", "invoke", "(Lkotlinx/coroutines/internal/f1;Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/internal/f1;", "<no name provided>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.n0 implements v3.p<f1, g.b, f1> {
        public static final c INSTANCE = new c();

        c() {
            super(2);
        }

        @Override // v3.p
        @p4.l
        public final f1 invoke(@p4.l f1 f1Var, @p4.l g.b bVar) {
            if (bVar instanceof n3) {
                n3<?> n3Var = (n3) bVar;
                f1Var.a(n3Var, n3Var.updateThreadContext(f1Var.f20351a));
            }
            return f1Var;
        }
    }

    public static final void a(@p4.l kotlin.coroutines.g gVar, @p4.m Object obj) {
        if (obj == f20411a) {
            return;
        }
        if (obj instanceof f1) {
            ((f1) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f20413c);
        kotlin.jvm.internal.l0.n(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((n3) fold).restoreThreadContext(gVar, obj);
    }

    @p4.l
    public static final Object b(@p4.l kotlin.coroutines.g gVar) {
        Object fold = gVar.fold(0, f20412b);
        kotlin.jvm.internal.l0.m(fold);
        return fold;
    }

    @p4.m
    public static final Object c(@p4.l kotlin.coroutines.g gVar, @p4.m Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f20411a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new f1(gVar, ((Number) obj).intValue()), f20414d);
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((n3) obj).updateThreadContext(gVar);
    }
}
