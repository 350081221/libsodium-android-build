package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/Composer;", "nc", "", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComposableLambdaImpl$invoke$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $changed;
    final /* synthetic */ Object $p1;
    final /* synthetic */ Object $p2;
    final /* synthetic */ Object $p3;
    final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$3(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i5) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@l Composer composer, int i5) {
        this.this$0.invoke(this.$p1, this.$p2, this.$p3, composer, RecomposeScopeImplKt.updateChangedFlags(this.$changed) | 1);
    }
}
