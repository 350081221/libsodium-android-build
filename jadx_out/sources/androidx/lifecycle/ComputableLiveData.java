package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0005\u001a\u00028\u0000H%¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "Lkotlin/r2;", "invalidate", "compute", "()Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "Landroidx/lifecycle/LiveData;", "_liveData", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata_release", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata_release$annotations", "()V", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "<init>", "(Ljava/util/concurrent/Executor;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class ComputableLiveData<T> {

    @l
    private final LiveData<T> _liveData;

    @l
    private final AtomicBoolean computing;

    @l
    private final Executor executor;

    @l
    private final AtomicBoolean invalid;

    @l
    @u3.e
    public final Runnable invalidationRunnable;

    @l
    private final LiveData<T> liveData;

    @l
    @u3.e
    public final Runnable refreshRunnable;

    /* JADX WARN: Multi-variable type inference failed */
    @u3.i
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @u3.i
    public ComputableLiveData(@l Executor executor) {
        l0.p(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.a
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(ComputableLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.b
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(ComputableLiveData.this);
            }
        };
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData this$0) {
        l0.p(this$0, "this$0");
        boolean hasActiveObservers = this$0.getLiveData().hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && hasActiveObservers) {
            this$0.executor.execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData this$0) {
        l0.p(this$0, "this$0");
        do {
            boolean z4 = false;
            if (this$0.computing.compareAndSet(false, true)) {
                Object obj = null;
                boolean z5 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        obj = this$0.compute();
                        z5 = true;
                    } catch (Throwable th) {
                        this$0.computing.set(false);
                        throw th;
                    }
                }
                if (z5) {
                    this$0.getLiveData().postValue(obj);
                }
                this$0.computing.set(false);
                z4 = z5;
            }
            if (!z4) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @WorkerThread
    protected abstract T compute();

    @l
    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    @l
    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    @l
    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    @l
    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.w r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.l0.o(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.w):void");
    }
}
