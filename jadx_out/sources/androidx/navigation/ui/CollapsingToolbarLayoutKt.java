package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/r2;", "setupWithNavController", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "navigation-ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,79:1\n249#2,8:80\n249#2,8:88\n*S KotlinDebug\n*F\n+ 1 CollapsingToolbarLayout.kt\nandroidx/navigation/ui/CollapsingToolbarLayoutKt\n*L\n50#1:80,8\n75#1:88,8\n*E\n"})
/* loaded from: classes2.dex */
public final class CollapsingToolbarLayoutKt {
    public static final void setupWithNavController(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l NavController navController, @m DrawerLayout drawerLayout) {
        l0.p(collapsingToolbarLayout, "<this>");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        NavigationUI.setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build());
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l NavController navController, @l AppBarConfiguration configuration) {
        l0.p(collapsingToolbarLayout, "<this>");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        NavigationUI.setupWithNavController(collapsingToolbarLayout, toolbar, navController, configuration);
    }
}
