package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/r2;", "onSizeChanged", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOnRemeasuredModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,96:1\n135#2:97\n*S KotlinDebug\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n*L\n50#1:97\n*E\n"})
/* loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    @Stable
    @l
    public static final Modifier onSizeChanged(@l Modifier modifier, @l v3.l<? super IntSize, r2> lVar) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new OnRemeasuredModifierKt$onSizeChanged$$inlined$debugInspectorInfo$1(lVar);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnSizeChangedModifier(lVar, noInspectorInfo));
    }
}
