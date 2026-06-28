package androidx.constraintlayout.compose;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.channels.l;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$3 extends n0 implements v3.a<r2> {
    final /* synthetic */ l<ConstraintSet> $channel;
    final /* synthetic */ ConstraintSet $constraintSet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$3(l<ConstraintSet> lVar, ConstraintSet constraintSet) {
        super(0);
        this.$channel = lVar;
        this.$constraintSet = constraintSet;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$channel.p(this.$constraintSet);
    }
}
