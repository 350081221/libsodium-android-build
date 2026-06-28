package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.animation.core.h;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001@B0\u0012'\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u001d\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0082\bJ\u001d\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fH\u0082\bJ&\u0010\u0013\u001a\u00020\r\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\fH\u0002JA\u0010\u0017\u001a\u00020\u0004\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0007J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0001J)\u0010\u001e\u001a\u00020\u00042!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00020\fJ\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J\u001e\u0010$\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010#\u001a\u00020\"H\u0007J\u0006\u0010\u001a\u001a\u00020\u0004R5\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010(j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R,\u0010/\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010'R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\r028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010-R\u0018\u00109\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "", "drainChanges", "Lkotlin/r2;", "sendNotifications", "", "set", "addChanges", "removeChanges", "", "report", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "block", "forEachScopeMap", "removeScopeMapIf", "T", "onChanged", "ensureMap", "scope", "onValueChangedForScope", "Lkotlin/Function0;", "observeReads", "(Ljava/lang/Object;Lv3/l;Lv3/a;)V", "withNoObservations", "clear", "Lkotlin/v0;", "name", "predicate", "clearIf", "start", "stop", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "callback", "onChangedExecutor", "Lv3/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "Z", "Lkotlin/Function2;", "applyObserver", "Lv3/p;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "currentMapThreadId", "J", "<init>", "(Lv3/l;)V", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,652:1\n184#1,2:657\n186#1,2:670\n190#1,2:698\n192#1,2:715\n190#1,2:717\n192#1,2:734\n184#1,2:736\n186#1,2:749\n1208#2:653\n1187#2,2:654\n1#3:656\n460#4,11:659\n460#4,11:672\n838#4,15:683\n838#4,15:700\n838#4,15:719\n460#4,11:738\n366#4,12:751\n728#4,2:763\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n68#1:657,2\n68#1:670,2\n290#1:698,2\n290#1:715,2\n301#1:717,2\n301#1:734,2\n334#1:736,2\n334#1:749,2\n176#1:653\n176#1:654,2\n68#1:659,11\n185#1:672,11\n191#1:683,15\n290#1:700,15\n301#1:719,15\n334#1:738,11\n347#1:751,12\n350#1:763,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @m
    private ObserverHandle applyUnsubscribe;

    @m
    private ObservedScopeMap currentMap;
    private boolean isPaused;

    @l
    private final v3.l<v3.a<r2>, r2> onChangedExecutor;
    private boolean sendingNotifications;

    @l
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    @l
    private final p<Set<? extends Object>, Snapshot, r2> applyObserver = new SnapshotStateObserver$applyObserver$1(this);

    @l
    private final v3.l<Object, r2> readObserver = new SnapshotStateObserver$readObserver$1(this);

    @l
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@l v3.l<? super v3.a<r2>, r2> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List k5;
        List A4;
        List list;
        List L;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                list = set;
            } else if (obj instanceof Set) {
                L = w.L(obj, set);
                list = L;
            } else if (obj instanceof List) {
                k5 = v.k(set);
                A4 = e0.A4((Collection) obj, k5);
                list = A4;
            } else {
                report();
                throw new y();
            }
        } while (!h.a(this.pendingChanges, obj, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z4;
        synchronized (this.observedScopeMaps) {
            z4 = this.sendingNotifications;
        }
        if (z4) {
            return false;
        }
        boolean z5 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z5;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i5 = 0;
                    do {
                        if (!content[i5].recordInvalidation(removeChanges) && !z5) {
                            z5 = false;
                            i5++;
                        }
                        z5 = true;
                        i5++;
                    } while (i5 < size);
                }
                r2 r2Var = r2.f19517a;
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(v3.l<? super T, r2> lVar) {
        ObservedScopeMap observedScopeMap;
        boolean z4;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                observedScopeMap = content[i5];
                if (observedScopeMap.getOnChanged() == lVar) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i5++;
            } while (i5 < size);
        }
        observedScopeMap = null;
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 == null) {
            l0.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((v3.l) u1.q(lVar, 1));
            this.observedScopeMaps.add(observedScopeMap3);
            return observedScopeMap3;
        }
        return observedScopeMap2;
    }

    private final void forEachScopeMap(v3.l<? super ObservedScopeMap, r2> lVar) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i5 = 0;
                    do {
                        lVar.invoke(content[i5]);
                        i5++;
                    } while (i5 < size);
                }
                r2 r2Var = r2.f19517a;
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new y();
            }
        } while (!h.a(this.pendingChanges, obj, obj2));
        return set;
    }

    private final void removeScopeMapIf(v3.l<? super ObservedScopeMap, Boolean> lVar) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    if (lVar.invoke(mutableVector.getContent()[i6]).booleanValue()) {
                        i5++;
                    } else if (i5 > 0) {
                        mutableVector.getContent()[i6 - i5] = mutableVector.getContent()[i6];
                    }
                }
                int i7 = size - i5;
                o.M1(mutableVector.getContent(), null, i7, size);
                mutableVector.setSize(i7);
                r2 r2Var = r2.f19517a;
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new SnapshotStateObserver$sendNotifications$1(this));
    }

    public final void clear(@l Object obj) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                mutableVector.getContent()[i6].clearScopeObservations(obj);
                if (!r5.hasScopeObservations()) {
                    i5++;
                } else if (i5 > 0) {
                    mutableVector.getContent()[i6 - i5] = mutableVector.getContent()[i6];
                }
            }
            int i7 = size - i5;
            o.M1(mutableVector.getContent(), null, i7, size);
            mutableVector.setSize(i7);
            r2 r2Var = r2.f19517a;
        }
    }

    public final void clearIf(@l v3.l<Object, Boolean> lVar) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                mutableVector.getContent()[i6].removeScopeIf(lVar);
                if (!r5.hasScopeObservations()) {
                    i5++;
                } else if (i5 > 0) {
                    mutableVector.getContent()[i6 - i5] = mutableVector.getContent()[i6];
                }
            }
            int i7 = size - i5;
            o.M1(mutableVector.getContent(), null, i7, size);
            mutableVector.setSize(i7);
            r2 r2Var = r2.f19517a;
        }
    }

    @p4.p
    public final void notifyChanges(@l Set<? extends Object> set, @l Snapshot snapshot) {
        this.applyObserver.invoke(set, snapshot);
    }

    public final <T> void observeReads(@l T t5, @l v3.l<? super T, r2> lVar, @l v3.a<r2> aVar) {
        ObservedScopeMap ensureMap;
        boolean z4;
        synchronized (this.observedScopeMaps) {
            ensureMap = ensureMap(lVar);
        }
        boolean z5 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j5 = this.currentMapThreadId;
        if (j5 != -1) {
            if (j5 == ActualJvm_jvmKt.currentThreadId()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j5 + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread.currentThread().getId();
            ensureMap.observe(t5, this.readObserver, aVar);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z5;
            this.currentMapThreadId = j5;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @k(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @b1(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@l v3.a<r2> aVar) {
        boolean z4 = this.isPaused;
        this.isPaused = true;
        try {
            aVar.invoke();
        } finally {
            this.isPaused = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b@\u0010AJ.\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001J0\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001J)\u0010\u0017\u001a\u00020\b2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00150\rJ\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\bJ\u0014\u0010\u001c\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aJ\u0012\u0010\u001f\u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dJ\u0006\u0010 \u001a\u00020\bR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010(R\u001e\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010+R<\u0010>\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010<j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0001`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", t0.b.f22420d, "", "currentToken", "currentScope", "Landroidx/collection/MutableObjectIntMap;", "recordedValues", "Lkotlin/r2;", "recordRead", "scope", "clearObsoleteStateReads", "removeObservation", "Lkotlin/Function1;", "readObserver", "Lkotlin/Function0;", "block", "observe", "clearScopeObservations", "Lkotlin/v0;", "name", "", "predicate", "removeScopeIf", "hasScopeObservations", "clear", "", "changes", "recordInvalidation", "Landroidx/compose/runtime/DerivedState;", "derivedState", "rereadDerivedState", "notifyInvalidatedScopes", "onChanged", "Lv3/l;", "getOnChanged", "()Lv3/l;", "Ljava/lang/Object;", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "I", "Landroidx/compose/runtime/collection/ScopeMap;", "valueToScopes", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "invalidated", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "<init>", "(Lv3/l;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 12 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,652:1\n1208#2:653\n1187#2,2:654\n415#3,3:656\n373#3,6:659\n383#3,3:666\n386#3,2:670\n419#3:672\n420#3:674\n389#3,6:675\n421#3:681\n373#3,6:693\n383#3,3:700\n386#3,2:704\n389#3,6:710\n401#3,4:717\n373#3,6:721\n383#3,3:728\n386#3,2:732\n406#3,2:734\n389#3,6:736\n408#3:742\n401#3,4:758\n373#3,6:762\n383#3,3:769\n386#3,2:773\n406#3,2:775\n389#3,6:777\n408#3:783\n1810#4:665\n1672#4:669\n1810#4:699\n1672#4:703\n1810#4:727\n1672#4:731\n1810#4:750\n1672#4:754\n1810#4:768\n1672#4:772\n1810#4:818\n1672#4:822\n1810#4:842\n1672#4:846\n1810#4:887\n1672#4:891\n1810#4:924\n1672#4:928\n1672#4:961\n1810#4:981\n1672#4:985\n1810#4:1026\n1672#4:1030\n1810#4:1063\n1672#4:1067\n1810#4:1112\n1672#4:1116\n1810#4:1143\n1672#4:1147\n51#5:673\n51#5:682\n51#5:801\n388#6,6:683\n394#6,2:690\n48#7:689\n460#7,11:1085\n843#8:692\n845#8,4:706\n849#8:716\n1047#9:743\n1049#9:757\n1050#9,3:784\n1053#9:793\n363#10,6:744\n373#10,3:751\n376#10,2:755\n379#10,6:787\n396#11,2:794\n399#11:945\n401#11:1084\n108#12,5:796\n114#12:944\n70#13,5:802\n70#13,5:826\n78#13,4:858\n78#13:870\n70#13,5:871\n78#13,4:903\n81#13:907\n70#13,5:908\n78#13,4:940\n70#13,5:965\n78#13,4:997\n78#13:1009\n70#13,5:1010\n78#13,4:1042\n81#13:1046\n70#13,5:1047\n78#13,4:1079\n70#13,5:1096\n78#13,4:1128\n267#14,4:807\n237#14,7:811\n248#14,3:819\n251#14,2:823\n272#14:825\n267#14,4:831\n237#14,7:835\n248#14,3:843\n251#14,2:847\n272#14,2:849\n254#14,6:851\n274#14:857\n273#14:862\n254#14,6:863\n274#14:869\n267#14,4:876\n237#14,7:880\n248#14,3:888\n251#14,2:892\n272#14,2:894\n254#14,6:896\n274#14:902\n267#14,4:913\n237#14,7:917\n248#14,3:925\n251#14,2:929\n272#14,2:931\n254#14,6:933\n274#14:939\n237#14,14:947\n251#14,2:962\n272#14:964\n267#14,4:970\n237#14,7:974\n248#14,3:982\n251#14,2:986\n272#14,2:988\n254#14,6:990\n274#14:996\n273#14:1001\n254#14,6:1002\n274#14:1008\n267#14,4:1015\n237#14,7:1019\n248#14,3:1027\n251#14,2:1031\n272#14,2:1033\n254#14,6:1035\n274#14:1041\n267#14,4:1052\n237#14,7:1056\n248#14,3:1064\n251#14,2:1068\n272#14,2:1070\n254#14,6:1072\n274#14:1078\n267#14,4:1101\n237#14,7:1105\n248#14,3:1113\n251#14,2:1117\n272#14,2:1119\n254#14,6:1121\n274#14:1127\n267#14,4:1132\n237#14,7:1136\n248#14,3:1144\n251#14,2:1148\n272#14,2:1150\n254#14,6:1152\n274#14:1158\n1855#15:946\n1856#15:1083\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n397#1:653\n397#1:654,2\n469#1:656,3\n469#1:659,6\n469#1:666,3\n469#1:670,2\n469#1:672\n469#1:674\n469#1:675,6\n469#1:681\n512#1:693,6\n512#1:700,3\n512#1:704,2\n512#1:710,6\n526#1:717,4\n526#1:721,6\n526#1:728,3\n526#1:732,2\n526#1:734,2\n526#1:736,6\n526#1:742\n538#1:758,4\n538#1:762,6\n538#1:769,3\n538#1:773,2\n538#1:775,2\n538#1:777,6\n538#1:783\n469#1:665\n469#1:669\n512#1:699\n512#1:703\n526#1:727\n526#1:731\n535#1:750\n535#1:754\n538#1:768\n538#1:772\n588#1:818\n588#1:822\n599#1:842\n599#1:846\n599#1:887\n599#1:891\n610#1:924\n610#1:928\n588#1:961\n599#1:981\n599#1:985\n599#1:1026\n599#1:1030\n610#1:1063\n610#1:1067\n630#1:1112\n630#1:1116\n647#1:1143\n647#1:1147\n471#1:673\n479#1:682\n581#1:801\n499#1:683,6\n499#1:690,2\n499#1:689\n617#1:1085,11\n512#1:692\n512#1:706,4\n512#1:716\n535#1:743\n535#1:757\n535#1:784,3\n535#1:793\n535#1:744,6\n535#1:751,3\n535#1:755,2\n535#1:787,6\n579#1:794,2\n579#1:945\n579#1:1084\n579#1:796,5\n579#1:944\n588#1:802,5\n599#1:826,5\n599#1:858,4\n588#1:870\n599#1:871,5\n599#1:903,4\n588#1:907\n610#1:908,5\n610#1:940,4\n599#1:965,5\n599#1:997,4\n588#1:1009\n599#1:1010,5\n599#1:1042,4\n588#1:1046\n610#1:1047,5\n610#1:1079,4\n630#1:1096,5\n630#1:1128,4\n588#1:807,4\n588#1:811,7\n588#1:819,3\n588#1:823,2\n588#1:825\n599#1:831,4\n599#1:835,7\n599#1:843,3\n599#1:847,2\n599#1:849,2\n599#1:851,6\n599#1:857\n588#1:862\n588#1:863,6\n588#1:869\n599#1:876,4\n599#1:880,7\n599#1:888,3\n599#1:892,2\n599#1:894,2\n599#1:896,6\n599#1:902\n610#1:913,4\n610#1:917,7\n610#1:925,3\n610#1:929,2\n610#1:931,2\n610#1:933,6\n610#1:939\n588#1:947,14\n588#1:962,2\n588#1:964\n599#1:970,4\n599#1:974,7\n599#1:982,3\n599#1:986,2\n599#1:988,2\n599#1:990,6\n599#1:996\n588#1:1001\n588#1:1002,6\n588#1:1008\n599#1:1015,4\n599#1:1019,7\n599#1:1027,3\n599#1:1031,2\n599#1:1033,2\n599#1:1035,6\n599#1:1041\n610#1:1052,4\n610#1:1056,7\n610#1:1064,3\n610#1:1068,2\n610#1:1070,2\n610#1:1072,6\n610#1:1078\n630#1:1101,4\n630#1:1105,7\n630#1:1113,3\n630#1:1117,2\n630#1:1119,2\n630#1:1121,6\n630#1:1127\n647#1:1132,4\n647#1:1136,7\n647#1:1144,3\n647#1:1148,2\n647#1:1150,2\n647#1:1152,6\n647#1:1158\n579#1:946\n579#1:1083\n*E\n"})
    /* loaded from: classes.dex */
    public static final class ObservedScopeMap {

        @m
        private Object currentScope;

        @m
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;

        @l
        private final MutableScatterSet<Object> invalidated;

        @l
        private final v3.l<Object, r2> onChanged;

        @l
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;

        @l
        private final ScopeMap<Object> valueToScopes = new ScopeMap<>();

        @l
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);

        @l
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(@l DerivedState<?> derivedState) {
                int i5;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i5 = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i5 - 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(@l DerivedState<?> derivedState) {
                int i5;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i5 = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i5 + 1;
            }
        };

        @l
        private final ScopeMap<DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();

        @l
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(@l v3.l<Object, r2> lVar) {
            this.onChanged = lVar;
            int i5 = 0;
            int i6 = 1;
            kotlin.jvm.internal.w wVar = null;
            this.scopeToValues = new MutableScatterMap<>(i5, i6, wVar);
            this.invalidated = new MutableScatterSet<>(i5, i6, wVar);
        }

        private final void clearObsoleteStateReads(Object obj) {
            boolean z4;
            int i5 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap != null) {
                long[] jArr = mutableObjectIntMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr[i6];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                boolean z5 = true;
                                if ((255 & j5) < 128) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj2 = mutableObjectIntMap.keys[i9];
                                    if (mutableObjectIntMap.values[i9] == i5) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        removeObservation(obj, obj2);
                                    }
                                    if (z5) {
                                        mutableObjectIntMap.removeValueAt(i9);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i7 != 8) {
                                return;
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.valueToScopes.remove(obj2, obj);
            if ((obj2 instanceof DerivedState) && !this.valueToScopes.contains(obj2)) {
                this.dependencyToDerivedStates.removeScope(obj2);
                this.recordedDerivedStateValues.remove(obj2);
            }
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(@l Object obj) {
            boolean z4;
            MutableObjectIntMap<Object> remove = this.scopeToValues.remove(obj);
            if (remove == null) {
                return;
            }
            Object[] objArr = remove.keys;
            int[] iArr = remove.values;
            long[] jArr = remove.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                int i8 = (i5 << 3) + i7;
                                Object obj2 = objArr[i8];
                                int i9 = iArr[i8];
                                removeObservation(obj, obj2);
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            return;
                        }
                    }
                    if (i5 != length) {
                        i5++;
                    } else {
                        return;
                    }
                }
            }
        }

        @l
        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        @l
        public final v3.l<Object, r2> getOnChanged() {
            return this.onChanged;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        public final void notifyInvalidatedScopes() {
            boolean z4;
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            v3.l<Object, r2> lVar = this.onChanged;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                lVar.invoke(objArr[(i5 << 3) + i7]);
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            mutableScatterSet.clear();
        }

        public final void observe(@l Object obj, @l v3.l<Object, r2> lVar, @l v3.a<r2> aVar) {
            Object obj2 = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i5 = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion.observe(lVar, null, aVar);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                l0.m(obj3);
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i5;
            } catch (Throwable th) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x02f1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean recordInvalidation(@p4.l java.util.Set<? extends java.lang.Object> r38) {
            /*
                Method dump skipped, instructions count: 1587
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(@l Object obj) {
            Object obj2 = this.currentScope;
            l0.m(obj2);
            int i5 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj2, mutableObjectIntMap);
                r2 r2Var = r2.f19517a;
            }
            recordRead(obj, i5, obj2, mutableObjectIntMap);
        }

        public final void removeScopeIf(@l v3.l<Object, Boolean> lVar) {
            long[] jArr;
            int i5;
            boolean z4;
            long[] jArr2;
            int i6;
            long j5;
            int i7;
            long j6;
            int i8;
            boolean z5;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j7 = jArr3[i9];
                    long j8 = -9187201950435737472L;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j7 & 255) < 128) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                int i13 = (i9 << 3) + i12;
                                Object obj = mutableScatterMap.keys[i13];
                                MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i13];
                                Boolean invoke = lVar.invoke(obj);
                                if (invoke.booleanValue()) {
                                    Object[] objArr = mutableObjectIntMap.keys;
                                    int[] iArr = mutableObjectIntMap.values;
                                    long[] jArr4 = mutableObjectIntMap.metadata;
                                    int length2 = jArr4.length - 2;
                                    jArr2 = jArr3;
                                    if (length2 >= 0) {
                                        i7 = i11;
                                        int i14 = 0;
                                        while (true) {
                                            long j9 = jArr4[i14];
                                            i6 = i9;
                                            j5 = j7;
                                            j6 = -9187201950435737472L;
                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                for (int i16 = 0; i16 < i15; i16++) {
                                                    if ((j9 & 255) < 128) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (z5) {
                                                        int i17 = (i14 << 3) + i16;
                                                        Object obj2 = objArr[i17];
                                                        int i18 = iArr[i17];
                                                        removeObservation(obj, obj2);
                                                    }
                                                    j9 >>= 8;
                                                }
                                                if (i15 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i14 == length2) {
                                                break;
                                            }
                                            i14++;
                                            i9 = i6;
                                            j7 = j5;
                                        }
                                    } else {
                                        i6 = i9;
                                        j5 = j7;
                                        i7 = i11;
                                        j6 = -9187201950435737472L;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i6 = i9;
                                    j5 = j7;
                                    i7 = i11;
                                    j6 = j8;
                                }
                                if (invoke.booleanValue()) {
                                    mutableScatterMap.removeValueAt(i13);
                                }
                                i8 = 8;
                            } else {
                                jArr2 = jArr3;
                                i6 = i9;
                                j5 = j7;
                                i7 = i11;
                                j6 = j8;
                                i8 = i10;
                            }
                            j7 = j5 >> i8;
                            i12++;
                            i10 = i8;
                            j8 = j6;
                            jArr3 = jArr2;
                            i11 = i7;
                            i9 = i6;
                        }
                        jArr = jArr3;
                        int i19 = i9;
                        if (i11 == i10) {
                            i5 = i19;
                        } else {
                            return;
                        }
                    } else {
                        jArr = jArr3;
                        i5 = i9;
                    }
                    if (i5 != length) {
                        i9 = i5 + 1;
                        jArr3 = jArr;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void rereadDerivedState(@l DerivedState<?> derivedState) {
            long[] jArr;
            boolean z4;
            long[] jArr2;
            int i5;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj != null) {
                kotlin.jvm.internal.w wVar = null;
                int i6 = 1;
                int i7 = 0;
                if (obj instanceof MutableScatterSet) {
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr3 = mutableScatterSet.metadata;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j5 = jArr3[i8];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j5 & 255) < 128) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        Object obj2 = objArr[(i8 << 3) + i11];
                                        MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj2);
                                        jArr2 = jArr3;
                                        if (mutableObjectIntMap2 == null) {
                                            mutableObjectIntMap = new MutableObjectIntMap<>(i7, i6, wVar);
                                            mutableScatterMap.set(obj2, mutableObjectIntMap);
                                            r2 r2Var = r2.f19517a;
                                        } else {
                                            mutableObjectIntMap = mutableObjectIntMap2;
                                        }
                                        recordRead(derivedState, id, obj2, mutableObjectIntMap);
                                        i5 = 8;
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i9;
                                    }
                                    j5 >>= i5;
                                    i11++;
                                    i9 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i10 != i9) {
                                    return;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i8 != length) {
                                i8++;
                                jArr3 = jArr;
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj);
                    if (mutableObjectIntMap3 == null) {
                        mutableObjectIntMap3 = new MutableObjectIntMap<>(i7, i6, wVar);
                        mutableScatterMap.set(obj, mutableObjectIntMap3);
                        r2 r2Var2 = r2.f19517a;
                    }
                    recordRead(derivedState, id, obj, mutableObjectIntMap3);
                }
            }
        }

        private final void recordRead(Object obj, int i5, Object obj2, MutableObjectIntMap<Object> mutableObjectIntMap) {
            int i6;
            int i7;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = mutableObjectIntMap.put(obj, i5, -1);
            if (!(obj instanceof DerivedState) || put == i5) {
                i6 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.recordedDerivedStateValues.put(obj, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScopeMap<DerivedState<?>> scopeMap = this.dependencyToDerivedStates;
                scopeMap.removeScope(obj);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr[i8];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j5 & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i8 << 3) + i11];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.Companion;
                                        ((StateObjectImpl) stateObject).m3369recordReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, obj);
                                    i7 = 8;
                                } else {
                                    i7 = i9;
                                }
                                j5 >>= i7;
                                i11++;
                                i9 = i7;
                            }
                            if (i10 != i9) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                i6 = -1;
            }
            if (put == i6) {
                if (obj instanceof StateObjectImpl) {
                    ReaderKind.Companion companion2 = ReaderKind.Companion;
                    ((StateObjectImpl) obj).m3369recordReadInh_f27i8$runtime_release(ReaderKind.m3356constructorimpl(2));
                }
                this.valueToScopes.add(obj, obj2);
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    content[i5].clear();
                    i5++;
                } while (i5 < size);
            }
            r2 r2Var = r2.f19517a;
        }
    }
}
