package org.osmdroid.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.modules.SqlTileWriter;
import org.osmdroid.tileprovider.util.b;

/* loaded from: classes4.dex */
public class b implements c {
    public static final String G = "osmdroid";
    private String F;

    /* renamed from: r, reason: collision with root package name */
    protected File f21648r;

    /* renamed from: s, reason: collision with root package name */
    protected File f21649s;

    /* renamed from: a, reason: collision with root package name */
    protected long f21631a = 20000;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f21632b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f21633c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f21634d = false;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f21635e = false;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f21636f = true;

    /* renamed from: g, reason: collision with root package name */
    protected String f21637g = G;

    /* renamed from: h, reason: collision with root package name */
    protected String f21638h = HTTP.USER_AGENT;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f21639i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    protected short f21640j = 9;

    /* renamed from: k, reason: collision with root package name */
    protected short f21641k = 2;

    /* renamed from: l, reason: collision with root package name */
    protected short f21642l = 8;

    /* renamed from: m, reason: collision with root package name */
    protected short f21643m = 40;

    /* renamed from: n, reason: collision with root package name */
    protected short f21644n = 40;

    /* renamed from: o, reason: collision with root package name */
    protected long f21645o = 629145600;

    /* renamed from: p, reason: collision with root package name */
    protected long f21646p = 524288000;

    /* renamed from: q, reason: collision with root package name */
    protected SimpleDateFormat f21647q = new SimpleDateFormat(OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER_FORMAT, Locale.US);

    /* renamed from: t, reason: collision with root package name */
    protected long f21650t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected Long f21651u = null;

    /* renamed from: v, reason: collision with root package name */
    protected Proxy f21652v = null;

    /* renamed from: w, reason: collision with root package name */
    protected int f21653w = 1000;

    /* renamed from: x, reason: collision with root package name */
    protected int f21654x = 500;

    /* renamed from: y, reason: collision with root package name */
    protected boolean f21655y = true;

    /* renamed from: z, reason: collision with root package name */
    protected short f21656z = 0;
    protected long A = 300000;
    protected int B = 20;
    protected long C = 500;
    protected boolean D = true;
    protected boolean E = false;

    private static void o0(SharedPreferences.Editor editor) {
        editor.apply();
    }

