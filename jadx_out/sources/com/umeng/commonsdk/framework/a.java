package com.umeng.commonsdk.framework;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class a implements UMImprintChangeCallback {

    /* renamed from: a, reason: collision with root package name */
    private static HandlerThread f13094a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f13095b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Handler f13096c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final int f13097d = 200;

    /* renamed from: e, reason: collision with root package name */
    private static final int f13098e = 273;

    /* renamed from: f, reason: collision with root package name */
    private static final int f13099f = 274;

    /* renamed from: g, reason: collision with root package name */
    private static final int f13100g = 512;

    /* renamed from: h, reason: collision with root package name */
    private static final int f13101h = 769;

    /* renamed from: i, reason: collision with root package name */
    private static FileObserverC0244a f13102i = null;

    /* renamed from: j, reason: collision with root package name */
    private static ConnectivityManager f13103j = null;

    /* renamed from: k, reason: collision with root package name */
    private static IntentFilter f13104k = null;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f13105l = false;

    /* renamed from: m, reason: collision with root package name */
    private static ArrayList<UMSenderStateNotify> f13106m = null;

    /* renamed from: p, reason: collision with root package name */
    private static final String f13109p = "report_policy";

    /* renamed from: q, reason: collision with root package name */
    private static final String f13110q = "report_interval";

    /* renamed from: s, reason: collision with root package name */
    private static final int f13112s = 15;

    /* renamed from: t, reason: collision with root package name */
    private static final int f13113t = 3;

    /* renamed from: u, reason: collision with root package name */
    private static final int f13114u = 90;

    /* renamed from: x, reason: collision with root package name */
    private static BroadcastReceiver f13117x;

    /* renamed from: n, reason: collision with root package name */
    private static Object f13107n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static ReentrantLock f13108o = new ReentrantLock();

    /* renamed from: r, reason: collision with root package name */
    private static boolean f13111r = false;

    /* renamed from: v, reason: collision with root package name */
    private static int f13115v = 15;

    /* renamed from: w, reason: collision with root package name */
    private static Object f13116w = new Object();

    /* renamed from: com.umeng.commonsdk.framework.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class FileObserverC0244a extends FileObserver {
        public FileObserverC0244a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i5, String str) {
            if ((i5 & 8) == 8) {
                ULog.d("--->>> envelope file created >>> " + str);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
                a.c(273);
            }
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f13103j = (ConnectivityManager) appContext.getSystemService("connectivity");
        }
        f13117x = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    UMWorkDispatch.sendEvent(context, com.umeng.commonsdk.internal.a.E, b.a(context).a(), null);
                }
            }
        };
    }

    public a(Context context, Handler handler) {
        if (f13103j == null) {
            Context appContext = UMGlobalContext.getAppContext();
            if (f13103j != null) {
                f13103j = (ConnectivityManager) appContext.getSystemService("connectivity");
            }
        }
        f13096c = handler;
        try {
            if (f13094a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f13094a = handlerThread;
                handlerThread.start();
                if (f13102i == null) {
                    FileObserverC0244a fileObserverC0244a = new FileObserverC0244a(UMFrUtils.getEnvelopeDirPath(context));
                    f13102i = fileObserverC0244a;
                    fileObserverC0244a.startWatching();
                    ULog.d("--->>> FileMonitor has already started!");
                }
                j();
                if (f13095b == null) {
                    f13095b = new Handler(f13094a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.3
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i5 = message.what;
                            if (i5 != 273) {
                                if (i5 != a.f13099f) {
                                    if (i5 == 512) {
                                        a.m();
                                        return;
                                    }
                                    return;
                                }
                                a.l();
                                return;
                            }
                            ULog.d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                            try {
                                a.f13108o.tryLock(1L, TimeUnit.SECONDS);
                                try {
                                    a.n();
                                } catch (Throwable unused) {
                                }
                                a.f13108o.unlock();
                            } catch (Throwable unused2) {
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f13109p, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f13110q, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static int b() {
        int i5;
        synchronized (f13116w) {
            i5 = f13115v;
        }
        return i5;
    }

    public static void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i5) {
        Handler handler;
        if (f13105l && (handler = f13095b) != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i5;
            f13095b.sendMessage(obtainMessage);
        }
    }

    public static void d() {
        if (f13108o.tryLock()) {
            try {
                b(273);
            } finally {
                f13108o.unlock();
            }
        }
    }

    public static void e() {
        a(f13099f, 3000);
    }

    private void j() {
        synchronized (f13116w) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f13109p, ""))) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f13111r = true;
                f13115v = 15;
                int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f13110q, "15")).intValue();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 3 && intValue <= 90) {
                    f13115v = intValue * 1000;
                }
                f13115v = 15;
            } else {
                f13111r = false;
            }
        }
    }

    private static void k() {
        if (f13094a != null) {
            f13094a = null;
        }
        if (f13095b != null) {
            f13095b = null;
        }
        if (f13096c != null) {
            f13096c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        int size;
        synchronized (f13107n) {
            ArrayList<UMSenderStateNotify> arrayList = f13106m;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    f13106m.get(i5).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        ULog.d("--->>> handleProcessNext: Enter...");
        if (!f13105l) {
            return;
        }
        Context appContext = UMModuleRegister.getAppContext();
        try {
            if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                ULog.d("--->>> The envelope file exists.");
                if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                    ULog.d("--->>> Number of envelope files is greater than 200, remove old files first.");
                    UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                }
                File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                if (envelopeFile != null) {
                    String path = envelopeFile.getPath();
                    ULog.d("--->>> Ready to send envelope file [" + path + "].");
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                    if (new c(appContext).a(envelopeFile)) {
                        ULog.d("--->>> Send envelope file success, delete it.");
                        if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                            ULog.d("--->>> Failed to delete already processed file. We try again after delete failed.");
                            UMFrUtils.removeEnvelopeFile(envelopeFile);
                        }
                        c(273);
                        return;
                    }
                    ULog.d("--->>> Send envelope file failed, abandon and wait next trigger!");
                    return;
                }
            }
            e();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(appContext, th);
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f13116w) {
            if (f13109p.equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f13111r = true;
                } else {
                    f13111r = false;
                }
            }
            if (f13110q.equals(str)) {
                int intValue = Integer.valueOf(str2).intValue();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + intValue);
                if (intValue >= 3 && intValue <= 90) {
                    f13115v = intValue * 1000;
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f13115v);
                }
                f13115v = 15000;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f13115v);
            }
        }
    }

    public static void a(Context context) {
        if (f13103j != null || context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        f13103j = connectivityManager;
        if (connectivityManager != null) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> createCMIfNeeded:注册网络状态监听器。");
            b(context);
        }
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    public static void b(Context context) {
        if (context == null) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> registerNetReceiver: context is null, registerNetReceiver failed.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build();
                if (f13103j != null) {
                    final Context applicationContext = context.getApplicationContext();
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器:registerNetworkCallback");
                    f13103j.registerNetworkCallback(build, new ConnectivityManager.NetworkCallback() { // from class: com.umeng.commonsdk.framework.a.1
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onAvailable(Network network) {
                            Context context2 = applicationContext;
                            UMWorkDispatch.sendEvent(context2, com.umeng.commonsdk.internal.a.E, b.a(context2).a(), null);
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                            super.onCapabilitiesChanged(network, networkCapabilities);
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLost(Network network) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onLost");
                            Context context2 = applicationContext;
                            UMWorkDispatch.sendEvent(context2, com.umeng.commonsdk.internal.a.E, b.a(context2).a(), null, 2000L);
                        }
                    });
                    return;
                }
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> ACCESS_NETWORK_STATE permission access denied.");
            return;
        }
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (f13103j == null || f13104k != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            f13104k = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (f13117x != null) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器:registerReceiver");
                context.registerReceiver(f13117x, f13104k);
                return;
            }
            return;
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> ACCESS_NETWORK_STATE permission access denied.");
    }

    public static void a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f13107n) {
            try {
                if (f13106m == null) {
                    f13106m = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i5 = 0; i5 < f13106m.size(); i5++) {
                        if (uMSenderStateNotify == f13106m.get(i5)) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f13106m.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    public static boolean a() {
        boolean z4;
        synchronized (f13116w) {
            z4 = f13111r;
        }
        return z4;
    }

    public static void a(boolean z4) {
        int size;
        f13105l = z4;
        if (z4) {
            synchronized (f13107n) {
                ArrayList<UMSenderStateNotify> arrayList = f13106m;
                if (arrayList != null && (size = arrayList.size()) > 0) {
                    for (int i5 = 0; i5 < size; i5++) {
                        f13106m.get(i5).onConnectionAvailable();
                    }
                }
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
            d();
            return;
        }
        ULog.i("--->>> network disconnected.");
        f13105l = false;
    }

    private static void b(int i5) {
        Handler handler;
        if (!f13105l || (handler = f13095b) == null || handler.hasMessages(i5)) {
            return;
        }
        Message obtainMessage = f13095b.obtainMessage();
        obtainMessage.what = i5;
        f13095b.sendMessage(obtainMessage);
    }

    private static void a(int i5, long j5) {
        Handler handler;
        if (!f13105l || (handler = f13095b) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i5;
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j5);
        f13095b.sendMessageDelayed(obtainMessage, j5);
    }

    private static void a(int i5, int i6) {
        Handler handler;
        if (!f13105l || (handler = f13095b) == null) {
            return;
        }
        handler.removeMessages(i5);
        Message obtainMessage = f13095b.obtainMessage();
        obtainMessage.what = i5;
        f13095b.sendMessageDelayed(obtainMessage, i6);
    }
}
