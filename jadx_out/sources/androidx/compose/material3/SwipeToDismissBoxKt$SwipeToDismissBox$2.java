package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissBoxKt$SwipeToDismissBox$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.q<RowScope, Composer, Integer, r2> $backgroundContent;
    final /* synthetic */ v3.q<RowScope, Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enableDismissFromEndToStart;
    final /* synthetic */ boolean $enableDismissFromStartToEnd;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SwipeToDismissBoxState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissBoxKt$SwipeToDismissBox$2(SwipeToDismissBoxState swipeToDismissBoxState, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, boolean z4, boolean z5, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar2, int i5, int i6) {
        super(2);
        this.$state = swipeToDismissBoxState;
        this.$backgroundContent = qVar;
        this.$modifier = modifier;
        this.$enableDismissFromStartToEnd = z4;
        this.$enableDismissFromEndToStart = z5;
        this.$content = qVar2;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SwipeToDismissBoxKt.SwipeToDismissBox(this.$state, this.$backgroundContent, this.$modifier, this.$enableDismissFromStartToEnd, this.$enableDismissFromEndToStart, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
