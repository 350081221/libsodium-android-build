package f0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    public static volatile e f16060g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f16061h = false;

    /* renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f16067f;

    /* renamed from: a, reason: collision with root package name */
    public a f16062a = new a("udid");

    /* renamed from: b, reason: collision with root package name */
    public a f16063b = new a("oaid");

    /* renamed from: d, reason: collision with root package name */
    public a f16065d = new a("vaid");

    /* renamed from: c, reason: collision with root package name */
    public a f16064c = new a(com.huawei.agconnect.credential.obs.c.f7851a);

    /* renamed from: e, reason: collision with root package name */
    public c f16066e = new c();

    public static d a(Cursor cursor) {
        String str;
        d dVar = new d(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else {
            if (!cursor.isClosed()) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex(t0.b.f22420d);
                if (columnIndex >= 0) {
                    dVar.f16057a = cursor.getString(columnIndex);
                } else {
                    e("parseValue fail, index < 0.");
                }
                int columnIndex2 = cursor.getColumnIndex(PluginConstants.KEY_ERROR_CODE);
                if (columnIndex2 >= 0) {
                    dVar.f16058b = cursor.getInt(columnIndex2);
                } else {
                    e("parseCode fail, index < 0.");
                }
                int columnIndex3 = cursor.getColumnIndex("expired");
                if (columnIndex3 >= 0) {
                    dVar.f16059c = cursor.getLong(columnIndex3);
                } else {
                    e("parseExpired fail, index < 0.");
                }
                return dVar;
            }
            str = "parseValue fail, cursor is closed.";
        }
        e(str);
        return dVar;
    }

    public static final e b() {
        if (f16060g == null) {
            synchronized (e.class) {
                if (f16060g == null) {
                    f16060g = new e();
                }
            }
        }
        return f16060g;
    }

    public static String d(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    public static void e(String str) {
        if (f16061h) {
            Log.d("OpenIdManager", str);
        }
    }

    public static void f(boolean z4) {
        f16061h = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ("0".equals(r8.f16057a) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r7 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(android.content.Context r8) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            e(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3 = 0
            r4 = 0
            java.lang.String r8 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r7 == 0) goto L39
            f0.d r8 = a(r7)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            int r1 = r8.f16058b     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r1) goto L34
            java.lang.String r1 = "0"
            java.lang.String r8 = r8.f16057a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r8 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r7.close()
            return r0
        L39:
            if (r7 == 0) goto L59
            goto L56
        L3c:
            r8 = move-exception
            goto L5a
        L3e:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "querySupport, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L3c
            r1.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            e(r8)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L59
        L56:
            r7.close()
        L59:
            return r0
        L5a:
            if (r7 == 0) goto L5f
            r7.close()
        L5f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e.g(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String i(android.content.Context r10, f0.a r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r11.f16051c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            e(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            r3 = 0
            r4 = 0
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            java.lang.String r6 = r11.f16051c     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            r8 = 0
            r5[r8] = r6     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            if (r1 == 0) goto L7b
            f0.d r2 = a(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r0 = r2.f16057a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.c(r0)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            long r3 = r2.f16059c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.b(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r3 = r2.f16058b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.a(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = r11.f16051c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3.append(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = " errorCode : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r11 = r11.f16052d     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3.append(r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            e(r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r11 = r2.f16058b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r2) goto L8f
            r9.k(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            boolean r11 = r9.h(r10, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r11 != 0) goto L8f
            boolean r10 = r9.h(r10, r7)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r11 = "not support, forceQuery isSupported: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
        L76:
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L8c
        L7b:
            boolean r11 = r9.h(r10, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r11 == 0) goto L8f
            boolean r10 = r9.h(r10, r7)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r11 = "forceQuery isSupported : "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L76
        L8c:
            e(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
        L8f:
            if (r1 == 0) goto Lbb
            goto Lb6
        L92:
            r10 = move-exception
            r0 = r1
            goto Lbc
        L95:
            r10 = move-exception
            r11 = r0
            r0 = r1
            goto L9d
        L99:
            r10 = move-exception
            goto Lbc
        L9b:
            r10 = move-exception
            r11 = r0
        L9d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "queryId, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L99
            r1.append(r10)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L99
            e(r10)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto Lba
            r1 = r0
            r0 = r11
        Lb6:
            r1.close()
            goto Lbb
        Lba:
            r0 = r11
        Lbb:
            return r0
        Lbc:
            if (r0 == 0) goto Lc1
            r0.close()
        Lc1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e.i(android.content.Context, f0.a):java.lang.String");
    }

    public static String j(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            e("getAppVersion, Exception : " + e5.getMessage());
            return null;
        }
    }

    private synchronized void k(Context context) {
        if (this.f16067f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        com.alipay.sdk.m.i0.e eVar = new com.alipay.sdk.m.i0.e();
        this.f16067f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    public final String c(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.d()) {
                return aVar.f16050b;
            }
            if (h(context, true)) {
                return i(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        e(str);
        return null;
    }

    public final boolean h(Context context, boolean z4) {
        if (this.f16066e.b() && !z4) {
            return this.f16066e.e();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String d5 = d(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(d5)) {
            return false;
        }
        String j5 = j(packageManager, d5);
        if (this.f16066e.b() && this.f16066e.c(j5)) {
            e("use same version cache, safeVersion : ".concat(String.valueOf(j5)));
            return this.f16066e.e();
        }
        this.f16066e.d(j5);
        boolean g5 = g(context);
        e("query support, result : ".concat(String.valueOf(g5)));
        this.f16066e.a(g5);
        return g5;
    }
}
