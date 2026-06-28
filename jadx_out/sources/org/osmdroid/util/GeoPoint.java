package org.osmdroid.util;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.util.constants.GeoConstants;
import s4.a;

/* loaded from: classes4.dex */
public class GeoPoint implements IGeoPoint, a, GeoConstants, Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator<GeoPoint>() { // from class: org.osmdroid.util.GeoPoint.1
        @Override // android.os.Parcelable.Creator
        public GeoPoint createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public GeoPoint[] newArray(int i5) {
            return new GeoPoint[i5];
        }
    };
    static final long serialVersionUID = 1;
    private double mAltitude;
    private double mLatitude;
    private double mLongitude;

    public static GeoPoint fromCenterBetween(GeoPoint geoPoint, GeoPoint geoPoint2) {
        return new GeoPoint((geoPoint.getLatitude() + geoPoint2.getLatitude()) / 2.0d, (geoPoint.getLongitude() + geoPoint2.getLongitude()) / 2.0d);
    }

    public static GeoPoint fromDoubleString(String str, char c5) {
        int indexOf = str.indexOf(c5);
        int i5 = indexOf + 1;
        int indexOf2 = str.indexOf(c5, i5);
        if (indexOf2 == -1) {
            return new GeoPoint(Double.parseDouble(str.substring(0, indexOf)), Double.parseDouble(str.substring(i5, str.length())));
        }
        return new GeoPoint(Double.parseDouble(str.substring(0, indexOf)), Double.parseDouble(str.substring(i5, indexOf2)), Double.parseDouble(str.substring(indexOf2 + 1, str.length())));
    }

    @Deprecated
    public static GeoPoint fromIntString(String str) {
        int indexOf = str.indexOf(44);
        int i5 = indexOf + 1;
        int indexOf2 = str.indexOf(44, i5);
        if (indexOf2 == -1) {
            return new GeoPoint(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(i5, str.length())));
        }
        return new GeoPoint(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(i5, indexOf2)), Integer.parseInt(str.substring(indexOf2 + 1, str.length())));
    }

    public static GeoPoint fromInvertedDoubleString(String str, char c5) {
        int indexOf = str.indexOf(c5);
        int i5 = indexOf + 1;
        int indexOf2 = str.indexOf(c5, i5);
        if (indexOf2 == -1) {
            return new GeoPoint(Double.parseDouble(str.substring(i5, str.length())), Double.parseDouble(str.substring(0, indexOf)));
        }
        return new GeoPoint(Double.parseDouble(str.substring(i5, indexOf2)), Double.parseDouble(str.substring(0, indexOf)), Double.parseDouble(str.substring(indexOf2 + 1, str.length())));
    }

    public double bearingTo(IGeoPoint iGeoPoint) {
        double radians = Math.toRadians(this.mLatitude);
        double radians2 = Math.toRadians(this.mLongitude);
        double radians3 = Math.toRadians(iGeoPoint.getLatitude());
        double radians4 = Math.toRadians(iGeoPoint.getLongitude()) - radians2;
        return (Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))) + 360.0d) % 360.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GeoPoint destinationPoint(double d5, double d6) {
        double d7 = d5 / 6378137.0d;
        double d8 = d6 * 0.017453292519943295d;
        double latitude = getLatitude() * 0.017453292519943295d;
        double longitude = getLongitude() * 0.017453292519943295d;
        double asin = Math.asin((Math.sin(latitude) * Math.cos(d7)) + (Math.cos(latitude) * Math.sin(d7) * Math.cos(d8)));
        return new GeoPoint(asin / 0.017453292519943295d, (longitude + Math.atan2((Math.sin(d8) * Math.sin(d7)) * Math.cos(latitude), Math.cos(d7) - (Math.sin(latitude) * Math.sin(asin)))) / 0.017453292519943295d);
    }

    public double distanceToAsDouble(IGeoPoint iGeoPoint) {
        double latitude = getLatitude() * 0.017453292519943295d;
        double latitude2 = iGeoPoint.getLatitude() * 0.017453292519943295d;
        double longitude = getLongitude() * 0.017453292519943295d;
        return Math.asin(Math.min(1.0d, Math.sqrt(Math.pow(Math.sin((latitude2 - latitude) / 2.0d), 2.0d) + (Math.cos(latitude) * Math.cos(latitude2) * Math.pow(Math.sin(((iGeoPoint.getLongitude() * 0.017453292519943295d) - longitude) / 2.0d), 2.0d))))) * 1.2756274E7d;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        if (geoPoint.mLatitude != this.mLatitude || geoPoint.mLongitude != this.mLongitude || geoPoint.mAltitude != this.mAltitude) {
            return false;
        }
        return true;
    }

    public double getAltitude() {
        return this.mAltitude;
    }

    @Override // org.osmdroid.api.IGeoPoint
    public double getLatitude() {
        return this.mLatitude;
    }

    @Override // org.osmdroid.api.IGeoPoint
    @Deprecated
    public int getLatitudeE6() {
        return (int) (getLatitude() * 1000000.0d);
    }

    @Override // org.osmdroid.api.IGeoPoint
    public double getLongitude() {
        return this.mLongitude;
    }

    @Override // org.osmdroid.api.IGeoPoint
    @Deprecated
    public int getLongitudeE6() {
        return (int) (getLongitude() * 1000000.0d);
    }

    public int hashCode() {
        return (((((int) (this.mLatitude * 1.0E-6d)) * 17) + ((int) (this.mLongitude * 1.0E-6d))) * 37) + ((int) this.mAltitude);
    }

    public void setAltitude(double d5) {
        this.mAltitude = d5;
    }

    public void setCoords(double d5, double d6) {
        this.mLatitude = d5;
        this.mLongitude = d6;
    }

    public void setLatitude(double d5) {
        this.mLatitude = d5;
    }

    public void setLongitude(double d5) {
        this.mLongitude = d5;
    }

    public String toDoubleString() {
        return this.mLatitude + "," + this.mLongitude + "," + this.mAltitude;
    }

    public String toIntString() {
        return ((int) (this.mLatitude * 1000000.0d)) + "," + ((int) (this.mLongitude * 1000000.0d)) + "," + ((int) this.mAltitude);
    }

    public String toInvertedDoubleString() {
        return this.mLongitude + "," + this.mLatitude + "," + this.mAltitude;
    }

    public String toString() {
        return this.mLatitude + "," + this.mLongitude + "," + this.mAltitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.mAltitude);
    }

    @Deprecated
    public GeoPoint(int i5, int i6) {
        this.mLatitude = i5 / 1000000.0d;
        this.mLongitude = i6 / 1000000.0d;
    }

    @Override // 
    public GeoPoint clone() {
        return new GeoPoint(this.mLatitude, this.mLongitude, this.mAltitude);
    }

    @Deprecated
    public GeoPoint(int i5, int i6, int i7) {
        this.mLatitude = i5 / 1000000.0d;
        this.mLongitude = i6 / 1000000.0d;
        this.mAltitude = i7;
    }

    public GeoPoint(double d5, double d6) {
        this.mLatitude = d5;
        this.mLongitude = d6;
    }

    public GeoPoint(double d5, double d6, double d7) {
        this.mLatitude = d5;
        this.mLongitude = d6;
        this.mAltitude = d7;
    }

    public GeoPoint(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public GeoPoint(GeoPoint geoPoint) {
        this.mLatitude = geoPoint.mLatitude;
        this.mLongitude = geoPoint.mLongitude;
        this.mAltitude = geoPoint.mAltitude;
    }

    public GeoPoint(IGeoPoint iGeoPoint) {
        this.mLatitude = iGeoPoint.getLatitude();
        this.mLongitude = iGeoPoint.getLongitude();
    }

    private GeoPoint(Parcel parcel) {
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mAltitude = parcel.readDouble();
    }
}
