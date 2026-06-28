package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.e;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.channels.e0;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/h;", "S", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/coroutines/g;", "newContext", "Lkotlin/r2;", "q", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e0;", "scope", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "collect", "", "toString", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/flow/i;", "flow", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class h<S, T> extends e<T> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    protected final kotlinx.coroutines.flow.i<S> f20119d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ h<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<S, T> hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.this$0, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j<? super T> jVar = (kotlinx.coroutines.flow.j) this.L$0;
                h<S, T> hVar = this.this$0;
                this.label = 1;
                if (hVar.r(jVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@p4.l kotlinx.coroutines.flow.i<? extends S> iVar, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar2) {
        super(gVar, i5, iVar2);
        this.f20119d = iVar;
    }

    static /* synthetic */ <S, T> Object o(h<S, T> hVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object l6;
        Object l7;
        if (hVar.f20111b == -3) {
            kotlin.coroutines.g context = dVar.getContext();
            kotlin.coroutines.g plus = context.plus(hVar.f20110a);
            if (l0.g(plus, context)) {
                Object r5 = hVar.r(jVar, dVar);
                l7 = kotlin.coroutines.intrinsics.d.l();
                if (r5 == l7) {
                    return r5;
                }
                return r2.f19517a;
            }
            e.b bVar = kotlin.coroutines.e.S;
            if (l0.g(plus.get(bVar), context.get(bVar))) {
                Object q5 = hVar.q(jVar, plus, dVar);
                l6 = kotlin.coroutines.intrinsics.d.l();
                if (q5 == l6) {
                    return q5;
                }
                return r2.f19517a;
            }
        }
        Object collect = super.collect(jVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }

    static /* synthetic */ <S, T> Object p(h<S, T> hVar, e0<? super T> e0Var, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object r5 = hVar.r(new y(e0Var), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return r5 == l5 ? r5 : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.g gVar, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object d5 = f.d(gVar, f.a(jVar, dVar.getContext()), null, new a(this, null), dVar, 4, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (d5 == l5) {
            return d5;
        }
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return o(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.m
    protected Object h(@p4.l e0<? super T> e0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return p(this, e0Var, dVar);
    }

    @p4.m
    protected abstract Object r(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar);

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public String toString() {
        return this.f20119d + " -> " + super.toString();
    }
}
