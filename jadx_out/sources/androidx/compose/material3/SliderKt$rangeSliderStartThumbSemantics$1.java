package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderStartThumbSemantics$1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ RangeSliderState $state;
    final /* synthetic */ kotlin.ranges.f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$rangeSliderStartThumbSemantics$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Float, Boolean> {
        final /* synthetic */ RangeSliderState $state;
        final /* synthetic */ kotlin.ranges.f<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.ranges.f<Float> fVar, RangeSliderState rangeSliderState) {
            super(1);
            this.$valueRange = fVar;
            this.$state = rangeSliderState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Float f5) {
            return invoke(f5.floatValue());
        }

        @p4.l
        public final Boolean invoke(float f5) {
            float H;
            int startSteps$material3_release;
            H = kotlin.ranges.u.H(f5, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            boolean z4 = false;
            if (this.$state.getStartSteps$material3_release() > 0 && (startSteps$material3_release = this.$state.getStartSteps$material3_release() + 1) >= 0) {
                float f6 = H;
                float f7 = f6;
                int i5 = 0;
                while (true) {
                    float lerp = MathHelpersKt.lerp(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), i5 / (this.$state.getStartSteps$material3_release() + 1));
                    float f8 = lerp - H;
                    if (Math.abs(f8) <= f6) {
                        f6 = Math.abs(f8);
                        f7 = lerp;
                    }
                    if (i5 == startSteps$material3_release) {
                        break;
                    }
                    i5++;
                }
                H = f7;
            }
            if (!(H == this.$state.getActiveRangeStart())) {
                long SliderRange = SliderKt.SliderRange(H, this.$state.getActiveRangeEnd());
                if (!SliderRange.m2209equalsimpl0(SliderRange, SliderKt.SliderRange(this.$state.getActiveRangeStart(), this.$state.getActiveRangeEnd()))) {
                    if (this.$state.getOnValueChange$material3_release() != null) {
                        v3.l<SliderRange, r2> onValueChange$material3_release = this.$state.getOnValueChange$material3_release();
                        if (onValueChange$material3_release != null) {
                            onValueChange$material3_release.invoke(SliderRange.m2206boximpl(SliderRange));
                        }
                    } else {
                        this.$state.setActiveRangeStart(SliderRange.m2211getStartimpl(SliderRange));
                        this.$state.setActiveRangeEnd(SliderRange.m2210getEndInclusiveimpl(SliderRange));
                    }
                }
                v3.a<r2> onValueChangeFinished = this.$state.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderStartThumbSemantics$1(boolean z4, kotlin.ranges.f<Float> fVar, RangeSliderState rangeSliderState) {
        super(1);
        this.$enabled = z4;
        this.$valueRange = fVar;
        this.$state = rangeSliderState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$valueRange, this.$state), 1, null);
    }
}
