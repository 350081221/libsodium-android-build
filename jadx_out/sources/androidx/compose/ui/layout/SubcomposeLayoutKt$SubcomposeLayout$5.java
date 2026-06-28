package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$5 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubcomposeLayoutKt$SubcomposeLayout$5(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, int i5, int i6) {
        super(2);
        this.$state = subcomposeLayoutState;
        this.$modifier = modifier;
        this.$measurePolicy = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SubcomposeLayoutKt.SubcomposeLayout(this.$state, this.$modifier, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
