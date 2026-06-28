package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.w1;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1564:1\n82#2:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n246#1:1565\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$effectJob$1$1 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        l2 l2Var;
        p pVar;
        e0 e0Var;
        e0 e0Var2;
        boolean z4;
        p pVar2;
        p pVar3;
        CancellationException a5 = w1.a("Recomposer effect job completed", th);
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            l2Var = recomposer.runnerJob;
            pVar = null;
            if (l2Var != null) {
                e0Var2 = recomposer._state;
                e0Var2.setValue(Recomposer.State.ShuttingDown);
                z4 = recomposer.isClosed;
                if (!z4) {
                    l2Var.cancel(a5);
                } else {
                    pVar2 = recomposer.workContinuation;
                    if (pVar2 != null) {
                        pVar3 = recomposer.workContinuation;
                        recomposer.workContinuation = null;
                        l2Var.t0(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                        pVar = pVar3;
                    }
                }
                pVar3 = null;
                recomposer.workContinuation = null;
                l2Var.t0(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                pVar = pVar3;
            } else {
                recomposer.closeCause = a5;
                e0Var = recomposer._state;
                e0Var.setValue(Recomposer.State.ShutDown);
                r2 r2Var = r2.f19517a;
            }
        }
        if (pVar != null) {
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }
}
