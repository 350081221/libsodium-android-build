package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.Composer;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ p<i<BackEventCompat>, d<r2>, Object> $onBack;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PredictiveBackHandlerKt$PredictiveBackHandler$3(boolean z4, p<i<BackEventCompat>, ? super d<r2>, ? extends Object> pVar, int i5, int i6) {
        super(2);
        this.$enabled = z4;
        this.$onBack = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        PredictiveBackHandlerKt.PredictiveBackHandler(this.$enabled, this.$onBack, composer, this.$$changed | 1, this.$$default);
    }
}
