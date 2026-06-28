package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import androidx.navigation.ui.AppBarConfiguration;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"AppBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "topLevelMenu", "Landroid/view/Menu;", "drawerLayout", "Landroidx/customview/widget/Openable;", "fallbackOnNavigateUpListener", "Lkotlin/Function0;", "", "navGraph", "Landroidx/navigation/NavGraph;", "topLevelDestinationIds", "", "", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppBarConfigurationKt {
    @l
    public static final AppBarConfiguration AppBarConfiguration(@l NavGraph navGraph, @m Openable openable, @l v3.a<Boolean> fallbackOnNavigateUpListener) {
        l0.p(navGraph, "navGraph");
        l0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, Openable openable, v3.a fallbackOnNavigateUpListener, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            openable = null;
        }
        if ((i5 & 4) != 0) {
            fallbackOnNavigateUpListener = AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE;
        }
        l0.p(navGraph, "navGraph");
        l0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    @l
    public static final AppBarConfiguration AppBarConfiguration(@l Menu topLevelMenu, @m Openable openable, @l v3.a<Boolean> fallbackOnNavigateUpListener) {
        l0.p(topLevelMenu, "topLevelMenu");
        l0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu topLevelMenu, Openable openable, v3.a fallbackOnNavigateUpListener, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            openable = null;
        }
        if ((i5 & 4) != 0) {
            fallbackOnNavigateUpListener = AppBarConfigurationKt$AppBarConfiguration$2.INSTANCE;
        }
        l0.p(topLevelMenu, "topLevelMenu");
        l0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    @l
    public static final AppBarConfiguration AppBarConfiguration(@l Set<Integer> topLevelDestinationIds, @m Openable openable, @l v3.a<Boolean> fallbackOnNavigateUpListener) {
        l0.p(topLevelDestinationIds, "topLevelDestinationIds");
        l0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set topLevelDestinationIds, Openable openable, v3.a fallbackOnNavigateUpListener, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            openable = null;
        }
        if ((i5 & 4) != 0) {
            fallbackOnNavigateUpListener = AppBarConfigurationKt$AppBarConfiguration$3.INSTANCE;
        }
        l0.p(topLevelDestinationIds, "topLevelDestinationIds");
        l0.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder((Set<Integer>) topLevelDestinationIds).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(fallbackOnNavigateUpListener)).build();
    }
}
