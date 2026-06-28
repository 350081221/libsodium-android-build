package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\\\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0090\u0001\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011\u001an\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001d\u001a¤\u0001\u0010'\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a¤\u0001\u0010)\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010&\u001a\u009a\u0001\u0010,\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a \u0001\u0010/\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020#2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0006\u0010\"\u001a\u00020!H\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u00100\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLv3/q;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "SecondaryTabRow-pAZo6Ak", "SecondaryTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/v0;", "name", "tabPositions", "TabRow-pAZo6Ak", "TabRow", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLv3/q;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "TabRowImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "TabRowWithSubcomposeImpl", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLv3/q;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "PrimaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryScrollableTabRow", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLv3/q;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRowImp-qhFBPw4", "(ILv3/q;Landroidx/compose/ui/Modifier;JJFLv3/p;Lv3/p;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowImp", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1223:1\n154#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1214#1:1224\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6044constructorimpl(90);

    @p4.l
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0176  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2353PrimaryScrollableTabRowqhFBPw4(int r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.ScrollState r30, long r31, long r33, float r35, @p4.m v3.q<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2353PrimaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2354PrimaryTabRowpAZo6Ak(int r21, @p4.m androidx.compose.ui.Modifier r22, long r23, long r25, @p4.m v3.q<? super androidx.compose.material3.TabIndicatorScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2354PrimaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2355ScrollableTabRowsKfQg0A(int r27, @p4.m androidx.compose.ui.Modifier r28, long r29, long r31, float r33, @p4.m v3.q<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2355ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00dc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRowImp-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2356ScrollableTabRowImpqhFBPw4(int r27, v3.q<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, androidx.compose.ui.Modifier r29, long r30, long r32, float r34, v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, androidx.compose.foundation.ScrollState r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2356ScrollableTabRowImpqhFBPw4(int, v3.q, androidx.compose.ui.Modifier, long, long, float, v3.p, v3.p, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0176  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2357SecondaryScrollableTabRowqhFBPw4(int r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.ScrollState r30, long r31, long r33, float r35, @p4.m v3.q<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2357SecondaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2358SecondaryTabRowpAZo6Ak(int r21, @p4.m androidx.compose.ui.Modifier r22, long r23, long r25, @p4.m v3.q<? super androidx.compose.material3.TabIndicatorScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2358SecondaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2359TabRowpAZo6Ak(int r21, @p4.m androidx.compose.ui.Modifier r22, long r23, long r25, @p4.m v3.q<? super java.util.List<androidx.compose.material3.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m2359TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, v3.q, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m2360TabRowImplDTcfvLk(Modifier modifier, long j5, long j6, v3.q<? super TabIndicatorScope, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1757425411);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(j5)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(j6)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i6, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:365)");
            }
            int i13 = i6 << 3;
            SurfaceKt.m2304SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j5, j6, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -65106680, true, new TabRowKt$TabRowImpl$1(pVar2, pVar, qVar)), startRestartGroup, (i13 & 896) | 12582912 | (i13 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabRowKt$TabRowImpl$2(modifier, j5, j6, qVar, pVar, pVar2, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m2361TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, long j5, long j6, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-160898917);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(j5)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(j6)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i6, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:582)");
            }
            int i13 = i6 << 3;
            SurfaceKt.m2304SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j5, j6, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1617702432, true, new TabRowKt$TabRowWithSubcomposeImpl$1(pVar2, pVar, qVar)), startRestartGroup, (i13 & 896) | 12582912 | (i13 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabRowKt$TabRowWithSubcomposeImpl$2(modifier, j5, j6, qVar, pVar, pVar2, i5));
        }
    }
}
