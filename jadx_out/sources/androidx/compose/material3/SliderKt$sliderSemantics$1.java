package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$sliderSemantics$1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ SliderState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Float, Boolean> {
        final /* synthetic */ SliderState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SliderState sliderState) {
            super(1);
            this.$state = sliderState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Float f5) {
            return invoke(f5.floatValue());
        }

        @p4.l
        public final Boolean invoke(float f5) {
            float H;
            int steps;
            H = kotlin.ranges.u.H(f5, this.$state.getValueRange().getStart().floatValue(), this.$state.getValueRange().getEndInclusive().floatValue());
            if (this.$state.getSteps() > 0 && (steps = this.$state.getSteps() + 1) >= 0) {
                float f6 = H;
                float f7 = f6;
                int i5 = 0;
                while (true) {
                    float lerp = MathHelpersKt.lerp(this.$state.getValueRange().getStart().floatValue(), this.$state.getValueRange().getEndInclusive().floatValue(), i5 / (this.$state.getSteps() + 1));
                    float f8 = lerp - H;
                    if (Math.abs(f8) <= f6) {
                        f6 = Math.abs(f8);
                        f7 = lerp;
                    }
                    if (i5 == steps) {
                        break;
                    }
                    i5++;
                }
                H = f7;
            }
            if (!(H == this.$state.getValue())) {
                if (!(H == this.$state.getValue())) {
                    if (this.$state.getOnValueChange$material3_release() != null) {
                        v3.l<Float, r2> onValueChange$material3_release = this.$state.getOnValueChange$material3_release();
                        if (onValueChange$material3_release != null) {
                            onValueChange$material3_release.invoke(Float.valueOf(H));
                        }
                    } else {
                        this.$state.setValue(H);
                    }
                }
                v3.a<r2> onValueChangeFinished = this.$state.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
                r1 = true;
            }
            return Boolean.valueOf(r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderSemantics$1(boolean z4, SliderState sliderState) {
        super(1);
        this.$enabled = z4;
        this.$state = sliderState;
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
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$state), 1, null);
    }
}
