package org.osmdroid.views.overlay.simplefastpoint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.simplefastpoint.a;

/* loaded from: classes4.dex */
public class SimpleFastPointOverlay extends Overlay {

    /* renamed from: a, reason: collision with root package name */
    private final org.osmdroid.views.overlay.simplefastpoint.a f22050a;

    /* renamed from: b, reason: collision with root package name */
    private final c f22051b;

    /* renamed from: c, reason: collision with root package name */
    private final BoundingBox f22052c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f22053d;

    /* renamed from: e, reason: collision with root package name */
    private b f22054e;

    /* renamed from: f, reason: collision with root package name */
    private List<StyledLabelledPoint> f22055f;

    /* renamed from: g, reason: collision with root package name */
    private boolean[][] f22056g;

    /* renamed from: h, reason: collision with root package name */
    private int f22057h;

    /* renamed from: i, reason: collision with root package name */
    private int f22058i;

    /* renamed from: j, reason: collision with root package name */
    private int f22059j;

    /* renamed from: k, reason: collision with root package name */
    private int f22060k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22061l;

    /* renamed from: m, reason: collision with root package name */
    private int f22062m;

    /* renamed from: n, reason: collision with root package name */
    private BoundingBox f22063n;

    /* renamed from: o, reason: collision with root package name */
    private Projection f22064o;

    /* renamed from: p, reason: collision with root package name */
    private BoundingBox f22065p;

    /* loaded from: classes4.dex */
    public class StyledLabelledPoint extends Point {

        /* renamed from: a, reason: collision with root package name */
        private String f22066a;

        /* renamed from: b, reason: collision with root package name */
        private Paint f22067b;

        /* renamed from: c, reason: collision with root package name */
        private Paint f22068c;

        public StyledLabelledPoint(Point point, String str, Paint paint, Paint paint2) {
            super(point);
            this.f22066a = str;
            this.f22067b = paint;
            this.f22068c = paint2;
        }
    }

    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22070a;

