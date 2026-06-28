package org.repackage.com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes4.dex */
public class DataBaseOperation {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22142a = "VMS_SDK_DB";

    /* renamed from: b, reason: collision with root package name */
    private static final String f22143b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c, reason: collision with root package name */
    private static final String f22144c = "content://com.vivo.abe.exidentifier/guid";

    /* renamed from: d, reason: collision with root package name */
    private static final String f22145d = "value";

    /* renamed from: e, reason: collision with root package name */
    private static final String f22146e = "OAID";

    /* renamed from: f, reason: collision with root package name */
    private static final String f22147f = "AAID";

    /* renamed from: g, reason: collision with root package name */
    private static final String f22148g = "VAID";

    /* renamed from: h, reason: collision with root package name */
    private static final String f22149h = "OAIDBLACK";

    /* renamed from: i, reason: collision with root package name */
    private static final String f22150i = "OAIDSTATUS";

    /* renamed from: j, reason: collision with root package name */
    private static final String f22151j = "STATISTICS";

    /* renamed from: k, reason: collision with root package name */
    private static final int f22152k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f22153l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f22154m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f22155n = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final int f22156o = 4;

    /* renamed from: p, reason: collision with root package name */
    private static final int f22157p = 5;

    /* renamed from: q, reason: collision with root package name */
    private static final int f22158q = 6;

    /* renamed from: r, reason: collision with root package name */
    private static final int f22159r = 7;

    /* renamed from: s, reason: collision with root package name */
    private static final String f22160s = "UDID";

    /* renamed from: t, reason: collision with root package name */
    private Context f22161t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataBaseOperation(Context context) {
        this.f22161t = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i5, String str, ContentValues[] contentValuesArr) {
        Uri parse;
        int bulkInsert;
        if (i5 == 6) {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        } else if (i5 != 7) {
            parse = null;
        } else {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_" + str);
        }
        if (parse == null) {
            return false;
        }
        try {
            bulkInsert = this.f22161t.getContentResolver().bulkInsert(parse, contentValuesArr);
            Log.d(f22142a, "insert:" + bulkInsert);
        } catch (Exception unused) {
            Log.e(f22142a, "return insert is error");
        }
        return bulkInsert != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r9 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r9 == 0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "VMS_SDK_DB"
            r1 = 0
            if (r9 == 0) goto L66
            r2 = 1
            if (r9 == r2) goto L50
            r2 = 2
            if (r9 == r2) goto L3a
            r2 = 3
            if (r9 == r2) goto L33
            r2 = 4
            if (r9 == r2) goto L1d
            r10 = 5
            if (r9 == r10) goto L16
            r3 = r1
            goto L6d
        L16:
            java.lang.String r9 = "content://com.vivo.abe.exidentifier/guid"
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L6c
        L1d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_"
            r9.append(r2)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L6c
        L33:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/UDID"
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L6c
        L3a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r9.append(r2)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L6c
        L50:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r9.append(r2)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L6c
        L66:
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r9 = android.net.Uri.parse(r9)
        L6c:
            r3 = r9
        L6d:
            if (r3 != 0) goto L70
            return r1
        L70:
            android.content.Context r9 = r8.f22161t     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> L9f
            if (r9 == 0) goto L92
            boolean r10 = r9.moveToNext()     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> La9
            if (r10 == 0) goto L97
            java.lang.String r10 = "value"
            int r10 = r9.getColumnIndex(r10)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> La9
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> La9
            r1 = r10
            goto L97
        L92:
            java.lang.String r10 = "return cursor is null,return"
            android.util.Log.d(r0, r10)     // Catch: java.lang.Exception -> La0 java.lang.Throwable -> La9
        L97:
            if (r9 == 0) goto La8
        L99:
            r9.close()
            goto La8
        L9d:
            r10 = move-exception
            goto Lab
        L9f:
            r9 = r1
        La0:
            java.lang.String r10 = "return cursor is error"
            android.util.Log.e(r0, r10)     // Catch: java.lang.Throwable -> La9
            if (r9 == 0) goto La8
            goto L99
        La8:
            return r1
        La9:
            r10 = move-exception
            r1 = r9
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()
        Lb0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.repackage.com.vivo.identifier.DataBaseOperation.a(int, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i5, String str, String str2, String str3) {
        Uri parse;
        int delete;
        if (i5 != 6) {
            parse = null;
        } else {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDBLACK_" + str);
        }
        if (parse == null) {
            return false;
        }
        try {
            delete = this.f22161t.getContentResolver().delete(parse, "packageName=? and uid=?", new String[]{str2, str3});
            Log.d(f22142a, "delete:" + delete);
        } catch (Exception unused) {
            Log.e(f22142a, "return delete is error");
        }
        return delete != 0;
    }
}
