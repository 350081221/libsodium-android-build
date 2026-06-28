package org.osmdroid.tileprovider.tilesource.bing;

import android.content.Context;
import android.util.Log;
import java.util.Locale;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.tilesource.QuadTreeTileSource;
import org.osmdroid.tileprovider.tilesource.d;
import org.osmdroid.tileprovider.util.ManifestUtil;

/* loaded from: classes4.dex */
public class a extends QuadTreeTileSource implements d<String> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f21746f = "BING_KEY";

    /* renamed from: g, reason: collision with root package name */
    public static final String f21747g = "Aerial";

    /* renamed from: h, reason: collision with root package name */
    public static final String f21748h = "AerialWithLabels";

    /* renamed from: i, reason: collision with root package name */
    public static final String f21749i = "Road";

    /* renamed from: j, reason: collision with root package name */
    private static final String f21750j = ".jpeg";

    /* renamed from: k, reason: collision with root package name */
    private static final String f21751k = "https://dev.virtualearth.net/REST/V1/Imagery/Metadata/%s?mapVersion=v1&output=json&uriScheme=https&key=%s";

    /* renamed from: l, reason: collision with root package name */
    private static String f21752l = "";

    /* renamed from: a, reason: collision with root package name */
    private String f21753a;

    /* renamed from: b, reason: collision with root package name */
    private c f21754b;

    /* renamed from: c, reason: collision with root package name */
    private String f21755c;

    /* renamed from: d, reason: collision with root package name */
    private String f21756d;

    /* renamed from: e, reason: collision with root package name */
    private String f21757e;

    public a(String str) {
        super("BingMaps", 0, 19, 256, f21750j, null);
        this.f21753a = f21749i;
        this.f21754b = c.a();
        this.f21755c = str;
        if (str == null) {
            this.f21755c = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
        }
    }

    public static String d() {
        return f21752l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.osmdroid.tileprovider.tilesource.bing.c e() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.tilesource.bing.a.e():org.osmdroid.tileprovider.tilesource.bing.c");
    }

    public static void h(Context context) {
        f21752l = ManifestUtil.retrieveKey(context, f21746f);
    }

    public static void i(String str) {
        f21752l = str;
    }

    @Override // org.osmdroid.tileprovider.tilesource.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(String str) {
        if (!str.equals(this.f21753a)) {
            synchronized (this.f21753a) {
                this.f21757e = null;
                this.f21756d = null;
                this.f21754b.f21778h = false;
            }
        }
        this.f21753a = str;
        this.mName = pathBase();
    }

    @Override // org.osmdroid.tileprovider.tilesource.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String a() {
        return this.f21753a;
    }

    public c g() {
        c e5;
        if (!this.f21754b.f21778h) {
            synchronized (this) {
                if (!this.f21754b.f21778h && (e5 = e()) != null) {
                    this.f21754b = e5;
                    j();
                }
            }
        }
        return this.f21754b;
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getBaseUrl() {
        if (!this.f21754b.f21778h) {
            g();
        }
        return this.f21756d;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.e
    public String getCopyrightNotice() {
        return this.f21754b.f21771a;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.e
    public int getMaximumZoomLevel() {
        return this.f21754b.f21776f;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.e
    public int getMinimumZoomLevel() {
        return this.f21754b.f21777g;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.e
    public int getTileSizePixels() {
        return this.f21754b.f21772b;
    }

    @Override // org.osmdroid.tileprovider.tilesource.QuadTreeTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        if (!this.f21754b.f21778h) {
            g();
        }
        return String.format(this.f21757e, quadTree(j5));
    }

    protected void j() {
        Log.d(IMapView.LOGTAG, "updateBaseUrl");
        String c5 = this.f21754b.c();
        int lastIndexOf = this.f21754b.f21774d.lastIndexOf("/");
        if (lastIndexOf > 0) {
            this.f21756d = this.f21754b.f21774d.substring(0, lastIndexOf);
        } else {
            this.f21756d = this.f21754b.f21774d;
        }
        this.f21757e = this.f21754b.f21774d;
        if (c5 != null) {
            this.f21756d = String.format(this.f21756d, c5);
            this.f21757e = String.format(this.f21757e, c5, "%s", this.f21755c);
        }
        Log.d(IMapView.LOGTAG, "updated url = " + this.f21757e);
        Log.d(IMapView.LOGTAG, "end updateBaseUrl");
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public String pathBase() {
        return this.mName + this.f21753a;
    }
}
