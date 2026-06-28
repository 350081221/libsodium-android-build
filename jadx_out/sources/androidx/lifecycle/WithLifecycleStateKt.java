package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.a1;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.x2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\n\u0010\t\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u000b\u0010\t\u001a2\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\b\u0010\u000e\u001a*\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\n\u0010\u000e\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u000b\u0010\u000e\u001a2\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081H¢\u0006\u0004\b\u000f\u0010\u0007\u001a@\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"R", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function0;", "block", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withStarted", "withResumed", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "", "dispatchNeeded", "Lkotlinx/coroutines/n0;", "lifecycleDispatcher", "suspendWithStateAtLeastUnchecked", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/n0;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: classes2.dex */
public final class WithLifecycleStateKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.LifecycleObserver] */
    @a1
    @m
    public static final <R> Object suspendWithStateAtLeastUnchecked(@l final Lifecycle lifecycle, @l final Lifecycle.State state, boolean z4, @l n0 n0Var, @l final v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final q qVar = new q(e5, 1);
        qVar.B();
        final ?? r12 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@l LifecycleOwner lifecycleOwner, @l Lifecycle.Event event) {
                Object m6444constructorimpl;
                if (event == Lifecycle.Event.Companion.upTo(Lifecycle.State.this)) {
                    lifecycle.removeObserver(this);
                    kotlin.coroutines.d dVar2 = qVar;
                    v3.a<R> aVar2 = aVar;
                    try {
                        d1.a aVar3 = d1.Companion;
                        m6444constructorimpl = d1.m6444constructorimpl(aVar2.invoke());
                    } catch (Throwable th) {
                        d1.a aVar4 = d1.Companion;
                        m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
                    }
                    dVar2.resumeWith(m6444constructorimpl);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    kotlin.coroutines.d dVar3 = qVar;
                    d1.a aVar5 = d1.Companion;
                    dVar3.resumeWith(d1.m6444constructorimpl(e1.a(new LifecycleDestroyedException())));
                }
            }
        };
        if (z4) {
            n0Var.dispatch(kotlin.coroutines.i.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    Lifecycle.this.addObserver(r12);
                }
            });
        } else {
            lifecycle.addObserver(r12);
        }
        qVar.g(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(n0Var, lifecycle, r12));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    @m
    public static final <R> Object withCreated(@l Lifecycle lifecycle, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    @m
    public static final <R> Object withResumed(@l Lifecycle lifecycle, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    @m
    public static final <R> Object withStarted(@l Lifecycle lifecycle, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    @m
    public static final <R> Object withStateAtLeast(@l Lifecycle lifecycle, @l Lifecycle.State state, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            x2 E0 = k1.e().E0();
            boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    @a1
    @m
    public static final <R> Object withStateAtLeastUnchecked(@l Lifecycle lifecycle, @l Lifecycle.State state, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    @a1
    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, v3.a<? extends R> aVar, kotlin.coroutines.d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        k1.e().E0();
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    @m
    public static final <R> Object withCreated(@l LifecycleOwner lifecycleOwner, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    @m
    public static final <R> Object withResumed(@l LifecycleOwner lifecycleOwner, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    @m
    public static final <R> Object withStarted(@l LifecycleOwner lifecycleOwner, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        x2 E0 = k1.e().E0();
        boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    @m
    public static final <R> Object withStateAtLeast(@l LifecycleOwner lifecycleOwner, @l Lifecycle.State state, @l v3.a<? extends R> aVar, @l kotlin.coroutines.d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            x2 E0 = k1.e().E0();
            boolean isDispatchNeeded = E0.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, E0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
