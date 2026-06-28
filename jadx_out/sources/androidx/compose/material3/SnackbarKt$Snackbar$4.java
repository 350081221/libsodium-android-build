package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $actionColor;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ SnackbarData $snackbarData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$4(SnackbarData snackbarData, Modifier modifier, boolean z4, Shape shape, long j5, long j6, long j7, long j8, long j9, int i5, int i6) {
        super(2);
        this.$snackbarData = snackbarData;
        this.$modifier = modifier;
        this.$actionOnNewLine = z4;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$actionColor = j7;
        this.$actionContentColor = j8;
        this.$dismissActionContentColor = j9;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SnackbarKt.m2221SnackbarsDKtq54(this.$snackbarData, this.$modifier, this.$actionOnNewLine, this.$shape, this.$containerColor, this.$contentColor, this.$actionColor, this.$actionContentColor, this.$dismissActionContentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
