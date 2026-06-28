package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "create", "node", "Lkotlin/r2;", "update", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/runtime/CompositionLocalMap;", "map", "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "<init>", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {
    public static final int $stable = 0;

    @l
    private final CompositionLocalMap map;

    public CompositionLocalMapInjectionElement(@l CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && l0.g(((CompositionLocalMapInjectionElement) obj).map, this.map);
    }

    @l
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("<Injected CompositionLocalMap>");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public CompositionLocalMapInjectionNode create() {
        return new CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l CompositionLocalMapInjectionNode compositionLocalMapInjectionNode) {
        compositionLocalMapInjectionNode.setMap(this.map);
    }
}
