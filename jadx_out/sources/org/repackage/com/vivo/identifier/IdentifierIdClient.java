package org.repackage.com.vivo.identifier;

import a1.i;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.agconnect.credential.obs.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import t0.b;

/* loaded from: classes4.dex */
public class IdentifierIdClient {
    private static int A = 13;
    private static IdentifierIdObserver B = null;
    private static IdentifierIdObserver C = null;
    private static IdentifierIdObserver D = null;
    private static IdentifierIdObserver E = null;
    private static HandlerThread F = null;
    private static Handler G = null;
    private static String H = null;
    private static String I = null;
    private static String J = null;
    private static String K = null;
    private static String L = null;
    private static String M = null;
    private static String N = null;
    private static volatile IdentifierIdClient O = null;
    private static volatile DataBaseOperation P = null;
    private static int R = 0;
    private static int S = 0;
    private static int T = 0;
    private static int U = 0;
    private static int V = 0;
    private static int W = 0;
    private static int X = 0;
    private static int Y = 0;
    private static int Z = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final String f22162a = "persist.sys.identifierid";
    private static int aa = 0;
    private static int ab = 0;
    private static int ac = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final String f22163b = "VMS_SDK_Client";

    /* renamed from: c, reason: collision with root package name */
    private static final String f22164c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: d, reason: collision with root package name */
    private static final String f22165d = "persist.sys.identifierid.supported";

    /* renamed from: e, reason: collision with root package name */
    private static final String f22166e = "com.vivo.vms";

    /* renamed from: f, reason: collision with root package name */
    private static final String f22167f = "appid";

    /* renamed from: g, reason: collision with root package name */
    private static final String f22168g = "type";

    /* renamed from: h, reason: collision with root package name */
    private static final String f22169h = "OAID";

    /* renamed from: i, reason: collision with root package name */
    private static final String f22170i = "VAID";

    /* renamed from: j, reason: collision with root package name */
    private static final String f22171j = "OAIDSTATUS";

    /* renamed from: k, reason: collision with root package name */
    private static Object f22172k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final int f22173l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static final int f22174m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f22175n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f22176o = 3;

    /* renamed from: p, reason: collision with root package name */
    private static final int f22177p = 4;

    /* renamed from: q, reason: collision with root package name */
    private static final int f22178q = 5;

    /* renamed from: r, reason: collision with root package name */
    private static final int f22179r = 6;

    /* renamed from: s, reason: collision with root package name */
    private static final int f22180s = 7;

    /* renamed from: t, reason: collision with root package name */
    private static final int f22181t = 8;

    /* renamed from: u, reason: collision with root package name */
    private static final int f22182u = 9;

    /* renamed from: v, reason: collision with root package name */
    private static final int f22183v = 10;

    /* renamed from: w, reason: collision with root package name */
    private static final int f22184w = 11;

    /* renamed from: x, reason: collision with root package name */
    private static final int f22185x = 2000;

    /* renamed from: y, reason: collision with root package name */
    private static Context f22186y = null;

    /* renamed from: z, reason: collision with root package name */
    private static boolean f22187z = false;
    private final int Q;

    private IdentifierIdClient() {
        D();
        P = new DataBaseOperation(f22186y);
        this.Q = c(f22186y);
    }

