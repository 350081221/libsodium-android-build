package org.osmdroid.tileprovider.tilesource;

import com.android.multidex.ClassPathElement;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public abstract class h extends OnlineTileSourceBase {
    public h(String str, int i5, int i6, int i7, String str2, String[] strArr) {
        super(str, i5, i6, i7, str2, strArr);
    }

    @Override // org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.e
    public String getTileRelativeFilenameString(long j5) {
        return pathBase() + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getZoom(j5) + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getX(j5) + ClassPathElement.SEPARATOR_CHAR + (((1 << MapTileIndex.getZoom(j5)) - MapTileIndex.getY(j5)) - 1) + imageFilenameEnding();
    }
}
