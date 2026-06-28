package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.yqtech.multiapp.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f14292t = 600;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14293u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14294v = -1;

    /* renamed from: a, reason: collision with root package name */
    private final int f14295a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14296b;

    /* renamed from: c, reason: collision with root package name */
    private float f14297c;

    /* renamed from: d, reason: collision with root package name */
    private float f14298d;

    /* renamed from: e, reason: collision with root package name */
    private int f14299e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14300f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14301g;

    /* renamed from: h, reason: collision with root package name */
    private int f14302h;

    /* renamed from: i, reason: collision with root package name */
    private View[] f14303i;

    /* renamed from: j, reason: collision with root package name */
    private float f14304j;

    /* renamed from: k, reason: collision with root package name */
    private CardStackLayout f14305k;

    /* renamed from: q, reason: collision with root package name */
    private float f14311q;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14306l = false;

    /* renamed from: m, reason: collision with root package name */
    private float f14307m = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f14308n = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f14309o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    private int f14310p = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f14312r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f14313s = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14314a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14315b;

        a(Runnable runnable, boolean z4) {
            this.f14314a = runnable;
            this.f14315b = z4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f14314a;
            if (runnable != null) {
                runnable.run();
            }
            f.this.t(true);
            if (this.f14315b) {
                f.this.f14310p = -1;
            }
        }
    }

    public f(Context context) {
        Resources resources = context.getResources();
        this.f14295a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.f14296b = (int) resources.getDimension(R.dimen.dp30);
        this.f14311q = (int) resources.getDimension(R.dimen.dp8);
        this.f14304j = (int) resources.getDimension(R.dimen.dp8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        t(true);
        if (this.f14305k.getOnCardSelectedListener() != null) {
            this.f14305k.getOnCardSelectedListener().a(view, this.f14310p);
        }
    }

    private void p(int i5, float f5) {
        int k5;
        int i6;
        if (f5 >= 0.0f && i5 >= 0 && i5 < k()) {
            while (i5 < k()) {
                View view = this.f14303i[i5];
                float f6 = f5 / this.f14311q;
                if (this.f14300f) {
                    int i7 = this.f14299e;
                    if (i7 > 0) {
                        f6 *= i7 / 3;
                        i6 = (k() + 1) - i5;
                        view.setY(i(i5) + (f6 * i6));
                        i5++;
                    } else {
                        k5 = ((i7 * (-1)) / 3) * i5;
                    }
                } else {
                    k5 = k() * 2;
                }
                i6 = k5 + 1;
                view.setY(i(i5) + (f6 * i6));
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z4) {
        this.f14306l = z4;
    }

    private void u(List<Animator> list, Runnable runnable, boolean z4) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setDuration(600L);
        animatorSet.setInterpolator(new DecelerateInterpolator(2.0f));
        animatorSet.addListener(new a(runnable, z4));
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i5) {
        View e5 = e(i5, this.f14305k);
        e5.setOnTouchListener(this);
        e5.setTag(R.id.cardstack_internal_position_tag, Integer.valueOf(i5));
        e5.setLayerType(2, null);
        this.f14313s = e5.getPaddingTop();
        e5.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f14302h));
        if (this.f14301g) {
            e5.setY(g(i5));
            t(false);
        } else {
            e5.setY(i(i5) - this.f14312r);
            t(true);
        }
        this.f14303i[i5] = e5;
        this.f14305k.addView(e5);
    }

    public abstract View e(int i5, ViewGroup viewGroup);

    protected Animator f(View view, int i5, int i6) {
        if (i5 != i6) {
            return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.Y, (int) view.getY(), g(i5));
        }
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.Y, (int) view.getY(), i(0) + (i5 * this.f14297c));
    }

    protected float g(int i5) {
        return ((this.f14295a - this.f14296b) - ((k() - i5) * this.f14297c)) - this.f14313s;
    }

    protected float h() {
        return this.f14297c;
    }

    protected float i(int i5) {
        return this.f14312r + (this.f14298d * i5);
    }

    public View j(int i5) {
        View[] viewArr = this.f14303i;
        if (viewArr == null) {
            return null;
        }
        return viewArr[i5];
    }

    public abstract int k();

    public int l() {
        return this.f14310p;
    }

    public boolean m() {
        return this.f14310p != -1;
    }

    public boolean n() {
        return this.f14306l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View view) {
        if (!n()) {
            return;
        }
        t(false);
        if (this.f14310p == -1) {
            this.f14310p = ((Integer) view.getTag(R.id.cardstack_internal_position_tag)).intValue();
            ArrayList arrayList = new ArrayList(k());
            for (int i5 = 0; i5 < k(); i5++) {
                arrayList.add(f(this.f14303i[i5], i5, this.f14310p));
            }
            u(arrayList, new Runnable() { // from class: com.yuanqi.group.widgets.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.o(view);
                }
            }, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r10 != 3) goto L32;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.n()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            float r0 = r10.getRawY()
            r2 = 2131296469(0x7f0900d5, float:1.8210856E38)
            java.lang.Object r2 = r9.getTag(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r10 = r10.getAction()
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1
            if (r10 == 0) goto L6c
            r6 = -1
            if (r10 == r5) goto L45
            r7 = 2
            if (r10 == r7) goto L2d
            r2 = 3
            if (r10 == r2) goto L45
            goto L79
        L2d:
            int r9 = r8.f14310p
            if (r9 != r6) goto L38
            float r9 = r8.f14307m
            float r9 = r0 - r9
            r8.p(r2, r9)
        L38:
            float r9 = r8.f14309o
            float r10 = r8.f14308n
            float r0 = r0 - r10
            float r10 = java.lang.Math.abs(r0)
            float r9 = r9 + r10
            r8.f14309o = r9
            goto L79
        L45:
            float r10 = r8.f14309o
            float r2 = r8.f14304j
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L62
            float r10 = r8.f14307m
            float r0 = r0 - r10
            float r10 = java.lang.Math.abs(r0)
            float r0 = r8.f14304j
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L62
            int r10 = r8.f14310p
            if (r10 != r6) goto L62
            r8.onClick(r9)
            goto L65
        L62:
            r8.q()
        L65:
            r8.f14307m = r4
            r8.f14308n = r4
            r8.f14309o = r3
            return r1
        L6c:
            float r9 = r8.f14307m
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L73
            return r1
        L73:
            r8.f14307m = r0
            r8.f14308n = r0
            r8.f14309o = r3
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.group.widgets.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void q() {
        r(null);
    }

    public void r(Runnable runnable) {
        ArrayList arrayList = new ArrayList(k());
        for (int i5 = 0; i5 < k(); i5++) {
            arrayList.add(ObjectAnimator.ofFloat(this.f14303i[i5], (Property<View, Float>) View.Y, (int) r3.getY(), i(i5)));
        }
        u(arrayList, runnable, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(CardStackLayout cardStackLayout) {
        this.f14305k = cardStackLayout;
        this.f14303i = new View[k()];
        this.f14297c = cardStackLayout.getCardGapBottom();
        this.f14298d = cardStackLayout.getCardGap();
        this.f14299e = cardStackLayout.getParallaxScale();
        boolean c5 = cardStackLayout.c();
        this.f14300f = c5;
        if (c5 && this.f14299e == 0) {
            this.f14300f = false;
        }
        this.f14301g = cardStackLayout.d();
        this.f14312r = cardStackLayout.getPaddingTop();
        this.f14302h = (int) (((this.f14295a - this.f14296b) - this.f14304j) - (k() * this.f14297c));
    }
}
