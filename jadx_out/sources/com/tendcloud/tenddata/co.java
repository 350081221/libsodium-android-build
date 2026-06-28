package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.bu;
import com.tendcloud.tenddata.n;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes3.dex */
public class co {

    /* renamed from: a, reason: collision with root package name */
    private static String f11608a = "utf-8";

    /* renamed from: c, reason: collision with root package name */
    private static final int f11610c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11611d = 30000;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f11612g = true;

    /* renamed from: h, reason: collision with root package name */
    private static final int f11613h = 65536;

    /* renamed from: j, reason: collision with root package name */
    private static HandlerThread f11615j;

    /* renamed from: e, reason: collision with root package name */
    private long f11616e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11617f = true;

    /* renamed from: k, reason: collision with root package name */
    private Handler f11618k;

    /* renamed from: b, reason: collision with root package name */
    private static final CRC32 f11609b = new CRC32();

    /* renamed from: i, reason: collision with root package name */
    private static volatile co f11614i = null;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private co() {
        this.f11618k = null;
        HandlerThread handlerThread = new HandlerThread("ModuleDataForward", 10);
        f11615j = handlerThread;
        handlerThread.start();
        this.f11618k = new Handler(f11615j.getLooper()) { // from class: com.tendcloud.tenddata.co.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof a)) {
                        co.this.a((a) obj);
                    }
                    co.this.b();
                } catch (Throwable unused) {
                }
            }
        };
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x0065, LOOP:0: B:16:0x004e->B:18:0x0054, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:6:0x0009, B:8:0x001c, B:10:0x0020, B:11:0x0027, B:15:0x0046, B:16:0x004e, B:18:0x0054, B:22:0x0029, B:23:0x002c, B:25:0x0031, B:26:0x003d), top: B:5:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r7 = this;
            android.os.Handler r0 = r7.f11618k
            r1 = 5
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L65
            java.security.SecureRandom r0 = com.tendcloud.tenddata.y.b()     // Catch: java.lang.Throwable -> L65
            int[] r2 = com.tendcloud.tenddata.ab.a()     // Catch: java.lang.Throwable -> L65
            android.content.Context r3 = com.tendcloud.tenddata.ab.f11351g     // Catch: java.lang.Throwable -> L65
            boolean r3 = com.tendcloud.tenddata.o.i(r3)     // Catch: java.lang.Throwable -> L65
            r4 = 30000(0x7530, float:4.2039E-41)
            r5 = 1
            if (r3 == 0) goto L2c
            boolean r3 = r7.f11617f     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L29
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L65
            int r2 = r2 * r5
            int r0 = r0.nextInt(r4)     // Catch: java.lang.Throwable -> L65
        L27:
            int r2 = r2 + r0
            goto L40
        L29:
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L65
            goto L40
        L2c:
            boolean r3 = r7.f11617f     // Catch: java.lang.Throwable -> L65
            r6 = 0
            if (r3 != 0) goto L3d
            r2 = r2[r6]     // Catch: java.lang.Throwable -> L65
            int r2 = r2 * r5
            r3 = 60000(0xea60, float:8.4078E-41)
            int r0 = r0.nextInt(r3)     // Catch: java.lang.Throwable -> L65
            int r0 = r0 - r4
            goto L27
        L3d:
            r0 = r2[r6]     // Catch: java.lang.Throwable -> L65
            r2 = r0
        L40:
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r2 <= r0) goto L46
            r2 = r0
        L46:
            java.util.ArrayList r0 = com.tendcloud.tenddata.a.getFeaturesList()     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L65
        L4e:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L65
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L65
            com.tendcloud.tenddata.a r3 = (com.tendcloud.tenddata.a) r3     // Catch: java.lang.Throwable -> L65
            android.os.Handler r4 = r7.f11618k     // Catch: java.lang.Throwable -> L65
            android.os.Message r3 = android.os.Message.obtain(r4, r1, r3)     // Catch: java.lang.Throwable -> L65
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L65
            r4.sendMessageDelayed(r3, r5)     // Catch: java.lang.Throwable -> L65
            goto L4e
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.co.b():void");
    }

    public final void onTDEBEventForwardRequest(bu buVar) {
        if (buVar != null && ab.f11351g != null) {
            if (buVar.f11567b.equals(bu.a.IMMEDIATELY)) {
                if (this.f11618k.hasMessages(5, buVar.f11566a)) {
                    this.f11618k.removeMessages(5);
                }
                Message.obtain(this.f11618k, 5, buVar.f11566a).sendToTarget();
            } else if (buVar.f11567b.equals(bu.a.HIGH)) {
                if (this.f11618k.hasMessages(5)) {
                    this.f11618k.removeMessages(5);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11616e;
                long j5 = ab.aa;
                long abs = Math.abs(elapsedRealtime - ab.aa);
                if (abs <= ab.aa) {
                    j5 = abs;
                }
                this.f11618k.sendMessageDelayed(Message.obtain(this.f11618k, 5, buVar.f11566a), j5);
            }
        }
    }

    private void a(String str, a aVar, boolean z4) {
        String str2 = "[" + aVar.name() + "] " + str;
        int index = aVar.index();
        if (index != 0 && index != 1 && index != 3 && index != 99 && index != 7 && index != 8) {
            h.iForInternal(str2);
        } else if (z4) {
            h.iForDeveloper(str2);
        } else {
            h.dForInternal(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        boolean a5;
        TreeSet<cq> a6;
        byte[] bArr;
        if (o.b(ab.f11351g) && aVar.needToSendData()) {
            boolean z4 = false;
            try {
                a5 = n.a(n.b.getFeatureLockFileName(aVar.index()));
            } catch (Throwable unused) {
            }
            if (!a5) {
                if (a5) {
                    n.releaseFileLock(n.b.getFeatureLockFileName(aVar.index()));
                    return;
                }
                return;
            }
            try {
                a6 = cp.a().a(aVar);
            } catch (Throwable unused2) {
                z4 = a5;
                if (!z4) {
                    return;
                }
                n.releaseFileLock(n.b.getFeatureLockFileName(aVar.index()));
                return;
            }
            if (a6 != null && a6.size() > 0) {
                a("New local data found!", aVar, false);
                byte[] a7 = a(a6, y.f(a(a6)));
                ap apVar = new ap();
                if (aVar.name().equals("PUSH")) {
                    bArr = null;
                } else {
                    bArr = u.a(a7);
                    apVar.a("decrypt-version", ab.O);
                }
                if (bArr != null) {
                    a7 = bArr;
                }
                CRC32 crc32 = f11609b;
                crc32.reset();
                crc32.update(a7);
                if (a7 != null && a7.length > 0) {
                    a("Submit local data to collector server ...", aVar, true);
                }
                StringBuilder sb = new StringBuilder(aVar.name().equals("SDK") ? s.b(ab.f11351g, ab.f11367w, ab.C, aVar.getUrl()) : aVar.getUrl());
                if (aVar.name().equals("TRACKING")) {
                    sb.append("/" + Long.toHexString(crc32.getValue()));
                    sb.append("/1");
                } else {
                    sb.append("/" + Long.toHexString(crc32.getValue()));
                }
                ar a8 = al.a(al.a().url(sb.toString()).body(new an(an.a.EMPTY, a7)).method(aq.POST).cert(aVar.getCert()).header(apVar).host(aVar.name().equals("SDK") ? s.b(ab.f11351g, ab.f11367w, ab.D, aVar.getHost()) : aVar.getHost()).ip(aVar.getIP()).build(), aVar);
                if (a8.b() == 200) {
                    this.f11616e = SystemClock.elapsedRealtime();
                    this.f11617f = true;
                    cp.a().sendMessageSuccess(aVar);
                    a("Data submitted successfully!", aVar, true);
                    ab.X.set(0);
                } else {
                    ab.X.incrementAndGet();
                    cp.a().sendMessageFaild(aVar);
                    this.f11617f = false;
                    a("Failed to submit data! Response code " + a8.b(), aVar, true);
                }
                if (a5) {
                    n.releaseFileLock(n.b.getFeatureLockFileName(aVar.index()));
                    return;
                }
                return;
            }
            a("No new data found!", aVar, false);
            if (a5) {
                n.releaseFileLock(n.b.getFeatureLockFileName(aVar.index()));
            }
        }
    }

    private static String a(TreeSet<cq> treeSet) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<cq> it = treeSet.iterator();
        while (it.hasNext()) {
            cq next = it.next();
            if (next.c() != null && next.c().length > 0) {
                sb.append(new String(next.c()));
                sb.append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    private static byte[] a(TreeSet<cq> treeSet, byte[] bArr) {
        int size;
        try {
            if (bArr.length < 65536 || (size = treeSet.size()) == 1) {
                return bArr;
            }
            for (int i5 = 0; i5 < size / 2; i5++) {
                treeSet.pollLast();
            }
            return a(treeSet, y.f(a(treeSet)));
        } catch (Throwable unused) {
            return bArr;
        }
    }

    public static byte[] a(byte[] bArr) {
        BufferedInputStream bufferedInputStream;
        byte[] bArr2 = new byte[2048];
        try {
            bufferedInputStream = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(bArr), new Inflater(false)));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = bufferedInputStream.read(bArr2);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            } catch (Exception unused) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Exception unused2) {
            bufferedInputStream = null;
        }
    }

    public static co a() {
        if (f11614i == null) {
            synchronized (co.class) {
                if (f11614i == null) {
                    f11614i = new co();
                }
            }
        }
        return f11614i;
    }
}
