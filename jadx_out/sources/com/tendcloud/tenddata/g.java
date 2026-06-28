package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f11711a;

    /* renamed from: b, reason: collision with root package name */
    private PackageInfo f11712b = null;

    private g() {
    }

    public static g a() {
        if (f11711a == null) {
            synchronized (g.class) {
                if (f11711a == null) {
                    f11711a = new g();
                }
            }
        }
        return f11711a;
    }

    private synchronized boolean i(Context context) {
        try {
            if (this.f11712b == null) {
                this.f11712b = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            }
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    public int b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            if (!i(context)) {
                return -1;
            }
            return this.f11712b.versionCode;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public String c(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            if (!i(context)) {
                return "unknown";
            }
            return this.f11712b.versionName;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public long d(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            if (!i(context) || !y.a(9)) {
                return -1L;
            }
            return this.f11712b.firstInstallTime;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public long e(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            if (!i(context) || !y.a(9)) {
                return -1L;
            }
            return this.f11712b.lastUpdateTime;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public long f(Context context) {
        if (context == null) {
            return -1L;
        }
        try {
            return new File(context.getApplicationInfo().sourceDir).length();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public String g(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!i(context)) {
                return null;
            }
            Signature[] signatureArr = this.f11712b.signatures;
            if (signatureArr.length < 1) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(signatureArr[0].toCharsString());
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String h(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable unused) {
            return "";
        }
    }
}
