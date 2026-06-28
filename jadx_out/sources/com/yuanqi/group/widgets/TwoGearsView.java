package com.yuanqi.group.widgets;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class TwoGearsView extends BaseView {

    /* renamed from: b, reason: collision with root package name */
    ValueAnimator f14267b;

    /* renamed from: c, reason: collision with root package name */
    float f14268c;

    /* renamed from: d, reason: collision with root package name */
    float f14269d;

    /* renamed from: e, reason: collision with root package name */
    float f14270e;

    /* renamed from: f, reason: collision with root package name */
    float f14271f;

    /* renamed from: g, reason: collision with root package name */
    float f14272g;

    /* renamed from: h, reason: collision with root package name */
    float f14273h;

    /* renamed from: i, reason: collision with root package name */
    private float f14274i;

    /* renamed from: j, reason: collision with root package name */
    private Paint f14275j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f14276k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f14277l;

    /* renamed from: m, reason: collision with root package name */
    private float f14278m;

    /* renamed from: n, reason: collision with root package name */
    private float f14279n;

    /* renamed from: o, reason: collision with root package name */
    private int f14280o;

    /* renamed from: p, reason: collision with root package name */
    private int f14281p;

    public TwoGearsView(Context context) {
        super(context);
        this.f14267b = null;
        this.f14268c = 0.0f;
        this.f14269d = 0.0f;
        this.f14270e = 0.0f;
        this.f14271f = 0.0f;
        this.f14272g = 0.0f;
        this.f14273h = 0.0f;
        this.f14274i = 0.0f;
        this.f14278m = 0.0f;
        this.f14280o = 10;
        this.f14281p = 8;
    }

    private int o(float f5) {
        return (int) ((f5 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void p(Canvas canvas) {
        for (int i5 = 0; i5 < 3; i5++) {
            double d5 = ((i5 * 120) * 3.141592653589793d) / 180.0d;
            float cos = (float) (this.f14270e * Math.cos(d5));
            float sin = (float) (this.f14271f * Math.sin(d5));
            float f5 = this.f14278m;
            float f6 = this.f14270e;
            float f7 = this.f14271f;
            canvas.drawLine(f5 + f6, f5 + f7, (f6 + f5) - cos, (f5 + f7) - sin, this.f14276k);
        }
        for (int i6 = 0; i6 < 3; i6++) {
            double d6 = ((i6 * 120) * 3.141592653589793d) / 180.0d;
            float cos2 = (float) ((this.f14272g - this.f14270e) * Math.cos(d6));
            float sin2 = (float) ((this.f14273h - this.f14271f) * Math.sin(d6));
            float f8 = this.f14272g;
            float f9 = this.f14278m;
            float f10 = this.f14279n;
            float f11 = this.f14273h;
            canvas.drawLine(f8 + f9 + (f10 * 2.0f), f11 + f9 + (f10 * 2.0f), ((f8 + f9) + (f10 * 2.0f)) - cos2, ((f11 + f9) + (f10 * 2.0f)) - sin2, this.f14276k);
        }
    }

    private void q(Canvas canvas) {
        this.f14272g = (float) ((this.f14269d / 2.0f) * Math.cos(0.7853981633974483d));
        this.f14273h = (float) ((this.f14269d / 2.0f) * Math.sin(0.7853981633974483d));
        float o5 = o(1.5f) / 4;
        this.f14275j.setStrokeWidth(o(1.5f));
        int i5 = 0;
        while (i5 < 360) {
            double d5 = (((int) (360.0f - ((this.f14268c * this.f14281p) + i5))) * 3.141592653589793d) / 180.0d;
            float cos = (float) ((this.f14272g - this.f14270e) * Math.cos(d5));
            float sin = (float) ((this.f14273h - this.f14271f) * Math.sin(d5));
            float cos2 = (float) (((this.f14272g - this.f14270e) + this.f14279n) * Math.cos(d5));
            float sin2 = (float) (((this.f14273h - this.f14271f) + this.f14279n) * Math.sin(d5));
            float f5 = this.f14272g;
            float f6 = this.f14278m;
            float f7 = (f5 + f6) - cos2;
            float f8 = this.f14279n;
            float f9 = f7 + (f8 * 2.0f) + o5;
            float f10 = this.f14273h;
            canvas.drawLine(f9, ((f10 + f6) - sin2) + (f8 * 2.0f) + o5, ((f5 + f6) - cos) + (f8 * 2.0f) + o5, ((f10 + f6) - sin) + (f8 * 2.0f) + o5, this.f14275j);
            i5 += this.f14281p;
        }
    }

    private void r(Canvas canvas) {
        float o5 = o(1.5f) / 4;
        this.f14277l.setStrokeWidth(o(1.5f));
        float f5 = this.f14272g;
        float f6 = this.f14278m;
        float f7 = this.f14279n;
        canvas.drawCircle(f5 + f6 + (f7 * 2.0f) + o5, this.f14273h + f6 + (f7 * 2.0f) + o5, (f5 - this.f14270e) - o5, this.f14277l);
        this.f14277l.setStrokeWidth(o(1.5f));
        float f8 = this.f14272g;
        float f9 = this.f14278m;
        float f10 = this.f14279n;
        canvas.drawCircle(f8 + f9 + (f10 * 2.0f) + o5, this.f14273h + f9 + (f10 * 2.0f) + o5, ((f8 - this.f14270e) / 2.0f) - o5, this.f14277l);
    }

    private void s(Canvas canvas) {
        this.f14275j.setStrokeWidth(o(1.0f));
        int i5 = 0;
        while (i5 < 360) {
            double d5 = (((int) ((this.f14268c * this.f14280o) + i5)) * 3.141592653589793d) / 180.0d;
            float cos = (float) (this.f14270e * Math.cos(d5));
            float sin = (float) (this.f14271f * Math.sin(d5));
            float cos2 = (float) ((this.f14270e + this.f14279n) * Math.cos(d5));
            float sin2 = (float) ((this.f14271f + this.f14279n) * Math.sin(d5));
            float f5 = this.f14278m;
            float f6 = this.f14270e;
            float f7 = (f5 + f6) - cos2;
            float f8 = this.f14271f;
            canvas.drawLine(f7, (f8 + f5) - sin2, (f6 + f5) - cos, (f8 + f5) - sin, this.f14275j);
            i5 += this.f14280o;
        }
    }

    private void t(Canvas canvas) {
        this.f14269d = (float) (this.f14274i * Math.sqrt(2.0d));
        this.f14270e = (float) ((r0 / 6.0f) * Math.cos(0.7853981633974483d));
        this.f14271f = (float) ((this.f14269d / 6.0f) * Math.sin(0.7853981633974483d));
        this.f14277l.setStrokeWidth(o(1.0f));
        float f5 = this.f14278m;
        float f6 = this.f14270e;
        canvas.drawCircle(f5 + f6, this.f14271f + f5, f6, this.f14277l);
        this.f14277l.setStrokeWidth(o(1.5f));
        float f7 = this.f14278m;
        float f8 = this.f14270e;
        canvas.drawCircle(f7 + f8, this.f14271f + f7, f8 / 2.0f, this.f14277l);
    }

    private void u() {
        Paint paint = new Paint();
        this.f14277l = paint;
        paint.setAntiAlias(true);
        this.f14277l.setStyle(Paint.Style.STROKE);
        this.f14277l.setColor(-1);
        this.f14277l.setStrokeWidth(o(1.5f));
        Paint paint2 = new Paint();
        this.f14275j = paint2;
        paint2.setAntiAlias(true);
        this.f14275j.setStyle(Paint.Style.STROKE);
        this.f14275j.setColor(-1);
        this.f14275j.setStrokeWidth(o(1.0f));
        Paint paint3 = new Paint();
        this.f14276k = paint3;
        paint3.setAntiAlias(true);
        this.f14276k.setStyle(Paint.Style.FILL);
        this.f14276k.setColor(-1);
        this.f14276k.setStrokeWidth(o(1.5f));
        this.f14279n = o(2.0f);
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void a() {
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void b() {
        u();
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void c(Animator animator) {
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected void d(ValueAnimator valueAnimator) {
        this.f14268c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    @Override // com.yuanqi.group.widgets.BaseView
    protected int e() {
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
        this.f14278m = o(5.0f);
        canvas.save();
        float f5 = this.f14274i;
        canvas.rotate(180.0f, f5 / 2.0f, f5 / 2.0f);
        t(canvas);
        s(canvas);
        q(canvas);
        r(canvas);
        p(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (getMeasuredWidth() > getHeight()) {
            this.f14274i = getMeasuredHeight();
        } else {
            this.f14274i = getMeasuredWidth();
        }
    }

    public void setViewColor(int i5) {
        this.f14275j.setColor(i5);
        this.f14276k.setColor(i5);
        this.f14277l.setColor(i5);
        postInvalidate();
    }

    public TwoGearsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14267b = null;
        this.f14268c = 0.0f;
        this.f14269d = 0.0f;
        this.f14270e = 0.0f;
        this.f14271f = 0.0f;
        this.f14272g = 0.0f;
        this.f14273h = 0.0f;
        this.f14274i = 0.0f;
        this.f14278m = 0.0f;
        this.f14280o = 10;
        this.f14281p = 8;
    }

    public TwoGearsView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f14267b = null;
        this.f14268c = 0.0f;
        this.f14269d = 0.0f;
        this.f14270e = 0.0f;
        this.f14271f = 0.0f;
        this.f14272g = 0.0f;
        this.f14273h = 0.0f;
        this.f14274i = 0.0f;
        this.f14278m = 0.0f;
        this.f14280o = 10;
        this.f14281p = 8;
    }
}
