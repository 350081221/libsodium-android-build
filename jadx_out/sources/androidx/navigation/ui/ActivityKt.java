package androidx.navigation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/r2;", "setupActionBarWithNavController", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "navigation-ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,78:1\n249#2,8:79\n249#2,8:87\n*S KotlinDebug\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n*L\n49#1:79,8\n74#1:87,8\n*E\n"})
/* loaded from: classes2.dex */
public final class ActivityKt {
    public static final void setupActionBarWithNavController(@l AppCompatActivity appCompatActivity, @l NavController navController, @m DrawerLayout drawerLayout) {
        l0.p(appCompatActivity, "<this>");
        l0.p(navController, "navController");
        NavigationUI.setupActionBarWithNavController(appCompatActivity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build());
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    public static final void setupActionBarWithNavController(@l AppCompatActivity appCompatActivity, @l NavController navController, @l AppBarConfiguration configuration) {
        l0.p(appCompatActivity, "<this>");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        NavigationUI.setupActionBarWithNavController(appCompatActivity, navController, configuration);
    }
}
