package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "()V", "Api31", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class ThemeUtils {

    @p4.l
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\r"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "Landroid/view/View;", "decor", "Landroid/util/TypedValue;", "tv", "Lkotlin/r2;", "applyThemesSystemBarAppearance", "<init>", "()V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class Api31 {

        @p4.l
        public static final Api31 INSTANCE = new Api31();

        private Api31() {
        }

        @DoNotInline
        @u3.i
        @u3.m
        public static final void applyThemesSystemBarAppearance(@p4.l Resources.Theme theme, @p4.l View decor) {
            l0.p(theme, "theme");
            l0.p(decor, "decor");
            applyThemesSystemBarAppearance$default(theme, decor, null, 4, null);
        }

        @DoNotInline
        @u3.i
        @u3.m
        public static final void applyThemesSystemBarAppearance(@p4.l Resources.Theme theme, @p4.l View decor, @p4.l TypedValue tv) {
            int i5;
            WindowInsetsController windowInsetsController;
            l0.p(theme, "theme");
            l0.p(decor, "decor");
            l0.p(tv, "tv");
            if (theme.resolveAttribute(android.R.attr.windowLightStatusBar, tv, true) && tv.data != 0) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            if (theme.resolveAttribute(android.R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
                i5 |= 16;
            }
            windowInsetsController = decor.getWindowInsetsController();
            l0.m(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i5, 24);
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(Resources.Theme theme, View view, TypedValue typedValue, int i5, Object obj) {
            if ((i5 & 4) != 0) {
                typedValue = new TypedValue();
            }
            applyThemesSystemBarAppearance(theme, view, typedValue);
        }
    }

    private ThemeUtils() {
    }
}
