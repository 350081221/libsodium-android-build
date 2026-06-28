package com.bytedance.tools.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.animation.core.AnimationKt;
import com.bytedance.tools.d.k;

/* loaded from: classes2.dex */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final float f6407a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6408b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6409c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6410d;

    /* renamed from: e, reason: collision with root package name */
    private final float f6411e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6412f;

    /* renamed from: g, reason: collision with root package name */
    private int f6413g;

    /* renamed from: h, reason: collision with root package name */
    private int f6414h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f6415i;

    /* renamed from: j, reason: collision with root package name */
    private final PorterDuffXfermode f6416j;

    /* renamed from: k, reason: collision with root package name */
    private float f6417k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6418l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6419m;

    /* renamed from: n, reason: collision with root package name */
    private int f6420n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6421o;

    /* renamed from: p, reason: collision with root package name */
    private long f6422p;

    /* renamed from: q, reason: collision with root package name */
    private int f6423q;

    /* renamed from: r, reason: collision with root package name */
    private float f6424r;

    /* renamed from: s, reason: collision with root package name */
    private float f6425s;

    /* renamed from: t, reason: collision with root package name */
    private float f6426t;

    /* renamed from: u, reason: collision with root package name */
    private float f6427u;

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        b(context);
    }

    private float a(float f5) {
        return ((double) f5) < 0.5d ? 2.0f * f5 * f5 : ((f5 * 2.0f) * (2.0f - f5)) - 1.0f;
    }

    private void b(Context context) {
    }

    private Paint f() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private void g() {
        this.f6422p = -1L;
        if (this.f6423q <= 0) {
            setProgressBarInfo((int) k.b(getContext(), 60.0f));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f6423q > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f6415i == null) {
            this.f6415i = f();
        }
        this.f6419m = true;
    }

    public boolean c() {
        return this.f6421o;
    }

    public void d() {
        g();
        this.f6421o = true;
        this.f6418l = true;
        postInvalidate();
    }

    public void e() {
        this.f6421o = false;
        this.f6419m = false;
        this.f6417k = 0.0f;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f5;
        int i5;
        int i6;
        super.onDraw(canvas);
        if ((!c() && this.f6418l) || !this.f6419m) {
            return;
        }
        boolean z4 = false;
        if (this.f6418l) {
            long nanoTime = System.nanoTime() / AnimationKt.MillisToNanos;
            if (this.f6422p < 0) {
                this.f6422p = nanoTime;
            }
            float f6 = ((float) (nanoTime - this.f6422p)) / 400.0f;
            this.f6417k = f6;
            int i7 = (int) f6;
            if (((this.f6420n + i7) & 1) == 1) {
                z4 = true;
            }
            this.f6417k = f6 - i7;
        }
        float a5 = a(this.f6417k);
        int i8 = this.f6423q;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, i8, i8, this.f6415i, 31);
        float f7 = (this.f6427u * a5) + this.f6426t;
        if (a5 < 0.5d) {
            f5 = a5 * 2.0f;
        } else {
            f5 = 2.0f - (a5 * 2.0f);
        }
        float f8 = this.f6425s;
        float f9 = (0.25f * f5 * f8) + f8;
        Paint paint = this.f6415i;
        if (z4) {
            i5 = this.f6414h;
        } else {
            i5 = this.f6413g;
        }
        paint.setColor(i5);
        canvas.drawCircle(f7, this.f6424r, f9, this.f6415i);
        float f10 = this.f6423q - f7;
        float f11 = this.f6425s;
        float f12 = f11 - ((f5 * 0.375f) * f11);
        Paint paint2 = this.f6415i;
        if (z4) {
            i6 = this.f6413g;
        } else {
            i6 = this.f6414h;
        }
        paint2.setColor(i6);
        this.f6415i.setXfermode(this.f6416j);
        canvas.drawCircle(f10, this.f6424r, f12, this.f6415i);
        this.f6415i.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        postInvalidateDelayed(17L);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int min = Math.min(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i6));
        if (this.f6423q > min && min > 0) {
            setProgressBarInfo(min);
        }
    }

    public void setCycleBias(int i5) {
        this.f6420n = i5;
    }

    public void setProgress(float f5) {
        if (!this.f6419m) {
            g();
        }
        this.f6417k = f5;
        this.f6421o = false;
        this.f6418l = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i5) {
        if (i5 > 0) {
            this.f6423q = i5;
            this.f6424r = i5 / 2.0f;
            float f5 = (i5 >> 1) * 0.32f;
            this.f6425s = f5;
            float f6 = (i5 * 0.16f) + f5;
            this.f6426t = f6;
            this.f6427u = i5 - (f6 * 2.0f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (i5 == 0) {
            d();
        } else {
            e();
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        b(context);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f6407a = 0.25f;
        this.f6408b = 0.375f;
        this.f6409c = 0.16f;
        this.f6410d = 0.32f;
        this.f6411e = 400.0f;
        this.f6412f = 17L;
        this.f6413g = -119723;
        this.f6414h = -14289682;
        this.f6416j = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f6418l = false;
        this.f6419m = false;
        this.f6420n = 0;
        this.f6421o = false;
        this.f6422p = -1L;
        this.f6423q = -1;
        b(context);
    }
}
