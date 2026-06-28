package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;
import kotlin.jvm.internal.k1;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a6\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a:\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020\u001aH\u0080\u0010\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\"\u001a\u0010!\u001a\u0004\u0018\u00010\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "e", "addedContext", "d", "", "c", "originalContext", "appendContext", "isNewCoroutine", bi.ay, "T", "", "countOrElement", "Lkotlin/Function0;", "block", "i", "(Lkotlin/coroutines/g;Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;", "Lkotlin/coroutines/d;", "continuation", bi.aJ, "(Lkotlin/coroutines/d;Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/x3;", socket.g.f22386a, "Lkotlin/coroutines/jvm/internal/e;", "f", "", "Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "b", "(Lkotlin/coroutines/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final String f20430a = " @";

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "invoke", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.n0 implements v3.p<kotlin.coroutines.g, g.b, kotlin.coroutines.g> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // v3.p
        @p4.l
        public final kotlin.coroutines.g invoke(@p4.l kotlin.coroutines.g gVar, @p4.l g.b bVar) {
            if (bVar instanceof k0) {
                return gVar.plus(((k0) bVar).J());
            }
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "invoke", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.n0 implements v3.p<kotlin.coroutines.g, g.b, kotlin.coroutines.g> {
        final /* synthetic */ boolean $isNewCoroutine;
        final /* synthetic */ k1.h<kotlin.coroutines.g> $leftoverContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.h<kotlin.coroutines.g> hVar, boolean z4) {
            super(2);
            this.$leftoverContext = hVar;
            this.$isNewCoroutine = z4;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.g] */
        @Override // v3.p
        @p4.l
        public final kotlin.coroutines.g invoke(@p4.l kotlin.coroutines.g gVar, @p4.l g.b bVar) {
            if (!(bVar instanceof k0)) {
                return gVar.plus(bVar);
            }
            g.b bVar2 = this.$leftoverContext.element.get(bVar.getKey());
            if (bVar2 == null) {
                k0 k0Var = (k0) bVar;
                if (this.$isNewCoroutine) {
                    k0Var = k0Var.J();
                }
                return gVar.plus(k0Var);
            }
            k1.h<kotlin.coroutines.g> hVar = this.$leftoverContext;
            hVar.element = hVar.element.minusKey(bVar.getKey());
            return gVar.plus(((k0) bVar).m(bVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/g$b;", "it", "invoke", "(ZLkotlin/coroutines/g$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.p<Boolean, g.b, Boolean> {
        public static final c INSTANCE = new c();

        c() {
            super(2);
        }

        @p4.l
        public final Boolean invoke(boolean z4, @p4.l g.b bVar) {
            return Boolean.valueOf(z4 || (bVar instanceof k0));
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return invoke(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final kotlin.coroutines.g a(kotlin.coroutines.g gVar, kotlin.coroutines.g gVar2, boolean z4) {
        boolean c5 = c(gVar);
        boolean c6 = c(gVar2);
        if (!c5 && !c6) {
            return gVar.plus(gVar2);
        }
        k1.h hVar = new k1.h();
        hVar.element = gVar2;
        kotlin.coroutines.i iVar = kotlin.coroutines.i.INSTANCE;
        kotlin.coroutines.g gVar3 = (kotlin.coroutines.g) gVar.fold(iVar, new b(hVar, z4));
        if (c6) {
            hVar.element = ((kotlin.coroutines.g) hVar.element).fold(iVar, a.INSTANCE);
        }
        return gVar3.plus((kotlin.coroutines.g) hVar.element);
    }

    @p4.m
    public static final String b(@p4.l kotlin.coroutines.g gVar) {
        return null;
    }

    private static final boolean c(kotlin.coroutines.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.INSTANCE)).booleanValue();
    }

    @p4.l
    @g2
    public static final kotlin.coroutines.g d(@p4.l kotlin.coroutines.g gVar, @p4.l kotlin.coroutines.g gVar2) {
        if (!c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    @p4.l
    @a2
    public static final kotlin.coroutines.g e(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar) {
        kotlin.coroutines.g a5 = a(s0Var.getCoroutineContext(), gVar, true);
        if (a5 != k1.a() && a5.get(kotlin.coroutines.e.S) == null) {
            return a5.plus(k1.a());
        }
        return a5;
    }

    @p4.m
    public static final x3<?> f(@p4.l kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof g1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof x3) {
                return (x3) eVar;
            }
        }
        return null;
    }

    @p4.m
    public static final x3<?> g(@p4.l kotlin.coroutines.d<?> dVar, @p4.l kotlin.coroutines.g gVar, @p4.m Object obj) {
        boolean z4;
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (gVar.get(y3.f20695a) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return null;
        }
        x3<?> f5 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f5 != null) {
            f5.y1(gVar, obj);
        }
        return f5;
    }

    public static final <T> T h(@p4.l kotlin.coroutines.d<?> dVar, @p4.m Object obj, @p4.l v3.a<? extends T> aVar) {
        x3<?> x3Var;
        kotlin.coroutines.g context = dVar.getContext();
        Object c5 = kotlinx.coroutines.internal.z0.c(context, obj);
        if (c5 != kotlinx.coroutines.internal.z0.f20411a) {
            x3Var = g(dVar, context, c5);
        } else {
            x3Var = null;
        }
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            if (x3Var == null || x3Var.x1()) {
                kotlinx.coroutines.internal.z0.a(context, c5);
            }
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final <T> T i(@p4.l kotlin.coroutines.g gVar, @p4.m Object obj, @p4.l v3.a<? extends T> aVar) {
        Object c5 = kotlinx.coroutines.internal.z0.c(gVar, obj);
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            kotlinx.coroutines.internal.z0.a(gVar, c5);
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
