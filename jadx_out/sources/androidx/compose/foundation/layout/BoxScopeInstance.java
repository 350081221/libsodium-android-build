package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0004H\u0017¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/BoxScopeInstance;", "Landroidx/compose/foundation/layout/BoxScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,310:1\n135#2:311\n135#2:312\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n251#1:311\n262#1:312\n*E\n"})
/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {
    public static final int $stable = 0;

    @l
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier align(@l Modifier modifier, @l Alignment alignment) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(alignment);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BoxChildDataElement(alignment, false, noInspectorInfo));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier matchParentSize(@l Modifier modifier) {
        v3.l noInspectorInfo;
        Alignment center = Alignment.Companion.getCenter();
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BoxChildDataElement(center, true, noInspectorInfo));
    }
}
