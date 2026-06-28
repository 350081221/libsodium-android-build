package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerDialog_androidKt$DatePickerDialog$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $confirmButton;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dismissButton;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerDialog_androidKt$DatePickerDialog$2(v3.a<r2> aVar, v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar2, Shape shape, float f5, DatePickerColors datePickerColors, DialogProperties dialogProperties, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$confirmButton = pVar;
        this.$modifier = modifier;
        this.$dismissButton = pVar2;
        this.$shape = shape;
        this.$tonalElevation = f5;
        this.$colors = datePickerColors;
        this.$properties = dialogProperties;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerDialog_androidKt.m1805DatePickerDialogGmEhDVc(this.$onDismissRequest, this.$confirmButton, this.$modifier, this.$dismissButton, this.$shape, this.$tonalElevation, this.$colors, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
