package t0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes2.dex */
public class c {
    public static String A = null;
    public static volatile c B = null;
    public static volatile b C = null;

    /* renamed from: a, reason: collision with root package name */
    public static final String f22430a = "VMS_IDLG_SDK_Client";

    /* renamed from: b, reason: collision with root package name */
    public static final String f22431b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c, reason: collision with root package name */
    public static final String f22432c = "persist.sys.identifierid.supported";

    /* renamed from: d, reason: collision with root package name */
    public static final String f22433d = "appid";

    /* renamed from: e, reason: collision with root package name */
    public static final String f22434e = "type";

    /* renamed from: f, reason: collision with root package name */
    public static final String f22435f = "OAID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f22436g = "VAID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f22437h = "AAID";

    /* renamed from: i, reason: collision with root package name */
    public static final int f22438i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22439j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f22440k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f22441l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f22442m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final int f22443n = 2000;

    /* renamed from: o, reason: collision with root package name */
    public static Context f22444o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f22445p = false;

    /* renamed from: q, reason: collision with root package name */
    public static d f22446q;

    /* renamed from: r, reason: collision with root package name */
    public static d f22447r;

    /* renamed from: s, reason: collision with root package name */
    public static d f22448s;

    /* renamed from: t, reason: collision with root package name */
    public static Object f22449t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static HandlerThread f22450u;

    /* renamed from: v, reason: collision with root package name */
    public static Handler f22451v;

    /* renamed from: w, reason: collision with root package name */
    public static String f22452w;

    /* renamed from: x, reason: collision with root package name */
    public static String f22453x;

    /* renamed from: y, reason: collision with root package name */
    public static String f22454y;

    /* renamed from: z, reason: collision with root package name */
    public static String f22455z;

    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 11) {
                String unused = c.f22452w = c.C.a(message.getData().getInt("type"), message.getData().getString("appid"));
                synchronized (c.f22449t) {
                    c.f22449t.notify();
                }
                return;
            }
            Log.e(c.f22430a, "message type valid");
        }
    }

    public static String c(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e5) {
                e5.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static c d(Context context) {
        if (B == null) {
            synchronized (c.class) {
                f22444o = context.getApplicationContext();
                B = new c();
            }
        }
        if (C == null) {
            synchronized (c.class) {
                f22444o = context.getApplicationContext();
                o();
                C = new b(f22444o);
                n();
            }
        }
        return B;
    }

    public static void f(Context context, int i5, String str) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    f22448s = new d(B, 2, str);
                    context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f22448s);
                    return;
                }
                return;
            }
            f22447r = new d(B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f22447r);
            return;
        }
        f22446q = new d(B, 0, null);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f22446q);
    }

    private void i(int i5, String str) {
        Message obtainMessage = f22451v.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i5);
        if (i5 == 1 || i5 == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        f22451v.sendMessage(obtainMessage);
    }

    public static void n() {
        f22445p = "1".equals(c(f22432c, "0"));
    }

    public static void o() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f22450u = handlerThread;
        handlerThread.start();
        f22451v = new a(f22450u.getLooper());
    }

    public String a() {
        if (!k()) {
            return null;
        }
        String str = f22453x;
        if (str != null) {
            return str;
        }
        e(0, null);
        if (f22446q == null) {
            f(f22444o, 0, null);
        }
        return f22453x;
    }

    public String b(String str) {
        if (!k()) {
            return null;
        }
        String str2 = f22455z;
        if (str2 != null) {
            return str2;
        }
        e(2, str);
        if (f22448s == null && f22455z != null) {
            f(f22444o, 2, str);
        }
        return f22455z;
    }

    public void e(int i5, String str) {
        synchronized (f22449t) {
            i(i5, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f22449t.wait(2000L);
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - uptimeMillis < 2000) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                            }
                        } else {
                            String str2 = f22452w;
                            if (str2 != null) {
                                f22455z = str2;
                                f22452w = null;
                            } else {
                                Log.e(f22430a, "get aaid failed");
                            }
                        }
                        A = f22452w;
                        f22452w = null;
                    } else {
                        String str3 = f22452w;
                        if (str3 != null) {
                            f22454y = str3;
                            f22452w = null;
                        } else {
                            Log.e(f22430a, "get vaid failed");
                        }
                    }
                } else {
                    f22453x = f22452w;
                    f22452w = null;
                }
            } else {
                Log.d(f22430a, "query timeout");
            }
        }
    }

    public String g() {
        if (!k()) {
            return null;
        }
        e(4, null);
        return A;
    }

    public String h(String str) {
        if (!k()) {
            return null;
        }
        String str2 = f22454y;
        if (str2 != null) {
            return str2;
        }
        e(1, str);
        if (f22447r == null && f22454y != null) {
            f(f22444o, 1, str);
        }
        return f22454y;
    }

    public boolean k() {
        return f22445p;
    }
}
