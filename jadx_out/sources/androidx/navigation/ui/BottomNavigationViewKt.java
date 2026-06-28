package androidx.navigation.ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/google/android/material/navigation/NavigationBarView;", "Landroidx/navigation/NavController;", "navController", "Lkotlin/r2;", "setupWithNavController", "navigation-ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BottomNavigationViewKt {
    public static final void setupWithNavController(@l NavigationBarView navigationBarView, @l NavController navController) {
        l0.p(navigationBarView, "<this>");
        l0.p(navController, "navController");
        NavigationUI.setupWithNavController(navigationBarView, navController);
    }
}
