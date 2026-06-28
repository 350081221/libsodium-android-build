package org.osmdroid.tileprovider.tilesource;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import org.osmdroid.tileprovider.util.ManifestUtil;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class i extends OnlineTileSourceBase {

    /* renamed from: c, reason: collision with root package name */
    private static final String f21801c = "THUNDERFOREST_MAPID";

    /* renamed from: d, reason: collision with root package name */
    public static final int f21802d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f21803e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21804f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f21805g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f21806h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f21807i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f21808j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f21809k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f21810l = 8;

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f21811m = {"cycle", NotificationCompat.CATEGORY_TRANSPORT, "landscape", "outdoors", "transport-dark", "spinal-map", "pioneer", "mobile-atlas", "neighbourhood"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f21812n = {"CycleMap", "Transport", "Landscape", "Outdoors", "TransportDark", "Spinal", "Pioneer", "MobileAtlas", "Neighbourhood"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f21813o = {"https://a.tile.thunderforest.com/{map}/", "https://b.tile.thunderforest.com/{map}/", "https://c.tile.thunderforest.com/{map}/"};

    /* renamed from: a, reason: collision with root package name */
    private final int f21814a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21815b;

    public i(Context context, int i5) {
        super(f21812n[i5], 0, 17, 256, ".png", f21813o, "Maps © Thunderforest, Data © OpenStreetMap contributors.");
        this.f21814a = i5;
        this.f21815b = f(context);
    }

    public static boolean d(Context context) {
        return !ManifestUtil.retrieveKey(context, f21801c).equals("");
    }

    public static final String e(int i5) {
        if (i5 >= 0) {
            String[] strArr = f21812n;
            if (i5 < strArr.length) {
                return strArr[i5];
            }
            return "";
        }
        return "";
    }

    public final String f(Context context) {
        return ManifestUtil.retrieveKey(context, f21801c);
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        return getBaseUrl().replace("{map}", f21811m[this.f21814a]) + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getX(j5) + "/" + MapTileIndex.getY(j5) + ".png?apikey=" + this.f21815b;
    }
}
