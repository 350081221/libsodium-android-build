package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"height", "Landroidx/compose/ui/Modifier;", "intrinsicSize", "Landroidx/compose/foundation/layout/IntrinsicSize;", "requiredHeight", "requiredWidth", "width", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIntrinsic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,285:1\n135#2:286\n135#2:287\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n52#1:286\n76#1:287\n98#1:288\n120#1:289\n*E\n"})
/* loaded from: classes.dex */
public final class IntrinsicKt {
    @Stable
    @l
    public static final Modifier height(@l Modifier modifier, @l IntrinsicSize intrinsicSize) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new IntrinsicKt$height$$inlined$debugInspectorInfo$1(intrinsicSize);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, true, noInspectorInfo));
    }

    @Stable
    @l
    public static final Modifier requiredHeight(@l Modifier modifier, @l IntrinsicSize intrinsicSize) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new IntrinsicKt$requiredHeight$$inlined$debugInspectorInfo$1(intrinsicSize);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, false, noInspectorInfo));
    }

    @Stable
    @l
    public static final Modifier requiredWidth(@l Modifier modifier, @l IntrinsicSize intrinsicSize) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1(intrinsicSize);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, false, noInspectorInfo));
    }

    @Stable
    @l
    public static final Modifier width(@l Modifier modifier, @l IntrinsicSize intrinsicSize) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new IntrinsicKt$width$$inlined$debugInspectorInfo$1(intrinsicSize);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, true, noInspectorInfo));
    }
}
