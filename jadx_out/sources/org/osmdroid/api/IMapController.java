package org.osmdroid.api;

/* loaded from: classes4.dex */
public interface IMapController {
    void animateTo(int i5, int i6);

    void animateTo(IGeoPoint iGeoPoint);

    void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5);

    void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5, Float f5);

    void animateTo(IGeoPoint iGeoPoint, Double d5, Long l5, Float f5, Boolean bool);

    void scrollBy(int i5, int i6);

    void setCenter(IGeoPoint iGeoPoint);

    double setZoom(double d5);

    @Deprecated
    int setZoom(int i5);

    void stopAnimation(boolean z4);

    void stopPanning();

    boolean zoomIn();

    boolean zoomIn(Long l5);

    boolean zoomInFixing(int i5, int i6);

    boolean zoomInFixing(int i5, int i6, Long l5);

    boolean zoomOut();

    boolean zoomOut(Long l5);

    boolean zoomOutFixing(int i5, int i6);

    boolean zoomTo(double d5);

    boolean zoomTo(double d5, Long l5);

    @Deprecated
    boolean zoomTo(int i5);

    boolean zoomTo(int i5, Long l5);

    boolean zoomToFixing(double d5, int i5, int i6);

    boolean zoomToFixing(double d5, int i5, int i6, Long l5);

    @Deprecated
    boolean zoomToFixing(int i5, int i6, int i7);

    boolean zoomToFixing(int i5, int i6, int i7, Long l5);

    void zoomToSpan(double d5, double d6);

    @Deprecated
    void zoomToSpan(int i5, int i6);
}
