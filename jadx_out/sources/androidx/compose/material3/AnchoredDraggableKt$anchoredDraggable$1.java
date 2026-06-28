package androidx.compose.material3;

import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "", "velocity", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$anchoredDraggable$1 extends kotlin.coroutines.jvm.internal.o implements v3.q<s0, Float, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f5, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$state = anchoredDraggableState;
            this.$velocity = f5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$state, this.$velocity, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                float f5 = this.$velocity;
                this.label = 1;
                if (anchoredDraggableState.settle(f5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.d<? super AnchoredDraggableKt$anchoredDraggable$1> dVar) {
        super(3, dVar);
        this.$state = anchoredDraggableState;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Float f5, kotlin.coroutines.d<? super r2> dVar) {
        return invoke(s0Var, f5.floatValue(), dVar);
    }

    @p4.m
    public final Object invoke(@p4.l s0 s0Var, float f5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.$state, dVar);
        anchoredDraggableKt$anchoredDraggable$1.L$0 = s0Var;
        anchoredDraggableKt$anchoredDraggable$1.F$0 = f5;
        return anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            kotlinx.coroutines.k.f((s0) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
