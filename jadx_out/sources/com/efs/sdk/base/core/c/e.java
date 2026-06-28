package com.efs.sdk.base.core.c;

import com.efs.sdk.base.http.HttpResponse;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private com.efs.sdk.base.core.d.b f6524a;

    /* renamed from: b, reason: collision with root package name */
    private c f6525b;

    /* renamed from: c, reason: collision with root package name */
    private String f6526c;

    public e(com.efs.sdk.base.core.d.b bVar, c cVar, String str) {
        this.f6524a = bVar;
        this.f6525b = cVar;
        this.f6526c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpResponse httpResponse;
        int httpCode;
        c cVar;
        com.efs.sdk.base.core.d.b bVar = this.f6524a;
        if (bVar != null && (cVar = this.f6525b) != null) {
            httpResponse = cVar.a(bVar, true);
        } else {
            httpResponse = new HttpResponse();
        }
        d a5 = d.a();
        String str = this.f6526c;
        if (httpResponse.succ) {
            httpCode = 0;
        } else {
            httpCode = httpResponse.getHttpCode();
        }
        a5.a(str, httpCode);
        this.f6526c = null;
        this.f6525b = null;
    }
}
