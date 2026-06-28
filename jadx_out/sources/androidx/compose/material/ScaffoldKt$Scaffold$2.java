package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
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
public final class ScaffoldKt$Scaffold$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$2(WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar3, int i5, boolean z4, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar2, boolean z5, Shape shape, float f5, long j5, long j6, long j7, long j8, long j9, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar3, int i6, int i7, int i8) {
        super(2);
        this.$contentWindowInsets = windowInsets;
        this.$modifier = modifier;
        this.$scaffoldState = scaffoldState;
        this.$topBar = pVar;
        this.$bottomBar = pVar2;
        this.$snackbarHost = qVar;
        this.$floatingActionButton = pVar3;
        this.$floatingActionButtonPosition = i5;
        this.$isFloatingActionButtonDocked = z4;
        this.$drawerContent = qVar2;
        this.$drawerGesturesEnabled = z5;
        this.$drawerShape = shape;
        this.$drawerElevation = f5;
        this.$drawerBackgroundColor = j5;
        this.$drawerContentColor = j6;
        this.$drawerScrimColor = j7;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$content = qVar3;
        this.$$changed = i6;
        this.$$changed1 = i7;
        this.$$default = i8;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ScaffoldKt.m1421Scaffoldu4IkXBM(this.$contentWindowInsets, this.$modifier, this.$scaffoldState, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$isFloatingActionButtonDocked, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
