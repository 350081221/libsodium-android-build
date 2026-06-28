package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a-\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a;\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b¨\u0006\u000b"}, d2 = {"add", "Landroidx/fragment/app/FragmentTransaction;", "F", "Landroidx/fragment/app/Fragment;", "containerViewId", "", TTDownloadField.TT_TAG, "", "args", "Landroid/os/Bundle;", "replace", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, @IdRes int i5, String str, Bundle bundle) {
        l0.p(fragmentTransaction, "<this>");
        l0.y(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i5, Fragment.class, bundle, str);
        l0.o(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i5, String str, Bundle bundle, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = null;
        }
        if ((i6 & 4) != 0) {
            bundle = null;
        }
        l0.p(fragmentTransaction, "<this>");
        l0.y(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i5, Fragment.class, bundle, str);
        l0.o(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i5, String str, Bundle bundle) {
        l0.p(fragmentTransaction, "<this>");
        l0.y(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i5, Fragment.class, bundle, str);
        l0.o(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i5, String str, Bundle bundle, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = null;
        }
        if ((i6 & 4) != 0) {
            bundle = null;
        }
        l0.p(fragmentTransaction, "<this>");
        l0.y(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i5, Fragment.class, bundle, str);
        l0.o(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String tag, Bundle bundle) {
        l0.p(fragmentTransaction, "<this>");
        l0.p(tag, "tag");
        l0.y(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, tag);
        l0.o(add, "add(F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String tag, Bundle bundle, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bundle = null;
        }
        l0.p(fragmentTransaction, "<this>");
        l0.p(tag, "tag");
        l0.y(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, tag);
        l0.o(add, "add(F::class.java, args, tag)");
        return add;
    }
}
