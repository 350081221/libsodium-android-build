package c3;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;

/* loaded from: classes3.dex */
public class c extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    private static final int f737e = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final int f738f = 40;

    /* renamed from: g, reason: collision with root package name */
    private static final int f739g = 40;

    /* renamed from: h, reason: collision with root package name */
    private static Path f740h;

    /* renamed from: i, reason: collision with root package name */
    private static Path f741i;

    /* renamed from: a, reason: collision with root package name */
    private final int f742a;

    /* renamed from: b, reason: collision with root package name */
    private final String f743b;

    /* renamed from: c, reason: collision with root package name */
    private int f744c;

    /* renamed from: d, reason: collision with root package name */
    private int f745d;

    public c(int i5, int i6, int i7) {
        this.f742a = i6;
        this.f745d = i5;
        if (i7 > 0) {
            if (i5 == 1) {
                this.f743b = d3.b.b(i7) + external.org.apache.commons.lang3.d.f15957a;
                return;
            }
            if (i5 >= 2) {
                this.f743b = d3.b.a(i7 - 1) + external.org.apache.commons.lang3.d.f15957a;
                return;
            }
            this.f743b = i7 + ".";
            return;
        }
        this.f743b = null;
    }

    @Override // android.text.style.ReplacementSpan
    @TargetApi(11)
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        Path path;
        int color = paint.getColor();
        paint.setColor(this.f742a);
        String str = this.f743b;
        if (str != null) {
            canvas.drawText(str, f5 + 40.0f, i8, paint);
        } else {
            Paint.Style style = paint.getStyle();
            if (this.f745d == 1) {
                paint.setStyle(Paint.Style.STROKE);
            } else {
                paint.setStyle(Paint.Style.FILL);
            }
            if (canvas.isHardwareAccelerated()) {
                if (this.f745d >= 2) {
                    if (f741i == null) {
                        Path path2 = new Path();
                        f741i = path2;
                        path2.addRect(-7.2000003f, -7.2000003f, 7.2000003f, 7.2000003f, Path.Direction.CW);
                    }
                    path = f741i;
                } else {
                    if (f740h == null) {
                        Path path3 = new Path();
                        f740h = path3;
                        path3.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                    }
                    path = f740h;
                }
                canvas.save();
                canvas.translate((f5 + this.f744c) - 40.0f, (i7 + i9) / 2.0f);
                canvas.drawPath(path, paint);
                canvas.restore();
            } else {
                canvas.drawCircle((f5 + this.f744c) - 40.0f, (i7 + i9) / 2.0f, 6.0f, paint);
            }
            paint.setStyle(style);
        }
        canvas.drawText(charSequence, i5, i6, f5 + this.f744c, i8, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        String str = this.f743b;
        if (str == null) {
            this.f744c = ((this.f745d + 1) * 52) + 40;
        } else {
            this.f744c = (int) (((paint.measureText(str) + 40.0f) * (this.f745d + 1)) + 40.0f);
        }
        return (int) (this.f744c + paint.measureText(charSequence, i5, i6));
    }
}
