package org.osmdroid.util;

/* loaded from: classes4.dex */
public class MapTileAreaBorderComputer implements MapTileAreaComputer {
    private final int mBorder;

    public MapTileAreaBorderComputer(int i5) {
        this.mBorder = i5;
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
        int left = mapTileArea.getLeft() - this.mBorder;
        int top = mapTileArea.getTop();
        int i5 = this.mBorder;
        int i6 = top - i5;
        int i7 = (i5 * 2) - 1;
        mapTileArea2.set(mapTileArea.getZoom(), left, i6, mapTileArea.getWidth() + left + i7, mapTileArea.getHeight() + i6 + i7);
        return mapTileArea2;
    }

    public int getBorder() {
        return this.mBorder;
    }
}
