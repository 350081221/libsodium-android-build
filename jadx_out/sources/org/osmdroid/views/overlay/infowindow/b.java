package org.osmdroid.views.overlay.infowindow;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import org.osmdroid.api.IMapView;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected View f21945a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f21946b;

    /* renamed from: c, reason: collision with root package name */
    protected MapView f21947c;

    /* renamed from: d, reason: collision with root package name */
    protected Object f21948d;

    /* renamed from: e, reason: collision with root package name */
    private GeoPoint f21949e;

    /* renamed from: f, reason: collision with root package name */
    private int f21950f;

    /* renamed from: g, reason: collision with root package name */
    private int f21951g;

    public b(int i5, MapView mapView) {
        this.f21947c = mapView;
        mapView.getRepository().add(this);
        this.f21946b = false;
        View inflate = ((LayoutInflater) mapView.getContext().getSystemService("layout_inflater")).inflate(i5, (ViewGroup) mapView.getParent(), false);
        this.f21945a = inflate;
        inflate.setTag(this);
    }

    public static void b(MapView mapView) {
        Iterator<b> it = e(mapView).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static ArrayList<b> e(MapView mapView) {
        int childCount = mapView.getChildCount();
        ArrayList<b> arrayList = new ArrayList<>(childCount);
        for (int i5 = 0; i5 < childCount; i5++) {
            Object tag = mapView.getChildAt(i5).getTag();
            if (tag != null && (tag instanceof b)) {
                arrayList.add((b) tag);
            }
        }
        return arrayList;
    }

    public void a() {
        if (this.f21946b) {
            this.f21946b = false;
            ((ViewGroup) this.f21945a.getParent()).removeView(this.f21945a);
            i();
        }
    }

    public void c() {
        if (!this.f21946b) {
            return;
        }
        try {
            this.f21947c.updateViewLayout(this.f21945a, new MapView.LayoutParams(-2, -2, this.f21949e, 8, this.f21950f, this.f21951g));
        } catch (Exception e5) {
            if (!org.osmdroid.views.drawing.a.d()) {
            } else {
                throw e5;
            }
        }
    }

    public MapView d() {
        return this.f21947c;
    }

    public Object f() {
        return this.f21948d;
    }

    public View g() {
        return this.f21945a;
    }

    public boolean h() {
        return this.f21946b;
    }

    public abstract void i();

    public void j() {
        a();
        View view = this.f21945a;
        if (view != null) {
            view.setTag(null);
        }
        this.f21945a = null;
        this.f21947c = null;
        if (org.osmdroid.config.a.a().M()) {
            Log.d(IMapView.LOGTAG, "Marked detached");
        }
    }

    public abstract void k(Object obj);

    public void l(Object obj, GeoPoint geoPoint, int i5, int i6) {
        String str;
        View view;
        a();
        this.f21948d = obj;
        this.f21949e = geoPoint;
        this.f21950f = i5;
        this.f21951g = i6;
        k(obj);
        MapView.LayoutParams layoutParams = new MapView.LayoutParams(-2, -2, this.f21949e, 8, this.f21950f, this.f21951g);
        MapView mapView = this.f21947c;
        if (mapView != null && (view = this.f21945a) != null) {
            mapView.addView(view, layoutParams);
            this.f21946b = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error trapped, InfoWindow.open mMapView: ");
        String str2 = "null";
        if (this.f21947c == null) {
            str = "null";
        } else {
            str = "ok";
        }
        sb.append(str);
        sb.append(" mView: ");
        if (this.f21945a != null) {
            str2 = "ok";
        }
        sb.append(str2);
        Log.w(IMapView.LOGTAG, sb.toString());
    }

    public void m(Object obj) {
        this.f21948d = obj;
    }

    public b(View view, MapView mapView) {
        this.f21947c = mapView;
        this.f21946b = false;
        this.f21945a = view;
        view.setTag(this);
    }
}
