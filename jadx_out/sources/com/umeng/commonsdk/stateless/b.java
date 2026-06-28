package com.umeng.commonsdk.stateless;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentFilter;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13225a = 273;

    /* renamed from: b, reason: collision with root package name */
    private static Context f13226b = null;

    /* renamed from: c, reason: collision with root package name */
    private static HandlerThread f13227c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Handler f13228d = null;

    /* renamed from: f, reason: collision with root package name */
    private static final int f13230f = 274;

    /* renamed from: g, reason: collision with root package name */
    private static final int f13231g = 275;

    /* renamed from: h, reason: collision with root package name */
    private static final int f13232h = 512;

    /* renamed from: i, reason: collision with root package name */
    private static a f13233i = null;

    /* renamed from: j, reason: collision with root package name */
    private static IntentFilter f13234j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile boolean f13235k = false;

    /* renamed from: e, reason: collision with root package name */
    private static Object f13229e = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static LinkedList<String> f13236l = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i5, String str) {
            if ((i5 & 8) == 8) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
                b.a(b.f13230f);
            }
        }
    }

    public b(Context context) {
        synchronized (f13229e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f13226b = applicationContext;
                    if (applicationContext != null && f13227c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f13227c = handlerThread;
                        handlerThread.start();
                        if (f13233i == null) {
                            String str = f13226b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f13219f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            f13233i = aVar;
                            aVar.startWatching();
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (f13228d == null) {
                            f13228d = new Handler(f13227c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.1
                                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i5 = message.what;
                                    if (i5 != 512) {
                                        switch (i5) {
                                            case b.f13225a /* 273 */:
                                                b.l();
                                                return;
                                            case b.f13230f /* 274 */:
                                                b.n();
                                                return;
                                            case b.f13231g /* 275 */:
                                                b.p();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    b.q();
                                }
                            };
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void a(boolean z4) {
        f13235k = z4;
        if (z4) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
            b(f13230f);
        } else {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
        }
    }

    public static void b(int i5) {
        Handler handler;
        try {
            if (!f13235k || (handler = f13228d) == null || handler.hasMessages(i5)) {
                return;
            }
            Message obtainMessage = f13228d.obtainMessage();
            obtainMessage.what = i5;
            f13228d.sendMessage(obtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f13226b, th);
        }
    }

    public static void c() {
        b(f13231g);
    }

    public static void d() {
        b(512);
    }

    private static void i() {
        File[] c5 = d.c(f13226b);
        if (c5 != null) {
            if (f13236l.size() > 0) {
                f13236l.clear();
            }
            for (File file : c5) {
                f13236l.add(file.getAbsolutePath());
            }
        }
    }

    private static String j() {
        String str = null;
        try {
            String peek = f13236l.peek();
            if (peek != null) {
                try {
                    f13236l.removeFirst();
                    return peek;
                } catch (Throwable unused) {
                    str = peek;
                    return str;
                }
            }
            return peek;
        } catch (Throwable unused2) {
        }
    }

    @TargetApi(9)
    private static void k() {
        String pollFirst;
        byte[] bArr;
        String str;
        String str2;
        if (f13236l.size() <= 0) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            pollFirst = f13236l.pollFirst();
            if (!TextUtils.isEmpty(pollFirst)) {
                File file = new File(pollFirst);
                if (!file.exists()) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                } else {
                    c cVar = new c(f13226b);
                    try {
                        bArr = d.a(pollFirst);
                    } catch (Exception unused) {
                        bArr = null;
                    }
                    String name = file.getName();
                    if (!TextUtils.isEmpty(name)) {
                        str = name.substring(0, 1);
                    } else {
                        str = bi.aK;
                    }
                    String c5 = d.c(d.d(name));
                    if (com.umeng.commonsdk.vchannel.a.f13513c.equalsIgnoreCase(c5)) {
                        str2 = com.umeng.commonsdk.vchannel.a.f13511a;
                    } else {
                        str2 = "";
                    }
                    if (cVar.a(bArr, c5, str2, str) && !file.delete()) {
                        file.delete();
                    }
                }
            }
        } while (pollFirst != null);
        f13236l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        File a5;
        byte[] bArr;
        if (!f13235k || f13226b == null) {
            return;
        }
        do {
            try {
                a5 = d.a(f13226b);
                if (a5 != null && a5.getParentFile() != null && !TextUtils.isEmpty(a5.getParentFile().getName())) {
                    c cVar = new c(f13226b);
                    String str = new String(Base64.decode(a5.getParentFile().getName(), 0));
                    if (!com.umeng.commonsdk.internal.a.f13120a.equalsIgnoreCase(str) && !com.umeng.commonsdk.internal.a.f13121b.equalsIgnoreCase(str) && !com.umeng.commonsdk.internal.a.H.equalsIgnoreCase(str)) {
                        ULog.i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        try {
                            bArr = d.a(a5.getAbsolutePath());
                        } catch (Exception unused) {
                            bArr = null;
                        }
                        String str2 = "";
                        if (com.umeng.commonsdk.vchannel.a.f13513c.equalsIgnoreCase(str)) {
                            str2 = com.umeng.commonsdk.vchannel.a.f13511a;
                        }
                        String str3 = bi.aK;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = bi.aE;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) {
                            str3 = bi.aA;
                        }
                        if (cVar.a(bArr, str, str2, str3)) {
                            ULog.i("walle", "[stateless] Send envelope file success, delete it.");
                            File file = new File(a5.getAbsolutePath());
                            if (!file.delete()) {
                                ULog.i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                file.delete();
                            }
                        } else {
                            ULog.i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                    }
                    new File(a5.getAbsolutePath()).delete();
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f13226b, th);
            }
        } while (a5 != null);
        m();
    }

    private static void m() {
        try {
            File file = new File(f13226b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f13218e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                d.a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        if (f13235k && f13226b != null) {
            i();
            k();
            c();
        }
    }

    private static void o() {
        try {
            File file = new File(f13226b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f13218e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                b(f13225a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q() {
    }

    public static boolean a() {
        synchronized (f13229e) {
            return f13233i != null;
        }
    }

    public static void b() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        b(f13230f);
    }

    public static void a(int i5) {
        Handler handler;
        if (!f13235k || (handler = f13228d) == null) {
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i5;
        f13228d.sendMessage(obtainMessage);
    }
}
