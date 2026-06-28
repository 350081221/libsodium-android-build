package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,475:1\n76#2:476\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n*L\n348#1:476\n*E\n"})
/* loaded from: classes.dex */
final class SemanticsNode$parent$2 extends n0 implements l<LayoutNode, Boolean> {
    public static final SemanticsNode$parent$2 INSTANCE = new SemanticsNode$parent$2();

    SemanticsNode$parent$2() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l LayoutNode layoutNode) {
        return Boolean.valueOf(layoutNode.getNodes$ui_release().m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(8)));
    }
}
