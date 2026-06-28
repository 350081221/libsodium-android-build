package org.osmdroid.util;

/* loaded from: classes4.dex */
public class MapTileAreaZoomComputer implements MapTileAreaComputer {
    private final int mZoomDelta;

    public MapTileAreaZoomComputer(int i5) {
        this.mZoomDelta = i5;
    }

    @Override // org.osmdroid.util.MapTileAreaComputer
    public MapTileArea computeFromSource(MapTileArea mapTileArea, MapTileArea mapTileArea2) {
        if (mapTileArea2 == null) {
            mapTileArea2 = new MapTileArea();
        }
        if (mapTileArea.size() == 0) {
            mapTileArea2.reset();
            return mapTileArea2;
        }
        int zoom = mapTileArea.getZoom();
        int i5 = this.mZoomDelta;
        int i6 = zoom + i5;
        if (i6 >= 0 && i6 <= MapTileIndex.mMaxZoomLevel) {
            if (i5 <= 0) {
                mapTileArea2.set(i6, mapTileArea.getLeft() >> (-this.mZoomDelta), mapTileArea.getTop() >> (-this.mZoomDelta), mapTileArea.getRight() >> (-this.mZoomDelta), mapTileArea.getBottom() >> (-this.mZoomDelta));
                return mapTileArea2;
            }
            mapTileArea2.set(i6, mapTileArea.getLeft() << this.mZoomDelta, mapTileArea.getTop() << this.mZoomDelta, ((mapTileArea.getRight() + 1) << this.mZoomDelta) - 1, ((mapTileArea.getBottom() + 1) << this.mZoomDelta) - 1);
            return mapTileArea2;
        }
        mapTileArea2.reset();
        return mapTileArea2;
    }
}
