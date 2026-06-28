package com.huawei.agconnect.credential.obs;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Backend;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.hmf.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7905a = "BackendServiceImpl";

    private static AGConnectInstance a(BackendService.Options options) {
        return (options == null || options.getApp() == null) ? AGConnectInstance.getInstance() : options.getApp();
    }

    public static <Rsp> Task<Rsp> a(BaseRequest baseRequest, int i5, Class<Rsp> cls, BackendService.Options options) {
        if (options != null && options.getApp() != null) {
            baseRequest.initBase(options.getApp());
        }
        if (options == null || !options.isClientToken()) {
            return Backend.call(baseRequest, i5, cls, a(options).getOptions());
        }
        final com.huawei.hmf.tasks.k kVar = new com.huawei.hmf.tasks.k();
        final RequestThrottle.Throttle throttle = options.getThrottle();
        c(baseRequest, i5, cls, options).l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Rsp>() { // from class: com.huawei.agconnect.credential.obs.p.7
            @Override // com.huawei.hmf.tasks.i
            public void onSuccess(Rsp rsp) {
                RequestThrottle.Throttle throttle2 = RequestThrottle.Throttle.this;
                if (throttle2 != null) {
                    throttle2.addForSuccess();
                }
                kVar.d(rsp);
            }
        }).i(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.1
            @Override // com.huawei.hmf.tasks.h
            public void onFailure(Exception exc) {
                RequestThrottle.Throttle throttle2 = RequestThrottle.Throttle.this;
                if (throttle2 != null && throttle2.checkFail(exc)) {
                    RequestThrottle.Throttle.this.addForFail();
                }
                kVar.c(exc);
            }
        });
        return kVar.b();
    }

    public static <Rsp> void a(BaseRequest baseRequest, int i5, Class<Rsp> cls, com.huawei.hmf.tasks.k<Rsp> kVar, BackendService.Options options) {
        if (options.getThrottle() != null) {
            if (options.getThrottle().getEndTime() > 0) {
                kVar.c(new AGCServerException("fetch throttled, try again later", 1));
                return;
            }
            options.getThrottle().addForStart();
        }
        c(baseRequest, i5, cls, kVar, options);
    }

    private static boolean a(Class cls) {
        return (cls == z.class || cls == ah.class) ? false : true;
    }

    private static boolean a(Exception exc) {
        return (exc instanceof AGCServerException) && ((AGCServerException) exc).getCode() == 401;
    }

    public static <Rsp> Task<Rsp> b(BaseRequest baseRequest, int i5, Class<Rsp> cls, BackendService.Options options) {
        Logger.i(f7905a, "sendRequest2");
        BackendService.Options build = options == null ? new BackendService.Options.Builder().app(AGConnectInstance.getInstance()).build() : options;
        if (build.getApp() == null) {
            build = build.newBuilder().app(AGConnectInstance.getInstance()).build();
        }
        baseRequest.initBase(build.getApp());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new v(build));
        if (!a(cls)) {
            return Backend.call(baseRequest, i5, cls, build.getFactory(), build.getTimeout(), build.getTimeUnit(), arrayList, null, a(build).getOptions());
        }
        final com.huawei.hmf.tasks.k kVar = new com.huawei.hmf.tasks.k();
        final RequestThrottle.Throttle throttle = build.getThrottle();
        Logger.i(f7905a, "clientToken:" + build.isClientToken());
        if (build.isClientToken()) {
            arrayList.add(new r(build.getApp()));
        }
        if (build.isApiKey()) {
            arrayList.add(new n(build.getApp()));
        }
        Logger.i(f7905a, "accessToken:" + build.isAccessToken());
        if (build.isAccessToken()) {
            arrayList.add(new m(build.getApp(), build.getAccessTokenType() == BackendService.AccessTokenType.MUST));
        }
        if (build.getThrottle() != null) {
            if (build.getThrottle().getEndTime() > 0) {
                kVar.c(new AGCServerException("fetch throttled, try again later", 1));
            }
            build.getThrottle().addForStart();
        }
        Backend.call(baseRequest, i5, cls, build.getFactory(), build.getTimeout(), build.getTimeUnit(), arrayList, new k(build), a(build).getOptions()).l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Rsp>() { // from class: com.huawei.agconnect.credential.obs.p.6
            @Override // com.huawei.hmf.tasks.i
            public void onSuccess(Rsp rsp) {
                RequestThrottle.Throttle throttle2 = RequestThrottle.Throttle.this;
                if (throttle2 != null) {
                    throttle2.addForSuccess();
                }
                kVar.d(rsp);
            }
        }).i(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.5
            @Override // com.huawei.hmf.tasks.h
            public void onFailure(Exception exc) {
                RequestThrottle.Throttle throttle2 = RequestThrottle.Throttle.this;
                if (throttle2 != null && throttle2.checkFail(exc)) {
                    RequestThrottle.Throttle.this.addForFail();
                }
                kVar.c(exc);
            }
        });
        return kVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Rsp> void b(Token token, final BaseRequest baseRequest, final BackendService.Options options, final com.huawei.hmf.tasks.k<Rsp> kVar, final int i5, final Class<Rsp> cls) {
        baseRequest.setAuthorization("Bearer " + token.getTokenString());
        if (!options.isAccessToken()) {
            a(baseRequest, i5, cls, kVar, options);
            return;
        }
        AuthProvider authProvider = (AuthProvider) a(options).getService(AuthProvider.class);
        if (authProvider == null) {
            kVar.c(new AGCServerException("no user login", 3));
        } else {
            authProvider.getTokens().l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Token>() { // from class: com.huawei.agconnect.credential.obs.p.11
                @Override // com.huawei.hmf.tasks.i
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Token token2) {
                    if (token2 != null) {
                        BaseRequest.this.setAccessToken(token2.getTokenString());
                    } else if (options.getAccessTokenType() != BackendService.AccessTokenType.EXPECT) {
                        kVar.c(new AGCServerException("no user login", 3));
                        return;
                    }
                    p.a(BaseRequest.this, i5, cls, kVar, options);
                }
            }).i(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.10
                @Override // com.huawei.hmf.tasks.h
                public void onFailure(Exception exc) {
                    com.huawei.hmf.tasks.k.this.c(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Rsp> void b(final Exception exc, final BackendService.Options options, final BaseRequest baseRequest, final int i5, final Class<Rsp> cls, final com.huawei.hmf.tasks.k<Rsp> kVar) {
        Task<Token> l5;
        Executor b5;
        com.huawei.hmf.tasks.h hVar;
        if (a(exc)) {
            int retCode = ((AGCServerException) exc).getRetCode();
            if (retCode == 205524993 && !options.isClientTokenRefreshed()) {
                options.setClientTokenRefreshed(true);
                l5 = ((CredentialsProvider) a(options).getService(CredentialsProvider.class)).getTokens(true).l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Token>() { // from class: com.huawei.agconnect.credential.obs.p.2
                    @Override // com.huawei.hmf.tasks.i
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Token token) {
                        BaseRequest.this.setAuthorization("Bearer " + token.getTokenString());
                        p.c(BaseRequest.this, i5, cls, kVar, options);
                    }
                });
                b5 = com.huawei.hmf.tasks.l.b();
                hVar = new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.14
                    @Override // com.huawei.hmf.tasks.h
                    public void onFailure(Exception exc2) {
                        com.huawei.hmf.tasks.k.this.c(exc2);
                    }
                };
            } else if (retCode == 205524994 && !options.isAccessTokenRefreshed()) {
                options.setAccessTokenRefreshed(true);
                AuthProvider authProvider = (AuthProvider) a(options).getService(AuthProvider.class);
                if (authProvider == null) {
                    kVar.c(exc);
                    return;
                } else {
                    l5 = authProvider.getTokens(true).l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Token>() { // from class: com.huawei.agconnect.credential.obs.p.4
                        @Override // com.huawei.hmf.tasks.i
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(Token token) {
                            if (token == null) {
                                kVar.c(exc);
                            } else {
                                BaseRequest.this.setAccessToken(token.getTokenString());
                                p.c(BaseRequest.this, i5, cls, kVar, options);
                            }
                        }
                    });
                    b5 = com.huawei.hmf.tasks.l.b();
                    hVar = new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.3
                        @Override // com.huawei.hmf.tasks.h
                        public void onFailure(Exception exc2) {
                            com.huawei.hmf.tasks.k.this.c(exc2);
                        }
                    };
                }
            }
            l5.i(b5, hVar);
            return;
        }
        kVar.c(exc);
    }

    private static <Rsp> Task<Rsp> c(final BaseRequest baseRequest, final int i5, final Class<Rsp> cls, final BackendService.Options options) {
        final com.huawei.hmf.tasks.k kVar = new com.huawei.hmf.tasks.k();
        ((CredentialsProvider) a(options).getService(CredentialsProvider.class)).getTokens().l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Token>() { // from class: com.huawei.agconnect.credential.obs.p.9
            @Override // com.huawei.hmf.tasks.i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Token token) {
                p.b(token, BaseRequest.this, options, kVar, i5, cls);
            }
        }).i(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.8
            @Override // com.huawei.hmf.tasks.h
            public void onFailure(Exception exc) {
                com.huawei.hmf.tasks.k.this.c(exc);
            }
        });
        return kVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <Rsp> void c(final BaseRequest baseRequest, final int i5, final Class<Rsp> cls, final com.huawei.hmf.tasks.k<Rsp> kVar, final BackendService.Options options) {
        d(baseRequest, i5, cls, options).l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<Rsp>() { // from class: com.huawei.agconnect.credential.obs.p.13
            @Override // com.huawei.hmf.tasks.i
            public void onSuccess(Rsp rsp) {
                com.huawei.hmf.tasks.k.this.d(rsp);
            }
        }).i(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.p.12
            @Override // com.huawei.hmf.tasks.h
            public void onFailure(Exception exc) {
                p.b(exc, BackendService.Options.this, baseRequest, i5, cls, kVar);
            }
        });
    }

    private static <Rsp> Task<Rsp> d(BaseRequest baseRequest, int i5, Class<Rsp> cls, BackendService.Options options) {
        return (options == null || options.getFactory() == null) ? Backend.call(baseRequest, i5, cls, a(options).getOptions()) : Backend.call(baseRequest, i5, cls, options.getFactory(), options.getTimeout(), options.getTimeUnit(), a(options).getOptions());
    }
}