        static {
            int[] iArr = new int[a.b.values().length];
            f22070a = iArr;
            try {
                iArr[a.b.MAXIMUM_OPTIMIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22070a[a.b.MEDIUM_OPTIMIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22070a[a.b.NO_OPTIMIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(c cVar, Integer num);
    }

    /* loaded from: classes4.dex */
    public interface c extends Iterable<IGeoPoint> {
        boolean b();

        boolean d();

        IGeoPoint get(int i5);

        int size();
    }

    public SimpleFastPointOverlay(c cVar, org.osmdroid.views.overlay.simplefastpoint.a aVar) {
        this.f22061l = false;
        this.f22065p = new BoundingBox();
        this.f22050a = aVar;
        this.f22051b = cVar;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        for (IGeoPoint iGeoPoint : cVar) {
            if (iGeoPoint != null) {
                d5 = (d5 == null || iGeoPoint.getLongitude() > d5.doubleValue()) ? Double.valueOf(iGeoPoint.getLongitude()) : d5;
                d8 = (d8 == null || iGeoPoint.getLongitude() < d8.doubleValue()) ? Double.valueOf(iGeoPoint.getLongitude()) : d8;
                d6 = (d6 == null || iGeoPoint.getLatitude() > d6.doubleValue()) ? Double.valueOf(iGeoPoint.getLatitude()) : d6;
                if (d7 == null || iGeoPoint.getLatitude() < d7.doubleValue()) {
                    d7 = Double.valueOf(iGeoPoint.getLatitude());
                }
            }
        }
        if (d5 != null) {
            this.f22052c = new BoundingBox(d6.doubleValue(), d5.doubleValue(), d7.doubleValue(), d8.doubleValue());
        } else {
            this.f22052c = null;
        }
    }

    private void c(MapView mapView) {
        String str;
        Paint paint;
        Paint paint2;
        BoundingBox boundingBox = mapView.getBoundingBox();
        this.f22063n = boundingBox;
        this.f22064o = mapView.getProjection();
        if (boundingBox.getLatNorth() != this.f22065p.getLatNorth() || boundingBox.getLatSouth() != this.f22065p.getLatSouth() || boundingBox.getLonWest() != this.f22065p.getLonWest() || boundingBox.getLonEast() != this.f22065p.getLonEast()) {
            this.f22065p = new BoundingBox(boundingBox.getLatNorth(), boundingBox.getLonEast(), boundingBox.getLatSouth(), boundingBox.getLonWest());
            if (this.f22056g != null && this.f22060k == mapView.getHeight() && this.f22059j == mapView.getWidth()) {
                for (boolean[] zArr : this.f22056g) {
                    Arrays.fill(zArr, false);
                }
            } else {
                j(mapView);
            }
            Point point = new Point();
            Projection projection = mapView.getProjection();
            this.f22055f = new ArrayList();
            this.f22062m = 0;
            for (IGeoPoint iGeoPoint : this.f22051b) {
                if (iGeoPoint != null && iGeoPoint.getLatitude() > boundingBox.getLatSouth() && iGeoPoint.getLatitude() < boundingBox.getLatNorth() && iGeoPoint.getLongitude() > boundingBox.getLonWest() && iGeoPoint.getLongitude() < boundingBox.getLonEast()) {
                    projection.toPixels(iGeoPoint, point);
                    int floor = (int) Math.floor(point.x / this.f22050a.f22077g);
                    int floor2 = (int) Math.floor(point.y / this.f22050a.f22077g);
                    if (floor < this.f22057h && floor2 < this.f22058i && floor >= 0 && floor2 >= 0) {
                        boolean[] zArr2 = this.f22056g[floor];
                        if (!zArr2[floor2]) {
                            zArr2[floor2] = true;
                            List<StyledLabelledPoint> list = this.f22055f;
                            if (this.f22051b.d()) {
                                str = ((LabelledGeoPoint) iGeoPoint).getLabel();
                            } else {
                                str = null;
                            }
                            if (this.f22051b.b()) {
                                paint = ((StyledLabelledGeoPoint) iGeoPoint).getPointStyle();
                            } else {
                                paint = null;
                            }
                            if (this.f22051b.b()) {
                                paint2 = ((StyledLabelledGeoPoint) iGeoPoint).getTextStyle();
                            } else {
                                paint2 = null;
                            }
                            list.add(new StyledLabelledPoint(point, str, paint, paint2));
                            this.f22062m++;
                        }
                    }
                }
            }
        }
    }

    private void j(MapView mapView) {
        this.f22059j = mapView.getWidth();
        this.f22060k = mapView.getHeight();
        this.f22057h = ((int) Math.floor(this.f22059j / this.f22050a.f22077g)) + 1;
        int floor = ((int) Math.floor(this.f22060k / this.f22050a.f22077g)) + 1;
        this.f22058i = floor;
        this.f22056g = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f22057h, floor);
    }

    protected void d(Canvas canvas, float f5, float f6, boolean z4, String str, Paint paint, Paint paint2, MapView mapView) {
        canvas.save();
        canvas.rotate(-mapView.getMapOrientation(), f5, f6);
        org.osmdroid.views.overlay.simplefastpoint.a aVar = this.f22050a;
        if (aVar.f22079i == a.c.CIRCLE) {
            canvas.drawCircle(f5, f6, aVar.f22074d, paint);
        } else {
            float f7 = aVar.f22074d;
            canvas.drawRect(f5 - f7, f6 - f7, f5 + f7, f6 + f7, paint);
        }
        if (z4 && str != null) {
            canvas.drawText(str, f5, (f6 - this.f22050a.f22074d) - 5.0f, paint2);
        }
        canvas.restore();
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, MapView mapView, boolean z4) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        if (z4) {
            return;
        }
        Point point = new Point();
        Projection projection = mapView.getProjection();
        if (this.f22050a.f22071a != null || this.f22051b.b()) {
            int i5 = a.f22070a[this.f22050a.f22078h.ordinal()];
            if (i5 == 1) {
                if (this.f22056g == null || (!this.f22061l && !mapView.isAnimating())) {
                    c(mapView);
                }
                GeoPoint geoPoint = new GeoPoint(this.f22063n.getLatNorth(), this.f22063n.getLonWest());
                GeoPoint geoPoint2 = new GeoPoint(this.f22063n.getLatSouth(), this.f22063n.getLonEast());
                Point pixels = projection.toPixels(geoPoint, null);
                Point pixels2 = projection.toPixels(geoPoint2, null);
                Point pixels3 = this.f22064o.toPixels(geoPoint2, null);
                Point point2 = new Point(pixels2.x - pixels3.x, pixels2.y - pixels3.y);
                Point point3 = new Point(point2.x - pixels.x, point2.y - pixels.y);
                org.osmdroid.views.overlay.simplefastpoint.a aVar = this.f22050a;
                a.EnumC0654a enumC0654a = aVar.f22080j;
                boolean z5 = (enumC0654a == a.EnumC0654a.DENSITY_THRESHOLD && this.f22062m <= aVar.f22081k) || (enumC0654a == a.EnumC0654a.ZOOM_THRESHOLD && mapView.getZoomLevelDouble() >= ((double) this.f22050a.f22082l));
                for (StyledLabelledPoint styledLabelledPoint : this.f22055f) {
                    float f5 = ((point3.x * ((Point) styledLabelledPoint).x) / pixels3.x) + r1 + pixels.x;
                    float f6 = r3 + pixels.y + ((point3.y * ((Point) styledLabelledPoint).y) / pixels3.y);
                    boolean z6 = this.f22051b.d() && z5;
                    String str = styledLabelledPoint.f22066a;
                    Paint paint4 = (!this.f22051b.b() || styledLabelledPoint.f22067b == null) ? this.f22050a.f22071a : styledLabelledPoint.f22067b;
                    if (!this.f22051b.b() || (paint = styledLabelledPoint.f22068c) == null) {
                        paint = this.f22050a.f22073c;
                    }
                    d(canvas, f5, f6, z6, str, paint4, paint, mapView);
                    pixels = pixels;
                    point3 = point3;
                }
            } else if (i5 == 2) {
                if (this.f22056g != null && this.f22060k == mapView.getHeight() && this.f22059j == mapView.getWidth()) {
                    for (boolean[] zArr : this.f22056g) {
                        Arrays.fill(zArr, false);
                    }
                } else {
                    j(mapView);
                }
                boolean z7 = this.f22050a.f22080j == a.EnumC0654a.ZOOM_THRESHOLD && mapView.getZoomLevelDouble() >= ((double) this.f22050a.f22082l);
                BoundingBox boundingBox = mapView.getBoundingBox();
                for (IGeoPoint iGeoPoint : this.f22051b) {
                    if (iGeoPoint != null && iGeoPoint.getLatitude() > boundingBox.getLatSouth() && iGeoPoint.getLatitude() < boundingBox.getLatNorth() && iGeoPoint.getLongitude() > boundingBox.getLonWest() && iGeoPoint.getLongitude() < boundingBox.getLonEast()) {
                        projection.toPixels(iGeoPoint, point);
                        int floor = (int) Math.floor(point.x / this.f22050a.f22077g);
                        int floor2 = (int) Math.floor(point.y / this.f22050a.f22077g);
                        if (floor < this.f22057h && floor2 < this.f22058i && floor >= 0 && floor2 >= 0) {
                            boolean[] zArr2 = this.f22056g[floor];
                            if (!zArr2[floor2]) {
                                zArr2[floor2] = true;
                                float f7 = point.x;
                                float f8 = point.y;
                                boolean z8 = this.f22051b.d() && z7;
                                String label = this.f22051b.d() ? ((LabelledGeoPoint) iGeoPoint).getLabel() : null;
                                if (this.f22051b.b()) {
                                    StyledLabelledGeoPoint styledLabelledGeoPoint = (StyledLabelledGeoPoint) iGeoPoint;
                                    if (styledLabelledGeoPoint.getPointStyle() != null) {
                                        paint2 = styledLabelledGeoPoint.getPointStyle();
                                        Paint paint5 = paint2;
                                        if (this.f22051b.b() || (r0 = ((StyledLabelledGeoPoint) iGeoPoint).getTextStyle()) == null) {
                                            Paint paint6 = this.f22050a.f22073c;
                                        }
                                        d(canvas, f7, f8, z8, label, paint5, paint6, mapView);
                                    }
                                }
                                paint2 = this.f22050a.f22071a;
                                Paint paint52 = paint2;
                                if (this.f22051b.b()) {
                                }
                                Paint paint62 = this.f22050a.f22073c;
                                d(canvas, f7, f8, z8, label, paint52, paint62, mapView);
                            }
                        }
                    }
                }
            } else if (i5 == 3) {
                boolean z9 = this.f22050a.f22080j == a.EnumC0654a.ZOOM_THRESHOLD && mapView.getZoomLevelDouble() >= ((double) this.f22050a.f22082l);
                BoundingBox boundingBox2 = mapView.getBoundingBox();
                for (IGeoPoint iGeoPoint2 : this.f22051b) {
                    if (iGeoPoint2 != null && iGeoPoint2.getLatitude() > boundingBox2.getLatSouth() && iGeoPoint2.getLatitude() < boundingBox2.getLatNorth() && iGeoPoint2.getLongitude() > boundingBox2.getLonWest() && iGeoPoint2.getLongitude() < boundingBox2.getLonEast()) {
                        projection.toPixels(iGeoPoint2, point);
                        float f9 = point.x;
                        float f10 = point.y;
                        boolean z10 = this.f22051b.d() && z9;
                        String label2 = this.f22051b.d() ? ((LabelledGeoPoint) iGeoPoint2).getLabel() : null;
                        if (this.f22051b.b()) {
                            StyledLabelledGeoPoint styledLabelledGeoPoint2 = (StyledLabelledGeoPoint) iGeoPoint2;
                            if (styledLabelledGeoPoint2.getPointStyle() != null) {
                                paint3 = styledLabelledGeoPoint2.getPointStyle();
                                Paint paint7 = paint3;
                                if (this.f22051b.b() || (r0 = ((StyledLabelledGeoPoint) iGeoPoint2).getTextStyle()) == null) {
                                    Paint paint8 = this.f22050a.f22073c;
                                }
                                d(canvas, f9, f10, z10, label2, paint7, paint8, mapView);
                            }
                        }
                        paint3 = this.f22050a.f22071a;
                        Paint paint72 = paint3;
                        if (this.f22051b.b()) {
                        }
                        Paint paint82 = this.f22050a.f22073c;
                        d(canvas, f9, f10, z10, label2, paint72, paint82, mapView);
                    }
                }
            }
        }
        Integer num = this.f22053d;
        if (num == null || num.intValue() >= this.f22051b.size() || this.f22051b.get(this.f22053d.intValue()) == null || this.f22050a.f22072b == null) {
            return;
        }
        projection.toPixels(this.f22051b.get(this.f22053d.intValue()), point);
        org.osmdroid.views.overlay.simplefastpoint.a aVar2 = this.f22050a;
        if (aVar2.f22079i == a.c.CIRCLE) {
            canvas.drawCircle(point.x, point.y, aVar2.f22075e, aVar2.f22072b);
            return;
        }
        int i6 = point.x;
        float f11 = aVar2.f22075e;
        int i7 = point.y;
        canvas.drawRect(i6 - f11, i7 - f11, i6 + f11, i7 + f11, aVar2.f22072b);
    }

    public BoundingBox e() {
        return this.f22052c;
    }

    public Integer f() {
        return this.f22053d;
    }

    public org.osmdroid.views.overlay.simplefastpoint.a g() {
        return this.f22050a;
    }

    public void h(b bVar) {
        this.f22054e = bVar;
    }

    public void i(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() < this.f22051b.size()) {
            this.f22053d = num;
        } else {
            this.f22053d = null;
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        if (!this.f22050a.f22076f) {
            return false;
        }
        Point point = new Point();
        Projection projection = mapView.getProjection();
        Float f5 = null;
        int i5 = -1;
        for (int i6 = 0; i6 < this.f22051b.size(); i6++) {
            if (this.f22051b.get(i6) != null) {
                projection.toPixels(this.f22051b.get(i6), point);
                if (Math.abs(motionEvent.getX() - point.x) <= 50.0f && Math.abs(motionEvent.getY() - point.y) <= 50.0f) {
                    float x4 = ((motionEvent.getX() - point.x) * (motionEvent.getX() - point.x)) + ((motionEvent.getY() - point.y) * (motionEvent.getY() - point.y));
                    if (f5 == null || x4 < f5.floatValue()) {
                        f5 = Float.valueOf(x4);
                        i5 = i6;
                    }
                }
            }
        }
        if (f5 == null) {
            return false;
        }
        i(Integer.valueOf(i5));
        mapView.invalidate();
        b bVar = this.f22054e;
        if (bVar != null) {
            bVar.a(this.f22051b, Integer.valueOf(i5));
            return true;
        }
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (this.f22050a.f22078h != a.b.MAXIMUM_OPTIMIZATION) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.f22061l = true;
                }
            } else {
                this.f22061l = false;
                this.f22063n = mapView.getBoundingBox();
                this.f22064o = mapView.getProjection();
                mapView.invalidate();
            }
        } else {
            this.f22063n = mapView.getBoundingBox();
            this.f22064o = mapView.getProjection();
        }
        return false;
    }

    public SimpleFastPointOverlay(c cVar) {
        this(cVar, org.osmdroid.views.overlay.simplefastpoint.a.d());
    }
}
