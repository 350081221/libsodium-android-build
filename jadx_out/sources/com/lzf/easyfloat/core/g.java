package com.lzf.easyfloat.core;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.http.Headers;
import android.view.View;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.a;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\bA\u0010BJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0016\u0010%\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\"R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\"R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\"R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\"R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\"R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\"R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\"¨\u0006C"}, d2 = {"Lcom/lzf/easyfloat/core/g;", "", "Landroid/view/View;", "view", "Landroid/view/WindowManager$LayoutParams;", "params", "Lkotlin/r2;", "f", "Landroid/view/WindowManager;", "windowManager", bi.aJ, "c", socket.g.f22386a, "", "j", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "k", "l", "Landroid/content/Context;", bi.ay, "Landroid/content/Context;", "e", "()Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Lcom/lzf/easyfloat/data/FloatConfig;", "b", "Lcom/lzf/easyfloat/data/FloatConfig;", "d", "()Lcom/lzf/easyfloat/data/FloatConfig;", "config", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "parentRect", "I", "parentHeight", "parentWidth", "leftBorder", "topBorder", "rightBorder", "i", "bottomBorder", "", "F", "lastX", "lastY", "leftDistance", "m", "rightDistance", "n", "topDistance", "o", "bottomDistance", bi.aA, "minX", "q", "minY", "", "r", "[I", Headers.LOCATION, bi.aE, "statusBarHeight", bi.aL, "emptyHeight", "<init>", "(Landroid/content/Context;Lcom/lzf/easyfloat/data/FloatConfig;)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final Context f9244a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final FloatConfig f9245b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private Rect f9246c;

    /* renamed from: d, reason: collision with root package name */
    private int f9247d;

    /* renamed from: e, reason: collision with root package name */
    private int f9248e;

    /* renamed from: f, reason: collision with root package name */
    private int f9249f;

    /* renamed from: g, reason: collision with root package name */
    private int f9250g;

    /* renamed from: h, reason: collision with root package name */
    private int f9251h;

    /* renamed from: i, reason: collision with root package name */
    private int f9252i;

    /* renamed from: j, reason: collision with root package name */
    private float f9253j;

    /* renamed from: k, reason: collision with root package name */
    private float f9254k;

    /* renamed from: l, reason: collision with root package name */
    private int f9255l;

    /* renamed from: m, reason: collision with root package name */
    private int f9256m;

    /* renamed from: n, reason: collision with root package name */
    private int f9257n;

    /* renamed from: o, reason: collision with root package name */
    private int f9258o;

    /* renamed from: p, reason: collision with root package name */
    private int f9259p;

    /* renamed from: q, reason: collision with root package name */
    private int f9260q;

    /* renamed from: r, reason: collision with root package name */
    @l
    private final int[] f9261r;

    /* renamed from: s, reason: collision with root package name */
    private int f9262s;

    /* renamed from: t, reason: collision with root package name */
    private int f9263t;

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9264a;

        static {
            int[] iArr = new int[m2.b.values().length];
            iArr[m2.b.LEFT.ordinal()] = 1;
            iArr[m2.b.RIGHT.ordinal()] = 2;
            iArr[m2.b.TOP.ordinal()] = 3;
            iArr[m2.b.BOTTOM.ordinal()] = 4;
            iArr[m2.b.AUTO_HORIZONTAL.ordinal()] = 5;
            iArr[m2.b.AUTO_VERTICAL.ordinal()] = 6;
            iArr[m2.b.AUTO_SIDE.ordinal()] = 7;
            iArr[m2.b.RESULT_LEFT.ordinal()] = 8;
            iArr[m2.b.RESULT_RIGHT.ordinal()] = 9;
            iArr[m2.b.RESULT_TOP.ordinal()] = 10;
            iArr[m2.b.RESULT_BOTTOM.ordinal()] = 11;
            iArr[m2.b.RESULT_HORIZONTAL.ordinal()] = 12;
            iArr[m2.b.RESULT_VERTICAL.ordinal()] = 13;
            iArr[m2.b.RESULT_SIDE.ordinal()] = 14;
            f9264a = iArr;
        }
    }

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/lzf/easyfloat/core/g$b", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Lkotlin/r2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9266b;

        b(View view) {
            this.f9266b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@m Animator animator) {
            g.this.c(this.f9266b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@m Animator animator) {
            g.this.c(this.f9266b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@m Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@m Animator animator) {
            g.this.d().setAnim(true);
        }
    }

    public g(@l Context context, @l FloatConfig config) {
        l0.p(context, "context");
        l0.p(config, "config");
        this.f9244a = context;
        this.f9245b = config;
        this.f9246c = new Rect();
        this.f9261r = new int[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view) {
        a.C0174a a5;
        v3.l<View, r2> h5;
        this.f9245b.setAnim(false);
        com.lzf.easyfloat.interfaces.d callbacks = this.f9245b.getCallbacks();
        if (callbacks != null) {
            callbacks.b(view);
        }
        com.lzf.easyfloat.interfaces.a floatCallbacks = this.f9245b.getFloatCallbacks();
        if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (h5 = a5.h()) != null) {
            h5.invoke(view);
        }
    }

    private final void f(View view, WindowManager.LayoutParams layoutParams) {
        int i5;
        int topBorder;
        int min;
        this.f9248e = com.lzf.easyfloat.utils.b.f9276a.f(this.f9244a);
        this.f9247d = this.f9245b.getDisplayHeight().a(this.f9244a);
        view.getLocationOnScreen(this.f9261r);
        if (this.f9261r[1] > layoutParams.y) {
            i5 = j(view);
        } else {
            i5 = 0;
        }
        this.f9262s = i5;
        this.f9263t = (this.f9247d - view.getHeight()) - this.f9262s;
        this.f9249f = Math.max(0, this.f9245b.getLeftBorder());
        this.f9251h = Math.min(this.f9248e, this.f9245b.getRightBorder()) - view.getWidth();
        m2.a showPattern = this.f9245b.getShowPattern();
        m2.a aVar = m2.a.CURRENT_ACTIVITY;
        if (showPattern == aVar) {
            if (this.f9245b.getImmersionStatusBar()) {
                topBorder = this.f9245b.getTopBorder();
            } else {
                topBorder = this.f9245b.getTopBorder() + j(view);
            }
        } else if (this.f9245b.getImmersionStatusBar()) {
            topBorder = this.f9245b.getTopBorder() - j(view);
        } else {
            topBorder = this.f9245b.getTopBorder();
        }
        this.f9250g = topBorder;
        if (this.f9245b.getShowPattern() == aVar) {
            if (this.f9245b.getImmersionStatusBar()) {
                min = Math.min(this.f9263t, this.f9245b.getBottomBorder() - view.getHeight());
            } else {
                min = Math.min(this.f9263t, (this.f9245b.getBottomBorder() + j(view)) - view.getHeight());
            }
        } else if (this.f9245b.getImmersionStatusBar()) {
            min = Math.min(this.f9263t, (this.f9245b.getBottomBorder() - j(view)) - view.getHeight());
        } else {
            min = Math.min(this.f9263t, this.f9245b.getBottomBorder() - view.getHeight());
        }
        this.f9252i = min;
    }

    private final void g(WindowManager.LayoutParams layoutParams) {
        int i5 = layoutParams.x;
        int i6 = i5 - this.f9249f;
        this.f9255l = i6;
        int i7 = this.f9251h - i5;
        this.f9256m = i7;
        int i8 = layoutParams.y;
        this.f9257n = i8 - this.f9250g;
        this.f9258o = this.f9252i - i8;
        this.f9259p = Math.min(i6, i7);
        this.f9260q = Math.min(this.f9257n, this.f9258o);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(final android.view.View r10, final android.view.WindowManager.LayoutParams r11, final android.view.WindowManager r12) {
        /*
            r9 = this;
            r9.g(r11)
            com.lzf.easyfloat.data.FloatConfig r0 = r9.f9245b
            m2.b r0 = r0.getSidePattern()
            int[] r1 = com.lzf.easyfloat.core.g.a.f9264a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 8: goto L5a;
                case 9: goto L54;
                case 10: goto L50;
                case 11: goto L4d;
                case 12: goto L41;
                case 13: goto L35;
                case 14: goto L17;
                default: goto L16;
            }
        L16:
            return
        L17:
            int r0 = r9.f9259p
            int r3 = r9.f9260q
            if (r0 >= r3) goto L29
            int r0 = r9.f9255l
            int r3 = r9.f9256m
            if (r0 >= r3) goto L26
            int r0 = r9.f9249f
            goto L5c
        L26:
            int r0 = r11.x
            goto L58
        L29:
            int r0 = r9.f9257n
            int r3 = r9.f9258o
            if (r0 >= r3) goto L32
            int r0 = r9.f9250g
            goto L52
        L32:
            int r0 = r9.f9252i
            goto L52
        L35:
            int r0 = r9.f9257n
            int r3 = r9.f9258o
            if (r0 >= r3) goto L3e
            int r0 = r9.f9250g
            goto L52
        L3e:
            int r0 = r9.f9252i
            goto L52
        L41:
            int r0 = r9.f9255l
            int r3 = r9.f9256m
            if (r0 >= r3) goto L4a
            int r0 = r9.f9249f
            goto L5c
        L4a:
            int r0 = r11.x
            goto L58
        L4d:
            int r0 = r9.f9252i
            goto L52
        L50:
            int r0 = r9.f9250g
        L52:
            r4 = r1
            goto L5d
        L54:
            int r0 = r11.x
            int r3 = r9.f9256m
        L58:
            int r0 = r0 + r3
            goto L5c
        L5a:
            int r0 = r9.f9249f
        L5c:
            r4 = r2
        L5d:
            r3 = 2
            int[] r3 = new int[r3]
            if (r4 == 0) goto L65
            int r5 = r11.x
            goto L67
        L65:
            int r5 = r11.y
        L67:
            r3[r1] = r5
            r3[r2] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r3)
            com.lzf.easyfloat.core.f r1 = new com.lzf.easyfloat.core.f
            r3 = r1
            r5 = r11
            r6 = r12
            r7 = r10
            r8 = r0
            r3.<init>()
            r0.addUpdateListener(r1)
            com.lzf.easyfloat.core.g$b r11 = new com.lzf.easyfloat.core.g$b
            r11.<init>(r10)
            r0.addListener(r11)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lzf.easyfloat.core.g.h(android.view.View, android.view.WindowManager$LayoutParams, android.view.WindowManager):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(boolean z4, WindowManager.LayoutParams params, WindowManager windowManager, View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        l0.p(params, "$params");
        l0.p(windowManager, "$windowManager");
        l0.p(view, "$view");
        try {
            if (z4) {
                Object animatedValue = valueAnimator2.getAnimatedValue();
                if (animatedValue != null) {
                    params.x = ((Integer) animatedValue).intValue();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                if (animatedValue2 != null) {
                    params.y = ((Integer) animatedValue2).intValue();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            }
            windowManager.updateViewLayout(view, params);
        } catch (Exception unused) {
            valueAnimator.cancel();
        }
    }

    private final int j(View view) {
        return com.lzf.easyfloat.utils.b.f9276a.q(view);
    }

    @l
    public final FloatConfig d() {
        return this.f9245b;
    }

    @l
    public final Context e() {
        return this.f9244a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0108, code lost:
    
        if (r0 > r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c A[PHI: r0
      0x011c: PHI (r0v49 int) = (r0v39 int), (r0v41 int) binds: [B:52:0x0119, B:70:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4 A[PHI: r1
      0x01a4: PHI (r1v3 int) = (r1v0 int), (r1v4 int), (r1v0 int), (r1v7 int), (r1v0 int), (r1v10 int) binds: [B:52:0x0119, B:69:0x01a2, B:64:0x0185, B:65:0x0187, B:61:0x016d, B:62:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@p4.l android.view.View r8, @p4.l android.view.MotionEvent r9, @p4.l android.view.WindowManager r10, @p4.l android.view.WindowManager.LayoutParams r11) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lzf.easyfloat.core.g.k(android.view.View, android.view.MotionEvent, android.view.WindowManager, android.view.WindowManager$LayoutParams):void");
    }

    public final void l(@l View view, @l WindowManager.LayoutParams params, @l WindowManager windowManager) {
        l0.p(view, "view");
        l0.p(params, "params");
        l0.p(windowManager, "windowManager");
        f(view, params);
        h(view, params, windowManager);
    }
}
