package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f2784a;

    /* renamed from: b, reason: collision with root package name */
    public com.alipay.apmobilesecuritysdk.b.a f2785b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* renamed from: c, reason: collision with root package name */
    public int f2786c = 4;

    public a(Context context) {
        this.f2784a = context;
    }

    public static String a(Context context) {
        String b5 = b(context);
        return f1.a.c(b5) ? h.f(context) : b5;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String a5 = i.a(str);
            if (!f1.a.c(a5)) {
                return a5;
            }
            String a6 = g.a(context, str);
            i.a(str, a6);
            return !f1.a.c(a6) ? a6 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                String[] split = strArr[i5].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String b(Context context) {
        try {
            String b5 = i.b();
            if (!f1.a.c(b5)) {
                return b5;
            }
            c b6 = d.b(context);
            if (b6 != null) {
                i.a(b6);
                String str = b6.f2794a;
                if (f1.a.f(str)) {
                    return str;
                }
            }
            b b7 = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (b7 == null) {
                return "";
            }
            i.a(b7);
            String str2 = b7.f2791a;
            return f1.a.f(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private z.c b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        b b5;
        b c5;
        String str4 = "";
        try {
            Context context = this.f2784a;
            z.d dVar = new z.d();
            String b6 = f1.a.b(map, TTDownloadField.TT_APP_NAME, "");
            String b7 = f1.a.b(map, "sessionId", "");
            String b8 = f1.a.b(map, "rpcVersion", "");
            String a5 = a(context, b6);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String d5 = h.d(context);
            if (f1.a.f(b7)) {
                dVar.f22701c = b7;
            } else {
                dVar.f22701c = a5;
            }
            dVar.f22702d = securityToken;
            dVar.f22703e = d5;
            dVar.f22699a = SharedLibraryInfo.PLATFORM_PACKAGE_NAME;
            c c6 = d.c(context);
            if (c6 != null) {
                str2 = c6.f2794a;
                str = c6.f2796c;
            } else {
                str = "";
                str2 = str;
            }
            if (f1.a.c(str2) && (c5 = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = c5.f2791a;
                str = c5.f2793c;
            }
            c b9 = d.b();
            if (b9 != null) {
                str4 = b9.f2794a;
                str3 = b9.f2796c;
            } else {
                str3 = "";
            }
            if (f1.a.c(str4) && (b5 = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str4 = b5.f2791a;
                str3 = b5.f2793c;
            }
            dVar.f22706h = str2;
            dVar.f22705g = str4;
            dVar.f22708j = b8;
            if (f1.a.c(str2)) {
                dVar.f22700b = str4;
                str = str3;
            } else {
                dVar.f22700b = str2;
            }
            dVar.f22707i = str;
            dVar.f22704f = e.a(context, map);
            return v.d.c(this.f2784a, this.f2785b.c()).a(dVar);
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i5 = 0; i5 < 5; i5++) {
                String str = strArr[i5];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bb, code lost:
    
        if (f1.a.c(b(r9.f2784a)) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0202 A[Catch: Exception -> 0x0241, TryCatch #0 {Exception -> 0x0241, blocks: (B:3:0x0008, B:5:0x0039, B:8:0x0042, B:12:0x00c0, B:16:0x01e8, B:18:0x0202, B:20:0x020a, B:22:0x0210, B:26:0x0219, B:28:0x021f, B:34:0x00d8, B:36:0x00f0, B:41:0x00fd, B:42:0x010d, B:43:0x0114, B:48:0x0126, B:50:0x0176, B:52:0x0180, B:53:0x0188, B:55:0x0195, B:57:0x019f, B:58:0x01a7, B:59:0x01a3, B:60:0x0184, B:62:0x0057, B:64:0x0065, B:67:0x0070, B:69:0x0076, B:72:0x0081, B:75:0x008a, B:78:0x0097, B:82:0x00a4, B:85:0x00b1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x020a A[Catch: Exception -> 0x0241, TryCatch #0 {Exception -> 0x0241, blocks: (B:3:0x0008, B:5:0x0039, B:8:0x0042, B:12:0x00c0, B:16:0x01e8, B:18:0x0202, B:20:0x020a, B:22:0x0210, B:26:0x0219, B:28:0x021f, B:34:0x00d8, B:36:0x00f0, B:41:0x00fd, B:42:0x010d, B:43:0x0114, B:48:0x0126, B:50:0x0176, B:52:0x0180, B:53:0x0188, B:55:0x0195, B:57:0x019f, B:58:0x01a7, B:59:0x01a3, B:60:0x0184, B:62:0x0057, B:64:0x0065, B:67:0x0070, B:69:0x0076, B:72:0x0081, B:75:0x008a, B:78:0x0097, B:82:0x00a4, B:85:0x00b1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0219 A[Catch: Exception -> 0x0241, TryCatch #0 {Exception -> 0x0241, blocks: (B:3:0x0008, B:5:0x0039, B:8:0x0042, B:12:0x00c0, B:16:0x01e8, B:18:0x0202, B:20:0x020a, B:22:0x0210, B:26:0x0219, B:28:0x021f, B:34:0x00d8, B:36:0x00f0, B:41:0x00fd, B:42:0x010d, B:43:0x0114, B:48:0x0126, B:50:0x0176, B:52:0x0180, B:53:0x0188, B:55:0x0195, B:57:0x019f, B:58:0x01a7, B:59:0x01a3, B:60:0x0184, B:62:0x0057, B:64:0x0065, B:67:0x0070, B:69:0x0076, B:72:0x0081, B:75:0x008a, B:78:0x0097, B:82:0x00a4, B:85:0x00b1), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[Catch: Exception -> 0x0241, TryCatch #0 {Exception -> 0x0241, blocks: (B:3:0x0008, B:5:0x0039, B:8:0x0042, B:12:0x00c0, B:16:0x01e8, B:18:0x0202, B:20:0x020a, B:22:0x0210, B:26:0x0219, B:28:0x021f, B:34:0x00d8, B:36:0x00f0, B:41:0x00fd, B:42:0x010d, B:43:0x0114, B:48:0x0126, B:50:0x0176, B:52:0x0180, B:53:0x0188, B:55:0x0195, B:57:0x019f, B:58:0x01a7, B:59:0x01a3, B:60:0x0184, B:62:0x0057, B:64:0x0065, B:67:0x0070, B:69:0x0076, B:72:0x0081, B:75:0x008a, B:78:0x0097, B:82:0x00a4, B:85:0x00b1), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.a.a.a(java.util.Map):int");
    }
}
