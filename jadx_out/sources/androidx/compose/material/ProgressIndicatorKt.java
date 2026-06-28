package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.ranges.f;
import kotlin.ranges.t;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001aD\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a:\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a8\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u001a\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a.\u0010\u001d\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aN\u0010!\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u001e2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aD\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u001e2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a8\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a0\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a6\u0010.\u001a\u00020\n*\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a&\u00101\u001a\u00020\n*\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a6\u00103\u001a\u00020\n*\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u0010-\u001a>\u00106\u001a\u00020\n*\u00020\u00142\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\"\u0014\u00107\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108\"\u0014\u0010:\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108\"\u0014\u0010<\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010=\"\u0014\u0010?\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010=\"\u0014\u0010@\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010=\"\u0014\u0010A\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010=\"\u0014\u0010B\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010=\"\u0014\u0010C\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010=\"\u0014\u0010D\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010=\"\u0014\u0010E\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010=\"\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010H\"\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010H\"\u0014\u0010K\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010H\"\u0014\u0010L\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010=\"\u0014\u0010M\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010=\"\u0014\u0010N\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u00108\"\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u00108\"\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u00108\"\u0014\u0010Q\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u00108\"\u0014\u0010R\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010=\"\u0014\u0010S\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010=\"\u0014\u0010T\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010H\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\²\u0006\f\u0010U\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010V\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010W\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010X\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010Y\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010[\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "increaseSemanticsBounds", "", "progress", "modifier", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "backgroundColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "Lkotlin/r2;", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicator", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "drawLinearIndicatorBackground", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawDeterminateCircularIndicator-42QJj7c", "drawDeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawIndeterminateCircularIndicator", "LinearIndicatorHeight", "F", "LinearIndicatorWidth", "CircularIndicatorDiameter", "", "LinearAnimationDuration", "I", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,619:1\n154#2:620\n154#2:650\n154#2:651\n1116#3,6:621\n1116#3,6:627\n74#4:633\n74#4:634\n75#5,7:635\n81#6:642\n81#6:643\n81#6:644\n81#6:645\n81#6:646\n81#6:647\n81#6:648\n81#6:649\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n57#1:620\n562#1:650\n566#1:651\n117#1:621,6\n197#1:627,6\n328#1:633\n366#1:634\n544#1:635,7\n148#1:642\n159#1:643\n170#1:644\n181#1:645\n372#1:646\n384#1:647\n395#1:648\n407#1:649\n*E\n"})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1397getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m6044constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m6044constructorimpl(40);

    @l
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    @l
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @l
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    @l
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    @l
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0059  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1398CircularProgressIndicatorDUhRLBM(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r18, @p4.m androidx.compose.ui.Modifier r19, long r20, float r22, long r23, int r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1398CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0067  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1399CircularProgressIndicatorLxG7B9w(@p4.m androidx.compose.ui.Modifier r25, long r26, float r28, long r29, int r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1399CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
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
    public static final /* synthetic */ void m1400CircularProgressIndicatorMBs18nI(float r20, androidx.compose.ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1400CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1401CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1401CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1402LinearProgressIndicator2cYBFYY(@p4.m androidx.compose.ui.Modifier r29, long r30, long r32, int r34, @p4.m androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1402LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @k(level = m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1403LinearProgressIndicatorRIQooxk(Modifier modifier, long j5, long j6, Composer composer, int i5, int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        long j7;
        long j8;
        Modifier modifier3;
        long j9;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 14) == 0) {
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
        if ((i5 & 112) == 0) {
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
        if ((i5 & 896) == 0) {
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
        if ((i7 & 731) == 146 && startRestartGroup.getSkipping()) {
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
                    j7 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1275getPrimary0d7_KjU();
                    i7 &= -113;
                }
                if ((i6 & 4) != 0) {
                    j8 = Color.m3733copywmQWz5c$default(j7, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i7 &= -897;
                }
            }
            int i12 = i7;
            j9 = j7;
            long j10 = j8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:241)");
            }
            m1402LinearProgressIndicator2cYBFYY(modifier3, j9, j10, StrokeCap.Companion.m4085getButtKaPHkGw(), startRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j8 = j10;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(modifier3, j9, j8, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0059  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1404LinearProgressIndicator_5eSRE(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r22, @p4.m androidx.compose.ui.Modifier r23, long r24, long r26, int r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1404LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1405LinearProgressIndicatoreaDK9VM(float r20, androidx.compose.ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1405LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1411drawCircularIndicator42QJj7c(DrawScope drawScope, float f5, float f6, long j5, Stroke stroke) {
        float f7 = 2;
        float width = stroke.getWidth() / f7;
        float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()) - (f7 * width);
        DrawScope.m4257drawArcyD3GUKo$default(drawScope, j5, f5, f6, false, OffsetKt.Offset(width, width), SizeKt.Size(m3562getWidthimpl, m3562getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1412drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j5, Stroke stroke) {
        m1411drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j5, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1413drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f5, float f6, long j5, Stroke stroke) {
        m1411drawCircularIndicator42QJj7c(drawScope, f5, f6, j5, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1414drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f5, float f6, float f7, long j5, Stroke stroke) {
        float m6044constructorimpl;
        if (StrokeCap.m4081equalsimpl0(stroke.m4341getCapKaPHkGw(), StrokeCap.Companion.m4085getButtKaPHkGw())) {
            m6044constructorimpl = 0.0f;
        } else {
            m6044constructorimpl = ((f6 / Dp.m6044constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f;
        }
        m1411drawCircularIndicator42QJj7c(drawScope, f5 + m6044constructorimpl, Math.max(f7, 0.1f), j5, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1415drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f5, float f6, long j5, float f7, int i5) {
        boolean z4;
        float f8;
        float f9;
        f e5;
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
            e5 = t.e(f14, m3562getWidthimpl - f14);
            N = u.N(Float.valueOf(f12), e5);
            float floatValue = ((Number) N).floatValue();
            N2 = u.N(Float.valueOf(f13), e5);
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
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1416drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j5, float f5, int i5) {
        m1415drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j5, f5, i5);
    }

    @l
    public static final Modifier increaseSemanticsBounds(@l Modifier modifier) {
        float m6044constructorimpl = Dp.m6044constructorimpl(10);
        return PaddingKt.m555paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(modifier, new ProgressIndicatorKt$increaseSemanticsBounds$1(m6044constructorimpl)), true, ProgressIndicatorKt$increaseSemanticsBounds$2.INSTANCE), 0.0f, m6044constructorimpl, 1, null);
    }
}
