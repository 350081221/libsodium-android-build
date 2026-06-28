package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.ThemeUtils;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "Lkotlin/r2;", "install", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "condition", "setKeepOnScreenCondition", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "listener", "setOnExitAnimationListener", "Landroidx/core/splashscreen/SplashScreen$Impl;", "impl", "Landroidx/core/splashscreen/SplashScreen$Impl;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Companion", "Impl", "Impl31", "KeepOnScreenCondition", "OnExitAnimationListener", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes2.dex */
public final class SplashScreen {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final float MASK_FACTOR = 0.6666667f;

    @p4.l
    private final Impl impl;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "()V", "MASK_FACTOR", "", "installSplashScreen", "Landroidx/core/splashscreen/SplashScreen;", "Landroid/app/Activity;", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @p4.l
        @u3.m
        public final SplashScreen installSplashScreen(@p4.l Activity activity) {
            l0.p(activity, "<this>");
            SplashScreen splashScreen = new SplashScreen(activity, null);
            splashScreen.install();
            return splashScreen;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bC\u0010DJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0004J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl;", "", "Landroid/view/View;", "splashScreenView", "Landroid/graphics/drawable/Drawable;", "icon", "Lkotlin/r2;", "displaySplashScreenIcon", "install", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentTheme", "Landroid/util/TypedValue;", "typedValue", "setPostSplashScreenTheme", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "keepOnScreenCondition", "setKeepOnScreenCondition", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "exitAnimationListener", "setOnExitAnimationListener", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "splashScreenViewProvider", "dispatchOnExitAnimation", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "", "finalThemeId", "I", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "backgroundResId", "Ljava/lang/Integer;", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "hasBackground", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "splashScreenWaitPredicate", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "getSplashScreenWaitPredicate", "()Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setSplashScreenWaitPredicate", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "animationListener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "mSplashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "<init>", "(Landroid/app/Activity;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static class Impl {

        @p4.l
        private final Activity activity;

        @p4.m
        private OnExitAnimationListener animationListener;

        @p4.m
        private Integer backgroundColor;

        @p4.m
        private Integer backgroundResId;
        private int finalThemeId;
        private boolean hasBackground;

        @p4.m
        private Drawable icon;

        @p4.m
        private SplashScreenViewProvider mSplashScreenViewProvider;

        @p4.l
        private KeepOnScreenCondition splashScreenWaitPredicate;

        public Impl(@p4.l Activity activity) {
            l0.p(activity, "activity");
            this.activity = activity;
            this.splashScreenWaitPredicate = new KeepOnScreenCondition() { // from class: androidx.core.splashscreen.b
                @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
                public final boolean shouldKeepOnScreen() {
                    boolean m6401splashScreenWaitPredicate$lambda0;
                    m6401splashScreenWaitPredicate$lambda0 = SplashScreen.Impl.m6401splashScreenWaitPredicate$lambda0();
                    return m6401splashScreenWaitPredicate$lambda0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: dispatchOnExitAnimation$lambda-3, reason: not valid java name */
        public static final void m6400dispatchOnExitAnimation$lambda3(SplashScreenViewProvider splashScreenViewProvider, OnExitAnimationListener finalListener) {
            l0.p(splashScreenViewProvider, "$splashScreenViewProvider");
            l0.p(finalListener, "$finalListener");
            splashScreenViewProvider.getView().bringToFront();
            finalListener.onSplashScreenExit(splashScreenViewProvider);
        }

        private final void displaySplashScreenIcon(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(R.id.splashscreen_icon_view);
            if (this.hasBackground) {
                Drawable drawable2 = imageView.getContext().getDrawable(R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * SplashScreen.MASK_FACTOR;
                if (drawable2 != null) {
                    imageView.setBackground(new MaskedDrawable(drawable2, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * SplashScreen.MASK_FACTOR;
            }
            imageView.setImageDrawable(new MaskedDrawable(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: splashScreenWaitPredicate$lambda-0, reason: not valid java name */
        public static final boolean m6401splashScreenWaitPredicate$lambda0() {
            return false;
        }

        public final void dispatchOnExitAnimation(@p4.l final SplashScreenViewProvider splashScreenViewProvider) {
            l0.p(splashScreenViewProvider, "splashScreenViewProvider");
            final OnExitAnimationListener onExitAnimationListener = this.animationListener;
            if (onExitAnimationListener == null) {
                return;
            }
            this.animationListener = null;
            splashScreenViewProvider.getView().postOnAnimation(new Runnable() { // from class: androidx.core.splashscreen.a
                @Override // java.lang.Runnable
                public final void run() {
                    SplashScreen.Impl.m6400dispatchOnExitAnimation$lambda3(SplashScreenViewProvider.this, onExitAnimationListener);
                }
            });
        }

        @p4.l
        public final Activity getActivity() {
            return this.activity;
        }

        @p4.m
        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        @p4.m
        public final Integer getBackgroundResId() {
            return this.backgroundResId;
        }

        public final int getFinalThemeId() {
            return this.finalThemeId;
        }

        public final boolean getHasBackground() {
            return this.hasBackground;
        }

        @p4.m
        public final Drawable getIcon() {
            return this.icon;
        }

        @p4.l
        public final KeepOnScreenCondition getSplashScreenWaitPredicate() {
            return this.splashScreenWaitPredicate;
        }

        public void install() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.activity.getTheme();
            boolean z4 = true;
            if (currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.backgroundResId = Integer.valueOf(typedValue.resourceId);
                this.backgroundColor = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.icon = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                if (typedValue.resourceId != R.dimen.splashscreen_icon_size_with_background) {
                    z4 = false;
                }
                this.hasBackground = z4;
            }
            l0.o(currentTheme, "currentTheme");
            setPostSplashScreenTheme(currentTheme, typedValue);
        }

        public final void setBackgroundColor(@p4.m Integer num) {
            this.backgroundColor = num;
        }

        public final void setBackgroundResId(@p4.m Integer num) {
            this.backgroundResId = num;
        }

        public final void setFinalThemeId(int i5) {
            this.finalThemeId = i5;
        }

        public final void setHasBackground(boolean z4) {
            this.hasBackground = z4;
        }

        public final void setIcon(@p4.m Drawable drawable) {
            this.icon = drawable;
        }

        public void setKeepOnScreenCondition(@p4.l KeepOnScreenCondition keepOnScreenCondition) {
            l0.p(keepOnScreenCondition, "keepOnScreenCondition");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
            final View findViewById = this.activity.findViewById(android.R.id.content);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    SplashScreenViewProvider splashScreenViewProvider;
                    if (SplashScreen.Impl.this.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    splashScreenViewProvider = SplashScreen.Impl.this.mSplashScreenViewProvider;
                    if (splashScreenViewProvider != null) {
                        SplashScreen.Impl.this.dispatchOnExitAnimation(splashScreenViewProvider);
                        return true;
                    }
                    return true;
                }
            });
        }

        public void setOnExitAnimationListener(@p4.l OnExitAnimationListener exitAnimationListener) {
            l0.p(exitAnimationListener, "exitAnimationListener");
            this.animationListener = exitAnimationListener;
            final SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.activity);
            Integer num = this.backgroundResId;
            Integer num2 = this.backgroundColor;
            View view = splashScreenViewProvider.getView();
            if (num != null && num.intValue() != 0) {
                view.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                view.setBackgroundColor(num2.intValue());
            } else {
                view.setBackground(this.activity.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.icon;
            if (drawable != null) {
                displaySplashScreenIcon(view, drawable);
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@p4.l View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    l0.p(view2, "view");
                    if (!view2.isAttachedToWindow()) {
                        return;
                    }
                    view2.removeOnLayoutChangeListener(this);
                    if (!SplashScreen.Impl.this.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        SplashScreen.Impl.this.dispatchOnExitAnimation(splashScreenViewProvider);
                    } else {
                        SplashScreen.Impl.this.mSplashScreenViewProvider = splashScreenViewProvider;
                    }
                }
            });
        }

        protected final void setPostSplashScreenTheme(@p4.l Resources.Theme currentTheme, @p4.l TypedValue typedValue) {
            l0.p(currentTheme, "currentTheme");
            l0.p(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true)) {
                int i5 = typedValue.resourceId;
                this.finalThemeId = i5;
                if (i5 != 0) {
                    this.activity.setTheme(i5);
                }
            }
        }

        public final void setSplashScreenWaitPredicate(@p4.l KeepOnScreenCondition keepOnScreenCondition) {
            l0.p(keepOnScreenCondition, "<set-?>");
            this.splashScreenWaitPredicate = keepOnScreenCondition;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl31;", "Landroidx/core/splashscreen/SplashScreen$Impl;", "Lkotlin/r2;", "applyAppSystemUiTheme", "Landroid/window/SplashScreenView;", "child", "", "computeDecorFitsWindow", "install", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "keepOnScreenCondition", "setKeepOnScreenCondition", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "exitAnimationListener", "setOnExitAnimationListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setPreDrawListener", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "mDecorFitWindowInsets", "Z", "getMDecorFitWindowInsets", "()Z", "setMDecorFitWindowInsets", "(Z)V", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "hierarchyListener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    @RequiresApi(31)
    /* loaded from: classes2.dex */
    public static final class Impl31 extends Impl {

        @p4.l
        private final ViewGroup.OnHierarchyChangeListener hierarchyListener;
        private boolean mDecorFitWindowInsets;

        @p4.m
        private ViewTreeObserver.OnPreDrawListener preDrawListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl31(@p4.l final Activity activity) {
            super(activity);
            l0.p(activity, "activity");
            this.mDecorFitWindowInsets = true;
            this.hierarchyListener = new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(@p4.m View view, @p4.m View view2) {
                    if (view2 instanceof SplashScreenView) {
                        SplashScreen.Impl31 impl31 = SplashScreen.Impl31.this;
                        impl31.setMDecorFitWindowInsets(impl31.computeDecorFitsWindow((SplashScreenView) view2));
                        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(@p4.m View view, @p4.m View view2) {
                }
            };
        }

        private final void applyAppSystemUiTheme() {
            boolean z4;
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = getActivity().getTheme();
            Window window = getActivity().getWindow();
            boolean z5 = true;
            if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            if (theme.resolveAttribute(android.R.attr.enforceNavigationBarContrast, typedValue, true)) {
                if (typedValue.data != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                window.setNavigationBarContrastEnforced(z4);
            }
            if (theme.resolveAttribute(android.R.attr.enforceStatusBarContrast, typedValue, true)) {
                if (typedValue.data == 0) {
                    z5 = false;
                }
                window.setStatusBarContrastEnforced(z5);
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            l0.o(theme, "theme");
            ThemeUtils.Api31.applyThemesSystemBarAppearance(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.mDecorFitWindowInsets);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: setOnExitAnimationListener$lambda-0, reason: not valid java name */
        public static final void m6402setOnExitAnimationListener$lambda0(Impl31 this$0, OnExitAnimationListener exitAnimationListener, SplashScreenView splashScreenView) {
            l0.p(this$0, "this$0");
            l0.p(exitAnimationListener, "$exitAnimationListener");
            l0.p(splashScreenView, "splashScreenView");
            this$0.applyAppSystemUiTheme();
            exitAnimationListener.onSplashScreenExit(new SplashScreenViewProvider(splashScreenView, this$0.getActivity()));
        }

        public final boolean computeDecorFitsWindow(@p4.l SplashScreenView child) {
            WindowInsets build;
            View rootView;
            l0.p(child, "child");
            build = new WindowInsets.Builder().build();
            l0.o(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = child.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) {
                return false;
            }
            return true;
        }

        @p4.l
        public final ViewGroup.OnHierarchyChangeListener getHierarchyListener() {
            return this.hierarchyListener;
        }

        public final boolean getMDecorFitWindowInsets() {
            return this.mDecorFitWindowInsets;
        }

        @p4.m
        public final ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
            return this.preDrawListener;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void install() {
            Resources.Theme theme = getActivity().getTheme();
            l0.o(theme, "activity.theme");
            setPostSplashScreenTheme(theme, new TypedValue());
            ((ViewGroup) getActivity().getWindow().getDecorView()).setOnHierarchyChangeListener(this.hierarchyListener);
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setKeepOnScreenCondition(@p4.l KeepOnScreenCondition keepOnScreenCondition) {
            l0.p(keepOnScreenCondition, "keepOnScreenCondition");
            setSplashScreenWaitPredicate(keepOnScreenCondition);
            final View findViewById = getActivity().findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.preDrawListener != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.preDrawListener);
            }
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (SplashScreen.Impl31.this.getSplashScreenWaitPredicate().shouldKeepOnScreen()) {
                        return false;
                    }
                    findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            };
            this.preDrawListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }

        public final void setMDecorFitWindowInsets(boolean z4) {
            this.mDecorFitWindowInsets = z4;
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setOnExitAnimationListener(@p4.l final OnExitAnimationListener exitAnimationListener) {
            android.window.SplashScreen splashScreen;
            l0.p(exitAnimationListener, "exitAnimationListener");
            splashScreen = getActivity().getSplashScreen();
            splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: androidx.core.splashscreen.h
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    SplashScreen.Impl31.m6402setOnExitAnimationListener$lambda0(SplashScreen.Impl31.this, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final void setPreDrawListener(@p4.m ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.preDrawListener = onPreDrawListener;
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'¨\u0006\u0004"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "shouldKeepOnScreen", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface KeepOnScreenCondition {
        @MainThread
        boolean shouldKeepOnScreen();
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "splashScreenViewProvider", "Lkotlin/r2;", "onSplashScreenExit", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public interface OnExitAnimationListener {
        @MainThread
        void onSplashScreenExit(@p4.l SplashScreenViewProvider splashScreenViewProvider);
    }

    private SplashScreen(Activity activity) {
        Impl impl;
        if (Build.VERSION.SDK_INT >= 31) {
            impl = new Impl31(activity);
        } else {
            impl = new Impl(activity);
        }
        this.impl = impl;
    }

    public /* synthetic */ SplashScreen(Activity activity, w wVar) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void install() {
        this.impl.install();
    }

    @p4.l
    @u3.m
    public static final SplashScreen installSplashScreen(@p4.l Activity activity) {
        return Companion.installSplashScreen(activity);
    }

    public final void setKeepOnScreenCondition(@p4.l KeepOnScreenCondition condition) {
        l0.p(condition, "condition");
        this.impl.setKeepOnScreenCondition(condition);
    }

    public final void setOnExitAnimationListener(@p4.l OnExitAnimationListener listener) {
        l0.p(listener, "listener");
        this.impl.setOnExitAnimationListener(listener);
    }
}
