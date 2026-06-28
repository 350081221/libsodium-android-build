package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreeLine$ListItem$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ p<Composer, Integer, r2> $overlineText;
    final /* synthetic */ p<Composer, Integer, r2> $secondaryText;
    final /* synthetic */ p<Composer, Integer, r2> $text;
    final /* synthetic */ ThreeLine $tmp0_rcvr;
    final /* synthetic */ p<Composer, Integer, r2> $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThreeLine$ListItem$2(ThreeLine threeLine, Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, p<? super Composer, ? super Integer, r2> pVar5, int i5, int i6) {
        super(2);
        this.$tmp0_rcvr = threeLine;
        this.$modifier = modifier;
        this.$icon = pVar;
        this.$text = pVar2;
        this.$secondaryText = pVar3;
        this.$overlineText = pVar4;
        this.$trailing = pVar5;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        this.$tmp0_rcvr.ListItem(this.$modifier, this.$icon, this.$text, this.$secondaryText, this.$overlineText, this.$trailing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
