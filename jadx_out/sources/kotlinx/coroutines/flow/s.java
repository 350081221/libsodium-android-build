package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.u1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\t\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u001aw\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"$\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012\"*\u0010\u0015\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", bi.ay, "Lkotlin/Function2;", "Lkotlin/v0;", "name", "old", "new", "", "areEquivalent", "b", "K", "Lkotlin/Function1;", "keySelector", "c", "", "d", "(Lkotlinx/coroutines/flow/i;Lv3/l;Lv3/p;)Lkotlinx/coroutines/flow/i;", "Lv3/l;", "defaultKeySelector", "Lv3/p;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes4.dex */
public final /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final v3.l<Object, Object> f20200a = b.INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final v3.p<Object, Object, Boolean> f20201b = a.INSTANCE;

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "old", "", "new", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.p<Object, Object, Boolean> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.p
        @p4.l
        public final Boolean invoke(@p4.m Object obj, @p4.m Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.l0.g(obj, obj2));
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.n0 implements v3.l<Object, Object> {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // v3.l
        @p4.m
        public final Object invoke(@p4.m Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final <T> i<T> a(@p4.l i<? extends T> iVar) {
        if (!(iVar instanceof t0)) {
            return d(iVar, f20200a, f20201b);
        }
        return iVar;
    }

    @p4.l
    public static final <T> i<T> b(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super T, Boolean> pVar) {
        v3.l<Object, Object> lVar = f20200a;
        kotlin.jvm.internal.l0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return d(iVar, lVar, (v3.p) u1.q(pVar, 2));
    }

    @p4.l
    public static final <T, K> i<T> c(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, ? extends K> lVar) {
        return d(iVar, lVar, f20201b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> i<T> d(i<? extends T> iVar, v3.l<? super T, ? extends Object> lVar, v3.p<Object, Object, Boolean> pVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f20093b == lVar && gVar.f20094c == pVar) {
                return iVar;
            }
        }
        return new g(iVar, lVar, pVar);
    }
}
