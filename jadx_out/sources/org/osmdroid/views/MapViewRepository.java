package org.osmdroid.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.osmdroid.library.R;
import org.osmdroid.views.overlay.infowindow.a;
import org.osmdroid.views.overlay.infowindow.b;
import org.osmdroid.views.overlay.infowindow.c;

/* loaded from: classes4.dex */
public class MapViewRepository {
    private Drawable mDefaultMarkerIcon;
    private c mDefaultMarkerInfoWindow;
    private a mDefaultPolygonInfoWindow;
    private a mDefaultPolylineInfoWindow;
    private final Set<b> mInfoWindowList = new HashSet();
    private MapView mMapView;

    public MapViewRepository(MapView mapView) {
        this.mMapView = mapView;
    }

    public void add(b bVar) {
        this.mInfoWindowList.add(bVar);
    }

    public Drawable getDefaultMarkerIcon() {
        MapView mapView;
        Context context;
        if (this.mDefaultMarkerIcon == null && (mapView = this.mMapView) != null && (context = mapView.getContext()) != null) {
            this.mDefaultMarkerIcon = context.getResources().getDrawable(R.drawable.f21666h);
        }
        return this.mDefaultMarkerIcon;
    }

    public c getDefaultMarkerInfoWindow() {
        if (this.mDefaultMarkerInfoWindow == null) {
            this.mDefaultMarkerInfoWindow = new c(R.layout.f21689a, this.mMapView);
        }
        return this.mDefaultMarkerInfoWindow;
    }

    public a getDefaultPolygonInfoWindow() {
        if (this.mDefaultPolygonInfoWindow == null) {
            this.mDefaultPolygonInfoWindow = new a(R.layout.f21689a, this.mMapView);
        }
        return this.mDefaultPolygonInfoWindow;
    }

    public a getDefaultPolylineInfoWindow() {
        if (this.mDefaultPolylineInfoWindow == null) {
            this.mDefaultPolylineInfoWindow = new a(R.layout.f21689a, this.mMapView);
        }
        return this.mDefaultPolylineInfoWindow;
    }

    public void onDetach() {
        synchronized (this.mInfoWindowList) {
            Iterator<b> it = this.mInfoWindowList.iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.mInfoWindowList.clear();
        }
        this.mMapView = null;
        this.mDefaultMarkerInfoWindow = null;
        this.mDefaultPolylineInfoWindow = null;
        this.mDefaultPolygonInfoWindow = null;
        this.mDefaultMarkerIcon = null;
    }
}
