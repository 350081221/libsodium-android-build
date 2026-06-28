package org.osmdroid.tileprovider.tilesource;

import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class QuadTreeTileSource extends OnlineTileSourceBase {
    public QuadTreeTileSource(String str, int i5, int i6, int i7, String str2, String[] strArr) {
        super(str, i5, i6, i7, str2, strArr);
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        return getBaseUrl() + quadTree(j5) + this.mImageFilenameEnding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String quadTree(long j5) {
        StringBuilder sb = new StringBuilder();
        for (int zoom = MapTileIndex.getZoom(j5); zoom > 0; zoom += -1) {
            int i5 = 1;
            int i6 = 1 << (zoom - 1);
            if ((MapTileIndex.getX(j5) & i6) == 0) {
                i5 = 0;
            }
            if ((i6 & MapTileIndex.getY(j5)) != 0) {
                i5 += 2;
            }
            sb.append("" + i5);
        }
        return sb.toString();
    }
}
