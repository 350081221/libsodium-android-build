package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a`\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aX\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0092\u0001\u0010\"\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aR\u0010+\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142&\u0010\u000e\u001a\"\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aA\u0010-\u001a\u00020\u000b2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\f2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\f2\b\b\u0001\u0010,\u001a\u00020%H\u0003¢\u0006\u0004\b-\u0010.\u001a&\u00107\u001a\u000204*\u00020/2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a8\u0010;\u001a\u000204*\u00020/2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\b\b\u0001\u0010,\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020%0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@\"\u0014\u0010B\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@\"\u0014\u0010C\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E²\u0006\f\u0010(\u001a\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "BottomNavigation-_UMDTes", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLv3/q;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLv3/q;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", TTDownloadField.TT_LABEL, "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "BottomNavigationItem", "activeColor", "inactiveColor", "", "Lkotlin/v0;", "name", "animationProgress", "BottomNavigationTransition-Klgx-Pg", "(JJZLv3/q;Landroidx/compose/runtime/Composer;I)V", "BottomNavigationTransition", "iconPositionAnimationProgress", "BottomNavigationItemBaselineLayout", "(Lv3/p;Lv3/p;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationHeight", "F", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,461:1\n25#2:462\n456#2,8:486\n464#2,3:500\n467#2,3:504\n456#2,8:529\n464#2,3:543\n456#2,8:563\n464#2,3:577\n467#2,3:581\n456#2,8:603\n464#2,3:617\n467#2,3:621\n467#2,3:626\n1116#3,6:463\n1116#3,6:509\n74#4:469\n69#5,5:470\n74#5:503\n78#5:508\n68#5,6:546\n74#5:580\n78#5:585\n68#5,6:586\n74#5:620\n78#5:625\n79#6,11:475\n92#6:507\n76#6,14:515\n79#6,11:552\n92#6:584\n79#6,11:592\n92#6:624\n92#6:629\n3737#7,6:494\n3737#7,6:537\n3737#7,6:571\n3737#7,6:611\n81#8:630\n154#9:631\n154#9:632\n154#9:633\n154#9:634\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n208#1:462\n223#1:486,8\n223#1:500,3\n223#1:504,3\n321#1:529,8\n321#1:543,3\n323#1:563,8\n323#1:577,3\n323#1:581,3\n325#1:603,8\n325#1:617,3\n325#1:621,3\n321#1:626,3\n208#1:463,6\n333#1:509,6\n209#1:469\n223#1:470,5\n223#1:503\n223#1:508\n323#1:546,6\n323#1:580\n323#1:585\n325#1:586,6\n325#1:620\n325#1:625\n223#1:475,11\n223#1:507\n321#1:515,14\n323#1:552,11\n323#1:584\n325#1:592,11\n325#1:624\n321#1:629\n223#1:494,6\n321#1:537,6\n323#1:571,6\n325#1:611,6\n289#1:630\n447#1:631\n452#1:632\n458#1:633\n460#1:634\n*E\n"})
/* loaded from: classes.dex */
public final class BottomNavigationKt {

    @l
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m6044constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    @l
    private static final WindowInsets ZeroInsets;

    static {
        float f5 = 12;
        BottomNavigationItemHorizontalPadding = Dp.m6044constructorimpl(f5);
        CombinedItemTextBaseline = Dp.m6044constructorimpl(f5);
        float f6 = 0;
        ZeroInsets = WindowInsetsKt.m626WindowInsetsa9UjIt4(Dp.m6044constructorimpl(f6), Dp.m6044constructorimpl(f6), Dp.m6044constructorimpl(f6), Dp.m6044constructorimpl(f6));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0085  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1220BottomNavigationPEIptTM(@p4.m androidx.compose.ui.Modifier r22, long r23, long r25, float r27, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1220BottomNavigationPEIptTM(androidx.compose.ui.Modifier, long, long, float, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigation-_UMDTes, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1221BottomNavigation_UMDTes(@p4.l androidx.compose.foundation.layout.WindowInsets r25, @p4.m androidx.compose.ui.Modifier r26, long r27, long r29, float r31, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1221BottomNavigation_UMDTes(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ae  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1222BottomNavigationItemjY6E1Zs(@p4.l androidx.compose.foundation.layout.RowScope r26, boolean r27, @p4.l v3.a<kotlin.r2> r28, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m androidx.compose.ui.Modifier r30, boolean r31, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, boolean r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, long r35, long r37, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1222BottomNavigationItemjY6E1Zs(androidx.compose.foundation.layout.RowScope, boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomNavigationItemBaselineLayout(p<? super Composer, ? super Integer, r2> pVar, final p<? super Composer, ? super Integer, r2> pVar2, @FloatRange(from = 0.0d, to = 1.0d) final float f5, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
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
                ComposerKt.traceEventStart(-1162995092, i6, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:319)");
            }
            startRestartGroup.startReplaceableGroup(-1545736730);
            boolean changedInstance = startRestartGroup.changedInstance(pVar2) | startRestartGroup.changed(f5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                        Placeable placeable;
                        MeasureResult m1228placeLabelAndIconDIyivk0;
                        MeasureResult m1227placeIcon3p2s80s;
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
                                    m1227placeIcon3p2s80s = BottomNavigationKt.m1227placeIcon3p2s80s(measureScope, mo4998measureBRTryo0, j5);
                                    return m1227placeIcon3p2s80s;
                                }
                                l0.m(placeable2);
                                m1228placeLabelAndIconDIyivk0 = BottomNavigationKt.m1228placeLabelAndIconDIyivk0(measureScope, placeable2, mo4998measureBRTryo0, j5, f5);
                                return m1228placeLabelAndIconDIyivk0;
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
            startRestartGroup.startReplaceableGroup(-1198309649);
            if (pVar2 != null) {
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, TTDownloadField.TT_LABEL), f5), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor3 = companion2.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationItemBaselineLayout$3(pVar, pVar2, f5, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1223BottomNavigationTransitionKlgxPg(long j5, long j6, boolean z4, q<? super Float, ? super Composer, ? super Integer, r2> qVar, Composer composer, int i5) {
        int i6;
        float f5;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
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
                ComposerKt.traceEventStart(-985175058, i6, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:287)");
            }
            if (z4) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            composer2 = startRestartGroup;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f5, BottomNavigationAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m3785lerpjxsXWHM = ColorKt.m3785lerpjxsXWHM(j6, j5, BottomNavigationTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(Color.m3733copywmQWz5c$default(m3785lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(m3785lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(qVar, animateFloatAsState)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationTransition$2(j5, j6, z4, qVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomNavigationTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1227placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j5) {
        int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(j5, measureScope.mo298roundToPx0680j_4(BottomNavigationHeight));
        return MeasureScope.layout$default(measureScope, placeable.getWidth(), m6013constrainHeightK40F9xA, null, new BottomNavigationKt$placeIcon$1(placeable, (m6013constrainHeightK40F9xA - placeable.getHeight()) / 2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1228placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        int u4;
        int L0;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(CombinedItemTextBaseline) - placeable.get(AlignmentLineKt.getFirstBaseline());
        int height = placeable2.getHeight() + placeable.getHeight() + mo298roundToPx0680j_4;
        int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(j5, Math.max(height, measureScope.mo298roundToPx0680j_4(BottomNavigationHeight)));
        u4 = u.u((m6013constrainHeightK40F9xA - height) / 2, 0);
        int height2 = (m6013constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        int height3 = placeable2.getHeight() + u4 + mo298roundToPx0680j_4;
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        int width = (max - placeable.getWidth()) / 2;
        int width2 = (max - placeable2.getWidth()) / 2;
        L0 = d.L0((height2 - u4) * (1 - f5));
        return MeasureScope.layout$default(measureScope, max, m6013constrainHeightK40F9xA, null, new BottomNavigationKt$placeLabelAndIcon$1(f5, placeable, width, height3, L0, placeable2, width2, u4), 4, null);
    }
}
