package org.osmdroid.views.overlay.infowindow;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import org.osmdroid.api.IMapView;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: m, reason: collision with root package name */
    protected Marker f21952m;

    public c(int i5, MapView mapView) {
        super(i5, mapView);
    }

    @Override // org.osmdroid.views.overlay.infowindow.a, org.osmdroid.views.overlay.infowindow.b
    public void i() {
        super.i();
        this.f21952m = null;
    }

    @Override // org.osmdroid.views.overlay.infowindow.a, org.osmdroid.views.overlay.infowindow.b
    public void k(Object obj) {
        super.k(obj);
        this.f21952m = (Marker) obj;
        View view = this.f21945a;
        if (view == null) {
            Log.w(IMapView.LOGTAG, "Error trapped, MarkerInfoWindow.open, mView is null!");
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(a.f21943l);
        Drawable image = this.f21952m.getImage();
        if (image != null) {
            imageView.setImageDrawable(image);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }

    public Marker o() {
        return this.f21952m;
    }
}
