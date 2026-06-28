package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
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

@kotlin.i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\u001ab\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001as\u0010$\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0014H\u0003¢\u0006\u0004\b$\u0010%\u001a8\u00100\u001a\u00020-*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001aP\u00104\u001a\u00020-*\u00020&2\u0006\u00101\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107\"\u0014\u0010:\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00107\"\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010>\u001a\u00020=8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?\"\u001a\u0010@\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010B\"\u001a\u0010C\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010B\"\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010<\"\u001a\u0010F\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010B\"\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L²\u0006\f\u0010I\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010K\u001a\u00020=8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "NavigationBar", "", "selected", "Lkotlin/Function0;", "onClick", NavigationBarKt.IconLayoutIdTag, "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationBarItem", "(Landroidx/compose/foundation/layout/RowScope;ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", NavigationBarKt.IndicatorRippleLayoutIdTag, NavigationBarKt.IndicatorLayoutIdTag, "", "animationProgress", "NavigationBarItemLayout", "(Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLv3/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "", "IndicatorRippleLayoutIdTag", "Ljava/lang/String;", "IndicatorLayoutIdTag", "IconLayoutIdTag", "LabelLayoutIdTag", "NavigationBarHeight", "F", "", "ItemAnimationDurationMillis", "I", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "IndicatorVerticalOffset", "iconColor", "textColor", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,713:1\n1116#2,6:714\n1116#2,6:720\n1116#2,6:726\n1116#2,6:764\n1116#2,6:770\n1116#2,6:781\n1116#2,6:858\n72#3,2:732\n74#3:762\n78#3:780\n68#3,6:818\n74#3:852\n78#3:857\n68#3,6:865\n74#3:899\n78#3:904\n78#4,11:734\n91#4:779\n75#4,14:787\n78#4,11:824\n91#4:856\n78#4,11:871\n91#4:903\n91#4:908\n456#5,8:745\n464#5,3:759\n467#5,3:776\n456#5,8:801\n464#5,3:815\n456#5,8:835\n464#5,3:849\n467#5,3:853\n456#5,8:882\n464#5,3:896\n467#5,3:900\n467#5,3:905\n3737#6,6:753\n3737#6,6:809\n3737#6,6:843\n3737#6,6:890\n74#7:763\n75#8:864\n58#8:914\n75#8:915\n58#8:916\n75#8:917\n75#9:909\n108#9,2:910\n154#10:912\n154#10:913\n154#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n173#1:714,6\n196#1:720,6\n210#1:726,6\n232#1:764,6\n268#1:770,6\n521#1:781,6\n517#1:858,6\n198#1:732,2\n198#1:762\n198#1:780\n511#1:818,6\n511#1:852\n511#1:857\n514#1:865,6\n514#1:899\n514#1:904\n198#1:734,11\n198#1:779\n507#1:787,14\n511#1:824,11\n511#1:856\n514#1:871,11\n514#1:903\n507#1:908\n198#1:745,8\n198#1:759,3\n198#1:776,3\n507#1:801,8\n507#1:815,3\n511#1:835,8\n511#1:849,3\n511#1:853,3\n514#1:882,8\n514#1:896,3\n514#1:900,3\n507#1:905,3\n198#1:753,6\n507#1:809,6\n511#1:843,6\n514#1:890,6\n225#1:763\n518#1:864\n706#1:914\n706#1:915\n710#1:916\n710#1:917\n196#1:909\n196#1:910,2\n700#1:912\n703#1:913\n712#1:918\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationBarKt {

    @p4.l
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;

    @p4.l
    private static final String IndicatorLayoutIdTag = "indicator";

    @p4.l
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;

    @p4.l
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight;
    private static final float NavigationBarIndicatorToLabelPadding;
    private static final float NavigationBarItemHorizontalPadding;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m2950getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = Dp.m6044constructorimpl(8);
        NavigationBarIndicatorToLabelPadding = Dp.m6044constructorimpl(4);
        float f5 = 2;
        IndicatorHorizontalPadding = Dp.m6044constructorimpl(Dp.m6044constructorimpl(navigationBarTokens.m2948getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m2951getIconSizeD9Ej5fM()) / f5);
        IndicatorVerticalPadding = Dp.m6044constructorimpl(Dp.m6044constructorimpl(navigationBarTokens.m2947getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m2951getIconSizeD9Ej5fM()) / f5);
        IndicatorVerticalOffset = Dp.m6044constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0094  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2018NavigationBarHsRjFd4(@p4.m androidx.compose.ui.Modifier r25, long r26, long r28, float r30, @p4.m androidx.compose.foundation.layout.WindowInsets r31, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m2018NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x041b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationBarItem(@p4.l androidx.compose.foundation.layout.RowScope r31, boolean r32, @p4.l v3.a<kotlin.r2> r33, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m androidx.compose.ui.Modifier r35, boolean r36, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, boolean r38, @p4.m androidx.compose.material3.NavigationBarItemColors r39, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItemLayout(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, final v3.p<? super Composer, ? super Integer, r2> pVar4, final boolean z4, final v3.a<Float> aVar, Composer composer, int i5) {
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
        Composer startRestartGroup = composer.startRestartGroup(-1427075886);
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
                ComposerKt.traceEventStart(-1427075886, i6, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:505)");
            }
            startRestartGroup.startReplaceableGroup(-1250032035);
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
            boolean z10 = z5 | z6;
            int i14 = 57344 & i6;
            if (i14 == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z10 | z7;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        float f5;
                        int L0;
                        Measurable measurable;
                        Placeable placeable;
                        Placeable placeable2;
                        MeasureResult m2022placeLabelAndIconzUg2_y0;
                        MeasureResult m2021placeIconX9ElhV4;
                        float floatValue = aVar.invoke().floatValue();
                        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            Measurable measurable2 = list.get(i15);
                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable mo4998measureBRTryo0 = measurable2.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                                int width = mo4998measureBRTryo0.getWidth();
                                f5 = NavigationBarKt.IndicatorHorizontalPadding;
                                float f6 = 2;
                                int mo298roundToPx0680j_4 = width + measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(f5 * f6));
                                L0 = kotlin.math.d.L0(mo298roundToPx0680j_4 * floatValue);
                                int height = mo4998measureBRTryo0.getHeight() + measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f6));
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
                                            m2021placeIconX9ElhV4 = NavigationBarKt.m2021placeIconX9ElhV4(measureScope, mo4998measureBRTryo0, mo4998measureBRTryo02, placeable, j5);
                                            return m2021placeIconX9ElhV4;
                                        }
                                        kotlin.jvm.internal.l0.m(placeable2);
                                        m2022placeLabelAndIconzUg2_y0 = NavigationBarKt.m2022placeLabelAndIconzUg2_y0(measureScope, placeable2, mo4998measureBRTryo0, mo4998measureBRTryo02, placeable, j5, z4, floatValue);
                                        return m2022placeLabelAndIconzUg2_y0;
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
            startRestartGroup.startReplaceableGroup(-1250032367);
            if (pVar4 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "label");
                startRestartGroup.startReplaceableGroup(1836184900);
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
                    rememberedValue2 = new NavigationBarKt$NavigationBarItemLayout$1$2$1(z4, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(layoutId2, (v3.l) rememberedValue2), Dp.m6044constructorimpl(NavigationBarItemHorizontalPadding / 2), 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion2.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
            endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItemLayout$3(pVar, pVar2, pVar3, pVar4, z4, aVar, i5));
        }
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2021placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j5) {
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(j5, measureScope.mo298roundToPx0680j_4(NavigationBarHeight));
        return MeasureScope.layout$default(measureScope, m6000getMaxWidthimpl, m6013constrainHeightK40F9xA, null, new NavigationBarKt$placeIcon$1(placeable3, placeable, (m6000getMaxWidthimpl - placeable.getWidth()) / 2, (m6013constrainHeightK40F9xA - placeable.getHeight()) / 2, placeable2, (m6000getMaxWidthimpl - placeable2.getWidth()) / 2, (m6013constrainHeightK40F9xA - placeable2.getHeight()) / 2, m6000getMaxWidthimpl, m6013constrainHeightK40F9xA), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m2022placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j5, boolean z4, float f5) {
        float t5;
        float height;
        int L0;
        float height2 = placeable2.getHeight();
        float f6 = IndicatorVerticalPadding;
        float mo304toPx0680j_4 = height2 + measureScope.mo304toPx0680j_4(f6);
        float f7 = NavigationBarIndicatorToLabelPadding;
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
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int width = (m6000getMaxWidthimpl - placeable.getWidth()) / 2;
        int width2 = (m6000getMaxWidthimpl - placeable2.getWidth()) / 2;
        int width3 = (m6000getMaxWidthimpl - placeable3.getWidth()) / 2;
        float mo304toPx0680j_43 = t5 - measureScope.mo304toPx0680j_4(f6);
        L0 = kotlin.math.d.L0(f9);
        return MeasureScope.layout$default(measureScope, m6000getMaxWidthimpl, L0, null, new NavigationBarKt$placeLabelAndIcon$1(placeable4, z4, f5, placeable, width, height3, f10, placeable2, width2, t5, placeable3, width3, mo304toPx0680j_43, m6000getMaxWidthimpl, measureScope), 4, null);
    }
}
