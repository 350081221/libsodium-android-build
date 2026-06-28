package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
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
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\u001az\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0081\u0001\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001as\u0010#\u001a\u00020\u00072\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0003¢\u0006\u0004\b#\u0010$\u001a8\u0010/\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aP\u00103\u001a\u00020,*\u00020%2\u0006\u00100\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\"\u0014\u00105\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106\"\u0014\u00108\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u0014\u00109\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00106\"\u001a\u0010;\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<\"\u0014\u0010A\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010C\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>\"\u001a\u0010E\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>\"\u001a\u0010G\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>\"\u0014\u0010I\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010<\"\u0014\u0010J\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010<\"\u0014\u0010K\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006N²\u0006\f\u0010L\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010M\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "header", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLv3/q;Landroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", NavigationRailKt.IconLayoutIdTag, "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationRailItem", "(ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", NavigationRailKt.IndicatorRippleLayoutIdTag, NavigationRailKt.IndicatorLayoutIdTag, "", "animationProgress", "NavigationRailItemLayout", "(Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLv3/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "", "IndicatorRippleLayoutIdTag", "Ljava/lang/String;", "IndicatorLayoutIdTag", "IconLayoutIdTag", "LabelLayoutIdTag", "Landroidx/compose/ui/unit/Dp;", "NavigationRailVerticalPadding", "F", "getNavigationRailVerticalPadding", "()F", "NavigationRailHeaderPadding", "", "ItemAnimationDurationMillis", "I", "NavigationRailItemWidth", "getNavigationRailItemWidth", "NavigationRailItemHeight", "getNavigationRailItemHeight", "NavigationRailItemVerticalPadding", "getNavigationRailItemVerticalPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPaddingWithLabel", "IndicatorVerticalPaddingNoLabel", "iconColor", "textColor", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,742:1\n1116#2,6:743\n1116#2,6:781\n1116#2,6:787\n1116#2,6:798\n1116#2,6:875\n72#3,2:749\n74#3:779\n78#3:797\n68#3,6:835\n74#3:869\n78#3:874\n68#3,6:881\n74#3:915\n78#3:920\n78#4,11:751\n91#4:796\n75#4,14:804\n78#4,11:841\n91#4:873\n78#4,11:887\n91#4:919\n91#4:924\n456#5,8:762\n464#5,3:776\n467#5,3:793\n456#5,8:818\n464#5,3:832\n456#5,8:852\n464#5,3:866\n467#5,3:870\n456#5,8:898\n464#5,3:912\n467#5,3:916\n467#5,3:921\n3737#6,6:770\n3737#6,6:826\n3737#6,6:860\n3737#6,6:906\n74#7:780\n154#8:925\n154#8:926\n154#8:927\n58#9:928\n75#9:929\n58#9:930\n75#9:931\n58#9:932\n75#9:933\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n174#1:743,6\n226#1:781,6\n268#1:787,6\n517#1:798,6\n514#1:875,6\n197#1:749,2\n197#1:779\n197#1:797\n508#1:835,6\n508#1:869\n508#1:874\n511#1:881,6\n511#1:915\n511#1:920\n197#1:751,11\n197#1:796\n504#1:804,14\n508#1:841,11\n508#1:873\n511#1:887,11\n511#1:919\n504#1:924\n197#1:762,8\n197#1:776,3\n197#1:793,3\n504#1:818,8\n504#1:832,3\n508#1:852,8\n508#1:866,3\n508#1:870,3\n511#1:898,8\n511#1:912,3\n511#1:916,3\n504#1:921,3\n197#1:770,6\n504#1:826,6\n508#1:860,6\n511#1:906,6\n221#1:780\n712#1:925\n718#1:926\n732#1:927\n735#1:928\n735#1:929\n738#1:930\n738#1:931\n741#1:932\n741#1:933\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailKt {

    @p4.l
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;

    @p4.l
    private static final String IndicatorLayoutIdTag = "indicator";

    @p4.l
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;

    @p4.l
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailHeaderPadding = Dp.m6044constructorimpl(8);
    private static final float NavigationRailItemHeight;
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailItemWidth;
    private static final float NavigationRailVerticalPadding;

    static {
        float f5 = 4;
        NavigationRailVerticalPadding = Dp.m6044constructorimpl(f5);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemWidth = navigationRailTokens.m2961getContainerWidthD9Ej5fM();
        NavigationRailItemHeight = navigationRailTokens.m2964getNoLabelActiveIndicatorHeightD9Ej5fM();
        NavigationRailItemVerticalPadding = Dp.m6044constructorimpl(f5);
        float f6 = 2;
        IndicatorHorizontalPadding = Dp.m6044constructorimpl(Dp.m6044constructorimpl(navigationRailTokens.m2959getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m2962getIconSizeD9Ej5fM()) / f6);
        IndicatorVerticalPaddingWithLabel = Dp.m6044constructorimpl(Dp.m6044constructorimpl(navigationRailTokens.m2958getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m2962getIconSizeD9Ej5fM()) / f6);
        IndicatorVerticalPaddingNoLabel = Dp.m6044constructorimpl(Dp.m6044constructorimpl(navigationRailTokens.m2964getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m2962getIconSizeD9Ej5fM()) / f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0094  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2047NavigationRailqi6gXK8(@p4.m androidx.compose.ui.Modifier r25, long r26, long r28, @p4.m v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m androidx.compose.foundation.layout.WindowInsets r31, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m2047NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, v3.q, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0252  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationRailItem(boolean r31, @p4.l v3.a<kotlin.r2> r32, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.ui.Modifier r34, boolean r35, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, boolean r37, @p4.m androidx.compose.material3.NavigationRailItemColors r38, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemLayout(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, final v3.p<? super Composer, ? super Integer, r2> pVar4, final boolean z4, final v3.a<Float> aVar, Composer composer, int i5) {
        int i6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1498399348);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
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
                ComposerKt.traceEventStart(1498399348, i6, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:502)");
            }
            startRestartGroup.startReplaceableGroup(-753441910);
            int i13 = 458752 & i6;
            if (i13 == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i6 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z6 | z5;
            int i14 = 57344 & i6;
            if (i14 == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z10 | z7;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        float f5;
                        int L0;
                        float f6;
                        Measurable measurable;
                        Placeable placeable;
                        Placeable placeable2;
                        MeasureResult m2051placeLabelAndIconzUg2_y0;
                        MeasureResult m2050placeIconX9ElhV4;
                        float floatValue = aVar.invoke().floatValue();
                        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            Measurable measurable2 = list.get(i15);
                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable mo4998measureBRTryo0 = measurable2.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                                int width = mo4998measureBRTryo0.getWidth();
                                f5 = NavigationRailKt.IndicatorHorizontalPadding;
                                float f7 = 2;
                                int mo298roundToPx0680j_4 = width + measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(f5 * f7));
                                L0 = kotlin.math.d.L0(mo298roundToPx0680j_4 * floatValue);
                                if (pVar4 == null) {
                                    f6 = NavigationRailKt.IndicatorVerticalPaddingNoLabel;
                                } else {
                                    f6 = NavigationRailKt.IndicatorVerticalPaddingWithLabel;
                                }
                                int height = mo4998measureBRTryo0.getHeight() + measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(f6 * f7));
                                int size2 = list.size();
                                for (int i16 = 0; i16 < size2; i16++) {
                                    Measurable measurable3 = list.get(i16);
                                    if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable mo4998measureBRTryo02 = measurable3.mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(mo298roundToPx0680j_4, height));
                                        int size3 = list.size();
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < size3) {
                                                measurable = list.get(i17);
                                                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                    break;
                                                }
                                                i17++;
                                            } else {
                                                measurable = null;
                                                break;
                                            }
                                        }
                                        Measurable measurable4 = measurable;
                                        if (measurable4 != null) {
                                            placeable = measurable4.mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(L0, height));
                                        } else {
                                            placeable = null;
                                        }
                                        if (pVar4 != null) {
                                            int size4 = list.size();
                                            for (int i18 = 0; i18 < size4; i18++) {
                                                Measurable measurable5 = list.get(i18);
                                                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable5), TTDownloadField.TT_LABEL)) {
                                                    placeable2 = measurable5.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeable2 = null;
                                        if (pVar4 == null) {
                                            m2050placeIconX9ElhV4 = NavigationRailKt.m2050placeIconX9ElhV4(measureScope, mo4998measureBRTryo0, mo4998measureBRTryo02, placeable, j5);
                                            return m2050placeIconX9ElhV4;
                                        }
                                        kotlin.jvm.internal.l0.m(placeable2);
                                        m2051placeLabelAndIconzUg2_y0 = NavigationRailKt.m2051placeLabelAndIconzUg2_y0(measureScope, placeable2, mo4998measureBRTryo0, mo4998measureBRTryo02, placeable, j5, z4, floatValue);
                                        return m2051placeLabelAndIconzUg2_y0;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
            pVar2.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            Modifier layoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar3.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-753442160);
            if (pVar4 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "label");
                startRestartGroup.startReplaceableGroup(484847171);
                if (i14 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i13 == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z12 = z8 | z9;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z12 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new NavigationRailKt$NavigationRailItemLayout$1$2$1(z4, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(layoutId2, (v3.l) rememberedValue2);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion2.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(graphicsLayer);
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
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                pVar4.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
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
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemLayout$3(pVar, pVar2, pVar3, pVar4, z4, aVar, i5));
        }
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2050placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j5) {
        int i5;
        int width = placeable.getWidth();
        int width2 = placeable2.getWidth();
        if (placeable3 != null) {
            i5 = placeable3.getWidth();
        } else {
            i5 = 0;
        }
        int m6014constrainWidthK40F9xA = ConstraintsKt.m6014constrainWidthK40F9xA(j5, Math.max(width, Math.max(width2, i5)));
        int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(j5, measureScope.mo298roundToPx0680j_4(NavigationRailItemHeight));
        return MeasureScope.layout$default(measureScope, m6014constrainWidthK40F9xA, m6013constrainHeightK40F9xA, null, new NavigationRailKt$placeIcon$1(placeable3, placeable, (m6014constrainWidthK40F9xA - placeable.getWidth()) / 2, (m6013constrainHeightK40F9xA - placeable.getHeight()) / 2, placeable2, (m6014constrainWidthK40F9xA - placeable2.getWidth()) / 2, (m6013constrainHeightK40F9xA - placeable2.getHeight()) / 2, m6014constrainWidthK40F9xA, m6013constrainHeightK40F9xA), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m2051placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j5, boolean z4, float f5) {
        float t5;
        float height;
        int i5;
        int L0;
        float height2 = placeable2.getHeight();
        float f6 = IndicatorVerticalPaddingWithLabel;
        float mo304toPx0680j_4 = height2 + measureScope.mo304toPx0680j_4(f6);
        float f7 = NavigationRailItemVerticalPadding;
        float mo304toPx0680j_42 = mo304toPx0680j_4 + measureScope.mo304toPx0680j_4(f7) + placeable.getHeight();
        float f8 = 2;
        t5 = kotlin.ranges.u.t((Constraints.m6001getMinHeightimpl(j5) - mo304toPx0680j_42) / f8, measureScope.mo304toPx0680j_4(f6));
        float f9 = mo304toPx0680j_42 + (t5 * f8);
        if (z4) {
            height = t5;
        } else {
            height = (f9 - placeable2.getHeight()) / f8;
        }
        float f10 = (height - t5) * (1 - f5);
        float height3 = placeable2.getHeight() + t5 + measureScope.mo304toPx0680j_4(f6) + measureScope.mo304toPx0680j_4(f7);
        int width = placeable2.getWidth();
        int width2 = placeable.getWidth();
        if (placeable4 != null) {
            i5 = placeable4.getWidth();
        } else {
            i5 = 0;
        }
        int m6014constrainWidthK40F9xA = ConstraintsKt.m6014constrainWidthK40F9xA(j5, Math.max(width, Math.max(width2, i5)));
        int width3 = (m6014constrainWidthK40F9xA - placeable.getWidth()) / 2;
        int width4 = (m6014constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        int width5 = (m6014constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        float mo304toPx0680j_43 = t5 - measureScope.mo304toPx0680j_4(f6);
        L0 = kotlin.math.d.L0(f9);
        return MeasureScope.layout$default(measureScope, m6014constrainWidthK40F9xA, L0, null, new NavigationRailKt$placeLabelAndIcon$1(placeable4, z4, f5, placeable, width3, height3, f10, placeable2, width4, t5, placeable3, width5, mo304toPx0680j_43, m6014constrainWidthK40F9xA, measureScope), 4, null);
    }
}
