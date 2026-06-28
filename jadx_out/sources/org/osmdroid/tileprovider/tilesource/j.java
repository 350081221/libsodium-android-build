package org.osmdroid.tileprovider.tilesource;

import android.util.Log;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.HttpURLConnection;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21816c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f21817d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f21818e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f21819f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f21820a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21821b;

    public j() {
        this(0, 0);
    }

    private boolean b() {
        return (this.f21821b & 4) == 0;
    }

    public boolean a() {
        return (this.f21821b & 1) == 0;
    }

    public boolean c() {
        return (this.f21821b & 2) == 0;
    }

    public boolean d(String str) {
        if (b()) {
            return true;
        }
        if (str != null && str.trim().length() > 0 && !str.equals(org.osmdroid.config.b.G)) {
            return true;
        }
        return false;
    }

    public long e(String str, String str2, long j5) {
        Long i02 = org.osmdroid.config.a.a().i0();
        if (i02 != null) {
            return j5 + i02.longValue();
        }
        long g02 = org.osmdroid.config.a.a().g0();
        Long g5 = g(str2);
        if (g5 != null) {
            return j5 + (g5.longValue() * 1000) + g02;
        }
        Long h5 = h(str);
        if (h5 != null) {
            return h5.longValue() + g02;
        }
        return j5 + 604800000 + g02;
    }

    public long f(HttpURLConnection httpURLConnection, long j5) {
        String headerField = httpURLConnection.getHeaderField(OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER);
        String headerField2 = httpURLConnection.getHeaderField(OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER);
        long e5 = e(headerField, headerField2, j5);
        if (org.osmdroid.config.a.a().m0()) {
            Log.d(IMapView.LOGTAG, "computeExpirationTime('" + headerField + "','" + headerField2 + "'," + j5 + ContainerUtils.KEY_VALUE_DELIMITER + e5);
        }
        return e5;
    }

    public Long g(String str) {
        if (str != null && str.length() > 0) {
            try {
                for (String str2 : str.split(", ")) {
                    if (str2.indexOf("max-age=") == 0) {
                        return Long.valueOf(str2.substring(8));
                    }
                }
                return null;
            } catch (Exception e5) {
                if (org.osmdroid.config.a.a().m0()) {
                    Log.d(IMapView.LOGTAG, "Unable to parse cache control tag for tile, server returned " + str, e5);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public Long h(String str) {
        if (str != null && str.length() > 0) {
            try {
                return Long.valueOf(org.osmdroid.config.a.a().p().parse(str).getTime());
            } catch (Exception e5) {
                if (org.osmdroid.config.a.a().m0()) {
                    Log.d(IMapView.LOGTAG, "Unable to parse expiration tag for tile, server returned " + str, e5);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public int i() {
        return this.f21820a;
    }

    public boolean j() {
        return (this.f21821b & 8) != 0;
    }

    public j(int i5, int i6) {
        this.f21820a = i5;
        this.f21821b = i6;
    }
}
