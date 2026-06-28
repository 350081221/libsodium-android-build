package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.l1;
import kotlin.collections.m1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR*\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0%8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)¨\u0006."}, d2 = {"Landroidx/navigation/NavigatorState;", "", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lkotlin/r2;", "push", "pushWithTransition", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "popUpTo", "", "saveState", "pop", "popWithTransition", "onLaunchSingleTop", "onLaunchSingleTopWithTransition", "entry", "markTransitionComplete", "prepareForTransition", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/flow/e0;", "", "_backStack", "Lkotlinx/coroutines/flow/e0;", "", "_transitionsInProgress", "<set-?>", "isNavigating", "Z", "()Z", "setNavigating", "(Z)V", "Lkotlinx/coroutines/flow/t0;", "backStack", "Lkotlinx/coroutines/flow/t0;", "getBackStack", "()Lkotlinx/coroutines/flow/t0;", "transitionsInProgress", "getTransitionsInProgress", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1747#2,3:229\n1747#2,3:232\n959#2,7:235\n1747#2,3:242\n2624#2,3:245\n533#2,6:248\n378#2,7:254\n451#2,6:261\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n83#1:229,3\n84#1:232,3\n112#1:235,7\n134#1:242,3\n135#1:245,3\n140#1:248,6\n167#1:254,7\n192#1:261,6\n*E\n"})
/* loaded from: classes2.dex */
public abstract class NavigatorState {

    @l
    private final e0<List<NavBackStackEntry>> _backStack;

    @l
    private final e0<Set<NavBackStackEntry>> _transitionsInProgress;

    @l
    private final t0<List<NavBackStackEntry>> backStack;

    @l
    private final ReentrantLock backStackLock = new ReentrantLock(true);
    private boolean isNavigating;

    @l
    private final t0<Set<NavBackStackEntry>> transitionsInProgress;

    public NavigatorState() {
        List E;
        Set k5;
        E = w.E();
        e0<List<NavBackStackEntry>> a5 = v0.a(E);
        this._backStack = a5;
        k5 = l1.k();
        e0<Set<NavBackStackEntry>> a6 = v0.a(k5);
        this._transitionsInProgress = a6;
        this.backStack = k.m(a5);
        this.transitionsInProgress = k.m(a6);
    }

    @l
    public abstract NavBackStackEntry createBackStackEntry(@l NavDestination navDestination, @m Bundle bundle);

    @l
    public final t0<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    @l
    public final t0<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(@l NavBackStackEntry entry) {
        Set<NavBackStackEntry> y4;
        l0.p(entry, "entry");
        e0<Set<NavBackStackEntry>> e0Var = this._transitionsInProgress;
        y4 = m1.y(e0Var.getValue(), entry);
        e0Var.setValue(y4);
    }

