package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "T", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2 extends n0 implements q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ OnLookaheadMeasured $onLookaheadMeasured;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2(OnLookaheadMeasured onLookaheadMeasured) {
        super(3);
        this.$onLookaheadMeasured = onLookaheadMeasured;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m58invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m58invoke3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        OnLookaheadMeasured onLookaheadMeasured = this.$onLookaheadMeasured;
        if (measureScope.isLookingAhead()) {
            onLookaheadMeasured.m89invokeozmzZPI(IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight()));
        }
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1(mo4998measureBRTryo0), 4, null);
    }
}
