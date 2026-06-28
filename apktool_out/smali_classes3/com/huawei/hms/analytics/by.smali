.class public final Lcom/huawei/hms/analytics/by;
.super Lcom/huawei/hms/analytics/cb;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const-string v0, "GetOaidSwitch#execute"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const-string v1, "GET"

    const-string v2, "/analytics/api/config?config_key=oaid_flag"

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/huawei/hms/analytics/cb;-><init>(Lcom/huawei/hms/analytics/cc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static ijk()Z
    .locals 10

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v2, ""

    const-string v3, "global_v2"

    const-string v4, "oid_switch_info"

    invoke-static {v1, v3, v4, v2}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    return v5

    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v6, "timestamp"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v6

    const-wide/32 v6, 0x5265c00

    cmp-long v6, v8, v6

    if-lez v6, :cond_1

    return v5

    :cond_1
    const-string v6, "config_value"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "true"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iput-boolean v5, v0, Lcom/huawei/hms/analytics/at;->m:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return v1

    :catch_0
    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    return v5
.end method


# virtual methods
.method public final klm()V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/by;->ijk()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "RequestBas"

    const-string v1, "no need sync oaid switch"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/huawei/hms/analytics/cb;->klm()V

    return-void
.end method

.method public final onFailure(I)V
    .locals 2

    const-string v0, "GET oaid flag exception,errorCode: "

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
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/cb;->ikl:Lcom/huawei/hms/analytics/cc;

    const-string v1, "0"

    iput-object v1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/cb;->lmn(I)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "get oaid_flag result code : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RequestBas"

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getContent()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "configList"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "config_value"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "true"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, v0, Lcom/huawei/hms/analytics/at;->m:Z

    const-string v3, "timestamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    iget-object v2, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v3, "global_v2"

    const-string v4, "oid_switch_info"

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v3, v4, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    iput-boolean v1, v0, Lcom/huawei/hms/analytics/at;->m:Z

    :cond_1
    return-void
.end method
