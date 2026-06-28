package com.lzf.easyfloat.core;

import android.R;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.server.content.SyncStorageEngine;
import com.lzf.easyfloat.core.d;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.a;
import com.lzf.easyfloat.utils.h;
import com.lzf.easyfloat.widget.ParentFrameLayout;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010.\u001a\u00020'¢\u0006\u0004\bT\u0010UJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0002J.\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010P¨\u0006V"}, d2 = {"Lcom/lzf/easyfloat/core/d;", "", "", "n", "Lkotlin/r2;", "y", "Landroid/app/Activity;", "q", "Landroid/os/IBinder;", "v", "j", "B", "x", "Landroid/view/View;", "view", "K", "k", "F", "floatingView", "o", "Lcom/lzf/easyfloat/core/d$a;", "callback", "l", "", "visible", "needShow", "H", bi.aA, TTDownloadField.TT_FORCE, bi.aG, "width", "height", "L", "Landroid/content/Context;", bi.ay, "Landroid/content/Context;", bi.aE, "()Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Lcom/lzf/easyfloat/data/FloatConfig;", "b", "Lcom/lzf/easyfloat/data/FloatConfig;", "r", "()Lcom/lzf/easyfloat/data/FloatConfig;", "D", "(Lcom/lzf/easyfloat/data/FloatConfig;)V", "config", "Landroid/view/WindowManager;", "c", "Landroid/view/WindowManager;", "w", "()Landroid/view/WindowManager;", "J", "(Landroid/view/WindowManager;)V", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "d", "Landroid/view/WindowManager$LayoutParams;", bi.aK, "()Landroid/view/WindowManager$LayoutParams;", "G", "(Landroid/view/WindowManager$LayoutParams;)V", "params", "Lcom/lzf/easyfloat/widget/ParentFrameLayout;", "e", "Lcom/lzf/easyfloat/widget/ParentFrameLayout;", bi.aL, "()Lcom/lzf/easyfloat/widget/ParentFrameLayout;", "E", "(Lcom/lzf/easyfloat/widget/ParentFrameLayout;)V", "frameLayout", "Lcom/lzf/easyfloat/core/g;", "f", "Lcom/lzf/easyfloat/core/g;", "touchUtils", "Landroid/animation/Animator;", socket.g.f22386a, "Landroid/animation/Animator;", "enterAnimator", bi.aJ, "I", "lastLayoutMeasureWidth", "i", "lastLayoutMeasureHeight", "<init>", "(Landroid/content/Context;Lcom/lzf/easyfloat/data/FloatConfig;)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final Context f9219a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private FloatConfig f9220b;

    /* renamed from: c, reason: collision with root package name */
    public WindowManager f9221c;

    /* renamed from: d, reason: collision with root package name */
    public WindowManager.LayoutParams f9222d;

    /* renamed from: e, reason: collision with root package name */
    @m
    private ParentFrameLayout f9223e;

    /* renamed from: f, reason: collision with root package name */
    private g f9224f;

    /* renamed from: g, reason: collision with root package name */
    @m
    private Animator f9225g;

    /* renamed from: h, reason: collision with root package name */
    private int f9226h;

    /* renamed from: i, reason: collision with root package name */
    private int f9227i;

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/lzf/easyfloat/core/d$a;", "", "", SyncStorageEngine.MESG_SUCCESS, "Lkotlin/r2;", bi.ay, "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z4);
    }

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/lzf/easyfloat/core/d$b", "Lcom/lzf/easyfloat/interfaces/e;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", bi.ay, "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b implements com.lzf.easyfloat.interfaces.e {
        b() {
        }

        @Override // com.lzf.easyfloat.interfaces.e
        public void a(@l MotionEvent event) {
            l0.p(event, "event");
            g gVar = d.this.f9224f;
            if (gVar == null) {
                l0.S("touchUtils");
                gVar = null;
            }
            ParentFrameLayout t5 = d.this.t();
            l0.m(t5);
            gVar.k(t5, event, d.this.w(), d.this.u());
        }
    }

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/lzf/easyfloat/core/d$c", "Lcom/lzf/easyfloat/widget/ParentFrameLayout$a;", "Lkotlin/r2;", bi.ay, "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c implements ParentFrameLayout.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9230b;

        c(View view) {
            this.f9230b = view;
        }

        @Override // com.lzf.easyfloat.widget.ParentFrameLayout.a
        public void a() {
            int measuredWidth;
            a.C0174a a5;
            q<Boolean, String, View, r2> e5;
            d dVar = d.this;
            dVar.F(dVar.t());
            d dVar2 = d.this;
            ParentFrameLayout t5 = dVar2.t();
            int i5 = -1;
            if (t5 == null) {
                measuredWidth = -1;
            } else {
                measuredWidth = t5.getMeasuredWidth();
            }
            dVar2.f9226h = measuredWidth;
            d dVar3 = d.this;
            ParentFrameLayout t6 = dVar3.t();
            if (t6 != null) {
                i5 = t6.getMeasuredHeight();
            }
            dVar3.f9227i = i5;
            FloatConfig r5 = d.this.r();
            d dVar4 = d.this;
            View floatingView = this.f9230b;
            if (!r5.getFilterSelf$easyfloat_release() && ((r5.getShowPattern() != m2.a.BACKGROUND || !com.lzf.easyfloat.utils.g.f9290a.k()) && (r5.getShowPattern() != m2.a.FOREGROUND || com.lzf.easyfloat.utils.g.f9290a.k()))) {
                l0.o(floatingView, "floatingView");
                dVar4.o(floatingView);
            } else {
                d.I(dVar4, 8, false, 2, null);
                dVar4.x();
            }
            r5.setLayoutView(floatingView);
            com.lzf.easyfloat.interfaces.f invokeView = r5.getInvokeView();
            if (invokeView != null) {
                invokeView.a(floatingView);
            }
            com.lzf.easyfloat.interfaces.d callbacks = r5.getCallbacks();
            if (callbacks != null) {
                callbacks.d(true, null, floatingView);
            }
            com.lzf.easyfloat.interfaces.a floatCallbacks = r5.getFloatCallbacks();
            if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (e5 = a5.e()) != null) {
                e5.invoke(Boolean.TRUE, null, floatingView);
            }
        }
    }

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/lzf/easyfloat/core/d$d", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Lkotlin/r2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: com.lzf.easyfloat.core.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0173d implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9232b;

        C0173d(View view) {
            this.f9232b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@m Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@m Animator animator) {
            d.this.r().setAnim(false);
            if (!d.this.r().getImmersionStatusBar()) {
                d.this.u().flags = 40;
            }
            d.this.x();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@m Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@m Animator animator) {
            this.f9232b.setVisibility(0);
            d.this.r().setAnim(true);
        }
    }

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/lzf/easyfloat/core/d$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Lkotlin/r2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class e implements Animator.AnimatorListener {
        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@m Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@m Animator animator) {
            d.A(d.this, false, 1, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@m Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@m Animator animator) {
        }
    }

    public d(@l Context context, @l FloatConfig config) {
        l0.p(context, "context");
        l0.p(config, "config");
        this.f9219a = context;
        this.f9220b = config;
        this.f9226h = -1;
        this.f9227i = -1;
    }

    public static /* synthetic */ void A(d dVar, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        dVar.z(z4);
    }

    private final void B() {
        ViewTreeObserver viewTreeObserver;
        final ParentFrameLayout parentFrameLayout = this.f9223e;
        if (parentFrameLayout != null && (viewTreeObserver = parentFrameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.lzf.easyfloat.core.a
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    d.C(d.this, parentFrameLayout);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(d this$0, ParentFrameLayout this_apply) {
        boolean z4;
        l0.p(this$0, "this$0");
        l0.p(this_apply, "$this_apply");
        int i5 = this$0.f9226h;
        boolean z5 = false;
        if (i5 != -1 && this$0.f9227i != -1) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i5 == this_apply.getMeasuredWidth() && this$0.f9227i == this_apply.getMeasuredHeight()) {
            z5 = true;
        }
        if (!z4 && !z5) {
            if ((this$0.r().getLayoutChangedGravity() & GravityCompat.START) != 8388611) {
                if ((this$0.r().getLayoutChangedGravity() & GravityCompat.END) == 8388613) {
                    this$0.u().x -= this_apply.getMeasuredWidth() - this$0.f9226h;
                } else if ((this$0.r().getLayoutChangedGravity() & 1) == 1 || (this$0.r().getLayoutChangedGravity() & 17) == 17) {
                    this$0.u().x += (this$0.f9226h / 2) - (this_apply.getMeasuredWidth() / 2);
                }
            }
            if ((this$0.r().getLayoutChangedGravity() & 48) != 48) {
                if ((this$0.r().getLayoutChangedGravity() & 80) == 80) {
                    this$0.u().y -= this_apply.getMeasuredHeight() - this$0.f9227i;
                } else if ((this$0.r().getLayoutChangedGravity() & 16) == 16 || (this$0.r().getLayoutChangedGravity() & 17) == 17) {
                    this$0.u().y += (this$0.f9227i / 2) - (this_apply.getMeasuredHeight() / 2);
                }
            }
            this$0.f9226h = this_apply.getMeasuredWidth();
            this$0.f9227i = this_apply.getMeasuredHeight();
            this$0.w().updateViewLayout(this$0.t(), this$0.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RtlHardcoded"})
    public final void F(View view) {
        int i5 = 0;
        if (l0.g(this.f9220b.getLocationPair(), new u0(0, 0)) && view != null) {
            Rect rect = new Rect();
            w().getDefaultDisplay().getRectSize(rect);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[1] > u().y) {
                i5 = com.lzf.easyfloat.utils.b.f9276a.q(view);
            }
            int a5 = this.f9220b.getDisplayHeight().a(this.f9219a) - i5;
            switch (this.f9220b.getGravity()) {
                case 1:
                case 49:
                    u().x = (rect.right - view.getWidth()) >> 1;
                    break;
                case 5:
                case 53:
                case GravityCompat.END /* 8388613 */:
                case 8388661:
                    u().x = rect.right - view.getWidth();
                    break;
                case 16:
                case 19:
                case 8388627:
                    u().y = (a5 - view.getHeight()) >> 1;
                    break;
                case 17:
                    u().x = (rect.right - view.getWidth()) >> 1;
                    u().y = (a5 - view.getHeight()) >> 1;
                    break;
                case 21:
                case 8388629:
                    u().x = rect.right - view.getWidth();
                    u().y = (a5 - view.getHeight()) >> 1;
                    break;
                case 80:
                case 83:
                case 8388691:
                    u().y = a5 - view.getHeight();
                    break;
                case 81:
                    u().x = (rect.right - view.getWidth()) >> 1;
                    u().y = a5 - view.getHeight();
                    break;
                case 85:
                case 8388693:
                    u().x = rect.right - view.getWidth();
                    u().y = a5 - view.getHeight();
                    break;
            }
            u().x += this.f9220b.getOffsetPair().getFirst().intValue();
            u().y += this.f9220b.getOffsetPair().getSecond().intValue();
            if (this.f9220b.getImmersionStatusBar()) {
                if (this.f9220b.getShowPattern() != m2.a.CURRENT_ACTIVITY) {
                    u().y -= i5;
                }
            } else if (this.f9220b.getShowPattern() == m2.a.CURRENT_ACTIVITY) {
                u().y += i5;
            }
            w().updateViewLayout(view, u());
        }
    }

    public static /* synthetic */ void I(d dVar, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = true;
        }
        dVar.H(i5, z4);
    }

    private final void K(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        View child = viewGroup.getChildAt(i5);
                        if (child instanceof ViewGroup) {
                            K(child);
                        } else {
                            l0.o(child, "child");
                            k(child);
                        }
                        if (i6 < childCount) {
                            i5 = i6;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                k(view);
            }
        }
    }

    public static /* synthetic */ void M(d dVar, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = -1;
        }
        if ((i9 & 2) != 0) {
            i6 = -1;
        }
        if ((i9 & 4) != 0) {
            i7 = -1;
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        dVar.L(i5, i6, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(d this$0, ParentFrameLayout it) {
        l0.p(this$0, "this$0");
        l0.p(it, "$it");
        g gVar = this$0.f9224f;
        if (gVar == null) {
            l0.S("touchUtils");
            gVar = null;
        }
        gVar.l(it, this$0.u(), this$0.w());
    }

    private final void j() {
        ParentFrameLayout parentFrameLayout = new ParentFrameLayout(this.f9219a, this.f9220b, null, 0, 12, null);
        this.f9223e = parentFrameLayout;
        parentFrameLayout.setTag(this.f9220b.getFloatTag());
        View layoutView = this.f9220b.getLayoutView();
        if (layoutView == null) {
            layoutView = null;
        } else {
            ParentFrameLayout t5 = t();
            if (t5 != null) {
                t5.addView(layoutView);
            }
        }
        if (layoutView == null) {
            LayoutInflater from = LayoutInflater.from(this.f9219a);
            Integer layoutId = this.f9220b.getLayoutId();
            l0.m(layoutId);
            layoutView = from.inflate(layoutId.intValue(), (ViewGroup) this.f9223e, true);
        }
        layoutView.setVisibility(4);
        w().addView(this.f9223e, u());
        ParentFrameLayout parentFrameLayout2 = this.f9223e;
        if (parentFrameLayout2 != null) {
            parentFrameLayout2.setTouchListener(new b());
        }
        ParentFrameLayout parentFrameLayout3 = this.f9223e;
        if (parentFrameLayout3 != null) {
            parentFrameLayout3.setLayoutListener(new c(layoutView));
        }
        B();
    }

    private final void k(View view) {
        if (view instanceof EditText) {
            com.lzf.easyfloat.utils.f.f9289a.f((EditText) view, this.f9220b.getFloatTag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(a callback, d this$0) {
        l0.p(callback, "$callback");
        l0.p(this$0, "this$0");
        callback.a(this$0.n());
    }

    private final boolean n() {
        a.C0174a a5;
        q<Boolean, String, View, r2> e5;
        try {
            this.f9224f = new g(this.f9219a, this.f9220b);
            y();
            j();
            this.f9220b.setShow(true);
            return true;
        } catch (Exception e6) {
            com.lzf.easyfloat.interfaces.d callbacks = this.f9220b.getCallbacks();
            if (callbacks != null) {
                callbacks.d(false, String.valueOf(e6), null);
            }
            com.lzf.easyfloat.interfaces.a floatCallbacks = this.f9220b.getFloatCallbacks();
            if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (e5 = a5.e()) != null) {
                e5.invoke(Boolean.FALSE, String.valueOf(e6), null);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(View view) {
        if (this.f9223e != null && !this.f9220b.isAnim()) {
            ParentFrameLayout parentFrameLayout = this.f9223e;
            l0.m(parentFrameLayout);
            Animator a5 = new l2.a(parentFrameLayout, u(), w(), this.f9220b).a();
            if (a5 == null) {
                a5 = null;
            } else {
                u().flags = 552;
                a5.addListener(new C0173d(view));
                a5.start();
                r2 r2Var = r2.f19517a;
            }
            this.f9225g = a5;
            if (a5 == null) {
                view.setVisibility(0);
                w().updateViewLayout(this.f9223e, u());
            }
        }
    }

    private final Activity q() {
        Context context = this.f9219a;
        return context instanceof Activity ? (Activity) context : com.lzf.easyfloat.utils.g.f9290a.j();
    }

    private final IBinder v() {
        Window window;
        View decorView;
        Activity q5 = q();
        if (q5 == null || (window = q5.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getWindowToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        ParentFrameLayout parentFrameLayout;
        if (!this.f9220b.getHasEditText() || (parentFrameLayout = this.f9223e) == null) {
            return;
        }
        K(parentFrameLayout);
    }

    private final void y() {
        int i5;
        int i6;
        int i7;
        Object systemService = this.f9219a.getSystemService("window");
        if (systemService != null) {
            J((WindowManager) systemService);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (r().getShowPattern() == m2.a.CURRENT_ACTIVITY) {
                layoutParams.type = 1000;
                layoutParams.token = v();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    i5 = 2038;
                } else {
                    i5 = 2002;
                }
                layoutParams.type = i5;
            }
            layoutParams.format = 1;
            layoutParams.gravity = 8388659;
            if (r().getImmersionStatusBar()) {
                i6 = 552;
            } else {
                i6 = 40;
            }
            layoutParams.flags = i6;
            int i8 = -1;
            if (r().getWidthMatch()) {
                i7 = -1;
            } else {
                i7 = -2;
            }
            layoutParams.width = i7;
            if (!r().getHeightMatch()) {
                i8 = -2;
            }
            layoutParams.height = i8;
            if (r().getImmersionStatusBar() && r().getHeightMatch()) {
                layoutParams.height = com.lzf.easyfloat.utils.b.f9276a.d(s());
            }
            if (!l0.g(r().getLocationPair(), new u0(0, 0))) {
                layoutParams.x = r().getLocationPair().getFirst().intValue();
                layoutParams.y = r().getLocationPair().getSecond().intValue();
            }
            r2 r2Var = r2.f19517a;
            G(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final void D(@l FloatConfig floatConfig) {
        l0.p(floatConfig, "<set-?>");
        this.f9220b = floatConfig;
    }

    public final void E(@m ParentFrameLayout parentFrameLayout) {
        this.f9223e = parentFrameLayout;
    }

    public final void G(@l WindowManager.LayoutParams layoutParams) {
        l0.p(layoutParams, "<set-?>");
        this.f9222d = layoutParams;
    }

    public final void H(int i5, boolean z4) {
        a.C0174a a5;
        v3.l<View, r2> i6;
        a.C0174a a6;
        v3.l<View, r2> j5;
        ParentFrameLayout parentFrameLayout = this.f9223e;
        if (parentFrameLayout != null) {
            l0.m(parentFrameLayout);
            if (parentFrameLayout.getChildCount() >= 1) {
                this.f9220b.setNeedShow$easyfloat_release(z4);
                ParentFrameLayout parentFrameLayout2 = this.f9223e;
                l0.m(parentFrameLayout2);
                parentFrameLayout2.setVisibility(i5);
                ParentFrameLayout parentFrameLayout3 = this.f9223e;
                l0.m(parentFrameLayout3);
                View view = parentFrameLayout3.getChildAt(0);
                if (i5 == 0) {
                    this.f9220b.setShow(true);
                    com.lzf.easyfloat.interfaces.d callbacks = this.f9220b.getCallbacks();
                    if (callbacks != null) {
                        l0.o(view, "view");
                        callbacks.f(view);
                    }
                    com.lzf.easyfloat.interfaces.a floatCallbacks = this.f9220b.getFloatCallbacks();
                    if (floatCallbacks != null && (a6 = floatCallbacks.a()) != null && (j5 = a6.j()) != null) {
                        l0.o(view, "view");
                        j5.invoke(view);
                        return;
                    }
                    return;
                }
                this.f9220b.setShow(false);
                com.lzf.easyfloat.interfaces.d callbacks2 = this.f9220b.getCallbacks();
                if (callbacks2 != null) {
                    l0.o(view, "view");
                    callbacks2.c(view);
                }
                com.lzf.easyfloat.interfaces.a floatCallbacks2 = this.f9220b.getFloatCallbacks();
                if (floatCallbacks2 != null && (a5 = floatCallbacks2.a()) != null && (i6 = a5.i()) != null) {
                    l0.o(view, "view");
                    i6.invoke(view);
                }
            }
        }
    }

    public final void J(@l WindowManager windowManager) {
        l0.p(windowManager, "<set-?>");
        this.f9221c = windowManager;
    }

    public final void L(int i5, int i6, int i7, int i8) {
        final ParentFrameLayout parentFrameLayout = this.f9223e;
        if (parentFrameLayout != null) {
            if (i5 == -1 && i6 == -1 && i7 == -1 && i8 == -1) {
                parentFrameLayout.postDelayed(new Runnable() { // from class: com.lzf.easyfloat.core.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.N(d.this, parentFrameLayout);
                    }
                }, 200L);
                return;
            }
            if (i5 != -1) {
                u().x = i5;
            }
            if (i6 != -1) {
                u().y = i6;
            }
            if (i7 != -1) {
                u().width = i7;
            }
            if (i8 != -1) {
                u().height = i8;
            }
            w().updateViewLayout(parentFrameLayout, u());
        }
    }

    public final void l(@l final a callback) {
        a.C0174a a5;
        q<Boolean, String, View, r2> e5;
        View findViewById;
        l0.p(callback, "callback");
        if (this.f9220b.getShowPattern() == m2.a.CURRENT_ACTIVITY && v() == null) {
            Activity q5 = q();
            if (q5 == null || (findViewById = q5.findViewById(R.id.content)) == null) {
                callback.a(false);
                com.lzf.easyfloat.interfaces.d callbacks = this.f9220b.getCallbacks();
                if (callbacks != null) {
                    callbacks.d(false, k2.c.f19076g, null);
                }
                com.lzf.easyfloat.interfaces.a floatCallbacks = this.f9220b.getFloatCallbacks();
                if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (e5 = a5.e()) != null) {
                    e5.invoke(Boolean.FALSE, k2.c.f19076g, null);
                    return;
                }
                return;
            }
            findViewById.post(new Runnable() { // from class: com.lzf.easyfloat.core.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.m(d.a.this, this);
                }
            });
            return;
        }
        callback.a(n());
    }

    public final void p() {
        if (this.f9223e != null) {
            if (!this.f9220b.isAnim() || this.f9225g != null) {
                Animator animator = this.f9225g;
                if (animator != null) {
                    animator.cancel();
                }
                ParentFrameLayout parentFrameLayout = this.f9223e;
                l0.m(parentFrameLayout);
                Animator b5 = new l2.a(parentFrameLayout, u(), w(), this.f9220b).b();
                if (b5 == null) {
                    A(this, false, 1, null);
                } else {
                    if (this.f9220b.isAnim()) {
                        return;
                    }
                    this.f9220b.setAnim(true);
                    u().flags = 552;
                    b5.addListener(new e());
                    b5.start();
                }
            }
        }
    }

    @l
    public final FloatConfig r() {
        return this.f9220b;
    }

    @l
    public final Context s() {
        return this.f9219a;
    }

    @m
    public final ParentFrameLayout t() {
        return this.f9223e;
    }

    @l
    public final WindowManager.LayoutParams u() {
        WindowManager.LayoutParams layoutParams = this.f9222d;
        if (layoutParams != null) {
            return layoutParams;
        }
        l0.S("params");
        return null;
    }

    @l
    public final WindowManager w() {
        WindowManager windowManager = this.f9221c;
        if (windowManager != null) {
            return windowManager;
        }
        l0.S("windowManager");
        return null;
    }

    public final void z(boolean z4) {
        try {
            this.f9220b.setAnim(false);
            com.lzf.easyfloat.core.e.f9234a.h(this.f9220b.getFloatTag());
            WindowManager w4 = w();
            if (z4) {
                w4.removeViewImmediate(t());
            } else {
                w4.removeView(t());
            }
        } catch (Exception e5) {
            h.f9294a.c(l0.C("浮窗关闭出现异常：", e5));
        }
    }
}
