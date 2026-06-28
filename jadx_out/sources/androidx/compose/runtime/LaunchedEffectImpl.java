package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R5\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/r2;", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "task", "Lv3/p;", "scope", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/l2;", "Lkotlin/coroutines/g;", "parentCoroutineContext", "<init>", "(Lkotlin/coroutines/g;Lv3/p;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;

    @m
    private l2 job;

    @l
    private final s0 scope;

    @l
    private final p<s0, d<? super r2>, Object> task;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(@l g gVar, @l p<? super s0, ? super d<? super r2>, ? extends Object> pVar) {
        this.task = pVar;
        this.scope = t0.a(gVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2Var.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2Var.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        l2 f5;
        l2 l2Var = this.job;
        if (l2Var != null) {
            kotlinx.coroutines.r2.j(l2Var, "Old job was still running!", null, 2, null);
        }
        f5 = k.f(this.scope, null, null, this.task, 3, null);
        this.job = f5;
    }
}
