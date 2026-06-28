package org.osmdroid.api;

import android.graphics.Point;

/* loaded from: classes4.dex */
public interface IProjection {
    IGeoPoint fromPixels(int i5, int i6);

    IGeoPoint getNorthEast();

    IGeoPoint getSouthWest();

    float metersToEquatorPixels(float f5);

    Point toPixels(IGeoPoint iGeoPoint, Point point);
}
