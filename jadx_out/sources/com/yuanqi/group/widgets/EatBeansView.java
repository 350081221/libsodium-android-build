package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class EatBeansView extends BaseView {

    /* renamed from: b, reason: collision with root package name */
    int f14119b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f14120c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f14121d;

    /* renamed from: e, reason: collision with root package name */
    private float f14122e;

    /* renamed from: f, reason: collision with root package name */
    private float f14123f;

    /* renamed from: g, reason: collision with root package name */
    private float f14124g;

    /* renamed from: h, reason: collision with root package name */
    private float f14125h;

    /* renamed from: i, reason: collision with root package name */
    private float f14126i;

    /* renamed from: j, reason: collision with root package name */
    private float f14127j;

    /* renamed from: k, reason: collision with root package name */
    private float f14128k;

    /* renamed from: l, reason: collision with root package name */
    private float f14129l;

    /* renamed from: m, reason: collision with root package name */
    private float f14130m;

    public EatBeansView(Context context) {
        super(context);
        this.f14119b = 5;
        this.f14122e = 0.0f;
        this.f14123f = 0.0f;
        this.f14124g = 5.0f;
        this.f14125h = 60.0f;
        this.f14126i = 0.0f;
        this.f14127j = 10.0f;
        this.f14128k = 34.0f;
        this.f14129l = 34.0f;
        this.f14130m = 360.0f - (34.0f * 2.0f);
    }

    private void o() {
        Paint paint = new Paint();
        this.f14120c = paint;
        paint.setAntiAlias(true);
        this.f14120c.setStyle(Paint.Style.FILL);
        this.f14120c.setColor(-1);
        Paint paint2 = new Paint();
        this.f14121d = paint2;
        paint2.setAntiAlias(true);
        this.f14121d.setStyle(Paint.Style.FILL);
        this.f14121d.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void a() {
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void b() {
        o();
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void c(Animator animator) {
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void d(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f14126i = ((this.f14122e - (this.f14124g * 2.0f)) - this.f14125h) * floatValue;
        float f5 = this.f14128k * (1.0f - ((this.f14119b * floatValue) - ((int) (floatValue * r1))));
        this.f14129l = f5;
        this.f14130m = 360.0f - (f5 * 2.0f);
        invalidate();
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected int e() {
        this.f14126i = 0.0f;
        postInvalidate();
        return 1;
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected int f() {
        return -1;
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected int g() {
        return 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f5 = this.f14124g + this.f14125h + this.f14126i;
        float f6 = this.f14124g + this.f14126i;
        float f7 = this.f14123f;
        float f8 = this.f14125h;
        canvas.drawArc(new RectF(f6, (f7 / 2.0f) - (f8 / 2.0f), f5, (f7 / 2.0f) + (f8 / 2.0f)), this.f14129l, this.f14130m, true, this.f14120c);
        float f9 = this.f14124g + this.f14126i;
        float f10 = this.f14125h;
        canvas.drawCircle(f9 + (f10 / 2.0f), (this.f14123f / 2.0f) - (f10 / 4.0f), this.f14127j / 2.0f, this.f14121d);
        int i5 = (int) ((((this.f14122e - (this.f14124g * 2.0f)) - this.f14125h) / this.f14127j) / 2.0f);
        for (int i6 = 0; i6 < i5; i6++) {
            float f11 = this.f14127j;
            float f12 = (i5 * i6) + (f11 / 2.0f) + this.f14124g + this.f14125h;
            if (f12 > f5) {
                canvas.drawCircle(f12, this.f14123f / 2.0f, f11 / 2.0f, this.f14120c);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        this.f14122e = getMeasuredWidth();
        this.f14123f = getMeasuredHeight();
    }

    public void setEyeColor(int i5) {
        this.f14121d.setColor(i5);
        postInvalidate();
    }

    public void setViewColor(int i5) {
        this.f14120c.setColor(i5);
        postInvalidate();
    }

    public EatBeansView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14119b = 5;
        this.f14122e = 0.0f;
        this.f14123f = 0.0f;
        this.f14124g = 5.0f;
        this.f14125h = 60.0f;
        this.f14126i = 0.0f;
        this.f14127j = 10.0f;
        this.f14128k = 34.0f;
        this.f14129l = 34.0f;
        this.f14130m = 360.0f - (34.0f * 2.0f);
    }

    public EatBeansView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14119b = 5;
        this.f14122e = 0.0f;
        this.f14123f = 0.0f;
        this.f14124g = 5.0f;
        this.f14125h = 60.0f;
        this.f14126i = 0.0f;
        this.f14127j = 10.0f;
        this.f14128k = 34.0f;
        this.f14129l = 34.0f;
        this.f14130m = 360.0f - (34.0f * 2.0f);
    }
}
