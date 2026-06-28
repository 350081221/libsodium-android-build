.class public Lcom/huawei/agconnect/credential/obs/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;


# annotations
.annotation runtime Lcom/huawei/agconnect/annotation/Singleton;
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "CredentialsProviderImpl"

.field private static final b:J = 0x36ee80L


# instance fields
.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Ljava/lang/String;

.field private e:Lcom/huawei/agconnect/credential/obs/ab;

.field private f:J

.field private final g:Lcom/huawei/agconnect/AGConnectInstance;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/agconnect/AGConnectInstance;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/huawei/agconnect/credential/obs/ab;

    invoke-direct {p1}, Lcom/huawei/agconnect/credential/obs/ab;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    iput-object p2, p0, Lcom/huawei/agconnect/credential/obs/ad;->g:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {p2}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object p1

    invoke-interface {p1}, Lcom/huawei/agconnect/AGConnectOptions;->getIdentifier()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad;->d:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/ac;->a()Lcom/huawei/agconnect/credential/obs/ac;

    move-result-object p2

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    invoke-virtual {p2, v0, p1}, Lcom/huawei/agconnect/credential/obs/ac;->d(Lcom/huawei/agconnect/credential/obs/ab;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/ac;->a()Lcom/huawei/agconnect/credential/obs/ac;

    move-result-object p2

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    invoke-virtual {p2, v0, p1}, Lcom/huawei/agconnect/credential/obs/ac;->e(Lcom/huawei/agconnect/credential/obs/ab;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/ac;->a()Lcom/huawei/agconnect/credential/obs/ac;

    move-result-object p2

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    invoke-virtual {p2, v0, p1}, Lcom/huawei/agconnect/credential/obs/ac;->f(Lcom/huawei/agconnect/credential/obs/ab;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/ad;J)J
    .locals 0

    iput-wide p1, p0, Lcom/huawei/agconnect/credential/obs/ad;->f:J

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/ad;)Lcom/huawei/agconnect/credential/obs/ab;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    return-object p0
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/ad;Lcom/huawei/agconnect/credential/obs/ab;)Lcom/huawei/agconnect/credential/obs/ab;
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/ad;Lcom/huawei/hmf/tasks/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/hmf/tasks/k;)V

    return-void
.end method

.method private a(Lcom/huawei/hmf/tasks/k;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hmf/tasks/k<",
            "Lcom/huawei/agconnect/core/service/auth/Token;",
            ">;)V"
        }
    .end annotation

    const-string v0, "CredentialsProviderImpl"

    new-instance v1, Lcom/huawei/agconnect/credential/obs/y;

    iget-object v2, p0, Lcom/huawei/agconnect/credential/obs/ad;->g:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-direct {v1, v2}, Lcom/huawei/agconnect/credential/obs/y;-><init>(Lcom/huawei/agconnect/AGConnectInstance;)V

    invoke-virtual {v1}, Lcom/huawei/agconnect/credential/obs/y;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "client token request miss client id, please check whether the \'agconnect-services.json\' is configured correctly"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/huawei/agconnect/credential/obs/y;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "client token request miss client secret, please check whether the \'agconnect-services.json\' is configured correctly"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v4, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;

    invoke-direct {v4}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;-><init>()V

    iget-object v5, p0, Lcom/huawei/agconnect/credential/obs/ad;->g:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v4, v5}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;->app(Lcom/huawei/agconnect/AGConnectInstance;)Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;->clientToken(Z)Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;->build()Lcom/huawei/agconnect/common/api/BackendService$Options;

    move-result-object v4

    const-class v5, Lcom/huawei/agconnect/credential/obs/z;

    invoke-static {v1, v3, v5, v4}, Lcom/huawei/agconnect/common/api/BackendService;->sendRequest(Lcom/huawei/agconnect/common/api/BaseRequest;ILjava/lang/Class;Lcom/huawei/agconnect/common/api/BackendService$Options;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hmf/tasks/l;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Lcom/huawei/agconnect/credential/obs/ad$2;

    invoke-direct {v4, p0, p1, v2}, Lcom/huawei/agconnect/credential/obs/ad$2;-><init>(Lcom/huawei/agconnect/credential/obs/ad;Lcom/huawei/hmf/tasks/k;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v1, v3, v4}, Lcom/huawei/hmf/tasks/Task;->f(Ljava/util/concurrent/Executor;Lcom/huawei/hmf/tasks/g;)Lcom/huawei/hmf/tasks/Task;

    :try_start_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x5

    invoke-virtual {v2, v3, v4, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "await failed"

    invoke-static {v0, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p1, "await InterruptedException"

    invoke-static {v0, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/ad;Z)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Z)Z

    move-result p0

    return p0
.end method

.method private a(Z)Z
    .locals 6

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/ab;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v2, p0, Lcom/huawei/agconnect/credential/obs/ad;->f:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/huawei/agconnect/credential/obs/ad;->f:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x36ee80

    cmp-long p1, v2, v4

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method static synthetic b(Lcom/huawei/agconnect/credential/obs/ad;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/credential/obs/ad;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public getTokens()Lcom/huawei/hmf/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/huawei/hmf/tasks/Task<",
            "Lcom/huawei/agconnect/core/service/auth/Token;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/credential/obs/ad;->getTokens(Z)Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public getTokens(Z)Lcom/huawei/hmf/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/huawei/hmf/tasks/Task<",
            "Lcom/huawei/agconnect/core/service/auth/Token;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/huawei/hmf/tasks/k;

    invoke-direct {v0}, Lcom/huawei/hmf/tasks/k;-><init>()V

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Z)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad;->e:Lcom/huawei/agconnect/credential/obs/ab;

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/ad;->c:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/huawei/agconnect/credential/obs/ad$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/huawei/agconnect/credential/obs/ad$1;-><init>(Lcom/huawei/agconnect/credential/obs/ad;ZLcom/huawei/hmf/tasks/k;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    invoke-virtual {v0}, Lcom/huawei/hmf/tasks/k;->b()Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    return-object p1
.end method
