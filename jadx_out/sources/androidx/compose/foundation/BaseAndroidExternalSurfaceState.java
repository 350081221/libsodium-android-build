package androidx.compose.foundation;

import android.view.Surface;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'Jw\u0010\u0010\u001a\u00020\r2f\u0010\u0010\u001ab\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0003¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JO\u0010\u0013\u001a\u00020\r*\u00020\u00052A\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0002\b\u000fH\u0016J%\u0010\u0015\u001a\u00020\r*\u00020\u00052\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0002\b\u000fH\u0016J\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dRx\u0010\u0010\u001ad\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0003¢\u0006\u0002\b\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eRS\u0010\u001f\u001a?\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012¢\u0006\u0002\b\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R)\u0010!\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0002\b\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlin/Function5;", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroid/view/Surface;", "Lkotlin/v0;", "name", "surface", "", "width", "height", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "onSurface", "(Lv3/s;)V", "Lkotlin/Function3;", "onChanged", "Lkotlin/Function1;", "onDestroyed", "dispatchSurfaceCreated", "dispatchSurfaceChanged", "dispatchSurfaceDestroyed", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/s0;", "getScope", "()Lkotlinx/coroutines/s0;", "Lv3/s;", "onSurfaceChanged", "Lv3/q;", "onSurfaceDestroyed", "Lv3/l;", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/l2;", "<init>", "(Lkotlinx/coroutines/s0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {

    @p4.m
    private l2 job;

    @p4.m
    private v3.s<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super r2>, ? extends Object> onSurface;

    @p4.m
    private v3.q<? super Surface, ? super Integer, ? super Integer, r2> onSurfaceChanged;

    @p4.m
    private v3.l<? super Surface, r2> onSurfaceDestroyed;

    @p4.l
    private final s0 scope;

    public BaseAndroidExternalSurfaceState(@p4.l s0 s0Var) {
        this.scope = s0Var;
    }

    public final void dispatchSurfaceChanged(@p4.l Surface surface, int i5, int i6) {
        v3.q<? super Surface, ? super Integer, ? super Integer, r2> qVar = this.onSurfaceChanged;
        if (qVar != null) {
            qVar.invoke(surface, Integer.valueOf(i5), Integer.valueOf(i6));
        }
    }

    public final void dispatchSurfaceCreated(@p4.l Surface surface, int i5, int i6) {
        if (this.onSurface != null) {
            this.job = kotlinx.coroutines.i.e(this.scope, null, u0.UNDISPATCHED, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i5, i6, null), 1, null);
        }
    }

    public final void dispatchSurfaceDestroyed(@p4.l Surface surface) {
        v3.l<? super Surface, r2> lVar = this.onSurfaceDestroyed;
        if (lVar != null) {
            lVar.invoke(surface);
        }
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.job = null;
    }

    @p4.l
    public final s0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(@p4.l Surface surface, @p4.l v3.q<? super Surface, ? super Integer, ? super Integer, r2> qVar) {
        this.onSurfaceChanged = qVar;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(@p4.l Surface surface, @p4.l v3.l<? super Surface, r2> lVar) {
        this.onSurfaceDestroyed = lVar;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(@p4.l v3.s<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super r2>, ? extends Object> sVar) {
        this.onSurface = sVar;
    }
}
