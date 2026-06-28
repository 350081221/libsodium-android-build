package com.uyumao;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static HandlerThread f13666a;

    /* renamed from: b, reason: collision with root package name */
    public static Handler f13667b;

    /* renamed from: c, reason: collision with root package name */
    public static HashMap<Integer, a> f13668c;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Object obj, int i5);
    }

    public static void a(Context context, int i5, int i6, a aVar, Object obj, long j5) {
        if (context == null || aVar == null) {
            return;
        }
        if (f13668c == null) {
            f13668c = new HashMap<>();
        }
        Integer valueOf = Integer.valueOf(i6 / 100);
        if (!f13668c.containsKey(valueOf)) {
            f13668c.put(valueOf, aVar);
        }
        if (f13666a == null || f13667b == null) {
            synchronized (g.class) {
                try {
                    if (f13666a == null) {
                        HandlerThread handlerThread = new HandlerThread("yumao_ccg");
                        f13666a = handlerThread;
                        handlerThread.start();
                        if (f13667b == null) {
                            f13667b = new f(f13666a.getLooper());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            Handler handler = f13667b;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = i5;
                obtainMessage.arg1 = i6;
                obtainMessage.obj = obj;
                f13667b.sendMessageDelayed(obtainMessage, j5);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(Context context, int i5, a aVar, Object obj) {
        a(context, 256, i5, aVar, obj, 0L);
    }
}
