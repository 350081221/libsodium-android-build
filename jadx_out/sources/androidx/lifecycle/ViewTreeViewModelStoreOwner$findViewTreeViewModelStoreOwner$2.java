package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStoreOwner;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends n0 implements l<View, ViewModelStoreOwner> {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    @Override // v3.l
    @m
    public final ViewModelStoreOwner invoke(@p4.l View view) {
        l0.p(view, "view");
        Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
