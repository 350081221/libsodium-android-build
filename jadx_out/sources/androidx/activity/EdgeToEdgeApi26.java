package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0017¨\u0006\u0010"}, d2 = {"Landroidx/activity/EdgeToEdgeApi26;", "Landroidx/activity/EdgeToEdgeBase;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "Lkotlin/r2;", "setUp", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
class EdgeToEdgeApi26 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(@p4.l SystemBarStyle statusBarStyle, @p4.l SystemBarStyle navigationBarStyle, @p4.l Window window, @p4.l View view, boolean z4, boolean z5) {
        l0.p(statusBarStyle, "statusBarStyle");
        l0.p(navigationBarStyle, "navigationBarStyle");
        l0.p(window, "window");
        l0.p(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(statusBarStyle.getScrim$activity_release(z4));
        window.setNavigationBarColor(navigationBarStyle.getScrim$activity_release(z5));
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!z4);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!z5);
    }
}
