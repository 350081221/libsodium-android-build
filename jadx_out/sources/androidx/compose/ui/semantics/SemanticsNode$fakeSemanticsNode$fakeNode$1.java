package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.i0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/ui/semantics/SemanticsNode$fakeSemanticsNode$fakeNode$1", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "applySemantics", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {
    final /* synthetic */ l<SemanticsPropertyReceiver, r2> $properties;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsNode$fakeSemanticsNode$fakeNode$1(l<? super SemanticsPropertyReceiver, r2> lVar) {
        this.$properties = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.$properties.invoke(semanticsPropertyReceiver);
    }
}
