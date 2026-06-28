package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$3$2$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    final /* synthetic */ p<LazyLayoutMeasureScope, Constraints, MeasureResult> $measurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, p<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
        super(2);
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$measurePolicy = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m716invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m716invoke0kLqBqw(@l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        return this.$measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(this.$itemContentFactory, subcomposeMeasureScope), Constraints.m5988boximpl(j5));
    }
}
