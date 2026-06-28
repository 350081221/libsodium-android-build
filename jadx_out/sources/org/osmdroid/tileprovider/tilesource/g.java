package org.osmdroid.tileprovider.tilesource;

import android.content.Context;
import org.osmdroid.tileprovider.util.ManifestUtil;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class g extends OnlineTileSourceBase {

    /* renamed from: c, reason: collision with root package name */
    private static final String f21796c = "MAPQUEST_MAPID";

    /* renamed from: d, reason: collision with root package name */
    private static final String f21797d = "MAPQUEST_ACCESS_TOKEN";

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f21798e = {"http://api.tiles.mapbox.com/v4/"};

    /* renamed from: a, reason: collision with root package name */
    private String f21799a;

    /* renamed from: b, reason: collision with root package name */
    private String f21800b;

    public g(Context context) {
        super("MapQuest", 1, 19, 256, ".png", f21798e, "MapQuest");
        this.f21799a = "mapquest.streets-mb";
        f(context);
        g(context);
        this.mName = "MapQuest" + this.f21799a;
    }

    public String d() {
        return this.f21800b;
    }

    public String e() {
        return this.f21799a;
    }

    public final void f(Context context) {
        this.f21800b = ManifestUtil.retrieveKey(context, f21797d);
    }

    public final void g(Context context) {
        String retrieveKey = ManifestUtil.retrieveKey(context, f21796c);
        if (retrieveKey != null && retrieveKey.length() > 0) {
            this.f21799a = retrieveKey;
        }
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        return getBaseUrl() + e() + "/" + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getX(j5) + "/" + MapTileIndex.getY(j5) + ".png?access_token=" + d();
    }

    public void h(String str) {
        this.f21800b = str;
    }

    public void i(String str) {
        this.f21799a = str;
    }

    public g(String str, String str2) {
        super("MapQuest" + str, 1, 19, 256, ".png", f21798e, "MapQuest");
        this.f21800b = str2;
        this.f21799a = str;
    }

    public g(String str, int i5, int i6, int i7, String str2) {
        super(str, i5, i6, i7, str2, f21798e, "MapQuest");
        this.f21799a = "mapquest.streets-mb";
    }

    public g(String str, int i5, int i6, int i7, String str2, String str3, String str4) {
        super(str + str3, i5, i6, i7, str2, new String[]{str4}, "MapQuest");
        this.f21799a = str3;
    }
}
