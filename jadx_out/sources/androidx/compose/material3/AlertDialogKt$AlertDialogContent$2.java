package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogContent$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $buttons;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogContent$2(v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, Shape shape, long j5, float f5, long j6, long j7, long j8, long j9, int i5, int i6, int i7) {
        super(2);
        this.$buttons = pVar;
        this.$modifier = modifier;
        this.$icon = pVar2;
        this.$title = pVar3;
        this.$text = pVar4;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$tonalElevation = f5;
        this.$buttonContentColor = j6;
        this.$iconContentColor = j7;
        this.$titleContentColor = j8;
        this.$textContentColor = j9;
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
        AlertDialogKt.m1548AlertDialogContent4hvqGtA(this.$buttons, this.$modifier, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$tonalElevation, this.$buttonContentColor, this.$iconContentColor, this.$titleContentColor, this.$textContentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
