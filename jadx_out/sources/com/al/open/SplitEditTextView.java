package com.al.open;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class SplitEditTextView extends AppCompatEditText {
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    private int A;
    private int B;

    /* renamed from: a, reason: collision with root package name */
    private RectF f2654a;

    /* renamed from: b, reason: collision with root package name */
    private RectF f2655b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f2656c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f2657d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f2658e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f2659f;

    /* renamed from: g, reason: collision with root package name */
    private Float f2660g;

    /* renamed from: h, reason: collision with root package name */
    private int f2661h;

    /* renamed from: i, reason: collision with root package name */
    private float f2662i;

    /* renamed from: j, reason: collision with root package name */
    private float f2663j;

    /* renamed from: k, reason: collision with root package name */
    private int f2664k;

    /* renamed from: l, reason: collision with root package name */
    private float f2665l;

    /* renamed from: m, reason: collision with root package name */
    private int f2666m;

    /* renamed from: n, reason: collision with root package name */
    private int f2667n;

    /* renamed from: o, reason: collision with root package name */
    private float f2668o;

    /* renamed from: p, reason: collision with root package name */
    private int f2669p;

    /* renamed from: q, reason: collision with root package name */
    private float f2670q;

    /* renamed from: r, reason: collision with root package name */
    private int f2671r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f2672s;

    /* renamed from: t, reason: collision with root package name */
    private com.al.open.b f2673t;

    /* renamed from: u, reason: collision with root package name */
    private Paint f2674u;

    /* renamed from: v, reason: collision with root package name */
    private b f2675v;

    /* renamed from: w, reason: collision with root package name */
    private int f2676w;

    /* renamed from: x, reason: collision with root package name */
    private float f2677x;

    /* renamed from: y, reason: collision with root package name */
    private int f2678y;

    /* renamed from: z, reason: collision with root package name */
    private int f2679z;

    /* loaded from: classes2.dex */
    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i5;
            int alpha = SplitEditTextView.this.f2674u.getAlpha();
            Paint paint = SplitEditTextView.this.f2674u;
            if (alpha == 0) {
                i5 = 255;
            } else {
                i5 = 0;
            }
            paint.setAlpha(i5);
            SplitEditTextView.this.invalidate();
            SplitEditTextView.this.postDelayed(this, r0.f2679z);
        }
    }

    public SplitEditTextView(Context context) {
        this(context, null);
    }

    private float c(float f5) {
        return TypedValue.applyDimension(1, f5, Resources.getSystem().getDisplayMetrics());
    }

    private void d(Canvas canvas) {
        this.f2654a.setEmpty();
        this.f2654a.set(this.f2660g.floatValue() / 2.0f, this.f2660g.floatValue() / 2.0f, getWidth() - (this.f2660g.floatValue() / 2.0f), getHeight() - (this.f2660g.floatValue() / 2.0f));
        RectF rectF = this.f2654a;
        float f5 = this.f2662i;
        canvas.drawRoundRect(rectF, f5, f5, this.f2658e);
        g(canvas);
    }

    private void e(Canvas canvas) {
        int height = getHeight() / 2;
        String trim = getText().toString().trim();
        int i5 = 0;
        if (this.f2667n == 1) {
            this.f2657d.setColor(ViewCompat.MEASURED_STATE_MASK);
            while (i5 < trim.length()) {
                canvas.drawCircle(k(i5), height, this.f2665l, this.f2657d);
                i5++;
            }
            return;
        }
        this.f2657d.setColor(this.f2671r);
        float l5 = l(this.f2657d, height);
        while (i5 < trim.length()) {
            float k5 = k(i5);
            String valueOf = String.valueOf(trim.charAt(i5));
            canvas.drawText(valueOf, k5 - (this.f2657d.measureText(valueOf) / 2.0f), l5, this.f2657d);
            i5++;
        }
    }

    private void f(Canvas canvas) {
        if (this.f2678y <= getHeight()) {
            float k5 = k(getText().toString().trim().length());
            if (this.f2678y == 0) {
                this.f2678y = getHeight() / 2;
            }
            canvas.drawLine(k5, ((getHeight() - this.f2678y) / 2) + this.f2660g.floatValue(), k5, (getHeight() - r0) - this.f2660g.floatValue(), this.f2674u);
            return;
        }
        throw new InflateException("cursor height must smaller than view height");
    }

    private void g(Canvas canvas) {
        float height = getHeight() - this.f2660g.floatValue();
        int i5 = 0;
        while (i5 < this.f2666m - 1) {
            int i6 = i5 + 1;
            float contentItemWidth = (i6 * getContentItemWidth()) + (i5 * this.f2663j) + this.f2660g.floatValue() + (this.f2663j / 2.0f);
            canvas.drawLine(contentItemWidth, this.f2660g.floatValue(), contentItemWidth, height, this.f2656c);
            i5 = i6;
        }
    }

    private float getContentItemWidth() {
        float f5;
        float f6;
        float floatValue;
        int i5 = this.f2669p;
        if (i5 != 2) {
            if (i5 != 3) {
                f5 = getWidth() - (this.f2663j * (this.f2666m - 1));
                f6 = this.f2660g.floatValue();
                floatValue = 2.0f;
            } else {
                f5 = getWidth();
                f6 = this.f2666m - 1;
                floatValue = this.f2668o;
            }
        } else {
            float width = getWidth();
            int i6 = this.f2666m;
            f5 = width - ((i6 - 1) * this.f2668o);
            f6 = i6 * 2;
            floatValue = this.f2660g.floatValue();
        }
        return (f5 - (f6 * floatValue)) / this.f2666m;
    }

    private void h(Canvas canvas) {
        int i5 = 0;
        while (i5 < this.f2666m) {
            this.f2655b.setEmpty();
            float f5 = i5;
            i5++;
            this.f2655b.set((getContentItemWidth() * f5) + (this.f2668o * f5) + (this.f2660g.floatValue() * f5 * 2.0f) + (this.f2660g.floatValue() / 2.0f), this.f2660g.floatValue() / 2.0f, (((f5 * this.f2668o) + (i5 * getContentItemWidth())) + ((i5 * 2) * this.f2660g.floatValue())) - (this.f2660g.floatValue() / 2.0f), getHeight() - (this.f2660g.floatValue() / 2.0f));
            RectF rectF = this.f2655b;
            float f6 = this.f2662i;
            canvas.drawRoundRect(rectF, f6, f6, this.f2658e);
        }
    }

    private void i(Canvas canvas) {
        String trim = getText().toString().trim();
        for (int i5 = 0; i5 < this.f2666m; i5++) {
            float f5 = i5;
            float contentItemWidth = (getContentItemWidth() * f5) + (f5 * this.f2668o);
            float contentItemWidth2 = getContentItemWidth() + contentItemWidth;
            float height = getHeight() - (this.f2660g.floatValue() / 2.0f);
            if (this.A != 0) {
                if (trim.length() >= i5) {
                    this.f2659f.setColor(this.A);
                } else {
                    this.f2659f.setColor(this.B);
                }
            }
            canvas.drawLine(contentItemWidth, height, contentItemWidth2, height, this.f2659f);
        }
    }

    private float j(int i5) {
        float f5;
        float f6;
        float floatValue;
        int i6 = this.f2669p;
        if (i6 != 2) {
            if (i6 != 3) {
                f5 = i5 - (this.f2663j * (this.f2666m - 1));
                f6 = this.f2660g.floatValue();
                floatValue = 2.0f;
            } else {
                f5 = i5;
                f6 = this.f2666m - 1;
                floatValue = this.f2668o;
            }
        } else {
            int i7 = this.f2666m;
            f5 = i5 - ((i7 - 1) * this.f2668o);
            f6 = i7 * 2;
            floatValue = this.f2660g.floatValue();
        }
        return (f5 - (f6 * floatValue)) / this.f2666m;
    }

    private float k(int i5) {
        float contentItemWidth;
        float f5;
        float floatValue;
        float f6;
        int i6 = this.f2669p;
        if (i6 != 2) {
            if (i6 != 3) {
                float f7 = i5;
                contentItemWidth = (getContentItemWidth() / 2.0f) + (getContentItemWidth() * f7) + (f7 * this.f2663j);
                f6 = this.f2660g.floatValue();
                return contentItemWidth + f6;
            }
            f5 = i5;
            contentItemWidth = (getContentItemWidth() / 2.0f) + (this.f2668o * f5);
            floatValue = getContentItemWidth();
        } else {
            float f8 = i5;
            contentItemWidth = (getContentItemWidth() / 2.0f) + (getContentItemWidth() * f8) + (f8 * this.f2668o);
            f5 = (i5 * 2) + 1;
            floatValue = this.f2660g.floatValue();
        }
        f6 = f5 * floatValue;
        return contentItemWidth + f6;
    }

    private float l(Paint paint, float f5) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f6 = fontMetrics.bottom;
        return f5 + (((f6 - fontMetrics.top) / 2.0f) - f6);
    }

    private void m() {
        Paint paint = new Paint(1);
        this.f2658e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f2658e.setStrokeWidth(this.f2660g.floatValue());
        this.f2658e.setColor(this.f2661h);
        Paint paint2 = new Paint(1);
        this.f2656c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f2656c.setStrokeWidth(this.f2663j);
        this.f2656c.setColor(this.f2664k);
        Paint paint3 = new Paint(1);
        this.f2657d = paint3;
        paint3.setTextSize(this.f2670q);
        Paint paint4 = new Paint(1);
        this.f2674u = paint4;
        paint4.setStrokeWidth(this.f2677x);
        this.f2674u.setColor(this.f2676w);
        Paint paint5 = new Paint(1);
        this.f2659f = paint5;
        paint5.setStrokeWidth(this.f2660g.floatValue());
        this.f2659f.setColor(this.B);
        this.f2655b = new RectF();
        this.f2654a = new RectF();
        setSingleLine();
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 29) {
            setTextSelectHandle(android.R.color.transparent);
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mTextSelectHandleRes");
                declaredField.setAccessible(true);
                declaredField.set(this, Integer.valueOf(android.R.color.transparent));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f2666m)});
    }

    private void n(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.J6);
        this.f2660g = Float.valueOf(obtainStyledAttributes.getDimension(R.styleable.N6, c(1.0f)));
        this.f2661h = obtainStyledAttributes.getColor(R.styleable.M6, ViewCompat.MEASURED_STATE_MASK);
        this.f2662i = obtainStyledAttributes.getDimension(R.styleable.R6, 0.0f);
        this.f2663j = obtainStyledAttributes.getDimension(R.styleable.X6, c(1.0f));
        this.f2664k = obtainStyledAttributes.getColor(R.styleable.W6, ViewCompat.MEASURED_STATE_MASK);
        this.f2665l = obtainStyledAttributes.getDimension(R.styleable.O6, c(5.0f));
        this.f2666m = obtainStyledAttributes.getInt(R.styleable.P6, 6);
        this.f2667n = obtainStyledAttributes.getInteger(R.styleable.Q6, 1);
        this.f2669p = obtainStyledAttributes.getInteger(R.styleable.Z6, 1);
        this.f2668o = obtainStyledAttributes.getDimension(R.styleable.a7, c(10.0f));
        this.f2670q = obtainStyledAttributes.getDimension(R.styleable.K6, o(16.0f));
        this.f2671r = obtainStyledAttributes.getColor(R.styleable.L6, ViewCompat.MEASURED_STATE_MASK);
        this.f2672s = obtainStyledAttributes.getBoolean(R.styleable.Y6, true);
        this.f2676w = obtainStyledAttributes.getColor(R.styleable.S6, ViewCompat.MEASURED_STATE_MASK);
        this.f2679z = obtainStyledAttributes.getInt(R.styleable.T6, 500);
        this.f2677x = obtainStyledAttributes.getDimension(R.styleable.V6, c(2.0f));
        this.f2678y = (int) obtainStyledAttributes.getDimension(R.styleable.U6, 0.0f);
        this.B = obtainStyledAttributes.getInt(R.styleable.c7, ViewCompat.MEASURED_STATE_MASK);
        this.A = obtainStyledAttributes.getInt(R.styleable.b7, 0);
        obtainStyledAttributes.recycle();
        m();
    }

    private float o(float f5) {
        return TypedValue.applyDimension(2, f5, Resources.getSystem().getDisplayMetrics());
    }

    public int getContentShowMode() {
        return this.f2667n;
    }

    public int getInputBoxStyle() {
        return this.f2669p;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = new b();
        this.f2675v = bVar;
        postDelayed(bVar, this.f2679z);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f2675v);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i5 = this.f2669p;
        if (i5 != 2) {
            if (i5 != 3) {
                d(canvas);
            } else {
                i(canvas);
            }
        } else {
            h(canvas);
        }
        e(canvas);
        f(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f2672s) {
            int size = View.MeasureSpec.getSize(i5);
            float j5 = j(size);
            if (this.f2669p != 3) {
                setMeasuredDimension(size, (int) (j5 + (this.f2660g.floatValue() * 2.0f)));
            } else {
                setMeasuredDimension(size, (int) (j5 + this.f2660g.floatValue()));
            }
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        String trim = charSequence.toString().trim();
        if (this.f2673t != null) {
            if (trim.length() == this.f2666m) {
                this.f2673t.b(trim);
            } else {
                this.f2673t.a(trim);
            }
        }
    }

    public void setContentShowMode(int i5) {
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("the value of the parameter must be one of{1:EDIT_SHOW_MODE_PASSWORD} or {2:EDIT_SHOW_MODE_TEXT}");
        }
        this.f2667n = i5;
        invalidate();
    }

    public void setInputBoxStyle(int i5) {
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            throw new IllegalArgumentException("the value of the parameter must be one of{1:INPUT_BOX_STYLE_CONNECT}, {2:INPUT_BOX_STYLE_SINGLE} or {3:INPUT_BOX_STYLE_UNDERLINE}");
        }
        this.f2669p = i5;
        requestLayout();
    }

    public void setOnInputListener(com.al.open.b bVar) {
        this.f2673t = bVar;
    }

    public SplitEditTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SplitEditTextView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        n(context, attributeSet);
    }
}
