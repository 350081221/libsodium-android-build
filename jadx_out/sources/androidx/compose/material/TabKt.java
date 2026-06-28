package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000h\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0088\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001ax\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\b¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010(\u001a\u00020\u0003*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002\u001aD\u00100\u001a\u00020\u0003*\u00020#2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0002\"\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103\"\u0014\u00105\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106\"\u0014\u00108\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u0014\u00109\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103\"\u0014\u0010:\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00103\"\u0014\u0010;\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00103\"\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010?\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\f\u0010@\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Tab-0nD-MI0", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-0nD-MI0", "(ZLv3/a;Lv3/p;Lv3/p;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/u;", "content", "Tab-EVJuX4I", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLv3/q;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLv3/p;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "TabBaselineLayout", "(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "textOrIconPlaceable", "", "tabHeight", "placeTextOrIcon", "Landroidx/compose/ui/unit/Density;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "placeTextAndIcon", "Landroidx/compose/ui/unit/Dp;", "SmallTabHeight", "F", "LargeTabHeight", "TabFadeInAnimationDuration", "I", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/TextUnit;", "IconDistanceFromBaseline", "J", "TextDistanceFromLeadingIcon", TypedValues.Custom.S_COLOR, "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,435:1\n25#2:436\n25#2:444\n25#2:452\n36#2:465\n456#2,8:499\n464#2,3:513\n456#2,8:533\n464#2,3:547\n467#2,3:551\n456#2,8:573\n464#2,3:587\n467#2,3:591\n467#2,3:596\n1116#3,6:437\n1116#3,6:445\n1116#3,6:453\n1116#3,3:466\n1119#3,3:470\n1116#3,6:479\n74#4:443\n74#4:451\n74#4:459\n66#5,5:460\n71#5:469\n74#5:473\n1083#6,5:474\n76#7,14:485\n79#7,11:522\n92#7:554\n79#7,11:562\n92#7:594\n92#7:599\n3737#8,6:507\n3737#8,6:541\n3737#8,6:581\n68#9,6:516\n74#9:550\n78#9:555\n68#9,6:556\n74#9:590\n78#9:595\n81#10:600\n154#11:601\n154#11:602\n154#11:603\n154#11:604\n154#11:605\n154#11:606\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n98#1:436\n160#1:444\n229#1:452\n271#1:465\n306#1:499,8\n306#1:513,3\n309#1:533,8\n309#1:547,3\n309#1:551,3\n314#1:573,8\n314#1:587,3\n314#1:591,3\n306#1:596,3\n98#1:437,6\n160#1:445,6\n229#1:453,6\n271#1:466,3\n271#1:470,3\n317#1:479,6\n99#1:443\n161#1:451\n230#1:459\n271#1:460,5\n271#1:469\n271#1:473\n271#1:474,5\n306#1:485,14\n309#1:522,11\n309#1:554\n314#1:562,11\n314#1:594\n306#1:599\n306#1:507,6\n309#1:541,6\n314#1:581,6\n309#1:516,6\n309#1:550\n309#1:555\n314#1:556,6\n314#1:590\n314#1:595\n271#1:600\n414#1:601\n415#1:602\n423#1:603\n427#1:604\n430#1:605\n434#1:606\n*E\n"})
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m6044constructorimpl(48);
    private static final float LargeTabHeight = Dp.m6044constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m6044constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m6044constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m6044constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m6044constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1470LeadingIconTab0nDMI0(boolean r28, @p4.l v3.a<kotlin.r2> r29, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.ui.Modifier r32, boolean r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, long r35, long r37, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1470LeadingIconTab0nDMI0(boolean, v3.a, v3.p, v3.p, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1471Tab0nDMI0(boolean r30, @p4.l v3.a<kotlin.r2> r31, @p4.m androidx.compose.ui.Modifier r32, boolean r33, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r34, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r36, long r37, long r39, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1471Tab0nDMI0(boolean, v3.a, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1472TabEVJuX4I(boolean r29, @p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1472TabEVJuX4I(boolean, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final p<? super Composer, ? super Integer, r2> pVar, final p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249848471, i6, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:304)");
            }
            startRestartGroup.startReplaceableGroup(782580000);
            boolean changedInstance = startRestartGroup.changedInstance(pVar) | startRestartGroup.changedInstance(pVar2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1

                    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material.TabKt$TabBaselineLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
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
                            l0.m(num);
                            int intValue = num.intValue();
                            Integer num2 = this.$lastBaseline;
                            l0.m(num2);
                            TabKt.placeTextAndIcon(placementScope, measureScope, placeable2, placeable, i5, i6, intValue, num2.intValue());
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        Placeable placeable;
                        Placeable placeable2;
                        int i9;
                        float f5;
                        Integer num;
                        int i10 = 0;
                        Integer num2 = null;
                        if (pVar != null) {
                            int size = list.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                Measurable measurable = list.get(i11);
                                if (l0.g(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeable = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable = null;
                        if (pVar2 != null) {
                            int size2 = list.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                Measurable measurable2 = list.get(i12);
                                if (l0.g(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                    placeable2 = measurable2.mo4998measureBRTryo0(j5);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        if (placeable != null) {
                            i9 = placeable.getWidth();
                        } else {
                            i9 = 0;
                        }
                        if (placeable2 != null) {
                            i10 = placeable2.getWidth();
                        }
                        int max = Math.max(i9, i10);
                        if (placeable != null && placeable2 != null) {
                            f5 = TabKt.LargeTabHeight;
                        } else {
                            f5 = TabKt.SmallTabHeight;
                        }
                        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(f5);
                        if (placeable != null) {
                            num = Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline()));
                        } else {
                            num = null;
                        }
                        if (placeable != null) {
                            num2 = Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline()));
                        }
                        return MeasureScope.layout$default(measureScope, max, mo298roundToPx0680j_4, null, new AnonymousClass1(placeable, placeable2, measureScope, max, mo298roundToPx0680j_4, num, num2), 4, null);
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
            startRestartGroup.startReplaceableGroup(-2141028410);
            if (pVar != null) {
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor2 = companion2.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(448373087);
            if (pVar2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor3 = companion2.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
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
    public static final void m1473TabTransitionKlgxPg(long j5, long j6, boolean z4, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        long j7;
        long j8;
        long j9;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
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
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        if ((i6 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405571117, i6, -1, "androidx.compose.material.TabTransition (Tab.kt:268)");
            }
            int i11 = i6 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z4), (String) null, startRestartGroup, i11 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
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
            startRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
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
            startRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
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
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(Color.m3733copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation))))}, pVar, startRestartGroup, (i11 & 112) | 8);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i5, int i6, int i7, int i8) {
        float f5;
        if (i7 == i8) {
            f5 = SingleLineTextBaselineWithIcon;
        } else {
            f5 = DoubleLineTextBaselineWithIcon;
        }
        int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(f5) + density.mo298roundToPx0680j_4(TabRowDefaults.INSTANCE.m1481getIndicatorHeightD9Ej5fM());
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
