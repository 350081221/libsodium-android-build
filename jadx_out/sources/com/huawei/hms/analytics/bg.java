package com.huawei.hms.analytics;

import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class bg {
    @SafeVarargs
    public static void klm(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a<?, ?>>... clsArr) {
        for (int i5 = 0; i5 <= 0; i5++) {
            String str = new org.greenrobot.greendao.internal.a(aVar, clsArr[0]).f21362b;
            aVar.execSQL("ALTER TABLE " + str + " RENAME TO " + (str + "_TEMP"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.String> lmn(org.greenrobot.greendao.database.a r3, java.lang.String r4) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r2 = "SELECT * FROM "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r1.append(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r4 = " limit 1"
            r1.append(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            android.database.Cursor r0 = r3.b(r4, r0)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r0 == 0) goto L2b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String[] r4 = r0.getColumnNames()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r0.close()
            return r3
        L2b:
            if (r0 == 0) goto L3c
            goto L39
        L2e:
            r3 = move-exception
            goto L42
        L30:
            java.lang.String r3 = "MigrationDB"
            java.lang.String r4 = "rawQuery Exception."
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r4)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L3c
        L39:
            r0.close()
        L3c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L42:
            if (r0 == 0) goto L47
            r0.close()
        L47:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.bg.lmn(org.greenrobot.greendao.database.a, java.lang.String):java.util.List");
    }

    @SafeVarargs
    public static void lmn(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a<?, ?>>... clsArr) {
        String str;
        loop0: for (int i5 = 0; i5 <= 0; i5++) {
            org.greenrobot.greendao.internal.a aVar2 = new org.greenrobot.greendao.internal.a(aVar, clsArr[i5]);
            String str2 = aVar2.f21362b;
            String str3 = str2 + "_TEMP";
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = aVar2.f21363c.length;
            for (int i6 = 0; i6 < length; i6++) {
                String str4 = aVar2.f21363c[i6].f21360e;
                if (lmn(aVar, str3).contains(str4)) {
                    arrayList.add(str4);
                    arrayList2.add(str4);
                } else {
                    try {
                        Class<?> cls = aVar2.f21363c[i6].f21357b;
                        if (cls.equals(String.class)) {
                            str = "TEXT";
                        } else {
                            if (!cls.equals(Long.class) && !cls.equals(Integer.class) && !cls.equals(Long.TYPE) && !cls.equals(Integer.TYPE)) {
                                if (!cls.equals(Boolean.class) && !cls.equals(Boolean.TYPE)) {
                                    throw new Exception("Migration Helper types does not match current parameter");
                                    break loop0;
                                }
                                str = "BOOLEAN";
                            }
                            str = "INTEGER";
                        }
                        if (str.equals("INTEGER")) {
                            arrayList2.add("0 as ".concat(String.valueOf(str4)));
                            arrayList.add(str4);
                        }
                    } catch (Exception e5) {
                        HiLog.w("MigrationDB", e5.getMessage());
                    }
                }
            }
            aVar.execSQL("INSERT INTO " + str2 + " (" + TextUtils.join(",", arrayList) + ") SELECT " + TextUtils.join(",", arrayList2) + " FROM " + str3 + a1.i.f136b);
            aVar.execSQL("DROP TABLE ".concat(String.valueOf(str3)));
        }
    }
}
