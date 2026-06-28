package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a,\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u001a(\u0010 \u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u001d\u001a\u00020\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010*\u001a\u00020\u0005*\u00020!2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0010\u0010+\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002\u001aF\u00101\u001a\u00020\u0005*\u00020!2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u00102\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103\"\u0014\u00108\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103\"\u001a\u00109\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010;\"\u001a\u0010<\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u0010;\"\u0014\u0010>\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00103\"\u0014\u0010?\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00103\"\u0014\u0010@\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00103\"\u0014\u0010A\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00103\"\u0014\u0010B\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00103\"\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\"\u0014\u0010F\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\f\u0010G\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "indicator", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "PullToRefreshContainer-wBJOh4Y", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "PullToRefreshContainer", "Landroidx/compose/ui/unit/Dp;", "positionalThreshold", "Lkotlin/Function0;", "", "enabled", "rememberPullToRefreshState--orJrPs", "(FLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "rememberPullToRefreshState", "", "positionalThresholdPx", "initialRefreshing", "PullToRefreshState", "progress", TypedValues.Custom.S_COLOR, "CircularArrowProgressIndicator-RPmYEkk", "(Lv3/a;JLandroidx/compose/runtime/Composer;I)V", "CircularArrowProgressIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "alpha", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "values", "Landroidx/compose/ui/geometry/Rect;", "arcBounds", "strokeWidth", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "drawCircularIndicator", "ArrowValues", "Landroidx/compose/ui/graphics/Path;", "arrow", "bounds", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawArrow", "MaxProgressArc", "F", "", "CrossfadeDurationMs", "I", "StrokeWidth", "ArcRadius", "SpinnerSize", "getSpinnerSize", "()F", "SpinnerContainerSize", "getSpinnerContainerSize", "Elevation", "ArrowWidth", "ArrowHeight", "MinAlpha", "MaxAlpha", "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "DragMultiplier", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n1116#2,6:559\n1116#2,6:567\n1116#2,6:573\n1116#2,6:579\n1116#2,6:585\n1116#2,6:591\n74#3:565\n1#4:566\n137#5,5:597\n262#5,11:602\n81#6:613\n164#7:614\n164#7:615\n154#7:616\n154#7:617\n154#7:618\n154#7:619\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n119#1:559,6\n262#1:567,6\n429#1:573,6\n431#1:579,6\n437#1:585,6\n442#1:591,6\n254#1:565\n529#1:597,5\n529#1:602,11\n431#1:613\n538#1:614\n539#1:615\n540#1:616\n541#1:617\n543#1:618\n544#1:619\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = Dp.m6044constructorimpl((float) 2.5d);
    private static final float ArcRadius = Dp.m6044constructorimpl((float) 5.5d);
    private static final float SpinnerSize = Dp.m6044constructorimpl(16);
    private static final float SpinnerContainerSize = Dp.m6044constructorimpl(40);
    private static final float Elevation = ElevationTokens.INSTANCE.m2801getLevel2D9Ej5fM();
    private static final float ArrowWidth = Dp.m6044constructorimpl(10);
    private static final float ArrowHeight = Dp.m6044constructorimpl(5);

    @l
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    public static final ArrowValues ArrowValues(float f5) {
        float H;
        float max = (Math.max(Math.min(1.0f, f5) - 0.4f, 0.0f) * 5) / 3;
        H = u.H(Math.abs(f5) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (H - (((float) Math.pow(H, 2)) / 4))) * 0.5f;
        float f6 = 360;
        return new ArrowValues(pow, pow * f6, ((MaxProgressArc * max) + pow) * f6, Math.min(1.0f, max));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk */
    public static final void m2619CircularArrowProgressIndicatorRPmYEkk(a<Float> aVar, long j5, Composer composer, int i5) {
        int i6;
        boolean z4;
        boolean z5;
        Composer composer2;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-569718810);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(j5)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i6, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:427)");
            }
            startRestartGroup.startReplaceableGroup(-656076138);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object obj = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo3627setFillTypeoQ8Xj4U(PathFillType.Companion.m4015getEvenOddRgk1Os());
                startRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            Path path = (Path) obj;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-656075976);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1(aVar));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$6((State) rememberedValue2), AlphaTween, 0.0f, null, null, startRestartGroup, 48, 28);
            Modifier.Companion companion2 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-656075714);
            int i9 = i6 & 14;
            boolean z6 = true;
            if (i9 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new PullToRefreshKt$CircularArrowProgressIndicator$1$1(aVar);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m602size3ABfNKs = SizeKt.m602size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (v3.l) rememberedValue3), SpinnerSize);
            startRestartGroup.startReplaceableGroup(-656075558);
            if (i9 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean changed = z5 | startRestartGroup.changed(animateFloatAsState);
            if ((i6 & 112) != 32) {
                z6 = false;
            }
            boolean changedInstance = changed | z6 | startRestartGroup.changedInstance(path);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance && rememberedValue4 != companion.getEmpty()) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                PullToRefreshKt$CircularArrowProgressIndicator$2$1 pullToRefreshKt$CircularArrowProgressIndicator$2$1 = new PullToRefreshKt$CircularArrowProgressIndicator$2$1(aVar, animateFloatAsState, j5, path);
                composer2.updateRememberedValue(pullToRefreshKt$CircularArrowProgressIndicator$2$1);
                rememberedValue4 = pullToRefreshKt$CircularArrowProgressIndicator$2$1;
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(m602size3ABfNKs, (v3.l) rememberedValue4, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullToRefreshKt$CircularArrowProgressIndicator$3(aVar, j5, i5));
        }
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if ((r27 & 32) != 0) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0047  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PullToRefreshContainer-wBJOh4Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2620PullToRefreshContainerwBJOh4Y(@p4.l androidx.compose.material3.pulltorefresh.PullToRefreshState r17, @p4.m androidx.compose.ui.Modifier r18, @p4.m v3.q<? super androidx.compose.material3.pulltorefresh.PullToRefreshState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r19, @p4.m androidx.compose.ui.graphics.Shape r20, long r21, long r23, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.m2620PullToRefreshContainerwBJOh4Y(androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Modifier, v3.q, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @l
    @ExperimentalMaterial3Api
    public static final PullToRefreshState PullToRefreshState(float f5, boolean z4, @l a<Boolean> aVar) {
        return new PullToRefreshStateImpl(z4, f5, aVar);
    }

    public static /* synthetic */ PullToRefreshState PullToRefreshState$default(float f5, boolean z4, a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            aVar = PullToRefreshKt$PullToRefreshState$1.INSTANCE;
        }
        return PullToRefreshState(f5, z4, aVar);
    }

    /* renamed from: access$CircularArrowProgressIndicator-RPmYEkk */
    public static final /* synthetic */ void m2621access$CircularArrowProgressIndicatorRPmYEkk(a aVar, long j5, Composer composer, int i5) {
        m2619CircularArrowProgressIndicatorRPmYEkk(aVar, j5, composer, i5);
    }

    public static final /* synthetic */ float access$getStrokeWidth$p() {
        return StrokeWidth;
    }

    /* renamed from: drawArrow-uDrxG_w */
    public static final void m2624drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j5, float f5, ArrowValues arrowValues, float f6) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f7 = ArrowWidth;
        path.lineTo((drawScope.mo304toPx0680j_4(f7) * arrowValues.getScale()) / 2, drawScope.mo304toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo304toPx0680j_4(f7) * arrowValues.getScale(), 0.0f);
        path.mo3629translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m3493getXimpl(rect.m3523getCenterF1C5BW0())) - ((drawScope.mo304toPx0680j_4(f7) * arrowValues.getScale()) / 2.0f), Offset.m3494getYimpl(rect.m3523getCenterF1C5BW0()) - drawScope.mo304toPx0680j_4(f6)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo304toPx0680j_4(f6);
        long mo4276getCenterF1C5BW0 = drawScope.mo4276getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(endAngle, mo4276getCenterF1C5BW0);
        DrawScope.m4268drawPathLG529CI$default(drawScope, path, j5, f5, new Stroke(drawScope.mo304toPx0680j_4(f6), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: drawCircularIndicator-KzyDr3Q */
    public static final void m2625drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j5, float f5, ArrowValues arrowValues, Rect rect, float f6) {
        DrawScope.m4257drawArcyD3GUKo$default(drawScope, j5, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m3528getTopLeftF1C5BW0(), rect.m3526getSizeNHjbRc(), f5, new Stroke(drawScope.mo304toPx0680j_4(f6), 0.0f, StrokeCap.Companion.m4085getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    @l
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: rememberPullToRefreshState--orJrPs */
    public static final PullToRefreshState m2626rememberPullToRefreshStateorJrPs(float f5, @m a<Boolean> aVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1935213334);
        if ((i6 & 1) != 0) {
            f5 = PullToRefreshDefaults.INSTANCE.m2618getPositionalThresholdD9Ej5fM();
        }
        if ((i6 & 2) != 0) {
            aVar = PullToRefreshKt$rememberPullToRefreshState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1935213334, i5, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:252)");
        }
        float mo304toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(f5);
        boolean z4 = false;
        Object[] objArr = {Float.valueOf(mo304toPx0680j_4), aVar};
        Saver<PullToRefreshState, Boolean> Saver = PullToRefreshStateImpl.Companion.Saver(mo304toPx0680j_4, aVar);
        composer.startReplaceableGroup(804873447);
        boolean changed = composer.changed(mo304toPx0680j_4);
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(aVar)) || (i5 & 48) == 32) {
            z4 = true;
        }
        boolean z5 = changed | z4;
        Object rememberedValue = composer.rememberedValue();
        if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PullToRefreshKt$rememberPullToRefreshState$2$1(mo304toPx0680j_4, aVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PullToRefreshState pullToRefreshState = (PullToRefreshState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pullToRefreshState;
    }
}
