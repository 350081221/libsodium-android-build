package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.BaseResponse;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.https.adapter.JsonAdapterFactory;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.apache.http.auth.AUTH;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k implements Authenticator {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7875a = "AGCAuthenticator";

    /* renamed from: b, reason: collision with root package name */
    private AGConnectInstance f7876b;

    /* renamed from: c, reason: collision with root package name */
    private BackendService.Options f7877c;

    public k(BackendService.Options options) {
        this.f7876b = options.getApp();
        this.f7877c = options;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        Logger.i(f7875a, "authenticate");
        BaseResponse baseResponse = (BaseResponse) new JsonAdapterFactory().responseBodyAdapter(BaseResponse.class).adapter(response.body());
        Request.Builder newBuilder = response.request().newBuilder();
        boolean z4 = false;
        if (baseResponse != null) {
            int code = baseResponse.getRet().getCode();
            if (code == 205524993 && !this.f7877c.isClientTokenRefreshed()) {
                this.f7877c.setClientTokenRefreshed(true);
                try {
                    String tokenString = ((Token) com.huawei.hmf.tasks.m.d(((CredentialsProvider) this.f7876b.getService(CredentialsProvider.class)).getTokens(true), 3L, TimeUnit.SECONDS)).getTokenString();
                    newBuilder.removeHeader(AUTH.WWW_AUTH_RESP);
                    newBuilder.addHeader(AUTH.WWW_AUTH_RESP, "Bearer " + tokenString);
                    z4 = true;
                } catch (InterruptedException | ExecutionException | TimeoutException e5) {
                    throw new IOException(e5.getMessage());
                }
            }
            if (code == 205524994 && !this.f7877c.isAccessTokenRefreshed()) {
                if (((AuthProvider) this.f7876b.getService(AuthProvider.class)) == null) {
                    throw new IOException("Please intergrate agconnect-auth in project");
                }
                this.f7877c.setAccessTokenRefreshed(true);
                try {
                    Token token = (Token) com.huawei.hmf.tasks.m.d(((AuthProvider) this.f7876b.getService(AuthProvider.class)).getTokens(true), 3L, TimeUnit.SECONDS);
                    newBuilder.removeHeader("access_token");
                    newBuilder.addHeader("access_token", token.getTokenString());
                    z4 = true;
                } catch (InterruptedException | ExecutionException | TimeoutException e6) {
                    throw new IOException(e6.getMessage());
                }
            }
        }
        if (z4) {
            return newBuilder.build();
        }
        return null;
    }
}
