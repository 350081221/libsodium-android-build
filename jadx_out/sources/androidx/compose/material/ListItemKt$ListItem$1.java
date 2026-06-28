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
public final class ListItemKt$ListItem$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ p<Composer, Integer, r2> $overlineText;
    final /* synthetic */ p<Composer, Integer, r2> $secondaryText;
    final /* synthetic */ boolean $singleLineSecondaryText;
    final /* synthetic */ p<Composer, Integer, r2> $text;
    final /* synthetic */ p<Composer, Integer, r2> $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$1(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, boolean z4, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, p<? super Composer, ? super Integer, r2> pVar5, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$icon = pVar;
        this.$secondaryText = pVar2;
        this.$singleLineSecondaryText = z4;
        this.$overlineText = pVar3;
        this.$trailing = pVar4;
        this.$text = pVar5;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ListItemKt.ListItem(this.$modifier, this.$icon, this.$secondaryText, this.$singleLineSecondaryText, this.$overlineText, this.$trailing, this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
