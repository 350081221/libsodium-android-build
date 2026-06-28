package com.ss.android.socialbase.appdownloader;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.s;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {
    private boolean A;
    private int C;
    private boolean D;
    private String E;
    private boolean G;
    private boolean H;
    private boolean I;
    private int L;
    private x N;
    private n O;
    private com.ss.android.socialbase.appdownloader.c.e P;
    private IDownloadFileUriProvider Q;
    private r R;
    private boolean S;
    private af T;
    private boolean U;
    private JSONObject V;
    private String W;
    private int Y;
    private long Z;

    /* renamed from: a, reason: collision with root package name */
    private Activity f10291a;
    private int aa;
    private boolean ab;
    private String ad;
    private String af;
    private int[] ag;

    /* renamed from: b, reason: collision with root package name */
    private Context f10292b;

    /* renamed from: c, reason: collision with root package name */
    private String f10293c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f10294d;

    /* renamed from: e, reason: collision with root package name */
    private String f10295e;

    /* renamed from: f, reason: collision with root package name */
    private String f10296f;

    /* renamed from: g, reason: collision with root package name */
    private String f10297g;

    /* renamed from: h, reason: collision with root package name */
    private List<com.ss.android.socialbase.downloader.model.c> f10298h;

    /* renamed from: m, reason: collision with root package name */
    private IDownloadListener f10303m;

    /* renamed from: n, reason: collision with root package name */
    private IDownloadListener f10304n;

    /* renamed from: o, reason: collision with root package name */
    private String f10305o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10307q;

    /* renamed from: r, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.g f10308r;

    /* renamed from: s, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.h f10309s;

    /* renamed from: t, reason: collision with root package name */
    private s f10310t;

    /* renamed from: u, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.notification.a f10311u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10312v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10313w;

    /* renamed from: x, reason: collision with root package name */
    private String f10314x;

    /* renamed from: y, reason: collision with root package name */
    private String f10315y;

    /* renamed from: z, reason: collision with root package name */
    private long f10316z;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10299i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10300j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10301k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10302l = false;

    /* renamed from: p, reason: collision with root package name */
    private String f10306p = "application/vnd.android.package-archive";
    private int B = 5;
    private boolean F = true;
    private EnqueueType J = EnqueueType.ENQUEUE_NONE;
    private int K = 150;
    private boolean M = true;
    private List<m> X = new ArrayList();
    private boolean ac = true;
    private boolean ae = true;

    public f(@NonNull Context context, @NonNull String str) {
        this.f10292b = context.getApplicationContext();
        this.f10293c = str;
    }

    public boolean A() {
        return this.D;
    }

    public String B() {
        return this.E;
    }

    public boolean C() {
        return this.F;
    }

    public boolean D() {
        return this.G;
    }

    public s E() {
        return this.f10310t;
    }

    public int F() {
        return this.K;
    }

    public int G() {
        return this.L;
    }

    public boolean H() {
        return this.H;
    }

    public boolean I() {
        return this.I;
    }

    public boolean J() {
        return this.M;
    }

    public boolean K() {
        return this.S;
    }

    public EnqueueType L() {
        return this.J;
    }

    public boolean M() {
        return this.A;
    }

    public String N() {
        return this.f10296f;
    }

    public x O() {
        return this.N;
    }

    public n P() {
        return this.O;
    }

    public com.ss.android.socialbase.appdownloader.c.e Q() {
        return this.P;
    }

    public IDownloadFileUriProvider R() {
        return this.Q;
    }

    public af S() {
        return this.T;
    }

    public List<m> T() {
        return this.X;
    }

    public String U() {
        return this.ad;
    }

    public boolean V() {
        return this.U;
    }

    public int W() {
        return this.Y;
    }

    public long X() {
        return this.Z;
    }

    public boolean Y() {
        return this.ae;
    }

    public String Z() {
        return this.af;
    }

    public Activity a() {
        return this.f10291a;
    }

    public int[] aa() {
        return this.ag;
    }

    public boolean ab() {
        return this.ab;
    }

    public boolean ac() {
        return this.ac;
    }

    public String ad() {
        return this.W;
    }

    public List<String> ae() {
        return this.f10294d;
    }

    public r af() {
        return this.R;
    }

    public JSONObject ag() {
        return this.V;
    }

    public Context b() {
        return this.f10292b;
    }

    public String c() {
        return this.f10293c;
    }

    public String d() {
        return this.f10295e;
    }

    public String e() {
        return this.f10297g;
    }

    public List<com.ss.android.socialbase.downloader.model.c> f() {
        return this.f10298h;
    }

    public boolean g() {
        return this.f10299i;
    }

    public boolean h() {
        return this.f10300j;
    }

    public boolean i() {
        return this.f10301k;
    }

    public boolean j() {
        return this.f10302l;
    }

    public IDownloadListener k() {
        return this.f10303m;
    }

    public IDownloadListener l() {
        return this.f10304n;
    }

    public String m() {
        return this.f10305o;
    }

    public String n() {
        return this.f10306p;
    }

    public boolean o() {
        return this.f10307q;
    }

    public com.ss.android.socialbase.downloader.notification.a p() {
        return this.f10311u;
    }

    public com.ss.android.socialbase.downloader.downloader.h q() {
        return this.f10309s;
    }

    public com.ss.android.socialbase.downloader.downloader.g r() {
        return this.f10308r;
    }

    public boolean s() {
        return this.f10312v;
    }

    public boolean t() {
        return this.f10313w;
    }

    public int u() {
        return this.aa;
    }

    public String v() {
        return this.f10314x;
    }

    public String w() {
        return this.f10315y;
    }

    public long x() {
        return this.f10316z;
    }

    public int y() {
        return this.B;
    }

    public int z() {
        return this.C;
    }

    public void a(int i5) {
        this.aa = i5;
    }

    public f b(String str) {
        this.f10296f = str;
        return this;
    }

    public f c(@NonNull String str) {
        this.f10297g = str;
        return this;
    }

    public f d(String str) {
        this.ad = str;
        return this;
    }

    public f e(String str) {
        this.f10305o = str;
        return this;
    }

    public f f(String str) {
        this.f10306p = str;
        return this;
    }

    public f g(String str) {
        this.f10314x = str;
        return this;
    }

    public f h(String str) {
        this.f10315y = str;
        return this;
    }

    public f i(String str) {
        this.E = str;
        return this;
    }

    public f j(boolean z4) {
        this.G = z4;
        return this;
    }

    public f k(boolean z4) {
        this.H = z4;
        return this;
    }

    public f l(boolean z4) {
        this.I = z4;
        return this;
    }

    public f m(boolean z4) {
        this.M = z4;
        return this;
    }

    public f n(boolean z4) {
        this.A = z4;
        return this;
    }

    public f o(boolean z4) {
        this.ab = z4;
        return this;
    }

    public f p(boolean z4) {
        this.ac = z4;
        return this;
    }

    public f a(String str) {
        this.f10295e = str;
        return this;
    }

    public f b(boolean z4) {
        this.f10300j = z4;
        return this;
    }

    public f c(boolean z4) {
        this.f10302l = z4;
        return this;
    }

    public f d(boolean z4) {
        this.f10307q = z4;
        return this;
    }

    public f e(boolean z4) {
        this.f10312v = z4;
        return this;
    }

    public f f(boolean z4) {
        this.f10313w = z4;
        return this;
    }

    public f g(boolean z4) {
        this.D = z4;
        return this;
    }

    public f h(boolean z4) {
        this.S = z4;
        return this;
    }

    public f i(boolean z4) {
        this.F = z4;
        return this;
    }

    public f j(String str) {
        this.af = str;
        return this;
    }

    public f k(String str) {
        this.W = str;
        return this;
    }

    public f a(List<com.ss.android.socialbase.downloader.model.c> list) {
        this.f10298h = list;
        return this;
    }

    public f b(int i5) {
        this.B = i5;
        return this;
    }

    public f c(int i5) {
        this.C = i5;
        return this;
    }

    public f d(int i5) {
        this.K = i5;
        return this;
    }

    public f e(int i5) {
        this.L = i5;
        return this;
    }

    public f f(int i5) {
        this.Y = i5;
        return this;
    }

    public f a(boolean z4) {
        this.f10299i = z4;
        return this;
    }

    public f b(List<String> list) {
        this.f10294d = list;
        return this;
    }

    public f a(IDownloadListener iDownloadListener) {
        this.f10303m = iDownloadListener;
        return this;
    }

    public f a(long j5) {
        this.f10316z = j5;
        return this;
    }

    public f a(EnqueueType enqueueType) {
        this.J = enqueueType;
        return this;
    }

    public f a(IDownloadFileUriProvider iDownloadFileUriProvider) {
        this.Q = iDownloadFileUriProvider;
        return this;
    }

    public f a(r rVar) {
        this.R = rVar;
        return this;
    }

    public f a(JSONObject jSONObject) {
        this.V = jSONObject;
        return this;
    }

    public f a(m mVar) {
        synchronized (this.X) {
            if (mVar != null) {
                if (!this.X.contains(mVar)) {
                    this.X.add(mVar);
                    return this;
                }
            }
            return this;
        }
    }
}
