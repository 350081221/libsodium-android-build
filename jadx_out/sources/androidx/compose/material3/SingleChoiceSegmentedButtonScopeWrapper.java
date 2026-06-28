package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0097\u0001J!\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0097\u0001J\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0097\u0001J\r\u0010\u0010\u001a\u00020\u0006*\u00020\u0006H\u0097\u0001J!\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0097\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/SingleChoiceSegmentedButtonScopeWrapper;", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "scope", "(Landroidx/compose/foundation/layout/RowScope;)V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SingleChoiceSegmentedButtonScopeWrapper implements SingleChoiceSegmentedButtonRowScope, RowScope {
    private final /* synthetic */ RowScope $$delegate_0;

    public SingleChoiceSegmentedButtonScopeWrapper(@p4.l RowScope rowScope) {
        this.$$delegate_0 = rowScope;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @p4.l
    public Modifier align(@p4.l Modifier modifier, @p4.l Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @p4.l
    public Modifier alignBy(@p4.l Modifier modifier, @p4.l HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @p4.l
    public Modifier alignBy(@p4.l Modifier modifier, @p4.l v3.l<? super Measured, Integer> lVar) {
        return this.$$delegate_0.alignBy(modifier, lVar);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @p4.l
    public Modifier alignByBaseline(@p4.l Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @p4.l
    public Modifier weight(@p4.l Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f5, boolean z4) {
        return this.$$delegate_0.weight(modifier, f5, z4);
    }
}
