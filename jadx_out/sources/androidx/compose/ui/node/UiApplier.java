package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "", "index", "instance", "Lkotlin/r2;", "insertTopDown", "insertBottomUp", "count", "remove", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "onClear", "onEndChanges", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = 0;

    public UiApplier(@l LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i5, @l LayoutNode layoutNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i5, int i6, int i7) {
        getCurrent().move$ui_release(i5, i6, i7);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i5, int i6) {
        getCurrent().removeAt$ui_release(i5, i6);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i5, @l LayoutNode layoutNode) {
        getCurrent().insertAt$ui_release(i5, layoutNode);
    }
}
