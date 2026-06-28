package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$decoratedHeadlineContent$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $headlineContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$decoratedHeadlineContent$1(ListItemColors listItemColors, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$colors = listItemColors;
        this.$headlineContent = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403249643, i5, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:94)");
        }
        ListItemKt.m1967ProvideTextStyleFromToken3JVO9M(this.$colors.m1959headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), this.$headlineContent, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
