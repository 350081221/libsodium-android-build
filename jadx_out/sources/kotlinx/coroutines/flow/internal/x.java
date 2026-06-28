package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.l2;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/internal/v;", "Lkotlin/coroutines/g;", "currentContext", "Lkotlin/r2;", bi.ay, "Lkotlinx/coroutines/l2;", "collectJob", "b", "T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "c", "(Lv3/p;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/g$b;", "element", "invoke", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends n0 implements v3.p<Integer, g.b, Integer> {
        final /* synthetic */ v<?> $this_checkContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v<?> vVar) {
            super(2);
            this.$this_checkContext = vVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return invoke(num.intValue(), bVar);
        }

        @p4.l
        public final Integer invoke(int i5, @p4.l g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.$this_checkContext.collectContext.get(key);
            if (key != l2.U) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i5 + 1);
            }
            l2 l2Var = (l2) bVar2;
            l0.n(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            l2 b5 = x.b((l2) bVar, l2Var);
            if (b5 == l2Var) {
                if (l2Var != null) {
                    i5++;
                }
                return Integer.valueOf(i5);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b5 + ", expected child of " + l2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n*L\n1#1,112:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super r2>, Object> f20147a;

        @i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(v3.p<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
            this.f20147a = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object invoke = this.f20147a.invoke(jVar, dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            return invoke == l5 ? invoke : r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            this.f20147a.invoke(jVar, dVar);
            return r2.f19517a;
        }
    }

    @u3.h(name = "checkContext")
    public static final void a(@p4.l v<?> vVar, @p4.l kotlin.coroutines.g gVar) {
        if (((Number) gVar.fold(0, new a(vVar))).intValue() == vVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.collectContext + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @p4.m
    public static final l2 b(@p4.m l2 l2Var, @p4.m l2 l2Var2) {
        while (l2Var != null) {
            if (l2Var == l2Var2) {
                return l2Var;
            }
            if (!(l2Var instanceof p0)) {
                return l2Var;
            }
            l2Var = l2Var.getParent();
        }
        return null;
    }

    @p4.l
    @a1
    public static final <T> kotlinx.coroutines.flow.i<T> c(@kotlin.b @p4.l v3.p<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new b(pVar);
    }
}
