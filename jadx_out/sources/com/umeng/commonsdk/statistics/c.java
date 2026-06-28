package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.bu;
import com.umeng.analytics.pro.cj;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.d;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final int f13259b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f13260c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f13261d = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final String f13262o = "thtstart";

    /* renamed from: p, reason: collision with root package name */
    private static final String f13263p = "gkvc";

    /* renamed from: q, reason: collision with root package name */
    private static final String f13264q = "ekvc";

    /* renamed from: a, reason: collision with root package name */
    String f13265a;

    /* renamed from: f, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.internal.c f13267f;

    /* renamed from: g, reason: collision with root package name */
    private ImprintHandler f13268g;

    /* renamed from: h, reason: collision with root package name */
    private e f13269h;

    /* renamed from: i, reason: collision with root package name */
    private ImprintHandler.a f13270i;

    /* renamed from: k, reason: collision with root package name */
    private Defcon f13272k;

    /* renamed from: l, reason: collision with root package name */
    private long f13273l;

    /* renamed from: m, reason: collision with root package name */
    private int f13274m;

    /* renamed from: n, reason: collision with root package name */
    private int f13275n;

    /* renamed from: r, reason: collision with root package name */
    private Context f13276r;

    /* renamed from: e, reason: collision with root package name */
    private final int f13266e = 1;

    /* renamed from: j, reason: collision with root package name */
    private ABTest f13271j = null;

    public c(Context context) {
        this.f13269h = null;
        this.f13270i = null;
        this.f13272k = null;
        this.f13273l = 0L;
        this.f13274m = 0;
        this.f13275n = 0;
        this.f13265a = null;
        this.f13276r = context;
        this.f13270i = ImprintHandler.getImprintService(context).c();
        this.f13272k = Defcon.getService(this.f13276r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f13276r);
        this.f13273l = sharedPreferences.getLong(f13262o, 0L);
        this.f13274m = sharedPreferences.getInt(f13263p, 0);
        this.f13275n = sharedPreferences.getInt(f13264q, 0);
        this.f13265a = UMEnvelopeBuild.imprintProperty(this.f13276r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f13276r);
        this.f13268g = imprintService;
        imprintService.a(new d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.d
            public void onImprintChanged(ImprintHandler.a aVar) {
                c.this.f13272k.onImprintChanged(aVar);
                c cVar = c.this;
                cVar.f13265a = UMEnvelopeBuild.imprintProperty(cVar.f13276r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f13276r)) {
            this.f13269h = e.a(this.f13276r);
        }
        com.umeng.commonsdk.statistics.internal.c cVar = new com.umeng.commonsdk.statistics.internal.c(this.f13276r);
        this.f13267f = cVar;
        cVar.a(StatTracer.getInstance(this.f13276r));
    }

    public boolean a(File file) {
        String str;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            com.umeng.commonsdk.statistics.internal.a a5 = com.umeng.commonsdk.statistics.internal.a.a(this.f13276r);
            a5.e(name);
            boolean a6 = a5.a(name);
            boolean b5 = a5.b(name);
            boolean c5 = a5.c(name);
            boolean d5 = a5.d(name);
            String d6 = com.umeng.commonsdk.stateless.d.d(name);
            if (!TextUtils.isEmpty(d6)) {
                str = com.umeng.commonsdk.stateless.d.c(d6);
            } else if (d5) {
                str = UMServerURL.SILENT_HEART_BEAT;
            } else if (c5) {
                str = UMServerURL.ZCFG_PATH;
            } else {
                str = UMServerURL.PATH_ANALYTICS;
            }
            byte[] a7 = this.f13267f.a(byteArray, a6, c5, str);
            int a8 = a7 == null ? 1 : a(a7);
            if (UMConfigure.isDebugLog()) {
                if (d5 && a8 == 2) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "heart beat req: succeed.");
                } else if (c5 && a8 == 2) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Zero req: succeed.");
                } else if (b5 && a8 == 2) {
                    MLog.d("本次启动数据: 发送成功!");
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Send instant data: succeed.");
                } else if (a6 && a8 == 2) {
                    MLog.d("普通统计数据: 发送成功!");
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Send analytics data: succeed.");
                } else if (a8 == 2) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Inner req: succeed.");
                }
            }
            if (a8 == 2) {
                e eVar = this.f13269h;
                if (eVar != null) {
                    eVar.e();
                }
                StatTracer.getInstance(this.f13276r).saveSate();
                if (d5) {
                    String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f13276r, "iss", "");
                    if (!TextUtils.isEmpty(imprintProperty)) {
                        if ("1".equalsIgnoreCase(imprintProperty)) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 更新静默心跳最后一次成功请求时间.");
                            com.umeng.commonsdk.utils.c.a(this.f13276r, System.currentTimeMillis());
                        } else if ("0".equalsIgnoreCase(imprintProperty)) {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 静默模式 -> 正常模式。重置 last req time");
                            com.umeng.commonsdk.utils.c.a(this.f13276r, 0L);
                            com.umeng.commonsdk.utils.c.d(this.f13276r);
                        }
                    }
                }
            } else if (a8 == 3) {
                StatTracer.getInstance(this.f13276r).saveSate();
                if (c5) {
                    FieldManager.a().a(this.f13276r);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f13276r;
                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.f13138s, com.umeng.commonsdk.internal.b.a(context).a(), null);
                    return true;
                }
            }
            return a8 == 2;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f13276r, th);
            return false;
        }
    }

    private int a(byte[] bArr) {
        Response response = new Response();
        try {
            new bu(new cj.a()).a(response, bArr);
            if (response.resp_code == 1) {
                this.f13268g.b(response.getImprint());
                this.f13268g.d();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f13276r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
