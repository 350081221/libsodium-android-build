package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt$ProvideTextStyleFromToken$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ TypographyKeyTokens $textToken;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ProvideTextStyleFromToken$1(long j5, TypographyKeyTokens typographyKeyTokens, v3.p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$color = j5;
        this.$textToken = typographyKeyTokens;
        this.$content = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ListItemKt.m1967ProvideTextStyleFromToken3JVO9M(this.$color, this.$textToken, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
