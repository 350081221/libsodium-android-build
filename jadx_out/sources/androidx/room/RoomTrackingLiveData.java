package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0013\u0012\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020201¢\u0006\u0004\b4\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010$\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00066"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", "T", "Landroidx/lifecycle/LiveData;", "Lkotlin/r2;", "onActive", "onInactive", "Landroidx/room/RoomDatabase;", "database", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "Landroidx/room/InvalidationLiveDataContainer;", "container", "Landroidx/room/InvalidationLiveDataContainer;", "", "inTransaction", "Z", "getInTransaction", "()Z", "Ljava/util/concurrent/Callable;", "computeFunction", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver", "()Landroidx/room/InvalidationTracker$Observer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing", "registeredObserver", "getRegisteredObserver", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "invalidationRunnable", "getInvalidationRunnable", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class RoomTrackingLiveData<T> extends LiveData<T> {

    @p4.l
    private final Callable<T> computeFunction;

    @p4.l
    private final AtomicBoolean computing;

    @p4.l
    private final InvalidationLiveDataContainer container;

    @p4.l
    private final RoomDatabase database;
    private final boolean inTransaction;

    @p4.l
    private final AtomicBoolean invalid;

    @p4.l
    private final Runnable invalidationRunnable;

    @p4.l
    private final InvalidationTracker.Observer observer;

    @p4.l
    private final Runnable refreshRunnable;

    @p4.l
    private final AtomicBoolean registeredObserver;

    public RoomTrackingLiveData(@p4.l RoomDatabase database, @p4.l InvalidationLiveDataContainer container, boolean z4, @p4.l Callable<T> computeFunction, @p4.l final String[] tableNames) {
        l0.p(database, "database");
        l0.p(container, "container");
        l0.p(computeFunction, "computeFunction");
        l0.p(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z4;
        this.computeFunction = computeFunction;
        this.observer = new InvalidationTracker.Observer(tableNames) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@p4.l Set<String> tables) {
                l0.p(tables, "tables");
                ArchTaskExecutor.getInstance().executeOnMainThread(this.getInvalidationRunnable());
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.refreshRunnable$lambda$0(RoomTrackingLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.room.z
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.invalidationRunnable$lambda$1(RoomTrackingLiveData.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(RoomTrackingLiveData this$0) {
        l0.p(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && hasActiveObservers) {
            this$0.getQueryExecutor().execute(this$0.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(RoomTrackingLiveData this$0) {
        boolean z4;
        l0.p(this$0, "this$0");
        if (this$0.registeredObserver.compareAndSet(false, true)) {
            this$0.database.getInvalidationTracker().addWeakObserver(this$0.observer);
        }
        do {
            if (this$0.computing.compareAndSet(false, true)) {
                T t5 = null;
                z4 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        try {
                            t5 = this$0.computeFunction.call();
                            z4 = true;
                        } catch (Exception e5) {
                            throw new RuntimeException("Exception while computing database live data.", e5);
                        }
                    } finally {
                        this$0.computing.set(false);
                    }
                }
                if (z4) {
                    this$0.postValue(t5);
                }
            } else {
                z4 = false;
            }
            if (!z4) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @p4.l
    public final Callable<T> getComputeFunction() {
        return this.computeFunction;
    }

    @p4.l
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @p4.l
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @p4.l
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @p4.l
    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    @p4.l
    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    @p4.l
    public final Executor getQueryExecutor() {
        if (this.inTransaction) {
            return this.database.getTransactionExecutor();
        }
        return this.database.getQueryExecutor();
    }

    @p4.l
    public final Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    @p4.l
    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        l0.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.refreshRunnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        l0.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }
}
