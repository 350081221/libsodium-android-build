package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"aspectRatio", "Landroidx/compose/ui/Modifier;", "ratio", "", "matchHeightConstraintsFirst", "", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,236:1\n135#2:237\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n63#1:237\n*E\n"})
/* loaded from: classes.dex */
public final class AspectRatioKt {
    @Stable
    @l
    public static final Modifier aspectRatio(@l Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f5, boolean z4) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f5, z4);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AspectRatioElement(f5, z4, noInspectorInfo));
    }

    public static /* synthetic */ Modifier aspectRatio$default(Modifier modifier, float f5, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return aspectRatio(modifier, f5, z4);
    }
}
