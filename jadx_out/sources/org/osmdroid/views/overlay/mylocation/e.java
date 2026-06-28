package org.osmdroid.views.overlay.mylocation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;
import org.osmdroid.api.IMapController;
import org.osmdroid.api.IMapView;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.IOverlayMenuProvider;
import org.osmdroid.views.overlay.Overlay;

/* loaded from: classes4.dex */
public class e extends Overlay implements c, IOverlayMenuProvider, Overlay.Snappable {

    /* renamed from: x, reason: collision with root package name */
    public static final int f22019x = Overlay.getSafeMenuId();

    /* renamed from: a, reason: collision with root package name */
    protected Paint f22020a;

    /* renamed from: b, reason: collision with root package name */
    protected Paint f22021b;

    /* renamed from: c, reason: collision with root package name */
    protected Bitmap f22022c;

    /* renamed from: d, reason: collision with root package name */
    protected Bitmap f22023d;

    /* renamed from: e, reason: collision with root package name */
    protected MapView f22024e;

    /* renamed from: f, reason: collision with root package name */
    private IMapController f22025f;

    /* renamed from: g, reason: collision with root package name */
    public d f22026g;

    /* renamed from: h, reason: collision with root package name */
    private final LinkedList<Runnable> f22027h;

    /* renamed from: i, reason: collision with root package name */
    private final Point f22028i;

    /* renamed from: j, reason: collision with root package name */
    private final Point f22029j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f22030k;

    /* renamed from: l, reason: collision with root package name */
    private Object f22031l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f22032m;

    /* renamed from: n, reason: collision with root package name */
    private Location f22033n;

    /* renamed from: o, reason: collision with root package name */
    private final GeoPoint f22034o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22035p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f22036q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f22037r;

    /* renamed from: s, reason: collision with root package name */
    protected final PointF f22038s;

    /* renamed from: t, reason: collision with root package name */
    protected float f22039t;

    /* renamed from: u, reason: collision with root package name */
    protected float f22040u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22041v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22042w;

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Location f22043a;

