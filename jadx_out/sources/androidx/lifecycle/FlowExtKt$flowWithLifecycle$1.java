package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class FlowExtKt$flowWithLifecycle$1<T> extends o implements p<e0<? super T>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ e0<T> $$this$callbackFlow;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.i<? extends T> iVar, e0<? super T> e0Var, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_flowWithLifecycle = iVar;
            this.$$this$callbackFlow = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
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
                kotlinx.coroutines.flow.i<T> iVar = this.$this_flowWithLifecycle;
                final e0<T> e0Var = this.$$this$callbackFlow;
                kotlinx.coroutines.flow.j<? super T> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(T t5, @l kotlin.coroutines.d<? super r2> dVar) {
                        Object l6;
                        Object F = e0Var.F(t5, dVar);
                        l6 = kotlin.coroutines.intrinsics.d.l();
                        return F == l6 ? F : r2.f19517a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super FlowExtKt$flowWithLifecycle$1> dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l e0<? super T> e0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        e0 e0Var;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e0Var = (e0) this.L$0;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            e0 e0Var2 = (e0) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, e0Var2, null);
            this.L$0 = e0Var2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == l5) {
                return l5;
            }
            e0Var = e0Var2;
        }
        h0.a.a(e0Var, null, 1, null);
        return r2.f19517a;
    }
}
