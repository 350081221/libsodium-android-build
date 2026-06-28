package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u001e\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u001a\u0010#\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 \"\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 \"\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 \"\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 \"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-²\u0006\f\u0010,\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/r2;", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "thumbContent", "enabled", "Landroidx/compose/material3/SwitchColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Switch", "(ZLv3/l;Landroidx/compose/ui/Modifier;Lv3/p;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/State;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/ui/graphics/Shape;", "thumbShape", "Landroidx/compose/ui/unit/Dp;", "uncheckedThumbDiameter", "minBound", "maxBound", "SwitchImpl-0DmnUew", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lv3/p;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "SwitchImpl", "ThumbDiameter", "F", "getThumbDiameter", "()F", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "SwitchWidth", "SwitchHeight", "ThumbPadding", "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "isPressed", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,573:1\n1116#2,6:574\n1116#2,6:585\n1116#2,6:591\n1116#2,3:602\n1119#2,3:608\n1116#2,6:612\n1116#2,6:618\n1116#2,6:707\n58#3:580\n75#3:581\n58#3:665\n58#3:666\n81#3:667\n88#3:668\n51#3:669\n58#3:671\n75#3:713\n58#3:759\n75#3:760\n58#3:761\n74#4:582\n74#4:584\n74#4:664\n74#4:670\n1#5:583\n487#6,4:597\n491#6,2:605\n495#6:611\n25#7:601\n456#7,8:641\n464#7,3:655\n467#7,3:659\n456#7,8:689\n464#7,3:703\n456#7,8:730\n464#7,3:744\n467#7,3:748\n467#7,3:753\n487#8:607\n68#9,6:624\n74#9:658\n78#9:663\n68#9,6:672\n74#9:706\n69#9,5:714\n74#9:747\n78#9:752\n78#9:757\n78#10,11:630\n91#10:662\n78#10,11:678\n78#10,11:719\n91#10:751\n91#10:756\n3737#11,6:649\n3737#11,6:697\n3737#11,6:738\n81#12:758\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n98#1:574,6\n109#1:585,6\n114#1:591,6\n115#1:602,3\n115#1:608,3\n117#1:612,6\n122#1:618,6\n229#1:707,6\n106#1:580\n106#1:581\n195#1:665\n196#1:666\n196#1:667\n195#1:668\n195#1:669\n202#1:671\n234#1:713\n256#1:759\n256#1:760\n257#1:761\n107#1:582\n108#1:584\n191#1:664\n200#1:670\n115#1:597,4\n115#1:605,2\n115#1:611\n115#1:601\n146#1:641,8\n146#1:655,3\n146#1:659,3\n223#1:689,8\n223#1:703,3\n226#1:730,8\n226#1:744,3\n226#1:748,3\n223#1:753,3\n115#1:607\n146#1:624,6\n146#1:658\n146#1:663\n223#1:672,6\n223#1:706\n226#1:714,5\n226#1:747\n226#1:752\n223#1:757\n146#1:630,11\n146#1:662\n223#1:678,11\n226#1:719,11\n226#1:751\n223#1:756\n146#1:649,6\n223#1:697,6\n226#1:738,6\n189#1:758\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchKt {

    @p4.l
    private static final TweenSpec<Float> AnimationSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float m3143getSelectedHandleWidthD9Ej5fM = switchTokens.m3143getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = m3143getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m3150getUnselectedHandleWidthD9Ej5fM();
        float m3148getTrackWidthD9Ej5fM = switchTokens.m3148getTrackWidthD9Ej5fM();
        SwitchWidth = m3148getTrackWidthD9Ej5fM;
        float m3146getTrackHeightD9Ej5fM = switchTokens.m3146getTrackHeightD9Ej5fM();
        SwitchHeight = m3146getTrackHeightD9Ej5fM;
        float m6044constructorimpl = Dp.m6044constructorimpl(Dp.m6044constructorimpl(m3146getTrackHeightD9Ej5fM - m3143getSelectedHandleWidthD9Ej5fM) / 2);
        ThumbPadding = m6044constructorimpl;
        ThumbPathLength = Dp.m6044constructorimpl(Dp.m6044constructorimpl(m3148getTrackWidthD9Ej5fM - m3143getSelectedHandleWidthD9Ej5fM) - m6044constructorimpl);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(boolean r27, @p4.m v3.l<? super java.lang.Boolean, kotlin.r2> r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, boolean r31, @p4.m androidx.compose.material3.SwitchColors r32, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r33, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, v3.l, androidx.compose.ui.Modifier, v3.p, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SwitchImpl-0DmnUew, reason: not valid java name */
    public static final void m2337SwitchImpl0DmnUew(BoxScope boxScope, boolean z4, boolean z5, SwitchColors switchColors, State<Float> state, v3.p<? super Composer, ? super Integer, r2> pVar, InteractionSource interactionSource, Shape shape, float f5, float f6, float f7, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        float m6044constructorimpl;
        float floatValue;
        float m3147getTrackOutlineWidthD9Ej5fM;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-1968109941);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i7 = i19 | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(z4)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i7 |= i18;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z5)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i7 |= i17;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(switchColors)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i7 |= i16;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(state)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i7 |= i15;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i7 |= i14;
        }
        if ((i5 & 1572864) == 0) {
            if (startRestartGroup.changed(interactionSource)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i7 |= i13;
        }
        if ((i5 & 12582912) == 0) {
            if (startRestartGroup.changed(shape)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i7 |= i12;
        }
        if ((i5 & 100663296) == 0) {
            if (startRestartGroup.changed(f5)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i7 |= i11;
        }
        if ((i5 & 805306368) == 0) {
            if (startRestartGroup.changed(f6)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i7 |= i10;
        }
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(f7)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i8 = i6 | i9;
        } else {
            i8 = i6;
        }
        if ((i7 & 306783379) == 306783378 && (i8 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i7, i8, "androidx.compose.material3.SwitchImpl (Switch.kt:186)");
            }
            long m2334trackColorWaAFU9c$material3_release = switchColors.m2334trackColorWaAFU9c$material3_release(z5, z4);
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, startRestartGroup, (i7 >> 18) & 14);
            int i20 = i7;
            float mo300toDpu2uoSUM = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo300toDpu2uoSUM(state.getValue().floatValue());
            if (SwitchImpl_0DmnUew$lambda$8(collectIsPressedAsState)) {
                m6044constructorimpl = SwitchTokens.INSTANCE.m3141getPressedHandleWidthD9Ej5fM();
            } else {
                m6044constructorimpl = Dp.m6044constructorimpl(Dp.m6044constructorimpl(Dp.m6044constructorimpl(ThumbDiameter - f5) * (Dp.m6044constructorimpl(mo300toDpu2uoSUM - f6) / Dp.m6044constructorimpl(f7 - f6))) + f5);
            }
            startRestartGroup.startReplaceableGroup(-993794132);
            if (SwitchImpl_0DmnUew$lambda$8(collectIsPressedAsState)) {
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                if (z4) {
                    m3147getTrackOutlineWidthD9Ej5fM = Dp.m6044constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m3147getTrackOutlineWidthD9Ej5fM());
                } else {
                    m3147getTrackOutlineWidthD9Ej5fM = SwitchTokens.INSTANCE.m3147getTrackOutlineWidthD9Ej5fM();
                }
                floatValue = density.mo304toPx0680j_4(m3147getTrackOutlineWidthD9Ej5fM);
            } else {
                floatValue = state.getValue().floatValue();
            }
            startRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape value = ShapesKt.getValue(switchTokens.getTrackShape(), startRestartGroup, 6);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier m200backgroundbw27NRU = BackgroundKt.m200backgroundbw27NRU(BorderKt.m212borderxT4_qwU(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(boxScope.align(companion, companion2.getCenter()), SwitchWidth), SwitchHeight), switchTokens.m3147getTrackOutlineWidthD9Ej5fM(), switchColors.m2314borderColorWaAFU9c$material3_release(z5, z4), value), m2334trackColorWaAFU9c$material3_release, value);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m200backgroundbw27NRU);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long m2333thumbColorWaAFU9c$material3_release = switchColors.m2333thumbColorWaAFU9c$material3_release(z5, z4);
            Modifier align = boxScopeInstance.align(companion, companion2.getCenterStart());
            startRestartGroup.startReplaceableGroup(1420969929);
            boolean changed = startRestartGroup.changed(floatValue);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwitchKt$SwitchImpl$1$1$1(floatValue);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m200backgroundbw27NRU2 = BackgroundKt.m200backgroundbw27NRU(SizeKt.m594requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (v3.l) rememberedValue), interactionSource, RippleKt.m1541rememberRipple9IZ8Weo(false, Dp.m6044constructorimpl(switchTokens.m3145getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), m6044constructorimpl), m2333thumbColorWaAFU9c$material3_release, shape);
            Alignment center = companion2.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m200backgroundbw27NRU2);
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
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1420970455);
            if (pVar != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(switchColors.m2332iconColorWaAFU9c$material3_release(z5, z4))), pVar, startRestartGroup, ProvidedValue.$stable | 0 | ((i20 >> 12) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$2(boxScope, z4, z5, switchColors, state, pVar, interactionSource, shape, f5, f6, f7, i5, i6));
        }
    }

    private static final boolean SwitchImpl_0DmnUew$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
