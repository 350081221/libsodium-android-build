package com.ss.android.downloadlib.g;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public class l {

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static l f10109a = new l();
    }

    public static l a() {
        return a.f10109a;
    }

    public void b(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str4 = String.format("sdk:%s.%s:", str, str2);
        } else {
            str4 = "";
        }
        Log.e("[TTDownloaderLogger]", str4 + str3);
    }

    private l() {
    }

    public void a(String str, String str2, String str3) {
        Log.d("[TTDownloaderLogger]", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : String.format("sdk:%s.%s:", str, str2)) + str3);
    }
}
