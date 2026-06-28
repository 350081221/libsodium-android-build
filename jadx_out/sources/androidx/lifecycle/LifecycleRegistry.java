package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0019\b\u0002\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b?\u0010@B\u0011\b\u0016\u0012\u0006\u0010>\u001a\u00020\f¢\u0006\u0004\b?\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0003J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0017J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010(\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001cR&\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00020)j\b\u0012\u0004\u0012\u00020\u0002`*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R$\u00106\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006D"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "next", "Lkotlin/r2;", "moveToState", "Landroidx/lifecycle/LifecycleObserver;", "observer", "calculateTargetState", "popParentState", "state", "pushParentState", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "forwardPass", "backwardPass", "sync", "", "methodName", "enforceMainThreadIfNeeded", "markState", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "handleLifecycleEvent", "addObserver", "removeObserver", "", "enforceMainThread", "Z", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "observerMap", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "addingObserverCounter", "I", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentStates", "Ljava/util/ArrayList;", "Lkotlinx/coroutines/flow/e0;", "_currentStateFlow", "Lkotlinx/coroutines/flow/e0;", "isSynced", "()Z", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "currentState", "Lkotlinx/coroutines/flow/t0;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/t0;", "currentStateFlow", "getObserverCount", "()I", "observerCount", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class LifecycleRegistry extends Lifecycle {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final e0<Lifecycle.State> _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;

    @l
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;

    @l
    private FastSafeIterableMap<LifecycleObserver, ObserverWithState> observerMap;

    @l
    private ArrayList<Lifecycle.State> parentStates;

    @l
    private Lifecycle.State state;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @VisibleForTesting
        @m
        public final LifecycleRegistry createUnsafe(@l LifecycleOwner owner) {
            l0.p(owner, "owner");
            return new LifecycleRegistry(owner, false, null);
        }

        @l
        @m
        public final Lifecycle.State min$lifecycle_runtime_release(@l Lifecycle.State state1, @p4.m Lifecycle.State state) {
            l0.p(state1, "state1");
            if (state != null && state.compareTo(state1) < 0) {
                return state;
            }
            return state1;
        }
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "dispatchEvent", "Landroidx/lifecycle/Lifecycle$State;", "state", "Landroidx/lifecycle/Lifecycle$State;", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "initialState", "<init>", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ObserverWithState {

        @l
        private LifecycleEventObserver lifecycleObserver;

        @l
        private Lifecycle.State state;

        public ObserverWithState(@p4.m LifecycleObserver lifecycleObserver, @l Lifecycle.State initialState) {
            l0.p(initialState, "initialState");
            l0.m(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = initialState;
        }

        public final void dispatchEvent(@p4.m LifecycleOwner lifecycleOwner, @l Lifecycle.Event event) {
            l0.p(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            l0.m(lifecycleOwner);
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }

        @l
        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        @l
        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(@l LifecycleEventObserver lifecycleEventObserver) {
            l0.p(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(@l Lifecycle.State state) {
            l0.p(state, "<set-?>");
            this.state = state;
        }
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z4) {
        this.enforceMainThread = z4;
        this.observerMap = new FastSafeIterableMap<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this._currentStateFlow = v0.a(state);
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z4, w wVar) {
        this(lifecycleOwner, z4);
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> descendingIterator = this.observerMap.descendingIterator();
        l0.o(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<LifecycleObserver, ObserverWithState> next = descendingIterator.next();
            l0.o(next, "next()");
            LifecycleObserver key = next.getKey();
            ObserverWithState value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event downFrom = Lifecycle.Event.Companion.downFrom(value.getState());
                if (downFrom != null) {
                    pushParentState(downFrom.getTargetState());
                    value.dispatchEvent(lifecycleOwner, downFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
            }
        }
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        ObserverWithState value;
        Map.Entry<LifecycleObserver, ObserverWithState> ceil = this.observerMap.ceil(lifecycleObserver);
        Lifecycle.State state2 = null;
        if (ceil != null && (value = ceil.getValue()) != null) {
            state = value.getState();
        } else {
            state = null;
        }
        if (!this.parentStates.isEmpty()) {
            state2 = this.parentStates.get(r0.size() - 1);
        }
        Companion companion = Companion;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state), state2);
    }

    @l
    @VisibleForTesting
    @m
    public static final LifecycleRegistry createUnsafe(@l LifecycleOwner lifecycleOwner) {
        return Companion.createUnsafe(lifecycleOwner);
    }

    @SuppressLint({"RestrictedApi"})
    private final void enforceMainThreadIfNeeded(String str) {
        if (this.enforceMainThread && !ArchTaskExecutor.getInstance().isMainThread()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        SafeIterableMap<LifecycleObserver, ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.observerMap.iteratorWithAdditions();
        l0.o(iteratorWithAdditions, "observerMap.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext() && !this.newEventOccurred) {
            Map.Entry next = iteratorWithAdditions.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) next.getKey();
            ObserverWithState observerWithState = (ObserverWithState) next.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (upFrom != null) {
                    observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
            }
        }
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<LifecycleObserver, ObserverWithState> eldest = this.observerMap.eldest();
        l0.m(eldest);
        Lifecycle.State state = eldest.getValue().getState();
        Map.Entry<LifecycleObserver, ObserverWithState> newest = this.observerMap.newest();
        l0.m(newest);
        Lifecycle.State state2 = newest.getValue().getState();
        if (state == state2 && this.state == state2) {
            return true;
        }
        return false;
    }

    private final void moveToState(Lifecycle.State state) {
        boolean z4;
        Lifecycle.State state2 = this.state;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            this.state = state;
            if (!this.handlingEvent && this.addingObserverCounter == 0) {
                this.handlingEvent = true;
                sync();
                this.handlingEvent = false;
                if (this.state == Lifecycle.State.DESTROYED) {
                    this.observerMap = new FastSafeIterableMap<>();
                    return;
                }
                return;
            }
            this.newEventOccurred = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.state + " in component " + this.lifecycleOwner.get()).toString());
    }

    private final void popParentState() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner != null) {
            while (!isSynced()) {
                this.newEventOccurred = false;
                Lifecycle.State state = this.state;
                Map.Entry<LifecycleObserver, ObserverWithState> eldest = this.observerMap.eldest();
                l0.m(eldest);
                if (state.compareTo(eldest.getValue().getState()) < 0) {
                    backwardPass(lifecycleOwner);
                }
                Map.Entry<LifecycleObserver, ObserverWithState> newest = this.observerMap.newest();
                if (!this.newEventOccurred && newest != null && this.state.compareTo(newest.getValue().getState()) > 0) {
                    forwardPass(lifecycleOwner);
                }
            }
            this.newEventOccurred = false;
            this._currentStateFlow.setValue(getCurrentState());
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@l LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        boolean z4;
        l0.p(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(observer, state2);
        if (this.observerMap.putIfAbsent(observer, observerWithState) != null || (lifecycleOwner = this.lifecycleOwner.get()) == null) {
            return;
        }
        if (this.addingObserverCounter == 0 && !this.handlingEvent) {
            z4 = false;
        } else {
            z4 = true;
        }
        Lifecycle.State calculateTargetState = calculateTargetState(observer);
        this.addingObserverCounter++;
        while (observerWithState.getState().compareTo(calculateTargetState) < 0 && this.observerMap.contains(observer)) {
            pushParentState(observerWithState.getState());
            Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
            if (upFrom != null) {
                observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                popParentState();
                calculateTargetState = calculateTargetState(observer);
            } else {
                throw new IllegalStateException("no event up from " + observerWithState.getState());
            }
        }
        if (!z4) {
            sync();
        }
        this.addingObserverCounter--;
    }

    @Override // androidx.lifecycle.Lifecycle
    @l
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    @l
    public t0<Lifecycle.State> getCurrentStateFlow() {
        return k.m(this._currentStateFlow);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    public void handleLifecycleEvent(@l Lifecycle.Event event) {
        l0.p(event, "event");
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    @kotlin.k(message = "Override [currentState].")
    @MainThread
    public void markState(@l Lifecycle.State state) {
        l0.p(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@l LifecycleObserver observer) {
        l0.p(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(observer);
    }

    public void setCurrentState(@l Lifecycle.State state) {
        l0.p(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(@l LifecycleOwner provider) {
        this(provider, true);
        l0.p(provider, "provider");
    }
}
