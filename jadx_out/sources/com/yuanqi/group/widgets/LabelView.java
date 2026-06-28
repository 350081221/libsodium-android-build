package com.yuanqi.group.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class LabelView extends View {

    /* renamed from: n, reason: collision with root package name */
    private static final int f14131n = 45;

    /* renamed from: a, reason: collision with root package name */
    private String f14132a;

    /* renamed from: b, reason: collision with root package name */
    private int f14133b;

    /* renamed from: c, reason: collision with root package name */
    private float f14134c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14135d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14136e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14137f;

    /* renamed from: g, reason: collision with root package name */
    private int f14138g;

    /* renamed from: h, reason: collision with root package name */
    private float f14139h;

    /* renamed from: i, reason: collision with root package name */
    private float f14140i;

    /* renamed from: j, reason: collision with root package name */
    private int f14141j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f14142k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f14143l;

    /* renamed from: m, reason: collision with root package name */
    private Path f14144m;

    public LabelView(Context context) {
        this(context, null);
    }

    private void b(int i5, float f5, Canvas canvas, float f6, boolean z4) {
        float f7;
        String str;
        canvas.save();
        float f8 = i5 / 2.0f;
        canvas.rotate(f5, f8, f8);
        float f9 = f6 + (this.f14140i * 2.0f);
        if (z4) {
            f7 = (-f9) / 2.0f;
        } else {
            f7 = f9 / 2.0f;
        }
        float descent = ((i5 / 2) - ((this.f14142k.descent() + this.f14142k.ascent()) / 2.0f)) + f7;
        if (this.f14137f) {
            str = this.f14132a.toUpperCase();
        } else {
            str = this.f14132a;
        }
        canvas.drawText(str, getPaddingLeft() + (((i5 - getPaddingLeft()) - getPaddingRight()) / 2), descent, this.f14142k);
        canvas.restore();
    }

    private void c(int i5, float f5, Canvas canvas, boolean z4) {
        int i6;
        String str;
        canvas.save();
        float f6 = i5 / 2.0f;
        canvas.rotate(f5, f6, f6);
        if (z4) {
            i6 = (-i5) / 4;
        } else {
            i6 = i5 / 4;
        }
        float descent = ((i5 / 2) - ((this.f14142k.descent() + this.f14142k.ascent()) / 2.0f)) + i6;
        if (this.f14137f) {
            str = this.f14132a.toUpperCase();
        } else {
            str = this.f14132a;
        }
        canvas.drawText(str, getPaddingLeft() + (((i5 - getPaddingLeft()) - getPaddingRight()) / 2), descent, this.f14142k);
        canvas.restore();
    }

    private int g(int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode != 1073741824) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            this.f14142k.setColor(this.f14133b);
            this.f14142k.setTextSize(this.f14134c);
            Paint paint = this.f14142k;
            int measureText = (int) ((paddingLeft + ((int) paint.measureText(this.f14132a + ""))) * Math.sqrt(2.0d));
            if (mode == Integer.MIN_VALUE) {
                measureText = Math.min(measureText, size);
            }
            return Math.max((int) this.f14139h, measureText);
        }
        return size;
    }

    private void h(Context context, AttributeSet attributeSet) {
        float f5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LabelView);
        this.f14132a = obtainStyledAttributes.getString(5);
        this.f14133b = obtainStyledAttributes.getColor(8, Color.parseColor("#ffffff"));
        this.f14134c = obtainStyledAttributes.getDimension(9, i(11.0f));
        this.f14135d = obtainStyledAttributes.getBoolean(7, true);
        this.f14137f = obtainStyledAttributes.getBoolean(6, true);
        this.f14136e = obtainStyledAttributes.getBoolean(1, false);
        this.f14138g = obtainStyledAttributes.getColor(0, Color.parseColor("#FF4081"));
        if (this.f14136e) {
            f5 = 35.0f;
        } else {
            f5 = 50.0f;
        }
        this.f14139h = obtainStyledAttributes.getDimension(3, a(f5));
        this.f14140i = obtainStyledAttributes.getDimension(4, a(3.5f));
        this.f14141j = obtainStyledAttributes.getInt(2, 51);
        obtainStyledAttributes.recycle();
    }

    protected int a(float f5) {
        return (int) ((f5 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean d() {
        return this.f14136e;
    }

    public boolean e() {
        return this.f14137f;
    }

    public boolean f() {
        return this.f14135d;
    }

    public int getBgColor() {
        return this.f14138g;
    }

    public int getGravity() {
        return this.f14141j;
    }

    public float getMinSize() {
        return this.f14139h;
    }

    public float getPadding() {
        return this.f14140i;
    }

    public String getText() {
        return this.f14132a;
    }

    public int getTextColor() {
        return this.f14133b;
    }

    public float getTextSize() {
        return this.f14134c;
    }

    protected int i(float f5) {
        return (int) ((f5 * getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        this.f14142k.setColor(this.f14133b);
        this.f14142k.setTextSize(this.f14134c);
        this.f14142k.setFakeBoldText(this.f14135d);
        this.f14143l.setColor(this.f14138g);
        float descent = this.f14142k.descent() - this.f14142k.ascent();
        if (this.f14136e) {
            int i5 = this.f14141j;
            if (i5 == 51) {
                this.f14144m.reset();
                this.f14144m.moveTo(0.0f, 0.0f);
                float f5 = height;
                this.f14144m.lineTo(0.0f, f5);
                this.f14144m.lineTo(f5, 0.0f);
                this.f14144m.close();
                canvas.drawPath(this.f14144m, this.f14143l);
                c(height, -45.0f, canvas, true);
                return;
            }
            if (i5 == 53) {
                this.f14144m.reset();
                float f6 = height;
                this.f14144m.moveTo(f6, 0.0f);
                this.f14144m.lineTo(0.0f, 0.0f);
                this.f14144m.lineTo(f6, f6);
                this.f14144m.close();
                canvas.drawPath(this.f14144m, this.f14143l);
                c(height, 45.0f, canvas, true);
                return;
            }
            if (i5 == 83) {
                this.f14144m.reset();
                float f7 = height;
                this.f14144m.moveTo(0.0f, f7);
                this.f14144m.lineTo(0.0f, 0.0f);
                this.f14144m.lineTo(f7, f7);
                this.f14144m.close();
                canvas.drawPath(this.f14144m, this.f14143l);
                c(height, 45.0f, canvas, false);
                return;
            }
            if (i5 == 85) {
                this.f14144m.reset();
                float f8 = height;
                this.f14144m.moveTo(f8, f8);
                this.f14144m.lineTo(0.0f, f8);
                this.f14144m.lineTo(f8, 0.0f);
                this.f14144m.close();
                canvas.drawPath(this.f14144m, this.f14143l);
                c(height, -45.0f, canvas, false);
                return;
            }
            return;
        }
        double sqrt = ((this.f14140i * 2.0f) + descent) * Math.sqrt(2.0d);
        int i6 = this.f14141j;
        if (i6 == 51) {
            this.f14144m.reset();
            float f9 = (float) (height - sqrt);
            this.f14144m.moveTo(0.0f, f9);
            float f10 = height;
            this.f14144m.lineTo(0.0f, f10);
            this.f14144m.lineTo(f10, 0.0f);
            this.f14144m.lineTo(f9, 0.0f);
            this.f14144m.close();
            canvas.drawPath(this.f14144m, this.f14143l);
            b(height, -45.0f, canvas, descent, true);
            return;
        }
        if (i6 == 53) {
            this.f14144m.reset();
            this.f14144m.moveTo(0.0f, 0.0f);
            this.f14144m.lineTo((float) sqrt, 0.0f);
            float f11 = height;
            this.f14144m.lineTo(f11, (float) (height - sqrt));
            this.f14144m.lineTo(f11, f11);
            this.f14144m.close();
            canvas.drawPath(this.f14144m, this.f14143l);
            b(height, 45.0f, canvas, descent, true);
            return;
        }
        if (i6 == 83) {
            this.f14144m.reset();
            this.f14144m.moveTo(0.0f, 0.0f);
            this.f14144m.lineTo(0.0f, (float) sqrt);
            float f12 = height;
            this.f14144m.lineTo((float) (height - sqrt), f12);
            this.f14144m.lineTo(f12, f12);
            this.f14144m.close();
            canvas.drawPath(this.f14144m, this.f14143l);
            b(height, 45.0f, canvas, descent, false);
            return;
        }
        if (i6 == 85) {
            this.f14144m.reset();
            float f13 = height;
            this.f14144m.moveTo(0.0f, f13);
            float f14 = (float) sqrt;
            this.f14144m.lineTo(f14, f13);
            this.f14144m.lineTo(f13, f14);
            this.f14144m.lineTo(f13, 0.0f);
            this.f14144m.close();
            canvas.drawPath(this.f14144m, this.f14143l);
            b(height, -45.0f, canvas, descent, false);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int g5 = g(i5);
        setMeasuredDimension(g5, g5);
    }

    public void setBgColor(int i5) {
        this.f14138g = i5;
        invalidate();
    }

    public void setFillTriangle(boolean z4) {
        this.f14136e = z4;
        invalidate();
    }

    public void setGravity(int i5) {
        this.f14141j = i5;
    }

    public void setMinSize(float f5) {
        this.f14139h = a(f5);
        invalidate();
    }

    public void setPadding(float f5) {
        this.f14140i = a(f5);
        invalidate();
    }

    public void setText(String str) {
        this.f14132a = str;
        invalidate();
    }

    public void setTextAllCaps(boolean z4) {
        this.f14137f = z4;
        invalidate();
    }

    public void setTextBold(boolean z4) {
        this.f14135d = z4;
        invalidate();
    }

    public void setTextColor(int i5) {
        this.f14133b = i5;
        invalidate();
    }

    public void setTextSize(float f5) {
        this.f14134c = i(f5);
        invalidate();
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14142k = new Paint(1);
        this.f14143l = new Paint(1);
        this.f14144m = new Path();
        h(context, attributeSet);
        this.f14142k.setTextAlign(Paint.Align.CENTER);
    }
}
