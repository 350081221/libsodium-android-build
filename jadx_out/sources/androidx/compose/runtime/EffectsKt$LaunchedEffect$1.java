package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EffectsKt$LaunchedEffect$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<s0, d<? super r2>, Object> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EffectsKt$LaunchedEffect$1(p<? super s0, ? super d<? super r2>, ? extends Object> pVar, int i5) {
        super(2);
        this.$block = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        EffectsKt.LaunchedEffect(this.$block, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
