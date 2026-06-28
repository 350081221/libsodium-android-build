package org.osmdroid.tileprovider.tilesource;

import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class XYTileSource extends OnlineTileSourceBase {
    public XYTileSource(String str, int i5, int i6, int i7, String str2, String[] strArr) {
        super(str, i5, i6, i7, str2, strArr);
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        return getBaseUrl() + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getX(j5) + "/" + MapTileIndex.getY(j5) + this.mImageFilenameEnding;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public String toString() {
        return name();
    }

    public XYTileSource(String str, int i5, int i6, int i7, String str2, String[] strArr, String str3) {
        super(str, i5, i6, i7, str2, strArr, str3);
    }

    public XYTileSource(String str, int i5, int i6, int i7, String str2, String[] strArr, String str3, j jVar) {
        super(str, i5, i6, i7, str2, strArr, str3, jVar);
    }
}
