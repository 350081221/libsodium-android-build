package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/l2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RippleAnimation$fadeOut$2 extends o implements p<s0, d<? super l2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        int label;
        final /* synthetic */ RippleAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RippleAnimation rippleAnimation, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            Animatable animatable;
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
                animatable = this.this$0.animatedAlpha;
                Float e5 = b.e(0.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, e5, tween$default, null, null, this, 12, null) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, d<? super RippleAnimation$fadeOut$2> dVar) {
        super(2, dVar);
        this.this$0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.this$0, dVar);
        rippleAnimation$fadeOut$2.L$0 = obj;
        return rippleAnimation$fadeOut$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super l2> dVar) {
        return ((RippleAnimation$fadeOut$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        l2 f5;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            f5 = k.f((s0) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            return f5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
