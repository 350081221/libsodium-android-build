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

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $action;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$Snackbar$2(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, boolean z4, Shape shape, long j5, long j6, float f5, p<? super Composer, ? super Integer, r2> pVar2, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$action = pVar;
        this.$actionOnNewLine = z4;
        this.$shape = shape;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$elevation = f5;
        this.$content = pVar2;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SnackbarKt.m1436Snackbar7zSek6w(this.$modifier, this.$action, this.$actionOnNewLine, this.$shape, this.$backgroundColor, this.$contentColor, this.$elevation, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
