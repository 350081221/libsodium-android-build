package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class bo {

    /* renamed from: a, reason: collision with root package name */
    private static List<String> f11531a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static Handler f11532b;

    /* renamed from: c, reason: collision with root package name */
    private static HandlerThread f11533c;

    static {
        try {
            HandlerThread handlerThread = new HandlerThread("excHandlerThread", 10);
            f11533c = handlerThread;
            handlerThread.start();
            f11532b = new Handler(f11533c.getLooper());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(boolean z4, String str, String str2) {
        if (z4 && !y.b(str2) && str2.contains(aa.f11335l)) {
            return false;
        }
        if (!z4 && str.contains("api/q/a")) {
            return false;
        }
        return true;
    }

    public static void a(final String str, final boolean z4, final Map<String, Object> map) {
        try {
            f11532b.post(new Runnable() { // from class: com.tendcloud.tenddata.bo.1
                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    try {
                        Map map2 = map;
                        if (map2 == null || map2.isEmpty() || !bo.b(z4, String.valueOf(map.get("targetUrl")), str)) {
                            return;
                        }
                        h.dForInternal(map.toString() + " host: " + str);
                        bv bvVar = new bv();
                        bvVar.f11569b = com.umeng.ccg.a.f12839r;
                        if (z4) {
                            str2 = "send_ok";
                        } else {
                            str2 = "send_fail";
                        }
                        bvVar.f11570c = str2;
                        bvVar.f11571d = map;
                        bvVar.f11568a = a.ENV;
                        z.a().post(bvVar);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static final String a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append("\r\n");
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i5 = 50;
            if (stackTrace.length <= 50) {
                i5 = stackTrace.length;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                sb.append("\t");
                sb.append(stackTrace[i6]);
                sb.append("\r\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                a(sb, stackTrace, cause, 1);
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private static final void a(StringBuilder sb, StackTraceElement[] stackTraceElementArr, Throwable th, int i5) {
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length - 1;
            for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
                length--;
            }
            if (length > 50) {
                length = 50;
            }
            sb.append("Caused by : ");
            sb.append(th);
            sb.append("\r\n");
            for (int i6 = 0; i6 <= length; i6++) {
                sb.append("\t");
                sb.append(stackTrace[i6]);
                sb.append("\r\n");
            }
            if (i5 < 5 && th.getCause() != null) {
                a(sb, stackTrace, th, i5 + 1);
            }
        } catch (Throwable unused) {
        }
    }
}
