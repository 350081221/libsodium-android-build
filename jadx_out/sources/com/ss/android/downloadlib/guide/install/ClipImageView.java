package com.ss.android.downloadlib.guide.install;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class ClipImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10115a;

    /* renamed from: b, reason: collision with root package name */
    private Path f10116b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f10117c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f10118d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f10119e;

    public ClipImageView(Context context) {
        super(context);
        this.f10115a = true;
        a(context);
    }

    protected void a(Context context) {
        this.f10116b = new Path();
        this.f10117c = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f10115a) {
            this.f10116b.reset();
            this.f10117c.set(0.0f, 0.0f, getWidth(), getHeight());
            float[] fArr = this.f10119e;
            if (fArr != null) {
                this.f10116b.addRoundRect(this.f10117c, fArr, Path.Direction.CW);
            }
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.clipPath(this.f10116b);
            Paint paint = this.f10118d;
            if (paint != null) {
                canvas.drawPath(this.f10116b, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        Paint paint = new Paint(1);
        this.f10118d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f10118d.setColor(i5);
    }

    public void setClip(boolean z4) {
        this.f10115a = z4;
    }

    public void setRadius(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            this.f10119e = fArr;
        }
    }

    public void setRoundRadius(int i5) {
        if (i5 > 0) {
            float f5 = i5;
            setRadius(new float[]{f5, f5, f5, f5, f5, f5, f5, f5});
        }
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10115a = true;
        a(context);
    }

    public ClipImageView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f10115a = true;
        a(context);
    }
}
