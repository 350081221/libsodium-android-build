package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$2 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ k1.e $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ k1.e $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", t0.b.f22420d, "velocity", "Lkotlin/r2;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00171 extends n0 implements p<Float, Float, r2> {
            final /* synthetic */ WindowInsetsAnimationController $animationController;
            final /* synthetic */ k1.e $endVelocity;
            final /* synthetic */ int $hidden;
            final /* synthetic */ int $shown;
            final /* synthetic */ boolean $targetShown;
            final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00171(int i5, int i6, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, k1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4) {
                super(2);
                this.$hidden = i5;
                this.$shown = i6;
                this.this$0 = windowInsetsNestedScrollConnection;
                this.$endVelocity = eVar;
                this.$animationController = windowInsetsAnimationController;
                this.$targetShown = z4;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Float f5, Float f6) {
                invoke(f5.floatValue(), f6.floatValue());
                return r2.f19517a;
            }

            public final void invoke(float f5, float f6) {
                l2 l2Var;
                float f7 = this.$hidden;
                boolean z4 = false;
                if (f5 <= this.$shown && f7 <= f5) {
                    z4 = true;
                }
                if (z4) {
                    this.this$0.adjustInsets(f5);
                    return;
                }
                this.$endVelocity.element = f6;
                this.$animationController.finish(this.$targetShown);
                this.this$0.animationController = null;
                l2Var = this.this$0.animationJob;
                if (l2Var != null) {
                    l2Var.cancel(new WindowInsetsAnimationCancelledException());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i5, float f5, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i6, int i7, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, k1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$current = i5;
            this.$flingAmount = f5;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i6;
            this.$shown = i7;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = eVar;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, dVar);
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
                float f5 = this.$current;
                float f6 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                C00171 c00171 = new C00171(this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown);
                this.label = 1;
                if (SuspendAnimationKt.animateDecay(f5, f6, splineBasedFloatDecayAnimationSpec, c00171, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i5, float f5, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i6, int i7, k1.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z4, kotlin.coroutines.d<? super WindowInsetsNestedScrollConnection$fling$2> dVar) {
        super(2, dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i5;
        this.$flingAmount = f5;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i6;
        this.$shown = i7;
        this.$endVelocity = eVar;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, dVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l2 f5;
        l2 l2Var;
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
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            f5 = k.f(s0Var, null, null, new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3, null);
            windowInsetsNestedScrollConnection.animationJob = f5;
            l2Var = this.this$0.animationJob;
            if (l2Var != null) {
                this.label = 1;
                if (l2Var.b0(this) == l5) {
                    return l5;
                }
            }
        }
        this.this$0.animationJob = null;
        return r2.f19517a;
    }
}
