package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Lkotlin/r2;", "Indicator-FNF3uiM", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Indicator", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/unit/Dp;", "PositionalThreshold", "F", "getPositionalThreshold-D9Ej5fM", "()F", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getContentColor", "contentColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n74#2:559\n154#3:560\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n*L\n166#1:559\n157#1:560\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshDefaults {
    public static final int $stable = 0;

    @l
    public static final PullToRefreshDefaults INSTANCE = new PullToRefreshDefaults();

    @l
    private static final Shape shape = RoundedCornerShapeKt.getCircleShape();
    private static final float PositionalThreshold = Dp.m6044constructorimpl(80);

    private PullToRefreshDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0059  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Indicator-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2617IndicatorFNF3uiM(@p4.l androidx.compose.material3.pulltorefresh.PullToRefreshState r18, @p4.m androidx.compose.ui.Modifier r19, long r20, @p4.m androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.m2617IndicatorFNF3uiM(androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @h(name = "getContainerColor")
    @Composable
    public final long getContainerColor(@m Composer composer, int i5) {
        composer.startReplaceableGroup(1066257972);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066257972, i5, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:150)");
        }
        long m1709getSurfaceContainerHigh0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1709getSurfaceContainerHigh0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1709getSurfaceContainerHigh0d7_KjU;
    }

    @h(name = "getContentColor")
    @Composable
    public final long getContentColor(@m Composer composer, int i5) {
        composer.startReplaceableGroup(813427380);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(813427380, i5, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-contentColor> (PullToRefresh.kt:153)");
        }
        long m1696getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1696getOnSurfaceVariant0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1696getOnSurfaceVariant0d7_KjU;
    }

    /* renamed from: getPositionalThreshold-D9Ej5fM, reason: not valid java name */
    public final float m2618getPositionalThresholdD9Ej5fM() {
        return PositionalThreshold;
    }

    @l
    public final Shape getShape() {
        return shape;
    }
}
