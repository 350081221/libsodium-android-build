package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $dismissContent;
    final /* synthetic */ l<DismissDirection, ThresholdConfig> $dismissThresholds;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$3(DismissState dismissState, Modifier modifier, Set<? extends DismissDirection> set, l<? super DismissDirection, ? extends ThresholdConfig> lVar, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar2, int i5, int i6) {
        super(2);
        this.$state = dismissState;
        this.$modifier = modifier;
        this.$directions = set;
        this.$dismissThresholds = lVar;
        this.$background = qVar;
        this.$dismissContent = qVar2;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SwipeToDismissKt.SwipeToDismiss(this.$state, this.$modifier, this.$directions, this.$dismissThresholds, this.$background, this.$dismissContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
