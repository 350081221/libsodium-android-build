package com.efs.sdk.base.core.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends AbsHttpListener {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f6481a = new b(0);
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    @Override // com.efs.sdk.base.core.util.concurrent.b
    public final /* bridge */ /* synthetic */ void a(@NonNull com.efs.sdk.base.core.util.concurrent.c<HttpResponse> cVar, @Nullable HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            com.efs.sdk.base.core.a.a.a();
            com.efs.sdk.base.core.a.a.a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        a(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(@NonNull HttpResponse httpResponse) {
        f fVar;
        a(httpResponse);
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (!TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(str);
                fVar = f.a.f6622a;
                if (fVar.f6619b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                    com.efs.sdk.base.core.f.b bVar = new com.efs.sdk.base.core.f.b("efs_core", "config_coverage", fVar.f6618a.f6612c);
                    bVar.put("cver", Integer.valueOf(parseInt));
                    fVar.f6619b.send(bVar);
                }
            }
        }
    }

    private b() {
    }

    public static b a() {
        return a.f6481a;
    }

    private static void a(@NonNull HttpResponse httpResponse) {
        f fVar;
        fVar = f.a.f6622a;
        fVar.a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }
}
