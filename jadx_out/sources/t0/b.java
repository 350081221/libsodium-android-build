package t0;

import android.content.Context;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f22418b = "VMS_IDLG_SDK_DB";

    /* renamed from: c, reason: collision with root package name */
    public static final String f22419c = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: d, reason: collision with root package name */
    public static final String f22420d = "value";

    /* renamed from: e, reason: collision with root package name */
    public static final String f22421e = "OAID";

    /* renamed from: f, reason: collision with root package name */
    public static final String f22422f = "AAID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f22423g = "VAID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f22424h = "OAIDSTATUS";

    /* renamed from: i, reason: collision with root package name */
    public static final int f22425i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22426j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f22427k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f22428l = 4;

    /* renamed from: a, reason: collision with root package name */
    public Context f22429a;

    public b(Context context) {
        this.f22429a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L41
            r1 = 1
            if (r8 == r1) goto L2b
            r1 = 2
            if (r8 == r1) goto L15
            r9 = 4
            if (r8 == r9) goto Le
            r2 = r0
            goto L48
        Le:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L47
        L15:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L47
        L2b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L47
        L41:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L47:
            r2 = r8
        L48:
            android.content.Context r8 = r7.f22429a
            android.content.ContentResolver r1 = r8.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L6e
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L6a
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r9 = r8.getString(r9)
            r0 = r9
        L6a:
            r8.close()
            goto L75
        L6e:
            java.lang.String r8 = "VMS_IDLG_SDK_DB"
            java.lang.String r9 = "return cursor is null,return"
            android.util.Log.d(r8, r9)
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.a(int, java.lang.String):java.lang.String");
    }
}
