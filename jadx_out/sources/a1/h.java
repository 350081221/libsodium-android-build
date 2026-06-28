package a1;

import a1.n;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import y0.a;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: i, reason: collision with root package name */
    public static final String f116i = "failed";

    /* renamed from: j, reason: collision with root package name */
    public static final String f117j = "scheme_failed";

    /* renamed from: a, reason: collision with root package name */
    public Activity f118a;

    /* renamed from: b, reason: collision with root package name */
    public volatile IAlixPay f119b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f121d;

    /* renamed from: e, reason: collision with root package name */
    public f f122e;

    /* renamed from: f, reason: collision with root package name */
    public final y0.a f123f;

    /* renamed from: c, reason: collision with root package name */
    public final Object f120c = IAlixPay.class;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124g = false;

    /* renamed from: h, reason: collision with root package name */
    public String f125h = null;

    /* loaded from: classes2.dex */
    public class a implements APayEntranceActivity.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f126a;

        public a(Object obj) {
            this.f126a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            h.this.f125h = str;
            synchronized (this.f126a) {
                try {
                    this.f126a.notify();
                } finally {
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ APayEntranceActivity.a f128a;

        public b(APayEntranceActivity.a aVar) {
            this.f128a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f123f != null && !h.this.f123f.q()) {
                i0.a.i(h.this.f123f, i0.b.f16157l, i0.b.f16149e0, "");
                if (m0.a.J().D()) {
                    h.this.f123f.l(true);
                    this.f128a.a(g0.b.a());
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f130a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f131b;

        public c(Intent intent, Object obj) {
            this.f130a = intent;
            this.f131b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (h.this.f118a != null) {
                    h.this.f118a.startActivity(this.f130a);
                } else {
                    i0.a.i(h.this.f123f, i0.b.f16157l, i0.b.f16147c0, "");
                    Context a5 = h.this.f123f.a();
                    if (a5 != null) {
                        a5.startActivity(this.f130a);
                    }
                }
            } finally {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d extends IRemoteServiceCallback.Stub {
        public d() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z4, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            i0.a.d(h.this.f123f, i0.b.f16165p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (h.this.f122e != null) {
                    h.this.f122e.a();
                }
                if (h.this.f123f != null) {
                    h.this.f123f.o(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i5, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i5);
                intent.putExtras(bundle);
            } catch (Exception e5) {
                i0.a.e(h.this.f123f, i0.b.f16157l, i0.b.Z, e5);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                i0.a.d(h.this.f123f, i0.b.f16157l, "isFg", runningAppProcessInfo.processName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + runningAppProcessInfo.importance + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (Throwable unused) {
            }
            try {
                if (h.this.f118a != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    h.this.f118a.startActivity(intent);
                    i0.a.d(h.this.f123f, i0.b.f16157l, "stAct2", "" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    return;
                }
                i0.a.i(h.this.f123f, i0.b.f16157l, i0.b.f16145a0, "");
                Context a5 = h.this.f123f.a();
                if (a5 != null) {
                    a5.startActivity(intent);
                }
            } catch (Throwable th) {
                i0.a.e(h.this.f123f, i0.b.f16157l, i0.b.f16146b0, th);
                throw th;
            }
        }

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i0.a.c(h.this.f123f, i0.b.f16157l, "srvCon");
            synchronized (h.this.f120c) {
                h.this.f119b = IAlixPay.Stub.asInterface(iBinder);
                h.this.f120c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i0.a.c(h.this.f123f, i0.b.f16157l, "srvDis");
            h.this.f119b = null;
        }

        public /* synthetic */ e(h hVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a();

        void b();
    }

    public h(Activity activity, y0.a aVar, f fVar) {
        this.f118a = activity;
        this.f123f = aVar;
        this.f122e = fVar;
        a1.e.i(k0.a.A, "alipaySdk");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.String, java.lang.Boolean> a(java.lang.String r18, java.lang.String r19, y0.a r20) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.a(java.lang.String, java.lang.String, y0.a):android.util.Pair");
    }

    private String d(String str, String str2) {
        JSONObject jSONObject;
        Object obj = new Object();
        String j5 = n.j(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i0.a.d(this.f123f, i0.b.f16157l, "BSAStart", j5 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + elapsedRealtime);
        a.C0667a.d(this.f123f, j5);
        a aVar = new a(obj);
        APayEntranceActivity.f2950h.put(j5, aVar);
        try {
            HashMap<String, String> f5 = y0.a.f(this.f123f);
            f5.put("ts_intent", String.valueOf(elapsedRealtime));
            jSONObject = new JSONObject(f5);
        } catch (Throwable th) {
            try {
                i0.a.e(this.f123f, i0.b.f16157l, "BSALocEx", th);
                jSONObject = null;
            } catch (InterruptedException e5) {
                i0.a.e(this.f123f, i0.b.f16157l, "BSAWaiting", e5);
                g0.c cVar = g0.c.PAY_WAITTING;
                return g0.b.b(cVar.b(), cVar.a(), "");
            } catch (Throwable th2) {
                i0.a.e(this.f123f, i0.b.f16157l, "BSAEx", th2);
                n.u("alipaySdk", k0.b.f19036q, this.f118a, this.f123f);
                return f117j;
            }
        }
        Intent intent = new Intent(this.f118a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra(APayEntranceActivity.f2946d, str);
        intent.putExtra(APayEntranceActivity.f2947e, str2);
        intent.putExtra(APayEntranceActivity.f2948f, j5);
        if (jSONObject != null) {
            intent.putExtra(APayEntranceActivity.f2949g, jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(aVar), m0.a.J().s());
        Activity activity = this.f118a;
        y0.a aVar2 = this.f123f;
        i0.a.b(activity, aVar2, str, aVar2.f22662d);
        if (m0.a.J().G()) {
            new Handler(Looper.getMainLooper()).post(new c(intent, obj));
        } else {
            try {
                Activity activity2 = this.f118a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    i0.a.i(this.f123f, i0.b.f16157l, i0.b.f16145a0, "");
                    Context a5 = this.f123f.a();
                    if (a5 != null) {
                        a5.startActivity(intent);
                    }
                }
            } catch (Throwable th3) {
                i0.a.e(this.f123f, i0.b.f16157l, i0.b.f16146b0, th3);
                throw th3;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.f125h;
        String str4 = "unknown";
        try {
            String str5 = l.d(this.f123f, str3).get(l.f146a);
            if (str5 == null) {
                str4 = "null";
            } else {
                str4 = str5;
            }
        } catch (Throwable th4) {
            i0.a.e(this.f123f, i0.b.f16157l, "BSAStatEx", th4);
        }
        i0.a.c(this.f123f, i0.b.f16157l, "BSADone-" + str4);
        if (TextUtils.isEmpty(str3)) {
            i0.a.c(this.f123f, i0.b.f16157l, "BSAEmpty");
            return f117j;
        }
        return str3;
    }

    private String e(String str, String str2, PackageInfo packageInfo) {
        String str3;
        if (packageInfo != null) {
            str3 = packageInfo.versionName;
        } else {
            str3 = "";
        }
        a1.e.i(k0.a.A, "pay payInvokeAct");
        i0.a.d(this.f123f, i0.b.f16157l, i0.b.X, str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3);
        Activity activity = this.f118a;
        y0.a aVar = this.f123f;
        i0.a.b(activity, aVar, str, aVar.f22662d);
        return d(str, str2);
    }

    private String f(String str, String str2, PackageInfo packageInfo, n.c cVar) {
        int i5;
        String str3;
        Activity activity;
        boolean z4 = false;
        if (packageInfo != null) {
            i5 = packageInfo.versionCode;
        } else {
            i5 = 0;
        }
        a1.e.i(k0.a.A, "pay bind or scheme");
        y0.a aVar = this.f123f;
        if (aVar != null && !TextUtils.isEmpty(aVar.f22665g)) {
            z4 = this.f123f.f22665g.toLowerCase().contains(i0.b.f16161n);
        }
        if (!z4 && n.R(this.f123f, str2)) {
            if (cVar != null) {
                try {
                    if (m0.a.J().H()) {
                        j(cVar);
                    }
                } catch (Throwable unused) {
                }
            }
            i0.a.c(this.f123f, i0.b.f16157l, "BindSkipByL");
            str3 = f116i;
        } else {
            if (cVar != null) {
                try {
                    if (!m0.a.J().x()) {
                        j(cVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            Pair<String, Boolean> a5 = a(str, str2, this.f123f);
            str3 = (String) a5.first;
            try {
                if (f116i.equals(str3) && ((Boolean) a5.second).booleanValue() && m0.a.J().v()) {
                    i0.a.c(this.f123f, i0.b.f16157l, "BindRetry");
                    str3 = (String) a(str, str2, this.f123f).first;
                }
            } catch (Throwable th) {
                i0.a.e(this.f123f, i0.b.f16157l, "BindRetryEx", th);
            }
        }
        a1.e.i(k0.a.A, "pay bind result: " + str3);
        Activity activity2 = this.f118a;
        y0.a aVar2 = this.f123f;
        i0.a.b(activity2, aVar2, str, aVar2.f22662d);
        if (f116i.equals(str3)) {
            if (!n.f151b.equals(str2)) {
                i0.a.d(this.f123f, i0.b.f16157l, "BSPNotStartByAlipay", str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i5);
                return str3;
            }
            if (i5 >= 460 && !z4 && (activity = this.f118a) != null && k(str2, activity, this.f123f)) {
                return e(str, str2, packageInfo);
            }
        }
        return str3;
    }

    private void j(n.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.f163a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f118a.startActivity(intent);
        } catch (Throwable th) {
            i0.a.e(this.f123f, i0.b.f16157l, i0.b.f16151g0, th);
        }
        Thread.sleep(200L);
    }

    public static boolean k(String str, Context context, y0.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
                i0.a.c(aVar, i0.b.f16157l, "BSADetectFail");
                return false;
            }
            return true;
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, "BSADetectFail", th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #2 {all -> 0x00ab, blocks: (B:12:0x0023, B:14:0x002b, B:17:0x0033, B:20:0x003c, B:23:0x0042, B:26:0x004b, B:27:0x0054, B:30:0x0059, B:32:0x0063, B:73:0x0050), top: B:11:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String g(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 0
            m0.a r2 = m0.a.J()     // Catch: java.lang.Throwable -> Lae
            java.util.List r2 = r2.t()     // Catch: java.lang.Throwable -> Lae
            m0.a r3 = m0.a.J()     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.f20771g     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L15
            if (r2 != 0) goto L17
        L15:
            java.util.List<m0.a$b> r2 = g0.a.f16089d     // Catch: java.lang.Throwable -> Lae
        L17:
            y0.a r3 = r8.f123f     // Catch: java.lang.Throwable -> Lae
            android.app.Activity r4 = r8.f118a     // Catch: java.lang.Throwable -> Lae
            a1.n$c r2 = a1.n.f(r3, r4, r2)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "failed"
            if (r2 == 0) goto Lad
            y0.a r4 = r8.f123f     // Catch: java.lang.Throwable -> Lab
            boolean r4 = r2.b(r4)     // Catch: java.lang.Throwable -> Lab
            if (r4 != 0) goto Lad
            boolean r4 = r2.a()     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L33
            goto Lad
        L33:
            android.content.pm.PackageInfo r4 = r2.f163a     // Catch: java.lang.Throwable -> Lab
            boolean r4 = a1.n.w(r4)     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto L3c
            return r3
        L3c:
            android.content.pm.PackageInfo r3 = r2.f163a     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L50
            java.lang.String r4 = "com.eg.android.AlipayGphone"
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> Lab
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L4b
            goto L50
        L4b:
            android.content.pm.PackageInfo r3 = r2.f163a     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r3.packageName     // Catch: java.lang.Throwable -> Lab
            goto L54
        L50:
            java.lang.String r0 = a1.n.D()     // Catch: java.lang.Throwable -> Lab
        L54:
            android.content.pm.PackageInfo r3 = r2.f163a     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto L59
            r1 = r3
        L59:
            m0.a r3 = m0.a.J()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = r3.m()     // Catch: java.lang.Throwable -> Lab
            if (r3 == 0) goto Lb9
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lab
            if (r4 <= 0) goto Lb9
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb9
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONObject r3 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto Lb9
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lb9
            if (r4 <= 0) goto Lb9
            java.util.Iterator r4 = r3.keys()     // Catch: java.lang.Throwable -> Lb9
        L7e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb9
            int r6 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L7e
            int r7 = r1.versionCode     // Catch: java.lang.Throwable -> Lb9
            if (r7 < r6) goto L7e
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            m0.a r6 = m0.a.J()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            android.app.Activity r7 = r8.f118a     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            boolean r5 = r6.k(r7, r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            r8.f124g = r5     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb9
            if (r5 == 0) goto L7e
            goto Lb9
        Lab:
            r3 = move-exception
            goto Lb0
        Lad:
            return r3
        Lae:
            r3 = move-exception
            r2 = r1
        Lb0:
            y0.a r4 = r8.f123f
            java.lang.String r5 = "biz"
            java.lang.String r6 = "CheckClientSignEx"
            i0.a.e(r4, r5, r6, r3)
        Lb9:
            y0.a r3 = r8.f123f
            boolean r3 = a1.n.J(r3)
            if (r10 != 0) goto Lc5
            boolean r10 = r8.f124g
            if (r10 == 0) goto Ld6
        Lc5:
            if (r3 != 0) goto Ld6
            android.app.Activity r10 = r8.f118a
            y0.a r3 = r8.f123f
            boolean r10 = k(r0, r10, r3)
            if (r10 == 0) goto Ld6
            java.lang.String r9 = r8.e(r9, r0, r1)
            return r9
        Ld6:
            java.lang.String r9 = r8.f(r9, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.g(java.lang.String, boolean):java.lang.String");
    }

    public void i() {
        this.f118a = null;
        this.f122e = null;
    }
}
