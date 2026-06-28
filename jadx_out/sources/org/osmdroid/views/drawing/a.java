package org.osmdroid.views.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.TileStates;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.TilesOverlay;

/* loaded from: classes4.dex */
public class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final int f21841o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f21842p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f21843q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f21844r = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final int f21845s = 15;

    /* renamed from: a, reason: collision with root package name */
    private final RectL f21846a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21847b;

    /* renamed from: c, reason: collision with root package name */
    private Projection f21848c;

    /* renamed from: d, reason: collision with root package name */
    private org.osmdroid.views.drawing.b f21849d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0651a f21850e;

    /* renamed from: f, reason: collision with root package name */
    private MapTileProviderBase f21851f;

    /* renamed from: g, reason: collision with root package name */
    private TilesOverlay f21852g;

    /* renamed from: h, reason: collision with root package name */
    private List<Overlay> f21853h;

    /* renamed from: i, reason: collision with root package name */
    private b f21854i;

    /* renamed from: j, reason: collision with root package name */
    private Bitmap f21855j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21856k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21857l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21858m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21859n;

    /* renamed from: org.osmdroid.views.drawing.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0651a {
        void callback(a aVar);
    }

    /* loaded from: classes4.dex */
    public enum b {
        NOTHING,
        STARTED,
        TILES_OK,
        PAINTING,
        CANVAS_OK
    }

    public a(InterfaceC0651a interfaceC0651a, int i5, MapView mapView) {
        this(interfaceC0651a, i5, mapView.getTileProvider(), mapView.getOverlays(), mapView.getProjection());
    }

    private void a() {
        this.f21855j = Bitmap.createBitmap(this.f21848c.getWidth(), this.f21848c.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21855j);
        this.f21848c.save(canvas, true, false);
        TilesOverlay tilesOverlay = this.f21852g;
        Projection projection = this.f21848c;
        tilesOverlay.drawTiles(canvas, projection, projection.getZoomLevel(), this.f21846a);
        List<Overlay> list = this.f21853h;
        if (list != null) {
            for (Overlay overlay : list) {
                if (overlay != null && overlay.isEnabled()) {
                    overlay.draw(canvas, this.f21848c);
                }
            }
        }
        this.f21848c.restore(canvas, false);
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private void f() {
        b bVar;
        if (!k()) {
            return;
        }
        TileStates tileStates = this.f21852g.getTileStates();
        do {
            TilesOverlay tilesOverlay = this.f21852g;
            Projection projection = this.f21848c;
            tilesOverlay.drawTiles(null, projection, projection.getZoomLevel(), this.f21846a);
            int i5 = this.f21847b;
            boolean z4 = true;
            if (i5 != 0 && i5 != 15) {
                if ((i5 & 1) == 0 && tileStates.getUpToDate() != 0) {
                    z4 = false;
                }
                if (z4 && (this.f21847b & 2) == 0 && tileStates.getExpired() != 0) {
                    z4 = false;
                }
                if (z4 && (this.f21847b & 4) == 0 && tileStates.getScaled() != 0) {
                    z4 = false;
                }
                if (z4 && (this.f21847b & 8) == 0 && tileStates.getNotFound() != 0) {
                    z4 = false;
                }
            }
            if (z4) {
                b bVar2 = this.f21854i;
                b bVar3 = b.CANVAS_OK;
                if (bVar2 == bVar3 || bVar2 == (bVar = b.PAINTING) || !j()) {
                    return;
                }
                this.f21854i = bVar;
                if (this.f21856k) {
                    return;
                }
                a();
                this.f21854i = bVar3;
                InterfaceC0651a interfaceC0651a = this.f21850e;
                if (interfaceC0651a != null) {
                    interfaceC0651a.callback(this);
                }
            }
        } while (i());
    }

    private synchronized boolean h() {
        this.f21857l = true;
        return true ^ this.f21858m;
    }

    private synchronized boolean i() {
        if (this.f21856k) {
            return false;
        }
        if (this.f21859n) {
            return false;
        }
        if (!this.f21857l) {
            this.f21858m = false;
            return false;
        }
        this.f21857l = false;
        return true;
    }

    private synchronized boolean j() {
        boolean z4;
        if (!this.f21859n) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f21859n = true;
        return z4;
    }

    private synchronized boolean k() {
        if (this.f21856k) {
            return false;
        }
        if (this.f21859n) {
            return false;
        }
        if (!this.f21857l) {
            return false;
        }
        if (this.f21858m) {
            return false;
        }
        this.f21857l = false;
        this.f21858m = true;
        return true;
    }

    private static boolean l(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e6) {
                e6.printStackTrace();
                return true;
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    return false;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    public Bitmap b() {
        return this.f21855j;
    }

    public b c() {
        return this.f21854i;
    }

    public void e() {
        this.f21856k = true;
        this.f21848c = null;
        this.f21851f.getTileRequestCompleteHandlers().remove(this.f21849d);
        this.f21851f.detach();
        this.f21851f = null;
        this.f21849d.a();
        this.f21849d = null;
        this.f21850e = null;
        this.f21852g = null;
        this.f21853h = null;
        this.f21855j = null;
    }

    public void g() {
        if (h()) {
            f();
        }
    }

    public boolean m(File file) {
        return l(this.f21855j, file);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21854i = b.STARTED;
        g();
    }

    public a(InterfaceC0651a interfaceC0651a, int i5, MapTileProviderBase mapTileProviderBase, List<Overlay> list, Projection projection) {
        RectL rectL = new RectL();
        this.f21846a = rectL;
        this.f21854i = b.NOTHING;
        this.f21850e = interfaceC0651a;
        this.f21847b = i5;
        this.f21851f = mapTileProviderBase;
        this.f21853h = list;
        this.f21848c = projection;
        projection.getMercatorViewPort(rectL);
        TilesOverlay tilesOverlay = new TilesOverlay(this.f21851f, null);
        this.f21852g = tilesOverlay;
        tilesOverlay.setHorizontalWrapEnabled(this.f21848c.isHorizontalWrapEnabled());
        this.f21852g.setVerticalWrapEnabled(this.f21848c.isVerticalWrapEnabled());
        this.f21849d = new org.osmdroid.views.drawing.b(this);
        this.f21851f.getTileRequestCompleteHandlers().add(this.f21849d);
    }
}
