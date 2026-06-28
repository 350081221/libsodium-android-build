package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.sequences.s;
import kotlin.sequences.u;
import p4.l;
import u3.i;
import u3.m;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u001e\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0018"}, d2 = {"Landroidx/navigation/Navigation;", "", "Landroid/app/Activity;", "activity", "", "viewId", "Landroidx/navigation/NavController;", "findNavController", "Landroid/view/View;", "view", "resId", "Landroid/os/Bundle;", "args", "Landroid/view/View$OnClickListener;", "createNavigateOnClickListener", "Landroidx/navigation/NavDirections;", "directions", "controller", "Lkotlin/r2;", "setViewNavController", "findViewNavController", "getViewNavController", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Navigation {

    @l
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    @l
    @i
    @m
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i5) {
        return createNavigateOnClickListener$default(i5, null, 2, null);
    }

    @l
    @i
    @m
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes final int i5, @p4.m final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$0(i5, bundle, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i5, Bundle bundle, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i5, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$0(int i5, Bundle bundle, View view) {
        l0.o(view, "view");
        findNavController(view).navigate(i5, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$1(NavDirections directions, View view) {
        l0.p(directions, "$directions");
        l0.o(view, "view");
        findNavController(view).navigate(directions);
    }

    @l
    @m
    public static final NavController findNavController(@l Activity activity, @IdRes int i5) {
        l0.p(activity, "activity");
        View requireViewById = ActivityCompat.requireViewById(activity, i5);
        l0.o(requireViewById, "requireViewById<View>(activity, viewId)");
        NavController findViewNavController = INSTANCE.findViewNavController(requireViewById);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i5);
    }

    private final NavController findViewNavController(View view) {
        kotlin.sequences.m l5;
        kotlin.sequences.m p12;
        Object F0;
        l5 = s.l(view, Navigation$findViewNavController$1.INSTANCE);
        p12 = u.p1(l5, Navigation$findViewNavController$2.INSTANCE);
        F0 = u.F0(p12);
        return (NavController) F0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController getViewNavController(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    @m
    public static final void setViewNavController(@l View view, @p4.m NavController navController) {
        l0.p(view, "view");
        view.setTag(R.id.nav_controller_view_tag, navController);
    }

    @l
    @m
    public static final View.OnClickListener createNavigateOnClickListener(@l final NavDirections directions) {
        l0.p(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$1(NavDirections.this, view);
            }
        };
    }

    @l
    @m
    public static final NavController findNavController(@l View view) {
        l0.p(view, "view");
        NavController findViewNavController = INSTANCE.findViewNavController(view);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
