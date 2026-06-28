package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aò\u0001\u0010(\u001a\u00020\u000e2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001c2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a0\u0010.\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010+\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a=\u00101\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00002\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0004\b1\u00102\u001ag\u00109\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b32\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u00052\"\u00108\u001a\u001e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e07¢\u0006\u0002\b\u000f¢\u0006\u0002\b3H\u0003¢\u0006\u0004\b9\u0010:\"\u0014\u0010;\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\f\u0010=\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BackdropScaffoldState;", "rememberBackdropScaffoldState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "gesturesEnabled", "Landroidx/compose/ui/unit/Dp;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "Landroidx/compose/ui/graphics/Color;", "backLayerBackgroundColor", "backLayerContentColor", "Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "BackdropScaffold-BZszfkY", "(Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLv3/q;Landroidx/compose/runtime/Composer;III)V", "BackdropScaffold", TypedValues.Custom.S_COLOR, "onDismiss", "visible", "Scrim-3J-VO9M", "(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", TypedValues.AttributesType.S_TARGET, "content", "BackLayerTransition", "(Landroidx/compose/material/BackdropValue;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/UiComposable;", "backLayer", "Landroidx/compose/ui/unit/Constraints;", "calculateBackLayerConstraints", "Lkotlin/Function2;", "frontLayer", "BackdropStack", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/l;Lv3/r;Landroidx/compose/runtime/Composer;I)V", "AnimationSlideOffset", "F", "alpha", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,524:1\n25#2:525\n456#2,8:573\n464#2,3:587\n456#2,8:608\n464#2,3:622\n467#2,3:626\n456#2,8:648\n464#2,3:662\n467#2,3:666\n467#2,3:671\n1116#3,6:526\n1116#3,6:535\n1116#3,6:542\n1116#3,6:548\n1116#3,6:676\n74#4:532\n74#4:534\n74#4:554\n1#5:533\n646#6:541\n67#7,7:555\n74#7:590\n68#7,6:591\n74#7:625\n78#7:630\n68#7,6:631\n74#7:665\n78#7:670\n78#7:675\n79#8,11:562\n79#8,11:597\n92#8:629\n79#8,11:637\n92#8:669\n92#8:674\n3737#9,6:581\n3737#9,6:616\n3737#9,6:656\n81#10:682\n81#10:683\n154#11:684\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n174#1:525\n432#1:573,8\n432#1:587,3\n433#1:608,8\n433#1:622,3\n433#1:626,3\n441#1:648,8\n441#1:662,3\n441#1:666,3\n432#1:671,3\n174#1:526,6\n291#1:535,6\n396#1:542,6\n404#1:548,6\n460#1:676,6\n278#1:532\n279#1:534\n427#1:554\n390#1:541\n432#1:555,7\n432#1:590\n433#1:591,6\n433#1:625\n433#1:630\n441#1:631,6\n441#1:665\n441#1:670\n432#1:675\n432#1:562,11\n433#1:597,11\n433#1:629\n441#1:637,11\n441#1:669\n432#1:674\n432#1:581,6\n433#1:616,6\n441#1:656,6\n391#1:682\n424#1:683\n523#1:684\n*E\n"})
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m6044constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BackLayerTransition(BackdropValue backdropValue, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        float f5;
        float H;
        float H2;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(backdropValue)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        int i10 = i6;
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i10, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:420)");
            }
            if (backdropValue == BackdropValue.Revealed) {
                f5 = 0.0f;
            } else {
                f5 = 2.0f;
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f5, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
            float mo304toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(AnimationSlideOffset);
            float f6 = 1;
            H = u.H(BackLayerTransition$lambda$7(animateFloatAsState) - f6, 0.0f, 1.0f);
            H2 = u.H(f6 - BackLayerTransition$lambda$7(animateFloatAsState), 0.0f, 1.0f);
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m3894graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, H), 0.0f, 0.0f, H, 0.0f, (f6 - H) * mo304toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m3894graphicsLayerAp8cVGQ$default);
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
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i10 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m3894graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, H2), 0.0f, 0.0f, H2, 0.0f, (f6 - H2) * (-mo304toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor3 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m3894graphicsLayerAp8cVGQ$default2);
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
            Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar2.invoke(startRestartGroup, Integer.valueOf((i10 >> 6) & 14));
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
            endRestartGroup.updateScope(new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, pVar, pVar2, i5));
        }
    }

    private static final float BackLayerTransition$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1210BackdropScaffoldBZszfkY(@p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, @p4.m androidx.compose.material.BackdropScaffoldState r40, boolean r41, float r42, float r43, boolean r44, boolean r45, long r46, long r48, @p4.m androidx.compose.ui.graphics.Shape r50, float r51, long r52, long r54, long r56, @p4.m v3.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r58, @p4.m androidx.compose.runtime.Composer r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m1210BackdropScaffoldBZszfkY(v3.p, v3.p, v3.p, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, v3.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    public static final void BackdropStack(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, l<? super Constraints, Constraints> lVar, r<? super Constraints, ? super Float, ? super Composer, ? super Integer, r2> rVar, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(rVar)) {
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
                ComposerKt.traceEventStart(-1248995194, i6, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:458)");
            }
            startRestartGroup.startReplaceableGroup(1686364737);
            boolean changedInstance = startRestartGroup.changedInstance(pVar) | startRestartGroup.changedInstance(lVar) | startRestartGroup.changedInstance(rVar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BackdropScaffoldKt$BackdropStack$1$1(pVar, lVar, rVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) rememberedValue, startRestartGroup, i6 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$BackdropStack$2(modifier, pVar, lVar, rVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1211Scrim3JVO9M(long j5, a<r2> aVar, boolean z4, Composer composer, int i5) {
        int i6;
        boolean z5;
        float f5;
        Modifier modifier;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(j5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i6, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:388)");
            }
            if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (z4) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f5, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                if (z4) {
                    Modifier.Companion companion = Modifier.Companion;
                    r2 r2Var = r2.f19517a;
                    startRestartGroup.startReplaceableGroup(1686362685);
                    boolean changedInstance = startRestartGroup.changedInstance(aVar);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SuspendingPointerInputFilterKt.pointerInput(companion, r2Var, (p<? super PointerInputScope, ? super d<? super r2>, ? extends Object>) rememberedValue);
                } else {
                    modifier = Modifier.Companion;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                startRestartGroup.startReplaceableGroup(1686362888);
                boolean changed = startRestartGroup.changed(j5) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new BackdropScaffoldKt$Scrim$1$1(j5, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (l) rememberedValue2, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BackdropScaffoldKt$Scrim$2(j5, aVar, z4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    @p4.l
    @Composable
    @ExperimentalMaterialApi
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@p4.l BackdropValue backdropValue, @m AnimationSpec<Float> animationSpec, @m l<? super BackdropValue, Boolean> lVar, @m SnackbarHostState snackbarHostState, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-862178912);
        if ((i6 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i6 & 4) != 0) {
            lVar = BackdropScaffoldKt$rememberBackdropScaffoldState$1.INSTANCE;
        }
        if ((i6 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i5, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:174)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m3351rememberSaveable(new Object[]{animationSpec, lVar, snackbarHostState}, (Saver) BackdropScaffoldState.Companion.Saver(animationSpec, lVar, snackbarHostState), (String) null, (a) new BackdropScaffoldKt$rememberBackdropScaffoldState$3(backdropValue, animationSpec, lVar, snackbarHostState), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }
}
