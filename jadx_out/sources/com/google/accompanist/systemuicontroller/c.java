package com.google.accompanist.systemuicontroller;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import v3.l;

@Stable
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\bg\u0018\u00002\u00020\u0001J=\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJG\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJG\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\rR\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001c\u0010$\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001c\u0010'\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R$\u0010*\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001c\u0010\u000e\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lcom/google/accompanist/systemuicontroller/c;", "", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "darkIcons", "Lkotlin/Function1;", "transformColorForLightContent", "Lkotlin/r2;", "b", "(JZLv3/l;)V", "navigationBarContrastEnforced", "q", "(JZZLv3/l;)V", "isNavigationBarContrastEnforced", "r", "", bi.aJ, "()I", "c", "(I)V", "systemBarsBehavior", "o", "()Z", "n", "(Z)V", "isStatusBarVisible", "l", "d", "isNavigationBarVisible", t0.b.f22420d, bi.aA, "f", "isSystemBarsVisible", "j", bi.aE, "statusBarDarkContentEnabled", "m", "k", "navigationBarDarkContentEnabled", bi.ay, "v", "systemBarsDarkContentEnabled", "e", "i", "systemuicontroller_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface c {
    static /* synthetic */ void g(c cVar, long j5, boolean z4, boolean z5, l lVar, int i5, Object obj) {
        boolean z6;
        if (obj == null) {
            if ((i5 & 2) != 0) {
                if (ColorKt.m3786luminance8_81llA(j5) > 0.5f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            boolean z7 = z4;
            if ((i5 & 4) != 0) {
                z6 = true;
            } else {
                z6 = z5;
            }
            if ((i5 & 8) != 0) {
                lVar = d.f7300b;
            }
            cVar.q(j5, z7, z6, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void t(c cVar, long j5, boolean z4, l lVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                if (ColorKt.m3786luminance8_81llA(j5) > 0.5f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if ((i5 & 4) != 0) {
                lVar = d.f7300b;
            }
            cVar.b(j5, z4, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
    }

    static /* synthetic */ void u(c cVar, long j5, boolean z4, boolean z5, l lVar, int i5, Object obj) {
        boolean z6;
        if (obj == null) {
            if ((i5 & 2) != 0) {
                if (ColorKt.m3786luminance8_81llA(j5) > 0.5f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            boolean z7 = z4;
            if ((i5 & 4) != 0) {
                z6 = true;
            } else {
                z6 = z5;
            }
            if ((i5 & 8) != 0) {
                lVar = d.f7300b;
            }
            cVar.r(j5, z7, z6, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
    }

    default boolean a() {
        return j() && m();
    }

    void b(long j5, boolean z4, @p4.l l<? super Color, Color> lVar);

    void c(int i5);

    void d(boolean z4);

    boolean e();

    default void f(boolean z4) {
        n(z4);
        d(z4);
    }

    int h();

    void i(boolean z4);

    boolean j();

    void k(boolean z4);

    boolean l();

    boolean m();

    void n(boolean z4);

    boolean o();

    default boolean p() {
        return l() && o();
    }

    void q(long j5, boolean z4, boolean z5, @p4.l l<? super Color, Color> lVar);

    default void r(long j5, boolean z4, boolean z5, @p4.l l<? super Color, Color> transformColorForLightContent) {
        l0.p(transformColorForLightContent, "transformColorForLightContent");
        b(j5, z4, transformColorForLightContent);
        q(j5, z4, z5, transformColorForLightContent);
    }

    void s(boolean z4);

    default void v(boolean z4) {
        s(z4);
        k(z4);
    }
}
