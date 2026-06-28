package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.Token;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private AGConnectInstance f7889a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7890b;

    public m(AGConnectInstance aGConnectInstance, boolean z4) {
        this.f7889a = aGConnectInstance;
        this.f7890b = z4;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        if (((AuthProvider) this.f7889a.getService(AuthProvider.class)) == null) {
            if (this.f7890b) {
                throw new IOException("Please intergrate agconnect-auth in project");
            }
            return chain.proceed(chain.request());
        }
        try {
            Token token = (Token) com.huawei.hmf.tasks.m.d(((AuthProvider) this.f7889a.getService(AuthProvider.class)).getTokens(), 5L, TimeUnit.SECONDS);
            if (token != null) {
                return chain.proceed(chain.request().newBuilder().addHeader("access_token", token.getTokenString()).build());
            }
            if (this.f7890b) {
                throw new IOException("no user is signed");
            }
            return chain.proceed(chain.request());
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
