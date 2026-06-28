package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropStack$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $backLayer;
    final /* synthetic */ l<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ r<Constraints, Float, Composer, Integer, r2> $frontLayer;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropStack$2(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, l<? super Constraints, Constraints> lVar, r<? super Constraints, ? super Float, ? super Composer, ? super Integer, r2> rVar, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$frontLayer = rVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BackdropScaffoldKt.BackdropStack(this.$modifier, this.$backLayer, this.$calculateBackLayerConstraints, this.$frontLayer, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
