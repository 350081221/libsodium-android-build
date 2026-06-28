package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"HorizontalScrollableClipModifier", "Landroidx/compose/ui/Modifier;", "MaxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "getMaxSupportedElevation", "()F", "F", "VerticalScrollableClipModifier", "clipScrollableContainer", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n154#2:101\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n63#1:101\n*E\n"})
/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {

    @p4.l
    private static final Modifier HorizontalScrollableClipModifier;
    private static final float MaxSupportedElevation = Dp.m6044constructorimpl(30);

    @p4.l
    private static final Modifier VerticalScrollableClipModifier;

    static {
        Modifier.Companion companion = Modifier.Companion;
        HorizontalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            @p4.l
            /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
            public Outline mo251createOutlinePq9zytI(long j5, @p4.l LayoutDirection layoutDirection, @p4.l Density density) {
                float mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(0.0f, -mo298roundToPx0680j_4, Size.m3562getWidthimpl(j5), Size.m3559getHeightimpl(j5) + mo298roundToPx0680j_4));
            }
        });
        VerticalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            @p4.l
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo251createOutlinePq9zytI(long j5, @p4.l LayoutDirection layoutDirection, @p4.l Density density) {
                float mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(-mo298roundToPx0680j_4, 0.0f, Size.m3562getWidthimpl(j5) + mo298roundToPx0680j_4, Size.m3559getHeightimpl(j5)));
            }
        });
    }

    @Stable
    @p4.l
    public static final Modifier clipScrollableContainer(@p4.l Modifier modifier, @p4.l Orientation orientation) {
        Modifier modifier2;
        if (orientation == Orientation.Vertical) {
            modifier2 = VerticalScrollableClipModifier;
        } else {
            modifier2 = HorizontalScrollableClipModifier;
        }
        return modifier.then(modifier2);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
