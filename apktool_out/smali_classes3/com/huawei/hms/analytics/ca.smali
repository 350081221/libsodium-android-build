.class public final Lcom/huawei/hms/analytics/ca;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static ikl(Lcom/huawei/hms/analytics/av;Lorg/json/JSONObject;)V
    .locals 8

    const-string v0, "onlineApi"

    const-string v1, "disable_evts"

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string p0, "Not has disabled events"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    new-instance v3, Lcom/huawei/hms/analytics/av$lmn;

    invoke-direct {v3}, Lcom/huawei/hms/analytics/av$lmn;-><init>()V

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    const/16 v5, 0x3e8

    if-le v4, v5, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Get disabled events size is "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ". Exceeds limit."

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/huawei/hms/analytics/dd;->lmn(Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move v4, v5

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_3

    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_4

    iput-object p1, v3, Lcom/huawei/hms/analytics/av$lmn;->lmn:Ljava/util/List;

    iput-object v3, p0, Lcom/huawei/hms/analytics/av;->hij:Lcom/huawei/hms/analytics/av$lmn;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-void

    :catch_0
    const-string p0, "disabled evts is not json"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static klm(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 1

    invoke-static {p0, p2, p3}, Lcom/huawei/hms/analytics/ca;->lmn(Landroid/content/Context;J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hms/analytics/ca;->lmn(Landroid/content/Context;Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method private static klm(Lcom/huawei/hms/analytics/av;Lorg/json/JSONObject;)V
    .locals 11

    const-string v0, "onlineApi"

    const-string v1, "online_events"

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string p0, "Not has online events"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    const/16 v4, 0x3e8

    if-le v3, v4, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Get online events size is "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ". Exceeds limit."

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/huawei/hms/analytics/dd;->lmn(Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move v3, v4

    :cond_2
    const/4 p1, 0x0

    move v1, p1

    :goto_0
    if-ge v1, v3, :cond_7

    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    new-instance v5, Lcom/huawei/hms/analytics/av$klm;

    invoke-direct {v5}, Lcom/huawei/hms/analytics/av$klm;-><init>()V

    const-string v6, "event_id"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/huawei/hms/analytics/av$klm;->lmn:Ljava/lang/String;

    const-string v6, "time_ranges"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-eqz v6, :cond_6

    move v6, p1

    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v6, v7, :cond_4

    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    new-instance v8, Lcom/huawei/hms/analytics/av$ikl;

    invoke-direct {v8}, Lcom/huawei/hms/analytics/av$ikl;-><init>()V

    const-string v9, "start"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iput-object v9, v8, Lcom/huawei/hms/analytics/av$ikl;->lmn:Ljava/lang/Long;

    const-string v9, "end"

    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v8, Lcom/huawei/hms/analytics/av$ikl;->klm:Ljava/lang/Long;

    iget-object v7, v5, Lcom/huawei/hms/analytics/av$klm;->klm:Ljava/util/List;

    if-nez v7, :cond_3

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v5, Lcom/huawei/hms/analytics/av$klm;->klm:Ljava/util/List;

    :cond_3
    iget-object v7, v5, Lcom/huawei/hms/analytics/av$klm;->klm:Ljava/util/List;

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    iget-object v4, p0, Lcom/huawei/hms/analytics/av;->klm:Ljava/util/List;

    if-nez v4, :cond_5

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/huawei/hms/analytics/av;->klm:Ljava/util/List;

    :cond_5
    iget-object v4, p0, Lcom/huawei/hms/analytics/av;->klm:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    iget-object p1, p0, Lcom/huawei/hms/analytics/av;->klm:Ljava/util/List;

    if-eqz p1, :cond_8

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/av;->ghi:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    return-void

    :catch_0
    const-string p0, "instance events json exception"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/av;
    .locals 4

    const-class v0, Lcom/huawei/hms/analytics/ca;

    monitor-enter v0

    :try_start_0
    const-string v1, "global_v2"

    const-string v2, "instance_event_info"

    const-string v3, ""

    invoke-static {p0, v1, v2, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    :try_start_1
    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/ca;->lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/av;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/av;
    .locals 6

    new-instance v0, Lcom/huawei/hms/analytics/av;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/av;-><init>()V

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "query_interval"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x708

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    iput-wide v2, v0, Lcom/huawei/hms/analytics/av;->lmn:J

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/ca;->klm(Lcom/huawei/hms/analytics/av;Lorg/json/JSONObject;)V

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/ca;->ikl(Lcom/huawei/hms/analytics/av;Lorg/json/JSONObject;)V

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/ca;->lmn(Lcom/huawei/hms/analytics/av;Lorg/json/JSONObject;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "global_v2"

    const-string v2, "instance_event_info"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v2, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static declared-synchronized lmn(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 3

    const-class v0, Lcom/huawei/hms/analytics/ca;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/cx;->ikl()Lcom/huawei/hms/analytics/cx;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/analytics/ci;

    invoke-direct {v2, p1}, Lcom/huawei/hms/analytics/ci;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    const-string p1, "latest_upload_time"

    const-string v1, "instance_event_trigger_time"

    invoke-static {p0, p1, v1, p2, p3}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static lmn(Landroid/content/Context;J)Z
    .locals 2

    const-string v0, "latest_upload_time"

    const-string v1, "instance_event_trigger_time"

    invoke-static {p0, v0, v1}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/32 v0, 0x1b7740

    cmp-long p0, p1, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static lmn(Lcom/huawei/hms/analytics/av;Lorg/json/JSONObject;)Z
    .locals 6

    const-string v0, "timestamp"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "region"

    if-eqz v1, :cond_0

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/av;->ikl:Ljava/lang/Long;

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/av;->ijk:Ljava/lang/String;

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    const-string v5, "_openness_config_tag"

    invoke-virtual {v1, v5}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "onlineApi"

    const-string v0, "json put exception"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iput-object v1, p0, Lcom/huawei/hms/analytics/av;->ijk:Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/av;->ikl:Ljava/lang/Long;

    const/4 p0, 0x0

    return p0
.end method
