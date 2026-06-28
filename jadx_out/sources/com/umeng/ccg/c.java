package com.umeng.ccg;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12848a = 101;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12849b = 102;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12850c = 103;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12851d = 104;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12852e = 105;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12853f = 106;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12854g = 107;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12855h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12856i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12857j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12858k = 201;

    /* renamed from: l, reason: collision with root package name */
    public static final int f12859l = 202;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12860m = 203;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12861n = 301;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12862o = 302;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12863p = 303;

    /* renamed from: q, reason: collision with root package name */
    private static HandlerThread f12864q = null;

    /* renamed from: r, reason: collision with root package name */
    private static Handler f12865r = null;

    /* renamed from: s, reason: collision with root package name */
    private static HashMap<Integer, a> f12866s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final int f12867t = 256;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Object obj, int i5);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        a aVar;
        int i5 = message.arg1;
        Object obj = message.obj;
        Integer valueOf = Integer.valueOf(i5 / 100);
        HashMap<Integer, a> hashMap = f12866s;
        if (hashMap == null) {
            return;
        }
        if (hashMap.containsKey(valueOf)) {
            aVar = f12866s.get(valueOf);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.a(obj, i5);
        }
    }

    public static void a(Context context, int i5, int i6, a aVar, Object obj, long j5) {
        if (context == null || aVar == null) {
            return;
        }
        if (f12866s == null) {
            f12866s = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i6 / 100);
        if (!f12866s.containsKey(valueOf)) {
            f12866s.put(valueOf, aVar);
        }
        if (f12864q == null || f12865r == null) {
            a();
        }
        try {
            Handler handler = f12865r;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i5;
                obtainMessage.arg1 = i6;
                obtainMessage.obj = obj;
                f12865r.sendMessageDelayed(obtainMessage, j5);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i5, a aVar, Object obj) {
        a(context, 256, i5, aVar, obj, 0L);
    }

    public static void a(Context context, int i5, a aVar, Object obj, long j5) {
        a(context, 256, i5, aVar, obj, j5);
    }

    private static synchronized void a() {
        synchronized (c.class) {
            try {
                if (f12864q == null) {
                    HandlerThread handlerThread = new HandlerThread("ccg_dispatch");
                    f12864q = handlerThread;
                    handlerThread.start();
                    if (f12865r == null) {
                        f12865r = new Handler(f12864q.getLooper()) { // from class: com.umeng.ccg.c.1
                            @Override // android.os.Handler
                            public void handleMessage(Message message) {
                                if (message.what == 256) {
                                    c.b(message);
                                }
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
