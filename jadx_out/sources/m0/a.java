package m0;

import a1.e;
import a1.j;
import a1.n;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static final String A = "DynCon";
    public static final int B = 10000;
    public static final String C = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final int D = 10;
    public static final boolean E = true;
    public static final boolean F = false;
    public static final boolean G = true;
    public static final boolean H = true;
    public static final boolean I = false;
    public static final boolean J = false;
    public static final boolean K = false;
    public static final boolean L = false;
    public static final boolean M = true;
    public static final String N = "";
    public static final boolean O = false;
    public static final boolean P = false;
    public static final int Q = 1000;
    public static final boolean R = true;
    public static final String S = "";
    public static final boolean T = false;
    public static final boolean U = false;
    public static final int V = 1000;
    public static final int W = 20000;
    public static final boolean X = false;
    public static final String Y = "alipay_cashier_dynamic_config";
    public static final String Z = "timeout";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f20740a0 = "h5_port_degrade";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f20741b0 = "st_sdk_config";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f20742c0 = "tbreturl";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f20743d0 = "launchAppSwitch";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f20744e0 = "configQueryInterval";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f20745f0 = "deg_log_mcgw";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f20746g0 = "deg_start_srv_first";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f20747h0 = "prev_jump_dual";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f20748i0 = "bind_use_imp";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f20749j0 = "retry_bnd_once";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f20750k0 = "skip_trans";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f20751l0 = "start_trans";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f20752m0 = "up_before_pay";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f20753n0 = "lck_k";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f20754o0 = "use_sc_lck_a";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f20755p0 = "utdid_factor";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f20756q0 = "cfg_max_time";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f20757r0 = "get_oa_id";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f20758s0 = "notifyFailApp";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f20759t0 = "startactivity_in_ui_thread";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f20760u0 = "intercept_batch";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f20761v0 = "bind_with_startActivity";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f20762w0 = "enableStartActivityFallback";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f20763x0 = "enableBindExFallback";

    /* renamed from: y0, reason: collision with root package name */
    public static a f20764y0;

    /* renamed from: w, reason: collision with root package name */
    public JSONObject f20787w;

    /* renamed from: a, reason: collision with root package name */
    public int f20765a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20766b = false;

    /* renamed from: c, reason: collision with root package name */
    public String f20767c = C;

    /* renamed from: d, reason: collision with root package name */
    public int f20768d = 10;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20769e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20770f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20771g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20772h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20773i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20774j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20775k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20776l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20777m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20778n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20779o = true;

    /* renamed from: p, reason: collision with root package name */
    public String f20780p = "";

    /* renamed from: q, reason: collision with root package name */
    public String f20781q = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f20782r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20783s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20784t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f20785u = 1000;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20786v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20788x = true;

    /* renamed from: y, reason: collision with root package name */
    public List<b> f20789y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f20790z = -1;

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0621a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y0.a f20791a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f20792b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f20793c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f20794d;

        public RunnableC0621a(y0.a aVar, Context context, boolean z4, int i5) {
            this.f20791a = aVar;
            this.f20792b = context;
            this.f20793c = z4;
            this.f20794d = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                s0.b h5 = new u0.b().h(this.f20791a, this.f20792b);
                if (h5 != null) {
                    a.this.i(this.f20791a, h5.a());
                    a.this.g(y0.a.w());
                    i0.a.c(this.f20791a, i0.b.f16157l, "offcfg|" + this.f20793c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f20794d);
                }
            } catch (Throwable th) {
                e.d(th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f20796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20797b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20798c;

        public b(String str, int i5, String str2) {
            this.f20796a = str;
            this.f20797b = i5;
            this.f20798c = str2;
        }

        public static List<b> a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                b b5 = b(jSONArray.optJSONObject(i5));
                if (b5 != null) {
                    arrayList.add(b5);
                }
            }
            return arrayList;
        }

        public static b b(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString(d.S));
        }

        public static JSONArray c(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(d(it.next()));
            }
            return jSONArray;
        }

        public static JSONObject d(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.f20796a).put("v", bVar.f20797b).put(d.S, bVar.f20798c);
            } catch (JSONException e5) {
                e.d(e5);
                return null;
            }
        }

        public String toString() {
            return String.valueOf(d(this));
        }
    }

    private int I() {
        return this.f20785u;
    }

    public static a J() {
        if (f20764y0 == null) {
            a aVar = new a();
            f20764y0 = aVar;
            aVar.A();
        }
        return f20764y0;
    }

    private JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Z, s());
        jSONObject.put(f20740a0, F());
        jSONObject.put(f20742c0, y());
        jSONObject.put(f20744e0, n());
        jSONObject.put(f20743d0, b.c(t()));
        jSONObject.put(f20760u0, q());
        jSONObject.put(f20745f0, o());
        jSONObject.put(f20746g0, p());
        jSONObject.put(f20747h0, u());
        jSONObject.put(f20748i0, l());
        jSONObject.put(f20749j0, v());
        jSONObject.put(f20750k0, x());
        jSONObject.put(f20751l0, H());
        jSONObject.put(f20752m0, z());
        jSONObject.put(f20754o0, w());
        jSONObject.put(f20753n0, r());
        jSONObject.put(f20761v0, m());
        jSONObject.put(f20756q0, I());
        jSONObject.put(f20757r0, E());
        jSONObject.put(f20758s0, C());
        jSONObject.put(f20762w0, D());
        jSONObject.put(f20763x0, B());
        jSONObject.put(f20759t0, G());
        jSONObject.put(a1.a.f88b, b());
        return jSONObject;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            f(new JSONObject(str));
        } catch (Throwable th) {
            e.d(th);
        }
    }

    private void f(JSONObject jSONObject) {
        this.f20765a = jSONObject.optInt(Z, 10000);
        this.f20766b = jSONObject.optBoolean(f20740a0, false);
        this.f20767c = jSONObject.optString(f20742c0, C).trim();
        this.f20768d = jSONObject.optInt(f20744e0, 10);
        this.f20789y = b.a(jSONObject.optJSONArray(f20743d0));
        this.f20769e = jSONObject.optBoolean(f20760u0, true);
        this.f20772h = jSONObject.optBoolean(f20745f0, false);
        this.f20773i = jSONObject.optBoolean(f20746g0, true);
        this.f20774j = jSONObject.optBoolean(f20747h0, true);
        this.f20775k = jSONObject.optBoolean(f20748i0, false);
        this.f20776l = jSONObject.optBoolean(f20749j0, false);
        this.f20777m = jSONObject.optBoolean(f20750k0, false);
        this.f20778n = jSONObject.optBoolean(f20751l0, false);
        this.f20779o = jSONObject.optBoolean(f20752m0, true);
        this.f20780p = jSONObject.optString(f20753n0, "");
        this.f20784t = jSONObject.optBoolean(f20754o0, false);
        this.f20786v = jSONObject.optBoolean(f20758s0, false);
        this.f20781q = jSONObject.optString(f20761v0, "");
        this.f20785u = jSONObject.optInt(f20756q0, 1000);
        this.f20788x = jSONObject.optBoolean(f20757r0, true);
        this.f20782r = jSONObject.optBoolean(f20762w0, false);
        this.f20783s = jSONObject.optBoolean(f20763x0, false);
        this.f20770f = jSONObject.optBoolean(f20759t0, false);
        this.f20787w = jSONObject.optJSONObject(a1.a.f88b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(y0.a aVar) {
        try {
            JSONObject a5 = a();
            j.e(aVar, y0.b.e().c(), Y, a5.toString());
        } catch (Exception e5) {
            e.d(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(y0.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(f20741b0);
            a1.a.e(aVar, optJSONObject, a1.a.c(aVar, jSONObject));
            if (optJSONObject != null) {
                f(optJSONObject);
            } else {
                e.j(A, "empty config");
            }
        } catch (Throwable th) {
            e.d(th);
        }
    }

    public void A() {
        Context c5 = y0.b.e().c();
        String b5 = j.b(y0.a.w(), c5, Y, null);
        try {
            this.f20790z = Integer.parseInt(j.b(y0.a.w(), c5, f20755p0, "-1"));
        } catch (Exception unused) {
        }
        c(b5);
    }

    public boolean B() {
        return this.f20783s;
    }

    public boolean C() {
        return this.f20786v;
    }

    public boolean D() {
        return this.f20782r;
    }

    public boolean E() {
        return this.f20788x;
    }

    public boolean F() {
        return this.f20766b;
    }

    public boolean G() {
        return this.f20770f;
    }

    public boolean H() {
        return this.f20778n;
    }

    public JSONObject b() {
        return this.f20787w;
    }

    public void h(y0.a aVar, Context context, boolean z4, int i5) {
        i0.a.c(aVar, i0.b.f16157l, "oncfg|" + z4 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i5);
        RunnableC0621a runnableC0621a = new RunnableC0621a(aVar, context, z4, i5);
        if (z4 && !n.d0()) {
            int I2 = I();
            if (!n.v(I2, runnableC0621a, "AlipayDCPBlok")) {
                i0.a.i(aVar, i0.b.f16157l, i0.b.f16160m0, "" + I2);
                return;
            }
            return;
        }
        Thread thread = new Thread(runnableC0621a);
        thread.setName("AlipayDCP");
        thread.start();
    }

    public void j(boolean z4) {
        this.f20771g = z4;
    }

    public boolean k(Context context, int i5) {
        if (this.f20790z == -1) {
            this.f20790z = n.a();
            j.e(y0.a.w(), context, f20755p0, String.valueOf(this.f20790z));
        }
        if (this.f20790z < i5) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.f20775k;
    }

    public String m() {
        return this.f20781q;
    }

    public int n() {
        return this.f20768d;
    }

    public boolean o() {
        return this.f20772h;
    }

    public boolean p() {
        return this.f20773i;
    }

    public boolean q() {
        return this.f20769e;
    }

    public String r() {
        return this.f20780p;
    }

    public int s() {
        int i5 = this.f20765a;
        if (i5 >= 1000 && i5 <= 20000) {
            e.g(A, "time = " + this.f20765a);
            return this.f20765a;
        }
        e.g(A, "time(def) = 10000");
        return 10000;
    }

    public List<b> t() {
        return this.f20789y;
    }

    public boolean u() {
        return this.f20774j;
    }

    public boolean v() {
        return this.f20776l;
    }

    public boolean w() {
        return this.f20784t;
    }

    public boolean x() {
        return this.f20777m;
    }

    public String y() {
        return this.f20767c;
    }

    public boolean z() {
        return this.f20779o;
    }
}
