package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9032a = "h";

    public static String a(String str) {
        Context a5 = e.a();
        if (a5 == null) {
            return "";
        }
        try {
            return a5.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            i.d(f9032a, "getVersion NameNotFoundException : " + e5.getMessage());
            return "";
        } catch (Exception e6) {
            i.d(f9032a, "getVersion: " + e6.getMessage());
            return "";
        } catch (Throwable unused) {
            i.d(f9032a, "throwable");
            return "";
        }
    }

    public static int b(String str) {
        Context a5 = e.a();
        if (a5 == null) {
            return 0;
        }
        try {
            return a5.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i.d(f9032a, "getVersion NameNotFoundException");
            return 0;
        } catch (Exception e5) {
            i.d(f9032a, "getVersion: " + e5.getMessage());
            return 0;
        }
    }
}
