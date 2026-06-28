package com.lzf.easyfloat.utils;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006$"}, d2 = {"Lcom/lzf/easyfloat/utils/b;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "", "j", "k", "l", "i", "", "pxVal", "", "m", "dpVal", bi.ay, "pxValue", "n", "spValue", bi.aA, "f", "d", "Landroid/graphics/Point;", "e", socket.g.f22386a, "Landroid/view/View;", "view", "q", "c", "b", bi.aJ, "o", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f9276a = new b();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f9277b = "DisplayUtils--->";

    private b() {
    }

    private final boolean i(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i5 = displayMetrics.heightPixels;
            int i6 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            int i7 = displayMetrics2.heightPixels;
            int i8 = displayMetrics2.widthPixels;
            if (c(context) + i7 > i5) {
                return false;
            }
            if (i6 - i8 <= 0 && i5 - i7 <= 0) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    private final boolean j(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) != 0;
    }

    private final boolean k(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    private final boolean l(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
    }

    public final int a(@l Context context, float f5) {
        l0.p(context, "context");
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int b(@l Context context) {
        l0.p(context, "context");
        if (h(context)) {
            return c(context);
        }
        return 0;
    }

    public final int c(@l Context context) {
        l0.p(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final int d(@l Context context) {
        l0.p(context, "context");
        return e(context).y;
    }

    @l
    public final Point e(@l Context context) {
        l0.p(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            return point;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final int f(@l Context context) {
        l0.p(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            if (context.getResources().getConfiguration().orientation == 1) {
                return displayMetrics.widthPixels;
            }
            return displayMetrics.widthPixels - b(context);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final int g(@l Context context) {
        l0.p(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final boolean h(@l Context context) {
        l0.p(context, "context");
        if (c(context) == 0) {
            return false;
        }
        o2.f fVar = o2.f.f20845a;
        if (fVar.b() && j(context)) {
            return false;
        }
        if (fVar.d() && k(context)) {
            return false;
        }
        if (fVar.f() && l(context)) {
            return false;
        }
        return i(context);
    }

    public final int m(@l Context context, float f5) {
        l0.p(context, "context");
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int n(@l Context context, float f5) {
        l0.p(context, "context");
        return (int) ((f5 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final int o(@l Context context) {
        l0.p(context, "context");
        Point e5 = e(context);
        int i5 = e5.x;
        int i6 = e5.y;
        if (i5 > i6) {
            return i6;
        }
        return i6 - b(context);
    }

    public final int p(@l Context context, float f5) {
        l0.p(context, "context");
        return (int) ((f5 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final int q(@l View view) {
        l0.p(view, "view");
        Context applicationContext = view.getContext().getApplicationContext();
        l0.o(applicationContext, "view.context.applicationContext");
        return g(applicationContext);
    }
}
