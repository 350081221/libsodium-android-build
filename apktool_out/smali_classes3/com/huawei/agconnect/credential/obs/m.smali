.class final Lcom/huawei/agconnect/credential/obs/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field private a:Lcom/huawei/agconnect/AGConnectInstance;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/AGConnectInstance;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/m;->a:Lcom/huawei/agconnect/AGConnectInstance;

    iput-boolean p2, p0, Lcom/huawei/agconnect/credential/obs/m;->b:Z

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 4

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/m;->a:Lcom/huawei/agconnect/AGConnectInstance;

    const-class v1, Lcom/huawei/agconnect/core/service/auth/AuthProvider;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/AGConnectInstance;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/core/service/auth/AuthProvider;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/agconnect/credential/obs/m;->b:Z

    if-nez v0, :cond_0

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Please intergrate agconnect-auth in project"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/m;->a:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/AGConnectInstance;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/core/service/auth/AuthProvider;

    invoke-interface {v0}, Lcom/huawei/agconnect/core/service/auth/AuthProvider;->getTokens()Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/hmf/tasks/m;->d(Lcom/huawei/hmf/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/agconnect/core/service/auth/Token;

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/huawei/agconnect/credential/obs/m;->b:Z

    if-nez v0, :cond_2

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "no user is signed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v1

    const-string v2, "access_token"

    invoke-interface {v0}, Lcom/huawei/agconnect/core/service/auth/Token;->getTokenString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
