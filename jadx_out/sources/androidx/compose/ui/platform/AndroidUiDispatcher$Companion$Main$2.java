package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/g;", "invoke", "()Lkotlin/coroutines/g;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2 extends kotlin.jvm.internal.n0 implements v3.a<kotlin.coroutines.g> {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // v3.a
    @p4.l
    public final kotlin.coroutines.g invoke() {
        boolean isMainThread;
        isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(isMainThread ? Choreographer.getInstance() : (Choreographer) kotlinx.coroutines.i.f(kotlinx.coroutines.k1.e(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), HandlerCompat.createAsync(Looper.getMainLooper()), null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
