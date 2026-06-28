package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "bounds", "Lkotlin/r2;", "getRectSizeFromDisplay", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "", "getNavigationBarHeight", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "getCutoutForDisplay", "Landroidx/window/layout/WindowMetrics;", "computeCurrentWindowMetrics", "computeMaximumWindowMetrics", "computeWindowBoundsQ$window_release", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "computeWindowBoundsQ", "computeWindowBoundsP$window_release", "computeWindowBoundsP", "computeWindowBoundsN$window_release", "computeWindowBoundsN", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsIceCreamSandwich", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "(Landroid/view/Display;)Landroid/graphics/Point;", "getRealSizeForDisplay", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {

    @l
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();

    @l
    private static final String TAG;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        l0.o(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private WindowMetricsCalculatorCompat() {
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException e5) {
            Log.w(TAG, e5);
        } catch (IllegalAccessException e6) {
            Log.w(TAG, e6);
        } catch (InstantiationException e7) {
            Log.w(TAG, e7);
        } catch (NoSuchFieldException e8) {
            Log.w(TAG, e8);
        } catch (NoSuchMethodException e9) {
            Log.w(TAG, e9);
        } catch (InvocationTargetException e10) {
            Log.w(TAG, e10);
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @l
    public WindowMetrics computeCurrentWindowMetrics(@l Activity activity) {
        Rect computeWindowBoundsN$window_release;
        l0.p(activity, "activity");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            computeWindowBoundsN$window_release = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (i5 >= 29) {
            computeWindowBoundsN$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (i5 >= 28) {
            computeWindowBoundsN$window_release = computeWindowBoundsP$window_release(activity);
        } else {
            computeWindowBoundsN$window_release = computeWindowBoundsN$window_release(activity);
        }
        return new WindowMetrics(computeWindowBoundsN$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @l
    public WindowMetrics computeMaximumWindowMetrics(@l Activity activity) {
        Rect rect;
        l0.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            l0.o(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    @l
    @RequiresApi(14)
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(@l Activity activity) {
        int i5;
        l0.p(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        l0.o(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i6 = realSizeForDisplay$window_release.x;
        if (i6 != 0 && (i5 = realSizeForDisplay$window_release.y) != 0) {
            rect.right = i6;
            rect.bottom = i5;
        } else {
            defaultDisplay.getRectSize(rect);
        }
        return rect;
    }

    @l
    @RequiresApi(24)
    public final Rect computeWindowBoundsN$window_release(@l Activity activity) {
        l0.p(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            l0.o(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i5 = rect.bottom;
            if (i5 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i5 + navigationBarHeight;
            } else {
                int i6 = rect.right;
                if (i6 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i6 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    @l
    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsP$window_release(@l Activity activity) {
        DisplayCutout cutoutForDisplay;
        l0.p(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (IllegalAccessException e5) {
            Log.w(TAG, e5);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException e6) {
            Log.w(TAG, e6);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException e7) {
            Log.w(TAG, e7);
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException e8) {
            Log.w(TAG, e8);
            getRectSizeFromDisplay(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        l0.o(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i5 = rect.bottom;
            if (i5 + navigationBarHeight == point.y) {
                rect.bottom = i5 + navigationBarHeight;
            } else {
                int i6 = rect.right;
                if (i6 + navigationBarHeight == point.x) {
                    rect.right = i6 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i7 = rect.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (i7 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
            }
            if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect;
    }

    @l
    @RequiresApi(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsQ$window_release(@l Activity activity) {
        l0.p(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e5) {
            Log.w(TAG, e5);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e6) {
            Log.w(TAG, e6);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e7) {
            Log.w(TAG, e7);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e8) {
            Log.w(TAG, e8);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    @l
    @RequiresApi(14)
    @VisibleForTesting
    public final Point getRealSizeForDisplay$window_release(@l Display display) {
        l0.p(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
