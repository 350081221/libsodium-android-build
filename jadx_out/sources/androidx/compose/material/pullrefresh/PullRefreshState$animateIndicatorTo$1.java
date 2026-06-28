package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import t0.b;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PullRefreshState$animateIndicatorTo$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ PullRefreshState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements l<d<? super r2>, Object> {
        final /* synthetic */ float $offset;
        int label;
        final /* synthetic */ PullRefreshState this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", b.f22420d, "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00531 extends n0 implements p<Float, Float, r2> {
            final /* synthetic */ PullRefreshState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00531(PullRefreshState pullRefreshState) {
                super(2);
                this.this$0 = pullRefreshState;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Float f5, Float f6) {
                invoke(f5.floatValue(), f6.floatValue());
                return r2.f19517a;
            }

            public final void invoke(float f5, float f6) {
                this.this$0.set_position(f5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PullRefreshState pullRefreshState, float f5, d<? super AnonymousClass1> dVar) {
            super(1, dVar);
            this.this$0 = pullRefreshState;
            this.$offset = f5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@p4.l d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$offset, dVar);
        }

        @Override // v3.l
        @m
        public final Object invoke(@m d<? super r2> dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            float f5;
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
                f5 = this.this$0.get_position();
                float f6 = this.$offset;
                C00531 c00531 = new C00531(this.this$0);
                this.label = 1;
                if (SuspendAnimationKt.animate$default(f5, f6, 0.0f, null, c00531, this, 12, null) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$animateIndicatorTo$1(PullRefreshState pullRefreshState, float f5, d<? super PullRefreshState$animateIndicatorTo$1> dVar) {
        super(2, dVar);
        this.this$0 = pullRefreshState;
        this.$offset = f5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new PullRefreshState$animateIndicatorTo$1(this.this$0, this.$offset, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((PullRefreshState$animateIndicatorTo$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        MutatorMutex mutatorMutex;
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
            mutatorMutex = this.this$0.mutatorMutex;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$offset, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, anonymousClass1, this, 1, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
