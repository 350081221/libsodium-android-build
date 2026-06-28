package org.osmdroid.util;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.config.a;
import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public class BoundingBox implements Parcelable, Serializable {
    public static final Parcelable.Creator<BoundingBox> CREATOR = new Parcelable.Creator<BoundingBox>() { // from class: org.osmdroid.util.BoundingBox.1
        @Override // android.os.Parcelable.Creator
        public BoundingBox createFromParcel(Parcel parcel) {
            return BoundingBox.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BoundingBox[] newArray(int i5) {
            return new BoundingBox[i5];
        }
    };
    static final long serialVersionUID = 2;
    private double mLatNorth;
    private double mLatSouth;
    private double mLonEast;
    private double mLonWest;

    public BoundingBox(double d5, double d6, double d7, double d8) {
        set(d5, d6, d7, d8);
    }

    public static BoundingBox fromGeoPoints(List<? extends IGeoPoint> list) {
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        double d7 = -1.7976931348623157E308d;
        double d8 = -1.7976931348623157E308d;
        for (IGeoPoint iGeoPoint : list) {
            double latitude = iGeoPoint.getLatitude();
            double longitude = iGeoPoint.getLongitude();
            d5 = Math.min(d5, latitude);
            d6 = Math.min(d6, longitude);
            d7 = Math.max(d7, latitude);
            d8 = Math.max(d8, longitude);
        }
        return new BoundingBox(d7, d8, d5, d6);
    }

    public static BoundingBox fromGeoPointsSafe(List<GeoPoint> list) {
        try {
            return fromGeoPoints(list);
        } catch (IllegalArgumentException unused) {
            TileSystem tileSystem = MapView.getTileSystem();
            return new BoundingBox(tileSystem.getMaxLatitude(), tileSystem.getMaxLongitude(), tileSystem.getMinLatitude(), tileSystem.getMinLongitude());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BoundingBox readFromParcel(Parcel parcel) {
        return new BoundingBox(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    public GeoPoint bringToBoundingBox(double d5, double d6) {
        return new GeoPoint(Math.max(this.mLatSouth, Math.min(this.mLatNorth, d5)), Math.max(this.mLonWest, Math.min(this.mLonEast, d6)));
    }

    public BoundingBox concat(BoundingBox boundingBox) {
        return new BoundingBox(Math.max(this.mLatNorth, boundingBox.getLatNorth()), Math.max(this.mLonEast, boundingBox.getLonEast()), Math.min(this.mLatSouth, boundingBox.getLatSouth()), Math.min(this.mLonWest, boundingBox.getLonWest()));
    }

    public boolean contains(IGeoPoint iGeoPoint) {
        return contains(iGeoPoint.getLatitude(), iGeoPoint.getLongitude());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        if (Double.compare(this.mLatNorth, boundingBox.mLatNorth) == 0 && Double.compare(this.mLatSouth, boundingBox.mLatSouth) == 0 && Double.compare(this.mLonEast, boundingBox.mLonEast) == 0 && Double.compare(this.mLonWest, boundingBox.mLonWest) == 0) {
            return true;
        }
        return false;
    }

    public double getActualNorth() {
        return Math.max(this.mLatNorth, this.mLatSouth);
    }

    public double getActualSouth() {
        return Math.min(this.mLatNorth, this.mLatSouth);
    }

    @Deprecated
    public GeoPoint getCenter() {
        return new GeoPoint((this.mLatNorth + this.mLatSouth) / 2.0d, (this.mLonEast + this.mLonWest) / 2.0d);
    }

    public double getCenterLatitude() {
        return (this.mLatNorth + this.mLatSouth) / 2.0d;
    }

    public double getCenterLongitude() {
        return getCenterLongitude(this.mLonWest, this.mLonEast);
    }

    public GeoPoint getCenterWithDateLine() {
        return new GeoPoint(getCenterLatitude(), getCenterLongitude());
    }

    public double getDiagonalLengthInMeters() {
        return new GeoPoint(this.mLatNorth, this.mLonWest).distanceToAsDouble(new GeoPoint(this.mLatSouth, this.mLonEast));
    }

    public GeoPoint getGeoPointOfRelativePositionWithExactGudermannInterpolation(float f5, float f6) {
        TileSystem tileSystem = MapView.getTileSystem();
        double gudermannInverse = MyMath.gudermannInverse(this.mLatNorth);
        double gudermannInverse2 = MyMath.gudermannInverse(this.mLatSouth);
        return new GeoPoint(tileSystem.cleanLatitude(MyMath.gudermann(gudermannInverse2 + ((1.0f - f6) * (gudermannInverse - gudermannInverse2)))), tileSystem.cleanLongitude(this.mLonWest + (getLongitudeSpan() * f5)));
    }

    public GeoPoint getGeoPointOfRelativePositionWithLinearInterpolation(float f5, float f6) {
        TileSystem tileSystem = MapView.getTileSystem();
        return new GeoPoint(tileSystem.cleanLatitude(this.mLatNorth - (getLatitudeSpan() * f6)), tileSystem.cleanLongitude(this.mLonWest + (getLongitudeSpan() * f5)));
    }

    public double getLatNorth() {
        return this.mLatNorth;
    }

    public double getLatSouth() {
        return this.mLatSouth;
    }

    public double getLatitudeSpan() {
        return Math.abs(this.mLatNorth - this.mLatSouth);
    }

    @Deprecated
    public int getLatitudeSpanE6() {
        return (int) (getLatitudeSpan() * 1000000.0d);
    }

    public double getLonEast() {
        return this.mLonEast;
    }

    public double getLonWest() {
        return this.mLonWest;
    }

    @Deprecated
    public double getLongitudeSpan() {
        return Math.abs(this.mLonEast - this.mLonWest);
    }

    @Deprecated
    public int getLongitudeSpanE6() {
        return (int) (getLongitudeSpan() * 1000000.0d);
    }

    public double getLongitudeSpanWithDateLine() {
        double d5 = this.mLonEast;
        double d6 = this.mLonWest;
        return d5 > d6 ? d5 - d6 : (d5 - d6) + 360.0d;
    }

    public PointF getRelativePositionOfGeoPointInBoundingBoxWithExactGudermannInterpolation(double d5, double d6, PointF pointF) {
        if (pointF == null) {
            pointF = new PointF();
        }
        pointF.set(1.0f - ((float) ((this.mLonEast - d6) / getLongitudeSpan())), (float) ((MyMath.gudermannInverse(this.mLatNorth) - MyMath.gudermannInverse(d5)) / (MyMath.gudermannInverse(this.mLatNorth) - MyMath.gudermannInverse(this.mLatSouth))));
        return pointF;
    }

    public PointF getRelativePositionOfGeoPointInBoundingBoxWithLinearInterpolation(double d5, double d6, PointF pointF) {
        if (pointF == null) {
            pointF = new PointF();
        }
        pointF.set(1.0f - ((float) ((this.mLonEast - d6) / getLongitudeSpan())), (float) ((this.mLatNorth - d5) / getLatitudeSpan()));
        return pointF;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatNorth);
        long doubleToLongBits2 = Double.doubleToLongBits(this.mLatSouth);
        int i5 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mLonEast);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.mLonWest);
        return (i6 * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public BoundingBox increaseByScale(float f5) {
        if (f5 > 0.0f) {
            TileSystem tileSystem = MapView.getTileSystem();
            double centerLatitude = getCenterLatitude();
            double d5 = f5;
            double latitudeSpan = (getLatitudeSpan() / 2.0d) * d5;
            double cleanLatitude = tileSystem.cleanLatitude(centerLatitude + latitudeSpan);
            double cleanLatitude2 = tileSystem.cleanLatitude(centerLatitude - latitudeSpan);
            double centerLongitude = getCenterLongitude();
            double longitudeSpanWithDateLine = (getLongitudeSpanWithDateLine() / 2.0d) * d5;
            return new BoundingBox(cleanLatitude, tileSystem.cleanLongitude(centerLongitude + longitudeSpanWithDateLine), cleanLatitude2, tileSystem.cleanLongitude(centerLongitude - longitudeSpanWithDateLine));
        }
        throw new IllegalArgumentException("pBoundingboxPaddingRelativeScale must be positive");
    }

    public boolean overlaps(BoundingBox boundingBox, double d5) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (d5 < 3.0d) {
            return true;
        }
        double d6 = boundingBox.mLatSouth;
        double d7 = this.mLatNorth;
        if (d6 <= d7 && d6 >= this.mLatSouth) {
            z4 = true;
        } else {
            z4 = false;
        }
        double d8 = this.mLonWest;
        double d9 = boundingBox.mLonWest;
        if (d8 >= d9 && d8 <= boundingBox.mLonEast) {
            z5 = true;
        } else {
            z5 = false;
        }
        double d10 = this.mLonEast;
        if (d10 >= d9 && d8 <= boundingBox.mLonEast) {
            z5 = true;
        }
        if (d8 <= d9 && d10 >= boundingBox.mLonEast && d7 >= boundingBox.mLatNorth && this.mLatSouth <= d6) {
            return true;
        }
        if (d7 >= d6 && d7 <= this.mLatSouth) {
            z4 = true;
        }
        double d11 = this.mLatSouth;
        if (d11 >= d6 && d11 <= d11) {
            z4 = true;
        }
        if (d8 > d10) {
            double d12 = boundingBox.mLonEast;
            if (d10 <= d12 && d9 >= d8) {
                z5 = true;
            }
            if (d8 >= d12 && d10 <= d12) {
                if (d12 < d8 && d9 < d8) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (d12 > d10 && d9 > d10) {
                    z5 = false;
                } else {
                    z5 = z6;
                }
            }
            if (d8 >= d12 && d10 >= d12) {
                z5 = true;
            }
        }
        if (!z4 || !z5) {
            return false;
        }
        return true;
    }

    public void set(double d5, double d6, double d7, double d8) {
        this.mLatNorth = d5;
        this.mLonEast = d6;
        this.mLatSouth = d7;
        this.mLonWest = d8;
        if (a.a().O()) {
            TileSystem tileSystem = MapView.getTileSystem();
            if (tileSystem.isValidLatitude(d5)) {
                if (tileSystem.isValidLatitude(d7)) {
                    if (tileSystem.isValidLongitude(d8)) {
                        if (!tileSystem.isValidLongitude(d6)) {
                            throw new IllegalArgumentException("east must be in " + tileSystem.toStringLongitudeSpan());
                        }
                        return;
                    }
                    throw new IllegalArgumentException("west must be in " + tileSystem.toStringLongitudeSpan());
                }
                throw new IllegalArgumentException("south must be in " + tileSystem.toStringLatitudeSpan());
            }
            throw new IllegalArgumentException("north must be in " + tileSystem.toStringLatitudeSpan());
        }
    }

    public void setLatNorth(double d5) {
        this.mLatNorth = d5;
    }

    public void setLatSouth(double d5) {
        this.mLatSouth = d5;
    }

    public void setLonEast(double d5) {
        this.mLonEast = d5;
    }

    public void setLonWest(double d5) {
        this.mLonWest = d5;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("N:");
        stringBuffer.append(this.mLatNorth);
        stringBuffer.append("; E:");
        stringBuffer.append(this.mLonEast);
        stringBuffer.append("; S:");
        stringBuffer.append(this.mLatSouth);
        stringBuffer.append("; W:");
        stringBuffer.append(this.mLonWest);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeDouble(this.mLatNorth);
        parcel.writeDouble(this.mLonEast);
        parcel.writeDouble(this.mLatSouth);
        parcel.writeDouble(this.mLonWest);
    }

    public static double getCenterLongitude(double d5, double d6) {
        double d7 = (d6 + d5) / 2.0d;
        if (d6 < d5) {
            d7 += 180.0d;
        }
        return MapView.getTileSystem().cleanLongitude(d7);
    }

    public BoundingBox clone() {
        return new BoundingBox(this.mLatNorth, this.mLonEast, this.mLatSouth, this.mLonWest);
    }

    public boolean contains(double d5, double d6) {
        double d7 = this.mLatNorth;
        double d8 = this.mLatSouth;
        boolean z4 = d7 < d8 || (d5 < d7 && d5 > d8);
        double d9 = this.mLonEast;
        double d10 = this.mLonWest;
        return z4 && ((d9 > d10 ? 1 : (d9 == d10 ? 0 : -1)) >= 0 ? !((d6 > d9 ? 1 : (d6 == d9 ? 0 : -1)) >= 0 || (d6 > d10 ? 1 : (d6 == d10 ? 0 : -1)) <= 0) : !((d6 > d9 ? 1 : (d6 == d9 ? 0 : -1)) > 0 || (d6 > d10 ? 1 : (d6 == d10 ? 0 : -1)) < 0));
    }

    public BoundingBox() {
    }
}
