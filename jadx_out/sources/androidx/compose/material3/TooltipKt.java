package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001an\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0085\u0001\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010$\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%\u001a&\u0010&\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\"H\u0007\u001a\u001c\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0003\u001a\u001a\u0010,\u001a\u00020\n*\u00020\n2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*H\u0000\"\u001a\u0010-\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u001a\u00101\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100\"\u001a\u00103\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u001a\u00105\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100\"\u0014\u00107\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.\"\u0014\u00108\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.\"\u001a\u0010:\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010.\"\u001a\u0010?\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100\"\u0014\u0010A\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010.\"\u0014\u0010B\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010.\"\u0014\u0010C\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010.\"\u0014\u0010D\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010.\"\u0014\u0010E\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010.\"\u0014\u0010G\u001a\u00020F8\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020F8\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010H\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O²\u0006\u0010\u0010K\u001a\u0004\u0018\u00010J8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010M\u001a\u00020L8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020L8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function1;", "Landroidx/compose/material3/CaretScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "Lkotlin/Function0;", "content", "TooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lv3/q;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLv3/p;Landroidx/compose/runtime/Composer;II)V", com.alipay.sdk.m.x.d.f3030v, "action", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/RichTooltipColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "text", "RichTooltip-1tP8Re8", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLv3/p;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "rememberTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "TooltipState", "subheadExists", "actionExists", "textVerticalPadding", "Landroidx/compose/animation/core/Transition;", "transition", "animateTooltip", "SpacingBetweenTooltipAndAnchor", "F", "getSpacingBetweenTooltipAndAnchor", "()F", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipMaxWidth", "getPlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "PlainTooltipHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getPlainTooltipContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "RichTooltipMaxWidth", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "HeightToSubheadFirstLine", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "ActionLabelMinHeight", "ActionLabelBottomPadding", "", "TooltipFadeInDuration", "I", "TooltipFadeOutDuration", "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorBounds", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,719:1\n1116#2,6:720\n1116#2,6:726\n1116#2,6:732\n135#3:738\n81#4:739\n107#4,2:740\n154#5:742\n154#5:743\n154#5:744\n154#5:745\n154#5:746\n154#5:747\n154#5:748\n154#5:749\n154#5:750\n154#5:751\n154#5:752\n154#5:753\n154#5:754\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n122#1:720,6\n123#1:726,6\n514#1:732,6\n651#1:738\n122#1:739\n122#1:740,2\n701#1:742\n702#1:743\n703#1:744\n704#1:745\n705#1:746\n706#1:747\n709#1:748\n710#1:749\n711#1:750\n712#1:751\n713#1:752\n714#1:753\n715#1:754\n*E\n"})
/* loaded from: classes.dex */
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;

    @p4.l
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float RichTooltipMaxWidth;
    private static final float SpacingBetweenTooltipAndAnchor;
    private static final float TextBottomPadding;
    public static final int TooltipFadeInDuration = 150;
    public static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = Dp.m6044constructorimpl(40);
    private static final float PlainTooltipMaxWidth = Dp.m6044constructorimpl(200);

    static {
        float f5 = 4;
        SpacingBetweenTooltipAndAnchor = Dp.m6044constructorimpl(f5);
        float f6 = 24;
        TooltipMinHeight = Dp.m6044constructorimpl(f6);
        float m6044constructorimpl = Dp.m6044constructorimpl(f5);
        PlainTooltipVerticalPadding = m6044constructorimpl;
        float f7 = 8;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(f7);
        PlainTooltipHorizontalPadding = m6044constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m547PaddingValuesYgX7TsA(m6044constructorimpl2, m6044constructorimpl);
        RichTooltipMaxWidth = Dp.m6044constructorimpl(320);
        float f8 = 16;
        RichTooltipHorizontalPadding = Dp.m6044constructorimpl(f8);
        HeightToSubheadFirstLine = Dp.m6044constructorimpl(28);
        HeightFromSubheadToTextFirstLine = Dp.m6044constructorimpl(f6);
        TextBottomPadding = Dp.m6044constructorimpl(f8);
        ActionLabelMinHeight = Dp.m6044constructorimpl(36);
        ActionLabelBottomPadding = Dp.m6044constructorimpl(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: RichTooltip-1tP8Re8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2595RichTooltip1tP8Re8(@p4.m androidx.compose.ui.Modifier r24, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r25, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.m androidx.compose.ui.graphics.Shape r27, @p4.m androidx.compose.material3.RichTooltipColors r28, float r29, float r30, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m2595RichTooltip1tP8Re8(androidx.compose.ui.Modifier, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.RichTooltipColors, float, float, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0067  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TooltipBox(@p4.l androidx.compose.ui.window.PopupPositionProvider r21, @p4.l v3.q<? super androidx.compose.material3.CaretScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r22, @p4.l androidx.compose.material3.TooltipState r23, @p4.m androidx.compose.ui.Modifier r24, boolean r25, boolean r26, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.TooltipBox(androidx.compose.ui.window.PopupPositionProvider, v3.q, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, boolean, boolean, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates TooltipBox$lambda$1(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    @p4.l
    @ExperimentalMaterial3Api
    public static final TooltipState TooltipState(boolean z4, boolean z5, @p4.l MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(z4, z5, mutatorMutex);
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean z4, boolean z5, MutatorMutex mutatorMutex, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        if ((i5 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipState(z4, z5, mutatorMutex);
    }

    @p4.l
    public static final Modifier animateTooltip(@p4.l Modifier modifier, @p4.l Transition<Boolean> transition) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TooltipKt$animateTooltip$2(transition));
    }

    @p4.l
    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getPlainTooltipMaxWidth() {
        return PlainTooltipMaxWidth;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final TooltipState rememberTooltipState(boolean z4, boolean z5, @p4.m MutatorMutex mutatorMutex, @p4.m Composer composer, int i5, int i6) {
        boolean z6;
        composer.startReplaceableGroup(-1413230530);
        boolean z7 = false;
        if ((i6 & 1) != 0) {
            z4 = false;
        }
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        if ((i6 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, i5, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:513)");
        }
        composer.startReplaceableGroup(512858205);
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(z5)) || (i5 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i5 & 384) == 256) {
            z7 = true;
        }
        boolean z8 = z6 | z7;
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TooltipStateImpl(z4, z5, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tooltipStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Stable
    public static final Modifier textVerticalPadding(Modifier modifier, boolean z4, boolean z5) {
        if (!z4 && !z5) {
            return PaddingKt.m555paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
        }
        return PaddingKt.m557paddingqDBjuR0$default(AlignmentLineKt.m437paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null);
    }
}
