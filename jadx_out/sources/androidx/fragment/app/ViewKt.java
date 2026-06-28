package androidx.fragment.app;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"findFragment", "F", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewKt {
    @p4.l
    public static final <F extends Fragment> F findFragment(@p4.l View view) {
        l0.p(view, "<this>");
        F f5 = (F) FragmentManager.findFragment(view);
        l0.o(f5, "findFragment(this)");
        return f5;
    }
}
