package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,214:1\n135#2:215\n135#2:216\n135#2:217\n135#2:218\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n50#1:215\n75#1:216\n98#1:217\n117#1:218\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    @Stable
    @l
    public static final Modifier windowInsetsBottomHeight(@l Modifier modifier, @l WindowInsets windowInsets) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1(windowInsets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedHeightModifier(windowInsets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsBottomHeight$2.INSTANCE));
    }

    @Stable
    @l
    public static final Modifier windowInsetsEndWidth(@l Modifier modifier, @l WindowInsets windowInsets) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1(windowInsets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedWidthModifier(windowInsets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsEndWidth$2.INSTANCE));
    }

    @Stable
    @l
    public static final Modifier windowInsetsStartWidth(@l Modifier modifier, @l WindowInsets windowInsets) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1(windowInsets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedWidthModifier(windowInsets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsStartWidth$2.INSTANCE));
    }

    @Stable
    @l
    public static final Modifier windowInsetsTopHeight(@l Modifier modifier, @l WindowInsets windowInsets) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1(windowInsets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedHeightModifier(windowInsets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsTopHeight$2.INSTANCE));
    }
}
