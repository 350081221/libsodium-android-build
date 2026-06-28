package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheet$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.a<r2> $animateToDismiss;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dragHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ v3.l<Float, r2> $settleToDismiss;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n125#2:703\n1116#3,6:704\n1116#3,6:710\n1116#3,6:716\n1116#3,6:722\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1\n*L\n191#1:703\n197#1:704,6\n198#1:710,6\n207#1:716,6\n220#1:722,6\n*E\n"})
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.q<BoxWithConstraintsScope, Composer, Integer, r2> {
        final /* synthetic */ v3.a<r2> $animateToDismiss;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ v3.p<Composer, Integer, r2> $dragHandle;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ s0 $scope;
        final /* synthetic */ long $scrimColor;
        final /* synthetic */ v3.l<Float, r2> $settleToDismiss;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ float $sheetMaxWidth;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ float $tonalElevation;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,702:1\n74#2,6:703\n80#2:737\n84#2:791\n78#3,11:709\n78#3,11:753\n91#3:785\n91#3:790\n456#4,8:720\n464#4,3:734\n456#4,8:764\n464#4,3:778\n467#4,3:782\n467#4,3:787\n3737#5,6:728\n3737#5,6:772\n129#6:738\n131#6:739\n133#6:740\n1116#7,6:741\n68#8,6:747\n74#8:781\n78#8:786\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5\n*L\n231#1:703,6\n231#1:737\n231#1:791\n231#1:709,11\n237#1:753,11\n237#1:785\n231#1:790\n231#1:720,8\n231#1:734,3\n237#1:764,8\n237#1:778,3\n237#1:782,3\n231#1:787,3\n231#1:728,6\n237#1:772,6\n234#1:738\n235#1:739\n236#1:740\n240#1:741,6\n237#1:747,6\n237#1:781\n237#1:786\n*E\n"})
        /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ v3.a<r2> $animateToDismiss;
            final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
            final /* synthetic */ v3.p<Composer, Integer, r2> $dragHandle;
            final /* synthetic */ s0 $scope;
            final /* synthetic */ SheetState $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(v3.p<? super Composer, ? super Integer, r2> pVar, SheetState sheetState, v3.a<r2> aVar, s0 s0Var, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
                super(2);
                this.$dragHandle = pVar;
                this.$sheetState = sheetState;
                this.$animateToDismiss = aVar;
                this.$scope = s0Var;
                this.$content = qVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1096570852, i5, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:230)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                v3.p<Composer, Integer, r2> pVar = this.$dragHandle;
                SheetState sheetState = this.$sheetState;
                v3.a<r2> aVar = this.$animateToDismiss;
                s0 s0Var = this.$scope;
                v3.q<ColumnScope, Composer, Integer, r2> qVar = this.$content;
                composer.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion3.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
                Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-11289086);
                if (pVar != null) {
                    Strings.Companion companion4 = Strings.Companion;
                    String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer, 0);
                    String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer, 0);
                    String m2294getStringNWtq283 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer, 0);
                    Modifier align = columnScopeInstance.align(companion, companion2.getCenterHorizontally());
                    composer.startReplaceableGroup(-11288530);
                    boolean changed = composer.changed(sheetState) | composer.changed(m2294getStringNWtq282) | composer.changed(aVar) | composer.changed(m2294getStringNWtq283) | composer.changedInstance(s0Var) | composer.changed(m2294getStringNWtq28);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1(sheetState, m2294getStringNWtq282, m2294getStringNWtq283, m2294getStringNWtq28, aVar, s0Var);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Modifier semantics = SemanticsModifierKt.semantics(align, true, (v3.l) rememberedValue);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                    v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(semantics);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
                    Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    pVar.invoke(composer, 0);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
                qVar.invoke(columnScopeInstance, composer, 6);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(long j5, v3.a<r2> aVar, SheetState sheetState, Modifier modifier, float f5, v3.l<? super Float, r2> lVar, Shape shape, long j6, long j7, float f6, v3.p<? super Composer, ? super Integer, r2> pVar, s0 s0Var, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
            super(3);
            this.$scrimColor = j5;
            this.$animateToDismiss = aVar;
            this.$sheetState = sheetState;
            this.$modifier = modifier;
            this.$sheetMaxWidth = f5;
            this.$settleToDismiss = lVar;
            this.$shape = shape;
            this.$containerColor = j6;
            this.$contentColor = j7;
            this.$tonalElevation = f6;
            this.$dragHandle = pVar;
            this.$scope = s0Var;
            this.$content = qVar;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l BoxWithConstraintsScope boxWithConstraintsScope, @p4.m Composer composer, int i5) {
            int i6;
            Modifier modalBottomSheetAnchors;
            if ((i5 & 6) == 0) {
                i6 = i5 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008499679, i6, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:184)");
            }
            int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
            ModalBottomSheet_androidKt.m2000Scrim3JVO9M(this.$scrimColor, this.$animateToDismiss, this.$sheetState.getTargetValue() != SheetValue.Hidden, composer, 0);
            Strings.Companion companion = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_bottom_sheet_pane_title), composer, 0);
            Modifier align = boxWithConstraintsScope.align(SizeKt.fillMaxWidth$default(SizeKt.m609widthInVpY3zN4$default(this.$modifier, 0.0f, this.$sheetMaxWidth, 1, null), 0.0f, 1, null), Alignment.Companion.getTopCenter());
            composer.startReplaceableGroup(-1482644208);
            boolean changed = composer.changed(m2294getStringNWtq28);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$1$1(m2294getStringNWtq28);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(align, false, (v3.l) rememberedValue, 1, null);
            composer.startReplaceableGroup(-1482644143);
            boolean changed2 = composer.changed(this.$sheetState);
            SheetState sheetState = this.$sheetState;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$2$1(sheetState);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier offset = OffsetKt.offset(semantics$default, (v3.l) rememberedValue2);
            composer.startReplaceableGroup(-1482643839);
            boolean changed3 = composer.changed(this.$sheetState);
            SheetState sheetState2 = this.$sheetState;
            v3.l<Float, r2> lVar = this.$settleToDismiss;
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, lVar);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(offset, (NestedScrollConnection) rememberedValue3, null, 2, null);
            DraggableState draggableState$material3_release = this.$sheetState.getAnchoredDraggableState$material3_release().getDraggableState$material3_release();
            Orientation orientation = Orientation.Vertical;
            boolean isVisible = this.$sheetState.isVisible();
            boolean isAnimationRunning = this.$sheetState.getAnchoredDraggableState$material3_release().isAnimationRunning();
            composer.startReplaceableGroup(-1482643097);
            boolean changed4 = composer.changed(this.$settleToDismiss);
            v3.l<Float, r2> lVar2 = this.$settleToDismiss;
            Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1(lVar2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            modalBottomSheetAnchors = ModalBottomSheet_androidKt.modalBottomSheetAnchors(DraggableKt.draggable$default(nestedScroll$default, draggableState$material3_release, orientation, isVisible, null, isAnimationRunning, null, (v3.q) rememberedValue4, false, 168, null), this.$sheetState, m5999getMaxHeightimpl);
            SurfaceKt.m2304SurfaceT9BRK9s(modalBottomSheetAnchors, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1096570852, true, new AnonymousClass5(this.$dragHandle, this.$sheetState, this.$animateToDismiss, this.$scope, this.$content)), composer, 12582912, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheet_androidKt$ModalBottomSheet$3(long j5, v3.a<r2> aVar, SheetState sheetState, Modifier modifier, float f5, v3.l<? super Float, r2> lVar, Shape shape, long j6, long j7, float f6, v3.p<? super Composer, ? super Integer, r2> pVar, s0 s0Var, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$scrimColor = j5;
        this.$animateToDismiss = aVar;
        this.$sheetState = sheetState;
        this.$modifier = modifier;
        this.$sheetMaxWidth = f5;
        this.$settleToDismiss = lVar;
        this.$shape = shape;
        this.$containerColor = j6;
        this.$contentColor = j7;
        this.$tonalElevation = f6;
        this.$dragHandle = pVar;
        this.$scope = s0Var;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1311525899, i5, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:183)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer, 2008499679, true, new AnonymousClass1(this.$scrimColor, this.$animateToDismiss, this.$sheetState, this.$modifier, this.$sheetMaxWidth, this.$settleToDismiss, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$dragHandle, this.$scope, this.$content)), composer, 3078, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
