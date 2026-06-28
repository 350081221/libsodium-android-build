package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.i0;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "onAttach", "Landroidx/compose/runtime/CompositionLocalMap;", b.f22420d, "map", "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {
    public static final int $stable = 8;

    @l
    private CompositionLocalMap map;

    public CompositionLocalMapInjectionNode(@l CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    @l
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }

    public final void setMap(@l CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(compositionLocalMap);
    }
}
