package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/BasicTooltipStateImpl;", "Landroidx/compose/material3/BasicTooltipState;", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "Lkotlin/r2;", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "onDispose", "", "isPersistent", "Z", "()Z", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "<set-?>", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "isVisible", "setVisible", "(Z)V", "Lkotlinx/coroutines/p;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/p;", "initialIsVisible", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,248:1\n81#2:249\n107#2,2:250\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipStateImpl\n*L\n130#1:249\n130#1:250,2\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl implements BasicTooltipState {
    private final boolean isPersistent;

    @p4.l
    private final MutableState isVisible$delegate;

    @p4.m
    private kotlinx.coroutines.p<? super r2> job;

    @p4.l
    private final MutatorMutex mutatorMutex;

    public BasicTooltipStateImpl(boolean z4, boolean z5, @p4.l MutatorMutex mutatorMutex) {
        MutableState mutableStateOf$default;
        this.isPersistent = z5;
        this.mutatorMutex = mutatorMutex;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
        this.isVisible$delegate = mutableStateOf$default;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void dismiss() {
        setVisible(false);
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.BasicTooltipState
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void onDispose() {
        kotlinx.coroutines.p<? super r2> pVar = this.job;
        if (pVar != null) {
            p.a.a(pVar, null, 1, null);
        }
    }

    public void setVisible(boolean z4) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z4));
    }

    @Override // androidx.compose.material3.BasicTooltipState
    @p4.m
    public Object show(@p4.l MutatePriority mutatePriority, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate = this.mutatorMutex.mutate(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (mutate == l5) {
            return mutate;
        }
        return r2.f19517a;
    }
}
