package com.efs.sdk.pa.a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.efs.sdk.pa.PAANRListener;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f6849a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f6850b;

    /* renamed from: c, reason: collision with root package name */
    final Thread f6851c;

    /* renamed from: d, reason: collision with root package name */
    long f6852d;

    /* renamed from: e, reason: collision with root package name */
    long f6853e;

    /* renamed from: f, reason: collision with root package name */
    boolean f6854f;

    /* renamed from: g, reason: collision with root package name */
    Handler f6855g;

    /* renamed from: h, reason: collision with root package name */
    PAANRListener f6856h;

    /* renamed from: i, reason: collision with root package name */
    long f6857i;

    /* renamed from: j, reason: collision with root package name */
    long f6858j;

    /* renamed from: k, reason: collision with root package name */
    final long f6859k;

    /* renamed from: l, reason: collision with root package name */
    boolean f6860l;

    /* renamed from: m, reason: collision with root package name */
    final Runnable f6861m;

    /* renamed from: n, reason: collision with root package name */
    final Runnable f6862n;

    /* renamed from: o, reason: collision with root package name */
    private HandlerThread f6863o;

    /* renamed from: p, reason: collision with root package name */
    private Application f6864p;

    public a(Application application, long j5) {
        this(application, j5, true);
    }

    static boolean a(StringBuilder sb) {
        Set<Map.Entry<Thread, StackTraceElement[]>> entrySet = Thread.getAllStackTraces().entrySet();
        if (entrySet.size() == 0) {
            return false;
        }
        boolean z4 = false;
        for (Map.Entry<Thread, StackTraceElement[]> entry : entrySet) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (key.getId() == Looper.getMainLooper().getThread().getId()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(key.getName());
                sb2.append(" ");
                sb2.append(key.getPriority());
                sb2.append(" ");
                sb2.append(key.getState());
                sb2.append("\n");
                for (StackTraceElement stackTraceElement : value) {
                    String stackTraceElement2 = stackTraceElement.toString();
                    sb2.append("  at  ");
                    sb2.append(stackTraceElement2);
                    sb2.append('\n');
                }
                sb2.append("\n");
                sb.insert(0, (CharSequence) sb2);
                z4 = true;
            } else {
                sb.append(key.getName());
                sb.append(" ");
                sb.append(key.getPriority());
                sb.append(" ");
                sb.append(key.getState());
                sb.append("\n");
                for (StackTraceElement stackTraceElement3 : value) {
                    String stackTraceElement4 = stackTraceElement3.toString();
                    sb.append("  at  ");
                    sb.append(stackTraceElement4);
                    sb.append('\n');
                }
                sb.append("\n");
            }
        }
        if (!z4) {
            sb.insert(0, a(Looper.getMainLooper().getThread()));
        }
        return true;
    }

    public a(Application application, long j5, boolean z4) {
        this.f6849a = true;
        this.f6853e = 4L;
        this.f6854f = true;
        this.f6857i = 0L;
        this.f6861m = new Runnable() { // from class: com.efs.sdk.pa.a.a.1
            /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
            
                if (com.efs.sdk.pa.a.a.a(r1) != false) goto L24;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r6 = this;
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    boolean r0 = r0.f6854f
                    if (r0 == 0) goto L7
                    return
                L7:
                    long r0 = android.os.SystemClock.uptimeMillis()
                    com.efs.sdk.pa.a.a r2 = com.efs.sdk.pa.a.a.this
                    long r3 = r2.f6858j
                    long r0 = r0 - r3
                    long r3 = r2.f6859k
                    int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r3 <= 0) goto L21
                    com.efs.sdk.pa.PAANRListener r2 = r2.f6856h
                    if (r2 == 0) goto L21
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r2.unexcept(r0)
                L21:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    boolean r0 = r0.f6849a
                    if (r0 == 0) goto L3a
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    r1 = 0
                    r0.f6857i = r1
                    r1 = 0
                    r0.f6849a = r1
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    android.os.Handler r1 = r0.f6850b
                    java.lang.Runnable r0 = r0.f6862n
                    r1.postAtFrontOfQueue(r0)
                    goto L81
                L3a:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    long r1 = r0.f6857i
                    r3 = 1
                    long r1 = r1 + r3
                    r0.f6857i = r1
                    boolean r0 = r0.f6849a
                    if (r0 != 0) goto L81
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    long r1 = r0.f6857i
                    long r3 = r0.f6853e
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 < 0) goto L81
                    int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r1 != 0) goto L81
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    boolean r2 = r0.f6860l
                    if (r2 == 0) goto L68
                    java.lang.Thread r2 = r0.f6851c
                    java.lang.String r2 = com.efs.sdk.pa.a.a.a(r2)
                    r1.append(r2)
                    goto L6e
                L68:
                    boolean r2 = com.efs.sdk.pa.a.a.a(r1)
                    if (r2 == 0) goto L81
                L6e:
                    com.efs.sdk.pa.PAANRListener r2 = r0.f6856h
                    if (r2 == 0) goto L81
                    int r2 = r1.length()
                    if (r2 <= 0) goto L81
                    com.efs.sdk.pa.PAANRListener r0 = r0.f6856h
                    java.lang.String r1 = r1.toString()
                    r0.anrStack(r1)
                L81:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    long r1 = android.os.SystemClock.uptimeMillis()
                    r0.f6858j = r1
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.pa.a.a.this
                    android.os.Handler r1 = r0.f6855g
                    java.lang.Runnable r2 = r0.f6861m
                    long r3 = r0.f6852d
                    r1.postDelayed(r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.pa.a.a.AnonymousClass1.run():void");
            }
        };
        this.f6862n = new Runnable() { // from class: com.efs.sdk.pa.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.f6849a = true;
            }
        };
        this.f6859k = j5;
        this.f6864p = application;
        this.f6860l = z4;
        long j6 = (((float) j5) * 0.8f) / this.f6853e;
        this.f6852d = j6;
        if (j6 < 100) {
            this.f6852d = 100L;
            this.f6853e = j5 / 100;
        }
        Log.i("Matrix.AnrTracer", "anrTrace, final mAnrBeatTime:" + this.f6852d + ", mAnrBeatRate:" + this.f6852d);
        this.f6851c = Looper.getMainLooper().getThread();
        this.f6850b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f6863o = handlerThread;
        handlerThread.start();
        this.f6855g = new Handler(this.f6863o.getLooper());
    }

    static String a(Thread thread) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        sb.append(thread.getName());
        sb.append(" ");
        sb.append(thread.getPriority());
        sb.append(" ");
        sb.append(thread.getState());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            sb.append("  at  ");
            sb.append(stackTraceElement2);
            sb.append('\n');
        }
        sb.append("\n");
        return sb.toString();
    }
}
