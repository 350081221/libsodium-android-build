package androidx.compose.ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.k;
import kotlin.m;
import p4.l;

@StabilityInferred(parameters = 0)
@k(level = m.ERROR, message = "It is a test API, do not use it in the real applications")
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/r2;", "updateModifier", "Landroidx/compose/ui/node/LayoutNode;", "node", "Landroidx/compose/ui/node/LayoutNode;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;

    @l
    private final LayoutNode node;

    public TestModifierUpdater(@l LayoutNode layoutNode) {
        this.node = layoutNode;
    }

    public final void updateModifier(@l Modifier modifier) {
        this.node.setModifier(modifier);
    }
}
