.class public final Lcom/huawei/hms/analytics/do;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private klm:Ljava/util/concurrent/CountDownLatch;

.field private final lmn:Lcom/huawei/hms/analytics/cb;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/cb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/do;->lmn:Lcom/huawei/hms/analytics/cb;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CountDownLatch;Lcom/huawei/hms/analytics/cb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/hms/analytics/do;->lmn:Lcom/huawei/hms/analytics/cb;

    iput-object p1, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final lmn()Ljava/lang/String;
    .locals 11

    const-string v0, "message"

    const-string v1, "code"

    const-string v2, "SE-003"

    const-string v3, ""

    const-string v4, "start get token from agc"

    const-string v5, "TokenAssignment"

    invoke-static {v5, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "1"

    const-string v6, "Token#getTokenString()"

    invoke-static {v6}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v6

    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, "get AGConnect Instance is null"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v7

    iget-object v7, v7, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v7, v7, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {v7}, Lcom/huawei/agconnect/AGConnectInstance;->initialize(Landroid/content/Context;)V

    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, "get AGConnect Instance is null again"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SE-003:002"
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    if-eqz v1, :cond_0

    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    iput-object v4, v6, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object v0, v6, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v6}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-object v3

    :cond_1
    :try_start_1
    const-class v8, Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;

    invoke-virtual {v7, v8}, Lcom/huawei/agconnect/AGConnectInstance;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;

    if-nez v7, :cond_2

    const-string v7, "get Credentials Provider is null"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SE-003:003"
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_2
    :try_start_2
    invoke-interface {v7}, Lcom/huawei/agconnect/core/service/auth/CredentialsProvider;->getTokens()Lcom/huawei/hmf/tasks/Task;

    move-result-object v7

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v9, 0x1388

    invoke-static {v7, v9, v10, v8}, Lcom/huawei/hmf/tasks/m;->d(Lcom/huawei/hmf/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/huawei/agconnect/core/service/auth/Token;

    invoke-interface {v7}, Lcom/huawei/agconnect/core/service/auth/Token;->getTokenString()Ljava/lang/String;

    move-result-object v8
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v9

    iget-object v9, v9, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object v8, v9, Lcom/huawei/hms/analytics/at;->hij:Ljava/lang/String;

    const-string v4, "0"

    invoke-interface {v7}, Lcom/huawei/agconnect/core/service/auth/Token;->getExpiration()J

    move-result-wide v9

    iget-object v7, p0, Lcom/huawei/hms/analytics/do;->lmn:Lcom/huawei/hms/analytics/cb;

    invoke-virtual {v7}, Lcom/huawei/hms/analytics/cb;->klm()V

    const-string v7, "success: "

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v7, "Failed to obtain token from agc, token is empty"

    invoke-static {v5, v2, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "SE-003:001"
    :try_end_3
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    iget-object v0, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_4
    iput-object v4, v6, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object v3, v6, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    goto :goto_5

    :catch_0
    move-exception v7

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v7

    move-object v8, v3

    :goto_2
    :try_start_4
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5

    invoke-virtual {v7, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v7, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v1, v1, 0x4

    if-le v0, v1, :cond_5

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    move-object v0, v3

    :goto_3
    const-string v1, "get token exception on the AGC! "

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v2, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    if-eqz v1, :cond_6

    goto :goto_4

    :catch_2
    move-object v8, v3

    :catch_3
    :try_start_5
    const-string v0, "agc class not found"

    invoke-static {v5, v2, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SE-003:004"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    if-eqz v1, :cond_6

    :goto_4
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_6
    iput-object v4, v6, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object v0, v6, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    :goto_5
    invoke-static {v6}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-object v8

    :goto_6
    iget-object v1, p0, Lcom/huawei/hms/analytics/do;->klm:Ljava/util/concurrent/CountDownLatch;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_7
    iput-object v4, v6, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object v3, v6, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v6}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw v0
.end method
