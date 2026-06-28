package org.osmdroid.views.overlay.mylocation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.http.Headers;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.api.IMapView;
import org.osmdroid.util.NetworkLocationIgnorer;

/* loaded from: classes4.dex */
public class b implements d, LocationListener {

    /* renamed from: a, reason: collision with root package name */
    private LocationManager f22012a;

    /* renamed from: b, reason: collision with root package name */
    private Location f22013b;

    /* renamed from: c, reason: collision with root package name */
    private c f22014c;

    /* renamed from: d, reason: collision with root package name */
    private long f22015d = 0;

    /* renamed from: e, reason: collision with root package name */
    private float f22016e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private NetworkLocationIgnorer f22017f = new NetworkLocationIgnorer();

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f22018g;

    public b(Context context) {
        HashSet hashSet = new HashSet();
        this.f22018g = hashSet;
        this.f22012a = (LocationManager) context.getSystemService(Headers.LOCATION);
        hashSet.add("gps");
        hashSet.add("network");
    }

    @Override // org.osmdroid.views.overlay.mylocation.d
    public Location a() {
        return this.f22013b;
    }

    @Override // org.osmdroid.views.overlay.mylocation.d
    @SuppressLint({"MissingPermission"})
    public void b() {
        this.f22014c = null;
        LocationManager locationManager = this.f22012a;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this);
            } catch (Throwable th) {
                Log.w(IMapView.LOGTAG, "Unable to deattach location listener", th);
            }
        }
    }

    @Override // org.osmdroid.views.overlay.mylocation.d
    @SuppressLint({"MissingPermission"})
    public boolean c(c cVar) {
        this.f22014c = cVar;
        boolean z4 = false;
        for (String str : this.f22012a.getProviders(true)) {
            if (this.f22018g.contains(str)) {
                try {
                    this.f22012a.requestLocationUpdates(str, this.f22015d, this.f22016e, this);
                    z4 = true;
                } catch (Throwable th) {
                    Log.e(IMapView.LOGTAG, "Unable to attach listener for location provider " + str + " check permissions?", th);
                }
            }
        }
        return z4;
    }

    public void d(String str) {
        this.f22018g.add(str);
    }

    @Override // org.osmdroid.views.overlay.mylocation.d
    public void destroy() {
        b();
        this.f22013b = null;
        this.f22012a = null;
        this.f22014c = null;
        this.f22017f = null;
    }

    public void e() {
        this.f22018g.clear();
    }

    public Set<String> f() {
        return this.f22018g;
    }

    public float g() {
        return this.f22016e;
    }

    public long h() {
        return this.f22015d;
    }

    public void i(float f5) {
        this.f22016e = f5;
    }

    public void j(long j5) {
        this.f22015d = j5;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.f22017f == null) {
            Log.w(IMapView.LOGTAG, "GpsMyLocation provider, mIgnore is null, unexpected. Location update will be ignored");
            return;
        }
        if (location == null || location.getProvider() == null || this.f22017f.shouldIgnore(location.getProvider(), System.currentTimeMillis())) {
            return;
        }
        this.f22013b = location;
        c cVar = this.f22014c;
        if (cVar != null) {
            cVar.b(location, this);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i5, Bundle bundle) {
    }
}
