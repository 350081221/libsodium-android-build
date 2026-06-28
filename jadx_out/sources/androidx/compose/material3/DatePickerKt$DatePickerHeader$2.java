package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$DatePickerHeader$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ long $headlineContentColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ long $titleContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$DatePickerHeader$2(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, long j5, long j6, float f5, v3.p<? super Composer, ? super Integer, r2> pVar2, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$title = pVar;
        this.$titleContentColor = j5;
        this.$headlineContentColor = j6;
        this.$minHeight = f5;
        this.$content = pVar2;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        DatePickerKt.m1807DatePickerHeaderpc5RIQQ(this.$modifier, this.$title, this.$titleContentColor, this.$headlineContentColor, this.$minHeight, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
