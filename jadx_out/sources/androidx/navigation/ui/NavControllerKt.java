package androidx.navigation.ui;

import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"navigateUp", "", "Landroidx/navigation/NavController;", "drawerLayout", "Landroidx/customview/widget/Openable;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,42:1\n249#2,8:43\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n*L\n32#1:43,8\n*E\n"})
/* loaded from: classes2.dex */
public final class NavControllerKt {
    public static final boolean navigateUp(@l NavController navController, @m Openable openable) {
        l0.p(navController, "<this>");
        return NavigationUI.navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE)).build());
    }

    public static final boolean navigateUp(@l NavController navController, @l AppBarConfiguration appBarConfiguration) {
        l0.p(navController, "<this>");
        l0.p(appBarConfiguration, "appBarConfiguration");
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
