.class public final Lcom/huawei/hms/analytics/cp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final hij:Z

.field private final ijk:Ljava/lang/String;

.field private ikl:I

.field private klm:Lcom/huawei/hms/analytics/be;

.field private lmn:Lcom/huawei/hms/analytics/cn;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/cp;->ijk:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/huawei/hms/analytics/cp;->hij:Z

    return-void
.end method

.method private lmn()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cn;->lmn()Z

    move-result v0

    const-string v1, "LgEvtReport"

    if-nez v0, :cond_0

    const-string v0, "cache log event is error"

    :goto_0
    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    iget-object v1, v1, Lcom/huawei/hms/analytics/cn;->klm:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/be;->lmn(Ljava/util/List;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cn;->ijk()V

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lcom/huawei/hms/analytics/cq;

    iget-object v2, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    iget-object v3, p0, Lcom/huawei/hms/analytics/cp;->ijk:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/huawei/hms/analytics/cp;->hij:Z

    invoke-direct {v0, v2, v3, v4}, Lcom/huawei/hms/analytics/cq;-><init>(Lcom/huawei/hms/analytics/cn;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cq;->lmn()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "event model json error"

    goto :goto_0
.end method

.method private lmn(Lcom/huawei/hms/analytics/database/LogConfig;Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/analytics/database/LogConfig;",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/database/LogEvent;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget v1, p0, Lcom/huawei/hms/analytics/cp;->ikl:I

    if-lez v1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p2, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iget v2, p0, Lcom/huawei/hms/analytics/cp;->ikl:I

    iget-object v3, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    if-eqz p1, :cond_4

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "projectId"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "groupId"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "streamId"

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogTags()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getLogTags()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    :goto_1
    const-string v6, "tags"

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v5, v3, Lcom/huawei/hms/analytics/cn;->ijk:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, v3, Lcom/huawei/hms/analytics/cn;->ijk:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v3, p1, v1}, Lcom/huawei/hms/analytics/cn;->lmn(Lorg/json/JSONArray;Ljava/util/List;)I

    move-result v5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v6, 0x1

    if-ne v5, v1, :cond_3

    move v1, v6

    goto :goto_2

    :cond_3
    move v1, v0

    :goto_2
    iput-boolean v1, v3, Lcom/huawei/hms/analytics/cn;->ikl:Z

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v7, "events_common"

    invoke-virtual {v1, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "events"

    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, v3, Lcom/huawei/hms/analytics/cn;->lmn:Lorg/json/JSONArray;

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/2addr v2, v5

    iput v2, p0, Lcom/huawei/hms/analytics/cp;->ikl:I

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    return v6

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "log config is null"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "construct Event JsonArray exception."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "LgEvtReport"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;

    iget-object p1, p1, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object p1, p1, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-virtual {p1, p2}, Lorg/greenrobot/greendao/a;->deleteInTx(Ljava/lang/Iterable;)V

    :cond_5
    return v0
.end method


# virtual methods
.method public final run()V
    .locals 6

    const-string v0, "LgEvtReport"

    new-instance v1, Lcom/huawei/hms/analytics/bu;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/bu;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/analytics/cp;->ijk:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/bu;->lmn(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/be;->lmn()Lcom/huawei/hms/analytics/be;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;
    :try_end_0
    .catch Lcom/huawei/hms/analytics/bc$lmn; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, v1, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v1, v1, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v1}, Lorg/greenrobot/greendao/a;->loadAll()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v0, Lcom/huawei/hms/analytics/cn;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Lcom/huawei/hms/analytics/cn;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    new-instance v0, Lcom/huawei/hms/analytics/df$klm;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/df$klm;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/database/LogConfig;

    iget-object v2, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/database/LogConfig;->getId()Ljava/lang/Long;

    move-result-object v3

    iget-object v2, v2, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v2, v2, Lcom/huawei/hms/analytics/bf;->klm:Lcom/huawei/hms/analytics/database/LogEventDao;

    invoke-virtual {v2}, Lorg/greenrobot/greendao/a;->queryBuilder()Lorg/greenrobot/greendao/query/k;

    move-result-object v2

    sget-object v4, Lcom/huawei/hms/analytics/database/LogEventDao$Properties;->ikl:Lorg/greenrobot/greendao/i;

    invoke-virtual {v4, v3}, Lorg/greenrobot/greendao/i;->b(Ljava/lang/Object;)Lorg/greenrobot/greendao/query/m;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Lorg/greenrobot/greendao/query/m;

    invoke-virtual {v2, v3, v5}, Lorg/greenrobot/greendao/query/k;->M(Lorg/greenrobot/greendao/query/m;[Lorg/greenrobot/greendao/query/m;)Lorg/greenrobot/greendao/query/k;

    move-result-object v2

    invoke-virtual {v2}, Lorg/greenrobot/greendao/query/k;->e()Lorg/greenrobot/greendao/query/j;

    move-result-object v2

    invoke-virtual {v2}, Lorg/greenrobot/greendao/query/j;->l()Lorg/greenrobot/greendao/query/j;

    move-result-object v2

    invoke-virtual {v2}, Lorg/greenrobot/greendao/query/j;->n()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    iput v4, p0, Lcom/huawei/hms/analytics/cp;->ikl:I

    iget-object v3, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    iget-object v3, v3, Lcom/huawei/hms/analytics/cn;->fgh:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_1
    iget-object v3, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/database/LogConfig;->getRegion()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/huawei/hms/analytics/cn;->fgh:Ljava/lang/String;

    :cond_4
    iget-object v3, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    iget-object v3, v3, Lcom/huawei/hms/analytics/cn;->fgh:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/database/LogConfig;->getRegion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-direct {p0, v1, v2}, Lcom/huawei/hms/analytics/cp;->lmn(Lcom/huawei/hms/analytics/database/LogConfig;Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_5
    invoke-direct {p0}, Lcom/huawei/hms/analytics/cp;->lmn()V

    goto :goto_1

    :cond_6
    :goto_2
    iget-object v2, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;

    iget-object v2, v2, Lcom/huawei/hms/analytics/be;->lmn:Lcom/huawei/hms/analytics/bf;

    iget-object v2, v2, Lcom/huawei/hms/analytics/bf;->lmn:Lcom/huawei/hms/analytics/database/LogConfigDao;

    invoke-virtual {v2, v1}, Lorg/greenrobot/greendao/a;->delete(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/cp;->lmn:Lcom/huawei/hms/analytics/cn;

    iget v2, v1, Lcom/huawei/hms/analytics/cn;->ghi:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Lcom/huawei/hms/analytics/cn;->ghi:I

    goto :goto_0

    :cond_7
    invoke-direct {p0}, Lcom/huawei/hms/analytics/cp;->lmn()V

    return-void

    :cond_8
    :goto_3
    const-string v1, "No have log events in cache"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/be;->klm()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_9

    iget-object v0, p0, Lcom/huawei/hms/analytics/cp;->klm:Lcom/huawei/hms/analytics/be;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/be;->ikl()V

    :cond_9
    return-void

    :catch_0
    const-string v1, "log db init failed"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
