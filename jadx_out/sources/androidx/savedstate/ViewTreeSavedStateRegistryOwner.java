package androidx.savedstate;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.sequences.s;
import kotlin.sequences.u;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Lkotlin/r2;", "set", "(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V", "setViewTreeSavedStateRegistryOwner", "get", "(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;", "findViewTreeSavedStateRegistryOwner", "savedstate_release"}, k = 2, mv = {1, 8, 0})
@h(name = "ViewTreeSavedStateRegistryOwner")
/* loaded from: classes2.dex */
public final class ViewTreeSavedStateRegistryOwner {
    @h(name = "get")
    @m
    public static final SavedStateRegistryOwner get(@l View view) {
        kotlin.sequences.m l5;
        kotlin.sequences.m p12;
        Object F0;
        l0.p(view, "<this>");
        l5 = s.l(view, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.INSTANCE);
        p12 = u.p1(l5, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.INSTANCE);
        F0 = u.F0(p12);
        return (SavedStateRegistryOwner) F0;
    }

    @h(name = "set")
    public static final void set(@l View view, @m SavedStateRegistryOwner savedStateRegistryOwner) {
        l0.p(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
