package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionContainerKt$SelectionContainer$5 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $children;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<Selection, r2> $onSelectionChange;
    final /* synthetic */ Selection $selection;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionContainerKt$SelectionContainer$5(Modifier modifier, Selection selection, l<? super Selection, r2> lVar, p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$selection = selection;
        this.$onSelectionChange = lVar;
        this.$children = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SelectionContainerKt.SelectionContainer(this.$modifier, this.$selection, this.$onSelectionChange, this.$children, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
