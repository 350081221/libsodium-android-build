package com.umeng.cconfig.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.util.concurrent.atomic.AtomicInteger;

@Instrumented
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static SQLiteOpenHelper f12898c;

    /* renamed from: d, reason: collision with root package name */
    private static Context f12899d;

    /* renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f12900a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f12901b;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f12902a = new b(0);
    }

    private b() {
        this.f12901b = new AtomicInteger();
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a(Context context) {
        if (f12899d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f12899d = applicationContext;
            f12898c = com.umeng.cconfig.a.a.a(applicationContext);
        }
        return a.f12902a;
    }

    public final synchronized SQLiteDatabase a() {
        if (this.f12901b.incrementAndGet() == 1) {
            this.f12900a = f12898c.getWritableDatabase();
        }
        return this.f12900a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        if (r7 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r6.a()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            android.database.sqlite.SQLiteDatabase r2 = r6.f12900a     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r3 = "update  __cc set __a=\"1\" where __ts=\""
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            r2.append(r7)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r7 = "\""
            r2.append(r7)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r2 = "jessie"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r4 = "[DbManager] updateCloudConfigByTimestamp："
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            r3[r0] = r4     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            com.umeng.commonsdk.statistics.common.ULog.i(r2, r3)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            android.database.sqlite.SQLiteDatabase r2 = r6.f12900a     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            boolean r3 = r2 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            if (r3 != 0) goto L3a
            r2.execSQL(r7)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            goto L3d
        L3a:
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r2, r7)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
        L3d:
            android.database.sqlite.SQLiteDatabase r7 = r6.f12900a     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            android.database.sqlite.SQLiteDatabase r7 = r6.f12900a     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L4e
            goto L4b
        L47:
            android.database.sqlite.SQLiteDatabase r7 = r6.f12900a     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L4e
        L4b:
            r7.endTransaction()     // Catch: java.lang.Throwable -> L4e
        L4e:
            r6.b()
            r0 = r1
            goto L61
        L53:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L62
            android.database.sqlite.SQLiteDatabase r7 = r6.f12900a     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L5e
            r7.endTransaction()     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6.b()
        L61:
            return r0
        L62:
            r7 = move-exception
            android.database.sqlite.SQLiteDatabase r0 = r6.f12900a     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6c
            android.database.sqlite.SQLiteDatabase r0 = r6.f12900a     // Catch: java.lang.Throwable -> L6c
            r0.endTransaction()     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.cconfig.a.b.a(java.lang.String):boolean");
    }

    public final synchronized void b() {
        try {
            if (this.f12901b.decrementAndGet() == 0) {
                this.f12900a.close();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0103, code lost:
    
        if (r12 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.cconfig.a.b.b(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        if (r1 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.umeng.cconfig.b.d c() {
        /*
            r11 = this;
            com.umeng.cconfig.b.d r0 = new com.umeng.cconfig.b.d
            r0.<init>()
            r11.a()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r1.beginTransaction()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r1 = "select *  from __cc where __a=\"1\" group by __ts"
            android.database.sqlite.SQLiteDatabase r2 = r11.f12900a     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            boolean r3 = r2 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r4 = 0
            if (r3 != 0) goto L1b
            android.database.Cursor r1 = r2.rawQuery(r1, r4)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            goto L1f
        L1b:
            android.database.Cursor r1 = com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.rawQuery(r2, r1, r4)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
        L1f:
            if (r1 == 0) goto L9e
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            if (r2 == 0) goto L9e
            java.lang.String r2 = "__ts"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r3 = "__c"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r4 = "__a"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r5 = "id"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r1 = r1.getString(r5)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r5.<init>()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r6 = "timeStamp = %s, content = %s, active = %s, id = %s"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r8 = 0
            r7[r8] = r2     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r9 = 1
            r7[r9] = r3     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r10 = 2
            r7[r10] = r4     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r10 = 3
            r7[r10] = r1     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r1 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r5.append(r1)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r1 = "\n"
            r5.append(r1)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r5 = "jessie"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r7 = "[DbManager] selectRecentActiveOne"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            java.lang.String r1 = r7.concat(r1)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r6[r8] = r1     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            com.umeng.commonsdk.statistics.common.ULog.i(r5, r6)     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            com.umeng.cconfig.b.d r1 = new com.umeng.cconfig.b.d     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r1.f12947a = r2     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r1.f12948b = r3     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r1.f12949c = r4     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            android.database.sqlite.SQLiteDatabase r0 = r11.f12900a     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L9a
            r0.endTransaction()     // Catch: java.lang.Throwable -> L9a
        L9a:
            r11.b()
            return r1
        L9e:
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> La8 android.database.sqlite.SQLiteDatabaseCorruptException -> Lad
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Lb8
            goto Lb5
        La8:
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Lb8
            goto Lb5
        Lad:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lbc
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Lb8
        Lb5:
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r11.b()
            return r0
        Lbc:
            r0 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc6
            android.database.sqlite.SQLiteDatabase r1 = r11.f12900a     // Catch: java.lang.Throwable -> Lc6
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r11.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.cconfig.a.b.c():com.umeng.cconfig.b.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r0 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r8.a()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            android.database.sqlite.SQLiteDatabase r2 = r8.f12900a     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r2.beginTransaction()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r2 = "select *  from __cc where __a=\"0\" order by __ts asc"
            android.database.sqlite.SQLiteDatabase r3 = r8.f12900a     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            boolean r4 = r3 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r5 = 0
            if (r4 != 0) goto L1c
            android.database.Cursor r2 = r3.rawQuery(r2, r5)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            goto L20
        L1c:
            android.database.Cursor r2 = com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.rawQuery(r3, r2, r5)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
        L20:
            if (r2 == 0) goto L36
        L22:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            if (r3 == 0) goto L36
            java.lang.String r3 = "__ts"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r0.add(r3)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            goto L22
        L36:
            java.lang.String r2 = "delete from __cc where "
            int r3 = r0.size()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            int r3 = r3 + (-5)
            java.lang.String r4 = ""
            if (r3 <= 0) goto Lbb
            r5 = r1
        L43:
            if (r5 >= r3) goto L86
            int r6 = r3 + (-1)
            java.lang.String r7 = "__ts=\""
            if (r5 == r6) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.<init>()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.append(r7)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.Object r4 = r0.get(r5)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r4 = "\" or "
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
        L64:
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            goto L83
        L69:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.<init>()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.append(r7)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.Object r4 = r0.get(r5)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r4 = "\""
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            goto L64
        L83:
            int r5 = r5 + 1
            goto L43
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r0.<init>()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r0.append(r2)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r0.append(r4)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r2 = "jessie"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r4 = "[DbManager] deleteExtraCloudConfigInfo: "
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r3[r1] = r4     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            com.umeng.commonsdk.statistics.common.ULog.i(r2, r3)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            android.database.sqlite.SQLiteDatabase r2 = r8.f12900a     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            boolean r3 = r2 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            if (r3 != 0) goto Lb3
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            goto Lb6
        Lb3:
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r2, r0)     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
        Lb6:
            android.database.sqlite.SQLiteDatabase r0 = r8.f12900a     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lc0 android.database.sqlite.SQLiteDatabaseCorruptException -> Lc5
        Lbb:
            android.database.sqlite.SQLiteDatabase r0 = r8.f12900a     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Ld0
            goto Lcd
        Lc0:
            android.database.sqlite.SQLiteDatabase r0 = r8.f12900a     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Ld0
            goto Lcd
        Lc5:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Ld4
            android.database.sqlite.SQLiteDatabase r0 = r8.f12900a     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Ld0
        Lcd:
            r0.endTransaction()     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r8.b()
            return r1
        Ld4:
            r0 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r8.f12900a     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto Lde
            android.database.sqlite.SQLiteDatabase r1 = r8.f12900a     // Catch: java.lang.Throwable -> Lde
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lde
        Lde:
            r8.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.cconfig.a.b.d():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
    
        r1 = r12.f12900a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r12.f12900a.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        r1 = r12.f12900a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1.moveToNext() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r2 = r1.getString(r1.getColumnIndex("__ts"));
        r3 = r1.getString(r1.getColumnIndex(com.umeng.analytics.pro.e.d.a.f12563d));
        r4 = r1.getString(r1.getColumnIndex("__a"));
        com.umeng.commonsdk.statistics.common.ULog.i("jessie", "[DbManager] getLastestConfigInfo".concat(java.lang.String.valueOf(java.lang.String.format("timeStamp = %s, content = %s, active = %s, id = %s", r2, r3, r4, r1.getString(r1.getColumnIndex("id"))) + "\n")));
        r0.f12947a = r2;
        r0.f12948b = r3;
        r0.f12949c = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.umeng.cconfig.b.d e() {
        /*
            r12 = this;
            com.umeng.cconfig.b.d r0 = new com.umeng.cconfig.b.d
            r0.<init>()
            r12.a()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r1.beginTransaction()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r1 = "select *  from __cc order by __ts desc"
            android.database.sqlite.SQLiteDatabase r2 = r12.f12900a     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            boolean r3 = r2 instanceof android.database.sqlite.SQLiteDatabase     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r4 = 0
            if (r3 != 0) goto L1b
            android.database.Cursor r1 = r2.rawQuery(r1, r4)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            goto L1f
        L1b:
            android.database.Cursor r1 = com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.rawQuery(r2, r1, r4)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
        L1f:
            if (r1 == 0) goto L9b
        L21:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            if (r2 == 0) goto L9b
            java.lang.String r2 = "__ts"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r3 = "__c"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r4 = "__a"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r5 = "id"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r6.<init>()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r7 = "timeStamp = %s, content = %s, active = %s, id = %s"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r9 = 0
            r8[r9] = r2     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r10 = 1
            r8[r10] = r3     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r11 = 2
            r8[r11] = r4     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r11 = 3
            r8[r11] = r5     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r5 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r6.append(r5)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r5 = "\n"
            r6.append(r5)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r6 = "jessie"
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r8 = "[DbManager] getLastestConfigInfo"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            java.lang.String r5 = r8.concat(r5)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r7[r9] = r5     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            com.umeng.commonsdk.statistics.common.ULog.i(r6, r7)     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r0.f12947a = r2     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r0.f12948b = r3     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r0.f12949c = r4     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            if (r2 == 0) goto L21
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L97
            r1.endTransaction()     // Catch: java.lang.Throwable -> L97
        L97:
            r12.b()
            return r0
        L9b:
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> La5 android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lb5
            goto Lb2
        La5:
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lb5
            goto Lb2
        Laa:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lb9
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lb5
        Lb2:
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r12.b()
            return r0
        Lb9:
            r0 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto Lc3
            android.database.sqlite.SQLiteDatabase r1 = r12.f12900a     // Catch: java.lang.Throwable -> Lc3
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r12.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.cconfig.a.b.e():com.umeng.cconfig.b.d");
    }
}
