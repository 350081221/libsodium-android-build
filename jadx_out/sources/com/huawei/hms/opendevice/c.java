package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.hms.openid.R;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.umeng.analytics.pro.bi;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8713a = "c";

    /* renamed from: b, reason: collision with root package name */
    public static f2.d f8714b;

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, String> f8715c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8716d = new Object();

    public static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    public static byte[] a(Context context) {
        byte[] a5 = a.a(context.getString(R.string.f8031h));
        byte[] a6 = a.a(context.getString(R.string.f8030g));
        return a(a(a(a5, a6), a.a(a())));
    }

    public static synchronized f2.d b(Context context) {
        f2.d dVar;
        synchronized (c.class) {
            if (f8714b == null) {
                if (g()) {
                    f8714b = f2.d.e(c(), d(), b(), f());
                } else {
                    HMSLog.w(f8713a, "root key util is null, init root key.");
                    d(context);
                }
            }
            dVar = f8714b;
        }
        return dVar;
    }

    public static String c(Context context) {
        if (!g()) {
            HMSLog.i(f8713a, "work key is empty, execute init.");
            d(context);
        }
        return f2.e.a(e(), b(context));
    }

    public static void d(Context context) {
        synchronized (f8716d) {
            e(context.getApplicationContext());
            if (g()) {
                HMSLog.i(f8713a, "The local secret is already in separate file mode.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(p.a(context.getApplicationContext()));
            sb.append("/shared_prefs/LocalAvengers.xml");
            File file = new File(sb.toString());
            if (file.exists()) {
                com.huawei.secure.android.common.util.d.i(file);
                HMSLog.i(f8713a, "destroy C, delete file LocalAvengers.xml.");
            }
            byte[] d5 = f2.b.d(32);
            byte[] d6 = f2.b.d(32);
            byte[] d7 = f2.b.d(32);
            byte[] d8 = f2.b.d(32);
            String a5 = a.a(d5);
            String a6 = a.a(d6);
            String a7 = a.a(d7);
            f8714b = f2.d.f(a5, a6, a7, d8);
            a(a5, a6, a7, a.a(d8), f2.e.i(a.a(f2.b.d(32)), f8714b), context);
            HMSLog.i(f8713a, "generate D.");
        }
    }

    public static void e(Context context) {
        if (g()) {
            HMSLog.i(f8713a, "secretKeyCache not empty.");
            return;
        }
        f8715c.clear();
        String a5 = p.a(context);
        if (TextUtils.isEmpty(a5)) {
            return;
        }
        String a6 = s.a(a5 + "/files/math/m");
        String a7 = s.a(a5 + "/files/panda/p");
        String a8 = s.a(a5 + "/files/panda/d");
        String a9 = s.a(a5 + "/files/math/t");
        String a10 = s.a(a5 + "/files/s");
        if (t.a(a6, a7, a8, a9, a10)) {
            f8715c.put("m", a6);
            f8715c.put(bi.aA, a7);
            f8715c.put("d", a8);
            f8715c.put(bi.aL, a9);
            f8715c.put(bi.aE, a10);
        }
    }

    public static String f() {
        return a(bi.aL);
    }

    public static boolean g() {
        return !TextUtils.isEmpty(e());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        if (length != bArr2.length) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
        }
        return bArr3;
    }

    public static String c() {
        return a("m");
    }

    public static String b() {
        return a("d");
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr[i5] = (byte) (bArr[i5] >> 2);
        }
        return bArr;
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Context context) {
        String a5 = p.a(context.getApplicationContext());
        if (TextUtils.isEmpty(a5)) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append("/files/math/m");
            a("m", str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a5);
            sb2.append("/files/panda/p");
            a(bi.aA, str2, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a5);
            sb3.append("/files/panda/d");
            a("d", str3, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a5);
            sb4.append("/files/math/t");
            a(bi.aL, str4, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a5);
            sb5.append("/files/s");
            a(bi.aE, str5, sb5.toString());
        } catch (IOException unused) {
            HMSLog.e(f8713a, "save key IOException.");
        }
    }

    public static String e() {
        return a(bi.aE);
    }

    public static void a(String str, String str2, String str3) throws IOException {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i(f8713a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            s.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    f8715c.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter = null;
        }
    }

    public static String d() {
        return a(bi.aA);
    }

    public static String a(String str) {
        String str2 = f8715c.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }
}
