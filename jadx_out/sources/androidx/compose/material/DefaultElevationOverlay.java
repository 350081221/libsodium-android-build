package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "()V", "apply", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "elevation", "Landroidx/compose/ui/unit/Dp;", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n154#2:103\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n71#1:103\n*E\n"})
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {

    @l
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo1315apply7g2Lkgo(long j5, float f5, @m Composer composer, int i5) {
        long m1340calculateForegroundColorCLU3JFs;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i5, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl(0)) > 0 && !colors.isLight()) {
            m1340calculateForegroundColorCLU3JFs = ElevationOverlayKt.m1340calculateForegroundColorCLU3JFs(j5, f5, composer, (i5 & 112) | (i5 & 14));
            j5 = ColorKt.m3779compositeOverOWjLjI(m1340calculateForegroundColorCLU3JFs, j5);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j5;
    }
}
