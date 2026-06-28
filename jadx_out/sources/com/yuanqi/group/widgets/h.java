package com.yuanqi.group.widgets;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f14340a = 618;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14341b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static Long f14342c;

    /* renamed from: d, reason: collision with root package name */
    private static Long f14343d;

    /* renamed from: e, reason: collision with root package name */
    private static Integer f14344e;

    @SuppressLint({"NewApi"})
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Activity f14345a;

        /* renamed from: b, reason: collision with root package name */
        private View f14346b;

        /* renamed from: e, reason: collision with root package name */
        private Long f14349e;

        /* renamed from: f, reason: collision with root package name */
        private b f14350f;

        /* renamed from: c, reason: collision with root package name */
        private float f14347c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        private int f14348d = h.b();

        /* renamed from: g, reason: collision with root package name */
        private int f14351g = R.anim.fade_in;

        /* renamed from: h, reason: collision with root package name */
        private int f14352h = R.anim.fade_out;

        /* renamed from: com.yuanqi.group.widgets.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0262a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ImageView f14353a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f14354b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f14355c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f14356d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f14357e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ViewGroup f14358f;

            /* renamed from: com.yuanqi.group.widgets.h$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class RunnableC0263a implements Runnable {

                /* renamed from: com.yuanqi.group.widgets.h$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                class C0264a extends AnimatorListenerAdapter {
                    C0264a() {
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        try {
                            C0262a c0262a = C0262a.this;
                            c0262a.f14358f.removeView(c0262a.f14353a);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }

                RunnableC0263a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f14345a.isFinishing()) {
                        return;
                    }
                    try {
                        C0262a c0262a = C0262a.this;
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(c0262a.f14353a, c0262a.f14354b, c0262a.f14355c, c0262a.f14356d, a.this.f14347c);
                        createCircularReveal.setDuration(C0262a.this.f14357e);
                        createCircularReveal.addListener(new C0264a());
                        createCircularReveal.start();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        try {
                            C0262a c0262a2 = C0262a.this;
                            c0262a2.f14358f.removeView(c0262a2.f14353a);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            }

            C0262a(ImageView imageView, int i5, int i6, int i7, long j5, ViewGroup viewGroup) {
                this.f14353a = imageView;
                this.f14354b = i5;
                this.f14355c = i6;
                this.f14356d = i7;
                this.f14357e = j5;
                this.f14358f = viewGroup;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                a.this.h();
                a.this.f14345a.overridePendingTransition(a.this.f14351g, a.this.f14352h);
                a.this.f14346b.postDelayed(new RunnableC0263a(), 1000L);
            }
        }

        public a(Activity activity, View view) {
            this.f14345a = activity;
            this.f14346b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f14350f.onAnimationEnd();
        }

        public a g(int i5) {
            this.f14348d = i5;
            return this;
        }

        public a i(long j5) {
            this.f14349e = Long.valueOf(j5);
            return this;
        }

        public void j(b bVar) {
            this.f14350f = bVar;
            int[] iArr = new int[2];
            this.f14346b.getLocationInWindow(iArr);
            int width = iArr[0] + (this.f14346b.getWidth() / 2);
            int height = iArr[1] + (this.f14346b.getHeight() / 2);
            ImageView imageView = new ImageView(this.f14345a);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(this.f14348d);
            ViewGroup viewGroup = (ViewGroup) this.f14345a.getWindow().getDecorView();
            int width2 = viewGroup.getWidth();
            int height2 = viewGroup.getHeight();
            viewGroup.addView(imageView, width2, height2);
            int max = Math.max(width, width2 - width);
            int max2 = Math.max(height, height2 - height);
            int sqrt = ((int) Math.sqrt((max * max) + (max2 * max2))) + 1;
            try {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(imageView, width, height, this.f14347c, sqrt);
                int sqrt2 = ((int) Math.sqrt((width2 * width2) + (height2 * height2))) + 1;
                if (this.f14349e == null) {
                    this.f14349e = Long.valueOf((long) (h.c() * Math.sqrt((sqrt * 1.0d) / sqrt2)));
                }
                long longValue = this.f14349e.longValue();
                createCircularReveal.setDuration((long) (longValue * 0.9d));
                createCircularReveal.addListener(new C0262a(imageView, width, height, sqrt, longValue, viewGroup));
                createCircularReveal.start();
            } catch (Exception e5) {
                e5.printStackTrace();
                h();
            }
        }

        public a k(int i5, int i6) {
            this.f14351g = i5;
            this.f14352h = i6;
            return this;
        }

        public a l(float f5) {
            this.f14347c = f5;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void onAnimationEnd();
    }

    @SuppressLint({"NewApi"})
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private View f14362a;

        /* renamed from: b, reason: collision with root package name */
        private View f14363b;

        /* renamed from: c, reason: collision with root package name */
        private Float f14364c;

        /* renamed from: d, reason: collision with root package name */
        private Float f14365d;

        /* renamed from: e, reason: collision with root package name */
        private long f14366e = h.a();

        /* renamed from: f, reason: collision with root package name */
        private boolean f14367f;

        /* renamed from: g, reason: collision with root package name */
        private b f14368g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                c.this.b();
            }
        }

        public c(View view, boolean z4) {
            this.f14362a = view;
            this.f14367f = z4;
            Float valueOf = Float.valueOf(0.0f);
            if (z4) {
                this.f14364c = valueOf;
            } else {
                this.f14365d = valueOf;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.f14367f) {
                this.f14362a.setVisibility(0);
            } else {
                this.f14362a.setVisibility(4);
            }
            b bVar = this.f14368g;
            if (bVar != null) {
                bVar.onAnimationEnd();
            }
        }

        public c c(long j5) {
            this.f14366e = j5;
            return this;
        }

        public c d(float f5) {
            this.f14365d = Float.valueOf(f5);
            return this;
        }

        public void e() {
            f(null);
        }

        public void f(b bVar) {
            int left;
            int top;
            double sqrt;
            this.f14368g = bVar;
            View view = this.f14363b;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int width = iArr[0] + (this.f14363b.getWidth() / 2);
                int height = iArr[1] + (this.f14363b.getHeight() / 2);
                int[] iArr2 = new int[2];
                this.f14362a.getLocationInWindow(iArr2);
                int i5 = iArr2[0];
                int i6 = iArr2[1];
                int min = Math.min(Math.max(i5, width), this.f14362a.getWidth() + i5);
                int min2 = Math.min(Math.max(i6, height), this.f14362a.getHeight() + i6);
                int width2 = this.f14362a.getWidth();
                int height2 = this.f14362a.getHeight();
                left = min - i5;
                top = min2 - i6;
                int max = Math.max(left, width2 - left);
                int max2 = Math.max(top, height2 - top);
                sqrt = Math.sqrt((max * max) + (max2 * max2));
            } else {
                left = (this.f14362a.getLeft() + this.f14362a.getRight()) / 2;
                top = (this.f14362a.getTop() + this.f14362a.getBottom()) / 2;
                int width3 = this.f14362a.getWidth();
                int height3 = this.f14362a.getHeight();
                sqrt = Math.sqrt((width3 * width3) + (height3 * height3));
            }
            int i7 = ((int) sqrt) + 1;
            boolean z4 = this.f14367f;
            if (z4 && this.f14365d == null) {
                this.f14365d = Float.valueOf(i7 + 0.0f);
            } else if (!z4 && this.f14364c == null) {
                this.f14364c = Float.valueOf(i7 + 0.0f);
            }
            try {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.f14362a, left, top, this.f14364c.floatValue(), this.f14365d.floatValue());
                this.f14362a.setVisibility(0);
                createCircularReveal.setDuration(this.f14366e);
                createCircularReveal.addListener(new a());
                createCircularReveal.start();
            } catch (Exception e5) {
                e5.printStackTrace();
                b();
            }
        }

        @Deprecated
        public c g(b bVar) {
            this.f14368g = bVar;
            return this;
        }

        public c h(float f5) {
            this.f14364c = Float.valueOf(f5);
            return this;
        }

        public c i(View view) {
            this.f14363b = view;
            return this;
        }
    }

    static /* synthetic */ long a() {
        return g();
    }

    static /* synthetic */ int b() {
        return e();
    }

    static /* synthetic */ long c() {
        return f();
    }

    public static a d(Activity activity, View view) {
        return new a(activity, view);
    }

    private static int e() {
        Integer num = f14344e;
        if (num != null) {
            return num.intValue();
        }
        return R.color.white;
    }

    private static long f() {
        Long l5 = f14343d;
        if (l5 != null) {
            return l5.longValue();
        }
        return 618L;
    }

    private static long g() {
        Long l5 = f14342c;
        if (l5 != null) {
            return l5.longValue();
        }
        return 618L;
    }

    public static c h(View view) {
        return new c(view, false);
    }

    public static void i(long j5, long j6, int i5) {
        f14342c = Long.valueOf(j5);
        f14343d = Long.valueOf(j6);
        f14344e = Integer.valueOf(i5);
    }

    public static c j(View view) {
        return new c(view, true);
    }
}
