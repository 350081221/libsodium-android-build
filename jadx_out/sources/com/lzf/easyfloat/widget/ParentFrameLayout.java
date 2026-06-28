package com.lzf.easyfloat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.a;
import com.lzf.easyfloat.interfaces.e;
import com.lzf.easyfloat.utils.f;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B-\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u00060"}, d2 = {"Lcom/lzf/easyfloat/widget/ParentFrameLayout;", "Landroid/widget/FrameLayout;", "", "changed", "", "left", "top", "right", "bottom", "Lkotlin/r2;", "onLayout", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onInterceptTouchEvent", "onTouchEvent", "Landroid/view/KeyEvent;", "dispatchKeyEventPreIme", "onDetachedFromWindow", "Lcom/lzf/easyfloat/data/FloatConfig;", bi.ay, "Lcom/lzf/easyfloat/data/FloatConfig;", "config", "Lcom/lzf/easyfloat/interfaces/e;", "b", "Lcom/lzf/easyfloat/interfaces/e;", "getTouchListener", "()Lcom/lzf/easyfloat/interfaces/e;", "setTouchListener", "(Lcom/lzf/easyfloat/interfaces/e;)V", "touchListener", "Lcom/lzf/easyfloat/widget/ParentFrameLayout$a;", "c", "Lcom/lzf/easyfloat/widget/ParentFrameLayout$a;", "getLayoutListener", "()Lcom/lzf/easyfloat/widget/ParentFrameLayout$a;", "setLayoutListener", "(Lcom/lzf/easyfloat/widget/ParentFrameLayout$a;)V", "layoutListener", "d", "Z", "isCreated", "Landroid/content/Context;", d.X, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Lcom/lzf/easyfloat/data/FloatConfig;Landroid/util/AttributeSet;I)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ParentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final FloatConfig f9319a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private e f9320b;

    /* renamed from: c, reason: collision with root package name */
    @m
    private a f9321c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9322d;

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/lzf/easyfloat/widget/ParentFrameLayout$a;", "", "Lkotlin/r2;", bi.ay, "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public /* synthetic */ ParentFrameLayout(Context context, FloatConfig floatConfig, AttributeSet attributeSet, int i5, int i6, w wVar) {
        this(context, floatConfig, (i6 & 4) != 0 ? null : attributeSet, (i6 & 8) != 0 ? 0 : i5);
    }

    public void a() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@m KeyEvent keyEvent) {
        if (this.f9319a.getHasEditText()) {
            boolean z4 = false;
            if (keyEvent != null && keyEvent.getAction() == 0) {
                z4 = true;
            }
            if (z4 && keyEvent.getKeyCode() == 4) {
                f.d(this.f9319a.getFloatTag());
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @m
    public final a getLayoutListener() {
        return this.f9321c;
    }

    @m
    public final e getTouchListener() {
        return this.f9320b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        a.C0174a a5;
        v3.a<r2> f5;
        super.onDetachedFromWindow();
        com.lzf.easyfloat.interfaces.d callbacks = this.f9319a.getCallbacks();
        if (callbacks != null) {
            callbacks.dismiss();
        }
        com.lzf.easyfloat.interfaces.a floatCallbacks = this.f9319a.getFloatCallbacks();
        if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (f5 = a5.f()) != null) {
            f5.invoke();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@m MotionEvent motionEvent) {
        e eVar;
        if (motionEvent != null && (eVar = this.f9320b) != null) {
            eVar.a(motionEvent);
        }
        if (!this.f9319a.isDrag() && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        if (!this.f9322d) {
            this.f9322d = true;
            a aVar = this.f9321c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@m MotionEvent motionEvent) {
        e eVar;
        if (motionEvent != null && (eVar = this.f9320b) != null) {
            eVar.a(motionEvent);
        }
        if (!this.f9319a.isDrag() && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setLayoutListener(@m a aVar) {
        this.f9321c = aVar;
    }

    public final void setTouchListener(@m e eVar) {
        this.f9320b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentFrameLayout(@l Context context, @l FloatConfig config, @m AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        l0.p(context, "context");
        l0.p(config, "config");
        this.f9319a = config;
    }
}
