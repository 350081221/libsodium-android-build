package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¨\u0006\u0006"}, d2 = {"R", "", "E", "Lkotlin/coroutines/d;", "Landroid/os/OutcomeReceiver;", "asOutcomeReceiver", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class OutcomeReceiverKt {
    @l
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(@l kotlin.coroutines.d<? super R> dVar) {
        return new ContinuationOutcomeReceiver(dVar);
    }
}
