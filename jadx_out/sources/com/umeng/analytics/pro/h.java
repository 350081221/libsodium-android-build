package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Instrumented
/* loaded from: classes3.dex */
public class h {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r12, android.database.sqlite.SQLiteDatabase r13) {
        /*
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.String r2 = "count(*)"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            java.lang.String r2 = "table"
            r7[r0] = r2     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            r2 = 1
            r7[r2] = r12     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            java.lang.String r4 = "sqlite_master"
            java.lang.String r6 = "type=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            boolean r12 = r13 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            if (r12 != 0) goto L2f
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r13
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            goto L34
        L2f:
            r3 = r13
            android.database.Cursor r12 = com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.query(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
        L34:
            r1 = r12
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            if (r12 == 0) goto L42
            int r12 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            if (r12 <= 0) goto L42
            r0 = r2
        L42:
            r1.close()
            goto L50
        L46:
            r12 = move-exception
            if (r1 == 0) goto L4c
            r1.close()
        L4c:
            throw r12
        L4d:
            if (r1 == 0) goto L50
            goto L42
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.h.a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    public static String b(Context context) {
        return context.getDatabasePath(e.f12518b).getParent() + File.separator;
    }

    public static String c(Context context) {
        return b(context) + e.f12517a;
    }

    public static List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return arrayList;
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(e.f12518b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            f.a(context).a();
        } catch (Throwable unused) {
        }
    }

    public static String a(List<String> list) {
        return TextUtils.join("!", list);
    }

    public static List<String> a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r9.isClosed() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r9.isClosed() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.database.sqlite.SQLiteDatabase r18, java.lang.String r19, java.lang.String r20) {
        /*
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = 0
            r9 = 0
            java.lang.String r17 = "LIMIT 0"
            r1 = r18
            boolean r2 = r1 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4e
            if (r2 != 0) goto L1e
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = r18
            r11 = r19
            android.database.Cursor r1 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4e
            goto L28
        L1e:
            r1 = r18
            r2 = r19
            r8 = r17
            android.database.Cursor r1 = com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4e
        L28:
            r9 = r1
            if (r9 == 0) goto L35
            r1 = r20
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L4e
            r2 = -1
            if (r1 == r2) goto L35
            r0 = 1
        L35:
            if (r9 == 0) goto L57
            boolean r1 = r9.isClosed()
            if (r1 != 0) goto L57
        L3d:
            r9.close()
            goto L57
        L41:
            r0 = move-exception
            if (r9 == 0) goto L4d
            boolean r1 = r9.isClosed()
            if (r1 != 0) goto L4d
            r9.close()
        L4d:
            throw r0
        L4e:
            if (r9 == 0) goto L57
            boolean r1 = r9.isClosed()
            if (r1 != 0) goto L57
            goto L3d
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.h.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        String str4 = "alter table " + str + " add " + str2 + " " + str3;
        if (sQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, str4);
        } else {
            sQLiteDatabase.execSQL(str4);
        }
    }
}
