package com.umeng.umzid;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class b implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13636a;

    public b(String str) {
        this.f13636a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f13636a.equalsIgnoreCase(str) || "pre-aaid.umeng.com".equalsIgnoreCase(str);
    }
}
