package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.yuanqi.group.widgets.n;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: g, reason: collision with root package name */
    public static final int f14397g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14398h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f14399i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static final long f14400j = 1000;

    /* renamed from: k, reason: collision with root package name */
    private static final long f14401k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f14402l = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f14403a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f14404b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private long f14405c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f14406d = 0;

    /* renamed from: e, reason: collision with root package name */
    private Animator.AnimatorListener f14407e;

    /* renamed from: f, reason: collision with root package name */
    private ObjectAnimator f14408f;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14409a;

        /* renamed from: com.yuanqi.group.widgets.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0265a implements Animator.AnimatorListener {
            C0265a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((m) a.this.f14409a).setShimmering(false);
                a.this.f14409a.postInvalidateOnAnimation();
                l.this.f14408f = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        a(View view) {
            this.f14409a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((m) this.f14409a).setShimmering(true);
            float width = this.f14409a.getWidth();
            float f5 = 0.0f;
            if (l.this.f14406d == 1) {
                f5 = this.f14409a.getWidth();
                width = 0.0f;
            }
            l.this.f14408f = ObjectAnimator.ofFloat(this.f14409a, "gradientX", f5, width);
            l.this.f14408f.setRepeatCount(l.this.f14403a);
            l.this.f14408f.setDuration(l.this.f14404b);
            l.this.f14408f.setStartDelay(l.this.f14405c);
            l.this.f14408f.addListener(new C0265a());
            if (l.this.f14407e != null) {
                l.this.f14408f.addListener(l.this.f14407e);
            }
            l.this.f14408f.start();
        }
    }

    /* loaded from: classes3.dex */
    class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14412a;

        b(Runnable runnable) {
            this.f14412a = runnable;
        }

        @Override // com.yuanqi.group.widgets.n.a
        public void a(View view) {
            this.f14412a.run();
        }
    }

    public void h() {
        ObjectAnimator objectAnimator = this.f14408f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public Animator.AnimatorListener i() {
        return this.f14407e;
    }

    public int j() {
        return this.f14406d;
    }

    public long k() {
        return this.f14404b;
    }

    public int l() {
        return this.f14403a;
    }

    public long m() {
        return this.f14405c;
    }

    public boolean n() {
        ObjectAnimator objectAnimator = this.f14408f;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public l o(Animator.AnimatorListener animatorListener) {
        this.f14407e = animatorListener;
        return this;
    }

    public l p(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("The animation direction must be either ANIMATION_DIRECTION_LTR or ANIMATION_DIRECTION_RTL");
        }
        this.f14406d = i5;
        return this;
    }

    public l q(long j5) {
        this.f14404b = j5;
        return this;
    }

    public l r(int i5) {
        this.f14403a = i5;
        return this;
    }

    public l s(long j5) {
        this.f14405c = j5;
        return this;
    }

    public <V extends View & m> void t(V v4) {
        if (n()) {
            return;
        }
        a aVar = new a(v4);
        V v5 = v4;
        if (!v5.b()) {
            v5.setAnimationSetupCallback(new b(aVar));
        } else {
            aVar.run();
        }
    }
}
