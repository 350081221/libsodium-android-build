package com.uc.crashsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f11912a = true;

    /* renamed from: b, reason: collision with root package name */
    private static volatile HandlerThread f11913b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile HandlerThread f11914c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile HandlerThread f11915d;

    /* renamed from: e, reason: collision with root package name */
    private static Handler f11916e;

    /* renamed from: f, reason: collision with root package name */
    private static Handler f11917f;

    /* renamed from: g, reason: collision with root package name */
    private static Handler f11918g;

    /* renamed from: h, reason: collision with root package name */
    private static Handler f11919h;

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<Object, Object[]> f11920i = new HashMap<>();

    public static Handler a(int i5) {
        if (i5 == 0) {
            if (f11913b == null) {
                a();
            }
            return f11916e;
        }
        if (i5 == 1) {
            if (f11914c == null) {
                b();
            }
            return f11917f;
        }
        if (i5 == 2) {
            if (f11918g == null) {
                f11918g = new Handler(Looper.getMainLooper());
            }
            return f11918g;
        }
        if (i5 == 3) {
            if (f11919h == null) {
                c();
            }
            return f11919h;
        }
        throw new RuntimeException("unknown thread type: " + i5);
    }

    public static boolean b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> hashMap = f11920i;
        synchronized (hashMap) {
            objArr = hashMap.get(runnable);
        }
        return objArr != null;
    }

    private static synchronized void c() {
        synchronized (f.class) {
            if (f11915d == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
                f11915d = handlerThread;
                handlerThread.start();
                f11919h = new Handler(f11915d.getLooper());
            }
        }
    }

    private static synchronized void b() {
        synchronized (f.class) {
            if (f11914c == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                f11914c = handlerThread;
                handlerThread.start();
                f11917f = new Handler(f11914c.getLooper());
            }
        }
    }

    public static boolean a(int i5, Runnable runnable, long j5) {
        Handler a5;
        if (runnable == null || (a5 = a(i5)) == null) {
            return false;
        }
        e eVar = new e(10, new Object[]{runnable});
        HashMap<Object, Object[]> hashMap = f11920i;
        synchronized (hashMap) {
            hashMap.put(runnable, new Object[]{eVar, Integer.valueOf(i5)});
        }
        return a5.postDelayed(eVar, j5);
    }

    public static void a(int i5, Object[] objArr) {
        if (i5 != 10) {
            if (!f11912a) {
                throw new AssertionError();
            }
        } else {
            if (!f11912a && objArr == null) {
                throw new AssertionError();
            }
            Runnable runnable = (Runnable) objArr[0];
            HashMap<Object, Object[]> hashMap = f11920i;
            synchronized (hashMap) {
                if (hashMap.get(runnable) != null) {
                    hashMap.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    public static boolean a(int i5, Runnable runnable) {
        return a(i5, runnable, 0L);
    }

    public static void a(Runnable runnable) {
        Object[] objArr;
        Handler handler;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> hashMap = f11920i;
        synchronized (hashMap) {
            objArr = hashMap.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        if (intValue == 0) {
            handler = f11916e;
        } else if (intValue != 1) {
            handler = intValue != 2 ? null : f11918g;
        } else {
            handler = f11917f;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (hashMap) {
            if (hashMap.get(runnable) != null) {
                hashMap.remove(runnable);
            }
        }
    }

    private static synchronized void a() {
        synchronized (f.class) {
            if (f11913b == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                f11913b = handlerThread;
                handlerThread.start();
                f11916e = new Handler(f11913b.getLooper());
            }
        }
    }
}
