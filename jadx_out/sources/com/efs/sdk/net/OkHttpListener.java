package com.efs.sdk.net;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.net.a.a;
import com.efs.sdk.net.a.b;
import com.efs.sdk.net.a.c;
import com.efs.sdk.net.a.d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import p4.l;
import p4.m;

/* loaded from: classes2.dex */
public class OkHttpListener extends EventListener {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f6769a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private String f6770b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6771c;

    /* renamed from: d, reason: collision with root package name */
    private List f6772d = new ArrayList();

    private void a(String str) {
        Map<String, Long> map;
        try {
            d c5 = a.a().c(this.f6770b);
            if (c5 == null || (map = c5.E) == null) {
                return;
            }
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        String str;
        try {
            final d c5 = a.a().c(this.f6770b);
            final c a5 = a.a().a(this.f6770b);
            if (c5 != null && a5 != null) {
                Map<String, Long> map = c5.E;
                Map<String, Long> map2 = c5.F;
                Log.i("NetTrace-Listener", a5.toString());
                if (!TextUtils.isEmpty(c5.B)) {
                    final EfsJSONLog efsJSONLog = new EfsJSONLog("netperf");
                    if (map.containsKey(d.f6814d)) {
                        efsJSONLog.put("wd_dns", map.get(d.f6814d));
                    }
                    if (map.containsKey(d.f6815e)) {
                        efsJSONLog.put("wd_dnstm", map.get(d.f6815e));
                    }
                    if (map2.containsKey(d.f6830t)) {
                        efsJSONLog.put("wl_dns", map2.get(d.f6830t));
                    }
                    if (map.containsKey(d.f6816f)) {
                        efsJSONLog.put("wd_tcp", map.get(d.f6816f));
                    }
                    if (map.containsKey(d.f6819i)) {
                        efsJSONLog.put("wd_tcptm", map.get(d.f6819i));
                    }
                    if (map2.containsKey(d.f6832v)) {
                        efsJSONLog.put("wl_tcp", map2.get(d.f6832v));
                    }
                    if (map.containsKey(d.f6817g)) {
                        efsJSONLog.put("wd_ssl", map.get(d.f6817g));
                    }
                    if (map.containsKey(d.f6818h)) {
                        efsJSONLog.put("wd_ssltm", map.get(d.f6818h));
                    }
                    if (map2.containsKey(d.f6831u)) {
                        efsJSONLog.put("wl_ssl", map2.get(d.f6831u));
                    }
                    if (map.containsKey(d.f6821k)) {
                        efsJSONLog.put("wd_ds", map.get(d.f6821k));
                    }
                    if (map.containsKey(d.f6824n)) {
                        efsJSONLog.put("wd_dstm", map.get(d.f6824n));
                    }
                    if (map2.containsKey(d.f6833w) && map2.containsKey(d.f6834x)) {
                        efsJSONLog.put("wl_ds", Long.valueOf(map2.get(d.f6833w).longValue() + map2.get(d.f6834x).longValue()));
                    }
                    if (map.containsKey(d.f6825o)) {
                        efsJSONLog.put("wd_srt", map.get(d.f6825o));
                    }
                    if (map.containsKey(d.f6828r)) {
                        efsJSONLog.put("wd_srttm", map.get(d.f6828r));
                    }
                    if (map2.containsKey(d.f6835y) && map2.containsKey(d.f6836z)) {
                        efsJSONLog.put("wl_srt", Long.valueOf(map2.get(d.f6835y).longValue() + map2.get(d.f6836z).longValue()));
                    }
                    String[] split = c5.B.split("\\?");
                    if (split != null) {
                        str = split[0];
                    } else {
                        str = null;
                    }
                    List list = this.f6772d;
                    if (list != null && str != null && !list.contains(str)) {
                        this.f6772d.add(str);
                        if (map.containsKey(d.f6824n)) {
                            efsJSONLog.put("wd_ttfb", map.get(d.f6824n));
                        } else if (map.containsKey(d.f6822l)) {
                            efsJSONLog.put("wd_ttfb", map.get(d.f6822l));
                        }
                        if (map.containsKey(d.f6825o)) {
                            efsJSONLog.put("wd_ttfbtm", map.get(d.f6825o));
                        }
                        if (map.containsKey(d.f6825o)) {
                            if (map.containsKey(d.f6824n)) {
                                efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.f6825o).longValue() - map.get(d.f6824n).longValue()));
                            } else if (map.containsKey(d.f6822l)) {
                                efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(d.f6825o).longValue() - map.get(d.f6822l).longValue()));
                            }
                        }
                    } else {
                        efsJSONLog.put("wd_ttfb", 0);
                        efsJSONLog.put("wd_ttfbtm", 0);
                        efsJSONLog.put("wl_ttfb", 0);
                    }
                    if (map.containsKey(d.f6811a)) {
                        efsJSONLog.put("wd_rt", map.get(d.f6811a));
                    }
                    if (map.containsKey(d.f6812b)) {
                        efsJSONLog.put("wd_rttm", map.get(d.f6812b));
                    }
                    if (map2.containsKey(d.f6829s)) {
                        efsJSONLog.put("wl_rt", map2.get(d.f6829s));
                    }
                    efsJSONLog.put("wk_res", c5.B);
                    efsJSONLog.put("wk_ip", c5.C);
                    efsJSONLog.put("wk_method", a5.f6805e);
                    efsJSONLog.put("wk_rc", Integer.valueOf(a5.f6808h));
                    efsJSONLog.put("wl_up", Long.valueOf(a5.f6806f));
                    efsJSONLog.put("wl_down", Long.valueOf(a5.f6810j));
                    efsJSONLog.put("wl_total", Long.valueOf(a5.f6806f + a5.f6810j));
                    b.a(new Runnable() { // from class: com.efs.sdk.net.OkHttpListener.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                try {
                                    if (NetManager.getNetConfigManager().getNetRequestBodyCollectState() && !TextUtils.isEmpty(a5.f6807g)) {
                                        String str2 = "";
                                        if (c5.E.containsKey(d.f6811a)) {
                                            str2 = String.valueOf(c5.E.get(d.f6811a));
                                        }
                                        efsJSONLog.put("wk_bd", com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(a5.f6807g.getBytes(), com.efs.sdk.net.b.a.a(str2 + ControllerCenter.getGlobalEnvStruct().getAppid() + ControllerCenter.getGlobalEnvStruct().getSecret()).getBytes())));
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                OkHttpListener.a(c5, a5, efsJSONLog);
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                    });
                    a.a().d(this.f6770b);
                    a.a().b(this.f6770b);
                    return;
                }
                Log.d("NetTrace-Listener", "url is null.");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static EventListener.Factory get() {
        return new EventListener.Factory() { // from class: com.efs.sdk.net.OkHttpListener.1
            @Override // okhttp3.EventListener.Factory
            @l
            public final EventListener create(@l Call call) {
                return new OkHttpListener();
            }
        };
    }

    @Override // okhttp3.EventListener
    public void callEnd(@l Call call) {
        super.callEnd(call);
        try {
            Log.d("NetTrace-Listener", "callEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callEnd net enable false.");
                return;
            }
            a(d.f6812b);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(@l Call call, @l IOException iOException) {
        super.callFailed(call, iOException);
        try {
            Log.d("NetTrace-Listener", "callFailed");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callFailed net enable false.");
                return;
            }
            a(d.f6813c);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(@l Call call) {
        super.callStart(call);
        try {
            Log.d("NetTrace-Listener", "callStart");
            if (NetManager.getNetConfigManager() != null && NetManager.getNetConfigManager().enableTracer()) {
                this.f6771c = true;
            }
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            this.f6770b = String.valueOf(f6769a.getAndIncrement());
            Log.i("NetTrace-Listener", "requestId is" + this.f6770b);
            a(d.f6811a);
            String httpUrl = call.request().url().toString();
            try {
                d c5 = a.a().c(this.f6770b);
                if (c5 != null) {
                    c5.B = httpUrl;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy, @m Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        try {
            Log.d("NetTrace-Listener", "connectEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectEnd net enable false.");
                return;
            }
            a(d.f6819i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy, @m Protocol protocol, @l IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        try {
            Log.d("NetTrace-Listener", "connectFailed");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectFailed net enable false.");
                return;
            }
            a(d.f6820j);
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        try {
            Log.d("NetTrace-Listener", "connectStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectStart net enable false.");
                return;
            }
            a(d.f6816f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@l Call call, @l Connection connection) {
        super.connectionAcquired(call, connection);
        try {
            Log.d("NetTrace-Listener", "connectionAcquired");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            InetAddress inetAddress = connection.socket().getInetAddress();
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                try {
                    d c5 = a.a().c(this.f6770b);
                    if (c5 != null) {
                        c5.C = hostAddress;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@l Call call, @l String str, @l List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        try {
            Log.d("NetTrace-Listener", "dnsEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsEnd net enable false.");
                return;
            }
            a(d.f6815e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@l Call call, @l String str) {
        super.dnsStart(call, str);
        try {
            Log.d("NetTrace-Listener", "dnsStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsStart net enable false.");
                return;
            }
            a(d.f6814d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@l Call call, long j5) {
        super.requestBodyEnd(call, j5);
        try {
            Log.d("NetTrace-Listener", "requestBodyEnd");
            call.request().body();
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyEnd net enable false.");
                return;
            }
            a(d.f6824n);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@l Call call) {
        super.requestBodyStart(call);
        try {
            Log.d("NetTrace-Listener", "requestBodyStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyStart net enable false.");
                return;
            }
            a(d.f6823m);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@l Call call, @l Request request) {
        super.requestHeadersEnd(call, request);
        try {
            Log.d("NetTrace-Listener", "requestHeadersEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersEnd net enable false.");
                return;
            }
            a(d.f6822l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@l Call call) {
        super.requestHeadersStart(call);
        try {
            Log.d("NetTrace-Listener", "requestHeadersStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersStart net enable false.");
                return;
            }
            a(d.f6821k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@l Call call, long j5) {
        super.responseBodyEnd(call, j5);
        try {
            Log.d("NetTrace-Listener", "responseBodyEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyEnd net enable false.");
                return;
            }
            a(d.f6828r);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@l Call call) {
        super.responseBodyStart(call);
        try {
            Log.d("NetTrace-Listener", "responseBodyStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyStart net enable false.");
                return;
            }
            a(d.f6827q);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@l Call call, @l Response response) {
        super.responseHeadersEnd(call, response);
        try {
            Log.d("NetTrace-Listener", "responseHeadersEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersEnd net enable false.");
                return;
            }
            a(d.f6826p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@l Call call) {
        super.responseHeadersStart(call);
        try {
            Log.d("NetTrace-Listener", "responseHeadersStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersStart net enable false.");
                return;
            }
            a(d.f6825o);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@l Call call, @m Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        try {
            Log.d("NetTrace-Listener", "secureConnectEnd");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectEnd net enable false.");
                return;
            }
            a(d.f6818h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@l Call call) {
        super.secureConnectStart(call);
        try {
            Log.d("NetTrace-Listener", "secureConnectStart");
            if (!this.f6771c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectStart net enable false.");
                return;
            }
            a(d.f6817g);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() {
        try {
            d c5 = a.a().c(this.f6770b);
            if (c5 != null) {
                Map<String, Long> map = c5.E;
                Map<String, Long> map2 = c5.F;
                map2.put(d.f6829s, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6811a, d.f6812b)));
                map2.put(d.f6830t, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6814d, d.f6815e)));
                map2.put(d.f6831u, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6817g, d.f6818h)));
                map2.put(d.f6832v, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6816f, d.f6819i)));
                map2.put(d.f6833w, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6821k, d.f6822l)));
                map2.put(d.f6834x, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6823m, d.f6824n)));
                map2.put(d.f6835y, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6825o, d.f6826p)));
                map2.put(d.f6836z, Long.valueOf(com.efs.sdk.net.b.a.a(map, d.f6827q, d.f6828r)));
                b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(EfsJSONLog efsJSONLog) {
        try {
            EfsReporter reporter = NetManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                if (SamplingWhiteListUtil.isHitWL()) {
                    return;
                }
                SharedPreferences sharedPreferences = ControllerCenter.getGlobalEnvStruct().mAppContext.getSharedPreferences("net_launch" + ProcessUtil.getCurrentProcessName(), 0);
                String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(System.currentTimeMillis()));
                if (sharedPreferences != null) {
                    int i5 = sharedPreferences.getInt(format, 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit != null) {
                        edit.putInt(format, i5 + 1);
                        edit.apply();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static String a(Map<String, String> map, boolean z4, boolean z5) {
        try {
            StringBuilder sb = new StringBuilder();
            if (!SamplingWhiteListUtil.isHitWL()) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(NetManager.getNetConfigManager().getExtraRateFlag());
            if (map.size() == 0) {
                sb.append("|0");
            } else if (z4) {
                sb.append("|0");
            } else if (z5) {
                sb.append("|1");
            } else {
                sb.append("|0");
            }
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(new JSONObject(map).toString());
            return com.efs.sdk.net.b.a.a(com.efs.sdk.net.b.a.a(sb.toString().getBytes(), ControllerCenter.getGlobalEnvStruct().getSecret().getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x012c, code lost:
    
        if (java.util.regex.Pattern.matches(r12, r16.B) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:23:0x008d, B:46:0x0094, B:48:0x00a4, B:51:0x00ab, B:53:0x00b1, B:55:0x00bd, B:57:0x00ca, B:59:0x00d3, B:63:0x00e4, B:64:0x011b, B:67:0x012e, B:70:0x0139, B:75:0x0161, B:77:0x0176, B:80:0x0147, B:82:0x0151, B:86:0x0104, B:87:0x0126, B:91:0x017b), top: B:22:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.efs.sdk.net.a.d r16, com.efs.sdk.net.a.c r17, com.efs.sdk.base.protocol.record.EfsJSONLog r18) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.OkHttpListener.a(com.efs.sdk.net.a.d, com.efs.sdk.net.a.c, com.efs.sdk.base.protocol.record.EfsJSONLog):void");
    }
}
