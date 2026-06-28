package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", i = {0}, l = {649}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"S", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Transition$animateTo$1$1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "it", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Long, r2> {
        final /* synthetic */ float $durationScale;
        final /* synthetic */ Transition<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Transition<S> transition, float f5) {
            super(1);
            this.this$0 = transition;
            this.$durationScale = f5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(long j5) {
            if (this.this$0.isSeeking()) {
                return;
            }
            this.this$0.onFrame$animation_core_release(j5 / 1, this.$durationScale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(Transition<S> transition, kotlin.coroutines.d<? super Transition$animateTo$1$1> dVar) {
        super(2, dVar);
        this.this$0 = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, dVar);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((Transition$animateTo$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        s0 s0Var;
        AnonymousClass1 anonymousClass1;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                s0Var = (s0) this.L$0;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            s0Var = (s0) this.L$0;
        }
        do {
            anonymousClass1 = new AnonymousClass1(this.this$0, SuspendAnimationKt.getDurationScale(s0Var.getCoroutineContext()));
            this.L$0 = s0Var;
            this.label = 1;
        } while (MonotonicFrameClockKt.withFrameNanos(anonymousClass1, this) != l5);
        return l5;
    }
}
