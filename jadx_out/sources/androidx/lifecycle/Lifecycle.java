package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'R6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "Landroidx/lifecycle/LifecycleObserver;", "observer", "Lkotlin/r2;", "addObserver", "removeObserver", "Ljava/util/concurrent/atomic/AtomicReference;", "<set-?>", "internalScopeRef", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Lkotlinx/coroutines/flow/t0;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/t0;", "currentStateFlow", "<init>", "()V", "Event", "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,446:1\n1#2:447\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Lifecycle {

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "(Ljava/lang/String;I)V", "targetState", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "Companion", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        @l
        public static final Companion Companion = new Companion(null);

        @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {

            @i0(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @m
            @u3.m
            public final Event downFrom(@l State state) {
                l0.p(state, "state");
                int i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            return null;
                        }
                        return Event.ON_PAUSE;
                    }
                    return Event.ON_STOP;
                }
                return Event.ON_DESTROY;
            }

            @m
            @u3.m
            public final Event downTo(@l State state) {
                l0.p(state, "state");
                int i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 4) {
                            return null;
                        }
                        return Event.ON_DESTROY;
                    }
                    return Event.ON_PAUSE;
                }
                return Event.ON_STOP;
            }

            @m
            @u3.m
            public final Event upFrom(@l State state) {
                l0.p(state, "state");
                int i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 5) {
                            return null;
                        }
                        return Event.ON_CREATE;
                    }
                    return Event.ON_RESUME;
                }
                return Event.ON_START;
            }

            @m
            @u3.m
            public final Event upTo(@l State state) {
                l0.p(state, "state");
                int i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            return null;
                        }
                        return Event.ON_RESUME;
                    }
                    return Event.ON_START;
                }
                return Event.ON_CREATE;
            }
        }

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @m
        @u3.m
        public static final Event downFrom(@l State state) {
            return Companion.downFrom(state);
        }

        @m
        @u3.m
        public static final Event downTo(@l State state) {
            return Companion.downTo(state);
        }

        @m
        @u3.m
        public static final Event upFrom(@l State state) {
            return Companion.upFrom(state);
        }

        @m
        @u3.m
        public static final Event upTo(@l State state) {
            return Companion.upTo(state);
        }

        @l
        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "(Ljava/lang/String;I)V", "isAtLeast", "", "state", "DESTROYED", "INITIALIZED", kotlinx.coroutines.debug.internal.f.f19991a, "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@l State state) {
            l0.p(state, "state");
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(e0 mutableStateFlow, LifecycleOwner lifecycleOwner, Event event) {
        l0.p(mutableStateFlow, "$mutableStateFlow");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    @MainThread
    public abstract void addObserver(@l LifecycleObserver lifecycleObserver);

    @l
    @MainThread
    public abstract State getCurrentState();

    @l
    public t0<State> getCurrentStateFlow() {
        final e0 a5 = v0.a(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.e
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(e0.this, lifecycleOwner, event);
            }
        });
        return k.m(a5);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @MainThread
    public abstract void removeObserver(@l LifecycleObserver lifecycleObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setInternalScopeRef(@l AtomicReference<Object> atomicReference) {
        l0.p(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
