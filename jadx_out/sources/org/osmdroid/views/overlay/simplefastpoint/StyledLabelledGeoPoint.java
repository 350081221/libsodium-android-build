package org.osmdroid.views.overlay.simplefastpoint;

import android.graphics.Paint;
import android.location.Location;
import org.osmdroid.util.GeoPoint;

/* loaded from: classes4.dex */
public class StyledLabelledGeoPoint extends LabelledGeoPoint {
    Paint mPointStyle;
    Paint mTextStyle;

    public StyledLabelledGeoPoint(double d5, double d6) {
        super(d5, d6);
    }

    public Paint getPointStyle() {
        return this.mPointStyle;
    }

    public Paint getTextStyle() {
        return this.mTextStyle;
    }

    public void setPointStyle(Paint paint) {
        this.mPointStyle = paint;
    }

    public void setTextStyle(Paint paint) {
        this.mTextStyle = paint;
    }

    public StyledLabelledGeoPoint(double d5, double d6, double d7) {
        super(d5, d6, d7);
    }

    public StyledLabelledGeoPoint(double d5, double d6, double d7, String str) {
        super(d5, d6, d7, str);
    }

    public StyledLabelledGeoPoint(Location location) {
        super(location);
    }

    @Override // org.osmdroid.views.overlay.simplefastpoint.LabelledGeoPoint, org.osmdroid.util.GeoPoint
    public StyledLabelledGeoPoint clone() {
        return new StyledLabelledGeoPoint(getLatitude(), getLongitude(), getAltitude(), this.mLabel, this.mPointStyle, this.mTextStyle);
    }

    public StyledLabelledGeoPoint(GeoPoint geoPoint) {
        super(geoPoint);
    }

    public StyledLabelledGeoPoint(double d5, double d6, String str) {
        super(d5, d6, str);
    }

    public StyledLabelledGeoPoint(double d5, double d6, String str, Paint paint, Paint paint2) {
        super(d5, d6, str);
        this.mPointStyle = paint;
        this.mTextStyle = paint2;
    }

    public StyledLabelledGeoPoint(double d5, double d6, double d7, String str, Paint paint, Paint paint2) {
        super(d5, d6, d7, str);
        this.mPointStyle = paint;
        this.mTextStyle = paint2;
    }

    public StyledLabelledGeoPoint(LabelledGeoPoint labelledGeoPoint) {
        super(labelledGeoPoint);
    }
}
