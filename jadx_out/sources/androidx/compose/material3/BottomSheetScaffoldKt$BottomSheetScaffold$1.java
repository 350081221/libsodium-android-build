package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "layoutHeight", "Lkotlin/r2;", "invoke", "(ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,386:1\n1116#2,6:387\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1\n*L\n141#1:387,6\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends kotlin.jvm.internal.n0 implements v3.q<Integer, Composer, Integer, r2> {
    final /* synthetic */ int $peekHeightPx;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetContainerColor;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $sheetDragHandle;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ float $sheetShadowElevation;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ float $sheetTonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, int i5, float f5, float f6, boolean z4, Shape shape, long j5, long j6, float f7, float f8, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(3);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$peekHeightPx = i5;
        this.$sheetPeekHeight = f5;
        this.$sheetMaxWidth = f6;
        this.$sheetSwipeEnabled = z4;
        this.$sheetShape = shape;
        this.$sheetContainerColor = j5;
        this.$sheetContentColor = j6;
        this.$sheetTonalElevation = f7;
        this.$sheetShadowElevation = f8;
        this.$sheetDragHandle = pVar;
        this.$sheetContent = qVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Integer num, Composer composer, Integer num2) {
        invoke(num.intValue(), composer, num2.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(int i5, @p4.m Composer composer, int i6) {
        int i7;
        if ((i6 & 6) == 0) {
            i7 = i6 | (composer.changed(i5) ? 4 : 2);
        } else {
            i7 = i6;
        }
        if ((i7 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-680109608, i7, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:135)");
        }
        SheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        composer.startReplaceableGroup(1237684821);
        boolean changed = ((i7 & 14) == 4) | composer.changed(this.$scaffoldState) | composer.changed(this.$peekHeightPx);
        BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        int i8 = this.$peekHeightPx;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1(bottomSheetScaffoldState, i5, i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldKt.m1580StandardBottomSheetXcniZvE(bottomSheetState, (v3.l) rememberedValue, this.$sheetPeekHeight, this.$sheetMaxWidth, this.$sheetSwipeEnabled, this.$sheetShape, this.$sheetContainerColor, this.$sheetContentColor, this.$sheetTonalElevation, this.$sheetShadowElevation, this.$sheetDragHandle, this.$sheetContent, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
