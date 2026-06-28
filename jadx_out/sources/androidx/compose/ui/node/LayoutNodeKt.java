package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "child", "Lkotlin/r2;", "add", "", "DebugChanges", "Z", "getDebugChanges$annotations", "()V", "Landroidx/compose/ui/unit/Density;", "DefaultDensity", "Landroidx/compose/ui/unit/Density;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;

    @l
    private static final Density DefaultDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    public static final /* synthetic */ Density access$getDefaultDensity$p() {
        return DefaultDensity;
    }

    public static final void add(@l LayoutNode layoutNode, @l LayoutNode layoutNode2) {
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), layoutNode2);
    }

    private static /* synthetic */ void getDebugChanges$annotations() {
    }

    @l
    public static final Owner requireOwner(@l LayoutNode layoutNode) {
        Owner owner$ui_release = layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
