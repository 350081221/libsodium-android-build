package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.l2;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CoroutinesRoom$Companion$execute$4$1 extends n0 implements v3.l<Throwable, r2> {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ l2 $job;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, l2 l2Var) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = l2Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.m Throwable th) {
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        if (cancellationSignal != null) {
            SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal);
        }
        l2.a.b(this.$job, null, 1, null);
    }
}
