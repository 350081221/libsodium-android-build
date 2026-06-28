package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlay;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a>\u0010\u001f\u001a\u00020\n*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$\"\u0014\u0010+\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$\"\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$\"\u0014\u0010-\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010$\"\u0014\u0010.\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010$\"\u0014\u0010/\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010$\"\u0014\u00100\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010$\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066²\u0006\f\u00104\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"", "refreshing", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "scale", "Lkotlin/r2;", "PullRefreshIndicator-jB83MbM", "(ZLandroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "PullRefreshIndicator", TypedValues.Custom.S_COLOR, "CircularArrowIndicator-iJQMabo", "(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "CircularArrowIndicator", "", "progress", "Landroidx/compose/material/pullrefresh/ArrowValues;", "ArrowValues", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Path;", "arrow", "Landroidx/compose/ui/geometry/Rect;", "bounds", "alpha", "values", "drawArrow-Bx497Mc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V", "drawArrow", "", "CrossfadeDurationMs", "I", "MaxProgressArc", "F", "Landroidx/compose/ui/unit/Dp;", "IndicatorSize", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SpinnerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ArcRadius", "StrokeWidth", "ArrowWidth", "ArrowHeight", "Elevation", "MinAlpha", "MaxAlpha", "Landroidx/compose/animation/core/TweenSpec;", "AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "showElevation", "targetAlpha", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,250:1\n50#2:251\n49#2:252\n456#2,8:278\n464#2,3:292\n467#2,3:296\n25#2:301\n36#2:309\n1116#3,6:253\n1116#3,3:302\n1119#3,3:306\n1116#3,6:310\n74#4:259\n154#5:260\n154#5:334\n164#5:335\n164#5:336\n154#5:337\n154#5:338\n154#5:339\n68#6,6:261\n74#6:295\n78#6:300\n79#7,11:267\n92#7:299\n3737#8,6:286\n1#9:305\n137#10,5:316\n262#10,11:321\n81#11:332\n81#11:333\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n83#1:251\n83#1:252\n94#1:278,8\n94#1:292,3\n94#1:296,3\n135#1:301\n137#1:309\n83#1:253,6\n135#1:302,3\n135#1:306,3\n137#1:310,6\n90#1:259\n98#1:260\n238#1:334\n240#1:335\n241#1:336\n242#1:337\n243#1:338\n244#1:339\n94#1:261,6\n94#1:295\n94#1:300\n94#1:267,11\n94#1:299\n94#1:286,6\n230#1:316,5\n230#1:321,11\n83#1:332\n137#1:333\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float IndicatorSize = Dp.m6044constructorimpl(40);

    @l
    private static final RoundedCornerShape SpinnerShape = RoundedCornerShapeKt.getCircleShape();
    private static final float ArcRadius = Dp.m6044constructorimpl((float) 7.5d);
    private static final float StrokeWidth = Dp.m6044constructorimpl((float) 2.5d);
    private static final float ArrowWidth = Dp.m6044constructorimpl(10);
    private static final float ArrowHeight = Dp.m6044constructorimpl(5);
    private static final float Elevation = Dp.m6044constructorimpl(6);

    @l
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f5) {
        float H;
        float max = (Math.max(Math.min(1.0f, f5) - 0.4f, 0.0f) * 5) / 3;
        H = u.H(Math.abs(f5) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (H - (((float) Math.pow(H, 2)) / 4))) * 0.5f;
        float f6 = 360;
        return new ArrowValues(pow, pow * f6, ((MaxProgressArc * max) + pow) * f6, Math.min(1.0f, max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: CircularArrowIndicator-iJQMabo, reason: not valid java name */
    public static final void m1527CircularArrowIndicatoriJQMabo(PullRefreshState pullRefreshState, long j5, Modifier modifier, Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-486016981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-486016981, i5, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:133)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Object obj = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            Path Path = AndroidPath_androidKt.Path();
            Path.mo3627setFillTypeoQ8Xj4U(PathFillType.Companion.m4015getEvenOddRgk1Os());
            startRestartGroup.updateRememberedValue(Path);
            obj = Path;
        }
        startRestartGroup.endReplaceableGroup();
        Path path = (Path) obj;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(pullRefreshState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(pullRefreshState));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(SemanticsModifierKt.semantics$default(modifier, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.INSTANCE, 1, null), new PullRefreshIndicatorKt$CircularArrowIndicator$2(pullRefreshState, AnimateAsStateKt.animateFloatAsState(CircularArrowIndicator_iJQMabo$lambda$6((State) rememberedValue2), AlphaTween, 0.0f, null, null, startRestartGroup, 48, 28), j5, path), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$CircularArrowIndicator$3(pullRefreshState, j5, modifier, i5));
        }
    }

    private static final float CircularArrowIndicator_iJQMabo$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: PullRefreshIndicator-jB83MbM, reason: not valid java name */
    public static final void m1528PullRefreshIndicatorjB83MbM(boolean z4, @l PullRefreshState pullRefreshState, @m Modifier modifier, long j5, long j6, boolean z5, @m Composer composer, int i5, int i6) {
        Modifier modifier2;
        long j7;
        int i7;
        long j8;
        boolean z6;
        Color m3724boximpl;
        int i8;
        long j9;
        float m6044constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(308716636);
        if ((i6 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 8) != 0) {
            i7 = i5 & (-7169);
            j7 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1279getSurface0d7_KjU();
        } else {
            j7 = j5;
            i7 = i5;
        }
        if ((i6 & 16) != 0) {
            long m1293contentColorForek8zF_U = ColorsKt.m1293contentColorForek8zF_U(j7, startRestartGroup, (i7 >> 9) & 14);
            i7 &= -57345;
            j8 = m1293contentColorForek8zF_U;
        } else {
            j8 = j6;
        }
        if ((i6 & 32) != 0) {
            z6 = false;
        } else {
            z6 = z5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(308716636, i7, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
        }
        Boolean valueOf = Boolean.valueOf(z4);
        int i9 = i7 & 14;
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(pullRefreshState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(new PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(z4, pullRefreshState));
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        State state = (State) rememberedValue;
        ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
        startRestartGroup.startReplaceableGroup(52228748);
        if (elevationOverlay == null) {
            m3724boximpl = null;
        } else {
            m3724boximpl = Color.m3724boximpl(elevationOverlay.mo1315apply7g2Lkgo(j7, Elevation, startRestartGroup, ((i7 >> 9) & 14) | 48));
        }
        startRestartGroup.endReplaceableGroup();
        if (m3724boximpl != null) {
            i8 = i9;
            j9 = m3724boximpl.m3744unboximpl();
        } else {
            i8 = i9;
            j9 = j7;
        }
        Modifier pullRefreshIndicatorTransform = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(SizeKt.m602size3ABfNKs(modifier2, IndicatorSize), pullRefreshState, z6);
        if (PullRefreshIndicator_jB83MbM$lambda$1(state)) {
            m6044constructorimpl = Elevation;
        } else {
            m6044constructorimpl = Dp.m6044constructorimpl(0);
        }
        float f5 = m6044constructorimpl;
        RoundedCornerShape roundedCornerShape = SpinnerShape;
        Modifier m200backgroundbw27NRU = BackgroundKt.m200backgroundbw27NRU(ShadowKt.m3406shadows4CzXII$default(pullRefreshIndicatorTransform, f5, roundedCornerShape, true, 0L, 0L, 24, null), j9, roundedCornerShape);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m200backgroundbw27NRU);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        long j10 = j8;
        CrossfadeKt.Crossfade(Boolean.valueOf(z4), (Modifier) null, AnimationSpecKt.tween$default(100, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1853731063, true, new PullRefreshIndicatorKt$PullRefreshIndicator$1$1(j8, pullRefreshState)), startRestartGroup, i8 | 24960, 10);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PullRefreshIndicatorKt$PullRefreshIndicator$2(z4, pullRefreshState, modifier2, j7, j10, z6, i5, i6));
        }
    }

    private static final boolean PullRefreshIndicator_jB83MbM$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-Bx497Mc, reason: not valid java name */
    public static final void m1531drawArrowBx497Mc(DrawScope drawScope, Path path, Rect rect, long j5, float f5, ArrowValues arrowValues) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f6 = ArrowWidth;
        path.lineTo(drawScope.mo304toPx0680j_4(f6) * arrowValues.getScale(), 0.0f);
        path.lineTo((drawScope.mo304toPx0680j_4(f6) * arrowValues.getScale()) / 2, drawScope.mo304toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.mo3629translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m3493getXimpl(rect.m3523getCenterF1C5BW0())) - ((drawScope.mo304toPx0680j_4(f6) * arrowValues.getScale()) / 2.0f), Offset.m3494getYimpl(rect.m3523getCenterF1C5BW0()) + (drawScope.mo304toPx0680j_4(StrokeWidth) / 2.0f)));
        path.close();
        float endAngle = arrowValues.getEndAngle();
        long mo4276getCenterF1C5BW0 = drawScope.mo4276getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(endAngle, mo4276getCenterF1C5BW0);
        DrawScope.m4268drawPathLG529CI$default(drawScope, path, j5, f5, null, null, 0, 56, null);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }
}
