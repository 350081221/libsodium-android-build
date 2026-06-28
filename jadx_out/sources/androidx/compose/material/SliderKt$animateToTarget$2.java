package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {959}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$animateToTarget$2 extends o implements p<DragScope, d<? super r2>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/Animatable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SliderKt$animateToTarget$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Animatable<Float, AnimationVector1D>, r2> {
        final /* synthetic */ DragScope $$this$drag;
        final /* synthetic */ k1.e $latestValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragScope dragScope, k1.e eVar) {
            super(1);
            this.$$this$drag = dragScope;
            this.$latestValue = eVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Animatable<Float, AnimationVector1D> animatable) {
            invoke2(animatable);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Animatable<Float, AnimationVector1D> animatable) {
            this.$$this$drag.dragBy(animatable.getValue().floatValue() - this.$latestValue.element);
            this.$latestValue.element = animatable.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f5, float f6, float f7, d<? super SliderKt$animateToTarget$2> dVar) {
        super(2, dVar);
        this.$current = f5;
        this.$target = f6;
        this.$velocity = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, dVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l DragScope dragScope, @m d<? super r2> dVar) {
        return ((SliderKt$animateToTarget$2) create(dragScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        TweenSpec tweenSpec;
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
            DragScope dragScope = (DragScope) this.L$0;
            k1.e eVar = new k1.e();
            float f5 = this.$current;
            eVar.element = f5;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f5, 0.0f, 2, null);
            Float e5 = b.e(this.$target);
            tweenSpec = SliderKt.SliderToTickAnimation;
            Float e6 = b.e(this.$velocity);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragScope, eVar);
            this.label = 1;
            if (Animatable$default.animateTo(e5, tweenSpec, e6, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
