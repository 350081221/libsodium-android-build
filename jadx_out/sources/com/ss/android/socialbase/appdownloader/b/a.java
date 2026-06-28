package com.ss.android.socialbase.appdownloader.b;

import a1.i;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10199a;

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.VERSION.RELEASE;
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(str);
        boolean z6 = !TextUtils.isEmpty(Build.ID);
        if (!"REL".equals(Build.VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) {
            z4 = false;
        }
        sb.append("AppDownloader");
        if (z5) {
            sb.append("/");
            sb.append(str);
        }
        sb.append(" (Linux; U; Android");
        if (z5) {
            sb.append(" ");
            sb.append(str);
        }
        if (z4 || z6) {
            sb.append(i.f136b);
            if (z4) {
                sb.append(" ");
                sb.append(Build.MODEL);
            }
            if (z6) {
                sb.append(" Build/");
                sb.append(Build.ID);
            }
        }
        sb.append(")");
        f10199a = sb.toString();
    }
}
