package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt$ListItemLayout$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.p<Composer, Integer, r2> $headline;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leading;
    final /* synthetic */ v3.p<Composer, Integer, r2> $overline;
    final /* synthetic */ v3.p<Composer, Integer, r2> $supporting;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItemLayout$2(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, int i5) {
        super(2);
        this.$leading = pVar;
        this.$trailing = pVar2;
        this.$headline = pVar3;
        this.$overline = pVar4;
        this.$supporting = pVar5;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ListItemKt.ListItemLayout(this.$leading, this.$trailing, this.$headline, this.$overline, this.$supporting, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
