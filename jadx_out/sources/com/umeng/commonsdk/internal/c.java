package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.bk;
import com.umeng.analytics.pro.bl;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.UMInnerManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements UMLogDataProtocol {

    /* renamed from: b, reason: collision with root package name */
    public static final String f13150b = "preInitInvokedFlag";

    /* renamed from: c, reason: collision with root package name */
    public static final String f13151c = "policyGrantInvokedFlag";

    /* renamed from: d, reason: collision with root package name */
    public static final String f13152d = "policyGrantResult";

    /* renamed from: f, reason: collision with root package name */
    private static int f13153f = 1;

    /* renamed from: e, reason: collision with root package name */
    private Context f13161e;

    /* renamed from: a, reason: collision with root package name */
    public static final String f13149a = au.b().b(au.f12209q);

    /* renamed from: g, reason: collision with root package name */
    private static Class<?> f13154g = null;

    /* renamed from: h, reason: collision with root package name */
    private static Method f13155h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Method f13156i = null;

    /* renamed from: j, reason: collision with root package name */
    private static Method f13157j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f13158k = "";

    /* renamed from: l, reason: collision with root package name */
    private static volatile String f13159l = "";

    /* renamed from: m, reason: collision with root package name */
    private static boolean f13160m = false;

    static {
        c();
    }

    public c(Context context) {
        if (context != null) {
            this.f13161e = context.getApplicationContext();
        }
    }

    public static String b() {
        Method method;
        if (!TextUtils.isEmpty(f13159l)) {
            return f13159l;
        }
        Class<?> cls = f13154g;
        if (cls == null || (method = f13155h) == null || f13157j == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return "";
            }
            String str = (String) f13157j.invoke(invoke, new Object[0]);
            try {
                f13159l = str;
            } catch (Throwable unused) {
            }
            return str;
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static void c() {
        try {
            f13154g = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f13155h = declaredMethod;
            }
            Method declaredMethod2 = f13154g.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f13156i = declaredMethod2;
            }
            Method declaredMethod3 = f13154g.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f13157j = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        bk a5 = bk.a(this.f13161e);
        bl a6 = a5.a(bm.f12335c);
        if (a6 != null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = a6.f12327a;
                String str2 = a6.f12328b;
                JSONObject a7 = new com.umeng.commonsdk.statistics.b().a(this.f13161e.getApplicationContext(), new JSONObject(a6.f12329c), new JSONObject(a6.f12330d), a6.f12331e, str2, a6.f12332f);
                if (a7 != null && a7.has("exception")) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                }
                a5.a(bm.f12335c, str);
                a5.b();
            } catch (Throwable unused) {
            }
        }
    }

    private void e() {
        if (!f13160m) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                f13160m = true;
                a(this.f13161e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                    public void onGetOaid(String str) {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (TextUtils.isEmpty(str)) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                            return;
                        }
                        try {
                            SharedPreferences sharedPreferences = c.this.f13161e.getSharedPreferences(h.f13332a, 0);
                            if (sharedPreferences != null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putString(h.f13333b, str);
                                edit.commit();
                            }
                        } catch (Throwable unused) {
                        }
                        UMWorkDispatch.sendEvent(c.this.f13161e, a.f13142w, b.a(c.this.f13161e).a(), null);
                    }
                });
                return;
            }
            return;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        f13160m = false;
    }

    private void f() {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            f13160m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.f13161e);
            f13153f++;
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (c.this.f13161e != null) {
                        UMWorkDispatch.sendEvent(c.this.f13161e, a.f13143x, b.a(c.this.f13161e).a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            a(this.f13161e, true);
        }
    }

    private void g() {
        if (f13153f <= 0) {
            h();
            e(this.f13161e);
        }
    }

    private void h() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f13161e)) {
            f(this.f13161e);
            UMInnerManager.sendInnerPackage(this.f13161e);
            if (!FieldManager.allow(com.umeng.commonsdk.utils.d.ar) && SdkVersion.SDK_TYPE == 0 && UMUtils.isMainProgress(this.f13161e)) {
                Context context = this.f13161e;
                UMWorkDispatch.sendEvent(context, a.G, b.a(context).a(), null, 5000L);
            }
            Context context2 = this.f13161e;
            UMWorkDispatch.sendEvent(context2, o.a.f12716z, CoreProtocol.getInstance(context2), null);
            Context context3 = this.f13161e;
            UMWorkDispatch.sendEvent(context3, a.f13139t, b.a(context3).a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j5) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02be A[Catch: all -> 0x0432, TryCatch #0 {all -> 0x0432, blocks: (B:22:0x008d, B:24:0x0095, B:26:0x00a4, B:27:0x00a7, B:28:0x00b2, B:49:0x0114, B:53:0x0146, B:60:0x015e, B:62:0x017a, B:64:0x0180, B:65:0x0190, B:67:0x01bb, B:73:0x01c5, B:75:0x01c9, B:77:0x01dd, B:102:0x027a, B:104:0x0291, B:106:0x029c, B:109:0x02a3, B:111:0x02a9, B:113:0x02b4, B:117:0x02be, B:119:0x02c4, B:121:0x02d0, B:123:0x02d7), top: B:19:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7 A[Catch: all -> 0x0432, TRY_LEAVE, TryCatch #0 {all -> 0x0432, blocks: (B:22:0x008d, B:24:0x0095, B:26:0x00a4, B:27:0x00a7, B:28:0x00b2, B:49:0x0114, B:53:0x0146, B:60:0x015e, B:62:0x017a, B:64:0x0180, B:65:0x0190, B:67:0x01bb, B:73:0x01c5, B:75:0x01c9, B:77:0x01dd, B:102:0x027a, B:104:0x0291, B:106:0x029c, B:109:0x02a3, B:111:0x02a9, B:113:0x02b4, B:117:0x02be, B:119:0x02c4, B:121:0x02d0, B:123:0x02d7), top: B:19:0x007b }] */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.workEvent(java.lang.Object, int):void");
    }

    public String a() {
        Method method;
        if (!TextUtils.isEmpty(f13158k)) {
            return f13158k;
        }
        Class<?> cls = f13154g;
        if (cls == null || (method = f13155h) == null || f13156i == null) {
            return "";
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return "";
            }
            String str = (String) f13156i.invoke(invoke, this.f13161e);
            try {
                f13158k = str;
            } catch (Throwable unused) {
            }
            return str;
        } catch (Throwable unused2) {
            return "";
        }
    }

    private void b(Context context) {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, bi.f12261g, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(bi.f12261g), imprintProperty);
            JSONObject buildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (buildSilentEnvelopeWithExtHeader != null && buildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(bi.f12278x), "Android");
            JSONObject buildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (buildZeroEnvelopeWithExtHeader != null && buildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    private void e(Context context) {
        Object invoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> a5 = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = a5.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (invoke = declaredMethod2.invoke(a5, new Object[0])) == null || (declaredMethod = a5.getDeclaredMethod("init", Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(invoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    private static void c(final Context context) {
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(h.f13332a, 0);
                        if (sharedPreferences != null && !sharedPreferences.getString(h.f13333b, "").equalsIgnoreCase(str)) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(h.f13333b, str);
                            edit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static void f(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + bm.f12344l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    public static void a(final Context context, final boolean z4) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(h.f13332a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String a5 = aw.a(context);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(a5) && sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(h.f13334c, (currentTimeMillis2 - currentTimeMillis) + "");
                        edit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(h.f13333b, a5);
                        edit2.commit();
                    }
                    if (z4) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(android.content.Context r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            java.lang.String r1 = "debugkey"
            java.lang.String r2 = com.umeng.common.b.a(r11, r0, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L8e
            java.lang.String r3 = "startTime"
            java.lang.String r3 = com.umeng.common.b.a(r11, r0, r3)
            java.lang.String r4 = "period"
            java.lang.String r0 = com.umeng.common.b.a(r11, r0, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L2e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r3 = r5
        L2f:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L3e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3e
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r7 = r5
        L3f:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r9 = "MobclickRT"
            if (r0 == 0) goto L84
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L4a
            goto L84
        L4a:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            r3 = 60
            long r7 = r7 * r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r3
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L6d
            java.lang.String r0 = "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。"
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r0)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
            boolean r11 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r11 == 0) goto L8e
            com.umeng.analytics.AnalyticsConfig.turnOffRealTimeDebug()
            goto L8e
        L6d:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r11.put(r1, r2)
            boolean r0 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r0 != 0) goto L8e
            java.lang.String r0 = "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。"
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r0)
            com.umeng.analytics.AnalyticsConfig.turnOnRealTimeDebug(r11)
            goto L8e
        L84:
            java.lang.String r0 = "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据"
            com.umeng.commonsdk.debug.UMRTLog.i(r9, r0)
            java.lang.String r0 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r11, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.c.d(android.content.Context):void");
    }

    private static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String a5 = aw.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(a5);
                }
            }
        }).start();
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
