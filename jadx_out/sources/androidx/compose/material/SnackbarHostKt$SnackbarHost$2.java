package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostKt$SnackbarHost$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SnackbarHostState $hostState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ q<SnackbarData, Composer, Integer, r2> $snackbar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarHostKt$SnackbarHost$2(SnackbarHostState snackbarHostState, Modifier modifier, q<? super SnackbarData, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$hostState = snackbarHostState;
        this.$modifier = modifier;
        this.$snackbar = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SnackbarHostKt.SnackbarHost(this.$hostState, this.$modifier, this.$snackbar, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
