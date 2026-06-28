package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/r2;", "onGloballyPositioned", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierKt {
    @Stable
    @l
    public static final Modifier onGloballyPositioned(@l Modifier modifier, @l v3.l<? super LayoutCoordinates, r2> lVar) {
        return modifier.then(new OnGloballyPositionedElement(lVar));
    }
}