    private void C() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new Runnable() { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                if (IdentifierIdClient.R + IdentifierIdClient.S + IdentifierIdClient.X + IdentifierIdClient.aa + IdentifierIdClient.T + IdentifierIdClient.U + IdentifierIdClient.Z + IdentifierIdClient.aa + IdentifierIdClient.V + IdentifierIdClient.W + IdentifierIdClient.ab + IdentifierIdClient.ac > 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("oaid", IdentifierIdClient.this.a(IdentifierIdClient.R, IdentifierIdClient.S, IdentifierIdClient.X, IdentifierIdClient.Y));
                    contentValues.put("vaid", IdentifierIdClient.this.a(IdentifierIdClient.T, IdentifierIdClient.U, IdentifierIdClient.Z, IdentifierIdClient.aa));
                    contentValues.put(c.f7851a, IdentifierIdClient.this.a(IdentifierIdClient.V, IdentifierIdClient.W, IdentifierIdClient.ab, IdentifierIdClient.ac));
                    IdentifierIdClient.P.a(7, "vivo", new ContentValues[]{contentValues});
                    int unused = IdentifierIdClient.R = IdentifierIdClient.S = IdentifierIdClient.T = IdentifierIdClient.U = IdentifierIdClient.V = IdentifierIdClient.W = 0;
                    int unused2 = IdentifierIdClient.X = IdentifierIdClient.Y = IdentifierIdClient.Z = IdentifierIdClient.aa = IdentifierIdClient.ab = IdentifierIdClient.ac = 0;
                }
            }
        }, 600L, 600L, TimeUnit.SECONDS);
    }

    private static void D() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        F = handlerThread;
        handlerThread.start();
        G = new Handler(F.getLooper()) { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 11) {
                    int i5 = message.getData().getInt("type");
                    try {
                        String a5 = IdentifierIdClient.P.a(i5, message.getData().getString("appid"));
                        if (i5 == 0) {
                            String unused = IdentifierIdClient.H = a5;
                            IdentifierIdClient.c(8, IdentifierIdClient.H);
                        } else if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 == 4) {
                                        String unused2 = IdentifierIdClient.L = a5;
                                    } else if (i5 == 5) {
                                        if (a5 != null) {
                                            String unused3 = IdentifierIdClient.M = a5;
                                        } else {
                                            Log.e(IdentifierIdClient.f22163b, "get guid failed");
                                        }
                                    }
                                } else if (a5 != null) {
                                    String unused4 = IdentifierIdClient.K = a5;
                                } else {
                                    Log.e(IdentifierIdClient.f22163b, "get udid failed");
                                }
                            } else {
                                if (a5 != null) {
                                    String unused5 = IdentifierIdClient.J = a5;
                                } else {
                                    Log.e(IdentifierIdClient.f22163b, "get aaid failed");
                                }
                                IdentifierIdClient.c(10, IdentifierIdClient.J);
                            }
                        } else {
                            if (a5 != null) {
                                String unused6 = IdentifierIdClient.I = a5;
                            } else {
                                Log.e(IdentifierIdClient.f22163b, "get vaid failed");
                            }
                            IdentifierIdClient.c(9, IdentifierIdClient.I);
                        }
                    } catch (Exception e5) {
                        Log.e(IdentifierIdClient.f22163b, "readException:" + e5.toString());
                    }
                    synchronized (IdentifierIdClient.f22172k) {
                        IdentifierIdClient.f22172k.notify();
                    }
                    return;
                }
                Log.e(IdentifierIdClient.f22163b, "message type valid");
            }
        };
    }

    private static void E() {
        boolean z4;
        if (!"1".equals(a("persist.sys.identifierid.supported", "0")) && !"1".equals(a(f22162a, "0"))) {
            z4 = false;
        } else {
            z4 = true;
        }
        f22187z = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        String str = J;
        if (str != null) {
            c(2, str);
            return J;
        }
        e(2, "vivo");
        if (D == null) {
            a(f22186y, 2, "vivo");
        }
        c(2, J);
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        String str = J;
        if (str != null) {
            c(2, str);
            return J;
        }
        d(2, "vivo");
        if (D == null) {
            a(f22186y, 2, "vivo");
        }
        c(2, J);
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        e(4, null);
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j() {
        String str = M;
        if (str != null) {
            return str;
        }
        e(5, "vivo");
        return M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        String str = M;
        if (str != null) {
            return str;
        }
        d(5, "vivo");
        return M;
    }

    private static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(f22166e, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        String str = H;
        if (str != null) {
            c(0, str);
            return H;
        }
        d(0, null);
        if (B == null) {
            a(f22186y, 0, null);
        }
        c(0, H);
        return H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        String str = I;
        if (str != null) {
            c(1, str);
            return I;
        }
        e(1, "vivo");
        if (C == null) {
            a(f22186y, 1, "vivo");
        }
        c(1, I);
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        String str = I;
        if (str != null) {
            c(1, str);
            return I;
        }
        d(1, "vivo");
        if (C == null) {
            a(f22186y, 1, "vivo");
        }
        c(1, I);
        return I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i5, int i6, int i7, int i8) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i5);
        stringBuffer.append(",");
        stringBuffer.append(i6);
        stringBuffer.append(i.f136b);
        stringBuffer.append(i7);
        stringBuffer.append(",");
        stringBuffer.append(i8);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IdentifierIdClient b(Context context) {
        if (a()) {
            return a(context);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IdentifierIdClient a(Context context) {
        if (f22186y == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f22186y = context;
        }
        if (O == null) {
            synchronized (IdentifierIdClient.class) {
                if (O == null) {
                    O = new IdentifierIdClient();
                    O.C();
                }
            }
        }
        return O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        String str = K;
        if (str != null) {
            return str;
        }
        e(3, null);
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        String str = H;
        if (str != null) {
            c(0, str);
            return H;
        }
        e(0, null);
        if (B == null) {
            a(f22186y, 0, null);
        }
        c(0, H);
        return H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List b(List<String> list) {
        if (this.Q < A) {
            return null;
        }
        if (list != null && list.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < list.size(); i5++) {
                    String[] split = list.get(i5).split(":");
                    if (split.length == 2) {
                        arrayList.add(Boolean.valueOf(P.a(6, "vivo", split[0], split[1])));
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                Log.e(f22163b, "delete OAIDBLACK failure");
                return null;
            }
        }
        Log.e(f22163b, "List is null when delete OAIDBLACK");
        return null;
    }

    private void d(int i5, String str) {
        a(i5, str);
    }

    private void e(int i5, String str) {
        synchronized (f22172k) {
            a(i5, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f22172k.wait(2000L);
            } catch (InterruptedException unused) {
                Log.e(f22163b, "queryId: lock error");
            }
            if (SystemClock.uptimeMillis() - uptimeMillis >= 2000) {
                Log.d(f22163b, "query timeout");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        if (!f22187z) {
            E();
        }
        return f22187z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i5, String str) {
        if (i5 == 0) {
            if (str == null) {
                S++;
                return;
            } else {
                R++;
                return;
            }
        }
        if (i5 == 1) {
            if (str == null) {
                U++;
                return;
            } else {
                T++;
                return;
            }
        }
        if (i5 == 2) {
            if (str == null) {
                W++;
                return;
            } else {
                V++;
                return;
            }
        }
        switch (i5) {
            case 8:
                if (str == null) {
                    Y++;
                    return;
                } else {
                    X++;
                    return;
                }
            case 9:
                if (str == null) {
                    aa++;
                    return;
                } else {
                    Z++;
                    return;
                }
            case 10:
                if (str == null) {
                    ac++;
                    return;
                } else {
                    ab++;
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(List<String> list) {
        if (this.Q < A) {
            return false;
        }
        if (list != null && list.size() != 0) {
            try {
                ContentValues[] contentValuesArr = new ContentValues[list.size()];
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ContentValues contentValues = new ContentValues();
                    String[] split = list.get(i5).split(":");
                    if (split.length != 2) {
                        return false;
                    }
                    String str = split[0];
                    String str2 = split[1];
                    contentValues.put(TTDownloadField.TT_PACKAGE_NAME, str);
                    contentValues.put("uid", str2);
                    contentValues.put(b.f22420d, format);
                    contentValuesArr[i5] = contentValues;
                }
                return P.a(6, "vivo", contentValuesArr);
            } catch (Exception unused) {
                Log.e(f22163b, "insert OAIDBLACK failure");
                return false;
            }
        }
        Log.e(f22163b, "List is null when insert OAIDBLACK");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i5, String str) {
        Message obtainMessage = G.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i5);
        if (i5 == 1 || i5 == 2 || i5 == 6) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        G.sendMessage(obtainMessage);
    }

    private static String a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
            } catch (Exception e5) {
                Log.e(f22163b, "getProperty: invoke is error" + e5.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    private static synchronized void a(Context context, int i5, String str) {
        synchronized (IdentifierIdClient.class) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (D == null) {
                            D = new IdentifierIdObserver(O, 2, str);
                            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + context.getPackageName()), false, D);
                        }
                    }
                } else if (C == null) {
                    C = new IdentifierIdObserver(O, 1, str);
                    context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, C);
                }
            } else if (B == null) {
                B = new IdentifierIdObserver(O, 0, null);
                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, B);
            }
        }
    }
}
