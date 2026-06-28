package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.u0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH$J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "showAsDrawerIndicator", "Lkotlin/r2;", "setActionBarUpIndicator", "", com.alipay.sdk.m.x.d.f3030v, com.alipay.sdk.m.x.d.f3023o, "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "onDestinationChanged", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "Ljava/lang/ref/WeakReference;", "Landroidx/customview/widget/Openable;", "kotlin.jvm.PlatformType", "openableLayoutWeakReference", "Ljava/lang/ref/WeakReference;", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "arrowDrawable", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "<init>", "(Landroid/content/Context;Landroidx/navigation/ui/AppBarConfiguration;)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAbstractAppBarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAppBarOnDestinationChangedListener.kt\nandroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes2.dex */
public abstract class AbstractAppBarOnDestinationChangedListener implements NavController.OnDestinationChangedListener {

    @m
    private ValueAnimator animator;

    @m
    private DrawerArrowDrawable arrowDrawable;

    @l
    private final AppBarConfiguration configuration;

    @l
    private final Context context;

    @m
    private final WeakReference<Openable> openableLayoutWeakReference;

    public AbstractAppBarOnDestinationChangedListener(@l Context context, @l AppBarConfiguration configuration) {
        WeakReference<Openable> weakReference;
        l0.p(context, "context");
        l0.p(configuration, "configuration");
        this.context = context;
        this.configuration = configuration;
        Openable openableLayout = configuration.getOpenableLayout();
        if (openableLayout != null) {
            weakReference = new WeakReference<>(openableLayout);
        } else {
            weakReference = null;
        }
        this.openableLayoutWeakReference = weakReference;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void setActionBarUpIndicator(boolean z4) {
        u0 a5;
        int i5;
        float f5;
        DrawerArrowDrawable drawerArrowDrawable = this.arrowDrawable;
        if (drawerArrowDrawable == null || (a5 = q1.a(drawerArrowDrawable, Boolean.TRUE)) == null) {
            DrawerArrowDrawable drawerArrowDrawable2 = new DrawerArrowDrawable(this.context);
            this.arrowDrawable = drawerArrowDrawable2;
            a5 = q1.a(drawerArrowDrawable2, Boolean.FALSE);
        }
        DrawerArrowDrawable drawerArrowDrawable3 = (DrawerArrowDrawable) a5.component1();
        boolean booleanValue = ((Boolean) a5.component2()).booleanValue();
        if (z4) {
            i5 = R.string.nav_app_bar_open_drawer_description;
        } else {
            i5 = R.string.nav_app_bar_navigate_up_description;
        }
        setNavigationIcon(drawerArrowDrawable3, i5);
        if (z4) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        if (booleanValue) {
            float progress = drawerArrowDrawable3.getProgress();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(drawerArrowDrawable3, "progress", progress, f5);
            this.animator = ofFloat;
            l0.n(ofFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            ofFloat.start();
            return;
        }
        drawerArrowDrawable3.setProgress(f5);
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(@l NavController controller, @l NavDestination destination, @m Bundle bundle) {
        Openable openable;
        l0.p(controller, "controller");
        l0.p(destination, "destination");
        if (destination instanceof FloatingWindow) {
            return;
        }
        WeakReference<Openable> weakReference = this.openableLayoutWeakReference;
        if (weakReference != null) {
            openable = weakReference.get();
        } else {
            openable = null;
        }
        if (this.openableLayoutWeakReference != null && openable == null) {
            controller.removeOnDestinationChangedListener(this);
            return;
        }
        String fillInLabel = destination.fillInLabel(this.context, bundle);
        if (fillInLabel != null) {
            setTitle(fillInLabel);
        }
        boolean isTopLevelDestination = this.configuration.isTopLevelDestination(destination);
        boolean z4 = false;
        if (openable == null && isTopLevelDestination) {
            setNavigationIcon(null, 0);
            return;
        }
        if (openable != null && isTopLevelDestination) {
            z4 = true;
        }
        setActionBarUpIndicator(z4);
    }

    protected abstract void setNavigationIcon(@m Drawable drawable, @StringRes int i5);

    protected abstract void setTitle(@m CharSequence charSequence);
}
