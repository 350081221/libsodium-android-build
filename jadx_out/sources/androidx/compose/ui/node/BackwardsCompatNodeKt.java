package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\" \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "", "isChainUpdate", "androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1", "DetachedModifierLocalReadScope", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "Lkotlin/Function1;", "Lkotlin/r2;", "onDrawCacheReadsChanged", "Lv3/l;", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackwardsCompatNodeKt {

    @l
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(@l ModifierLocal<T> modifierLocal) {
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };

    @l
    private static final v3.l<BackwardsCompatNode, r2> onDrawCacheReadsChanged = BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.INSTANCE;

    @l
    private static final v3.l<BackwardsCompatNode, r2> updateModifierLocalConsumer = BackwardsCompatNodeKt$updateModifierLocalConsumer$1.INSTANCE;

    public static final boolean isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui_release().getTail$ui_release();
        l0.n(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
