package org.osmdroid.views.overlay.mylocation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;

/* loaded from: classes4.dex */
public class f extends Overlay {

    /* renamed from: a, reason: collision with root package name */
    protected final Paint f22045a;

    /* renamed from: b, reason: collision with root package name */
    protected Bitmap f22046b;

    /* renamed from: c, reason: collision with root package name */
    protected Point f22047c;

    /* renamed from: d, reason: collision with root package name */
    protected GeoPoint f22048d;

    /* renamed from: e, reason: collision with root package name */
    private final Point f22049e;

    @Deprecated
    public f(Context context) {
        this(((BitmapDrawable) context.getResources().getDrawable(R.drawable.f21676r)).getBitmap());
    }

    public GeoPoint c() {
        return this.f22048d;
    }

    public void d(GeoPoint geoPoint) {
        this.f22048d = geoPoint;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        GeoPoint geoPoint = this.f22048d;
        if (geoPoint != null) {
            projection.toPixels(geoPoint, this.f22049e);
            Bitmap bitmap = this.f22046b;
            int i5 = this.f22049e.x;
            Point point = this.f22047c;
            canvas.drawBitmap(bitmap, i5 - point.x, r0.y - point.y, this.f22045a);
        }
    }

    public void e(Bitmap bitmap, Point point) {
        this.f22046b = bitmap;
        this.f22047c = point;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
    }

    public f(Bitmap bitmap) {
        this.f22045a = new Paint();
        this.f22047c = new Point(24, 39);
        this.f22049e = new Point();
        this.f22046b = bitmap;
    }
}
