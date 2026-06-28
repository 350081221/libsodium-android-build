package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import com.android.dx.io.Opcodes;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "velocity", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$Slider$3$gestureEndAction$1 extends n0 implements l<Float, r2> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ k1.e $maxPx;
    final /* synthetic */ k1.e $minPx;
    final /* synthetic */ a<r2> $onValueChangeFinished;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ List<Float> $tickFractions;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {Opcodes.ADD_INT_LIT8}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ SliderDraggableState $draggableState;
        final /* synthetic */ a<r2> $onValueChangeFinished;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SliderDraggableState sliderDraggableState, float f5, float f6, float f7, a<r2> aVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$draggableState = sliderDraggableState;
            this.$current = f5;
            this.$target = f6;
            this.$velocity = f7;
            this.$onValueChangeFinished = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, dVar);
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
            Object animateToTarget;
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
                SliderDraggableState sliderDraggableState = this.$draggableState;
                float f5 = this.$current;
                float f6 = this.$target;
                float f7 = this.$velocity;
                this.label = 1;
                animateToTarget = SliderKt.animateToTarget(sliderDraggableState, f5, f6, f7, this);
                if (animateToTarget == l5) {
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
    public SliderKt$Slider$3$gestureEndAction$1(MutableFloatState mutableFloatState, List<Float> list, k1.e eVar, k1.e eVar2, s0 s0Var, SliderDraggableState sliderDraggableState, a<r2> aVar) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$tickFractions = list;
        this.$minPx = eVar;
        this.$maxPx = eVar2;
        this.$scope = s0Var;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = aVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
        invoke(f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5) {
        float snapValueToTick;
        a<r2> aVar;
        float floatValue = this.$rawOffset.getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (!(floatValue == snapValueToTick)) {
            k.f(this.$scope, null, null, new AnonymousClass1(this.$draggableState, floatValue, snapValueToTick, f5, this.$onValueChangeFinished, null), 3, null);
        } else {
            if (this.$draggableState.isDragging() || (aVar = this.$onValueChangeFinished) == null) {
                return;
            }
            aVar.invoke();
        }
    }
}
