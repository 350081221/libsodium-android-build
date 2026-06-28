package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pullRefreshIndicatorTransform", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "scale", "", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n146#2:78\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n42#1:77\n42#1:78\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorTransformKt {
    @l
    @ExperimentalMaterialApi
    public static final Modifier pullRefreshIndicatorTransform(@l Modifier modifier, @l PullRefreshState pullRefreshState, boolean z4) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$$inlined$debugInspectorInfo$1(pullRefreshState, z4);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(Modifier.Companion, PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1.INSTANCE), new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2(pullRefreshState, z4)));
    }

    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z4);
    }
}
