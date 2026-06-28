package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u001c\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!\"\u001a\u0010$\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f\"\u0014\u0010'\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001f\"\u0014\u0010(\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001f\"\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001f\"\u0014\u0010*\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001f\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001f\"\u0014\u0010/\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001f\"\u0014\u00100\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u001f\"\u0014\u00101\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067²\u0006\u000e\u00102\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u001a\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/r2;", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", "Switch", "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/Function0;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "SwitchImpl", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lv3/a;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trackColor", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "drawTrack", "Landroidx/compose/ui/unit/Dp;", "TrackWidth", "F", "getTrackWidth", "()F", "TrackStrokeWidth", "getTrackStrokeWidth", "ThumbDiameter", "getThumbDiameter", "ThumbRippleRadius", "DefaultSwitchPadding", "SwitchWidth", "SwitchHeight", "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "ThumbDefaultElevation", "ThumbPressedElevation", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,422:1\n25#2:423\n25#2:432\n50#2:440\n49#2:441\n456#2,8:478\n464#2,3:492\n467#2,3:502\n25#2:507\n1116#3,6:424\n1116#3,6:433\n1116#3,6:442\n1116#3,6:448\n1116#3,6:454\n1116#3,6:496\n1116#3,6:508\n1116#3,6:514\n1116#3,6:520\n1116#3,6:529\n74#4:430\n74#4:439\n74#4:460\n74#4:526\n74#4:527\n1#5:431\n68#6,6:461\n74#6:495\n78#6:506\n79#7,11:467\n92#7:505\n3737#8,6:486\n51#9:528\n58#9:548\n81#10:535\n107#10,2:536\n81#10:538\n81#10:539\n81#10:540\n81#10:541\n81#10:542\n154#11:543\n154#11:544\n154#11:545\n154#11:546\n154#11:547\n154#11:549\n154#11:550\n154#11:551\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n99#1:423\n108#1:432\n110#1:440\n110#1:441\n153#1:478,8\n153#1:492,3\n153#1:502,3\n221#1:507\n99#1:424,6\n108#1:433,6\n110#1:442,6\n124#1:448,6\n133#1:454,6\n179#1:496,6\n221#1:508,6\n223#1:514,6\n246#1:520,6\n262#1:529,6\n103#1:430\n109#1:439\n138#1:460\n250#1:526\n251#1:527\n153#1:461,6\n153#1:495\n153#1:506\n153#1:467,11\n153#1:505\n153#1:486,6\n251#1:528\n293#1:548\n108#1:535\n108#1:536,2\n122#1:538\n123#1:539\n242#1:540\n249#1:541\n252#1:542\n284#1:543\n285#1:544\n286#1:545\n288#1:546\n290#1:547\n297#1:549\n298#1:550\n421#1:551\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchKt {

    @l
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(34);
        TrackWidth = m6044constructorimpl;
        TrackStrokeWidth = Dp.m6044constructorimpl(14);
        float m6044constructorimpl2 = Dp.m6044constructorimpl(20);
        ThumbDiameter = m6044constructorimpl2;
        ThumbRippleRadius = Dp.m6044constructorimpl(24);
        DefaultSwitchPadding = Dp.m6044constructorimpl(2);
        SwitchWidth = m6044constructorimpl;
        SwitchHeight = m6044constructorimpl2;
        ThumbPathLength = Dp.m6044constructorimpl(m6044constructorimpl - m6044constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m6044constructorimpl(1);
        ThumbPressedElevation = Dp.m6044constructorimpl(6);
        SwitchVelocityThreshold = Dp.m6044constructorimpl(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Switch(boolean r46, @p4.m v3.l<? super java.lang.Boolean, kotlin.r2> r47, @p4.m androidx.compose.ui.Modifier r48, boolean r49, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r50, @p4.m androidx.compose.material.SwitchColors r51, @p4.m androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, v3.l, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v3.l<Boolean, r2> Switch$lambda$7(State<? extends v3.l<? super Boolean, r2>> state) {
        return (v3.l) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(BoxScope boxScope, boolean z4, boolean z5, SwitchColors switchColors, a<Float> aVar, InteractionSource interactionSource, Composer composer, int i5) {
        int i6;
        float f5;
        long SwitchImpl$lambda$17;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(70908914);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(z4)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z5)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(switchColors)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((57344 & i5) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((458752 & i5) == 0) {
            if (startRestartGroup.changed(interactionSource)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((374491 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i6, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            startRestartGroup.startReplaceableGroup(1204586249);
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (p<? super s0, ? super d<? super r2>, ? extends Object>) rememberedValue2, startRestartGroup, ((i6 >> 15) & 14) | 64);
            if (!snapshotStateList.isEmpty()) {
                f5 = ThumbPressedElevation;
            } else {
                f5 = ThumbDefaultElevation;
            }
            float f6 = f5;
            int i13 = ((i6 >> 6) & 14) | (i6 & 112) | ((i6 >> 3) & 896);
            State<Color> trackColor = switchColors.trackColor(z5, z4, startRestartGroup, i13);
            Modifier.Companion companion2 = Modifier.Companion;
            Alignment.Companion companion3 = Alignment.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1204587189);
            boolean changed2 = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SwitchKt$SwitchImpl$2$1(trackColor);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (v3.l) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z5, z4, startRestartGroup, i13);
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float m6044constructorimpl = Dp.m6044constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m6058unboximpl() + f6);
            startRestartGroup.startReplaceableGroup(-539243554);
            if (Color.m3735equalsimpl0(SwitchImpl$lambda$17(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1279getSurface0d7_KjU()) && elevationOverlay != null) {
                SwitchImpl$lambda$17 = elevationOverlay.mo1315apply7g2Lkgo(SwitchImpl$lambda$17(thumbColor), m6044constructorimpl, startRestartGroup, 0);
            } else {
                SwitchImpl$lambda$17 = SwitchImpl$lambda$17(thumbColor);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(SwitchImpl$lambda$17, null, null, null, startRestartGroup, 0, 14);
            Modifier align = boxScope.align(companion2, companion3.getCenterStart());
            composer2.startReplaceableGroup(1204587807);
            boolean changedInstance = composer2.changedInstance(aVar);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new SwitchKt$SwitchImpl$3$1(aVar);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m200backgroundbw27NRU(ShadowKt.m3406shadows4CzXII$default(SizeKt.m594requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (v3.l) rememberedValue4), interactionSource, RippleKt.m1541rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composer2, 54, 4)), ThumbDiameter), f6, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$18(m96animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$4(boxScope, z4, z5, switchColors, aVar, interactionSource, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$15(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    private static final long SwitchImpl$lambda$17(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1468drawTrackRPmYEkk(DrawScope drawScope, long j5, float f5, float f6) {
        float f7 = f6 / 2;
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, androidx.compose.ui.geometry.OffsetKt.Offset(f7, Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f5 - f7, Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), f6, StrokeCap.Companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
