package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public abstract class BaseView extends View {

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f14077a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseView.this.d(valueAnimator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseView.this.c(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    public BaseView(Context context) {
        this(context, null);
    }

    private ValueAnimator m(float f5, float f6, long j5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f6);
        this.f14077a = ofFloat;
        ofFloat.setDuration(j5);
        this.f14077a.setInterpolator(new LinearInterpolator());
        this.f14077a.setRepeatCount(f());
        if (1 == g()) {
            this.f14077a.setRepeatMode(1);
        } else if (2 == g()) {
            this.f14077a.setRepeatMode(2);
        }
        this.f14077a.addUpdateListener(new a());
        this.f14077a.addListener(new b());
        if (!this.f14077a.isRunning()) {
            a();
            this.f14077a.start();
        }
        return this.f14077a;
    }

    protected abstract void a();

    protected abstract void b();

    protected abstract void c(Animator animator);

    protected abstract void d(ValueAnimator valueAnimator);

    protected abstract int e();

    protected abstract int f();

    protected abstract int g();

    public float h(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public float i(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), new Rect());
        return r0.height();
    }

    public float j(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), new Rect());
        return r0.width();
    }

    public void k() {
        n();
        m(0.0f, 1.0f, 500L);
    }

    public void l(int i5) {
        n();
        m(0.0f, 1.0f, i5);
    }

    public void n() {
        if (this.f14077a != null) {
            clearAnimation();
            this.f14077a.setRepeatCount(0);
            this.f14077a.cancel();
            this.f14077a.end();
            if (e() == 0) {
                this.f14077a.setRepeatCount(0);
                this.f14077a.cancel();
                this.f14077a.end();
            }
        }
    }

    public BaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        b();
    }
}
