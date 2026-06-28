package androidx.savedstate;

import android.view.View;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.m;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "savedstate-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewKt {
    @k(level = m.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @b1(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        l0.p(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
