.class public Lcom/huawei/agconnect/apms/jih;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/jih;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;)I
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->ghi:Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;

    .line 2
    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->efg()Lcom/huawei/agconnect/apms/ijk;

    move-result-object v1

    const-string v2, "tasks"

    .line 3
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/ijk;->bcd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move v1, v0

    .line 7
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v1, v4, :cond_3

    .line 8
    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 9
    new-instance v5, Lcom/huawei/agconnect/apms/lkj;

    invoke-direct {v5, v4}, Lcom/huawei/agconnect/apms/lkj;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 10
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskId()Ljava/lang/String;

    move-result-object p0

    .line 11
    new-instance v1, Lcom/huawei/agconnect/apms/lkj;

    const-wide/16 v3, 0x0

    invoke-direct {v1, p0, v0, v3, v4}, Lcom/huawei/agconnect/apms/lkj;-><init>(Ljava/lang/String;IJ)V

    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_4

    .line 13
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/huawei/agconnect/apms/lkj;

    .line 14
    iget v0, p0, Lcom/huawei/agconnect/apms/lkj;->bcd:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return v0

    .line 15
    :catch_0
    sget-object p0, Lcom/huawei/agconnect/apms/jih;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "TaskCache getTaskState JSONException"

    invoke-interface {p0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return v0
.end method

.method public static abc(Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;I)V
    .locals 10

    if-nez p0, :cond_0

    return-void

    .line 16
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->ghi:Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;

    .line 17
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->efg()Lcom/huawei/agconnect/apms/ijk;

    move-result-object v0

    const-string v1, "tasks"

    .line 18
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/ijk;->bcd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 19
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    goto :goto_1

    .line 21
    :cond_1
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move v2, v5

    .line 22
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v2, v6, :cond_3

    .line 23
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 24
    new-instance v7, Lcom/huawei/agconnect/apms/lkj;

    invoke-direct {v7, v6}, Lcom/huawei/agconnect/apms/lkj;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/hilog/task/TaskInfo;->getTaskId()Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 27
    new-instance v2, Lcom/huawei/agconnect/apms/lkj;

    invoke-direct {v2, p0, p1, v6, v7}, Lcom/huawei/agconnect/apms/lkj;-><init>(Ljava/lang/String;IJ)V

    .line 28
    invoke-interface {v3, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_4

    .line 29
    invoke-interface {v3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/huawei/agconnect/apms/lkj;

    .line 30
    iput p1, p0, Lcom/huawei/agconnect/apms/lkj;->bcd:I

    .line 31
    iput-wide v6, p0, Lcom/huawei/agconnect/apms/lkj;->cde:J

    goto :goto_2

    .line 32
    :cond_4
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    .line 34
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 35
    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/agconnect/apms/lkj;

    .line 37
    iget-wide v6, v4, Lcom/huawei/agconnect/apms/lkj;->cde:J

    sub-long v6, p0, v6

    const-wide/32 v8, 0x240c8400

    cmp-long v4, v6, v8

    if-ltz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    move v4, v5

    :goto_4
    if-eqz v4, :cond_5

    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    .line 39
    :cond_7
    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 40
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v5, p1, :cond_8

    .line 41
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/agconnect/apms/lkj;

    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/lkj;->abc()Lorg/json/JSONObject;

    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 43
    :cond_8
    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    .line 44
    :catch_0
    sget-object p0, Lcom/huawei/agconnect/apms/jih;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p1, "TaskCache saveTaskState JSONException"

    invoke-interface {p0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :goto_6
    return-void
.end method
