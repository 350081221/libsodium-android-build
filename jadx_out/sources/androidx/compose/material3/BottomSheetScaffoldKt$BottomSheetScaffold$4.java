package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
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
    final /* synthetic */ v3.q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$4(v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f5, float f6, Shape shape, long j5, long j6, float f7, float f8, v3.p<? super Composer, ? super Integer, r2> pVar, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar2, long j7, long j8, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar3, int i5, int i6, int i7) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = modifier;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$sheetPeekHeight = f5;
        this.$sheetMaxWidth = f6;
        this.$sheetShape = shape;
        this.$sheetContainerColor = j5;
        this.$sheetContentColor = j6;
        this.$sheetTonalElevation = f7;
        this.$sheetShadowElevation = f8;
        this.$sheetDragHandle = pVar;
        this.$sheetSwipeEnabled = z4;
        this.$topBar = pVar2;
        this.$snackbarHost = qVar2;
        this.$containerColor = j7;
        this.$contentColor = j8;
        this.$content = qVar3;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        BottomSheetScaffoldKt.m1578BottomSheetScaffoldsdMYb0k(this.$sheetContent, this.$modifier, this.$scaffoldState, this.$sheetPeekHeight, this.$sheetMaxWidth, this.$sheetShape, this.$sheetContainerColor, this.$sheetContentColor, this.$sheetTonalElevation, this.$sheetShadowElevation, this.$sheetDragHandle, this.$sheetSwipeEnabled, this.$topBar, this.$snackbarHost, this.$containerColor, this.$contentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
