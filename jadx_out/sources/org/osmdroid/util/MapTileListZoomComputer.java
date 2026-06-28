package org.osmdroid.util;

@Deprecated
/* loaded from: classes4.dex */
public class MapTileListZoomComputer implements MapTileListComputer {
    private final int mZoomDelta;

    public MapTileListZoomComputer(int i5) {
        this.mZoomDelta = i5;
    }

    @Override // org.osmdroid.util.MapTileListComputer
    public MapTileList computeFromSource(MapTileList mapTileList, MapTileList mapTileList2) {
        if (mapTileList2 == null) {
            mapTileList2 = new MapTileList();
        }
        for (int i5 = 0; i5 < mapTileList.getSize(); i5++) {
            long j5 = mapTileList.get(i5);
            int zoom = MapTileIndex.getZoom(j5) + this.mZoomDelta;
            if (zoom >= 0 && zoom <= MapTileIndex.mMaxZoomLevel) {
                int x4 = MapTileIndex.getX(j5);
                int y4 = MapTileIndex.getY(j5);
                int i6 = this.mZoomDelta;
                if (i6 <= 0) {
                    mapTileList2.put(MapTileIndex.getTileIndex(zoom, x4 >> (-i6), y4 >> (-i6)));
                } else {
                    int i7 = 1 << i6;
                    int i8 = x4 << i6;
                    int i9 = y4 << i6;
                    for (int i10 = 0; i10 < i7; i10++) {
                        for (int i11 = 0; i11 < i7; i11++) {
                            mapTileList2.put(MapTileIndex.getTileIndex(zoom, i8 + i10, i9 + i11));
                        }
                    }
                }
            }
        }
        return mapTileList2;
    }

    public int getZoomDelta() {
        return this.mZoomDelta;
    }
}
