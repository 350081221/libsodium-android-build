package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.umeng.analytics.pro.e;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12592a = 2049;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12593b = 2050;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12594c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private static Context f12595d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f12596e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final String f12597f = "umeng+";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12598g = "ek__id";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12599h = "ek_key";

    /* renamed from: i, reason: collision with root package name */
    private List<String> f12600i;

    /* renamed from: j, reason: collision with root package name */
    private List<Integer> f12601j;

    /* renamed from: k, reason: collision with root package name */
    private String f12602k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f12603l;

    /* loaded from: classes3.dex */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final i f12611a = new i();

        private b() {
        }
    }

    public static i a(Context context) {
        i iVar = b.f12611a;
        if (f12595d == null && context != null) {
            f12595d = context.getApplicationContext();
            iVar.k();
        }
        return iVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.f12600i.clear();
            this.f12603l.clear();
            this.f12601j.clear();
        }
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(f12596e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(f12595d, f12598g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(f12595d).getString(f12598g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(f12595d, f12598g, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < substring.length(); i5++) {
                        char charAt = substring.charAt(i5);
                        if (Character.isDigit(charAt)) {
                            if (Integer.parseInt(Character.toString(charAt)) == 0) {
                                sb.append(0);
                            } else {
                                sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                    f12596e = sb.toString();
                }
                if (!TextUtils.isEmpty(f12596e)) {
                    f12596e += new StringBuilder(f12596e).reverse().toString();
                    String multiProcessSP2 = UMUtils.getMultiProcessSP(f12595d, f12599h);
                    if (TextUtils.isEmpty(multiProcessSP2)) {
                        UMUtils.setMultiProcessSP(f12595d, f12599h, c(f12597f));
                    } else if (!f12597f.equals(d(multiProcessSP2))) {
                        b(true, false);
                        a(true, false);
                        h();
                        i();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.f12603l.clear();
    }

    public boolean c() {
        return this.f12603l.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r6 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            if (r2 == 0) goto L29
            r0.endTransaction()     // Catch: java.lang.Throwable -> L1f
        L1f:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return
        L29:
            java.lang.String r2 = ""
            java.lang.String r3 = "-1"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            r3 = 0
        L32:
            r4 = 2
            if (r3 >= r4) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            r4.<init>()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r5 = "update __et set __i=\""
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            r4.append(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r5 = "\" where "
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r5 = "__i"
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r5 = "=\""
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r5 = "\""
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r4)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            int r3 = r3 + 1
            goto L32
        L65:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L78
            goto L6b
        L69:
            if (r0 == 0) goto L6e
        L6b:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L6e
        L6e:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L80
        L78:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L6e
            goto L6b
        L80:
            return
        L81:
            r1 = move-exception
            if (r0 == 0) goto L87
            r0.endTransaction()     // Catch: java.lang.Throwable -> L87
        L87:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.d():void");
    }

    public boolean e() {
        return this.f12600i.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject f() {
        /*
            r14 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r14.f12603l
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.util.List<java.lang.String> r4 = r14.f12603l     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r6 = "__is"
            r7 = 0
            java.lang.String r8 = "__ii=? "
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r9[r5] = r4     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r14
            r5 = r6
            r6 = r2
            android.database.Cursor r4 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            if (r4 == 0) goto L5d
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r5 == 0) goto L5d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r5.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r3 = r5
        L5d:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r4 == 0) goto L65
            r4.close()
        L65:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L68
        L68:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto La2
        L72:
            r5 = r3
        L73:
            r3 = r4
            goto L7e
        L75:
            r5 = r3
        L76:
            r3 = r4
            goto L95
        L78:
            r5 = r3
            goto L7e
        L7a:
            r5 = r3
            goto L95
        L7c:
            r2 = r3
            r5 = r2
        L7e:
            if (r3 == 0) goto L83
            r3.close()
        L83:
            if (r2 == 0) goto L88
        L85:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L88
        L88:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            r3 = r5
            goto La2
        L93:
            r2 = r3
            r5 = r2
        L95:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> La3
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            if (r2 == 0) goto L88
            goto L85
        La2:
            return r3
        La3:
            r0 = move-exception
            if (r3 == 0) goto La9
            r3.close()
        La9:
            if (r2 == 0) goto Lae
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lae
        Lae:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.f():org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject g() {
        /*
            r14 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r14.f12600i
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.util.List<java.lang.String> r4 = r14.f12600i     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r6 = "__sd"
            r7 = 0
            java.lang.String r8 = "__ii=? "
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r9[r5] = r4     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4 = r14
            r5 = r6
            r6 = r2
            android.database.Cursor r4 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            if (r4 == 0) goto L5d
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r5 == 0) goto L5d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r5.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r3 = r5
        L5d:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r4 == 0) goto L65
            r4.close()
        L65:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L68
        L68:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto La2
        L72:
            r5 = r3
        L73:
            r3 = r4
            goto L7e
        L75:
            r5 = r3
        L76:
            r3 = r4
            goto L95
        L78:
            r5 = r3
            goto L7e
        L7a:
            r5 = r3
            goto L95
        L7c:
            r2 = r3
            r5 = r2
        L7e:
            if (r3 == 0) goto L83
            r3.close()
        L83:
            if (r2 == 0) goto L88
        L85:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L88
        L88:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            r3 = r5
            goto La2
        L93:
            r2 = r3
            r5 = r2
        L95:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> La3
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            if (r2 == 0) goto L88
            goto L85
        La2:
            return r3
        La3:
            r0 = move-exception
            if (r3 == 0) goto La9
            r3.close()
        La9:
            if (r2 == 0) goto Lae
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lae
        Lae:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.g():org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.util.List<java.lang.Integer> r1 = r4.f12601j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r1 <= 0) goto L3c
            r1 = 0
        L17:
            java.util.List<java.lang.Integer> r2 = r4.f12601j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r1 >= r2) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r3 = "delete from __et where rowid="
            r2.append(r3)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.util.List<java.lang.Integer> r3 = r4.f12601j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.append(r3)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r2)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            int r1 = r1 + 1
            goto L17
        L3c:
            java.util.List<java.lang.Integer> r1 = r4.f12601j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r1.clear()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            goto L47
        L45:
            if (r0 == 0) goto L4a
        L47:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L4a
        L4a:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L5c
        L54:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L5d
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L4a
            goto L47
        L5c:
            return
        L5d:
            r1 = move-exception
            if (r0 == 0) goto L63
            r0.endTransaction()     // Catch: java.lang.Throwable -> L63
        L63:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L26
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L26
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L26
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L26
            java.lang.String r1 = "delete from __er"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r1)     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L26
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L26
            goto L19
        L17:
            if (r0 == 0) goto L1c
        L19:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L1c
        L1c:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L2e
        L26:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L2f
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L1c
            goto L19
        L2e:
            return
        L2f:
            r1 = move-exception
            if (r0 == 0) goto L35
            r0.endTransaction()     // Catch: java.lang.Throwable -> L35
        L35:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.i():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r5 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = r5.f12602k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L77
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __er where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = r5.f12602k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r1, r3)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __et where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = r5.f12602k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r1, r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            goto L51
        L4e:
            r1 = r2
        L4f:
            if (r1 == 0) goto L54
        L51:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L54
        L54:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L77
        L5e:
            r1 = r2
        L5f:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L67
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L54
            goto L51
        L67:
            r0 = move-exception
            if (r1 == 0) goto L6d
            r1.endTransaction()     // Catch: java.lang.Throwable -> L6d
        L6d:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        L77:
            r5.f12602k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.j():void");
    }

    private i() {
        this.f12600i = new ArrayList();
        this.f12601j = new ArrayList();
        this.f12602k = null;
        this.f12603l = new ArrayList();
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long longValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str2 = "";
            String c5 = (optJSONObject == null || optJSONObject.length() <= 0) ? "" : c(optJSONObject.toString());
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str2 = c(optJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(longValue));
            contentValues.put("__sp", c5);
            contentValues.put("__pp", str2);
            contentValues.put("__av", UMGlobalContext.getInstance(f12595d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(f12595d));
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.insert(sQLiteDatabase, e.c.f12546a, null, contentValues);
            } else {
                sQLiteDatabase.insert(e.c.f12546a, null, contentValues);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.lang.String r20, org.json.JSONObject r21, android.database.sqlite.SQLiteDatabase r22) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.c(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase):void");
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return SQLiteInstrumentation.query(sQLiteDatabase, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.f12600i.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r4 >= r5) goto L8d
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L34
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            if (r8 == 0) goto L43
        L34:
            com.umeng.analytics.pro.u r7 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r7.b()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            if (r8 == 0) goto L43
            r7 = r9
        L43:
            r6.put(r1, r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            int r7 = r5.optInt(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = r10.c(r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = "__et"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.insert(r3, r5, r2, r6)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
        L8a:
            int r4 = r4 + 1
            goto L13
        L8d:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r3.endTransaction()     // Catch: java.lang.Throwable -> L9d
            goto L9d
        L94:
            r2 = r3
            goto L98
        L96:
            r2 = r3
            goto La7
        L98:
            if (r2 == 0) goto L9d
        L9a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L9d
        L9d:
            android.content.Context r11 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r11 = com.umeng.analytics.pro.g.a(r11)
            r11.b()
            goto Laf
        La7:
            android.content.Context r11 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> Lb0
            com.umeng.analytics.pro.h.a(r11)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9d
            goto L9a
        Laf:
            return
        Lb0:
            r11 = move-exception
            if (r2 == 0) goto Lb6
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONArray):void");
    }

    public JSONObject b(boolean z4) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z4);
        return jSONObject;
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(f12596e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f12596e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00a6: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:51:0x00ab, block:B:50:0x00a6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(org.json.JSONObject r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L86
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L86
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L86
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            boolean r2 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r2 != 0) goto L2a
            java.lang.String r3 = "__er"
            r5 = 0
            java.lang.String r6 = "__i=? "
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r2 = 0
            r7[r2] = r14     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2 = r12
            r4 = r1
            android.database.Cursor r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            goto L39
        L2a:
            java.lang.String r3 = "__er"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2 = r12
            r4 = r1
            android.database.Cursor r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
        L39:
            r0 = r14
            if (r0 == 0) goto L6f
            org.json.JSONArray r14 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r14.<init>()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
        L41:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r2 == 0) goto L64
            java.lang.String r2 = "__a"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r3 != 0) goto L41
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r2 = r12.d(r2)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r14.put(r3)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            goto L41
        L64:
            int r2 = r14.length()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r2 <= 0) goto L6f
            java.lang.String r2 = "error"
            r13.put(r2, r14)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
        L6f:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r0 == 0) goto L93
            r0.close()
            goto L93
        L78:
            r1 = r0
        L79:
            android.content.Context r13 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> La0
            com.umeng.analytics.pro.h.a(r13)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L83
            r0.close()
        L83:
            if (r1 == 0) goto L96
            goto L93
        L86:
            r1 = r0
        L87:
            android.content.Context r13 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> La0
            com.umeng.analytics.pro.h.a(r13)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L91
            r0.close()
        L91:
            if (r1 == 0) goto L96
        L93:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L96
        L96:
            android.content.Context r13 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r13 = com.umeng.analytics.pro.g.a(r13)
            r13.b()
            return
        La0:
            r13 = move-exception
            if (r0 == 0) goto La6
            r0.close()
        La6:
            if (r1 == 0) goto Lab
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lab
        Lab:
            android.content.Context r14 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r14 = com.umeng.analytics.pro.g.a(r14)
            r14.b()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(org.json.JSONObject, java.lang.String):void");
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(f12596e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f12596e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = r4.c(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r6 != 0) goto L4b
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__er"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.insert(r1, r5, r0, r2)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
        L4b:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r1.endTransaction()     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L52:
            r0 = r1
            goto L56
        L54:
            r0 = r1
            goto L65
        L56:
            if (r0 == 0) goto L5b
        L58:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L5b
        L5b:
            android.content.Context r5 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r5 = com.umeng.analytics.pro.g.a(r5)
            r5.b()
            goto L6d
        L65:
            android.content.Context r5 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L6f
            com.umeng.analytics.pro.h.a(r5)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L5b
            goto L58
        L6d:
            r5 = 0
            return r5
        L6f:
            r5 = move-exception
            if (r0 == 0) goto L75
            r0.endTransaction()     // Catch: java.lang.Throwable -> L75
        L75:
            android.content.Context r6 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, java.lang.String, int):boolean");
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i5);
            if (optJSONObject != null && optJSONObject.optLong("duration") > 0) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(org.json.JSONObject r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.i.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L94
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            com.umeng.analytics.pro.i$a r4 = com.umeng.analytics.pro.i.a.BEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r4) goto L4f
            java.lang.Object r8 = r8.opt(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.<init>()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__sd"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.insert(r3, r7, r2, r4)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L4f:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L57
            r6.b(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L57:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.END     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L5f
            r6.a(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L5f:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.PAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L69
            java.lang.String r9 = "__a"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L69:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.AUTOPAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L73
            java.lang.String r9 = "__b"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L73:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.NEWSESSION     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L7a
            r6.c(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
        L7a:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r3.endTransaction()     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L81:
            r2 = r3
            goto L85
        L83:
            r2 = r3
            goto L94
        L85:
            if (r2 == 0) goto L8a
        L87:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L8a
        L8a:
            android.content.Context r7 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            goto L9c
        L94:
            android.content.Context r7 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L9d
            com.umeng.analytics.pro.h.a(r7)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L8a
            goto L87
        L9c:
            return r1
        L9d:
            r7 = move-exception
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r8 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r8 = com.umeng.analytics.pro.g.a(r8)
            r8.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.i$a):boolean");
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long longValue = ((Long) jSONObject.opt(e.d.a.f12566g)).longValue();
            Object opt = jSONObject.opt(e.d.a.f12567h);
            long longValue2 = (opt == null || !(opt instanceof Long)) ? 0L : ((Long) opt).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str2 = "";
            String c5 = (optJSONObject == null || optJSONObject.length() <= 0) ? "" : c(optJSONObject.toString());
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str2 = c(optJSONObject2.toString());
            }
            String str3 = "update __sd set __f=\"" + longValue + "\", " + e.d.a.f12567h + "=\"" + longValue2 + "\", __sp=\"" + c5 + "\", __pp=\"" + str2 + "\" where __ii=\"" + str + "\"";
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, str3);
            } else {
                sQLiteDatabase.execSQL(str3);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            if (r4 == 0) goto L18
            if (r3 == 0) goto L4d
            java.lang.String r3 = "delete from __sd"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r3)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            goto L4d
        L18:
            java.util.List<java.lang.String> r3 = r2.f12600i     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            if (r3 <= 0) goto L4d
            r3 = 0
        L21:
            java.util.List<java.lang.String> r4 = r2.f12600i     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            if (r3 >= r4) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            java.lang.String r1 = "delete from __sd where __ii=\""
            r4.append(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            java.util.List<java.lang.String> r1 = r2.f12600i     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            r4.append(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r4)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            int r3 = r3 + 1
            goto L21
        L4d:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            goto L53
        L51:
            if (r0 == 0) goto L56
        L53:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L56
        L56:
            android.content.Context r3 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)
            r3.b()
            goto L68
        L60:
            android.content.Context r3 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L69
            com.umeng.analytics.pro.h.a(r3)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L56
            goto L53
        L68:
            return
        L69:
            r3 = move-exception
            if (r0 == 0) goto L6f
            r0.endTransaction()     // Catch: java.lang.Throwable -> L6f
        L6f:
            android.content.Context r4 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r4 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "__f"
            r1 = 0
            r2 = 0
            android.content.Context r4 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L55
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L55
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L55
            r4.beginTransaction()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            java.lang.String r6 = "__sd"
            java.lang.String r9 = "__ii=? "
            r5 = 1
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            r5 = 0
            r10[r5] = r16     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r5 = r15
            r7 = r4
            android.database.Cursor r1 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            if (r1 == 0) goto L37
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L56
        L37:
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.lang.Exception -> L60
            goto L5d
        L3d:
            r0 = move-exception
            goto L41
        L3f:
            r0 = move-exception
            r4 = r1
        L41:
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.lang.Exception -> L4b
        L46:
            if (r4 == 0) goto L4b
            r4.endTransaction()     // Catch: java.lang.Exception -> L4b
        L4b:
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        L55:
            r4 = r1
        L56:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Exception -> L60
        L5b:
            if (r4 == 0) goto L60
        L5d:
            r4.endTransaction()     // Catch: java.lang.Exception -> L60
        L60:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r2 = "delete from __is where __ii=\""
            r1.append(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            r1.append(r4)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r4 = "\""
            r1.append(r4)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r4)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
        L2d:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            goto L33
        L31:
            if (r0 == 0) goto L36
        L33:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L36
        L36:
            android.content.Context r4 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            goto L48
        L40:
            android.content.Context r4 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L49
            com.umeng.analytics.pro.h.a(r4)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L36
            goto L33
        L48:
            return
        L49:
            r4 = move-exception
            if (r0 == 0) goto L4f
            r0.endTransaction()     // Catch: java.lang.Throwable -> L4f
        L4f:
            android.content.Context r0 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:50:0x005d, B:52:0x0063, B:15:0x0073, B:17:0x007e, B:18:0x0083, B:26:0x0093, B:30:0x009b, B:32:0x00a1, B:34:0x00a4, B:39:0x00a9, B:41:0x00b7, B:43:0x00e7, B:44:0x00eb), top: B:49:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005d A[EXC_TOP_SPLITTER, LOOP:1: B:49:0x005d->B:52:0x0063, LOOP_START, PHI: r15
      0x005d: PHI (r15v2 java.lang.String) = (r15v8 java.lang.String), (r15v4 java.lang.String) binds: [B:14:0x005b, B:52:0x0063] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r19, org.json.JSONObject r20, android.database.sqlite.SQLiteDatabase r21, java.lang.String r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase, java.lang.String):void");
    }

    public JSONObject a(boolean z4) {
        a();
        this.f12601j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z4) {
            a(jSONObject, z4);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
        } else {
            String a5 = a(jSONObject, z4);
            if (!TextUtils.isEmpty(a5)) {
                b(jSONObject, a5);
                a(jSONObject, a5);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x018e, code lost:
    
        if (r1 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0180, code lost:
    
        if (r1 != null) goto L89;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x01a3: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:114:0x01a8, block:B:113:0x01a3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONObject r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x022e, code lost:
    
        if (r12 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x021f, code lost:
    
        if (r12 == null) goto L99;
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0243: IF  (r12 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:131:0x0248, block:B:130:0x0243 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x023e: IF  (r14 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:130:0x0243, block:B:128:0x023e */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0064, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            if (r7 == 0) goto L18
            if (r6 == 0) goto L53
            java.lang.String r6 = "delete from __is"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r6)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            goto L53
        L18:
            java.util.List<java.lang.String> r6 = r5.f12603l     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r7 = 0
            if (r6 <= 0) goto L4c
            r1 = r7
        L22:
            if (r7 >= r6) goto L4b
            java.util.List<java.lang.String> r2 = r5.f12603l     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            if (r2 != 0) goto L2f
            r1 = 1
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __is where __ii=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            int r7 = r7 + 1
            goto L22
        L4b:
            r7 = r1
        L4c:
            if (r7 == 0) goto L53
            java.lang.String r6 = "delete from __is where __ii is null"
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r6)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
        L53:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            goto L66
        L57:
            android.content.Context r6 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L73
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L69
            goto L66
        L5f:
            android.content.Context r6 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L73
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L69
        L66:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L69
        L69:
            android.content.Context r6 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            return
        L73:
            r6 = move-exception
            if (r0 == 0) goto L79
            r0.endTransaction()     // Catch: java.lang.Throwable -> L79
        L79:
            android.content.Context r7 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r4 = "\""
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            if (r1 != 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r2 = "delete from __er where __i=\""
            r1.append(r2)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.append(r5)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.append(r4)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r1)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r2 = "delete from __et where __i=\""
            r1.append(r2)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.append(r5)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.append(r4)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r1)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.util.List<java.lang.Integer> r1 = r3.f12601j     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.clear()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r2 = "delete from __sd where __ii=\""
            r1.append(r2)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.append(r5)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            r1.append(r4)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            com.huawei.agconnect.apms.instrument.SQLiteInstrumentation.execSQL(r0, r4)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
        L60:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteDatabaseCorruptException -> L73
            goto L66
        L64:
            if (r0 == 0) goto L69
        L66:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L69
        L69:
            android.content.Context r4 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            goto L7b
        L73:
            android.content.Context r4 = com.umeng.analytics.pro.i.f12595d     // Catch: java.lang.Throwable -> L7c
            com.umeng.analytics.pro.h.a(r4)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L69
            goto L66
        L7b:
            return
        L7c:
            r4 = move-exception
            if (r0 == 0) goto L82
            r0.endTransaction()     // Catch: java.lang.Throwable -> L82
        L82:
            android.content.Context r5 = com.umeng.analytics.pro.i.f12595d
            com.umeng.analytics.pro.g r5 = com.umeng.analytics.pro.g.a(r5)
            r5.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(boolean, java.lang.String):void");
    }
}
