package org.osmdroid.views.overlay.simplefastpoint;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import org.osmdroid.util.GeoPoint;

/* loaded from: classes4.dex */
public class LabelledGeoPoint extends GeoPoint {
    public static final Parcelable.Creator<LabelledGeoPoint> CREATOR = new a();
    String mLabel;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator<LabelledGeoPoint> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelledGeoPoint createFromParcel(Parcel parcel) {
            return new LabelledGeoPoint(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LabelledGeoPoint[] newArray(int i5) {
            return new LabelledGeoPoint[i5];
        }
    }

    /* synthetic */ LabelledGeoPoint(Parcel parcel, a aVar) {
        this(parcel);
    }

    public String getLabel() {
        return this.mLabel;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    @Override // org.osmdroid.util.GeoPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeString(this.mLabel);
    }

    public LabelledGeoPoint(double d5, double d6) {
        super(d5, d6);
    }

    public LabelledGeoPoint(double d5, double d6, double d7) {
        super(d5, d6, d7);
    }

    @Override // org.osmdroid.util.GeoPoint
    public LabelledGeoPoint clone() {
        return new LabelledGeoPoint(getLatitude(), getLongitude(), getAltitude(), this.mLabel);
    }

    public LabelledGeoPoint(double d5, double d6, double d7, String str) {
        super(d5, d6, d7);
        this.mLabel = str;
    }

    public LabelledGeoPoint(Location location) {
        super(location);
    }

    public LabelledGeoPoint(GeoPoint geoPoint) {
        super(geoPoint);
    }

    public LabelledGeoPoint(double d5, double d6, String str) {
        super(d5, d6);
        this.mLabel = str;
    }

    public LabelledGeoPoint(LabelledGeoPoint labelledGeoPoint) {
        this(labelledGeoPoint.getLatitude(), labelledGeoPoint.getLongitude(), labelledGeoPoint.getAltitude(), labelledGeoPoint.getLabel());
    }

    private LabelledGeoPoint(Parcel parcel) {
        super(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        setLabel(parcel.readString());
    }
}
