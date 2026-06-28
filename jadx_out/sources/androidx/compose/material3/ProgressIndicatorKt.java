package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aH\u0010\r\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a:\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aB\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0010\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a0\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u001b\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a.\u0010\u001e\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aR\u0010\"\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aD\u0010\"\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aL\u0010\"\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010%\u001a8\u0010\"\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a0\u0010\"\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a6\u00100\u001a\u00020\n*\u00020\u00152\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a&\u00103\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a6\u00105\u001a\u00020\n*\u00020\u00152\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u0010/\u001a>\u00108\u001a\u00020\n*\u00020\u00152\u0006\u0010*\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\"\u0014\u00109\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\"\u0014\u0010;\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u001a\u0010=\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010?\"\u001a\u0010@\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bA\u0010?\"\u001a\u0010B\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bC\u0010?\"\u0014\u0010E\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010G\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010F\"\u0014\u0010H\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010F\"\u0014\u0010I\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010F\"\u0014\u0010J\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010F\"\u0014\u0010K\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010F\"\u0014\u0010L\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010F\"\u0014\u0010M\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010F\"\u0014\u0010N\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010F\"\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q\"\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010Q\"\u0014\u0010S\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010Q\"\u0014\u0010T\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010Q\"\u0014\u0010U\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010F\"\u0014\u0010V\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010F\"\u0014\u0010W\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010:\"\u0014\u0010X\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010:\"\u0014\u0010Y\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010:\"\u0014\u0010Z\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010:\"\u0014\u0010[\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010F\"\u0014\u0010\\\u001a\u00020D8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010F\"\u0014\u0010]\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010Q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006^"}, d2 = {"Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "trackColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "Lkotlin/r2;", "LinearProgressIndicator-_5eSR-E", "(Lv3/a;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicator", "drawLinearIndicatorTrack-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "drawLinearIndicatorTrack", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-DUhRLBM", "(Lv3/a;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawDeterminateCircularIndicator-42QJj7c", "drawDeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawIndeterminateCircularIndicator", "SemanticsBoundsPadding", "F", "IncreaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "LinearIndicatorWidth", "getLinearIndicatorWidth", "()F", "LinearIndicatorHeight", "getLinearIndicatorHeight", "CircularIndicatorDiameter", "getCircularIndicatorDiameter", "", "LinearAnimationDuration", "I", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,703:1\n1116#2,6:704\n1116#2,6:710\n1116#2,6:716\n1116#2,6:722\n1116#2,6:728\n1116#2,6:734\n1116#2,6:741\n1116#2,6:747\n1116#2,6:754\n1116#2,6:760\n74#3:740\n74#3:753\n75#4,7:766\n92#4:775\n58#4:776\n154#5:773\n154#5:774\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n86#1:704,6\n90#1:710,6\n94#1:716,6\n176#1:722,6\n218#1:728,6\n354#1:734,6\n360#1:741,6\n364#1:747,6\n452#1:754,6\n493#1:760,6\n355#1:740\n397#1:753\n578#1:766,7\n649#1:775\n649#1:776\n300#1:773\n640#1:774\n*E\n"})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;

    @p4.l
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;

    @p4.l
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;

    @p4.l
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;

    @p4.l
    private static final Modifier IncreaseSemanticsBounds;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;

    @p4.l
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;

    @p4.l
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;
    private static final float StartAngleOffset = -90.0f;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(10);
        SemanticsBoundsPadding = m6044constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m555paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, ProgressIndicatorKt$IncreaseSemanticsBounds$1.INSTANCE), true, ProgressIndicatorKt$IncreaseSemanticsBounds$2.INSTANCE), 0.0f, m6044constructorimpl, 1, null);
        LinearIndicatorWidth = Dp.m6044constructorimpl(240);
        LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m2929getTrackHeightD9Ej5fM();
        CircularProgressIndicatorTokens circularProgressIndicatorTokens = CircularProgressIndicatorTokens.INSTANCE;
        CircularIndicatorDiameter = Dp.m6044constructorimpl(circularProgressIndicatorTokens.m2663getSizeD9Ej5fM() - Dp.m6044constructorimpl(circularProgressIndicatorTokens.m2662getActiveIndicatorWidthD9Ej5fM() * 2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ee  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2070CircularProgressIndicatorDUhRLBM(@p4.l v3.a<java.lang.Float> r27, @p4.m androidx.compose.ui.Modifier r28, long r29, float r31, long r32, int r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2070CircularProgressIndicatorDUhRLBM(v3.a, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0082  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2071CircularProgressIndicatorLxG7B9w(@p4.m androidx.compose.ui.Modifier r36, long r37, float r39, long r40, int r42, @p4.m androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2071CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2072CircularProgressIndicatorMBs18nI(float r20, androidx.compose.ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2072CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2073CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2073CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e5, code lost:
    
        if (r1.changed(r10) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2074LinearProgressIndicator2cYBFYY(@p4.m androidx.compose.ui.Modifier r31, long r32, long r34, int r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2074LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m2075LinearProgressIndicatorRIQooxk(Modifier modifier, long j5, long j6, Composer composer, int i5, int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        long j7;
        long j8;
        Modifier modifier3;
        long j9;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(585576195);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            j7 = j5;
            if ((i6 & 2) == 0 && startRestartGroup.changed(j7)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i7 |= i10;
        } else {
            j7 = j5;
        }
        if ((i5 & 384) == 0) {
            j8 = j6;
            if ((i6 & 4) == 0 && startRestartGroup.changed(j8)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        } else {
            j8 = j6;
        }
        if ((i7 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j9 = j7;
        } else {
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i6 & 2) != 0) {
                    i7 &= -113;
                }
                if ((i6 & 4) != 0) {
                    i7 &= -897;
                }
                modifier3 = modifier2;
            } else {
                if (i11 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i6 & 2) != 0) {
                    j7 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                    i7 &= -113;
                }
                if ((i6 & 4) != 0) {
                    j8 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                    i7 &= -897;
                }
            }
            int i12 = i7;
            j9 = j7;
            long j10 = j8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:246)");
            }
            m2074LinearProgressIndicator2cYBFYY(modifier3, j9, j10, ProgressIndicatorDefaults.INSTANCE.m2068getLinearStrokeCapKaPHkGw(), startRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j8 = j10;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$9(modifier3, j9, j8, i5, i6));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x01c4: INVOKE (r2v1 ?? I:androidx.compose.runtime.Composer), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:26)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m2077LinearProgressIndicator_5eSRE(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x01c4: INVOKE (r2v1 ?? I:androidx.compose.runtime.Composer), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:26)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m2078LinearProgressIndicatoreaDK9VM(float r20, androidx.compose.ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2078LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2084drawCircularIndicator42QJj7c(DrawScope drawScope, float f5, float f6, long j5, Stroke stroke) {
        float f7 = 2;
        float width = stroke.getWidth() / f7;
        float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()) - (f7 * width);
        DrawScope.m4257drawArcyD3GUKo$default(drawScope, j5, f5, f6, false, OffsetKt.Offset(width, width), SizeKt.Size(m3562getWidthimpl, m3562getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    public static final void m2085drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j5, Stroke stroke) {
        m2084drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j5, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m2086drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f5, float f6, long j5, Stroke stroke) {
        m2084drawCircularIndicator42QJj7c(drawScope, f5, f6, j5, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m2087drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f5, float f6, float f7, long j5, Stroke stroke) {
        float m6044constructorimpl;
        if (StrokeCap.m4081equalsimpl0(stroke.m4341getCapKaPHkGw(), StrokeCap.Companion.m4085getButtKaPHkGw())) {
            m6044constructorimpl = 0.0f;
        } else {
            m6044constructorimpl = ((f6 / Dp.m6044constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f;
        }
        m2084drawCircularIndicator42QJj7c(drawScope, f5 + m6044constructorimpl, Math.max(f7, 0.1f), j5, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m2088drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f5, float f6, long j5, float f7, int i5) {
        boolean z4;
        float f8;
        float f9;
        kotlin.ranges.f e5;
        Object N;
        Object N2;
        float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
        float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
        float f10 = 2;
        float f11 = m3559getHeightimpl / f10;
        if (drawScope.getLayoutDirection() == LayoutDirection.Ltr) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f8 = f5;
        } else {
            f8 = 1.0f - f6;
        }
        float f12 = f8 * m3562getWidthimpl;
        if (z4) {
            f9 = f6;
        } else {
            f9 = 1.0f - f5;
        }
        float f13 = f9 * m3562getWidthimpl;
        if (!StrokeCap.m4081equalsimpl0(i5, StrokeCap.Companion.m4085getButtKaPHkGw()) && m3559getHeightimpl <= m3562getWidthimpl) {
            float f14 = f7 / f10;
            e5 = kotlin.ranges.t.e(f14, m3562getWidthimpl - f14);
            N = kotlin.ranges.u.N(Float.valueOf(f12), e5);
            float floatValue = ((Number) N).floatValue();
            N2 = kotlin.ranges.u.N(Float.valueOf(f13), e5);
            float floatValue2 = ((Number) N2).floatValue();
            if (Math.abs(f6 - f5) > 0.0f) {
                DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(floatValue, f11), OffsetKt.Offset(floatValue2, f11), f7, i5, null, 0.0f, null, 0, 480, null);
                return;
            }
            return;
        }
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(f12, f11), OffsetKt.Offset(f13, f11), f7, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorTrack-AZGd3zU, reason: not valid java name */
    public static final void m2089drawLinearIndicatorTrackAZGd3zU(DrawScope drawScope, long j5, float f5, int i5) {
        m2088drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j5, f5, i5);
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0058  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.b1(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2076LinearProgressIndicator_5eSRE(float r23, @p4.m androidx.compose.ui.Modifier r24, long r25, long r27, int r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2076LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0062  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.b1(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2069CircularProgressIndicatorDUhRLBM(float r21, @p4.m androidx.compose.ui.Modifier r22, long r23, float r25, long r26, int r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.m2069CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }
}
