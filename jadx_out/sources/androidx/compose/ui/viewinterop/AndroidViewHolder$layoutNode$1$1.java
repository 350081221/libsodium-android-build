package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/Modifier;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$1 extends n0 implements l<Modifier, r2> {
    final /* synthetic */ Modifier $coreModifier;
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, Modifier modifier) {
        super(1);
        this.$layoutNode = layoutNode;
        this.$coreModifier = modifier;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Modifier modifier) {
        invoke2(modifier);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Modifier modifier) {
        this.$layoutNode.setModifier(modifier.then(this.$coreModifier));
    }
}
