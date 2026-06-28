package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000j\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0088\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001ax\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\b¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010(\u001a\u00020\u0003*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002\u001aD\u00100\u001a\u00020\u0003*\u00020#2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0002\"\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103\"\u0014\u00105\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106\"\u0014\u00108\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u001a\u00109\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010;\"\u0014\u0010<\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00103\"\u0014\u0010=\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00103\"\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C²\u0006\f\u0010B\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Tab-wqdebIU", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-wqdebIU", "(ZLv3/a;Lv3/p;Lv3/p;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/u;", "content", "Tab-bogVsAg", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLv3/p;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "TabBaselineLayout", "(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "textOrIconPlaceable", "", "tabHeight", "placeTextOrIcon", "Landroidx/compose/ui/unit/Density;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "placeTextAndIcon", "Landroidx/compose/ui/unit/Dp;", "SmallTabHeight", "F", "LargeTabHeight", "TabFadeInAnimationDuration", "I", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "HorizontalTextPadding", "getHorizontalTextPadding", "()F", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/TextUnit;", "IconDistanceFromBaseline", "J", "TextDistanceFromLeadingIcon", TypedValues.Custom.S_COLOR, "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,452:1\n74#2:453\n74#2:460\n74#2:467\n1116#3,6:454\n1116#3,6:461\n1116#3,6:468\n1116#3,3:480\n1119#3,3:484\n1116#3,6:493\n66#4,5:474\n71#4:483\n74#4:487\n36#5:479\n456#5,8:513\n464#5,3:527\n456#5,8:547\n464#5,3:561\n467#5,3:565\n456#5,8:587\n464#5,3:601\n467#5,3:605\n467#5,3:610\n1083#6,5:488\n75#7,14:499\n78#7,11:536\n91#7:568\n78#7,11:576\n91#7:608\n91#7:613\n3737#8,6:521\n3737#8,6:555\n3737#8,6:595\n68#9,6:530\n74#9:564\n78#9:569\n68#9,6:570\n74#9:604\n78#9:609\n81#10:614\n154#11:615\n154#11:616\n154#11:617\n154#11:618\n154#11:619\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n99#1:453\n161#1:460\n235#1:467\n101#1:454,6\n163#1:461,6\n237#1:468,6\n281#1:480,3\n281#1:484,3\n328#1:493,6\n281#1:474,5\n281#1:483\n281#1:487\n281#1:479\n315#1:513,8\n315#1:527,3\n318#1:547,8\n318#1:561,3\n318#1:565,3\n325#1:587,8\n325#1:601,3\n325#1:605,3\n315#1:610,3\n281#1:488,5\n315#1:499,14\n318#1:536,11\n318#1:568\n325#1:576,11\n325#1:608\n315#1:613\n315#1:521,6\n318#1:555,6\n325#1:595,6\n318#1:530,6\n318#1:564\n318#1:569\n325#1:570,6\n325#1:604\n325#1:609\n281#1:614\n432#1:615\n440#1:616\n444#1:617\n447#1:618\n451#1:619\n*E\n"})
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m3092getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = Dp.m6044constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m6044constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m6044constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m6044constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m6044constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2340LeadingIconTabwqdebIU(boolean r24, @p4.l v3.a<kotlin.r2> r25, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m androidx.compose.ui.Modifier r28, boolean r29, long r30, long r32, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m2340LeadingIconTabwqdebIU(boolean, v3.a, v3.p, v3.p, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2341TabbogVsAg(boolean r27, @p4.l v3.a<kotlin.r2> r28, @p4.m androidx.compose.ui.Modifier r29, boolean r30, long r31, long r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r35, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m2341TabbogVsAg(boolean, v3.a, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fa  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2342TabwqdebIU(boolean r29, @p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, long r35, long r37, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r39, @p4.m androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m2342TabwqdebIU(boolean, v3.a, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final v3.p<? super Composer, ? super Integer, r2> pVar, final v3.p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        boolean z4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(514131524);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i6, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:313)");
            }
            startRestartGroup.startReplaceableGroup(150513508);
            int i9 = i6 & 14;
            boolean z5 = true;
            if (i9 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i6 & 112) != 32) {
                z5 = false;
            }
            boolean z6 = z4 | z5;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.TabKt$TabBaselineLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ Integer $firstBaseline;
                        final /* synthetic */ Placeable $iconPlaceable;
                        final /* synthetic */ Integer $lastBaseline;
                        final /* synthetic */ int $tabHeight;
                        final /* synthetic */ int $tabWidth;
                        final /* synthetic */ Placeable $textPlaceable;
                        final /* synthetic */ MeasureScope $this_Layout;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i5, int i6, Integer num, Integer num2) {
                            super(1);
                            this.$textPlaceable = placeable;
                            this.$iconPlaceable = placeable2;
                            this.$this_Layout = measureScope;
                            this.$tabWidth = i5;
                            this.$tabHeight = i6;
                            this.$firstBaseline = num;
                            this.$lastBaseline = num2;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable placeable;
                            Placeable placeable2 = this.$textPlaceable;
                            if (placeable2 == null || (placeable = this.$iconPlaceable) == null) {
                                if (placeable2 != null) {
                                    TabKt.placeTextOrIcon(placementScope, placeable2, this.$tabHeight);
                                    return;
                                }
                                Placeable placeable3 = this.$iconPlaceable;
                                if (placeable3 != null) {
                                    TabKt.placeTextOrIcon(placementScope, placeable3, this.$tabHeight);
                                    return;
                                }
                                return;
                            }
                            MeasureScope measureScope = this.$this_Layout;
                            int i5 = this.$tabWidth;
                            int i6 = this.$tabHeight;
                            Integer num = this.$firstBaseline;
                            kotlin.jvm.internal.l0.m(num);
                            int intValue = num.intValue();
                            Integer num2 = this.$lastBaseline;
                            kotlin.jvm.internal.l0.m(num2);
                            TabKt.placeTextAndIcon(placementScope, measureScope, placeable2, placeable, i5, i6, intValue, num2.intValue());
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        Placeable placeable;
                        Placeable placeable2;
                        int i10;
                        int i11;
                        float f5;
                        int i12;
                        long j6;
                        Integer num;
                        Integer num2;
                        int i13 = 0;
                        if (pVar != null) {
                            int size = list.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                Measurable measurable = list.get(i14);
                                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeable = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable = null;
                        if (pVar2 != null) {
                            int size2 = list.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                Measurable measurable2 = list.get(i15);
                                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                    placeable2 = measurable2.mo4998measureBRTryo0(j5);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        if (placeable != null) {
                            i10 = placeable.getWidth();
                        } else {
                            i10 = 0;
                        }
                        if (placeable2 != null) {
                            i11 = placeable2.getWidth();
                        } else {
                            i11 = 0;
                        }
                        int max = Math.max(i10, i11);
                        if (placeable != null && placeable2 != null) {
                            f5 = TabKt.LargeTabHeight;
                        } else {
                            f5 = TabKt.SmallTabHeight;
                        }
                        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(f5);
                        if (placeable2 != null) {
                            i12 = placeable2.getHeight();
                        } else {
                            i12 = 0;
                        }
                        if (placeable != null) {
                            i13 = placeable.getHeight();
                        }
                        j6 = TabKt.IconDistanceFromBaseline;
                        int max2 = Math.max(mo298roundToPx0680j_4, i12 + i13 + measureScope.mo297roundToPxR2X_6o(j6));
                        if (placeable != null) {
                            num = Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline()));
                        } else {
                            num = null;
                        }
                        if (placeable != null) {
                            num2 = Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline()));
                        } else {
                            num2 = null;
                        }
                        return MeasureScope.layout$default(measureScope, max, max2, null, new AnonymousClass1(placeable, placeable2, measureScope, max, max2, num, num2), 4, null);
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
            startRestartGroup.startReplaceableGroup(720851373);
            if (pVar != null) {
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion2.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
                pVar.invoke(startRestartGroup, Integer.valueOf(i9));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(150513400);
            if (pVar2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion2.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
            endRestartGroup.updateScope(new TabKt$TabBaselineLayout$3(pVar, pVar2, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m2343TabTransitionKlgxPg(long j5, long j6, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        long j7;
        long j8;
        long j9;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(735731848);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(j5)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(j6)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if ((i6 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735731848, i6, -1, "androidx.compose.material3.TabTransition (Tab.kt:278)");
            }
            int i11 = i6 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z4), (String) null, startRestartGroup, i11 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:296)");
            }
            if (booleanValue) {
                j7 = j5;
            } else {
                j7 = j6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m3738getColorSpaceimpl = Color.m3738getColorSpaceimpl(j7);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(m3738getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3738getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:296)");
            }
            if (booleanValue2) {
                j8 = j5;
            } else {
                j8 = j6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            Color m3724boximpl = Color.m3724boximpl(j8);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:296)");
            }
            if (booleanValue3) {
                j9 = j5;
            } else {
                j9 = j6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m3724boximpl, Color.m3724boximpl(j9), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation))), pVar, startRestartGroup, (i11 & 112) | 0 | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabKt$TabTransition$1(j5, j6, z4, pVar, i5));
        }
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i5, int i6, int i7, int i8) {
        float f5;
        if (i7 == i8) {
            f5 = SingleLineTextBaselineWithIcon;
        } else {
            f5 = DoubleLineTextBaselineWithIcon;
        }
        int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(f5) + density.mo298roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m3090getActiveIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo297roundToPxR2X_6o(IconDistanceFromBaseline)) - i7;
        int i9 = (i6 - i8) - mo298roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i5 - placeable.getWidth()) / 2, i9, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i5 - placeable2.getWidth()) / 2, i9 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i5) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i5 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}
