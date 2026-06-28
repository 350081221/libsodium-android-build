package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.u;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$sliderSemantics$1 extends n0 implements l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ float $coerced;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ l<Float, r2> $onValueChange;
    final /* synthetic */ a<r2> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$sliderSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Float, Boolean> {
        final /* synthetic */ float $coerced;
        final /* synthetic */ l<Float, r2> $onValueChange;
        final /* synthetic */ a<r2> $onValueChangeFinished;
        final /* synthetic */ int $steps;
        final /* synthetic */ f<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(f<Float> fVar, int i5, float f5, l<? super Float, r2> lVar, a<r2> aVar) {
            super(1);
            this.$valueRange = fVar;
            this.$steps = i5;
            this.$coerced = f5;
            this.$onValueChange = lVar;
            this.$onValueChangeFinished = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(Float f5) {
            return invoke(f5.floatValue());
        }

        @p4.l
        public final Boolean invoke(float f5) {
            float H;
            int i5;
            H = u.H(f5, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            int i6 = this.$steps;
            boolean z4 = false;
            if (i6 > 0 && (i5 = i6 + 1) >= 0) {
                float f6 = H;
                float f7 = f6;
                int i7 = 0;
                while (true) {
                    float lerp = MathHelpersKt.lerp(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), i7 / (this.$steps + 1));
                    float f8 = lerp - H;
                    if (Math.abs(f8) <= f6) {
                        f6 = Math.abs(f8);
                        f7 = lerp;
                    }
                    if (i7 == i5) {
                        break;
                    }
                    i7++;
                }
                H = f7;
            }
            if (!(H == this.$coerced)) {
                this.$onValueChange.invoke(Float.valueOf(H));
                a<r2> aVar = this.$onValueChangeFinished;
                if (aVar != null) {
                    aVar.invoke();
                }
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderSemantics$1(boolean z4, f<Float> fVar, int i5, float f5, l<? super Float, r2> lVar, a<r2> aVar) {
        super(1);
        this.$enabled = z4;
        this.$valueRange = fVar;
        this.$steps = i5;
        this.$coerced = f5;
        this.$onValueChange = lVar;
        this.$onValueChangeFinished = aVar;
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
        SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$valueRange, this.$steps, this.$coerced, this.$onValueChange, this.$onValueChangeFinished), 1, null);
    }
}
