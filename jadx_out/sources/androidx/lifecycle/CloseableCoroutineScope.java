package androidx.lifecycle;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.Closeable;
import kotlin.i0;
import kotlinx.coroutines.r2;
import kotlinx.coroutines.s0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/lifecycle/CloseableCoroutineScope;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Lkotlin/coroutines/g;", "coroutineContext", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlin/coroutines/g;)V", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CloseableCoroutineScope implements Closeable, s0 {

    @l
    private final kotlin.coroutines.g coroutineContext;

    public CloseableCoroutineScope(@l kotlin.coroutines.g gVar) {
        this.coroutineContext = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r2.i(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.s0
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineContext;
    }
}
