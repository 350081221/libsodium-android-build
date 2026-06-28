package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt$AlertDialog$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.p<Composer, Integer, r2> $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dismissButton;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$2(v3.a<r2> aVar, v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, Shape shape, long j5, long j6, long j7, long j8, float f5, DialogProperties dialogProperties, int i5, int i6, int i7) {
        super(2);
        this.$onDismissRequest = aVar;
        this.$confirmButton = pVar;
        this.$modifier = modifier;
        this.$dismissButton = pVar2;
        this.$icon = pVar3;
        this.$title = pVar4;
        this.$text = pVar5;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$iconContentColor = j6;
        this.$titleContentColor = j7;
        this.$textContentColor = j8;
        this.$tonalElevation = f5;
        this.$properties = dialogProperties;
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
        AndroidAlertDialog_androidKt.m1552AlertDialogOix01E0(this.$onDismissRequest, this.$confirmButton, this.$modifier, this.$dismissButton, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$iconContentColor, this.$titleContentColor, this.$textContentColor, this.$tonalElevation, this.$properties, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
