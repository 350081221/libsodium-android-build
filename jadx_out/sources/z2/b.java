package z2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;

/* loaded from: classes3.dex */
public class b {
    private b() {
        throw new AssertionError();
    }

    public static int a(Context context, int i5) {
        return (int) (i5 * context.getResources().getDisplayMetrics().density);
    }

    public static int b(Activity activity) {
        int i5 = 0;
        if (!f(activity)) {
            return 0;
        }
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        if (identifier > 0) {
            i5 = resources.getDimensionPixelSize(identifier);
        }
        a.f("NavigationBar的高度:" + i5);
        return i5;
    }

    public static int c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int d(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int e(Context context) {
        int a5 = a(context, 20);
        a.f("common statusBar height:" + a5);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        if (identifier > 0) {
            a5 = context.getResources().getDimensionPixelSize(identifier);
            a.f("real statusBar height:" + a5);
        }
        a.f("finally statusBar height:" + a5);
        return a5;
    }

    public static boolean f(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        if (point2.y != point.y) {
            return true;
        }
        return false;
    }
}