    private String p0(Context context) {
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        try {
            return packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 128).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return packageName;
        }
    }

    private static void q0(SharedPreferences sharedPreferences, Map<String, String> map, String str) {
        if (str != null && map != null) {
            map.clear();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2 != null && str2.startsWith(str)) {
                    map.put(str2.substring(str.length()), sharedPreferences.getString(str2, null));
                }
            }
        }
    }

    private static void r0(SharedPreferences sharedPreferences, SharedPreferences.Editor editor, Map<String, String> map, String str) {
        for (String str2 : sharedPreferences.getAll().keySet()) {
            if (str2.startsWith(str)) {
                editor.remove(str2);
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            editor.putString(str + entry.getKey(), entry.getValue());
        }
    }

    @Override // org.osmdroid.config.c
    public void A(short s5) {
        this.f21643m = s5;
    }

    @Override // org.osmdroid.config.c
    public boolean B() {
        return this.f21636f;
    }

    @Override // org.osmdroid.config.c
    public short C() {
        return this.f21640j;
    }

    @Override // org.osmdroid.config.c
    public void D(SimpleDateFormat simpleDateFormat) {
        this.f21647q = simpleDateFormat;
    }

    @Override // org.osmdroid.config.c
    public Proxy E() {
        return this.f21652v;
    }

    @Override // org.osmdroid.config.c
    public void F(long j5) {
        this.C = j5;
    }

    @Override // org.osmdroid.config.c
    public void G(boolean z4) {
        this.D = z4;
    }

    @Override // org.osmdroid.config.c
    public File H(Context context) {
        if (this.f21649s == null) {
            this.f21649s = new File(m(context), "tiles");
        }
        try {
            this.f21649s.mkdirs();
        } catch (Exception e5) {
            Log.d(IMapView.LOGTAG, "Unable to create tile cache path at " + this.f21649s, e5);
        }
        return this.f21649s;
    }

    @Override // org.osmdroid.config.c
    public long I() {
        return this.f21646p;
    }

    @Override // org.osmdroid.config.c
    public short J() {
        return this.f21641k;
    }

    @Override // org.osmdroid.config.c
    public void K(long j5) {
        this.f21646p = j5;
    }

    @Override // org.osmdroid.config.c
    public void L(boolean z4) {
        this.f21633c = z4;
    }

    @Override // org.osmdroid.config.c
    public boolean M() {
        return this.f21632b;
    }

    @Override // org.osmdroid.config.c
    public int N() {
        return this.f21653w;
    }

    @Override // org.osmdroid.config.c
    public boolean O() {
        return this.E;
    }

    @Override // org.osmdroid.config.c
    public long P() {
        return this.A;
    }

    @Override // org.osmdroid.config.c
    public void Q(int i5) {
        this.f21654x = i5;
    }

    @Override // org.osmdroid.config.c
    public void R(boolean z4) {
        this.f21636f = z4;
    }

    @Override // org.osmdroid.config.c
    public void S(String str) {
        this.f21637g = str;
    }

    @Override // org.osmdroid.config.c
    public boolean T() {
        return this.D;
    }

    @Override // org.osmdroid.config.c
    public boolean U() {
        return this.f21633c;
    }

    @Override // org.osmdroid.config.c
    public void V(long j5) {
        this.f21631a = j5;
    }

    @Override // org.osmdroid.config.c
    public short W() {
        return this.f21656z;
    }

    @Override // org.osmdroid.config.c
    public void X(boolean z4) {
        this.f21632b = z4;
    }

    @Override // org.osmdroid.config.c
    public void Y(short s5) {
        this.f21641k = s5;
    }

    @Override // org.osmdroid.config.c
    public void Z(File file) {
        this.f21649s = file;
    }

    @Override // org.osmdroid.config.c
    public boolean a() {
        return this.f21655y;
    }

    @Override // org.osmdroid.config.c
    public int a0() {
        return this.f21654x;
    }

    @Override // org.osmdroid.config.c
    public void b(int i5) {
        this.f21653w = i5;
    }

    @Override // org.osmdroid.config.c
    public void b0(long j5) {
        this.f21645o = j5;
    }

    @Override // org.osmdroid.config.c
    public short c() {
        return this.f21643m;
    }

    @Override // org.osmdroid.config.c
    public void c0(long j5) {
        this.A = j5;
    }

    @Override // org.osmdroid.config.c
    public void d(short s5) {
        this.f21642l = s5;
    }

    @Override // org.osmdroid.config.c
    public void d0(boolean z4) {
        this.E = z4;
    }

    @Override // org.osmdroid.config.c
    public short e() {
        return this.f21644n;
    }

    @Override // org.osmdroid.config.c
    public void e0(String str) {
        this.f21638h = str;
    }

    @Override // org.osmdroid.config.c
    public File f() {
        return H(null);
    }

    @Override // org.osmdroid.config.c
    public void f0(short s5) {
        this.f21640j = s5;
    }

    @Override // org.osmdroid.config.c
    public long g() {
        return this.C;
    }

    @Override // org.osmdroid.config.c
    public long g0() {
        return this.f21650t;
    }

    @Override // org.osmdroid.config.c
    public void h(short s5) {
        this.f21656z = s5;
    }

    @Override // org.osmdroid.config.c
    public short h0() {
        return this.f21642l;
    }

    @Override // org.osmdroid.config.c
    public long i() {
        return this.f21645o;
    }

    @Override // org.osmdroid.config.c
    public Long i0() {
        return this.f21651u;
    }

    @Override // org.osmdroid.config.c
    public int j() {
        return this.B;
    }

    @Override // org.osmdroid.config.c
    public void j0(int i5) {
        this.B = i5;
    }

    @Override // org.osmdroid.config.c
    public boolean k() {
        return this.f21634d;
    }

    @Override // org.osmdroid.config.c
    public void k0(boolean z4) {
        this.f21635e = z4;
    }

    @Override // org.osmdroid.config.c
    public void l(boolean z4) {
        this.f21634d = z4;
    }

    @Override // org.osmdroid.config.c
    public void l0(Context context, SharedPreferences sharedPreferences) {
        long j5;
        this.F = p0(context);
        String string = sharedPreferences.getString("osmdroid.basePath", null);
        if (string != null && new File(string).exists()) {
            o(new File(sharedPreferences.getString("osmdroid.basePath", m(context).getAbsolutePath())));
            Z(new File(sharedPreferences.getString("osmdroid.cachePath", H(context).getAbsolutePath())));
            X(sharedPreferences.getBoolean("osmdroid.DebugMode", this.f21632b));
            k0(sharedPreferences.getBoolean("osmdroid.DebugDownloading", this.f21635e));
            L(sharedPreferences.getBoolean("osmdroid.DebugMapView", this.f21633c));
            l(sharedPreferences.getBoolean("osmdroid.DebugTileProvider", this.f21634d));
            R(sharedPreferences.getBoolean("osmdroid.HardwareAcceleration", this.f21636f));
            S(sharedPreferences.getString("osmdroid.userAgentValue", context.getPackageName()));
            q0(sharedPreferences, this.f21639i, "osmdroid.additionalHttpRequestProperty.");
            V(sharedPreferences.getLong("osmdroid.gpsWaitTime", this.f21631a));
            Y((short) sharedPreferences.getInt("osmdroid.tileDownloadThreads", this.f21641k));
            d((short) sharedPreferences.getInt("osmdroid.tileFileSystemThreads", this.f21642l));
            A((short) sharedPreferences.getInt("osmdroid.tileDownloadMaxQueueSize", this.f21643m));
            y((short) sharedPreferences.getInt("osmdroid.tileFileSystemMaxQueueSize", this.f21644n));
            x(sharedPreferences.getLong("osmdroid.ExpirationExtendedDuration", this.f21650t));
            t(sharedPreferences.getBoolean("osmdroid.mapViewRecycler", this.f21655y));
            b(sharedPreferences.getInt("osmdroid.ZoomSpeedDefault", this.f21653w));
            Q(sharedPreferences.getInt("osmdroid.animationSpeedShort", this.f21654x));
            h((short) sharedPreferences.getInt("osmdroid.cacheTileOvershoot", this.f21656z));
            G(sharedPreferences.getBoolean("osmdroid.TileDownloaderFollowRedirects", this.D));
            d0(sharedPreferences.getBoolean("osmdroid.enforceTileSystemBounds", false));
            if (sharedPreferences.contains("osmdroid.ExpirationOverride")) {
                Long valueOf = Long.valueOf(sharedPreferences.getLong("osmdroid.ExpirationOverride", -1L));
                this.f21651u = valueOf;
                if (valueOf != null && valueOf.longValue() == -1) {
                    this.f21651u = null;
                }
            }
        } else {
            File m5 = m(context);
            File H = H(context);
            if (!m5.exists() || !org.osmdroid.tileprovider.util.b.p(m5)) {
                m5 = new File(context.getFilesDir(), G);
                H = new File(m5, "tiles");
                H.mkdirs();
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("osmdroid.basePath", m5.getAbsolutePath());
            edit.putString("osmdroid.cachePath", H.getAbsolutePath());
            o0(edit);
            o(m5);
            Z(H);
            S(context.getPackageName());
            n0(context, sharedPreferences);
        }
        File file = new File(f().getAbsolutePath() + File.separator + SqlTileWriter.DATABASE_FILENAME);
        if (file.exists()) {
            j5 = file.length();
        } else {
            j5 = 0;
        }
        long freeSpace = f().getFreeSpace() + j5;
        if (i() > freeSpace) {
            double d5 = freeSpace;
            b0((long) (0.95d * d5));
            K((long) (d5 * 0.9d));
        }
    }

    @Override // org.osmdroid.config.c
    public File m(Context context) {
        try {
            if (this.f21648r == null) {
                b.a d5 = org.osmdroid.tileprovider.util.b.d(context);
                if (d5 != null) {
                    File file = new File(d5.f21833a, G);
                    this.f21648r = file;
                    file.mkdirs();
                } else if (!new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), G).mkdirs()) {
                    Log.e(IMapView.LOGTAG, "Directory not created");
                }
            }
        } catch (Exception e5) {
            Log.d(IMapView.LOGTAG, "Unable to create base path at " + this.f21648r, e5);
        }
        if (this.f21648r == null && context != null) {
            this.f21648r = context.getFilesDir();
        }
        return this.f21648r;
    }

    @Override // org.osmdroid.config.c
    public boolean m0() {
        return this.f21635e;
    }

    @Override // org.osmdroid.config.c
    public Map<String, String> n() {
        return this.f21639i;
    }

    @Override // org.osmdroid.config.c
    public void n0(Context context, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("osmdroid.basePath", u().getAbsolutePath());
        edit.putString("osmdroid.cachePath", f().getAbsolutePath());
        edit.putBoolean("osmdroid.DebugMode", M());
        edit.putBoolean("osmdroid.DebugDownloading", m0());
        edit.putBoolean("osmdroid.DebugMapView", U());
        edit.putBoolean("osmdroid.DebugTileProvider", k());
        edit.putBoolean("osmdroid.HardwareAcceleration", B());
        edit.putBoolean("osmdroid.TileDownloaderFollowRedirects", T());
        edit.putString("osmdroid.userAgentValue", w());
        r0(sharedPreferences, edit, this.f21639i, "osmdroid.additionalHttpRequestProperty.");
        edit.putLong("osmdroid.gpsWaitTime", this.f21631a);
        edit.putInt("osmdroid.cacheMapTileCount", this.f21640j);
        edit.putInt("osmdroid.tileDownloadThreads", this.f21641k);
        edit.putInt("osmdroid.tileFileSystemThreads", this.f21642l);
        edit.putInt("osmdroid.tileDownloadMaxQueueSize", this.f21643m);
        edit.putInt("osmdroid.tileFileSystemMaxQueueSize", this.f21644n);
        edit.putLong("osmdroid.ExpirationExtendedDuration", this.f21650t);
        Long l5 = this.f21651u;
        if (l5 != null) {
            edit.putLong("osmdroid.ExpirationOverride", l5.longValue());
        }
        edit.putInt("osmdroid.ZoomSpeedDefault", this.f21653w);
        edit.putInt("osmdroid.animationSpeedShort", this.f21654x);
        edit.putBoolean("osmdroid.mapViewRecycler", this.f21655y);
        edit.putInt("osmdroid.cacheTileOvershoot", this.f21656z);
        edit.putBoolean("osmdroid.enforceTileSystemBounds", this.E);
        o0(edit);
    }

    @Override // org.osmdroid.config.c
    public void o(File file) {
        this.f21648r = file;
    }

    @Override // org.osmdroid.config.c
    public SimpleDateFormat p() {
        return this.f21647q;
    }

    @Override // org.osmdroid.config.c
    public long q() {
        return this.f21631a;
    }

    @Override // org.osmdroid.config.c
    public String r() {
        return this.f21638h;
    }

    @Override // org.osmdroid.config.c
    public String s() {
        return this.F;
    }

    @Override // org.osmdroid.config.c
    public void t(boolean z4) {
        this.f21655y = z4;
    }

    @Override // org.osmdroid.config.c
    public File u() {
        return m(null);
    }

    @Override // org.osmdroid.config.c
    public void v(Proxy proxy) {
        this.f21652v = proxy;
    }

    @Override // org.osmdroid.config.c
    public String w() {
        return this.f21637g;
    }

    @Override // org.osmdroid.config.c
    public void x(long j5) {
        if (j5 < 0) {
            this.f21650t = 0L;
        } else {
            this.f21650t = j5;
        }
    }

    @Override // org.osmdroid.config.c
    public void y(short s5) {
        this.f21644n = s5;
    }

    @Override // org.osmdroid.config.c
    public void z(Long l5) {
        this.f21651u = l5;
    }
}
