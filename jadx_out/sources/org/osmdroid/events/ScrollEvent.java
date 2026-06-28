package org.osmdroid.events;

import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public class ScrollEvent implements MapEvent {
    protected MapView source;

    /* renamed from: x, reason: collision with root package name */
    protected int f21657x;

    /* renamed from: y, reason: collision with root package name */
    protected int f21658y;

    public ScrollEvent(MapView mapView, int i5, int i6) {
        this.source = mapView;
        this.f21657x = i5;
        this.f21658y = i6;
    }

    public MapView getSource() {
        return this.source;
    }

    public int getX() {
        return this.f21657x;
    }

    public int getY() {
        return this.f21658y;
    }

    public String toString() {
        return "ScrollEvent [source=" + this.source + ", x=" + this.f21657x + ", y=" + this.f21658y + "]";
    }
}
