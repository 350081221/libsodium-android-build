.class public final Lcom/huawei/hms/analytics/framework/c/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:Lcom/huawei/hms/analytics/framework/config/ICallback;

.field private b:[B

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/huawei/hms/analytics/framework/c/a/a;


# direct methods
.method public constructor <init>([BLcom/huawei/hms/analytics/framework/c/a/a;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lcom/huawei/hms/analytics/framework/c/a/a;",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/i;->b:[B

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/c/i;->c:Ljava/util/List;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    return-void
.end method

.method private a()[Ljava/lang/String;
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v1, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getCollectUrls(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    const-string v3, "oper"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "{url}"

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    const-string v4, "maint"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "{url}/common/hmshimaintqrt"

    aget-object v4, v0, v1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    const-string v4, "diffprivacy"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "{url}/common/common2"

    aget-object v4, v0, v1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    const-string v4, "preins"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "{url}/common/hmshioperbatch"

    aget-object v4, v0, v1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_1

    :cond_2
    const-string v2, "{url}/common/hmshioperqrt"

    aget-object v4, v0, v1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 14

    const-string v0, "send data running"

    const-string v1, "SendMission"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;-><init>()V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-direct {p0}, Lcom/huawei/hms/analytics/framework/c/i;->a()[Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setUrls([Ljava/lang/String;)V

    const-string v3, "POST"

    invoke-interface {v0, v3}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setRequestMethod(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/i;->b:[B

    invoke-interface {v0, v3}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setReportData([B)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v3

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v6, v6, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {v3, v6}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v3

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v6, v6, Lcom/huawei/hms/analytics/framework/c/a/a;->d:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v7

    iget-object v8, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v8, v8, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v7

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v8

    iget-object v8, v8, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-interface {v8}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getAppVer()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v9

    iget-object v9, v9, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-interface {v9}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getModel()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    const-string v11, "App-Id"

    invoke-interface {v7}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getAppId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v10, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "App-Ver"

    invoke-interface {v10, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "Sdk-Name"

    const-string v8, "hianalytics"

    invoke-interface {v10, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "Sdk-Ver"

    const-string v8, "6.7.0.300"

    invoke-interface {v10, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "Device-Type"

    invoke-interface {v10, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v7, v7, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    const-string v8, "servicetag"

    invoke-interface {v10, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "sendData RequestId : "

    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Request-Id"

    invoke-interface {v10, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v6, v6, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-interface {v3, v6}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getHttpHeader(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v10, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    invoke-interface {v0, v10}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setHttpHeaders(Ljava/util/Map;)V

    invoke-interface {v2}, Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setContext(Landroid/content/Context;)V

    invoke-interface {v0}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->execute()Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    const/16 v2, 0xc8

    const/4 v3, -0x2

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x3

    const-string v11, "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:"

    const/4 v12, 0x0

    if-ne v0, v2, :cond_3

    :try_start_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-boolean v6, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    if-nez v6, :cond_3

    iget-boolean v6, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->f:Z

    if-nez v6, :cond_3

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->c:Ljava/util/List;

    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_3

    const-string v6, "storageHandler deleteEvents"

    invoke-static {v1, v6}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->c:Ljava/util/List;

    invoke-interface {v2, v6}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteEvents(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    move-object v13, v2

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->a:Lcom/huawei/hms/analytics/framework/config/ICallback;

    if-eqz v2, :cond_2

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-boolean v6, v6, Lcom/huawei/hms/analytics/framework/c/a/a;->f:Z

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v12

    :goto_0
    iget-object v7, p0, Lcom/huawei/hms/analytics/framework/c/i;->c:Ljava/util/List;

    move v3, v0

    invoke-interface/range {v2 .. v7}, Lcom/huawei/hms/analytics/framework/config/ICallback;->onResult(IJILjava/util/List;)V

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v3, v3, Lcom/huawei/hms/analytics/framework/c/a/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v5, v4, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    aput-object v5, v3, v12

    iget-object v4, v4, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    aput-object v4, v3, v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v8

    invoke-static {v1, v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v13

    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/i;->a:Lcom/huawei/hms/analytics/framework/config/ICallback;

    if-eqz v2, :cond_5

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-boolean v6, v6, Lcom/huawei/hms/analytics/framework/c/a/a;->f:Z

    if-eqz v6, :cond_4

    move v6, v3

    goto :goto_2

    :cond_4
    move v6, v12

    :goto_2
    iget-object v7, p0, Lcom/huawei/hms/analytics/framework/c/i;->c:Ljava/util/List;

    move v3, v0

    invoke-interface/range {v2 .. v7}, Lcom/huawei/hms/analytics/framework/config/ICallback;->onResult(IJILjava/util/List;)V

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v3, v3, Lcom/huawei/hms/analytics/framework/c/a/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/i;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v5, v4, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    aput-object v5, v3, v12

    iget-object v4, v4, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    aput-object v4, v3, v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v8

    invoke-static {v1, v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
