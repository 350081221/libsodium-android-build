package androidx.compose.foundation;

import android.view.Surface;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JP\u0010\r\u001a\u00020\u000b*\u00020\u00042A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\fH\u0096\u0001J&\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0002\b\fH\u0096\u0001R\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlinx/coroutines/s0;", "Landroid/view/Surface;", "Lkotlin/Function3;", "", "Lkotlin/v0;", "name", "width", "height", "Lkotlin/r2;", "Lkotlin/u;", "onChanged", "Lkotlin/Function1;", "onDestroyed", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, s0 {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ s0 $$delegate_1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, s0 s0Var) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = s0Var;
    }

    @Override // kotlinx.coroutines.s0
    @p4.l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(@p4.l Surface surface, @p4.l v3.q<? super Surface, ? super Integer, ? super Integer, r2> qVar) {
        this.$$delegate_0.onChanged(surface, qVar);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(@p4.l Surface surface, @p4.l v3.l<? super Surface, r2> lVar) {
        this.$$delegate_0.onDestroyed(surface, lVar);
    }
}
