package org.osmdroid;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class LocationListenerProxy implements LocationListener {
    private LocationListener mListener = null;
    private final LocationManager mLocationManager;

    public LocationListenerProxy(LocationManager locationManager) {
        this.mLocationManager = locationManager;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        LocationListener locationListener = this.mListener;
        if (locationListener != null) {
            locationListener.onLocationChanged(location);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        LocationListener locationListener = this.mListener;
        if (locationListener != null) {
            locationListener.onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        LocationListener locationListener = this.mListener;
        if (locationListener != null) {
            locationListener.onProviderEnabled(str);
        }
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i5, Bundle bundle) {
        LocationListener locationListener = this.mListener;
        if (locationListener != null) {
            locationListener.onStatusChanged(str, i5, bundle);
        }
    }

    public boolean startListening(LocationListener locationListener, long j5, float f5) {
        this.mListener = locationListener;
        boolean z4 = false;
        for (String str : this.mLocationManager.getProviders(true)) {
            if ("gps".equals(str) || "network".equals(str)) {
                this.mLocationManager.requestLocationUpdates(str, j5, f5, this);
                z4 = true;
            }
        }
        return z4;
    }

    public void stopListening() {
        this.mListener = null;
        this.mLocationManager.removeUpdates(this);
    }
}
