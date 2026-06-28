package com.bytedance.tools.d;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class g {
    public static String a(Context context, int i5) {
        Cursor cursor = null;
        try {
            try {
                cursor = d.b(context, "setting_global_info", new String[]{bm.f12336d, t0.b.f22420d}, "_id=?", new String[]{String.valueOf(i5)}, null, null, null);
                while (cursor.moveToNext()) {
                    try {
                        String g5 = b.g(cursor.getString(cursor.getColumnIndex(t0.b.f22420d)));
                        cursor.close();
                        return g5;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                if (cursor == null) {
                    return "";
                }
            }
            return "";
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (0 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.Integer, com.bytedance.tools.c.a> b(android.content.Context r12) {
        /*
            java.lang.String r0 = "value"
            java.lang.String r1 = "_id"
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            java.lang.String r5 = "setting_global_info"
            java.lang.String[] r6 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            android.database.Cursor r3 = com.bytedance.tools.d.d.b(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r3 != 0) goto L23
            if (r3 == 0) goto L22
            r3.close()
        L22:
            return r2
        L23:
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r12 == 0) goto L60
            int r12 = r3.getColumnIndex(r1)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            int r12 = r3.getInt(r12)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            int r4 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            com.bytedance.tools.c.a r5 = new com.bytedance.tools.c.a     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            java.lang.String r4 = com.bytedance.tools.d.b.g(r4)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            java.lang.String r6 = "null"
            boolean r6 = r6.equals(r4)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            if (r6 == 0) goto L4c
            java.lang.String r4 = ""
        L4c:
            r5.h(r4)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            r2.put(r12, r5)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L57
            goto L23
        L57:
            r12 = move-exception
            if (r3 == 0) goto L5d
            r3.close()
        L5d:
            throw r12
        L5e:
            if (r3 == 0) goto L63
        L60:
            r3.close()
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tools.d.g.b(android.content.Context):java.util.Map");
    }

    public static synchronized void c(Context context, int i5, String str) {
        synchronized (g.class) {
            if (TextUtils.isEmpty(str)) {
                str = "null";
            }
            String c5 = b.c(str);
            ContentValues contentValues = new ContentValues();
            contentValues.put(bm.f12336d, Integer.valueOf(i5));
            contentValues.put(t0.b.f22420d, c5);
            d.a(context, "setting_global_info", contentValues, "_id=?", new String[]{String.valueOf(i5)});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (0 != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto L7c
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Le
            goto L7c
        Le:
            r0 = 0
            java.lang.String r2 = "android.content.res.AssetManager"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.String r4 = "addAssetPath"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r1] = r7     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            r4[r1] = r8     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.Object r8 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            java.lang.String r3 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r0 = r2.openXmlResourceParser(r8, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            if (r0 != 0) goto L48
            if (r0 == 0) goto L47
            r0.close()
        L47:
            return r1
        L48:
            int r8 = r0.next()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            if (r8 == r5) goto L79
            int r8 = r0.getEventType()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            r2 = 2
            if (r8 != r2) goto L48
            java.lang.String r8 = "uses-permission"
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            if (r8 == 0) goto L48
            java.lang.String r8 = r0.getAttributeValue(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L77
            if (r8 == 0) goto L48
            r0.close()
            return r5
        L70:
            r8 = move-exception
            if (r0 == 0) goto L76
            r0.close()
        L76:
            throw r8
        L77:
            if (r0 == 0) goto L7c
        L79:
            r0.close()
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tools.d.g.d(java.lang.String, java.lang.String):boolean");
    }

    public static List<com.bytedance.tools.c.a> e(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z4;
        if (context != null && context.getApplicationContext() != null) {
            ArrayList arrayList = new ArrayList();
            Map<Integer, com.bytedance.tools.c.a> b5 = b(context);
            String str11 = "0";
            if (b5.containsKey(1)) {
                com.bytedance.tools.c.a aVar = b5.get(1);
                aVar.c("SDK初始化");
                arrayList.add(aVar);
            } else {
                com.bytedance.tools.c.a aVar2 = new com.bytedance.tools.c.a();
                aVar2.c("SDK初始化");
                aVar2.h("0");
                arrayList.add(aVar2);
            }
            if (b5.containsKey(2)) {
                com.bytedance.tools.c.a aVar3 = b5.get(2);
                aVar3.c("代码混淆");
                arrayList.add(aVar3);
            } else {
                com.bytedance.tools.c.a aVar4 = new com.bytedance.tools.c.a();
                aVar4.c("代码混淆");
                aVar4.h("0");
                arrayList.add(aVar4);
            }
            if (b5.containsKey(3)) {
                com.bytedance.tools.c.a aVar5 = b5.get(3);
                aVar5.c("provider");
                arrayList.add(aVar5);
            } else {
                com.bytedance.tools.c.a aVar6 = new com.bytedance.tools.c.a();
                aVar6.c("provider");
                aVar6.h("0");
                arrayList.add(aVar6);
            }
            if (b5.containsKey(14)) {
                com.bytedance.tools.c.a aVar7 = b5.get(14);
                aVar7.c("UseTextureView");
                arrayList.add(aVar7);
            } else {
                com.bytedance.tools.c.a aVar8 = new com.bytedance.tools.c.a();
                aVar8.c("UseTextureView");
                aVar8.h("0");
                arrayList.add(aVar8);
            }
            com.bytedance.tools.c.a aVar9 = new com.bytedance.tools.c.a();
            aVar9.c("反馈功能初始化");
            if (!com.bytedance.tools.b.b.e()) {
                str = "0";
            } else {
                str = "1";
            }
            aVar9.h(str);
            arrayList.add(aVar9);
            com.bytedance.tools.c.a aVar10 = new com.bytedance.tools.c.a();
            aVar10.c("直播配置");
            ArrayList arrayList2 = new ArrayList();
            if (b5.containsKey(21)) {
                com.bytedance.tools.c.a aVar11 = b5.get(21);
                aVar11.c("直播PL安装(" + h.b("com.byted.live.lite") + ")");
                arrayList2.add(aVar11);
            } else {
                com.bytedance.tools.c.a aVar12 = new com.bytedance.tools.c.a();
                aVar12.c("直播PL安装(" + h.b("com.byted.live.lite") + ")");
                aVar12.h("0");
                arrayList2.add(aVar12);
            }
            if (b5.containsKey(20)) {
                com.bytedance.tools.c.a aVar13 = b5.get(20);
                aVar13.c("直播SDK初始化(" + h.c("com.byted.live.lite") + ")");
                arrayList2.add(aVar13);
            } else {
                com.bytedance.tools.c.a aVar14 = new com.bytedance.tools.c.a();
                aVar14.c("直播SDK初始化(" + h.c("com.byted.live.lite") + ")");
                aVar14.h("0");
                arrayList2.add(aVar14);
            }
            aVar10.d(arrayList2);
            aVar10.b(1);
            arrayList.add(aVar10);
            com.bytedance.tools.c.a aVar15 = new com.bytedance.tools.c.a();
            aVar15.c("权限配置");
            ArrayList arrayList3 = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            com.bytedance.tools.c.a aVar16 = new com.bytedance.tools.c.a();
            aVar16.c("INTERNET");
            if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) != 0) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            aVar16.h(str2);
            arrayList3.add(aVar16);
            com.bytedance.tools.c.a aVar17 = new com.bytedance.tools.c.a();
            aVar17.c("READ_PHONE_STATE");
            if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) != 0) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            aVar17.h(str3);
            arrayList3.add(aVar17);
            com.bytedance.tools.c.a aVar18 = new com.bytedance.tools.c.a();
            aVar18.c("ACCESS_NETWORK_STATE");
            if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            aVar18.h(str4);
            arrayList3.add(aVar18);
            com.bytedance.tools.c.a aVar19 = new com.bytedance.tools.c.a();
            aVar19.c("WRITE_EXTERNAL_STORAGE");
            if (packageManager.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) != 0) {
                str5 = "0";
            } else {
                str5 = "1";
            }
            aVar19.h(str5);
            arrayList3.add(aVar19);
            com.bytedance.tools.c.a aVar20 = new com.bytedance.tools.c.a();
            aVar20.c("ACCESS_WIFI_STATE");
            if (packageManager.checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) != 0) {
                str6 = "0";
            } else {
                str6 = "1";
            }
            aVar20.h(str6);
            arrayList3.add(aVar20);
            com.bytedance.tools.c.a aVar21 = new com.bytedance.tools.c.a();
            aVar21.c("ACCESS_COARSE_LOCATION");
            if (packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) != 0) {
                str7 = "0";
            } else {
                str7 = "1";
            }
            aVar21.h(str7);
            arrayList3.add(aVar21);
            com.bytedance.tools.c.a aVar22 = new com.bytedance.tools.c.a();
            aVar22.c("REQUEST_INSTALL_PACKAGES");
            if (!d(context.getApplicationContext().getPackageResourcePath(), "android.permission.REQUEST_INSTALL_PACKAGES")) {
                str8 = "0";
            } else {
                str8 = "1";
            }
            aVar22.h(str8);
            arrayList3.add(aVar22);
            com.bytedance.tools.c.a aVar23 = new com.bytedance.tools.c.a();
            aVar23.c("GET_TASKS");
            if (packageManager.checkPermission("android.permission.GET_TASKS", context.getPackageName()) != 0) {
                str9 = "0";
            } else {
                str9 = "1";
            }
            aVar23.h(str9);
            arrayList3.add(aVar23);
            com.bytedance.tools.c.a aVar24 = new com.bytedance.tools.c.a();
            aVar24.c("ACCESS_FINE_LOCATION");
            if (packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()) != 0) {
                str10 = "0";
            } else {
                str10 = "1";
            }
            aVar24.h(str10);
            arrayList3.add(aVar24);
            com.bytedance.tools.c.a aVar25 = new com.bytedance.tools.c.a();
            aVar25.c("WAKE_LOCK");
            if (packageManager.checkPermission("android.permission.WAKE_LOCK", context.getPackageName()) == 0) {
                str11 = "1";
            }
            aVar25.h(str11);
            arrayList3.add(aVar25);
            aVar15.d(arrayList3);
            aVar15.b(1);
            arrayList.add(aVar15);
            com.bytedance.tools.c.a aVar26 = new com.bytedance.tools.c.a();
            aVar26.c("隐私配置");
            ArrayList arrayList4 = new ArrayList();
            if (b5.containsKey(19)) {
                z4 = "1".equals(b5.get(19).i());
            } else {
                z4 = false;
            }
            if (b5.containsKey(7)) {
                com.bytedance.tools.c.a aVar27 = b5.get(7);
                if (z4) {
                    aVar27.m();
                }
                aVar27.c("IS_CAN_USE_LOCATION");
                aVar27.j(7);
                arrayList4.add(aVar27);
            }
            if (b5.containsKey(8)) {
                com.bytedance.tools.c.a aVar28 = b5.get(8);
                aVar28.c("GET_TT_LOCATION");
                if (z4) {
                    aVar28.m();
                }
                aVar28.g(1);
                aVar28.j(8);
                arrayList4.add(aVar28);
            }
            if (b5.containsKey(9)) {
                com.bytedance.tools.c.a aVar29 = b5.get(9);
                if (z4) {
                    aVar29.m();
                }
                aVar29.c("IS_CAN_USE_PHONESTATE");
                aVar29.j(9);
                arrayList4.add(aVar29);
            }
            if (b5.containsKey(10)) {
                com.bytedance.tools.c.a aVar30 = b5.get(10);
                aVar30.c("GET_DEV_IMEI");
                if (z4) {
                    aVar30.m();
                }
                aVar30.g(1);
                aVar30.j(10);
                arrayList4.add(aVar30);
            }
            if (b5.containsKey(11)) {
                com.bytedance.tools.c.a aVar31 = b5.get(11);
                if (z4) {
                    aVar31.m();
                }
                aVar31.c("IS_CAN_USE_WIFI_STATE");
                aVar31.j(11);
                arrayList4.add(aVar31);
            }
            if (b5.containsKey(12)) {
                com.bytedance.tools.c.a aVar32 = b5.get(12);
                if (z4) {
                    aVar32.m();
                }
                aVar32.c("IS_CAN_USE_WRITE_EXTERNAL");
                aVar32.j(12);
                arrayList4.add(aVar32);
            }
            if (b5.containsKey(13)) {
                com.bytedance.tools.c.a aVar33 = b5.get(13);
                aVar33.c("GET_DEV_OAID");
                if (z4) {
                    aVar33.m();
                }
                aVar33.g(1);
                aVar33.j(13);
                arrayList4.add(aVar33);
            }
            if (b5.containsKey(17)) {
                com.bytedance.tools.c.a aVar34 = b5.get(17);
                if (z4) {
                    aVar34.m();
                }
                aVar34.c("IS_CAN_USE_APP_LIST");
                aVar34.j(17);
                arrayList4.add(aVar34);
            }
            if (b5.containsKey(22)) {
                com.bytedance.tools.c.a aVar35 = b5.get(22);
                if (z4) {
                    aVar35.m();
                }
                aVar35.c("IS_CAN_USE_ANDROID_ID");
                aVar35.j(22);
                arrayList4.add(aVar35);
            }
            if (b5.containsKey(18)) {
                com.bytedance.tools.c.a aVar36 = b5.get(18);
                aVar36.c("GET_DEV_MAC");
                if (z4) {
                    aVar36.m();
                }
                aVar36.g(1);
                aVar36.j(18);
                arrayList4.add(aVar36);
            }
            aVar26.d(arrayList4);
            aVar26.b(1);
            arrayList.add(aVar26);
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (0 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.content.Context r12) {
        /*
            java.lang.String r0 = "value"
            java.lang.String r1 = "_id"
            java.lang.String r2 = "api-access.pangolin-sdk-toutiao1.com"
            r3 = 0
            java.lang.String r5 = "setting_global_info"
            java.lang.String[] r6 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            android.database.Cursor r3 = com.bytedance.tools.d.d.b(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            if (r3 != 0) goto L20
            if (r3 == 0) goto L1f
            r3.close()
        L1f:
            return r2
        L20:
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            if (r12 == 0) goto L4b
            int r12 = r3.getColumnIndex(r1)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            int r12 = r3.getInt(r12)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            int r4 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            r5 = 15
            if (r12 != r5) goto L20
            java.lang.String r12 = com.bytedance.tools.d.b.g(r4)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            r3.close()
            return r12
        L42:
            r12 = move-exception
            if (r3 == 0) goto L48
            r3.close()
        L48:
            throw r12
        L49:
            if (r3 == 0) goto L4e
        L4b:
            r3.close()
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tools.d.g.f(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (0 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(android.content.Context r12) {
        /*
            java.lang.String r0 = "value"
            java.lang.String r1 = "_id"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r5 = "setting_global_info"
            java.lang.String[] r6 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            android.database.Cursor r3 = com.bytedance.tools.d.d.b(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            if (r3 != 0) goto L20
            if (r3 == 0) goto L1f
            r3.close()
        L1f:
            return r2
        L20:
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L49
            if (r12 == 0) goto L4b
            int r12 = r3.getColumnIndex(r1)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            int r12 = r3.getInt(r12)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            int r4 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            r5 = 16
            if (r12 != r5) goto L20
            java.lang.String r12 = com.bytedance.tools.d.b.g(r4)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L42
            r3.close()
            return r12
        L42:
            r12 = move-exception
            if (r3 == 0) goto L48
            r3.close()
        L48:
            throw r12
        L49:
            if (r3 == 0) goto L4e
        L4b:
            r3.close()
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tools.d.g.g(android.content.Context):java.lang.String");
    }
}
