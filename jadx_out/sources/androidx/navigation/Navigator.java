package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.sequences.u;
import n3.e;
import n3.f;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002()B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000f\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J7\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "Landroidx/navigation/NavigatorState;", "state", "Lkotlin/r2;", "onAttach", "createDestination", "()Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "backStackEntry", "onLaunchSingleTop", "destination", "Landroid/os/Bundle;", "args", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "popUpTo", "", "savedState", "popBackStack", "onSaveState", "onRestoreState", "_state", "Landroidx/navigation/NavigatorState;", "<set-?>", "isAttached", "Z", "()Z", "getState", "()Landroidx/navigation/NavigatorState;", "<init>", "()V", "Extras", "Name", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,241:1\n1295#2,2:242\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n131#1:242,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Navigator<D extends NavDestination> {

    @m
    private NavigatorState _state;
    private boolean isAttached;

    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @e(n3.a.RUNTIME)
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", t0.b.f22420d, "", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @f(allowedTargets = {n3.b.ANNOTATION_CLASS, n3.b.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface Name {
        String value();
    }

    @l
    public abstract D createDestination();

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    @m
    public NavDestination navigate(@l D destination, @m Bundle bundle, @m NavOptions navOptions, @m Extras extras) {
        l0.p(destination, "destination");
        return destination;
    }

    public void navigate(@l List<NavBackStackEntry> entries, @m NavOptions navOptions, @m Extras extras) {
        kotlin.sequences.m x12;
        kotlin.sequences.m k12;
        kotlin.sequences.m v02;
        l0.p(entries, "entries");
        x12 = e0.x1(entries);
        k12 = u.k1(x12, new Navigator$navigate$1(this, navOptions, extras));
        v02 = u.v0(k12);
        Iterator it = v02.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    @CallSuper
    public void onAttach(@l NavigatorState state) {
        l0.p(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLaunchSingleTop(@l NavBackStackEntry backStackEntry) {
        l0.p(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(Navigator$onLaunchSingleTop$1.INSTANCE), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(@l Bundle savedState) {
        l0.p(savedState, "savedState");
    }

    @m
    public Bundle onSaveState() {
        return null;
    }

    public void popBackStack(@l NavBackStackEntry popUpTo, boolean z4) {
        l0.p(popUpTo, "popUpTo");
        List<NavBackStackEntry> value = getState().getBackStack().getValue();
        if (value.contains(popUpTo)) {
            ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
            NavBackStackEntry navBackStackEntry = null;
            while (popBackStack()) {
                navBackStackEntry = listIterator.previous();
                if (l0.g(navBackStackEntry, popUpTo)) {
                    break;
                }
            }
            if (navBackStackEntry != null) {
                getState().pop(navBackStackEntry, z4);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
    }

    public boolean popBackStack() {
        return true;
    }
}
