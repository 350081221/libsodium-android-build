package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ v3.p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$3(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, int i5, long j5, long j6, WindowInsets windowInsets, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, int i6, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$topBar = pVar;
        this.$bottomBar = pVar2;
        this.$snackbarHost = pVar3;
        this.$floatingActionButton = pVar4;
        this.$floatingActionButtonPosition = i5;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$contentWindowInsets = windowInsets;
        this.$content = qVar;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ScaffoldKt.m2107ScaffoldTvnljyQ(this.$modifier, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$containerColor, this.$contentColor, this.$contentWindowInsets, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
