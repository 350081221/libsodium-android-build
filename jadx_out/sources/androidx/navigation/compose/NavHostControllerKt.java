package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import com.umeng.analytics.pro.d;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a1\u0010\u0006\u001a\u00020\u00022\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b\"\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r*\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"NavControllerSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/navigation/NavHostController;", d.X, "Landroid/content/Context;", "createNavController", "rememberNavController", "navigators", "", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;", "currentBackStackEntryAsState", "Landroidx/compose/runtime/State;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,85:1\n76#2:86\n*S KotlinDebug\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n*L\n59#1:86\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostControllerKt {
    private static final Saver<NavHostController, ?> NavControllerSaver(Context context) {
        return SaverKt.Saver(NavHostControllerKt$NavControllerSaver$1.INSTANCE, new NavHostControllerKt$NavControllerSaver$2(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController createNavController(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    @l
    @Composable
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(@l NavController navController, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-120375203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-120375203, i5, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        State<NavBackStackEntry> collectAsState = SnapshotStateKt.collectAsState(navController.getCurrentBackStackEntryFlow(), null, null, composer, 56, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    @l
    @Composable
    public static final NavHostController rememberNavController(@l Navigator<? extends NavDestination>[] navigatorArr, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-312215566);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-312215566, i5, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        NavHostController navHostController = (NavHostController) RememberSaveableKt.m3351rememberSaveable(Arrays.copyOf(navigatorArr, navigatorArr.length), (Saver) NavControllerSaver(context), (String) null, (a) new NavHostControllerKt$rememberNavController$1(context), composer, 72, 4);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navHostController;
    }
}
