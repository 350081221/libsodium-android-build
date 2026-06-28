package com.huawei.agconnect.https;

import okhttp3.Request;

/* loaded from: classes3.dex */
class f<HttpsRequest> {

    /* renamed from: a, reason: collision with root package name */
    private HttpsRequest f8004a;

    private f(HttpsRequest httpsrequest) {
        this.f8004a = httpsrequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <HttpsRequest> f a(HttpsRequest httpsrequest) {
        return new f(httpsrequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request.Builder a() {
        return a.a(this.f8004a);
    }
}
