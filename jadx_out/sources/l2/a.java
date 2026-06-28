package l2;

import android.animation.Animator;
import android.view.View;
import android.view.WindowManager;
import com.lzf.easyfloat.data.FloatConfig;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Ll2/a;", "", "Landroid/animation/Animator;", bi.ay, "b", "Landroid/view/View;", "Landroid/view/View;", "view", "Landroid/view/WindowManager$LayoutParams;", "Landroid/view/WindowManager$LayoutParams;", "params", "Landroid/view/WindowManager;", "c", "Landroid/view/WindowManager;", "windowManager", "Lcom/lzf/easyfloat/data/FloatConfig;", "d", "Lcom/lzf/easyfloat/data/FloatConfig;", "config", "<init>", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Lcom/lzf/easyfloat/data/FloatConfig;)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final View f20723a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final WindowManager.LayoutParams f20724b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final WindowManager f20725c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final FloatConfig f20726d;

    public a(@l View view, @l WindowManager.LayoutParams params, @l WindowManager windowManager, @l FloatConfig config) {
        l0.p(view, "view");
        l0.p(params, "params");
        l0.p(windowManager, "windowManager");
        l0.p(config, "config");
        this.f20723a = view;
        this.f20724b = params;
        this.f20725c = windowManager;
        this.f20726d = config;
    }

    @m
    public final Animator a() {
        com.lzf.easyfloat.interfaces.c floatAnimator = this.f20726d.getFloatAnimator();
        if (floatAnimator == null) {
            return null;
        }
        return floatAnimator.a(this.f20723a, this.f20724b, this.f20725c, this.f20726d.getSidePattern());
    }

    @m
    public final Animator b() {
        com.lzf.easyfloat.interfaces.c floatAnimator = this.f20726d.getFloatAnimator();
        if (floatAnimator == null) {
            return null;
        }
        return floatAnimator.b(this.f20723a, this.f20724b, this.f20725c, this.f20726d.getSidePattern());
    }
}