    @CallSuper
    public void onLaunchSingleTop(@l NavBackStackEntry backStackEntry) {
        List<NavBackStackEntry> V5;
        int i5;
        l0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            V5 = kotlin.collections.e0.V5(this.backStack.getValue());
            ListIterator<NavBackStackEntry> listIterator = V5.listIterator(V5.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (l0.g(listIterator.previous().getId(), backStackEntry.getId())) {
                        i5 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i5 = -1;
                    break;
                }
            }
            V5.set(i5, backStackEntry);
            this._backStack.setValue(V5);
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(@l NavBackStackEntry backStackEntry) {
        Set D;
        Set<NavBackStackEntry> D2;
        l0.p(backStackEntry, "backStackEntry");
        List<NavBackStackEntry> value = this.backStack.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry previous = listIterator.previous();
            if (l0.g(previous.getId(), backStackEntry.getId())) {
                e0<Set<NavBackStackEntry>> e0Var = this._transitionsInProgress;
                D = m1.D(e0Var.getValue(), previous);
                D2 = m1.D(D, backStackEntry);
                e0Var.setValue(D2);
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(@l NavBackStackEntry popUpTo, boolean z4) {
        l0.p(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            e0<List<NavBackStackEntry>> e0Var = this._backStack;
            List<NavBackStackEntry> value = e0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!(!l0.g((NavBackStackEntry) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            e0Var.setValue(arrayList);
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void popWithTransition(@l NavBackStackEntry popUpTo, boolean z4) {
        boolean z5;
        boolean z6;
        Set<NavBackStackEntry> D;
        NavBackStackEntry navBackStackEntry;
        Set<NavBackStackEntry> D2;
        boolean z7;
        boolean z8;
        boolean z9;
        l0.p(popUpTo, "popUpTo");
        Set<NavBackStackEntry> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((NavBackStackEntry) it.next()) == popUpTo) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z6 = true;
                    break;
                }
            }
        }
        z6 = false;
        if (z6) {
            List<NavBackStackEntry> value2 = this.backStack.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (it2.hasNext()) {
                    if (((NavBackStackEntry) it2.next()) == popUpTo) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        z9 = false;
                        break;
                    }
                }
            }
            z9 = true;
            if (z9) {
                return;
            }
        }
        e0<Set<NavBackStackEntry>> e0Var = this._transitionsInProgress;
        D = m1.D(e0Var.getValue(), popUpTo);
        e0Var.setValue(D);
        List<NavBackStackEntry> value3 = this.backStack.getValue();
        ListIterator<NavBackStackEntry> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                navBackStackEntry = listIterator.previous();
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                if (!l0.g(navBackStackEntry2, popUpTo) && this.backStack.getValue().lastIndexOf(navBackStackEntry2) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    break;
                }
            } else {
                navBackStackEntry = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        if (navBackStackEntry3 != null) {
            e0<Set<NavBackStackEntry>> e0Var2 = this._transitionsInProgress;
            D2 = m1.D(e0Var2.getValue(), navBackStackEntry3);
            e0Var2.setValue(D2);
        }
        pop(popUpTo, z4);
    }

    @CallSuper
    public void prepareForTransition(@l NavBackStackEntry entry) {
        Set<NavBackStackEntry> D;
        l0.p(entry, "entry");
        e0<Set<NavBackStackEntry>> e0Var = this._transitionsInProgress;
        D = m1.D(e0Var.getValue(), entry);
        e0Var.setValue(D);
    }

    public void push(@l NavBackStackEntry backStackEntry) {
        List<NavBackStackEntry> B4;
        l0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            e0<List<NavBackStackEntry>> e0Var = this._backStack;
            B4 = kotlin.collections.e0.B4(e0Var.getValue(), backStackEntry);
            e0Var.setValue(B4);
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(@l NavBackStackEntry backStackEntry) {
        boolean z4;
        boolean z5;
        Object s32;
        Set<NavBackStackEntry> D;
        Set<NavBackStackEntry> D2;
        boolean z6;
        l0.p(backStackEntry, "backStackEntry");
        Set<NavBackStackEntry> value = this._transitionsInProgress.getValue();
        boolean z7 = true;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        if (z5) {
            List<NavBackStackEntry> value2 = this.backStack.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (it2.hasNext()) {
                    if (((NavBackStackEntry) it2.next()) == backStackEntry) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        break;
                    }
                }
            }
            z7 = false;
            if (z7) {
                return;
            }
        }
        s32 = kotlin.collections.e0.s3(this.backStack.getValue());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) s32;
        if (navBackStackEntry != null) {
            e0<Set<NavBackStackEntry>> e0Var = this._transitionsInProgress;
            D2 = m1.D(e0Var.getValue(), navBackStackEntry);
            e0Var.setValue(D2);
        }
        e0<Set<NavBackStackEntry>> e0Var2 = this._transitionsInProgress;
        D = m1.D(e0Var2.getValue(), backStackEntry);
        e0Var2.setValue(D);
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z4) {
        this.isNavigating = z4;
    }
}
