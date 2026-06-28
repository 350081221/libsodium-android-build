package com.google.accompanist.systemuicontroller;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b0\u00101J9\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJA\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u0016\u0010\u001dR$\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010)\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010,\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010/\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/google/accompanist/systemuicontroller/b;", "Lcom/google/accompanist/systemuicontroller/c;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "Lkotlin/r2;", "b", "(JZLv3/l;)V", "navigationBarContrastEnforced", "q", "(JZZLv3/l;)V", "Landroid/view/View;", bi.ay, "Landroid/view/View;", "view", "Landroid/view/Window;", "Landroid/view/Window;", "window", "Landroidx/core/view/WindowInsetsControllerCompat;", "c", "Landroidx/core/view/WindowInsetsControllerCompat;", "windowInsetsController", "", t0.b.f22420d, bi.aJ, "()I", "(I)V", "systemBarsBehavior", "o", "()Z", "n", "(Z)V", "isStatusBarVisible", "l", "d", "isNavigationBarVisible", "j", bi.aE, "statusBarDarkContentEnabled", "m", "k", "navigationBarDarkContentEnabled", "e", "i", "isNavigationBarContrastEnforced", "<init>", "(Landroid/view/View;Landroid/view/Window;)V", "systemuicontroller_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final View f7296a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private final Window f7297b;

    /* renamed from: c, reason: collision with root package name */
    @m
    private final WindowInsetsControllerCompat f7298c;

    public b(@l View view, @m Window window) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        l0.p(view, "view");
        this.f7296a = view;
        this.f7297b = window;
        if (window != null) {
            windowInsetsControllerCompat = WindowCompat.getInsetsController(window, view);
        } else {
            windowInsetsControllerCompat = null;
        }
        this.f7298c = windowInsetsControllerCompat;
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void b(long j5, boolean z4, @l v3.l<? super Color, Color> transformColorForLightContent) {
        l0.p(transformColorForLightContent, "transformColorForLightContent");
        s(z4);
        Window window = this.f7297b;
        if (window != null) {
            if (z4) {
                WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
                boolean z5 = false;
                if (windowInsetsControllerCompat != null && windowInsetsControllerCompat.isAppearanceLightStatusBars()) {
                    z5 = true;
                }
                if (!z5) {
                    j5 = transformColorForLightContent.invoke(Color.m3724boximpl(j5)).m3744unboximpl();
                }
            }
            window.setStatusBarColor(ColorKt.m3788toArgb8_81llA(j5));
        }
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void c(int i5) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.setSystemBarsBehavior(i5);
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void d(boolean z4) {
        if (z4) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
            if (windowInsetsControllerCompat != null) {
                windowInsetsControllerCompat.show(WindowInsetsCompat.Type.navigationBars());
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = this.f7298c;
        if (windowInsetsControllerCompat2 != null) {
            windowInsetsControllerCompat2.hide(WindowInsetsCompat.Type.navigationBars());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // com.google.accompanist.systemuicontroller.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L18
            android.view.Window r0 = r3.f7297b
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = com.google.accompanist.systemuicontroller.a.a(r0)
            if (r0 != r1) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L18
            r2 = r1
        L18:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.systemuicontroller.b.e():boolean");
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public int h() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
        if (windowInsetsControllerCompat != null) {
            return windowInsetsControllerCompat.getSystemBarsBehavior();
        }
        return 0;
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void i(boolean z4) {
        Window window;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.f7297b) != null) {
            window.setNavigationBarContrastEnforced(z4);
        }
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public boolean j() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
        return windowInsetsControllerCompat != null && windowInsetsControllerCompat.isAppearanceLightStatusBars();
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void k(boolean z4) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(z4);
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public boolean l() {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.f7296a);
        if (rootWindowInsets == null || !rootWindowInsets.isVisible(WindowInsetsCompat.Type.navigationBars())) {
            return false;
        }
        return true;
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public boolean m() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
        return windowInsetsControllerCompat != null && windowInsetsControllerCompat.isAppearanceLightNavigationBars();
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void n(boolean z4) {
        if (z4) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
            if (windowInsetsControllerCompat != null) {
                windowInsetsControllerCompat.show(WindowInsetsCompat.Type.statusBars());
                return;
            }
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat2 = this.f7298c;
        if (windowInsetsControllerCompat2 != null) {
            windowInsetsControllerCompat2.hide(WindowInsetsCompat.Type.statusBars());
        }
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public boolean o() {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.f7296a);
        if (rootWindowInsets == null || !rootWindowInsets.isVisible(WindowInsetsCompat.Type.statusBars())) {
            return false;
        }
        return true;
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void q(long j5, boolean z4, boolean z5, @l v3.l<? super Color, Color> transformColorForLightContent) {
        l0.p(transformColorForLightContent, "transformColorForLightContent");
        k(z4);
        i(z5);
        Window window = this.f7297b;
        if (window != null) {
            if (z4) {
                WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
                boolean z6 = false;
                if (windowInsetsControllerCompat != null && windowInsetsControllerCompat.isAppearanceLightNavigationBars()) {
                    z6 = true;
                }
                if (!z6) {
                    j5 = transformColorForLightContent.invoke(Color.m3724boximpl(j5)).m3744unboximpl();
                }
            }
            window.setNavigationBarColor(ColorKt.m3788toArgb8_81llA(j5));
        }
    }

    @Override // com.google.accompanist.systemuicontroller.c
    public void s(boolean z4) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f7298c;
        if (windowInsetsControllerCompat == null) {
            return;
        }
        windowInsetsControllerCompat.setAppearanceLightStatusBars(z4);
    }
}
