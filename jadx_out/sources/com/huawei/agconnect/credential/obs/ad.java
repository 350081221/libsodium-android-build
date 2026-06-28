package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.annotation.Singleton;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Singleton
/* loaded from: classes3.dex */
public class ad implements CredentialsProvider {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7820a = "CredentialsProviderImpl";

    /* renamed from: b, reason: collision with root package name */
    private static final long f7821b = 3600000;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f7822c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7823d;

    /* renamed from: e, reason: collision with root package name */
    private ab f7824e = new ab();

    /* renamed from: f, reason: collision with root package name */
    private long f7825f;

    /* renamed from: g, reason: collision with root package name */
    private final AGConnectInstance f7826g;

    public ad(Context context, AGConnectInstance aGConnectInstance) {
        this.f7826g = aGConnectInstance;
        String identifier = aGConnectInstance.getOptions().getIdentifier();
        this.f7823d = identifier;
        ac.a().d(this.f7824e, identifier);
        ac.a().e(this.f7824e, identifier);
        ac.a().f(this.f7824e, identifier);
        this.f7822c = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.huawei.hmf.tasks.k<Token> kVar) {
        IllegalArgumentException illegalArgumentException;
        y yVar = new y(this.f7826g);
        if (TextUtils.isEmpty(yVar.getClientId())) {
            illegalArgumentException = new IllegalArgumentException("client token request miss client id, please check whether the 'agconnect-services.json' is configured correctly");
        } else {
            if (!TextUtils.isEmpty(yVar.getClientSecret())) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                BackendService.sendRequest(yVar, 1, z.class, new BackendService.Options.Builder().app(this.f7826g).clientToken(false).build()).f(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.g<z>() { // from class: com.huawei.agconnect.credential.obs.ad.2
                    @Override // com.huawei.hmf.tasks.g
                    public void onComplete(Task<z> task) {
                        Logger.i(ad.f7820a, "onComplete");
                        if (!task.v()) {
                            kVar.c(task.q());
                            countDownLatch.countDown();
                            return;
                        }
                        z r5 = task.r();
                        if (r5.getRet() != null && r5.getRet().getCode() != 0) {
                            kVar.c(new AGCServerException(r5.getRet().getMsg(), r5.getRet().getCode()));
                            countDownLatch.countDown();
                            return;
                        }
                        ad.this.f7824e = new ab(r5.getAccessToken(), r5.getExpiresIn());
                        ac.a().a(ad.this.f7824e, ad.this.f7823d);
                        ac.a().b(ad.this.f7824e, ad.this.f7823d);
                        ac.a().c(ad.this.f7824e, ad.this.f7823d);
                        countDownLatch.countDown();
                        ad.this.f7825f = SystemClock.elapsedRealtime();
                        kVar.d(ad.this.f7824e);
                    }
                });
                try {
                    if (countDownLatch.await(5L, TimeUnit.SECONDS)) {
                        return;
                    }
                    Logger.e(f7820a, "await failed");
                    return;
                } catch (InterruptedException unused) {
                    Logger.e(f7820a, "await InterruptedException");
                    return;
                }
            }
            illegalArgumentException = new IllegalArgumentException("client token request miss client secret, please check whether the 'agconnect-services.json' is configured correctly");
        }
        kVar.c(illegalArgumentException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z4) {
        ab abVar = this.f7824e;
        if (abVar == null || !abVar.a()) {
            return true;
        }
        return z4 && (this.f7825f == 0 || SystemClock.elapsedRealtime() - this.f7825f > 3600000);
    }

    @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
    public Task<Token> getTokens() {
        return getTokens(false);
    }

    @Override // com.huawei.agconnect.core.service.auth.CredentialsProvider
    public Task<Token> getTokens(final boolean z4) {
        final com.huawei.hmf.tasks.k kVar = new com.huawei.hmf.tasks.k();
        if (a(z4)) {
            this.f7822c.execute(new Runnable() { // from class: com.huawei.agconnect.credential.obs.ad.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ad.this.a(z4)) {
                        ad.this.a((com.huawei.hmf.tasks.k<Token>) kVar);
                    } else {
                        kVar.d(ad.this.f7824e);
                    }
                }
            });
        } else {
            kVar.d(this.f7824e);
        }
        return kVar.b();
    }
}
