package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0013"}, d2 = {"Landroidx/navigation/NavHostController;", "Landroidx/navigation/NavController;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/r2;", "setLifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "", "enabled", "enableOnBackPressed", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "Landroid/content/Context;", d.X, "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(@l Context context) {
        super(context);
        l0.p(context, "context");
    }

    @Override // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z4) {
        super.enableOnBackPressed(z4);
    }

    @Override // androidx.navigation.NavController
    public final void setLifecycleOwner(@l LifecycleOwner owner) {
        l0.p(owner, "owner");
        super.setLifecycleOwner(owner);
    }

    @Override // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(@l OnBackPressedDispatcher dispatcher) {
        l0.p(dispatcher, "dispatcher");
        super.setOnBackPressedDispatcher(dispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void setViewModelStore(@l ViewModelStore viewModelStore) {
        l0.p(viewModelStore, "viewModelStore");
        super.setViewModelStore(viewModelStore);
    }
}
