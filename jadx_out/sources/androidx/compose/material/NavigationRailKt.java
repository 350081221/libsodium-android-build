package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.r2;
import p4.l;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0082\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001az\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u008e\u0001\u0010#\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aR\u0010,\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152&\u0010\u000f\u001a\"\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aA\u0010.\u001a\u00020\u000b2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0002\b\f2\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017¢\u0006\u0002\b\f2\b\b\u0001\u0010-\u001a\u00020&H\u0003¢\u0006\u0004\b.\u0010/\u001a&\u00108\u001a\u000205*\u0002002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a8\u0010<\u001a\u000205*\u0002002\u0006\u00109\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\b\b\u0001\u0010-\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020&0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010A\"\u0014\u0010C\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010A\"\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010A\"\u0014\u0010E\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010A\"\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010A\"\u0014\u0010G\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I²\u0006\f\u0010)\u001a\u00020&8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "header", "content", "NavigationRail-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLv3/q;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLv3/q;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", TTDownloadField.TT_LABEL, "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "activeColor", "inactiveColor", "", "Lkotlin/v0;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLv3/q;Landroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "iconPositionAnimationProgress", "NavigationRailItemBaselineLayout", "(Lv3/p;Lv3/p;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "Landroidx/compose/animation/core/TweenSpec;", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "NavigationRailItemSize", "F", "NavigationRailItemCompactSize", "NavigationRailPadding", "HeaderPadding", "ItemLabelBaselineBottomOffset", "ItemIconTopOffset", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,474:1\n25#2:475\n456#2,8:499\n464#2,3:513\n467#2,3:517\n456#2,8:542\n464#2,3:556\n456#2,8:576\n464#2,3:590\n467#2,3:594\n456#2,8:616\n464#2,3:630\n467#2,3:634\n467#2,3:639\n1116#3,6:476\n1116#3,6:522\n74#4:482\n69#5,5:483\n74#5:516\n78#5:521\n68#5,6:559\n74#5:593\n78#5:598\n68#5,6:599\n74#5:633\n78#5:638\n79#6,11:488\n92#6:520\n76#6,14:528\n79#6,11:565\n92#6:597\n79#6,11:605\n92#6:637\n92#6:642\n3737#7,6:507\n3737#7,6:550\n3737#7,6:584\n3737#7,6:624\n81#8:643\n154#9:644\n154#9:645\n154#9:646\n154#9:647\n154#9:648\n154#9:649\n154#9:650\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n212#1:475\n233#1:499,8\n233#1:513,3\n233#1:517,3\n331#1:542,8\n331#1:556,3\n333#1:576,8\n333#1:590,3\n333#1:594,3\n335#1:616,8\n335#1:630,3\n335#1:634,3\n331#1:639,3\n212#1:476,6\n342#1:522,6\n214#1:482\n233#1:483,5\n233#1:516\n233#1:521\n333#1:559,6\n333#1:593\n333#1:598\n335#1:599,6\n335#1:633\n335#1:638\n233#1:488,11\n233#1:520\n331#1:528,14\n333#1:565,11\n333#1:597\n335#1:605,11\n335#1:637\n331#1:642\n233#1:507,6\n331#1:550,6\n333#1:584,6\n335#1:624,6\n299#1:643\n445#1:644\n450#1:645\n455#1:646\n461#1:647\n466#1:648\n471#1:649\n473#1:650\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;

    @l
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m6044constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m6044constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m6044constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m6044constructorimpl(14);

    @l
    private static final WindowInsets ZeroInsets = WindowInsetsKt.m627WindowInsetsa9UjIt4$default(Dp.m6044constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);

    static {
        float f5 = 8;
        NavigationRailPadding = Dp.m6044constructorimpl(f5);
        HeaderPadding = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1383NavigationRailHsRjFd4(@p4.m androidx.compose.ui.Modifier r22, long r23, long r25, float r27, @p4.m v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1383NavigationRailHsRjFd4(androidx.compose.ui.Modifier, long, long, float, v3.q, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1384NavigationRailafqeVBk(@p4.l androidx.compose.foundation.layout.WindowInsets r24, @p4.m androidx.compose.ui.Modifier r25, long r26, long r28, float r30, @p4.m v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1384NavigationRailafqeVBk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, v3.q, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1385NavigationRailItem0S3VyRs(boolean r24, @p4.l v3.a<kotlin.r2> r25, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.m androidx.compose.ui.Modifier r27, boolean r28, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, boolean r30, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r31, long r32, long r34, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1385NavigationRailItem0S3VyRs(boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemBaselineLayout(p<? super Composer, ? super Integer, r2> pVar, final p<? super Composer, ? super Integer, r2> pVar2, @FloatRange(from = 0.0d, to = 1.0d) final float f5, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1903861684);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(f5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903861684, i6, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:329)");
            }
            startRestartGroup.startReplaceableGroup(-498208610);
            boolean changedInstance = startRestartGroup.changedInstance(pVar2) | startRestartGroup.changed(f5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                        Placeable placeable;
                        MeasureResult m1391placeLabelAndIconDIyivk0;
                        MeasureResult m1390placeIcon3p2s80s;
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Measurable measurable = list.get(i10);
                            if (l0.g(LayoutIdKt.getLayoutId(measurable), "icon")) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
                                if (pVar2 != null) {
                                    int size2 = list.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        Measurable measurable2 = list.get(i11);
                                        if (l0.g(LayoutIdKt.getLayoutId(measurable2), TTDownloadField.TT_LABEL)) {
                                            placeable = measurable2.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                placeable = null;
                                Placeable placeable2 = placeable;
                                if (pVar2 == null) {
                                    m1390placeIcon3p2s80s = NavigationRailKt.m1390placeIcon3p2s80s(measureScope, mo4998measureBRTryo0, j5);
                                    return m1390placeIcon3p2s80s;
                                }
                                l0.m(placeable2);
                                m1391placeLabelAndIconDIyivk0 = NavigationRailKt.m1391placeLabelAndIconDIyivk0(measureScope, placeable2, mo4998measureBRTryo0, j5, f5);
                                return m1391placeLabelAndIconDIyivk0;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor2 = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(286686926);
            if (pVar2 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, TTDownloadField.TT_LABEL), f5);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor3 = companion2.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(alpha);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                pVar2.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(pVar, pVar2, f5, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1386NavigationRailTransitionKlgxPg(long j5, long j6, boolean z4, q<? super Float, ? super Composer, ? super Integer, r2> qVar, Composer composer, int i5) {
        int i6;
        float f5;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-207161906);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(j5)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(j6)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if ((i6 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, i6, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:297)");
            }
            if (z4) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            composer2 = startRestartGroup;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f5, NavigationRailAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m3785lerpjxsXWHM = ColorKt.m3785lerpjxsXWHM(j6, j5, NavigationRailTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(Color.m3733copywmQWz5c$default(m3785lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(m3785lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -1688205042, true, new NavigationRailKt$NavigationRailTransition$1(qVar, animateFloatAsState)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailTransition$2(j5, j6, z4, qVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1390placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j5) {
        return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, new NavigationRailKt$placeIcon$1(placeable, Math.max(0, (Constraints.m6000getMaxWidthimpl(j5) - placeable.getWidth()) / 2), Math.max(0, (Constraints.m5999getMaxHeightimpl(j5) - placeable.getHeight()) / 2)), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1391placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        int L0;
        int m5999getMaxHeightimpl = (Constraints.m5999getMaxHeightimpl(j5) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo298roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        int m6000getMaxWidthimpl = (Constraints.m6000getMaxWidthimpl(j5) - placeable.getWidth()) / 2;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(ItemIconTopOffset);
        int m5999getMaxHeightimpl2 = (Constraints.m5999getMaxHeightimpl(j5) - placeable2.getHeight()) / 2;
        int m6000getMaxWidthimpl2 = (Constraints.m6000getMaxWidthimpl(j5) - placeable2.getWidth()) / 2;
        L0 = d.L0((m5999getMaxHeightimpl2 - mo298roundToPx0680j_4) * (1 - f5));
        return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, new NavigationRailKt$placeLabelAndIcon$1(f5, placeable, m6000getMaxWidthimpl, m5999getMaxHeightimpl, L0, placeable2, m6000getMaxWidthimpl2, mo298roundToPx0680j_4), 4, null);
    }
}
