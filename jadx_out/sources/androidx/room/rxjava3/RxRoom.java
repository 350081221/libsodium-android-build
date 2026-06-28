package androidx.room.rxjava3;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import io.reactivex.rxjava3.core.d0;
import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.k0;
import io.reactivex.rxjava3.core.l0;
import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.t0;
import io.reactivex.rxjava3.core.v0;
import io.reactivex.rxjava3.core.x;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class RxRoom {

    @NonNull
    public static final Object NOTHING = new Object();

    private RxRoom() {
    }

    @NonNull
    public static o<Object> createFlowable(@NonNull final RoomDatabase roomDatabase, @NonNull final String... strArr) {
        return o.G1(new r() { // from class: androidx.room.rxjava3.c
            @Override // io.reactivex.rxjava3.core.r
            public final void a(q qVar) {
                RxRoom.lambda$createFlowable$1(strArr, roomDatabase, qVar);
            }
        }, io.reactivex.rxjava3.core.b.LATEST);
    }

    @NonNull
    public static i0<Object> createObservable(@NonNull final RoomDatabase roomDatabase, @NonNull final String... strArr) {
        return i0.B1(new l0() { // from class: androidx.room.rxjava3.g
            @Override // io.reactivex.rxjava3.core.l0
            public final void a(k0 k0Var) {
                RxRoom.lambda$createObservable$4(strArr, roomDatabase, k0Var);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> r0<T> createSingle(@NonNull final Callable<? extends T> callable) {
        return r0.R(new v0() { // from class: androidx.room.rxjava3.f
            @Override // io.reactivex.rxjava3.core.v0
            public final void a(t0 t0Var) {
                RxRoom.lambda$createSingle$6(callable, t0Var);
            }
        });
    }

    private static Executor getExecutor(@NonNull RoomDatabase roomDatabase, boolean z4) {
        if (z4) {
            return roomDatabase.getTransactionExecutor();
        }
        return roomDatabase.getQueryExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFlowable$0(RoomDatabase roomDatabase, InvalidationTracker.Observer observer) throws Throwable {
        roomDatabase.getInvalidationTracker().removeObserver(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFlowable$1(String[] strArr, final RoomDatabase roomDatabase, final q qVar) throws Throwable {
        final InvalidationTracker.Observer observer = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.rxjava3.RxRoom.1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NonNull Set<String> set) {
                if (!qVar.isCancelled()) {
                    qVar.onNext(RxRoom.NOTHING);
                }
            }
        };
        if (!qVar.isCancelled()) {
            roomDatabase.getInvalidationTracker().addObserver(observer);
            qVar.setDisposable(io.reactivex.rxjava3.disposables.e.p(new m3.a() { // from class: androidx.room.rxjava3.a
                @Override // m3.a
                public final void run() {
                    RxRoom.lambda$createFlowable$0(RoomDatabase.this, observer);
                }
            }));
        }
        if (!qVar.isCancelled()) {
            qVar.onNext(NOTHING);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d0 lambda$createFlowable$2(x xVar, Object obj) throws Throwable {
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createObservable$3(RoomDatabase roomDatabase, InvalidationTracker.Observer observer) throws Throwable {
        roomDatabase.getInvalidationTracker().removeObserver(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createObservable$4(String[] strArr, final RoomDatabase roomDatabase, final k0 k0Var) throws Throwable {
        final InvalidationTracker.Observer observer = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.rxjava3.RxRoom.2
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NonNull Set<String> set) {
                k0Var.onNext(RxRoom.NOTHING);
            }
        };
        roomDatabase.getInvalidationTracker().addObserver(observer);
        k0Var.setDisposable(io.reactivex.rxjava3.disposables.e.p(new m3.a() { // from class: androidx.room.rxjava3.e
            @Override // m3.a
            public final void run() {
                RxRoom.lambda$createObservable$3(RoomDatabase.this, observer);
            }
        }));
        k0Var.onNext(NOTHING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d0 lambda$createObservable$5(x xVar, Object obj) throws Throwable {
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSingle$6(Callable callable, t0 t0Var) throws Throwable {
        try {
            t0Var.onSuccess(callable.call());
        } catch (EmptyResultSetException e5) {
            t0Var.tryOnError(e5);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> o<T> createFlowable(@NonNull RoomDatabase roomDatabase, boolean z4, @NonNull String[] strArr, @NonNull Callable<T> callable) {
        q0 b5 = io.reactivex.rxjava3.schedulers.b.b(getExecutor(roomDatabase, z4));
        final x E0 = x.E0(callable);
        return (o<T>) createFlowable(roomDatabase, strArr).P6(b5).w8(b5).I4(b5).U2(new m3.o() { // from class: androidx.room.rxjava3.d
            @Override // m3.o
            public final Object apply(Object obj) {
                d0 lambda$createFlowable$2;
                lambda$createFlowable$2 = RxRoom.lambda$createFlowable$2(x.this, obj);
                return lambda$createFlowable$2;
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T> i0<T> createObservable(@NonNull RoomDatabase roomDatabase, boolean z4, @NonNull String[] strArr, @NonNull Callable<T> callable) {
        q0 b5 = io.reactivex.rxjava3.schedulers.b.b(getExecutor(roomDatabase, z4));
        final x E0 = x.E0(callable);
        return (i0<T>) createObservable(roomDatabase, strArr).m6(b5).Q7(b5).x4(b5).M2(new m3.o() { // from class: androidx.room.rxjava3.b
            @Override // m3.o
            public final Object apply(Object obj) {
                d0 lambda$createObservable$5;
                lambda$createObservable$5 = RxRoom.lambda$createObservable$5(x.this, obj);
                return lambda$createObservable$5;
            }
        });
    }
}
