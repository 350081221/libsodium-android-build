package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import androidx.annotation.RequiresApi;
import androidx.core.splashscreen.ThemeUtils;
import java.time.Duration;
import java.time.Instant;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider;", "", "Lkotlin/r2;", "remove", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "impl", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "getIconView", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "Landroid/app/Activity;", "ctx", "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "platformView", "(Landroid/window/SplashScreenView;Landroid/app/Activity;)V", "ViewImpl", "ViewImpl31", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SplashScreenViewProvider {

    @p4.l
    private final ViewImpl impl;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "", "Lkotlin/r2;", "createSplashScreenView", "remove", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/view/ViewGroup;", "_splashScreenView$delegate", "Lkotlin/d0;", "get_splashScreenView", "()Landroid/view/ViewGroup;", "_splashScreenView", "getSplashScreenView", "splashScreenView", "Landroid/view/View;", "getIconView", "()Landroid/view/View;", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "<init>", "(Landroid/app/Activity;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static class ViewImpl {

        @p4.l
        private final d0 _splashScreenView$delegate;

        @p4.l
        private final Activity activity;

        public ViewImpl(@p4.l Activity activity) {
            d0 c5;
            l0.p(activity, "activity");
            this.activity = activity;
            c5 = f0.c(new SplashScreenViewProvider$ViewImpl$_splashScreenView$2(this));
            this._splashScreenView$delegate = c5;
        }

        private final ViewGroup get_splashScreenView() {
            return (ViewGroup) this._splashScreenView$delegate.getValue();
        }

        public void createSplashScreenView() {
            ViewGroup viewGroup;
            View rootView = ((ViewGroup) this.activity.findViewById(android.R.id.content)).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.addView(get_splashScreenView());
            }
        }

        @p4.l
        public final Activity getActivity() {
            return this.activity;
        }

        public long getIconAnimationDurationMillis() {
            return 0L;
        }

        public long getIconAnimationStartMillis() {
            return 0L;
        }

        @p4.l
        public View getIconView() {
            View findViewById = getSplashScreenView().findViewById(R.id.splashscreen_icon_view);
            l0.o(findViewById, "splashScreenView.findVie…d.splashscreen_icon_view)");
            return findViewById;
        }

        @p4.l
        public ViewGroup getSplashScreenView() {
            return get_splashScreenView();
        }

        public void remove() {
            ViewParent parent = getSplashScreenView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(getSplashScreenView());
            }
        }
    }

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "Lkotlin/r2;", "createSplashScreenView", "remove", "Landroid/window/SplashScreenView;", "platformView", "Landroid/window/SplashScreenView;", "getPlatformView", "()Landroid/window/SplashScreenView;", "setPlatformView", "(Landroid/window/SplashScreenView;)V", "getSplashScreenView", "splashScreenView", "Landroid/view/View;", "getIconView", "()Landroid/view/View;", "iconView", "", "getIconAnimationStartMillis", "()J", "iconAnimationStartMillis", "getIconAnimationDurationMillis", "iconAnimationDurationMillis", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    @RequiresApi(31)
    /* loaded from: classes2.dex */
    private static final class ViewImpl31 extends ViewImpl {
        public SplashScreenView platformView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewImpl31(@p4.l Activity activity) {
            super(activity);
            l0.p(activity, "activity");
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void createSplashScreenView() {
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationDurationMillis() {
            Duration iconAnimationDuration;
            long millis;
            iconAnimationDuration = getPlatformView().getIconAnimationDuration();
            if (iconAnimationDuration == null) {
                return 0L;
            }
            millis = iconAnimationDuration.toMillis();
            return millis;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationStartMillis() {
            Instant iconAnimationStart;
            long epochMilli;
            iconAnimationStart = getPlatformView().getIconAnimationStart();
            if (iconAnimationStart == null) {
                return 0L;
            }
            epochMilli = iconAnimationStart.toEpochMilli();
            return epochMilli;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        @p4.l
        public View getIconView() {
            View iconView;
            iconView = getPlatformView().getIconView();
            l0.m(iconView);
            return iconView;
        }

        @p4.l
        public final SplashScreenView getPlatformView() {
            SplashScreenView splashScreenView = this.platformView;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            l0.S("platformView");
            return null;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void remove() {
            getPlatformView().remove();
            Resources.Theme theme = getActivity().getTheme();
            l0.o(theme, "activity.theme");
            View decorView = getActivity().getWindow().getDecorView();
            l0.o(decorView, "activity.window.decorView");
            ThemeUtils.Api31.applyThemesSystemBarAppearance$default(theme, decorView, null, 4, null);
        }

        public final void setPlatformView(@p4.l SplashScreenView splashScreenView) {
            l0.p(splashScreenView, "<set-?>");
            this.platformView = splashScreenView;
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        @p4.l
        public SplashScreenView getSplashScreenView() {
            return getPlatformView();
        }
    }

    public SplashScreenViewProvider(@p4.l Activity ctx) {
        l0.p(ctx, "ctx");
        ViewImpl viewImpl31 = Build.VERSION.SDK_INT >= 31 ? new ViewImpl31(ctx) : new ViewImpl(ctx);
        viewImpl31.createSplashScreenView();
        this.impl = viewImpl31;
    }

    public final long getIconAnimationDurationMillis() {
        return this.impl.getIconAnimationDurationMillis();
    }

    public final long getIconAnimationStartMillis() {
        return this.impl.getIconAnimationStartMillis();
    }

    @p4.l
    public final View getIconView() {
        return this.impl.getIconView();
    }

    @p4.l
    public final View getView() {
        return this.impl.getSplashScreenView();
    }

    public final void remove() {
        this.impl.remove();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(31)
    public SplashScreenViewProvider(@p4.l SplashScreenView platformView, @p4.l Activity ctx) {
        this(ctx);
        l0.p(platformView, "platformView");
        l0.p(ctx, "ctx");
        ((ViewImpl31) this.impl).setPlatformView(platformView);
    }
}
