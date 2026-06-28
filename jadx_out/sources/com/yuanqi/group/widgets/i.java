package com.yuanqi.group.widgets;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class i extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    private static final Rect f14370g = new Rect();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<ValueAnimator> f14373c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14375e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f14376f;

    /* renamed from: a, reason: collision with root package name */
    protected Rect f14371a = f14370g;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f14372b = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f14374d = 255;

    public i() {
        Paint paint = new Paint();
        this.f14376f = paint;
        paint.setColor(-1);
        this.f14376f.setStyle(Paint.Style.FILL);
        this.f14376f.setAntiAlias(true);
    }

    private void e() {
        if (!this.f14375e) {
            this.f14373c = m();
            this.f14375e = true;
        }
    }

    private boolean l() {
        Iterator<ValueAnimator> it = this.f14373c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    private void r() {
        for (int i5 = 0; i5 < this.f14373c.size(); i5++) {
            ValueAnimator valueAnimator = this.f14373c.get(i5);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f14372b.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    private void s() {
        ArrayList<ValueAnimator> arrayList = this.f14373c;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
    }

    public void a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14372b.put(valueAnimator, animatorUpdateListener);
    }

    public int b() {
        return this.f14371a.centerX();
    }

    public int c() {
        return this.f14371a.centerY();
    }

    public abstract void d(Canvas canvas, Paint paint);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        d(canvas, this.f14376f);
    }

    public float f() {
        return this.f14371a.exactCenterX();
    }

    public float g() {
        return this.f14371a.exactCenterY();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14374d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public int h() {
        return this.f14376f.getColor();
    }

    public Rect i() {
        return this.f14371a;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator<ValueAnimator> it = this.f14373c.iterator();
        if (it.hasNext()) {
            return it.next().isRunning();
        }
        return false;
    }

    public int j() {
        return this.f14371a.height();
    }

    public int k() {
        return this.f14371a.width();
    }

    public abstract ArrayList<ValueAnimator> m();

    public void n() {
        invalidateSelf();
    }

    public void o(int i5) {
        this.f14376f.setColor(i5);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        q(rect);
    }

    public void p(int i5, int i6, int i7, int i8) {
        this.f14371a = new Rect(i5, i6, i7, i8);
    }

    public void q(Rect rect) {
        p(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f14374d = i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        e();
        if (this.f14373c == null || l()) {
            return;
        }
        r();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        s();
    }
}
