package org.osmdroid.tileprovider.tilesource;

import android.content.Context;
import org.osmdroid.tileprovider.util.ManifestUtil;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class f extends OnlineTileSourceBase {

    /* renamed from: d, reason: collision with root package name */
    private static final String f21790d = "MAPBOX_MAPID";

    /* renamed from: e, reason: collision with root package name */
    private static final String f21791e = "MAPBOX_ACCESS_TOKEN";

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f21792f = {"https://api.mapbox.com/v4/"};

    /* renamed from: a, reason: collision with root package name */
    private String f21793a;

    /* renamed from: b, reason: collision with root package name */
    private String f21794b;

    /* renamed from: c, reason: collision with root package name */
    private String f21795c;

    public f() {
        super("mapbox", 1, 19, 256, ".png", f21792f);
        this.f21793a = "";
        this.f21795c = "";
    }

    public void d(boolean z4) {
        if (z4) {
            this.f21795c = "@2x";
        } else {
            this.f21795c = "";
        }
    }

    public String e() {
        return this.f21794b;
    }

    public String f() {
        return this.f21793a;
    }

    public final void g(Context context) {
        this.f21794b = ManifestUtil.retrieveKey(context, f21791e);
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j5) {
        return getBaseUrl() + f() + "/" + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getX(j5) + "/" + MapTileIndex.getY(j5) + this.f21795c + this.mImageFilenameEnding + "?access_token=" + e();
    }

    public final void h(Context context) {
        this.f21793a = ManifestUtil.retrieveKey(context, f21790d);
    }

    public void i(String str) {
        this.f21794b = str;
    }

    public void j(String str) {
        this.f21793a = str;
        this.mName = "mapbox" + this.f21793a;
    }

    public f(Context context) {
        super("mapbox", 1, 19, 256, ".png", f21792f);
        this.f21793a = "";
        this.f21795c = "";
        g(context);
        h(context);
        this.mName = "mapbox" + this.f21793a;
    }

    public f(String str, String str2) {
        super("mapbox", 1, 19, 256, ".png", f21792f);
        this.f21795c = "";
        this.f21794b = str2;
        this.f21793a = str;
        this.mName = "mapbox" + this.f21793a;
    }

    public f(String str, int i5, int i6, int i7, String str2) {
        super(str, i5, i6, i7, str2, f21792f);
        this.f21793a = "";
        this.f21795c = "";
    }

    public f(String str, int i5, int i6, int i7, String str2, String str3, String str4) {
        super(str, i5, i6, i7, str2, new String[]{str4});
        this.f21793a = "";
        this.f21795c = "";
    }
}
