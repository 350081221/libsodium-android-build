package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.annotation.VisibleForTesting;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\" \u0010\u000f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f\"\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Lkotlin/r2;", "enable", "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "enableEdgeToEdge", "", "DefaultLightScrim", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultDarkScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "Landroidx/activity/EdgeToEdgeImpl;", "Impl", "Landroidx/activity/EdgeToEdgeImpl;", "activity_release"}, k = 2, mv = {1, 8, 0})
@u3.h(name = "EdgeToEdge")
@r1({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
/* loaded from: classes.dex */
public final class EdgeToEdge {

    @p4.m
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    @u3.h(name = "enable")
    @u3.i
    public static final void enable(@p4.l ComponentActivity componentActivity) {
        l0.p(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    @u3.h(name = "enable")
    @u3.i
    public static final void enable(@p4.l ComponentActivity componentActivity, @p4.l SystemBarStyle statusBarStyle) {
        l0.p(componentActivity, "<this>");
        l0.p(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    @u3.h(name = "enable")
    @u3.i
    public static final void enable(@p4.l ComponentActivity componentActivity, @p4.l SystemBarStyle statusBarStyle, @p4.l SystemBarStyle navigationBarStyle) {
        l0.p(componentActivity, "<this>");
        l0.p(statusBarStyle, "statusBarStyle");
        l0.p(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        v3.l<Resources, Boolean> detectDarkMode$activity_release = statusBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        l0.o(resources, "view.resources");
        boolean booleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        v3.l<Resources, Boolean> detectDarkMode$activity_release2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        l0.o(resources2, "view.resources");
        boolean booleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        EdgeToEdgeImpl edgeToEdgeImpl = Impl;
        if (edgeToEdgeImpl == null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                edgeToEdgeImpl = new EdgeToEdgeApi30();
            } else if (i5 >= 29) {
                edgeToEdgeImpl = new EdgeToEdgeApi29();
            } else if (i5 >= 28) {
                edgeToEdgeImpl = new EdgeToEdgeApi28();
            } else if (i5 >= 26) {
                edgeToEdgeImpl = new EdgeToEdgeApi26();
            } else {
                edgeToEdgeImpl = new EdgeToEdgeApi23();
            }
        }
        Window window = componentActivity.getWindow();
        l0.o(window, "window");
        edgeToEdgeImpl.setUp(statusBarStyle, navigationBarStyle, window, decorView, booleanValue, booleanValue2);
        Window window2 = componentActivity.getWindow();
        l0.o(window2, "window");
        edgeToEdgeImpl.adjustLayoutInDisplayCutoutMode(window2);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i5 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }
}
