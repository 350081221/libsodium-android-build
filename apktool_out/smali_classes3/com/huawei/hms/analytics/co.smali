.class public final Lcom/huawei/hms/analytics/co;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final ghi:Lcom/huawei/hms/analytics/bu;

.field private hij:Lcom/huawei/hms/analytics/be;

.field private final ijk:Ljava/lang/String;

.field private final ikl:Ljava/lang/String;

.field private final klm:Ljava/lang/String;

.field private final lmn:Lcom/huawei/hms/analytics/type/HALogConfig;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/type/HALogConfig;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    iput-object p3, p0, Lcom/huawei/hms/analytics/co;->klm:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/co;->ijk:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/co;->ikl:Ljava/lang/String;

    new-instance p1, Lcom/huawei/hms/analytics/bu;

    invoke-direct {p1}, Lcom/huawei/hms/analytics/bu;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/co;->ghi:Lcom/huawei/hms/analytics/bu;

    return-void
.end method

.method private lmn(Lcom/huawei/hms/analytics/database/LogConfig;)J
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/type/HALogConfig;->getTags()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/analytics/dd;->lmn(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "LogEvtRecord"

    const-string v2, ""

    if-eqz p1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {p1, v2}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogTags(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/be;->klm(Lcom/huawei/hms/analytics/database/LogConfig;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-string p1, "update indexId: "

    goto :goto_2

    :cond_1
    new-instance p1, Lcom/huawei/hms/analytics/database/LogConfig;

    invoke-direct {p1}, Lcom/huawei/hms/analytics/database/LogConfig;-><init>()V

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {p1, v2}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogTags(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogGroupId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setLogStreamId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/type/HALogConfig;->getRegion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setRegion(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/type/HALogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/database/LogConfig;->setProjectId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/be;->lmn(Lcom/huawei/hms/analytics/database/LogConfig;)J

    move-result-wide v2

    const-string p1, "insert indexId: "

    :goto_2
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-wide v2
.end method

.method private lmn(Ljava/lang/Long;)V
    .locals 3

    new-instance v0, Lcom/huawei/hms/analytics/database/LogEvent;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/database/LogEvent;-><init>()V

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/database/LogEvent;->setConfigId(Ljava/lang/Long;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/co;->ikl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/database/LogEvent;->setEvtTime(Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "$Content"

    iget-object v2, p0, Lcom/huawei/hms/analytics/co;->klm:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/database/LogEvent;->setContent(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "LogEvtRecord"

    const-string v1, "setContent json exception"

    invoke-static {p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/co;->ijk:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/database/LogEvent;->setEventId(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/be;->lmn(Lcom/huawei/hms/analytics/database/LogEvent;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    const-string v0, "LogEvtRecord"

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/be;->lmn()Lcom/huawei/hms/analytics/be;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;
    :try_end_0
    .catch Lcom/huawei/hms/analytics/bc$lmn; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/type/HALogConfig;->getRegion()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v3}, Lcom/huawei/hms/analytics/type/HALogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v4}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/hms/analytics/co;->lmn:Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-virtual {v5}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v1, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v1, v1, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v1}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v1

    sget-object v6, Lcom/huawei/hms/analytics/database/LogConfigDao$Properties;->klm:Lorg/greenrobot/greendao/i;

    invoke-virtual {v6, v2}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v2

    const/4 v6, 0x0

    new-array v7, v6, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v1, v2, v7}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v1

    sget-object v2, Lcom/huawei/hms/analytics/database/LogConfigDao$Properties;->ikl:Lorg/greenrobot/greendao/i;

    invoke-virtual {v2, v3}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v2

    new-array v3, v6, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v1, v2, v3}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v1

    sget-object v2, Lcom/huawei/hms/analytics/database/LogConfigDao$Properties;->ijk:Lorg/greenrobot/greendao/i;

    invoke-virtual {v2, v4}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v2

    new-array v3, v6, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v1, v2, v3}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v1

    sget-object v2, Lcom/huawei/hms/analytics/database/LogConfigDao$Properties;->hij:Lorg/greenrobot/greendao/i;

    invoke-virtual {v2, v5}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v2

    new-array v3, v6, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v1, v2, v3}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v1

    invoke-virtual {v1}, Lorg/greenrobot/greendao/query/k;->e()Lorg/greenrobot/greendao/query/j;

    move-result-object v1

    invoke-virtual {v1}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object v1

    invoke-virtual {v1}, Lorg/greenrobot/greendao/query/j;->u()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/database/LogConfig;

    iget-object v2, p0, Lcom/huawei/hms/analytics/co;->ghi:Lcom/huawei/hms/analytics/bu;

    sget-object v3, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGELENGTH:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v4, "ha_levt.db"

    invoke-virtual {v2, v3, v4}, Lcom/huawei/hms/analytics/bu;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/be;->klm()J

    move-result-wide v2

    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/co;->lmn(Lcom/huawei/hms/analytics/database/LogConfig;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/co;->lmn(Ljava/lang/Long;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/be;->klm()J

    move-result-wide v1

    const-string v3, "count: "

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/co;->ghi:Lcom/huawei/hms/analytics/bu;

    sget-object v4, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGESIZE:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    invoke-virtual {v3, v4, v1, v2}, Lcom/huawei/hms/analytics/bu;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;J)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/huawei/hms/analytics/co;->ghi:Lcom/huawei/hms/analytics/bu;

    sget-object v2, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->NETWORK:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/huawei/hms/analytics/bu;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-wide v2, v1, Lcom/huawei/hms/analytics/at;->l:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    const-wide/16 v6, 0x7530

    cmp-long v2, v2, v6

    if-lez v2, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    const-string v2, "_openness_config_tag"

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bh;->klm()V

    iput-wide v4, v1, Lcom/huawei/hms/analytics/at;->l:J

    :cond_1
    return-void

    :cond_2
    const-string v1, "log autoReport timeout. interval < 30s "

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void

    :cond_4
    :goto_0
    const-string v2, "log db file reach max limited size,clear it"

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/co;->hij:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/be;->ikl()V

    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/co;->lmn(Lcom/huawei/hms/analytics/database/LogConfig;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/co;->lmn(Ljava/lang/Long;)V

    return-void

    :catch_0
    const-string v1, "log db init failed"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
