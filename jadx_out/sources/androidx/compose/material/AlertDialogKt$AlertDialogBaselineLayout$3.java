package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogBaselineLayout$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $text;
    final /* synthetic */ ColumnScope $this_AlertDialogBaselineLayout;
    final /* synthetic */ p<Composer, Integer, r2> $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogBaselineLayout$3(ColumnScope columnScope, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, int i5) {
        super(2);
        this.$this_AlertDialogBaselineLayout = columnScope;
        this.$title = pVar;
        this.$text = pVar2;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AlertDialogKt.AlertDialogBaselineLayout(this.$this_AlertDialogBaselineLayout, this.$title, this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
