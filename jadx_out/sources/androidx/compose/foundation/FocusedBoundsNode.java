package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/r2;", "notifyObserverWhenAttached", "", "focused", "setFocus", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "isFocused", "Z", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Lkotlin/Function1;", "getObserver", "()Lv3/l;", "observer", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsNode extends Modifier.Node implements ModifierLocalModifierNode, GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private boolean isFocused;

    @p4.m
    private LayoutCoordinates layoutCoordinates;

    private final v3.l<LayoutCoordinates, r2> getObserver() {
        if (isAttached()) {
            return (v3.l) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        v3.l<LayoutCoordinates, r2> observer;
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            l0.m(layoutCoordinates);
            if (layoutCoordinates.isAttached() && (observer = getObserver()) != null) {
                observer.invoke(this.layoutCoordinates);
            }
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@p4.l LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
        if (!this.isFocused) {
            return;
        }
        if (layoutCoordinates.isAttached()) {
            notifyObserverWhenAttached();
            return;
        }
        v3.l<LayoutCoordinates, r2> observer = getObserver();
        if (observer != null) {
            observer.invoke(null);
        }
    }

    public final void setFocus(boolean z4) {
        if (z4 == this.isFocused) {
            return;
        }
        if (!z4) {
            v3.l<LayoutCoordinates, r2> observer = getObserver();
            if (observer != null) {
                observer.invoke(null);
            }
        } else {
            notifyObserverWhenAttached();
        }
        this.isFocused = z4;
    }
}
