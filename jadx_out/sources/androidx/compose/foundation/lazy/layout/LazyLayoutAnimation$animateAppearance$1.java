package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
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
@f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1", f = "LazyLayoutAnimation.kt", i = {}, l = {155, 156}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutAnimation$animateAppearance$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ FiniteAnimationSpec<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/Animatable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Animatable<Float, AnimationVector1D>, r2> {
        final /* synthetic */ LazyLayoutAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyLayoutAnimation lazyLayoutAnimation) {
            super(1);
            this.this$0 = lazyLayoutAnimation;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Animatable<Float, AnimationVector1D> animatable) {
            invoke2(animatable);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Animatable<Float, AnimationVector1D> animatable) {
            this.this$0.setVisibility(animatable.getValue().floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$animateAppearance$1(LazyLayoutAnimation lazyLayoutAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, d<? super LazyLayoutAnimation$animateAppearance$1> dVar) {
        super(2, dVar);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new LazyLayoutAnimation$animateAppearance$1(this.this$0, this.$spec, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((LazyLayoutAnimation$animateAppearance$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Animatable animatable;
        Animatable animatable2;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        this.this$0.setAppearanceAnimationInProgress(false);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                animatable = this.this$0.visibilityAnimation;
                Float e5 = b.e(0.0f);
                this.label = 1;
                if (animatable.snapTo(e5, this) == l5) {
                    return l5;
                }
            }
            animatable2 = this.this$0.visibilityAnimation;
            Float e6 = b.e(1.0f);
            FiniteAnimationSpec<Float> finiteAnimationSpec = this.$spec;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 2;
            if (Animatable.animateTo$default(animatable2, e6, finiteAnimationSpec, null, anonymousClass1, this, 4, null) == l5) {
                return l5;
            }
            this.this$0.setAppearanceAnimationInProgress(false);
            return r2.f19517a;
        } catch (Throwable th) {
            this.this$0.setAppearanceAnimationInProgress(false);
            throw th;
        }
    }
}
