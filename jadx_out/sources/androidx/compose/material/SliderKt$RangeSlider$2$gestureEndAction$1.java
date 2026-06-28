package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.t;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isStart", "Lkotlin/r2;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends n0 implements l<Boolean, r2> {
    final /* synthetic */ k1.e $maxPx;
    final /* synthetic */ k1.e $minPx;
    final /* synthetic */ a<r2> $onValueChangeFinished;
    final /* synthetic */ State<l<f<Float>, r2>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ boolean $isStart;
        final /* synthetic */ k1.e $maxPx;
        final /* synthetic */ k1.e $minPx;
        final /* synthetic */ a<r2> $onValueChangeFinished;
        final /* synthetic */ State<l<f<Float>, r2>> $onValueChangeState;
        final /* synthetic */ MutableFloatState $rawOffsetEnd;
        final /* synthetic */ MutableFloatState $rawOffsetStart;
        final /* synthetic */ float $target;
        final /* synthetic */ f<Float> $valueRange;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/Animatable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00461 extends n0 implements l<Animatable<Float, AnimationVector1D>, r2> {
            final /* synthetic */ boolean $isStart;
            final /* synthetic */ k1.e $maxPx;
            final /* synthetic */ k1.e $minPx;
            final /* synthetic */ State<l<f<Float>, r2>> $onValueChangeState;
            final /* synthetic */ MutableFloatState $rawOffsetEnd;
            final /* synthetic */ MutableFloatState $rawOffsetStart;
            final /* synthetic */ f<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00461(boolean z4, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends l<? super f<Float>, r2>> state, k1.e eVar, k1.e eVar2, f<Float> fVar) {
                super(1);
                this.$isStart = z4;
                this.$rawOffsetStart = mutableFloatState;
                this.$rawOffsetEnd = mutableFloatState2;
                this.$onValueChangeState = state;
                this.$minPx = eVar;
                this.$maxPx = eVar2;
                this.$valueRange = fVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l Animatable<Float, AnimationVector1D> animatable) {
                f e5;
                f<Float> invoke$scaleToUserValue;
                (this.$isStart ? this.$rawOffsetStart : this.$rawOffsetEnd).setFloatValue(animatable.getValue().floatValue());
                l<f<Float>, r2> value = this.$onValueChangeState.getValue();
                k1.e eVar = this.$minPx;
                k1.e eVar2 = this.$maxPx;
                f<Float> fVar = this.$valueRange;
                e5 = t.e(this.$rawOffsetStart.getFloatValue(), this.$rawOffsetEnd.getFloatValue());
                invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(eVar, eVar2, fVar, e5);
                value.invoke(invoke$scaleToUserValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f5, float f6, a<r2> aVar, boolean z4, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends l<? super f<Float>, r2>> state, k1.e eVar, k1.e eVar2, f<Float> fVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$current = f5;
            this.$target = f6;
            this.$onValueChangeFinished = aVar;
            this.$isStart = z4;
            this.$rawOffsetStart = mutableFloatState;
            this.$rawOffsetEnd = mutableFloatState2;
            this.$onValueChangeState = state;
            this.$minPx = eVar;
            this.$maxPx = eVar2;
            this.$valueRange = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float e5 = b.e(this.$target);
                tweenSpec = SliderKt.SliderToTickAnimation;
                Float e6 = b.e(0.0f);
                C00461 c00461 = new C00461(this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange);
                this.label = 1;
                if (Animatable$default.animateTo(e5, tweenSpec, e6, c00461, this) == l5) {
                    return l5;
                }
            }
            a<r2> aVar = this.$onValueChangeFinished;
            if (aVar != null) {
                aVar.invoke();
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$gestureEndAction$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List<Float> list, k1.e eVar, k1.e eVar2, a<r2> aVar, s0 s0Var, State<? extends l<? super f<Float>, r2>> state, f<Float> fVar) {
        super(1);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$tickFractions = list;
        this.$minPx = eVar;
        this.$maxPx = eVar2;
        this.$onValueChangeFinished = aVar;
        this.$scope = s0Var;
        this.$onValueChangeState = state;
        this.$valueRange = fVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return r2.f19517a;
    }

    public final void invoke(boolean z4) {
        float snapValueToTick;
        float floatValue = (z4 ? this.$rawOffsetStart : this.$rawOffsetEnd).getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (floatValue == snapValueToTick) {
            a<r2> aVar = this.$onValueChangeFinished;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        k.f(this.$scope, null, null, new AnonymousClass1(floatValue, snapValueToTick, this.$onValueChangeFinished, z4, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, null), 3, null);
    }
}
