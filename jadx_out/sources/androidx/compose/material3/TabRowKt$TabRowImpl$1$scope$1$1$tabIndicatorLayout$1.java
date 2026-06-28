package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import v3.r;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$TabRowImpl$1$scope$1$1$tabIndicatorLayout$1 extends kotlin.jvm.internal.n0 implements v3.q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ r<MeasureScope, Measurable, Constraints, List<TabPosition>, MeasureResult> $measure;
    final /* synthetic */ TabRowKt$TabRowImpl$1$scope$1$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRowImpl$1$scope$1$1$tabIndicatorLayout$1(r<? super MeasureScope, ? super Measurable, ? super Constraints, ? super List<TabPosition>, ? extends MeasureResult> rVar, TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
        super(3);
        this.$measure = rVar;
        this.this$0 = tabRowKt$TabRowImpl$1$scope$1$1;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m2366invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m2366invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        return this.$measure.invoke(measureScope, measurable, Constraints.m5988boximpl(j5), this.this$0.getTabPositions().getValue());
    }
}
