package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.i0;
import kotlin.q1;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0014\u0010\u000bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/r2;", "onPositioned", "Lv3/l;", "getOnPositioned", "()Lv3/l;", "setOnPositioned", "(Lv3/l;)V", "focusBoundsObserver", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "getParent", "parent", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements ModifierLocalModifierNode {
    public static final int $stable = 8;

    @p4.l
    private final v3.l<LayoutCoordinates, r2> focusBoundsObserver;

    @p4.l
    private v3.l<? super LayoutCoordinates, r2> onPositioned;

    @p4.l
    private final ModifierLocalMap providedValues;

    public FocusedBoundsObserverNode(@p4.l v3.l<? super LayoutCoordinates, r2> lVar) {
        this.onPositioned = lVar;
        FocusedBoundsObserverNode$focusBoundsObserver$1 focusedBoundsObserverNode$focusBoundsObserver$1 = new FocusedBoundsObserverNode$focusBoundsObserver$1(this);
        this.focusBoundsObserver = focusedBoundsObserverNode$focusBoundsObserver$1;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(q1.a(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), focusedBoundsObserverNode$focusBoundsObserver$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v3.l<LayoutCoordinates, r2> getParent() {
        if (isAttached()) {
            return (v3.l) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    @p4.l
    public final v3.l<LayoutCoordinates, r2> getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @p4.l
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final void setOnPositioned(@p4.l v3.l<? super LayoutCoordinates, r2> lVar) {
        this.onPositioned = lVar;
    }
}
