package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
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
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$4(q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, p<? super Composer, ? super Integer, r2> pVar, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar2, p<? super Composer, ? super Integer, r2> pVar2, int i5, boolean z4, Shape shape, float f5, long j5, long j6, float f6, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar3, boolean z5, Shape shape2, float f7, long j7, long j8, long j9, long j10, long j11, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar4, int i6, int i7, int i8, int i9) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = modifier;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = pVar;
        this.$snackbarHost = qVar2;
        this.$floatingActionButton = pVar2;
        this.$floatingActionButtonPosition = i5;
        this.$sheetGesturesEnabled = z4;
        this.$sheetShape = shape;
        this.$sheetElevation = f5;
        this.$sheetBackgroundColor = j5;
        this.$sheetContentColor = j6;
        this.$sheetPeekHeight = f6;
        this.$drawerContent = qVar3;
        this.$drawerGesturesEnabled = z5;
        this.$drawerShape = shape2;
        this.$drawerElevation = f7;
        this.$drawerBackgroundColor = j7;
        this.$drawerContentColor = j8;
        this.$drawerScrimColor = j9;
        this.$backgroundColor = j10;
        this.$contentColor = j11;
        this.$content = qVar4;
        this.$$changed = i6;
        this.$$changed1 = i7;
        this.$$changed2 = i8;
        this.$$default = i9;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BottomSheetScaffoldKt.m1233BottomSheetScaffoldbGncdBI(this.$sheetContent, this.$modifier, this.$scaffoldState, this.$topBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$sheetGesturesEnabled, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetPeekHeight, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed2), this.$$default);
    }
}
