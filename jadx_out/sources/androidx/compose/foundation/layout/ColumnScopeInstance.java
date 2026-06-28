package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J \u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0017J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0017J\u001c\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/ColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "weight", "", "fill", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {
    public static final int $stable = 0;

    @l
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier align(@l Modifier modifier, @l Alignment.Horizontal horizontal) {
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier alignBy(@l Modifier modifier, @l VerticalAlignmentLine verticalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(verticalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier weight(@l Modifier modifier, float f5, boolean z4) {
        boolean z5;
        float A;
        if (f5 > 0.0d) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            A = u.A(f5, Float.MAX_VALUE);
            return modifier.then(new LayoutWeightElement(A, z4));
        }
        throw new IllegalArgumentException(("invalid weight " + f5 + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier alignBy(@l Modifier modifier, @l v3.l<? super Measured, Integer> lVar) {
        return modifier.then(new WithAlignmentLineBlockElement(lVar));
    }
}
