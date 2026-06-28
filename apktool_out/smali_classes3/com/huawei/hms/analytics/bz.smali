.class public final Lcom/huawei/hms/analytics/bz;
.super Lcom/huawei/hms/analytics/cb;
.source "SourceFile"


# instance fields
.field private lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, "GetPublicKey#execute"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const-string v1, "POST"

    const-string v2, "/getPublicKey"

    invoke-direct {p0, v0, v1, v2, p2}, Lcom/huawei/hms/analytics/cb;-><init>(Lcom/huawei/hms/analytics/cc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/huawei/hms/analytics/bz;->lmn:Ljava/lang/String;

    return-void
.end method

.method private ijk()Z
    .locals 13

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    const-string v3, ""

    const-string v4, "Privacy_MY"

    invoke-static {v1, v4, v2, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "timeInterval"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "requestTime"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    const-string v8, "publicKey"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "pubkey_version"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v6

    cmp-long v1, v11, v9

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    invoke-virtual {v0, v1, v8}, Lcom/huawei/hms/analytics/at;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lcom/huawei/hms/analytics/at;->klm(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v2

    :goto_0
    return v3

    :catchall_0
    move-exception v1

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    new-array v5, v3, [Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    aput-object v6, v5, v2

    invoke-static {v0, v4, v5}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-static {v1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    return v3
.end method

.method private static lmn(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/au;->klm:Ljava/util/Map;

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    const-string v0, "ha-sdk-service"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final klm()V
    .locals 3

    invoke-direct {p0}, Lcom/huawei/hms/analytics/bz;->ijk()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "RequestBas"

    const-string v1, "no need sync pub key"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v1, "pubK_info"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "Privacy_MY"

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-super {p0}, Lcom/huawei/hms/analytics/cb;->klm()V

    return-void
.end method

.method public final lmn()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/huawei/hms/analytics/cb;->lmn()Ljava/util/Map;

    move-result-object v0

    const-string v1, "Os"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Os-Ver"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/hms/analytics/bz;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/bz;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/bz;->lmn:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/bz;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ha-sdk-service"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final onFailure(I)V
    .locals 2

    const-string v0, "GET pub key exception,errorCode: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "RequestBas"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/cb;->lmn(I)V

    return-void
.end method

.method public final onSuccess(Lcom/huawei/hms/analytics/core/transport/net/Response;)V
    .locals 8

    const-string v0, "timeInterval"

    const-string v1, "RequestBas"

    iget-object v2, p0, Lcom/huawei/hms/analytics/cb;->ikl:Lcom/huawei/hms/analytics/cc;

    const-string v3, "0"

    iput-object v3, v2, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/huawei/hms/analytics/cb;->lmn(I)V

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "get pub key result code : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getContent()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "publicKey"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "pubkey_version"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    const/16 v5, 0x564

    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0xea60

    mul-long/2addr v4, v6

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    add-long/2addr v6, v4

    invoke-virtual {v2, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "requestTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v4, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Lcom/huawei/hms/analytics/at;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    invoke-virtual {v0, p1, v3}, Lcom/huawei/hms/analytics/at;->klm(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v0, "Privacy_MY"

    iget-object v3, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v3, v2}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "pub key or version is empty"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "GET pub key exception "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    const-string p1, "GET pub key,json exception"

    goto :goto_2
.end method
