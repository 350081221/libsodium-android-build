package org.osmdroid.views.overlay.gridlines;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import androidx.core.view.ViewCompat;
import java.text.DecimalFormat;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Overlay;

/* loaded from: classes4.dex */
public class a extends Overlay {

    /* renamed from: a, reason: collision with root package name */
    protected DecimalFormat f21923a = new DecimalFormat("#.#####");

    /* renamed from: b, reason: collision with root package name */
    protected float f21924b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f21925c = new Paint();

    /* renamed from: d, reason: collision with root package name */
    protected Paint f21926d = new Paint();

    /* renamed from: e, reason: collision with root package name */
    protected Paint f21927e = new Paint();

    /* renamed from: f, reason: collision with root package name */
    protected GeoPoint f21928f = new GeoPoint(0.0d, 0.0d);

    /* renamed from: g, reason: collision with root package name */
    protected Point f21929g = new Point();

    public a() {
        this.f21925c.setAntiAlias(true);
        this.f21925c.setStyle(Paint.Style.STROKE);
        this.f21926d.setStyle(Paint.Style.FILL);
        this.f21927e.setAntiAlias(true);
        this.f21927e.setStyle(Paint.Style.STROKE);
        this.f21927e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f21927e.setTextAlign(Paint.Align.CENTER);
        j(ViewCompat.MEASURED_STATE_MASK);
        h(-1);
        f(ViewCompat.MEASURED_STATE_MASK);
        setLineWidth(1.0f);
        i((short) 32);
    }

    private double c(double d5, double d6) {
        double round = Math.round(d5 / d6) * d6;
        while (round > MapView.getTileSystem().getMaxLatitude()) {
            round -= d6;
        }
        while (round < MapView.getTileSystem().getMinLatitude()) {
            round += d6;
        }
        return round;
    }

    private String d(double d5, boolean z4) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21923a.format(d5));
        if (d5 == 0.0d) {
            str = "";
        } else if (d5 > 0.0d) {
            if (z4) {
                str = "N";
            } else {
                str = "E";
            }
        } else if (z4) {
            str = "S";
        } else {
            str = "W";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    @Override // org.osmdroid.views.overlay.Overlay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r49, org.osmdroid.views.Projection r50) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.gridlines.a.draw(android.graphics.Canvas, org.osmdroid.views.Projection):void");
    }

    protected double e(int i5) {
        double d5;
        double d6;
        switch (i5) {
            case 0:
            case 1:
                d5 = this.f21924b;
                d6 = 30.0d;
                break;
            case 2:
                d5 = this.f21924b;
                d6 = 15.0d;
                break;
            case 3:
                d5 = this.f21924b;
                d6 = 9.0d;
                break;
            case 4:
                d5 = this.f21924b;
                d6 = 6.0d;
                break;
            case 5:
                d5 = this.f21924b;
                d6 = 3.0d;
                break;
            case 6:
                d5 = this.f21924b;
                d6 = 2.0d;
                break;
            case 7:
                d5 = this.f21924b;
                d6 = 1.0d;
                break;
            case 8:
                d5 = this.f21924b;
                d6 = 0.5d;
                break;
            case 9:
                d5 = this.f21924b;
                d6 = 0.25d;
                break;
            case 10:
                d5 = this.f21924b;
                d6 = 0.1d;
                break;
            case 11:
                d5 = this.f21924b;
                d6 = 0.05d;
                break;
            case 12:
                d5 = this.f21924b;
                d6 = 0.025d;
                break;
            case 13:
                d5 = this.f21924b;
                d6 = 0.0125d;
                break;
            case 14:
                d5 = this.f21924b;
                d6 = 0.00625d;
                break;
            case 15:
                d5 = this.f21924b;
                d6 = 0.003125d;
                break;
            case 16:
                d5 = this.f21924b;
                d6 = 0.0015625d;
                break;
            case 17:
                d5 = this.f21924b;
                d6 = 7.8125E-4d;
                break;
            case 18:
                d5 = this.f21924b;
                d6 = 3.90625E-4d;
                break;
            case 19:
                d5 = this.f21924b;
                d6 = 1.953125E-4d;
                break;
            case 20:
                d5 = this.f21924b;
                d6 = 9.765625E-5d;
                break;
            case 21:
                d5 = this.f21924b;
                d6 = 4.8828125E-5d;
                break;
            case 22:
                d5 = this.f21924b;
                d6 = 2.44140625E-5d;
                break;
            case 23:
                d5 = this.f21924b;
                d6 = 1.220703125E-5d;
                break;
            case 24:
                d5 = this.f21924b;
                d6 = 6.103515625E-6d;
                break;
            case 25:
                d5 = this.f21924b;
                d6 = 3.0517578125E-6d;
                break;
            case 26:
                d5 = this.f21924b;
                d6 = 1.52587890625E-6d;
                break;
            case 27:
                d5 = this.f21924b;
                d6 = 7.62939453125E-7d;
                break;
            case 28:
                d5 = this.f21924b;
                d6 = 3.814697265625E-7d;
                break;
            default:
                d5 = this.f21924b;
                d6 = 1.9073486328125E-7d;
                break;
        }
        return d5 * d6;
    }

    public void f(int i5) {
        this.f21926d.setColor(i5);
    }

    public void g(DecimalFormat decimalFormat) {
        this.f21923a = decimalFormat;
    }

    public Paint getTextPaint() {
        return this.f21927e;
    }

    public void h(int i5) {
        this.f21927e.setColor(i5);
    }

    public void i(short s5) {
        this.f21927e.setTextSize(s5);
    }

    public void j(int i5) {
        this.f21925c.setColor(i5);
    }

    public void k(float f5) {
        this.f21924b = f5;
    }

    public void l(Paint.Style style) {
        this.f21927e.setStyle(style);
    }

    public void setLineWidth(float f5) {
        this.f21925c.setStrokeWidth(f5);
    }

    public void setTextPaint(Paint paint) {
        this.f21927e = paint;
    }
}