        a(Location location) {
            this.f22043a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.w(this.f22043a);
            Iterator it = e.this.f22027h.iterator();
            while (it.hasNext()) {
                Thread thread = new Thread((Runnable) it.next());
                thread.setName(getClass().getName() + "#onLocationChanged");
                thread.start();
            }
            e.this.f22027h.clear();
        }
    }

    public e(MapView mapView) {
        this(new b(mapView.getContext()), mapView);
    }

    public void A(Bitmap bitmap) {
        this.f22022c = bitmap;
    }

    protected void B() {
        Object obj;
        d dVar = this.f22026g;
        if (dVar != null) {
            dVar.b();
        }
        Handler handler = this.f22030k;
        if (handler != null && (obj = this.f22031l) != null) {
            handler.removeCallbacksAndMessages(obj);
        }
    }

    @Override // org.osmdroid.views.overlay.mylocation.c
    public void b(Location location, d dVar) {
        Handler handler;
        if (location != null && (handler = this.f22030k) != null) {
            handler.postAtTime(new a(location), this.f22031l, 0L);
        }
    }

    public void d() {
        IMapController iMapController = this.f22025f;
        if (iMapController != null) {
            iMapController.stopAnimation(false);
        }
        this.f22036q = false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (this.f22033n != null && p()) {
            f(canvas, projection, this.f22033n);
        }
    }

    public void e() {
        this.f22035p = false;
        B();
        MapView mapView = this.f22024e;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    protected void f(Canvas canvas, Projection projection, Location location) {
        projection.toPixels(this.f22034o, this.f22028i);
        if (this.f22037r) {
            float accuracy = location.getAccuracy() / ((float) TileSystem.GroundResolution(location.getLatitude(), projection.getZoomLevel()));
            this.f22021b.setAlpha(50);
            this.f22021b.setStyle(Paint.Style.FILL);
            Point point = this.f22028i;
            canvas.drawCircle(point.x, point.y, accuracy, this.f22021b);
            this.f22021b.setAlpha(150);
            this.f22021b.setStyle(Paint.Style.STROKE);
            Point point2 = this.f22028i;
            canvas.drawCircle(point2.x, point2.y, accuracy, this.f22021b);
        }
        if (location.hasBearing()) {
            canvas.save();
            float bearing = location.getBearing();
            if (bearing >= 360.0f) {
                bearing -= 360.0f;
            }
            Point point3 = this.f22028i;
            canvas.rotate(bearing, point3.x, point3.y);
            Bitmap bitmap = this.f22023d;
            Point point4 = this.f22028i;
            canvas.drawBitmap(bitmap, point4.x - this.f22039t, point4.y - this.f22040u, this.f22020a);
            canvas.restore();
            return;
        }
        canvas.save();
        float f5 = -this.f22024e.getMapOrientation();
        Point point5 = this.f22028i;
        canvas.rotate(f5, point5.x, point5.y);
        Bitmap bitmap2 = this.f22022c;
        float f6 = this.f22028i.x;
        PointF pointF = this.f22038s;
        canvas.drawBitmap(bitmap2, f6 - pointF.x, r8.y - pointF.y, this.f22020a);
        canvas.restore();
    }

    public void g() {
        Location a5;
        this.f22036q = true;
        if (p() && (a5 = this.f22026g.a()) != null) {
            w(a5);
        }
        MapView mapView = this.f22024e;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    public boolean h() {
        return i(this.f22026g);
    }

    public boolean i(d dVar) {
        Location a5;
        x(dVar);
        boolean c5 = this.f22026g.c(this);
        this.f22035p = c5;
        if (c5 && (a5 = this.f22026g.a()) != null) {
            w(a5);
        }
        MapView mapView = this.f22024e;
        if (mapView != null) {
            mapView.postInvalidate();
        }
        return c5;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean isOptionsMenuEnabled() {
        return this.f22041v;
    }

    public boolean j() {
        return this.f22032m;
    }

    public Location k() {
        return this.f22033n;
    }

    public GeoPoint l() {
        if (this.f22033n == null) {
            return null;
        }
        return new GeoPoint(this.f22033n);
    }

    public d m() {
        return this.f22026g;
    }

    public boolean n() {
        return this.f22037r;
    }

    public boolean o() {
        return this.f22036q;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView) {
        menu.add(0, f22019x + i5, 0, mapView.getContext().getResources().getString(R.string.K)).setIcon(mapView.getContext().getResources().getDrawable(R.drawable.f21664f)).setCheckable(true);
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        e();
        this.f22024e = null;
        this.f22030k = null;
        this.f22021b = null;
        this.f22031l = null;
        this.f22033n = null;
        this.f22025f = null;
        d dVar = this.f22026g;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f22026g = null;
        super.onDetach(mapView);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView) {
        if (menuItem.getItemId() - i5 == f22019x) {
            if (p()) {
                d();
                e();
                return true;
            }
            g();
            h();
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onPause() {
        this.f22042w = this.f22036q;
        e();
        super.onPause();
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView) {
        menu.findItem(f22019x + i5).setChecked(p());
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onResume() {
        super.onResume();
        if (this.f22042w) {
            g();
        }
        h();
    }

    @Override // org.osmdroid.views.overlay.Overlay.Snappable
    public boolean onSnapToItem(int i5, int i6, Point point, IMapView iMapView) {
        boolean z4 = false;
        if (this.f22033n != null) {
            this.f22024e.getProjection().toPixels(this.f22034o, this.f22029j);
            Point point2 = this.f22029j;
            point.x = point2.x;
            point.y = point2.y;
            double d5 = i5 - point2.x;
            double d6 = i6 - point2.y;
            if ((d5 * d5) + (d6 * d6) < 64.0d) {
                z4 = true;
            }
            if (org.osmdroid.config.a.a().M()) {
                Log.d(IMapView.LOGTAG, "snap=" + z4);
            }
        }
        return z4;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        boolean z4;
        if (motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (motionEvent.getAction() == 0 && this.f22032m) {
            d();
        } else if (z4 && o()) {
            return true;
        }
        return super.onTouchEvent(motionEvent, mapView);
    }

    public boolean p() {
        return this.f22035p;
    }

    public boolean q(Runnable runnable) {
        if (this.f22026g != null && this.f22033n != null) {
            Thread thread = new Thread(runnable);
            thread.setName(getClass().getName() + "#runOnFirstFix");
            thread.start();
            return true;
        }
        this.f22027h.addLast(runnable);
        return false;
    }

    public void r(float f5, float f6) {
        this.f22039t = this.f22023d.getWidth() * f5;
        this.f22040u = this.f22023d.getHeight() * f6;
    }

    @Deprecated
    public void s(Bitmap bitmap, Bitmap bitmap2) {
        A(bitmap);
        t(bitmap2);
        r(0.5f, 0.5f);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public void setOptionsMenuEnabled(boolean z4) {
        this.f22041v = z4;
    }

    public void t(Bitmap bitmap) {
        this.f22023d = bitmap;
    }

    public void u(boolean z4) {
        this.f22037r = z4;
    }

    public void v(boolean z4) {
        this.f22032m = z4;
    }

    protected void w(Location location) {
        this.f22033n = location;
        this.f22034o.setCoords(location.getLatitude(), this.f22033n.getLongitude());
        if (this.f22036q) {
            this.f22025f.animateTo(this.f22034o);
            return;
        }
        MapView mapView = this.f22024e;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    protected void x(d dVar) {
        if (dVar != null) {
            if (p()) {
                B();
            }
            this.f22026g = dVar;
            return;
        }
        throw new RuntimeException("You must pass an IMyLocationProvider to setMyLocationProvider()");
    }

    public void y(float f5, float f6) {
        this.f22038s.set(this.f22022c.getWidth() * f5, this.f22022c.getHeight() * f6);
    }

    @Deprecated
    public void z(float f5, float f6) {
        this.f22038s.set(f5, f6);
    }

    public e(d dVar, MapView mapView) {
        this.f22020a = new Paint();
        this.f22021b = new Paint();
        this.f22027h = new LinkedList<>();
        this.f22028i = new Point();
        this.f22029j = new Point();
        this.f22031l = new Object();
        this.f22032m = true;
        this.f22034o = new GeoPoint(0, 0);
        this.f22035p = false;
        this.f22036q = false;
        this.f22037r = true;
        this.f22041v = true;
        this.f22042w = false;
        this.f22024e = mapView;
        this.f22025f = mapView.getController();
        this.f22021b.setARGB(0, 100, 100, 255);
        this.f22021b.setAntiAlias(true);
        this.f22020a.setFilterBitmap(true);
        A(((BitmapDrawable) mapView.getContext().getResources().getDrawable(R.drawable.f21676r)).getBitmap());
        t(((BitmapDrawable) mapView.getContext().getResources().getDrawable(R.drawable.f21678t)).getBitmap());
        this.f22038s = new PointF();
        y(0.5f, 0.8125f);
        r(0.5f, 0.5f);
        this.f22030k = new Handler(Looper.getMainLooper());
        x(dVar);
    }
}
