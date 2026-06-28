package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.b1;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010\u001eJ0\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJD\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nJ\u0012\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014R\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0017\u0010#\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR \u0010&\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u001e\u001a\u0004\b$\u0010\u001cR\u0017\u0010(\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010\u001cR\u0017\u0010*\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b)\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006.²\u0006\f\u0010,\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "height", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Lkotlin/r2;", "Indicator-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "width", "Landroidx/compose/ui/graphics/Shape;", "shape", "PrimaryIndicator-10LGxhE", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "PrimaryIndicator", "SecondaryIndicator-9IZ8Weo", "SecondaryIndicator", "Landroidx/compose/material3/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "ScrollableTabRowEdgeStartPadding", "F", "getScrollableTabRowEdgeStartPadding-D9Ej5fM", "()F", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getContainerColor$annotations", "()V", "containerColor", "getPrimaryContainerColor", "primaryContainerColor", "getSecondaryContainerColor", "secondaryContainerColor", "getContentColor", "getContentColor$annotations", "contentColor", "getPrimaryContentColor", "primaryContentColor", "getSecondaryContentColor", "secondaryContentColor", "<init>", "currentTabWidth", "indicatorOffset", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1223:1\n154#2:1224\n154#2:1226\n135#3:1225\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1085#1:1224\n1003#1:1226\n1130#1:1225\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float ScrollableTabRowEdgeStartPadding = Dp.m6044constructorimpl(52);

    private TabRowDefaults() {
    }

    @kotlin.k(message = "Use TabRowDefaults.primaryContainerColor instead", replaceWith = @b1(expression = "primaryContainerColor", imports = {}))
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    @kotlin.k(message = "Use TabRowDefaults.primaryContentColor instead", replaceWith = @b1(expression = "primaryContentColor", imports = {}))
    public static /* synthetic */ void getContentColor$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(message = "Use SecondaryIndicator instead.", replaceWith = @kotlin.b1(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2349Indicator9IZ8Weo(@p4.m androidx.compose.ui.Modifier r16, float r17, long r18, @p4.m androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.m2349Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: PrimaryIndicator-10LGxhE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2350PrimaryIndicator10LGxhE(@p4.m androidx.compose.ui.Modifier r17, float r18, float r19, long r20, @p4.m androidx.compose.ui.graphics.Shape r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.m2350PrimaryIndicator10LGxhE(androidx.compose.ui.Modifier, float, float, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: SecondaryIndicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2351SecondaryIndicator9IZ8Weo(@p4.m androidx.compose.ui.Modifier r16, float r17, long r18, @p4.m androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.m2351SecondaryIndicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @u3.h(name = "getContainerColor")
    @Composable
    public final long getContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-2026555673);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i5, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:1011)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getContentColor")
    @Composable
    public final long getContentColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1163072359);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i5, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1030)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getPrimaryContainerColor")
    @Composable
    public final long getPrimaryContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-2069154037);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2069154037, i5, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1016)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getPrimaryContentColor")
    @Composable
    public final long getPrimaryContentColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1410362619);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1410362619, i5, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1035)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getScrollableTabRowEdgeStartPadding-D9Ej5fM, reason: not valid java name */
    public final float m2352getScrollableTabRowEdgeStartPaddingD9Ej5fM() {
        return ScrollableTabRowEdgeStartPadding;
    }

    @u3.h(name = "getSecondaryContainerColor")
    @Composable
    public final long getSecondaryContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1938007129);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938007129, i5, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1021)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getSecondaryContentColor")
    @Composable
    public final long getSecondaryContentColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1166419479);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1166419479, i5, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1040)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    public final Modifier tabIndicatorOffset(@p4.l Modifier modifier, @p4.l TabPosition tabPosition) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}
