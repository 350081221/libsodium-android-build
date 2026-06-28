package org.osmdroid.views.drawing;

import android.graphics.Path;
import android.graphics.Point;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.Projection;

@Deprecated
/* loaded from: classes4.dex */
public class d extends Path {

    /* renamed from: c, reason: collision with root package name */
    private static final GeoPoint f21865c = new GeoPoint(0, 0);

    /* renamed from: a, reason: collision with root package name */
    protected final Point f21866a;

    /* renamed from: b, reason: collision with root package name */
    private double f21867b;

    public d() {
        this.f21866a = new Point();
        this.f21867b = -1.0d;
    }

    public void a(Projection projection) {
        if (this.f21867b != projection.getZoomLevel()) {
            projection.toPixels(f21865c, this.f21866a);
            this.f21867b = projection.getZoomLevel();
        }
        Point point = this.f21866a;
        int i5 = point.x;
        int i6 = point.y;
        projection.toPixels(f21865c, point);
        Point point2 = this.f21866a;
        offset(point2.x - i5, point2.y - i6);
    }

    public d(Path path) {
        super(path);
        this.f21866a = new Point();
        this.f21867b = -1.0d;
    }
}
