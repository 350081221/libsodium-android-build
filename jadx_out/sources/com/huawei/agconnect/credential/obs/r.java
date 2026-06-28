package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.apache.http.auth.AUTH;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7948a = "ClientTokenInterceptor";

    /* renamed from: b, reason: collision with root package name */
    private AGConnectInstance f7949b;

    public r(AGConnectInstance aGConnectInstance) {
        this.f7949b = aGConnectInstance;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        try {
            Token token = (Token) com.huawei.hmf.tasks.m.d(((CredentialsProvider) this.f7949b.getService(CredentialsProvider.class)).getTokens(), 5L, TimeUnit.SECONDS);
            return chain.proceed(chain.request().newBuilder().addHeader(AUTH.WWW_AUTH_RESP, "Bearer " + token.getTokenString()).build());
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
