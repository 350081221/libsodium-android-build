package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,812:1\n1116#2,6:813\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$2\n*L\n508#1:813,6\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "layoutHeight", "Lkotlin/r2;", "invoke", "(ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,812:1\n36#2:813\n1116#3,6:814\n1116#3,6:820\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$2$1\n*L\n474#1:813\n474#1:814,6\n487#1:820,6\n*E\n"})
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements q<Integer, Composer, Integer, r2> {
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ long $sheetBackgroundColor;
        final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $sheetContent;
        final /* synthetic */ long $sheetContentColor;
        final /* synthetic */ float $sheetElevation;
        final /* synthetic */ boolean $sheetGesturesEnabled;
        final /* synthetic */ float $sheetPeekHeight;
        final /* synthetic */ Shape $sheetShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z4, BottomSheetScaffoldState bottomSheetScaffoldState, float f5, float f6, Shape shape, float f7, long j5, long j6, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
            super(3);
            this.$sheetGesturesEnabled = z4;
            this.$scaffoldState = bottomSheetScaffoldState;
            this.$sheetPeekHeight = f5;
            this.$peekHeightPx = f6;
            this.$sheetShape = shape;
            this.$sheetElevation = f7;
            this.$sheetBackgroundColor = j5;
            this.$sheetContentColor = j6;
            this.$sheetContent = qVar;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(Integer num, Composer composer, Integer num2) {
            invoke(num.intValue(), composer, num2.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(int i5, @m Composer composer, int i6) {
            int i7;
            Modifier modifier;
            if ((i6 & 14) == 0) {
                i7 = i6 | (composer.changed(i5) ? 4 : 2);
            } else {
                i7 = i6;
            }
            if ((i7 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1900337132, i7, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:470)");
            }
            composer.startReplaceableGroup(-816851224);
            if (this.$sheetGesturesEnabled) {
                Modifier.Companion companion = Modifier.Companion;
                AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = this.$scaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release();
                BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(anchoredDraggableState$material_release);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                modifier = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) rememberedValue, null, 2, null);
            } else {
                modifier = Modifier.Companion;
            }
            composer.endReplaceableGroup();
            BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
            Modifier m593requiredHeightInVpY3zN4$default = SizeKt.m593requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), this.$sheetPeekHeight, 0.0f, 2, null);
            boolean z4 = this.$sheetGesturesEnabled;
            composer.startReplaceableGroup(1938009097);
            boolean changed2 = composer.changed(i5) | composer.changed(this.$peekHeightPx);
            float f5 = this.$peekHeightPx;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1(i5, f5);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            BottomSheetScaffoldKt.m1231BottomSheet0cLKjW4(bottomSheetState, z4, (l) rememberedValue2, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, m593requiredHeightInVpY3zN4$default, this.$sheetContent, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar, BottomSheetScaffoldState bottomSheetScaffoldState) {
            super(2);
            this.$snackbarHost = qVar;
            this.$scaffoldState = bottomSheetScaffoldState;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1011922215, i5, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:505)");
            }
            this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(BottomSheetScaffoldState bottomSheetScaffoldState, p<? super Composer, ? super Integer, r2> pVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, float f5, int i5, boolean z4, float f6, Shape shape, float f7, long j5, long j6, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar2, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar3) {
        super(2);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$floatingActionButton = pVar2;
        this.$sheetPeekHeight = f5;
        this.$floatingActionButtonPosition = i5;
        this.$sheetGesturesEnabled = z4;
        this.$peekHeightPx = f6;
        this.$sheetShape = shape;
        this.$sheetElevation = f7;
        this.$sheetBackgroundColor = j5;
        this.$sheetContentColor = j6;
        this.$sheetContent = qVar2;
        this.$snackbarHost = qVar3;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-131096268, i5, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:466)");
        }
        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        p<Composer, Integer, r2> pVar = this.$topBar;
        q<PaddingValues, Composer, Integer, r2> qVar = this.$content;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1900337132, true, new AnonymousClass1(this.$sheetGesturesEnabled, this.$scaffoldState, this.$sheetPeekHeight, this.$peekHeightPx, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetContent));
        p<Composer, Integer, r2> pVar2 = this.$floatingActionButton;
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, -1011922215, true, new AnonymousClass2(this.$snackbarHost, this.$scaffoldState));
        float f5 = this.$sheetPeekHeight;
        int i6 = this.$floatingActionButtonPosition;
        composer.startReplaceableGroup(1938010078);
        boolean changed = composer.changed(this.$scaffoldState);
        BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$2$3$1(bottomSheetScaffoldState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldKt.m1234BottomSheetScaffoldLayoutKCBPh4w(pVar, qVar, composableLambda, pVar2, composableLambda2, f5, i6, (a) rememberedValue, bottomSheetState, composer, 24960);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
