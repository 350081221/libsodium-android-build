package org.osmdroid.events;

import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public class ZoomEvent implements MapEvent {
    protected MapView source;
    protected double zoomLevel;

    public ZoomEvent(MapView mapView, double d5) {
        this.source = mapView;
        this.zoomLevel = d5;
    }

    public MapView getSource() {
        return this.source;
    }

    public double getZoomLevel() {
        return this.zoomLevel;
    }

    public String toString() {
        return "ZoomEvent [source=" + this.source + ", zoomLevel=" + this.zoomLevel + "]";
    }
}
