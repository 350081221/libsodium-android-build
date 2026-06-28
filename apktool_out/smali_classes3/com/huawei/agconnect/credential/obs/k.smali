.class final Lcom/huawei/agconnect/credential/obs/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Authenticator;


# static fields
.field private static final a:Ljava/lang/String; = "AGCAuthenticator"


# instance fields
.field private b:Lcom/huawei/agconnect/AGConnectInstance;

.field private c:Lcom/huawei/agconnect/common/api/BackendService$Options;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/common/api/BackendService$Options;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/agconnect/common/api/BackendService$Options;->getApp()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/k;->b:Lcom/huawei/agconnect/AGConnectInstance;

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/k;->c:Lcom/huawei/agconnect/common/api/BackendService$Options;

    return-void
.end method


# virtual methods
.method public authenticate(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;
    .locals 8

    const-string p1, "access_token"

    const-string v0, "Authorization"

    const-string v1, "AGCAuthenticator"

    const-string v2, "authenticate"

    invoke-static {v1, v2}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/huawei/agconnect/https/adapter/JsonAdapterFactory;

    invoke-direct {v1}, Lcom/huawei/agconnect/https/adapter/JsonAdapterFactory;-><init>()V

    const-class v2, Lcom/huawei/agconnect/common/api/BaseResponse;

    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/https/adapter/JsonAdapterFactory;->responseBodyAdapter(Ljava/lang/Class;)Lcom/huawei/agconnect/https/Adapter;

    move-result-object v1

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/https/Adapter;->adapter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/agconnect/common/api/BaseResponse;

    invoke-virtual {p2}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object p2

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/huawei/agconnect/common/api/BaseResponse;->getRet()Lcom/huawei/agconnect/credential/obs/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/agconnect/credential/obs/aa;->getCode()I

    move-result v1

    const v3, 0xc401001

    const-wide/16 v4, 0x3

    const/4 v6, 0x1

    if-ne v1, v3, :cond_0

    iget-object v3, p0, Lcom/huawei/agconnect/credential/obs/k;->c:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-virtual {v3}, Lcom/huawei/agconnect/common/api/BackendService$Options;->isClientTokenRefreshed()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v2, p0, Lcom/huawei/agconnect/credential/obs/k;->c:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-virtual {v2, v6}, Lcom/huawei/agconnect/common/api/BackendService$Options;->setClientTokenRefreshed(Z)V

    iget-object v2, p0, Lcom/huawei/agconnect/credential/obs/k;->b:Lcom/huawei/agconnect/AGConnectInstance;

    const-class v3, Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;

    invoke-virtual {v2, v3}, Lcom/huawei/agconnect/AGConnectInstance;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;

    invoke-interface {v2, v6}, Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;->getTokens(Z)Lcom/huawei/hmf/tasks/Task;

    move-result-object v2

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v4, v5, v3}, Lcom/huawei/hmf/tasks/m;->d(Lcom/huawei/hmf/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/agconnect/core/service/auth/Token;

    invoke-interface {v2}, Lcom/huawei/agconnect/core/service/auth/Token;->getTokenString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Bearer "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v6

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    :goto_1
    const v0, 0xc401002

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/k;->c:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-virtual {v0}, Lcom/huawei/agconnect/common/api/BackendService$Options;->isAccessTokenRefreshed()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/k;->b:Lcom/huawei/agconnect/AGConnectInstance;

    const-class v1, Lcom/huawei/agconnect/core/service/auth/AuthProvider;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/AGConnectInstance;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/core/service/auth/AuthProvider;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/k;->c:Lcom/huawei/agconnect/common/api/BackendService$Options;

    invoke-virtual {v0, v6}, Lcom/huawei/agconnect/common/api/BackendService$Options;->setAccessTokenRefreshed(Z)V

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/k;->b:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/AGConnectInstance;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/core/service/auth/AuthProvider;

    invoke-interface {v0, v6}, Lcom/huawei/agconnect/core/service/auth/AuthProvider;->getTokens(Z)Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v4, v5, v1}, Lcom/huawei/hmf/tasks/m;->d(Lcom/huawei/hmf/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/core/service/auth/Token;

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    invoke-interface {v0}, Lcom/huawei/agconnect/core/service/auth/Token;->getTokenString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_3

    move v2, v6

    goto :goto_3

    :catch_3
    move-exception p1

    goto :goto_2

    :catch_4
    move-exception p1

    goto :goto_2

    :catch_5
    move-exception p1

    :goto_2
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Please intergrate agconnect-auth in project"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_3
    if-eqz v2, :cond_3

    invoke-virtual {p2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    goto :goto_4

    :cond_3
    const/4 p1, 0x0

    :goto_4
    return-object p1
.end method
