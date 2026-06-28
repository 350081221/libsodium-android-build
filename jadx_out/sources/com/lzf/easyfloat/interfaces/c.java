package com.lzf.easyfloat.interfaces;

import android.animation.Animator;
import android.view.View;
import android.view.WindowManager;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J*\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/lzf/easyfloat/interfaces/c;", "", "Landroid/view/View;", "view", "Landroid/view/WindowManager$LayoutParams;", "params", "Landroid/view/WindowManager;", "windowManager", "Lm2/b;", "sidePattern", "Landroid/animation/Animator;", bi.ay, "b", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface c {

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        @m
        public static Animator a(@l c cVar, @l View view, @l WindowManager.LayoutParams params, @l WindowManager windowManager, @l m2.b sidePattern) {
            l0.p(cVar, "this");
            l0.p(view, "view");
            l0.p(params, "params");
            l0.p(windowManager, "windowManager");
            l0.p(sidePattern, "sidePattern");
            return null;
        }

        @m
        public static Animator b(@l c cVar, @l View view, @l WindowManager.LayoutParams params, @l WindowManager windowManager, @l m2.b sidePattern) {
            l0.p(cVar, "this");
            l0.p(view, "view");
            l0.p(params, "params");
            l0.p(windowManager, "windowManager");
            l0.p(sidePattern, "sidePattern");
            return null;
        }
    }

    @m
    Animator a(@l View view, @l WindowManager.LayoutParams layoutParams, @l WindowManager windowManager, @l m2.b bVar);

    @m
    Animator b(@l View view, @l WindowManager.LayoutParams layoutParams, @l WindowManager windowManager, @l m2.b bVar);
}
