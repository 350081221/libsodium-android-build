package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u0000*\u00020\u00002#\u0010\u0007\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "measure", "layout", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutModifierKt {
    @l
    public static final Modifier layout(@l Modifier modifier, @l q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return modifier.then(new LayoutElement(qVar));
    }
}
