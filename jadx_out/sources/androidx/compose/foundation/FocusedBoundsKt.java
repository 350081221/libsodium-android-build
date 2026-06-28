package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.i0;
import kotlin.r2;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\"0\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/r2;", "onPositioned", "onFocusedBoundsChanged", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalFocusedBoundsObserver", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalFocusedBoundsObserver", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsKt {

    @p4.l
    private static final ProvidableModifierLocal<v3.l<LayoutCoordinates, r2>> ModifierLocalFocusedBoundsObserver = ModifierLocalKt.modifierLocalOf(FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.INSTANCE);

    @p4.l
    public static final ProvidableModifierLocal<v3.l<LayoutCoordinates, r2>> getModifierLocalFocusedBoundsObserver() {
        return ModifierLocalFocusedBoundsObserver;
    }

    @p4.l
    @ExperimentalFoundationApi
    public static final Modifier onFocusedBoundsChanged(@p4.l Modifier modifier, @p4.l v3.l<? super LayoutCoordinates, r2> lVar) {
        return modifier.then(new FocusedBoundsObserverElement(lVar));
    }
}
