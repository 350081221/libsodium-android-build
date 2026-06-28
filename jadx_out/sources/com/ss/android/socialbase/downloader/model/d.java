package com.ss.android.socialbase.downloader.model;

import android.net.http.Headers;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.i.f;
import com.ss.android.socialbase.downloader.network.g;
import java.io.IOException;
import org.apache.http.protocol.HTTP;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f11129a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11130b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11131c;

    /* renamed from: d, reason: collision with root package name */
    private long f11132d;

    /* renamed from: e, reason: collision with root package name */
    private long f11133e;

    public d(String str, g gVar) throws IOException {
        this.f11129a = str;
        this.f11131c = gVar.b();
        this.f11130b = gVar;
    }

    public boolean a() {
        return f.c(this.f11131c);
    }

    public boolean b() {
        return f.a(this.f11131c, this.f11130b.a("Accept-Ranges"));
    }

    public String c() {
        return this.f11130b.a("Etag");
    }

    public String d() {
        return this.f11130b.a(HTTP.CONTENT_TYPE);
    }

    public String e() {
        return f.b(this.f11130b, "Content-Range");
    }

    public String f() {
        String b5 = f.b(this.f11130b, Headers.LAST_MODIFIED);
        if (TextUtils.isEmpty(b5)) {
            return f.b(this.f11130b, "Last-Modified");
        }
        return b5;
    }

    public String g() {
        return f.b(this.f11130b, OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER);
    }

    public long h() {
        if (this.f11132d <= 0) {
            this.f11132d = f.a(this.f11130b);
        }
        return this.f11132d;
    }

    public boolean i() {
        if (com.ss.android.socialbase.downloader.i.a.a(8)) {
            return f.c(this.f11130b);
        }
        return f.b(h());
    }

    public long j() {
        if (this.f11133e <= 0) {
            if (!i()) {
                String e5 = e();
                if (!TextUtils.isEmpty(e5)) {
                    this.f11133e = f.b(e5);
                }
            } else {
                this.f11133e = -1L;
            }
        }
        return this.f11133e;
    }

    public long k() {
        return f.i(g());
    }
}
