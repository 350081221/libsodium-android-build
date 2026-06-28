package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", bi.ay, "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "Lkotlinx/coroutines/flow/i;", "b", "(Lv3/q;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,63:1\n106#2:64\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n50#1:64\n*E\n"})
/* loaded from: classes4.dex */
public final class p {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,112:1\n51#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.q f20139a;

        public a(v3.q qVar) {
            this.f20139a = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object a5 = p.a(new b(this.f20139a, jVar, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.q<s0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> $block;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> $this_unsafeFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(v3.q<? super s0, ? super kotlinx.coroutines.flow.j<? super R>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.$this_unsafeFlow = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.$block, this.$this_unsafeFlow, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                s0 s0Var = (s0) this.L$0;
                v3.q<s0, kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> qVar = this.$block;
                Object obj2 = this.$this_unsafeFlow;
                this.label = 1;
                if (qVar.invoke(s0Var, obj2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @p4.m
    public static final <R> Object a(@kotlin.b @p4.l v3.p<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        Object l5;
        o oVar = new o(dVar.getContext(), dVar);
        Object e5 = h4.b.e(oVar, oVar, pVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (e5 == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e5;
    }

    @p4.l
    public static final <R> kotlinx.coroutines.flow.i<R> b(@kotlin.b @p4.l v3.q<? super s0, ? super kotlinx.coroutines.flow.j<? super R>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
