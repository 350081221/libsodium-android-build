package com.bytedance.pangle.servermanager;

import com.bytedance.pangle.c;
import com.bytedance.pangle.e;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f4574a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4575b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4576c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Boolean> f4577d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, e> f4578e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static c f4579f;

    public static e a(String str) {
        Boolean bool = f4577d.get(str);
        if (bool == null || !bool.booleanValue()) {
            f4578e.remove(str);
        }
        Map<String, e> map = f4578e;
        if (map.get(str) == null) {
            synchronized (f4575b) {
                e eVar = (e) a("service", str);
                if (eVar == null) {
                    ZeusLogger.errReport(ZeusLogger.TAG_SERVER, "getServiceManager failed!!!");
                    return null;
                }
                map.put(str, eVar);
            }
        }
        return map.get(str);
    }

    public static c a() {
        Boolean bool = f4577d.get(TTAdSdk.S_C);
        if (bool == null || !bool.booleanValue()) {
            f4579f = null;
        }
        if (f4579f == null) {
            synchronized (f4576c) {
                c cVar = (c) a("package", TTAdSdk.S_C);
                if (cVar == null) {
                    ZeusLogger.errReport(ZeusLogger.TAG_SERVER, "getPackageManager failed!!!");
                    return null;
                }
                f4579f = cVar;
            }
        }
        return f4579f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[Catch: RemoteException -> 0x0099, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0099, blocks: (B:14:0x0056, B:23:0x008f, B:26:0x0094, B:28:0x0076, B:31:0x0080), top: B:13:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: RemoteException -> 0x0099, TryCatch #0 {RemoteException -> 0x0099, blocks: (B:14:0x0056, B:23:0x008f, B:26:0x0094, B:28:0x0076, B:31:0x0080), top: B:13:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.os.IInterface a(java.lang.String r5, final java.lang.String r6) {
        /*
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 == 0) goto Lb3
            java.util.HashMap r0 = com.bytedance.pangle.Zeus.getServerManagerHashMap()
            java.lang.Object r0 = r0.get(r6)
            android.content.pm.ProviderInfo r0 = (android.content.pm.ProviderInfo) r0
            if (r0 == 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "content://"
            r1.<init>(r2)
            java.lang.String r0 = r0.authority
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.app.Application r1 = com.bytedance.pangle.Zeus.getAppApplication()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "query_binder"
            r3 = 0
            android.os.Bundle r0 = r1.call(r0, r2, r5, r3)
            if (r0 == 0) goto L4d
            java.lang.Class<com.bytedance.pangle.servermanager.AbsServerManager> r1 = com.bytedance.pangle.servermanager.AbsServerManager.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            java.lang.String r1 = "binder"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.bytedance.pangle.servermanager.a r0 = (com.bytedance.pangle.servermanager.a) r0
            if (r0 == 0) goto L4d
            android.os.IBinder r0 = r0.f4573a
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto La1
            boolean r1 = r0.isBinderAlive()
            if (r1 == 0) goto La1
            com.bytedance.pangle.servermanager.b$1 r1 = new com.bytedance.pangle.servermanager.b$1     // Catch: android.os.RemoteException -> L99
            r1.<init>()     // Catch: android.os.RemoteException -> L99
            r2 = 0
            r0.linkToDeath(r1, r2)     // Catch: android.os.RemoteException -> L99
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.bytedance.pangle.servermanager.b.f4577d     // Catch: android.os.RemoteException -> L99
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: android.os.RemoteException -> L99
            r1.put(r6, r4)     // Catch: android.os.RemoteException -> L99
            int r6 = r5.hashCode()     // Catch: android.os.RemoteException -> L99
            r1 = -807062458(0xffffffffcfe53446, float:-7.6908165E9)
            r4 = 1
            if (r6 == r1) goto L80
            r1 = 1984153269(0x7643c6b5, float:9.927033E32)
            if (r6 == r1) goto L76
            goto L89
        L76:
            java.lang.String r6 = "service"
            boolean r5 = r5.equals(r6)     // Catch: android.os.RemoteException -> L99
            if (r5 == 0) goto L89
            r2 = r4
            goto L8a
        L80:
            java.lang.String r6 = "package"
            boolean r5 = r5.equals(r6)     // Catch: android.os.RemoteException -> L99
            if (r5 == 0) goto L89
            goto L8a
        L89:
            r2 = -1
        L8a:
            if (r2 == 0) goto L94
            if (r2 == r4) goto L8f
            goto La1
        L8f:
            com.bytedance.pangle.e r5 = com.bytedance.pangle.e.a.a(r0)     // Catch: android.os.RemoteException -> L99
            return r5
        L94:
            com.bytedance.pangle.c r5 = com.bytedance.pangle.c.a.a(r0)     // Catch: android.os.RemoteException -> L99
            return r5
        L99:
            r5 = move-exception
            java.lang.String r6 = "Zeus/server_pangle"
            java.lang.String r0 = "generateServerManager failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r6, r0, r5)
        La1:
            return r3
        La2:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "宿主中没有找对对应进程的serverManager "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
        Lb3:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "generateServerManager 请先初始化Zeus, processName:"
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.servermanager.b.a(java.lang.String, java.lang.String):android.os.IInterface");
    }
}
