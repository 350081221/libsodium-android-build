package com.zzhoujay.richtext.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.zzhoujay.richtext.c;

/* loaded from: classes3.dex */
public class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f15677a;

    /* renamed from: b, reason: collision with root package name */
    private float f15678b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f15679c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f15680d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f15681e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private Paint f15682f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15683g;

    /* renamed from: h, reason: collision with root package name */
    private b f15684h;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15685a;

        static {
            int[] iArr = new int[c.b.values().length];
            f15685a = iArr;
            try {
                iArr[c.b.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15685a[c.b.center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15685a[c.b.center_crop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15685a[c.b.center_inside.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15685a[c.b.fit_center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15685a[c.b.fit_start.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15685a[c.b.fit_end.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15685a[c.b.fit_xy.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15685a[c.b.fit_auto.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public c(com.zzhoujay.richtext.c cVar) {
        Paint paint = new Paint();
        this.f15682f = paint;
        paint.setAntiAlias(true);
        b bVar = new b(cVar);
        this.f15684h = bVar;
        this.f15683g = false;
        t(bVar.f15676d);
        p(this.f15684h.f15673a);
    }

    private void b(int i5, int i6, int i7, int i8) {
        this.f15680d = (i7 - i5) / 2.0f;
        this.f15681e = (i8 - i6) / 2.0f;
        this.f15678b = 1.0f;
        this.f15679c = 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 > 1.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            float r7 = (float) r7
            float r5 = (float) r5
            float r0 = r7 / r5
            float r8 = (float) r8
            float r6 = (float) r6
            float r1 = r8 / r6
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 <= 0) goto L13
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 <= 0) goto L19
            goto L1a
        L13:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r3
        L1a:
            float r5 = r5 * r0
            float r6 = r6 * r0
            float r7 = r7 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            float r7 = r7 / r5
            r4.f15680d = r7
            float r8 = r8 - r6
            float r8 = r8 / r5
            r4.f15681e = r8
            r4.f15678b = r0
            r4.f15679c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zzhoujay.richtext.drawable.c.c(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 < 1.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            float r7 = (float) r7
            float r5 = (float) r5
            float r0 = r7 / r5
            float r8 = (float) r8
            float r6 = (float) r6
            float r1 = r8 / r6
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 >= 0) goto L13
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 >= 0) goto L19
            goto L1a
        L13:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r3
        L1a:
            float r5 = r5 * r0
            float r6 = r6 * r0
            float r7 = r7 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r0
            float r7 = r7 / r5
            r4.f15680d = r7
            float r8 = r8 - r6
            float r8 = r8 / r5
            r4.f15681e = r8
            r4.f15678b = r0
            r4.f15679c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zzhoujay.richtext.drawable.c.d(int, int, int, int):void");
    }

    private void e(Canvas canvas) {
        com.zzhoujay.richtext.drawable.a aVar;
        b bVar = this.f15684h;
        if (bVar != null && (aVar = bVar.f15676d) != null && aVar.d()) {
            b bVar2 = this.f15684h;
            if (bVar2.f15673a != null) {
                float c5 = bVar2.f15676d.c();
                canvas.drawRoundRect(this.f15684h.f15673a, c5, c5, this.f15682f);
            }
        }
    }

    private void f(Canvas canvas) {
        canvas.save();
        canvas.scale(this.f15678b, this.f15679c);
        canvas.translate(this.f15680d, this.f15681e);
        this.f15677a.draw(canvas);
        canvas.restore();
    }

    private void g(int i5, int i6, int i7, int i8) {
        b bVar;
        float f5 = i7;
        float f6 = f5 / i5;
        int i9 = (int) (i6 * f6);
        this.f15678b = f6;
        this.f15679c = f6;
        this.f15680d = 0.0f;
        this.f15681e = 0.0f;
        setBounds(0, 0, i7, i9);
        if (this.f15683g && (bVar = this.f15684h) != null) {
            bVar.f15673a.set(0.0f, 0.0f, f5, i9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h(int r4, int r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            float r6 = (float) r6
            float r4 = (float) r4
            float r0 = r6 / r4
            float r7 = (float) r7
            float r5 = (float) r5
            float r1 = r7 / r5
            float r2 = java.lang.Math.min(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            float r4 = r4 * r2
            float r5 = r5 * r2
            float r6 = r6 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r6 / r4
            float r7 = r7 - r5
            float r4 = r7 / r4
            if (r8 >= 0) goto L26
            r6 = 0
            if (r0 == 0) goto L24
        L22:
            r7 = r4
            goto L2d
        L24:
            r7 = r6
            goto L2c
        L26:
            if (r8 <= 0) goto L2b
            if (r0 == 0) goto L2c
            goto L22
        L2b:
            r7 = r4
        L2c:
            r6 = r1
        L2d:
            r3.f15678b = r2
            r3.f15679c = r2
            float r6 = r6 / r2
            r3.f15680d = r6
            float r7 = r7 / r2
            r3.f15681e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zzhoujay.richtext.drawable.c.h(int, int, int, int, int):void");
    }

    private void i(int i5, int i6, int i7, int i8) {
        this.f15678b = i7 / i5;
        this.f15679c = i8 / i6;
        this.f15680d = 0.0f;
        this.f15681e = 0.0f;
    }

    private void m(int i5, int i6, int i7, int i8) {
        this.f15680d = 0.0f;
        this.f15681e = 0.0f;
        this.f15678b = 1.0f;
        this.f15679c = 1.0f;
    }

    private void o(float f5, float f6, float f7, float f8) {
        setBounds((int) f5, (int) f6, (int) f7, (int) f8);
    }

    private void p(RectF rectF) {
        o(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private void t(com.zzhoujay.richtext.drawable.a aVar) {
        if (aVar != null) {
            this.f15682f.setColor(aVar.a());
            this.f15682f.setStrokeWidth(aVar.b());
            this.f15682f.setStyle(Paint.Style.STROKE);
        }
    }

    public void a() {
        int width;
        int height;
        c.b bVar;
        Drawable drawable = this.f15677a;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null && !bitmap.isRecycled()) {
                width = bitmap.getWidth();
                height = bitmap.getHeight();
            } else {
                return;
            }
        } else if (drawable instanceof d) {
            d dVar = (d) drawable;
            width = dVar.e();
            height = dVar.d();
        } else {
            Rect bounds = drawable.getBounds();
            width = bounds.width();
            height = bounds.height();
        }
        int i5 = height;
        int i6 = width;
        Rect bounds2 = getBounds();
        int width2 = bounds2.width();
        int height2 = bounds2.height();
        if (width2 > 0 && height2 > 0) {
            b bVar2 = this.f15684h;
            if (bVar2 == null) {
                bVar = c.b.none;
            } else {
                bVar = bVar2.f15674b;
            }
            switch (a.f15685a[bVar.ordinal()]) {
                case 1:
                    m(i6, i5, width2, height2);
                    return;
                case 2:
                    b(i6, i5, width2, height2);
                    return;
                case 3:
                    c(i6, i5, width2, height2);
                    return;
                case 4:
                    d(i6, i5, width2, height2);
                    return;
                case 5:
                    h(i6, i5, width2, height2, 0);
                    return;
                case 6:
                    h(i6, i5, width2, height2, -1);
                    return;
                case 7:
                    h(i6, i5, width2, height2, 1);
                    return;
                case 8:
                    i(i6, i5, width2, height2);
                    return;
                case 9:
                    g(i6, i5, width2, height2);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap;
        canvas.save();
        if (this.f15677a != null) {
            canvas.clipRect(getBounds());
            Drawable drawable = this.f15677a;
            if ((drawable instanceof BitmapDrawable) && ((bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled())) {
                return;
            } else {
                f(canvas);
            }
        }
        e(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f15677a;
        if (drawable == null) {
            return -2;
        }
        return drawable.getOpacity();
    }

    public Drawable j() {
        return this.f15677a;
    }

    public b k() {
        return this.f15684h;
    }

    public boolean l() {
        return this.f15683g;
    }

    public void n(com.zzhoujay.richtext.drawable.a aVar) {
        b bVar;
        if (!this.f15683g && (bVar = this.f15684h) != null) {
            bVar.f15676d.e(aVar);
        }
    }

    public void q(Drawable drawable) {
        this.f15677a = drawable;
    }

    public void r(c.b bVar) {
        b bVar2;
        if (!this.f15683g && (bVar2 = this.f15684h) != null) {
            bVar2.f15674b = bVar;
        }
    }

    public void s(b bVar) {
        if (!this.f15683g && bVar != null) {
            this.f15684h.l(bVar);
            t(bVar.f15676d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        Drawable drawable = this.f15677a;
        if (drawable != null) {
            drawable.setAlpha(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i5, int i6, int i7, int i8) {
        b bVar;
        super.setBounds(i5, i6, i7, i8);
        if (this.f15683g || (bVar = this.f15684h) == null) {
            return;
        }
        bVar.f15673a.set(i5, i6, i7, i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f15677a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        b bVar;
        super.setBounds(rect);
        if (this.f15683g || (bVar = this.f15684h) == null) {
            return;
        }
        bVar.f15673a.set(rect);
    }

    public c(b bVar) {
        Paint paint = new Paint();
        this.f15682f = paint;
        paint.setAntiAlias(true);
        this.f15684h = bVar;
        this.f15683g = true;
        t(bVar.f15676d);
        p(bVar.f15673a);
    }
}
