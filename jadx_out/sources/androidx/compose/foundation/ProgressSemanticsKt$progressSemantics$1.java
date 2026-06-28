package androidx.compose.foundation;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.u;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressSemanticsKt$progressSemantics$1 extends n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ kotlin.ranges.f<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f5, kotlin.ranges.f<Float> fVar, int i5) {
        super(1);
        this.$value = f5;
        this.$valueRange = fVar;
        this.$steps = i5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object N;
        N = u.N(Float.valueOf(this.$value), this.$valueRange);
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) N).floatValue(), this.$valueRange, this.$steps));
    }
}
