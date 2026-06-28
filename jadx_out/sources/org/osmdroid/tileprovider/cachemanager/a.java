package org.osmdroid.tileprovider.cachemanager;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.osmdroid.api.IMapView;
import org.osmdroid.library.R;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.modules.CantContinueException;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.TileDownloader;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.k;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.IterableWithSize;
import org.osmdroid.util.MapTileArea;
import org.osmdroid.util.MapTileAreaList;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.MyMath;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private TileDownloader f21716a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.osmdroid.tileprovider.tilesource.e f21717b;

    /* renamed from: c, reason: collision with root package name */
    protected final IFilesystemCache f21718c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f21719d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f21720e;

    /* renamed from: f, reason: collision with root package name */
    protected Set<h> f21721f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f21722g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.osmdroid.tileprovider.cachemanager.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0647a extends g {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f21723d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0647a(Context context, h hVar, Context context2) {
            super(context, hVar);
            this.f21723d = context2;
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.g, org.osmdroid.tileprovider.cachemanager.a.f
        public void b(int i5) {
            super.b(i5);
            Context context = this.f21723d;
            Toast.makeText(context, String.format(context.getString(R.string.f21700k), i5 + ""), 0).show();
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.g
        protected String i() {
            return this.f21723d.getString(R.string.f21699j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends g {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f21725d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, h hVar, Context context2) {
            super(context, hVar);
            this.f21725d = context2;
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.g, org.osmdroid.tileprovider.cachemanager.a.f
        public void b(int i5) {
            super.b(i5);
            Context context = this.f21725d;
            Toast.makeText(context, String.format(context.getString(R.string.f21697h), i5 + ""), 0).show();
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.g
        protected String i() {
            return this.f21725d.getString(R.string.f21698i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21727a;

        c(Context context) {
            this.f21727a = context;
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.e
        public int a() {
            return 10;
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.e
        public boolean b(long j5) {
            a aVar = a.this;
            return !aVar.L((OnlineTileSourceBase) aVar.f21717b, j5);
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.e
        public boolean c() {
            org.osmdroid.tileprovider.tilesource.e eVar = a.this.f21717b;
            if (eVar instanceof OnlineTileSourceBase) {
                if (((OnlineTileSourceBase) eVar).getTileSourcePolicy().a()) {
                    return true;
                }
                throw new k(this.f21727a.getString(R.string.f21703n));
            }
            Log.e(IMapView.LOGTAG, "TileSource is not an online tile source");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements e {
        d() {
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.e
        public int a() {
            return 1000;
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.e
        public boolean b(long j5) {
            return a.this.j(j5);
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.e
        public boolean c() {
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        int a();

        boolean b(long j5);

        boolean c();
    }

    /* loaded from: classes4.dex */
    public interface f {
        void a(int i5, int i6, int i7, int i8);

        void b(int i5);

        void c(int i5);

        void d();

        void e();
    }

    /* loaded from: classes4.dex */
    public static abstract class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final h f21730a;

        /* renamed from: b, reason: collision with root package name */
        private final ProgressDialog f21731b;

        /* renamed from: c, reason: collision with root package name */
        private String f21732c;

        /* renamed from: org.osmdroid.tileprovider.cachemanager.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class DialogInterfaceOnCancelListenerC0648a implements DialogInterface.OnCancelListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f21733a;

            /* renamed from: org.osmdroid.tileprovider.cachemanager.a$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            class DialogInterfaceOnClickListenerC0649a implements DialogInterface.OnClickListener {
                DialogInterfaceOnClickListenerC0649a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i5) {
                    g.this.f21730a.cancel(true);
                }
            }

            /* renamed from: org.osmdroid.tileprovider.cachemanager.a$g$a$b */
            /* loaded from: classes4.dex */
            class b implements DialogInterface.OnClickListener {
                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i5) {
                    dialogInterface.dismiss();
                    g.this.f21731b.show();
                }
            }

            DialogInterfaceOnCancelListenerC0648a(Context context) {
                this.f21733a = context;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f21733a);
                builder.setTitle(this.f21733a.getString(R.string.f21696g));
                builder.setMessage(this.f21733a.getString(R.string.f21695f));
                builder.setPositiveButton(this.f21733a.getString(R.string.f21704o), new DialogInterfaceOnClickListenerC0649a());
                builder.setNegativeButton(this.f21733a.getString(R.string.f21702m), new b());
                builder.show();
            }
        }

        /* loaded from: classes4.dex */
        class b implements DialogInterface.OnCancelListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                g.this.f21730a.cancel(true);
            }
        }

        public g(Context context, h hVar) {
            this.f21730a = hVar;
            this.f21732c = context.getString(R.string.f21701l);
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.f21731b = progressDialog;
            progressDialog.setProgressStyle(1);
            progressDialog.setCancelable(true);
            if (hVar.f21738a.J()) {
                progressDialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC0648a(context));
            } else {
                progressDialog.setOnCancelListener(new b());
            }
        }

        private void h() {
            if (this.f21731b.isShowing()) {
                this.f21731b.dismiss();
            }
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.f
        public void a(int i5, int i6, int i7, int i8) {
            this.f21731b.setProgress(i5);
            this.f21731b.setMessage(j(i6, i7, i8));
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.f
        public void b(int i5) {
            h();
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.f
        public void c(int i5) {
            this.f21731b.setMax(i5);
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.f
        public void d() {
            this.f21731b.setTitle(i());
            this.f21731b.show();
        }

        @Override // org.osmdroid.tileprovider.cachemanager.a.f
        public void e() {
            h();
        }

        protected abstract String i();

        protected String j(int i5, int i6, int i7) {
            return String.format(this.f21732c, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
        }
    }

    /* loaded from: classes4.dex */
    private static class i<T> implements IterableWithSize<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<T> f21744a;

        /* synthetic */ i(List list, C0647a c0647a) {
            this(list);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f21744a.iterator();
        }

        @Override // org.osmdroid.util.IterableWithSize
        public int size() {
            return this.f21744a.size();
        }

        private i(List<T> list) {
            this.f21744a = list;
        }
    }

    public a(MapView mapView) throws k {
        this(mapView, mapView.getTileProvider().getTileWriter());
    }

    public static File A(org.osmdroid.tileprovider.tilesource.e eVar, long j5) {
        return new File(org.osmdroid.config.a.a().f(), eVar.getTileRelativeFilenameString(j5) + OpenStreetMapTileProviderConstants.TILE_PATH_EXTENSION);
    }

    @Deprecated
    public static Point B(double d5, double d6, int i5) {
        return new Point(MapView.getTileSystem().getTileXFromLongitude(d6, i5), MapView.getTileSystem().getTileYFromLatitude(d5, i5));
    }

    public static Collection<Long> D(ArrayList<GeoPoint> arrayList, int i5) {
        Iterator<GeoPoint> it;
        int i6;
        int i7;
        int i8;
        boolean z4;
        double d5;
        double atan;
        Iterator<GeoPoint> it2;
        int i9;
        int i10;
        int i11;
        HashSet hashSet = new HashSet();
        boolean z5 = true;
        int i12 = 1 << i5;
        Iterator<GeoPoint> it3 = arrayList.iterator();
        GeoPoint geoPoint = null;
        Point point = null;
        while (it3.hasNext()) {
            GeoPoint next = it3.next();
            double GroundResolution = TileSystem.GroundResolution(next.getLatitude(), i5);
            if (hashSet.size() != 0) {
                if (geoPoint != null) {
                    double latitude = (next.getLatitude() - geoPoint.getLatitude()) / (next.getLongitude() - geoPoint.getLongitude());
                    if (next.getLongitude() > geoPoint.getLongitude()) {
                        d5 = 1.5707963267948966d;
                        atan = Math.atan(latitude);
                    } else {
                        d5 = 4.71238898038469d;
                        atan = Math.atan(latitude);
                    }
                    double d6 = d5 - atan;
                    int i13 = i12;
                    GeoPoint geoPoint2 = new GeoPoint(geoPoint.getLatitude(), geoPoint.getLongitude());
                    while (true) {
                        if (((next.getLatitude() <= geoPoint.getLatitude() || geoPoint2.getLatitude() >= next.getLatitude()) && (next.getLatitude() >= geoPoint.getLatitude() || geoPoint2.getLatitude() <= next.getLatitude())) || ((next.getLongitude() <= geoPoint.getLongitude() || geoPoint2.getLongitude() >= next.getLongitude()) && (next.getLongitude() >= geoPoint.getLongitude() || geoPoint2.getLongitude() <= next.getLongitude()))) {
                            break;
                        }
                        double latitude2 = (geoPoint2.getLatitude() * 3.141592653589793d) / 180.0d;
                        double longitude = (geoPoint2.getLongitude() * 3.141592653589793d) / 180.0d;
                        double d7 = GroundResolution / 6378137.0d;
                        double asin = Math.asin((Math.sin(latitude2) * Math.cos(d7)) + (Math.cos(latitude2) * Math.sin(d7) * Math.cos(d6)));
                        double atan2 = longitude + Math.atan2(Math.sin(d6) * Math.sin(d7) * Math.cos(latitude2), Math.cos(d7) - (Math.sin(latitude2) * Math.sin(asin)));
                        geoPoint2.setLatitude((asin * 180.0d) / 3.141592653589793d);
                        geoPoint2.setLongitude((atan2 * 180.0d) / 3.141592653589793d);
                        Point point2 = new Point(MapView.getTileSystem().getTileXFromLongitude(geoPoint2.getLongitude(), i5), MapView.getTileSystem().getTileYFromLatitude(geoPoint2.getLatitude(), i5));
                        if (!point2.equals(point)) {
                            int i14 = point2.x;
                            if (i14 >= 0) {
                                i10 = 0;
                            } else {
                                i10 = -i14;
                            }
                            int i15 = point2.y;
                            if (i15 >= 0) {
                                i11 = 0;
                            } else {
                                i11 = -i15;
                            }
                            int i16 = i14 + i10;
                            while (true) {
                                int i17 = 1;
                                if (i16 > point2.x + 1 + i10) {
                                    break;
                                }
                                int i18 = point2.y + i11;
                                Iterator<GeoPoint> it4 = it3;
                                while (i18 <= point2.y + i17 + i11) {
                                    int i19 = i13;
                                    hashSet.add(Long.valueOf(MapTileIndex.getTileIndex(i5, MyMath.mod(i16, i19), MyMath.mod(i18, i19))));
                                    i18++;
                                    point2 = point2;
                                    i17 = 1;
                                    i13 = i19;
                                }
                                i16++;
                                i13 = i13;
                                it3 = it4;
                            }
                            it2 = it3;
                            i9 = i13;
                            point = point2;
                        } else {
                            it2 = it3;
                            i9 = i13;
                        }
                        i13 = i9;
                        it3 = it2;
                    }
                    it = it3;
                    i6 = i13;
                    z4 = true;
                } else {
                    it = it3;
                    i6 = i12;
                    z4 = z5;
                }
            } else {
                it = it3;
                i6 = i12;
                Point point3 = new Point(MapView.getTileSystem().getTileXFromLongitude(next.getLongitude(), i5), MapView.getTileSystem().getTileYFromLatitude(next.getLatitude(), i5));
                int i20 = point3.x;
                if (i20 >= 0) {
                    i7 = 0;
                } else {
                    i7 = -i20;
                }
                int i21 = point3.y;
                if (i21 >= 0) {
                    i8 = 0;
                } else {
                    i8 = -i21;
                }
                int i22 = i20 + i7;
                while (true) {
                    z4 = true;
                    if (i22 > point3.x + 1 + i7) {
                        break;
                    }
                    for (int i23 = point3.y + i8; i23 <= point3.y + 1 + i8; i23++) {
                        hashSet.add(Long.valueOf(MapTileIndex.getTileIndex(i5, MyMath.mod(i22, i6), MyMath.mod(i23, i6))));
                    }
                    i22++;
                }
                point = point3;
            }
            i12 = i6;
            geoPoint = next;
            z5 = z4;
            it3 = it;
        }
        return hashSet;
    }

    public static Collection<Long> E(BoundingBox boundingBox, int i5) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Long> it = H(boundingBox, i5, i5).iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static List<Long> F(ArrayList<GeoPoint> arrayList, int i5, int i6) {
        ArrayList arrayList2 = new ArrayList();
        while (i5 <= i6) {
            arrayList2.addAll(D(arrayList, i5));
            i5++;
        }
        return arrayList2;
    }

    public static List<Long> G(BoundingBox boundingBox, int i5, int i6) {
        ArrayList arrayList = new ArrayList();
        while (i5 <= i6) {
            arrayList.addAll(E(boundingBox, i5));
            i5++;
        }
        return arrayList;
    }

    static IterableWithSize<Long> H(BoundingBox boundingBox, int i5, int i6) {
        MapTileAreaList mapTileAreaList = new MapTileAreaList();
        while (i5 <= i6) {
            mapTileAreaList.getList().add(new MapTileArea().set(i5, I(boundingBox, i5)));
            i5++;
        }
        return mapTileAreaList;
    }

    public static Rect I(BoundingBox boundingBox, int i5) {
        int i6 = 1 << i5;
        int tileXFromLongitude = MapView.getTileSystem().getTileXFromLongitude(boundingBox.getLonEast(), i5);
        int tileYFromLatitude = MapView.getTileSystem().getTileYFromLatitude(boundingBox.getLatSouth(), i5);
        int tileXFromLongitude2 = MapView.getTileSystem().getTileXFromLongitude(boundingBox.getLonWest(), i5);
        int tileYFromLatitude2 = MapView.getTileSystem().getTileYFromLatitude(boundingBox.getLatNorth(), i5);
        int i7 = (tileXFromLongitude - tileXFromLongitude2) + 1;
        if (i7 <= 0) {
            i7 += i6;
        }
        int i8 = (tileYFromLatitude - tileYFromLatitude2) + 1;
        if (i8 <= 0) {
            i8 += i6;
        }
        return new Rect(tileXFromLongitude2, tileYFromLatitude2, (i7 + tileXFromLongitude2) - 1, (i8 + tileYFromLatitude2) - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(long j5) {
        return d(j5) && !this.f21718c.remove(this.f21717b, j5);
    }

    @Deprecated
    public static GeoPoint x(int i5, int i6, int i7) {
        return new GeoPoint(MapView.getTileSystem().getLatitudeFromTileY(i6, i7), MapView.getTileSystem().getLongitudeFromTileX(i5, i7));
    }

    public int C() {
        return this.f21721f.size();
    }

    public boolean J() {
        return this.f21722g;
    }

    public boolean K(org.osmdroid.tileprovider.tilesource.e eVar, long j5) {
        Long expirationTimestamp = this.f21718c.getExpirationTimestamp(eVar, j5);
        if (expirationTimestamp == null || System.currentTimeMillis() > expirationTimestamp.longValue()) {
            return true;
        }
        return false;
    }

    public boolean L(OnlineTileSourceBase onlineTileSourceBase, long j5) {
        if (A(onlineTileSourceBase, j5).exists() || this.f21718c.exists(onlineTileSourceBase, j5)) {
            return true;
        }
        return u(onlineTileSourceBase, j5);
    }

    public int M(ArrayList<GeoPoint> arrayList, int i5, int i6) {
        return F(arrayList, i5, i6).size();
    }

    public int N(BoundingBox boundingBox, int i5, int i6) {
        return H(boundingBox, i5, i6).size();
    }

    public void O(TileDownloader tileDownloader) {
        this.f21716a = tileDownloader;
    }

    public void P(boolean z4) {
        this.f21722g = z4;
    }

    public long b() {
        return org.osmdroid.config.a.a().i();
    }

    public void c() {
        Iterator<h> it = this.f21721f.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.f21721f.clear();
    }

    public boolean d(long j5) {
        return this.f21718c.exists(this.f21717b, j5);
    }

    public h e(Context context, ArrayList<GeoPoint> arrayList, int i5, int i6) {
        return g(context, t(arrayList, i5), i5, i6);
    }

    public h f(Context context, List<Long> list, int i5, int i6) {
        h hVar = new h(this, v(), list, i5, i6);
        hVar.b(w(context, hVar));
        return s(hVar);
    }

    public h g(Context context, BoundingBox boundingBox, int i5, int i6) {
        h hVar = new h(this, v(), boundingBox, i5, i6);
        hVar.b(w(context, hVar));
        return s(hVar);
    }

    public long h() {
        return k(org.osmdroid.config.a.a().f());
    }

    public boolean i(long j5) {
        return !d(j5) || this.f21718c.remove(this.f21717b, j5);
    }

    public long k(File file) {
        long k5;
        File[] listFiles = file.listFiles();
        long j5 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    k5 = file2.length();
                } else if (file2.isDirectory()) {
                    k5 = k(file2);
                }
                j5 += k5;
            }
        }
        return j5;
    }

    public h l(Context context, ArrayList<GeoPoint> arrayList, int i5, int i6) {
        h hVar = new h(this, y(context), arrayList, i5, i6);
        hVar.b(z(context, hVar));
        return s(hVar);
    }

    public h m(Context context, ArrayList<GeoPoint> arrayList, int i5, int i6, f fVar) {
        h hVar = new h(this, y(context), arrayList, i5, i6);
        hVar.b(fVar);
        hVar.b(z(context, hVar));
        return s(hVar);
    }

    public h n(Context context, List<Long> list, int i5, int i6) {
        h hVar = new h(this, y(context), list, i5, i6);
        hVar.b(z(context, hVar));
        return s(hVar);
    }

    public h o(Context context, BoundingBox boundingBox, int i5, int i6) {
        h hVar = new h(this, y(context), boundingBox, i5, i6);
        hVar.b(z(context, hVar));
        return s(hVar);
    }

    public h p(Context context, BoundingBox boundingBox, int i5, int i6, f fVar) {
        h hVar = new h(this, y(context), boundingBox, i5, i6);
        hVar.b(fVar);
        hVar.b(z(context, hVar));
        return s(hVar);
    }

    public h q(Context context, ArrayList<GeoPoint> arrayList, int i5, int i6, f fVar) {
        h hVar = new h(this, y(context), arrayList, i5, i6);
        hVar.b(fVar);
        return s(hVar);
    }

    public h r(Context context, BoundingBox boundingBox, int i5, int i6, f fVar) {
        h hVar = new h(this, y(context), boundingBox, i5, i6);
        hVar.b(fVar);
        s(hVar);
        return hVar;
    }

    public h s(h hVar) {
        hVar.execute(new Object[0]);
        this.f21721f.add(hVar);
        return hVar;
    }

    public BoundingBox t(ArrayList<GeoPoint> arrayList, int i5) {
        BoundingBox fromGeoPoints = BoundingBox.fromGeoPoints(arrayList);
        return new BoundingBox(MapView.getTileSystem().getLatitudeFromTileY(MapView.getTileSystem().getTileYFromLatitude(fromGeoPoints.getLatNorth(), i5) - 1, i5), MapView.getTileSystem().getLongitudeFromTileX(MapView.getTileSystem().getTileXFromLongitude(fromGeoPoints.getLonEast(), i5) + 1, i5), MapView.getTileSystem().getLatitudeFromTileY(MapView.getTileSystem().getTileYFromLatitude(fromGeoPoints.getLatSouth(), i5) + 1, i5), MapView.getTileSystem().getLongitudeFromTileX(MapView.getTileSystem().getTileXFromLongitude(fromGeoPoints.getLonWest(), i5) - 1, i5));
    }

    public boolean u(OnlineTileSourceBase onlineTileSourceBase, long j5) {
        try {
            return this.f21716a.downloadTile(j5, this.f21718c, onlineTileSourceBase) != null;
        } catch (CantContinueException unused) {
            return false;
        }
    }

    public e v() {
        return new d();
    }

    public g w(Context context, h hVar) {
        return new b(context, hVar, context);
    }

    public e y(Context context) {
        return new c(context);
    }

    public g z(Context context, h hVar) {
        return new C0647a(context, hVar, context);
    }

    public a(MapView mapView, IFilesystemCache iFilesystemCache) throws k {
        this(mapView.getTileProvider(), iFilesystemCache, (int) mapView.getMinZoomLevel(), (int) mapView.getMaxZoomLevel());
    }

    public a(MapTileProviderBase mapTileProviderBase, IFilesystemCache iFilesystemCache, int i5, int i6) throws k {
        this(mapTileProviderBase.getTileSource(), iFilesystemCache, i5, i6);
    }

    public a(org.osmdroid.tileprovider.tilesource.e eVar, IFilesystemCache iFilesystemCache, int i5, int i6) throws k {
        this.f21716a = new TileDownloader();
        this.f21721f = new HashSet();
        this.f21722g = true;
        this.f21717b = eVar;
        this.f21718c = iFilesystemCache;
        this.f21719d = i5;
        this.f21720e = i6;
    }

    /* loaded from: classes4.dex */
    public static class h extends AsyncTask<Object, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final a f21738a;

        /* renamed from: b, reason: collision with root package name */
        private final e f21739b;

        /* renamed from: c, reason: collision with root package name */
        private final IterableWithSize<Long> f21740c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21741d;

        /* renamed from: e, reason: collision with root package name */
        private final int f21742e;

        /* renamed from: f, reason: collision with root package name */
        private final ArrayList<f> f21743f;

        private h(a aVar, e eVar, IterableWithSize<Long> iterableWithSize, int i5, int i6) {
            this.f21743f = new ArrayList<>();
            this.f21738a = aVar;
            this.f21739b = eVar;
            this.f21740c = iterableWithSize;
            this.f21741d = Math.max(i5, aVar.f21719d);
            this.f21742e = Math.min(i6, aVar.f21720e);
        }

        private void d(Throwable th) {
            Log.w(IMapView.LOGTAG, "Error caught processing cachemanager callback, your implementation is faulty", th);
        }

        public void b(f fVar) {
            if (fVar != null) {
                this.f21743f.add(fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Object... objArr) {
            if (!this.f21739b.c()) {
                return 0;
            }
            Iterator<Long> it = this.f21740c.iterator();
            int i5 = 0;
            int i6 = 0;
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                int zoom = MapTileIndex.getZoom(longValue);
                if (zoom >= this.f21741d && zoom <= this.f21742e && this.f21739b.b(longValue)) {
                    i5++;
                }
                i6++;
                if (i6 % this.f21739b.a() == 0) {
                    if (isCancelled()) {
                        return Integer.valueOf(i5);
                    }
                    publishProgress(Integer.valueOf(i6), Integer.valueOf(MapTileIndex.getZoom(longValue)));
                }
            }
            return Integer.valueOf(i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            this.f21738a.f21721f.remove(this);
            Iterator<f> it = this.f21743f.iterator();
            while (it.hasNext()) {
                f next = it.next();
                try {
                    if (num.intValue() == 0) {
                        next.e();
                    } else {
                        next.b(num.intValue());
                    }
                } catch (Throwable th) {
                    d(th);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            Iterator<f> it = this.f21743f.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(numArr[0].intValue(), numArr[1].intValue(), this.f21741d, this.f21742e);
                } catch (Throwable th) {
                    d(th);
                }
            }
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            this.f21738a.f21721f.remove(this);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            int size = this.f21740c.size();
            Iterator<f> it = this.f21743f.iterator();
            while (it.hasNext()) {
                f next = it.next();
                try {
                    next.c(size);
                    next.d();
                    int i5 = this.f21741d;
                    next.a(0, i5, i5, this.f21742e);
                } catch (Throwable th) {
                    d(th);
                }
            }
        }

        public h(a aVar, e eVar, List<Long> list, int i5, int i6) {
            this(aVar, eVar, new i(list, null), i5, i6);
        }

        public h(a aVar, e eVar, ArrayList<GeoPoint> arrayList, int i5, int i6) {
            this(aVar, eVar, a.F(arrayList, i5, i6), i5, i6);
        }

        public h(a aVar, e eVar, BoundingBox boundingBox, int i5, int i6) {
            this(aVar, eVar, a.H(boundingBox, i5, i6), i5, i6);
        }
    }
}
