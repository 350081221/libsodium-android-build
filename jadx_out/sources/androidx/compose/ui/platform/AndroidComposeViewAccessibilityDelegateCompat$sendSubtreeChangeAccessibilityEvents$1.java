package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 extends kotlin.jvm.internal.n0 implements v3.l<LayoutNode, Boolean> {
    public static final AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1();

    AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l LayoutNode layoutNode) {
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        boolean z4 = false;
        if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
