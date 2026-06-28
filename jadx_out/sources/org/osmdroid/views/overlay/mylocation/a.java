package org.osmdroid.views.overlay.mylocation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;

/* loaded from: classes4.dex */
public class a extends Overlay {

    /* renamed from: c, reason: collision with root package name */
    protected Bitmap f22001c;

    /* renamed from: d, reason: collision with root package name */
    protected GeoPoint f22002d;

    /* renamed from: e, reason: collision with root package name */
    protected float f22003e;

    /* renamed from: h, reason: collision with root package name */
    private float f22006h;

    /* renamed from: i, reason: collision with root package name */
    private float f22007i;

    /* renamed from: j, reason: collision with root package name */
    private int f22008j;

    /* renamed from: k, reason: collision with root package name */
    private int f22009k;

    /* renamed from: a, reason: collision with root package name */
    protected Paint f21999a = new Paint();

    /* renamed from: b, reason: collision with root package name */
    protected Paint f22000b = new Paint();

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f22004f = new Matrix();

    /* renamed from: g, reason: collision with root package name */
    private final Point f22005g = new Point();

    /* renamed from: l, reason: collision with root package name */
    private int f22010l = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22011m = true;

    public a(Context context) {
        e(((BitmapDrawable) context.getResources().getDrawable(R.drawable.f21681w)).getBitmap());
        this.f22000b.setStrokeWidth(2.0f);
        this.f22000b.setColor(-16776961);
        this.f22000b.setAntiAlias(true);
    }

    public GeoPoint c() {
        return this.f22002d;
    }

    public void d(int i5) {
        this.f22010l = i5;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        int i5;
        GeoPoint geoPoint = this.f22002d;
        if (geoPoint != null) {
            projection.toPixels(geoPoint, this.f22005g);
            if (this.f22011m && (i5 = this.f22010l) > 10) {
                float metersToPixels = projection.metersToPixels(i5, this.f22002d.getLatitude(), projection.getZoomLevel());
                if (metersToPixels > 8.0f) {
                    this.f22000b.setAntiAlias(false);
                    this.f22000b.setAlpha(30);
                    this.f22000b.setStyle(Paint.Style.FILL);
                    Point point = this.f22005g;
                    canvas.drawCircle(point.x, point.y, metersToPixels, this.f22000b);
                    this.f22000b.setAntiAlias(true);
                    this.f22000b.setAlpha(150);
                    this.f22000b.setStyle(Paint.Style.STROKE);
                    Point point2 = this.f22005g;
                    canvas.drawCircle(point2.x, point2.y, metersToPixels, this.f22000b);
                }
            }
            this.f22004f.setRotate(this.f22003e, this.f22006h, this.f22007i);
            canvas.drawBitmap(Bitmap.createBitmap(this.f22001c, 0, 0, this.f22008j, this.f22009k, this.f22004f, false), this.f22005g.x - (r12.getWidth() / 2), this.f22005g.y - (r12.getHeight() / 2), this.f21999a);
        }
    }

    public void e(Bitmap bitmap) {
        this.f22001c = bitmap;
        this.f22006h = (bitmap.getWidth() / 2.0f) - 0.5f;
        this.f22007i = (this.f22001c.getHeight() / 2.0f) - 0.5f;
        this.f22009k = this.f22001c.getHeight();
        this.f22008j = this.f22001c.getWidth();
    }

    public void f(GeoPoint geoPoint) {
        this.f22002d = geoPoint;
    }

    public void g(boolean z4) {
        this.f22011m = z4;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.f21999a = null;
        this.f22000b = null;
    }

    public void setBearing(float f5) {
        this.f22003e = f5;
    }
}
