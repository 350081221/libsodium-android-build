package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$NewLineButtonSnackbar$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.p<Composer, Integer, r2> $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ TextStyle $actionTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$NewLineButtonSnackbar$2(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, TextStyle textStyle, long j5, long j6, int i5) {
        super(2);
        this.$text = pVar;
        this.$action = pVar2;
        this.$dismissAction = pVar3;
        this.$actionTextStyle = textStyle;
        this.$actionContentColor = j5;
        this.$dismissActionContentColor = j6;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SnackbarKt.m2218NewLineButtonSnackbarkKq0p4A(this.$text, this.$action, this.$dismissAction, this.$actionTextStyle, this.$actionContentColor, this.$dismissActionContentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
