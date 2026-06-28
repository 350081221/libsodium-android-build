package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.p;
import kotlin.r2;
import kotlinx.coroutines.flow.e0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n1#3:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1$1$1\n*L\n261#1:1565\n*E\n"})
/* loaded from: classes.dex */
final class Recomposer$effectJob$1$1$1$1 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ Throwable $throwable;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th) {
        super(1);
        this.this$0 = recomposer;
        this.$throwable = th;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        e0 e0Var;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        Throwable th2 = this.$throwable;
        synchronized (obj) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                if (!(!(th instanceof CancellationException))) {
                    th = null;
                }
                if (th != null) {
                    p.a(th2, th);
                }
            }
            recomposer.closeCause = th2;
            e0Var = recomposer._state;
            e0Var.setValue(Recomposer.State.ShutDown);
            r2 r2Var = r2.f19517a;
        }
    }
}
