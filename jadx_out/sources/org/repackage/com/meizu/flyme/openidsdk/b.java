package org.repackage.com.meizu.flyme.openidsdk;

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
import com.huawei.agconnect.credential.obs.c;

/* loaded from: classes4.dex */
class b {

    /* renamed from: e, reason: collision with root package name */
    private static volatile b f22115e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f22116f = false;

    /* renamed from: h, reason: collision with root package name */
    private BroadcastReceiver f22122h;

    /* renamed from: a, reason: collision with root package name */
    OpenId f22117a = new OpenId("udid");

    /* renamed from: b, reason: collision with root package name */
    OpenId f22118b = new OpenId("oaid");

    /* renamed from: d, reason: collision with root package name */
    OpenId f22120d = new OpenId("vaid");

    /* renamed from: c, reason: collision with root package name */
    OpenId f22119c = new OpenId(c.f7851a);

    /* renamed from: g, reason: collision with root package name */
    private SupportInfo f22121g = new SupportInfo();

    private b() {
    }

    private static String a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    private static ValueData a(Cursor cursor) {
        String str;
        ValueData valueData = new ValueData(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else {
            if (!cursor.isClosed()) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex(t0.b.f22420d);
                if (columnIndex >= 0) {
                    valueData.f22112a = cursor.getString(columnIndex);
                } else {
                    a("parseValue fail, index < 0.");
                }
                int columnIndex2 = cursor.getColumnIndex(PluginConstants.KEY_ERROR_CODE);
                if (columnIndex2 >= 0) {
                    valueData.f22113b = cursor.getInt(columnIndex2);
                } else {
                    a("parseCode fail, index < 0.");
                }
                int columnIndex3 = cursor.getColumnIndex("expired");
                if (columnIndex3 >= 0) {
                    valueData.f22114c = cursor.getLong(columnIndex3);
                } else {
                    a("parseExpired fail, index < 0.");
                }
                return valueData;
            }
            str = "parseValue fail, cursor is closed.";
        }
        a(str);
        return valueData;
    }

    public static final b a() {
        if (f22115e == null) {
            synchronized (b.class) {
                if (f22115e == null) {
                    f22115e = new b();
                }
            }
        }
        return f22115e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        if (f22116f) {
            Log.d("OpenIdManager", str);
        }
    }

    public static void a(boolean z4) {
        f22116f = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if ("0".equals(r8.f22112a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r8) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r3 = 0
            r4 = 0
            java.lang.String r8 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r7 == 0) goto L39
            org.repackage.com.meizu.flyme.openidsdk.ValueData r8 = a(r7)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            int r1 = r8.f22113b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r1) goto L34
            java.lang.String r1 = "0"
            java.lang.String r8 = r8.f22112a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r8 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r7.close()
            return r0
        L39:
            if (r7 == 0) goto L5a
        L3b:
            r7.close()
            goto L5a
        L3f:
            r8 = move-exception
            goto L5b
        L41:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "querySupport, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L3f
            r1.append(r8)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            a(r8)     // Catch: java.lang.Throwable -> L3f
            if (r7 == 0) goto L5a
            goto L3b
        L5a:
            return r0
        L5b:
            if (r7 == 0) goto L60
            r7.close()
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.meizu.flyme.openidsdk.b.a(android.content.Context):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(android.content.Context r10, org.repackage.com.meizu.flyme.openidsdk.OpenId r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r11.f22106c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            r3 = 0
            r4 = 0
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.String r6 = r11.f22106c     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            r8 = 0
            r5[r8] = r6     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 == 0) goto L7e
            org.repackage.com.meizu.flyme.openidsdk.ValueData r2 = a(r1)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r0 = r2.f22112a     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r11.a(r0)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            long r3 = r2.f22114c     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r11.a(r3)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            int r3 = r2.f22113b     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r11.a(r3)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.<init>()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r4 = r11.f22106c     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.append(r4)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r4 = " errorCode : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            int r11 = r11.f22107d     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.append(r11)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            a(r11)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            int r11 = r2.f22113b     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r2) goto L93
            r9.b(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r11 != 0) goto L93
            boolean r10 = r9.a(r10, r7)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r11 = "not support, forceQuery isSupported: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
        L7a:
            a(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            goto L93
        L7e:
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            if (r11 == 0) goto L93
            boolean r10 = r9.a(r10, r7)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r11 = "forceQuery isSupported : "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            goto L7a
        L93:
            if (r1 == 0) goto Lbf
            r1.close()
            goto Lbf
        L99:
            r10 = move-exception
            r0 = r1
            goto Lc0
        L9c:
            r10 = move-exception
            r11 = r0
            r0 = r1
            goto La4
        La0:
            r10 = move-exception
            goto Lc0
        La2:
            r10 = move-exception
            r11 = r0
        La4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "queryId, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La0
            r1.append(r10)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> La0
            a(r10)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto Lbe
            r0.close()
        Lbe:
            r0 = r11
        Lbf:
            return r0
        Lc0:
            if (r0 == 0) goto Lc5
            r0.close()
        Lc5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.meizu.flyme.openidsdk.b.b(android.content.Context, org.repackage.com.meizu.flyme.openidsdk.OpenId):java.lang.String");
    }

    private static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            a("getAppVersion, Exception : " + e5.getMessage());
            return null;
        }
    }

    private synchronized void b(Context context) {
        if (this.f22122h != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        a aVar = new a();
        this.f22122h = aVar;
        context.registerReceiver(aVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(Context context, OpenId openId) {
        String str;
        if (openId == null) {
            str = "getId, openId = null.";
        } else {
            if (openId.a()) {
                return openId.f22105b;
            }
            if (a(context, true)) {
                return b(context, openId);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Context context, boolean z4) {
        if (this.f22121g.a() && !z4) {
            return this.f22121g.b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String a5 = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(a5)) {
            return false;
        }
        String b5 = b(packageManager, a5);
        if (this.f22121g.a() && this.f22121g.a(b5)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(b5)));
            return this.f22121g.b();
        }
        this.f22121g.b(b5);
        boolean a6 = a(context);
        a("query support, result : ".concat(String.valueOf(a6)));
        this.f22121g.a(a6);
        return a6;
    }
}
