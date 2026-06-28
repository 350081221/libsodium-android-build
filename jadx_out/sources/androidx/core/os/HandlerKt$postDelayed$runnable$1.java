package androidx.core.os;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
/* loaded from: classes2.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ v3.a<r2> $action;

    public HandlerKt$postDelayed$runnable$1(v3.a<r2> aVar) {
        this.$action = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
