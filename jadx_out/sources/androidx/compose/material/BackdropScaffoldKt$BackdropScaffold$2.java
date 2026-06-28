package androidx.compose.material;

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
public final class BackdropScaffoldKt$BackdropScaffold$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $appBar;
    final /* synthetic */ long $backLayerBackgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $backLayerContent;
    final /* synthetic */ long $backLayerContentColor;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ Shape $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ boolean $persistentAppBar;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ q<SnackbarHostState, Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$2(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z4, float f5, float f6, boolean z5, boolean z6, long j5, long j6, Shape shape, float f7, long j7, long j8, long j9, q<? super SnackbarHostState, ? super Composer, ? super Integer, r2> qVar, int i5, int i6, int i7) {
        super(2);
        this.$appBar = pVar;
        this.$backLayerContent = pVar2;
        this.$frontLayerContent = pVar3;
        this.$modifier = modifier;
        this.$scaffoldState = backdropScaffoldState;
        this.$gesturesEnabled = z4;
        this.$peekHeight = f5;
        this.$headerHeight = f6;
        this.$persistentAppBar = z5;
        this.$stickyFrontLayer = z6;
        this.$backLayerBackgroundColor = j5;
        this.$backLayerContentColor = j6;
        this.$frontLayerShape = shape;
        this.$frontLayerElevation = f7;
        this.$frontLayerBackgroundColor = j7;
        this.$frontLayerContentColor = j8;
        this.$frontLayerScrimColor = j9;
        this.$snackbarHost = qVar;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BackdropScaffoldKt.m1210BackdropScaffoldBZszfkY(this.$appBar, this.$backLayerContent, this.$frontLayerContent, this.$modifier, this.$scaffoldState, this.$gesturesEnabled, this.$peekHeight, this.$headerHeight, this.$persistentAppBar, this.$stickyFrontLayer, this.$backLayerBackgroundColor, this.$backLayerContentColor, this.$frontLayerShape, this.$frontLayerElevation, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerScrimColor, this.$snackbarHost, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
