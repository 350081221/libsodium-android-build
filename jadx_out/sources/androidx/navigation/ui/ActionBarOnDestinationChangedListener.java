package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0014R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "", com.alipay.sdk.m.x.d.f3030v, "Lkotlin/r2;", com.alipay.sdk.m.x.d.f3023o, "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {

    @l
    private final AppCompatActivity activity;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionBarOnDestinationChangedListener(@p4.l androidx.appcompat.app.AppCompatActivity r3, @p4.l androidx.navigation.ui.AppBarConfiguration r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.l0.p(r4, r0)
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r3.getDrawerToggleDelegate()
            if (r0 == 0) goto L1f
            android.content.Context r0 = r0.getActionBarThemedContext()
            java.lang.String r1 = "checkNotNull(activity.dr… }.actionBarThemedContext"
            kotlin.jvm.internal.l0.o(r0, r1)
            r2.<init>(r0, r4)
            r2.activity = r3
            return
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Activity "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " does not have an DrawerToggleDelegate set"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.ui.ActionBarOnDestinationChangedListener.<init>(androidx.appcompat.app.AppCompatActivity, androidx.navigation.ui.AppBarConfiguration):void");
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(@m Drawable drawable, @StringRes int i5) {
        boolean z4;
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            l0.o(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            if (drawable != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            supportActionBar.setDisplayHomeAsUpEnabled(z4);
            ActionBarDrawerToggle.Delegate drawerToggleDelegate = this.activity.getDrawerToggleDelegate();
            if (drawerToggleDelegate != null) {
                l0.o(drawerToggleDelegate, "checkNotNull(activity.dr…leDelegate set\"\n        }");
                drawerToggleDelegate.setActionBarUpIndicator(drawable, i5);
                return;
            } else {
                throw new IllegalStateException(("Activity " + this.activity + " does not have an DrawerToggleDelegate set").toString());
            }
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(@m CharSequence charSequence) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            l0.o(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            supportActionBar.setTitle(charSequence);
        } else {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
    }
}
