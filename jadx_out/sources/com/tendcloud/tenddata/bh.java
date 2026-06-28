package com.tendcloud.tenddata;

import android.util.Log;
import com.tendcloud.tenddata.zz;
import java.lang.Thread;
import java.util.HashMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class bh {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bh f11505a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler appDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();

        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (ab.f11349e) {
                bh.a(th, String.valueOf(System.currentTimeMillis()), com.tendcloud.tenddata.a.UNIVERSAL, true);
                Log.w(ab.f11364t, "UncaughtException in Thread " + thread.getName(), th);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.appDefaultHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private bh() {
        b();
    }

    public static bh a() {
        if (f11505a == null) {
            synchronized (bh.class) {
                if (f11505a == null) {
                    f11505a = new bh();
                }
            }
        }
        return f11505a;
    }

    private static void b() {
        try {
            Thread.setDefaultUncaughtExceptionHandler(new a());
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventError(zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> hashMap = aVar.paraMap;
                if (hashMap == null || Integer.parseInt(String.valueOf(hashMap.get("apiType"))) != 3) {
                    return;
                }
                a(aVar.paraMap);
            } catch (Throwable unused) {
            }
        }
    }

    void a(HashMap<String, Object> hashMap) {
        try {
            com.tendcloud.tenddata.a aVar = (com.tendcloud.tenddata.a) hashMap.get("service");
            if (hashMap.containsKey("throwable") && hashMap.containsKey("occurTime")) {
                a((Throwable) hashMap.get("throwable"), String.valueOf(hashMap.get("occurTime")), aVar, false);
            }
        } catch (Throwable unused) {
        }
    }

    static void a(Throwable th, String str, com.tendcloud.tenddata.a aVar, boolean z4) {
        if (ab.f11351g == null) {
            return;
        }
        try {
            long currentTimeMillis = str.trim().isEmpty() ? System.currentTimeMillis() : Long.parseLong(str);
            if (z4 && ab.J) {
                i.c(currentTimeMillis, aVar);
            }
        } catch (Throwable unused) {
        }
        Throwable th2 = th;
        while (th2.getCause() != null) {
            try {
                th2 = th2.getCause();
            } catch (Throwable unused2) {
                return;
            }
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        String packageName = ab.f11351g.getPackageName();
        int i5 = 0;
        for (int i6 = 0; i5 < 3 && i6 < stackTrace.length; i6++) {
            String className = stackTrace[i6].getClassName();
            if ((!className.startsWith("java.") || packageName.startsWith("java.")) && ((!className.startsWith("javax.") || packageName.startsWith("javax.")) && ((!className.startsWith("android.") || packageName.startsWith("android.")) && (!className.startsWith("com.android.") || packageName.startsWith("com.android."))))) {
                stackTrace[i6].toString();
                i5++;
            }
        }
        bv bvVar = new bv();
        bvVar.f11569b = "apm";
        bvVar.f11570c = com.umeng.analytics.pro.d.U;
        TreeMap treeMap = new TreeMap();
        treeMap.put("msg", a(th));
        treeMap.put("type", th2.getClass().getName());
        bvVar.f11571d = treeMap;
        bvVar.f11568a = com.tendcloud.tenddata.a.UNIVERSAL;
        z.a().post(bvVar);
    }

    private static final String a(Throwable th) {
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
                sb.append("\tat ");
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
