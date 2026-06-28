package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LookaheadScopeKt$LookaheadScope$2$1 extends n0 implements l<LayoutNode, r2> {
    public static final LookaheadScopeKt$LookaheadScope$2$1 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$1();

    LookaheadScopeKt$LookaheadScope$2$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LayoutNode layoutNode) {
        layoutNode.setVirtualLookaheadRoot$ui_release(true);
    }
}
