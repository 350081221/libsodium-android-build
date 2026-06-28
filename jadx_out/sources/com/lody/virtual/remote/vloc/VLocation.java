package com.lody.virtual.remote.vloc;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import com.lody.virtual.client.env.VirtualGPSSatalines;
import com.lody.virtual.helper.utils.Reflect;

/* loaded from: classes3.dex */
public class VLocation implements Parcelable {
    public static final Parcelable.Creator<VLocation> CREATOR = new Parcelable.Creator<VLocation>() { // from class: com.lody.virtual.remote.vloc.VLocation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VLocation createFromParcel(Parcel parcel) {
            return new VLocation(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VLocation[] newArray(int i5) {
            return new VLocation[i5];
        }
    };
    public float accuracy;
    public double altitude;
    public float bearing;
    public double latitude;
    public double longitude;
    public float speed;

    public VLocation() {
        this.latitude = 0.0d;
        this.longitude = 0.0d;
        this.altitude = 0.0d;
        this.accuracy = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public boolean isEmpty() {
        return this.latitude == 0.0d && this.longitude == 0.0d;
    }

    public String toString() {
        return "VLocation{latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", accuracy=" + this.accuracy + ", speed=" + this.speed + ", bearing=" + this.bearing + '}';
    }

    public Location toSysLocation() {
        Location location = new Location("gps");
        location.setAccuracy(8.0f);
        Bundle bundle = new Bundle();
        location.setBearing(this.bearing);
        Reflect.on(location).call("setIsFromMockProvider", Boolean.FALSE);
        location.setLatitude(this.latitude);
        location.setLongitude(this.longitude);
        location.setSpeed(this.speed);
        location.setTime(System.currentTimeMillis());
        int svCount = VirtualGPSSatalines.get().getSvCount();
        bundle.putInt("satellites", svCount);
        bundle.putInt("satellitesvalue", svCount);
        location.setExtras(bundle);
        location.setTime(System.currentTimeMillis());
        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        try {
            Reflect.on(location).call("makeComplete");
        } catch (Exception unused) {
            Log.d("test", "异常" + location);
        }
        return location;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
        parcel.writeFloat(this.accuracy);
        parcel.writeFloat(this.speed);
        parcel.writeFloat(this.bearing);
    }

    public VLocation(double d5, double d6) {
        this.altitude = 0.0d;
        this.accuracy = 0.0f;
        this.latitude = d5;
        this.longitude = d6;
    }

    public VLocation(Parcel parcel) {
        this.latitude = 0.0d;
        this.longitude = 0.0d;
        this.altitude = 0.0d;
        this.accuracy = 0.0f;
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.altitude = parcel.readDouble();
        this.accuracy = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.bearing = parcel.readFloat();
    }
}
