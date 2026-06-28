package org.osmdroid.tileprovider.tilesource;

import android.content.Context;
import org.osmdroid.tileprovider.util.ManifestUtil;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class c extends OnlineTileSourceBase {

    /* renamed from: e, reason: collision with root package name */
    private static final String f21780e = "HEREWEGO_MAPID";

    /* renamed from: f, reason: collision with root package name */
    private static final String f21781f = "HEREWEGO_APPID";

    /* renamed from: g, reason: collision with root package name */
    private static final String f21782g = "HEREWEGO_APPCODE";

    /* renamed from: h, reason: collision with root package name */
    private static final String f21783h = "HEREWEGO_OVERRIDE";

    /* renamed from: i, reason: collision with root package name */
    private static final String f21784i = "© 1987 - 2019 HERE. All rights reserved.";

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f21785j = {"https://1.{domain}/maptile/2.1/maptile/newest/", "https://2.{domain}/maptile/2.1/maptile/newest/", "https://3.{domain}/maptile/2.1/maptile/newest/", "https://4.{domain}/maptile/2.1/maptile/newest/"};

    /* renamed from: a, reason: collision with root package name */
    private String f21786a;

    /* renamed from: b, reason: collision with root package name */
    private String f21787b;

    /* renamed from: c, reason: collision with root package name */
    private String f21788c;

    /* renamed from: d, reason: collision with root package name */
    private String f21789d;

    public c() {
        super("herewego", 1, 20, 256, ".png", f21785j, f21784i);
        this.f21786a = "hybrid.day";
        this.f21787b = "";
        this.f21788c = "";
        this.f21789d = "aerial.maps.cit.api.here.com";
    }

    private void i(Context context) {
        String retrieveKey = ManifestUtil.retrieveKey(context, f21783h);
        if (retrieveKey != null && retrieveKey.length() > 0) {
            this.f21789d = retrieveKey;
        }
    }

    public String d() {
        return this.f21788c;
    }

    public String e() {
        return this.f21787b;
    }

    public String f() {
        return this.f21786a;
    }

    public final void g(Context context) {
        this.f21788c = ManifestUtil.retrieveKey(context, f21782g);
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        return getBaseUrl().replace("{domain}", this.f21789d) + f() + "/" + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getX(j5) + "/" + MapTileIndex.getY(j5) + "/" + getTileSizePixels() + "/png8?app_id=" + e() + "&app_code=" + d() + "&lg=pt-BR";
    }

    public final void h(Context context) {
        this.f21787b = ManifestUtil.retrieveKey(context, f21781f);
    }

    public final void j(Context context) {
        this.f21786a = ManifestUtil.retrieveKey(context, f21780e);
    }

    public void k(String str) {
        this.f21788c = str;
    }

    public void l(String str) {
        this.f21787b = str;
    }

    public void m(String str) {
        this.f21789d = str;
    }

    public void n(String str) {
        this.f21786a = str;
        this.mName = "herewego" + this.f21786a;
    }

    public c(Context context) {
        super("herewego", 1, 20, 256, ".png", f21785j, f21784i);
        this.f21786a = "hybrid.day";
        this.f21787b = "";
        this.f21788c = "";
        this.f21789d = "aerial.maps.cit.api.here.com";
        h(context);
        j(context);
        g(context);
        i(context);
        this.mName = "herewego" + this.f21786a;
    }

    public c(String str, String str2, String str3) {
        super("herewego" + str, 1, 20, 256, ".png", f21785j, f21784i);
        this.f21789d = "aerial.maps.cit.api.here.com";
        this.f21787b = str2;
        this.f21786a = str;
        this.f21788c = str3;
    }

    public c(String str, int i5, int i6, int i7, String str2) {
        super(str, i5, i6, i7, str2, f21785j, f21784i);
        this.f21786a = "hybrid.day";
        this.f21787b = "";
        this.f21788c = "";
        this.f21789d = "aerial.maps.cit.api.here.com";
    }

    public c(String str, int i5, int i6, int i7, String str2, String str3, String str4) {
        super(str, i5, i6, i7, str2, new String[]{str4}, "© 1987 - 2017 HERE. All rights reserved.");
        this.f21786a = "hybrid.day";
        this.f21787b = "";
        this.f21788c = "";
        this.f21789d = "aerial.maps.cit.api.here.com";
    }
}
