package com.yuanqi.group.utils;

import android.animation.Animator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: com.yuanqi.group.utils.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class AnimationAnimationListenerC0261a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14068a;

        AnimationAnimationListenerC0261a(View view) {
            this.f14068a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f14068a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14069a;

        b(View view) {
            this.f14069a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f14069a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f14069a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f14071b;

        c(int i5, View view) {
            this.f14070a = i5;
            this.f14071b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i5 = this.f14070a;
            if (i5 != 0) {
                this.f14071b.setVisibility(i5);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i5 = this.f14070a;
            if (i5 != 0) {
                this.f14071b.setVisibility(i5);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f14073b;

        d(int i5, View view) {
            this.f14072a = i5;
            this.f14073b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i5 = this.f14072a;
            if (i5 != 0) {
                this.f14073b.setVisibility(i5);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i5 = this.f14072a;
            if (i5 != 0) {
                this.f14073b.setVisibility(i5);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static void a(View view, int i5) {
        c(view, i5, view.getHeight());
    }

    public static void b(View view, int i5) {
        h(view, i5, view.getHeight());
    }

    private static void c(View view, int i5, int i6) {
        if (view.getVisibility() == i5) {
            return;
        }
        view.setTranslationY(0.0f);
        if (i5 == 0) {
            view.setVisibility(0);
        }
        view.animate().translationY(i6).setListener(new d(i5, view)).setDuration(500L).start();
    }

    public static void d(View view) {
        view.clearAnimation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC0261a(view));
        view.startAnimation(alphaAnimation);
    }

    public static void e(View view) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.clearAnimation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new b(view));
        view.startAnimation(alphaAnimation);
    }

    public static void f(View view, int i5) {
        h(view, i5, -view.getHeight());
    }

    public static void g(View view, int i5) {
        c(view, i5, -view.getHeight());
    }

    private static void h(View view, int i5, int i6) {
        if (i5 == 0) {
            view.setTranslationY(i6);
            view.setVisibility(0);
        }
        view.animate().translationY(0.0f).setListener(new c(i5, view)).setDuration(500L).start();
    }
}
