package org.osmdroid.util;

@Deprecated
/* loaded from: classes4.dex */
public class MapTileListBorderComputer implements MapTileListComputer {
    private final int mBorder;
    private final boolean mIncludeAll;

    public MapTileListBorderComputer(int i5, boolean z4) {
        this.mBorder = i5;
        this.mIncludeAll = z4;
    }

    @Override // org.osmdroid.util.MapTileListComputer
    public MapTileList computeFromSource(MapTileList mapTileList, MapTileList mapTileList2) {
        if (mapTileList2 == null) {
            mapTileList2 = new MapTileList();
        }
        for (int i5 = 0; i5 < mapTileList.getSize(); i5++) {
            long j5 = mapTileList.get(i5);
            int zoom = MapTileIndex.getZoom(j5);
            int x4 = MapTileIndex.getX(j5);
            int y4 = MapTileIndex.getY(j5);
            int i6 = 1 << zoom;
            int i7 = -this.mBorder;
            while (true) {
                int i8 = this.mBorder;
                if (i7 <= i8) {
                    for (int i9 = -i8; i9 <= this.mBorder; i9++) {
                        int i10 = x4 + i7;
                        int i11 = y4 + i9;
                        while (i10 < 0) {
                            i10 += i6;
                        }
                        while (i11 < 0) {
                            i11 += i6;
                        }
                        while (i10 >= i6) {
                            i10 -= i6;
                        }
                        while (i11 >= i6) {
                            i11 -= i6;
                        }
                        long tileIndex = MapTileIndex.getTileIndex(zoom, i10, i11);
                        if (!mapTileList2.contains(tileIndex) && (!mapTileList.contains(tileIndex) || this.mIncludeAll)) {
                            mapTileList2.put(tileIndex);
                        }
                    }
                    i7++;
                }
            }
        }
        return mapTileList2;
    }

    public int getBorder() {
        return this.mBorder;
    }

    public boolean isIncludeAll() {
        return this.mIncludeAll;
    }
}
