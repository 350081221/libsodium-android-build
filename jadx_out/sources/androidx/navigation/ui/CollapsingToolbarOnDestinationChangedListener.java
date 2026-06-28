package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.ref.WeakReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u001c\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0014R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001e"}, d2 = {"Landroidx/navigation/ui/CollapsingToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/r2;", "onDestinationChanged", "", com.alipay.sdk.m.x.d.f3030v, com.alipay.sdk.m.x.d.f3023o, "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "Ljava/lang/ref/WeakReference;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "mCollapsingToolbarLayoutWeakReference", "Ljava/lang/ref/WeakReference;", "Landroidx/appcompat/widget/Toolbar;", "mToolbarWeakReference", "collapsingToolbarLayout", "toolbar", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "<init>", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/AppBarConfiguration;)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CollapsingToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {

    @l
    private final WeakReference<CollapsingToolbarLayout> mCollapsingToolbarLayoutWeakReference;

    @l
    private final WeakReference<Toolbar> mToolbarWeakReference;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarOnDestinationChangedListener(@p4.l com.google.android.material.appbar.CollapsingToolbarLayout r3, @p4.l androidx.appcompat.widget.Toolbar r4, @p4.l androidx.navigation.ui.AppBarConfiguration r5) {
        /*
            r2 = this;
            java.lang.String r0 = "collapsingToolbarLayout"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.l0.p(r5, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "collapsingToolbarLayout.context"
            kotlin.jvm.internal.l0.o(r0, r1)
            r2.<init>(r0, r5)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.mCollapsingToolbarLayoutWeakReference = r5
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r2.mToolbarWeakReference = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.ui.CollapsingToolbarOnDestinationChangedListener.<init>(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, androidx.navigation.ui.AppBarConfiguration):void");
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(@l NavController controller, @l NavDestination destination, @m Bundle bundle) {
        l0.p(controller, "controller");
        l0.p(destination, "destination");
        CollapsingToolbarLayout collapsingToolbarLayout = this.mCollapsingToolbarLayoutWeakReference.get();
        Toolbar toolbar = this.mToolbarWeakReference.get();
        if (collapsingToolbarLayout != null && toolbar != null) {
            super.onDestinationChanged(controller, destination, bundle);
        } else {
            controller.removeOnDestinationChangedListener(this);
        }
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(@m Drawable drawable, @StringRes int i5) {
        boolean z4;
        Toolbar toolbar = this.mToolbarWeakReference.get();
        if (toolbar != null) {
            if (drawable == null && toolbar.getNavigationIcon() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i5);
            if (z4) {
                TransitionManager.beginDelayedTransition(toolbar);
            }
        }
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(@m CharSequence charSequence) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.mCollapsingToolbarLayoutWeakReference.get();
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(charSequence);
        }
    }
}
