package androidx.core.util;

import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/d;", "Lkotlin/r2;", "Ljava/lang/Runnable;", "asRunnable", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RunnableKt {
    @l
    public static final Runnable asRunnable(@l kotlin.coroutines.d<? super r2> dVar) {
        return new ContinuationRunnable(dVar);
    }
}
