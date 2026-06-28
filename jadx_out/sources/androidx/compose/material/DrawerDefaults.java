package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u00020\u000b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "ScrimOpacity", "", "scrimColor", "Landroidx/compose/ui/graphics/Color;", "getScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,915:1\n154#2:916\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n*L\n772#1:916\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerDefaults {
    public static final int $stable = 0;
    public static final float ScrimOpacity = 0.32f;

    @l
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float Elevation = Dp.m6044constructorimpl(16);

    private DrawerDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1321getElevationD9Ej5fM() {
        return Elevation;
    }

    @h(name = "getScrimColor")
    @Composable
    public final long getScrimColor(@m Composer composer, int i5) {
        composer.startReplaceableGroup(617225966);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(617225966, i5, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:775)");
        }
        long m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3733copywmQWz5c$default;
    }
}
