package com.tendcloud.tenddata;

import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public enum aq {
    GET(false),
    POST(true);


    /* renamed from: c, reason: collision with root package name */
    private final boolean f11417c;

    aq(boolean z4) {
        this.f11417c = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.setRequestMethod(name());
            httpURLConnection.setDoOutput(this.f11417c);
            httpURLConnection.setDoInput(true);
        } catch (Throwable unused) {
        }
    }
}
