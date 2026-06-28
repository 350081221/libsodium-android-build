package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u009f\u0001\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u000423\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a©\u0001\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u001723\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/v0;", "name", "tabPositions", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLv3/q;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLv3/q;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,521:1\n154#2:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n512#1:522\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6044constructorimpl(90);

    @l
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1483ScrollableTabRowsKfQg0A(int r26, @p4.m androidx.compose.ui.Modifier r27, long r28, long r30, float r32, @p4.m v3.q<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m1483ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1484TabRowpAZo6Ak(int r26, @p4.m androidx.compose.ui.Modifier r27, long r28, long r30, @p4.m v3.q<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m1484TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
