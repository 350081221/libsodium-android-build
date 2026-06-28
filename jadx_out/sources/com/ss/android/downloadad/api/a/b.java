package com.ss.android.downloadad.api.a;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.k;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements a {
    private int A;
    private long B;
    private long C;
    private long D;
    private int E;
    private int F;
    private String G;
    private boolean H;
    private String I;
    private boolean J;
    private boolean K;
    private boolean L;
    private String M;
    private String N;
    private boolean O;
    private boolean P;
    private int Q;

    @AdBaseConstants.FunnelType
    private int R;
    private long S;
    private long T;
    private boolean U;
    private boolean V;
    private String W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f9498a;
    private long aa;
    private transient boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private String ai;
    private long aj;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f9499b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9500c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f9501d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9502e;

    /* renamed from: f, reason: collision with root package name */
    private long f9503f;

    /* renamed from: g, reason: collision with root package name */
    private long f9504g;

    /* renamed from: h, reason: collision with root package name */
    private String f9505h;

    /* renamed from: i, reason: collision with root package name */
    private int f9506i;

    /* renamed from: j, reason: collision with root package name */
    private String f9507j;

    /* renamed from: k, reason: collision with root package name */
    private String f9508k;

    /* renamed from: l, reason: collision with root package name */
    private String f9509l;

    /* renamed from: m, reason: collision with root package name */
    private String f9510m;

    /* renamed from: n, reason: collision with root package name */
    private int f9511n;

    /* renamed from: o, reason: collision with root package name */
    private int f9512o;

    /* renamed from: p, reason: collision with root package name */
    private int f9513p;

    /* renamed from: q, reason: collision with root package name */
    private int f9514q;

    /* renamed from: r, reason: collision with root package name */
    private String f9515r;

    /* renamed from: s, reason: collision with root package name */
    private String f9516s;

    /* renamed from: t, reason: collision with root package name */
    private String f9517t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9518u;

    /* renamed from: v, reason: collision with root package name */
    private long f9519v;

    /* renamed from: w, reason: collision with root package name */
    private JSONObject f9520w;

    /* renamed from: x, reason: collision with root package name */
    private int f9521x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f9522y;

    /* renamed from: z, reason: collision with root package name */
    private int f9523z;

    private b() {
        this.f9506i = 1;
        this.f9518u = true;
        this.f9522y = false;
        this.f9523z = 0;
        this.A = 0;
        this.H = false;
        this.J = false;
        this.K = true;
        this.L = true;
        this.f9498a = true;
        this.f9499b = true;
        this.f9500c = new AtomicBoolean(false);
        this.f9501d = new AtomicBoolean(false);
        this.f9502e = new AtomicBoolean(false);
        this.R = 1;
        this.U = true;
        this.aa = -1L;
    }

    public synchronized void A() {
        this.A++;
    }

    public long B() {
        long j5 = this.B;
        if (j5 == 0) {
            return this.f9519v;
        }
        return j5;
    }

    public long C() {
        return this.C;
    }

    public int D() {
        return this.E;
    }

    public int E() {
        return this.F;
    }

    public String F() {
        return this.G;
    }

    public int G() {
        return this.f9506i;
    }

    public long H() {
        return this.f9519v;
    }

    public int I() {
        return this.f9514q;
    }

    public String J() {
        return this.f9515r;
    }

    public int K() {
        return this.Q;
    }

    public boolean L() {
        return this.f9522y;
    }

    public long M() {
        return this.aa;
    }

    public String N() {
        return this.f9516s;
    }

    public int O() {
        return this.f9512o;
    }

    public String P() {
        return this.W;
    }

    public boolean Q() {
        return this.Y;
    }

    public boolean R() {
        return this.P;
    }

    public boolean S() {
        return this.Z;
    }

    public long T() {
        return this.S;
    }

    public long U() {
        return this.T;
    }

    public boolean V() {
        return this.H;
    }

    public String W() {
        return this.I;
    }

    public boolean X() {
        return this.J;
    }

    public boolean Y() {
        return this.ab;
    }

    public boolean Z() {
        return this.ac;
    }

    public void a(int i5) {
        this.f9523z = i5;
    }

    public boolean aa() {
        return this.ae;
    }

    public boolean ab() {
        return this.ad;
    }

    public boolean ac() {
        return this.af;
    }

    public boolean ad() {
        return this.ag;
    }

    public boolean ae() {
        return this.ah;
    }

    public String af() {
        return this.ai;
    }

    public long ag() {
        return this.aj;
    }

    public JSONObject ah() {
        int i5;
        int i6;
        int i7;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mId", this.f9503f);
            jSONObject.put("mExtValue", this.f9504g);
            jSONObject.put("mLogExtra", this.f9505h);
            jSONObject.put("mDownloadStatus", this.f9506i);
            jSONObject.put("mPackageName", this.f9507j);
            jSONObject.put("mIsAd", this.f9518u);
            jSONObject.put("mTimeStamp", this.f9519v);
            jSONObject.put("mExtras", this.f9520w);
            jSONObject.put("mVersionCode", this.f9514q);
            jSONObject.put("mVersionName", this.f9515r);
            jSONObject.put("mDownloadId", this.f9521x);
            jSONObject.put("mIsV3Event", this.O);
            jSONObject.put("mScene", this.Q);
            jSONObject.put("mEventTag", this.M);
            jSONObject.put("mEventRefer", this.N);
            jSONObject.put("mDownloadUrl", this.f9508k);
            jSONObject.put("mEnableBackDialog", this.f9522y);
            jSONObject.put("hasSendInstallFinish", this.f9500c.get());
            jSONObject.put("hasSendDownloadFailedFinally", this.f9501d.get());
            jSONObject.put("hasDoRebootMarketInstallFinishCheck", this.f9502e.get());
            jSONObject.put("mLastFailedErrCode", this.F);
            jSONObject.put("mLastFailedErrMsg", this.G);
            jSONObject.put("mOpenUrl", this.f9509l);
            jSONObject.put("mLinkMode", this.f9512o);
            jSONObject.put("mDownloadMode", this.f9513p);
            jSONObject.put("mModelType", this.f9511n);
            jSONObject.put("mAppName", this.f9516s);
            jSONObject.put("mAppIcon", this.f9517t);
            jSONObject.put("mDownloadFailedTimes", this.f9523z);
            long j5 = this.B;
            if (j5 == 0) {
                j5 = this.f9519v;
            }
            jSONObject.put("mRecentDownloadResumeTime", j5);
            jSONObject.put("mClickPauseTimes", this.A);
            jSONObject.put("mJumpInstallTime", this.C);
            jSONObject.put("mCancelInstallTime", this.D);
            jSONObject.put("mLastFailedResumeCount", this.E);
            jSONObject.put("mIsUpdateDownload", this.H);
            jSONObject.put("mOriginMimeType", this.I);
            jSONObject.put("mIsPatchApplyHandled", this.J);
            jSONObject.put("downloadFinishReason", this.W);
            jSONObject.put("clickDownloadTime", this.S);
            jSONObject.put("clickDownloadSize", this.T);
            jSONObject.put("installAfterCleanSpace", this.P);
            jSONObject.put(TTDownloadField.TT_FUNNEL_TYPE, this.R);
            jSONObject.put(TTDownloadField.TT_WEB_URL, this.f9510m);
            jSONObject.put(TTDownloadField.TT_ENABLE_SHOW_COMPLIANCE_DIALOG, this.U);
            jSONObject.put(TTDownloadField.TT_IS_AUTO_DOWNLOAD_ON_CARD_SHOW, this.V);
            int i8 = 1;
            if (this.K) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject.put("enable_new_activity", i5);
            if (this.L) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            jSONObject.put("enable_pause", i6);
            if (this.f9498a) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            jSONObject.put("enable_ah", i7);
            if (!this.f9499b) {
                i8 = 0;
            }
            jSONObject.put("enable_am", i8);
            jSONObject.putOpt("intent_jump_browser_success", Boolean.valueOf(this.ah));
            jSONObject.put("task_key", this.ai);
            jSONObject.putOpt("market_install_finish_check_start_timestamp", Long.valueOf(this.aj));
        } catch (Exception e5) {
            k.u().a(e5, "NativeDownloadModel toJson");
        }
        return jSONObject;
    }

    public AdDownloadModel ai() {
        return new AdDownloadModel.Builder().setAdId(this.f9503f).setExtraValue(this.f9504g).setLogExtra(this.f9505h).setPackageName(this.f9507j).setExtra(this.f9520w).setIsAd(this.f9518u).setVersionCode(this.f9514q).setVersionName(this.f9515r).setDownloadUrl(this.f9508k).setModelType(this.f9511n).setMimeType(this.I).setAppName(this.f9516s).setAppIcon(this.f9517t).setTaskKey(this.ai).setDeepLink(new DeepLink(this.f9509l, this.f9510m, null)).build();
    }

    public AdDownloadEventConfig aj() {
        return new AdDownloadEventConfig.Builder().setClickButtonTag(this.M).setRefer(this.N).setIsEnableV3Event(this.O).build();
    }

    public AdDownloadController ak() {
        return new AdDownloadController.Builder().setIsEnableBackDialog(this.f9522y).setLinkMode(this.f9512o).setDownloadMode(this.f9513p).setEnableShowComplianceDialog(this.U).setEnableAH(this.f9498a).setEnableAM(this.f9499b).build();
    }

    public void b(int i5) {
        this.A = i5;
    }

    public void c(long j5) {
        this.D = j5;
    }

    public void d(int i5) {
        this.F = i5;
    }

    public void e(long j5) {
        this.f9504g = j5;
    }

    public void f(long j5) {
        if (j5 > 0) {
            this.f9519v = j5;
        }
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject g() {
        return this.f9520w;
    }

    public void h(int i5) {
        this.Q = i5;
    }

    public void i(int i5) {
        this.R = i5;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String j() {
        return this.M;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject k() {
        return null;
    }

    public void k(String str) {
        this.f9517t = str;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public long l() {
        return this.f9504g;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public boolean m() {
        return this.O;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public List<String> n() {
        return null;
    }

    public void n(boolean z4) {
        this.af = z4;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public Object o() {
        return null;
    }

    public void o(boolean z4) {
        this.ag = z4;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject p() {
        return null;
    }

    public void p(boolean z4) {
        this.U = z4;
    }

    public void q(boolean z4) {
        this.V = z4;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public JSONObject r() {
        return null;
    }

    public void r(boolean z4) {
        this.K = z4;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public int s() {
        return this.f9521x;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public int t() {
        return -1;
    }

    public void t(boolean z4) {
        this.f9498a = z4;
    }

    public void u(boolean z4) {
        this.f9499b = z4;
    }

    public void v(boolean z4) {
        this.ah = z4;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public DownloadController w() {
        return ak();
    }

    public int x() {
        return this.f9523z;
    }

    public synchronized void y() {
        this.f9523z++;
    }

    public int z() {
        return this.A;
    }

    public void a(long j5) {
        this.B = j5;
    }

    public void b(long j5) {
        this.C = j5;
    }

    public void c(int i5) {
        this.E = i5;
    }

    public void d(long j5) {
        this.f9503f = j5;
    }

    public void e(int i5) {
        this.f9506i = i5;
    }

    public void f(int i5) {
        this.f9514q = i5;
    }

    public void g(int i5) {
        this.f9521x = i5;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public int h() {
        return this.R;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String i() {
        return this.N;
    }

    public void j(String str) {
        this.f9516s = str;
    }

    public void k(int i5) {
        this.f9513p = i5;
    }

    public void l(int i5) {
        this.f9511n = i5;
    }

    public void m(String str) {
        this.I = str;
    }

    public void n(String str) {
        this.ai = str;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public boolean q() {
        return this.K;
    }

    public void s(boolean z4) {
        this.L = z4;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public DownloadModel u() {
        return ai();
    }

    @Override // com.ss.android.downloadad.api.a.a
    public DownloadEventConfig v() {
        return aj();
    }

    public void a(String str) {
        this.G = str;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public long b() {
        return this.f9503f;
    }

    public void c(String str) {
        this.f9505h = str;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String d() {
        return this.f9505h;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String e() {
        return this.f9507j;
    }

    public void f(String str) {
        this.M = str;
    }

    public void g(String str) {
        this.N = str;
    }

    public void h(String str) {
        this.f9508k = str;
    }

    public void i(String str) {
        this.f9509l = str;
    }

    public void j(int i5) {
        this.f9512o = i5;
    }

    public void k(boolean z4) {
        this.ac = z4;
    }

    public void l(String str) {
        this.W = str;
    }

    public void m(boolean z4) {
        this.ad = z4;
    }

    public void a(boolean z4) {
        this.f9518u = z4;
    }

    public void b(String str) {
        this.f9507j = str;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public boolean c() {
        return this.f9518u;
    }

    public void d(String str) {
        this.f9515r = str;
    }

    public void e(String str) {
        this.f9510m = str;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String f() {
        return this.f9509l;
    }

    public void g(long j5) {
        this.aa = j5;
    }

    public void h(long j5) {
        this.S = j5;
    }

    public void i(long j5) {
        this.T = j5;
    }

    public void j(boolean z4) {
        this.ab = z4;
    }

    public void l(boolean z4) {
        this.ae = z4;
    }

    public void a(JSONObject jSONObject) {
        this.f9520w = jSONObject;
    }

    public void b(boolean z4) {
        this.O = z4;
    }

    public void c(boolean z4) {
        this.f9522y = z4;
    }

    public void d(boolean z4) {
        this.X = z4;
    }

    public void e(boolean z4) {
        this.Y = z4;
    }

    public void f(boolean z4) {
        this.P = z4;
    }

    public void g(boolean z4) {
        this.Z = z4;
    }

    public void h(boolean z4) {
        this.H = z4;
    }

    public void i(boolean z4) {
        this.J = z4;
    }

    public void j(long j5) {
        this.aj = j5;
    }

    public static b b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        try {
            bVar.d(com.ss.android.download.api.c.b.a(jSONObject, "mId"));
            bVar.e(com.ss.android.download.api.c.b.a(jSONObject, "mExtValue"));
            bVar.c(jSONObject.optString("mLogExtra"));
            bVar.e(jSONObject.optInt("mDownloadStatus"));
            bVar.b(jSONObject.optString("mPackageName"));
            boolean z4 = true;
            bVar.a(jSONObject.optBoolean("mIsAd", true));
            bVar.f(com.ss.android.download.api.c.b.a(jSONObject, "mTimeStamp"));
            bVar.f(jSONObject.optInt("mVersionCode"));
            bVar.d(jSONObject.optString("mVersionName"));
            bVar.g(jSONObject.optInt("mDownloadId"));
            bVar.b(jSONObject.optBoolean("mIsV3Event"));
            bVar.h(jSONObject.optInt("mScene"));
            bVar.f(jSONObject.optString("mEventTag"));
            bVar.g(jSONObject.optString("mEventRefer"));
            bVar.h(jSONObject.optString("mDownloadUrl"));
            bVar.c(jSONObject.optBoolean("mEnableBackDialog"));
            bVar.f9500c.set(jSONObject.optBoolean("hasSendInstallFinish"));
            bVar.f9501d.set(jSONObject.optBoolean("hasSendDownloadFailedFinally"));
            bVar.f9502e.set(jSONObject.optBoolean("hasDoRebootMarketInstallFinishCheck"));
            bVar.d(jSONObject.optInt("mLastFailedErrCode"));
            bVar.a(jSONObject.optString("mLastFailedErrMsg"));
            bVar.i(jSONObject.optString("mOpenUrl"));
            bVar.j(jSONObject.optInt("mLinkMode"));
            bVar.k(jSONObject.optInt("mDownloadMode"));
            bVar.l(jSONObject.optInt("mModelType"));
            bVar.j(jSONObject.optString("mAppName"));
            bVar.k(jSONObject.optString("mAppIcon"));
            bVar.a(jSONObject.optInt("mDownloadFailedTimes", 0));
            bVar.a(com.ss.android.download.api.c.b.a(jSONObject, "mRecentDownloadResumeTime"));
            bVar.b(jSONObject.optInt("mClickPauseTimes"));
            bVar.b(com.ss.android.download.api.c.b.a(jSONObject, "mJumpInstallTime"));
            bVar.c(com.ss.android.download.api.c.b.a(jSONObject, "mCancelInstallTime"));
            bVar.c(jSONObject.optInt("mLastFailedResumeCount"));
            bVar.l(jSONObject.optString("downloadFinishReason"));
            bVar.i(jSONObject.optLong("clickDownloadSize"));
            bVar.h(jSONObject.optLong("clickDownloadTime"));
            bVar.h(jSONObject.optBoolean("mIsUpdateDownload"));
            bVar.m(jSONObject.optString("mOriginMimeType"));
            bVar.i(jSONObject.optBoolean("mIsPatchApplyHandled"));
            bVar.f(jSONObject.optBoolean("installAfterCleanSpace"));
            bVar.i(jSONObject.optInt(TTDownloadField.TT_FUNNEL_TYPE, 1));
            bVar.e(jSONObject.optString(TTDownloadField.TT_WEB_URL));
            bVar.p(jSONObject.optBoolean(TTDownloadField.TT_ENABLE_SHOW_COMPLIANCE_DIALOG, true));
            bVar.q(jSONObject.optBoolean(TTDownloadField.TT_IS_AUTO_DOWNLOAD_ON_CARD_SHOW));
            bVar.r(jSONObject.optInt("enable_new_activity", 1) == 1);
            bVar.s(jSONObject.optInt("enable_pause", 1) == 1);
            bVar.t(jSONObject.optInt("enable_ah", 1) == 1);
            if (jSONObject.optInt("enable_am", 1) != 1) {
                z4 = false;
            }
            bVar.u(z4);
            bVar.a(jSONObject.optJSONObject("mExtras"));
            bVar.v(jSONObject.optBoolean("intent_jump_browser_success"));
            bVar.n(jSONObject.optString("task_key"));
            bVar.j(jSONObject.optLong("market_install_finish_check_start_timestamp"));
        } catch (Exception e5) {
            k.u().a(e5, "NativeDownloadModel fromJson");
        }
        return bVar;
    }

    @Override // com.ss.android.downloadad.api.a.a
    public String a() {
        return this.f9508k;
    }

    public b(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        this(downloadModel, downloadEventConfig, downloadController, 0);
    }

    public b(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, int i5) {
        this.f9506i = 1;
        this.f9518u = true;
        this.f9522y = false;
        this.f9523z = 0;
        this.A = 0;
        this.H = false;
        this.J = false;
        this.K = true;
        this.L = true;
        this.f9498a = true;
        this.f9499b = true;
        this.f9500c = new AtomicBoolean(false);
        this.f9501d = new AtomicBoolean(false);
        this.f9502e = new AtomicBoolean(false);
        this.R = 1;
        this.U = true;
        this.aa = -1L;
        this.f9503f = downloadModel.getId();
        this.f9504g = downloadModel.getExtraValue();
        this.f9505h = downloadModel.getLogExtra();
        this.f9507j = downloadModel.getPackageName();
        this.f9520w = downloadModel.getExtra();
        this.f9518u = downloadModel.isAd();
        this.f9514q = downloadModel.getVersionCode();
        this.f9515r = downloadModel.getVersionName();
        this.f9508k = downloadModel.getDownloadUrl();
        if (downloadModel.getDeepLink() != null) {
            this.f9509l = downloadModel.getDeepLink().getOpenUrl();
            this.f9510m = downloadModel.getDeepLink().getWebUrl();
        }
        this.f9511n = downloadModel.getModelType();
        this.f9516s = downloadModel.getName();
        this.f9517t = downloadModel.getAppIcon();
        this.I = downloadModel.getMimeType();
        this.M = downloadEventConfig.getClickButtonTag();
        this.N = downloadEventConfig.getRefer();
        this.O = downloadEventConfig.isEnableV3Event();
        this.f9522y = downloadController.isEnableBackDialog();
        this.f9512o = downloadController.getLinkMode();
        this.f9513p = downloadController.getDownloadMode();
        this.U = downloadController.enableShowComplianceDialog();
        this.V = downloadController.isAutoDownloadOnCardShow();
        this.K = downloadController.enableNewActivity();
        this.f9498a = downloadController.enableAH();
        this.f9499b = downloadController.enableAM();
        this.f9521x = i5;
        long currentTimeMillis = System.currentTimeMillis();
        this.f9519v = currentTimeMillis;
        this.B = currentTimeMillis;
        this.J = downloadModel.shouldDownloadWithPatchApply();
        if (downloadModel instanceof AdDownloadModel) {
            this.ai = ((AdDownloadModel) downloadModel).getTaskKey();
        }
    }
}
