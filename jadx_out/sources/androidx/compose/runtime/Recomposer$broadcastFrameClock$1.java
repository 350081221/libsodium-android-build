package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.w1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1564:1\n82#2:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n141#1:1565\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$broadcastFrameClock$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        p deriveStateLocked;
        e0 e0Var;
        Throwable th;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            deriveStateLocked = recomposer.deriveStateLocked();
            e0Var = recomposer._state;
            if (((Recomposer.State) e0Var.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                th = recomposer.closeCause;
                throw w1.a("Recomposer shutdown; frame clock awaiter will never resume", th);
            }
        }
        if (deriveStateLocked != null) {
            d1.a aVar = d1.Companion;
            deriveStateLocked.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }
}
