package org.osmdroid.tileprovider.tilesource;

import android.util.Log;
import org.osmdroid.api.IMapView;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class b extends OnlineTileSourceBase implements d<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private Integer f21745a;

    public b(String str, int i5, int i6, int i7, String str2, String[] strArr) {
        super(str, i5, i6, i7, str2, strArr);
        this.f21745a = 1;
    }

    @Override // org.osmdroid.tileprovider.tilesource.d
    public void b(String str) {
        try {
            this.f21745a = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            Log.e(IMapView.LOGTAG, "Error setting integer style: " + str);
        }
    }

    @Override // org.osmdroid.tileprovider.tilesource.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Integer a() {
        return this.f21745a;
    }

    @Override // org.osmdroid.tileprovider.tilesource.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(Integer num) {
        this.f21745a = num;
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        String a5 = org.osmdroid.tileprovider.util.a.a();
        if (a5.length() == 0) {
            Log.e(IMapView.LOGTAG, "CloudMade key is not set. You should enter it in the manifest and call CloudmadeUtil.retrieveCloudmadeKey()");
        }
        return String.format(getBaseUrl(), a5, this.f21745a, Integer.valueOf(getTileSizePixels()), Integer.valueOf(MapTileIndex.getZoom(j5)), Integer.valueOf(MapTileIndex.getX(j5)), Integer.valueOf(MapTileIndex.getY(j5)), this.mImageFilenameEnding, org.osmdroid.tileprovider.util.a.b());
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public String pathBase() {
        Integer num = this.f21745a;
        if (num != null && num.intValue() > 1) {
            return this.mName + this.f21745a;
        }
        return this.mName;
    }
}
