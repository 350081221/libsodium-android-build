package com.zzhoujay.markdown.style;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.widget.TextView;
import d3.b;
import external.org.apache.commons.lang3.d;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class MarkDownBulletSpan extends BulletSpan {

    /* renamed from: g, reason: collision with root package name */
    private static final int f15462g = 40;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15463h = 40;

    /* renamed from: i, reason: collision with root package name */
    private static final int f15464i = 6;

    /* renamed from: j, reason: collision with root package name */
    private static Path f15465j;

    /* renamed from: k, reason: collision with root package name */
    private static Path f15466k;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15467a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15468b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15469c;

    /* renamed from: d, reason: collision with root package name */
    private int f15470d;

    /* renamed from: e, reason: collision with root package name */
    private int f15471e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<TextView> f15472f;

    public MarkDownBulletSpan(int i5, int i6, int i7, TextView textView) {
        super(40, i6);
        this.f15470d = i5;
        if (i7 <= 0) {
            this.f15469c = null;
        } else if (i5 == 1) {
            this.f15469c = b.b(i7);
        } else if (i5 >= 2) {
            this.f15469c = b.a(i7 - 1);
        } else {
            this.f15469c = i7 + "";
        }
        this.f15467a = true;
        this.f15468b = i6;
        this.f15472f = new WeakReference<>(textView);
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    @TargetApi(11)
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
        int i12;
        Path path;
        if (((Spanned) charSequence).getSpanStart(this) == i10) {
            if (this.f15467a) {
                i12 = paint.getColor();
                paint.setColor(this.f15468b);
            } else {
                i12 = 0;
            }
            if (this.f15469c != null) {
                canvas.drawText(this.f15469c + d.f15957a, ((i5 - paint.measureText(this.f15469c)) + this.f15471e) - 40.0f, i8, paint);
            } else {
                Paint.Style style = paint.getStyle();
                if (this.f15470d == 1) {
                    paint.setStyle(Paint.Style.STROKE);
                } else {
                    paint.setStyle(Paint.Style.FILL);
                }
                if (canvas.isHardwareAccelerated()) {
                    if (this.f15470d >= 2) {
                        if (f15466k == null) {
                            Path path2 = new Path();
                            f15466k = path2;
                            path2.addRect(-7.2000003f, -7.2000003f, 7.2000003f, 7.2000003f, Path.Direction.CW);
                        }
                        path = f15466k;
                    } else {
                        if (f15465j == null) {
                            Path path3 = new Path();
                            f15465j = path3;
                            path3.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                        }
                        path = f15465j;
                    }
                    canvas.save();
                    canvas.translate((i5 + this.f15471e) - 40, (i7 + i9) / 2.0f);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle((i5 + this.f15471e) - 40, (i7 + i9) / 2.0f, 6.0f, paint);
                }
                paint.setStyle(style);
            }
            if (this.f15467a) {
                paint.setColor(i12);
            }
        }
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        TextView textView;
        WeakReference<TextView> weakReference = this.f15472f;
        if (weakReference != null) {
            textView = weakReference.get();
        } else {
            textView = null;
        }
        if (this.f15469c != null && textView != null) {
            this.f15471e = (int) (((textView.getPaint().measureText(this.f15469c) + 40.0f) * (this.f15470d + 1)) + 40.0f);
        } else {
            this.f15471e = ((this.f15470d + 1) * 52) + 40;
        }
        return this.f15471e;
    }

    public MarkDownBulletSpan(int i5, int i6, int i7) {
        super(40, i6);
        this.f15470d = i5;
        if (i7 <= 0) {
            this.f15469c = null;
        } else if (i5 == 1) {
            this.f15469c = b.b(i7);
        } else if (i5 >= 2) {
            this.f15469c = b.a(i7 - 1);
        } else {
            this.f15469c = i7 + "";
        }
        this.f15467a = true;
        this.f15468b = i6;
    }
}
