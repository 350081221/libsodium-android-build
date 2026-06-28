package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/EmittedSource;", "Lkotlinx/coroutines/n1;", "Lkotlin/r2;", "removeSource", "disposeNow", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispose", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/MediatorLiveData;", "mediator", "Landroidx/lifecycle/MediatorLiveData;", "", "disposed", "Z", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/MediatorLiveData;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EmittedSource implements n1 {
    private boolean disposed;

    @l
    private final MediatorLiveData<?> mediator;

    @l
    private final LiveData<?> source;

    public EmittedSource(@l LiveData<?> source, @l MediatorLiveData<?> mediator) {
        l0.p(source, "source");
        l0.p(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (!this.disposed) {
            this.mediator.removeSource(this.source);
            this.disposed = true;
        }
    }

    @Override // kotlinx.coroutines.n1
    public void dispose() {
        k.f(t0.a(k1.e().C0()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    @m
    public final Object disposeNow(@l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object h5 = kotlinx.coroutines.i.h(k1.e().C0(), new EmittedSource$disposeNow$2(this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return h5 == l5 ? h5 : r2.f19517a;
    }
}
