.class public final Lcom/huawei/hms/analytics/framework/c/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:Z

.field public b:Lcom/huawei/hms/analytics/framework/config/ICallback;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    :cond_0
    iput-wide p4, p0, Lcom/huawei/hms/analytics/framework/c/d;->e:J

    if-eqz p3, :cond_1

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p4, p0, Lcom/huawei/hms/analytics/framework/c/d;->f:Ljava/util/List;

    :cond_1
    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    const-string p3, "oper"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object p2

    invoke-interface {p2, p3}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->isEnableSession(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->a()Lcom/huawei/hms/analytics/framework/e/a;

    move-result-object p2

    iget-wide p3, p0, Lcom/huawei/hms/analytics/framework/c/d;->e:J

    invoke-virtual {p2, p1, p3, p4}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;J)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/framework/e/b;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/d;->g:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/framework/e/b;->b()Z

    move-result p1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/framework/c/d;->h:Z

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->i:Ljava/util/List;

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/storage/Event;->getServiceTag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/storage/Event;->getEvtType()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private a()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/huawei/hms/analytics/framework/b/b;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/b/c;

    move-result-object v0

    const-string v1, "RecordMission"

    if-nez v0, :cond_0

    const-string v0, "get framework config info error"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/framework/b/c;->a(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    const-wide/16 v6, 0x7530

    cmp-long v2, v2, v6

    if-lez v2, :cond_1

    const-string v2, "begin to auto report!"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/hms/analytics/framework/b/c;->a(Ljava/lang/String;J)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->b()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/framework/c/h;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-direct {v1, v2, v3, v4}, Lcom/huawei/hms/analytics/framework/c/h;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-string v0, "autoReport timeout. interval < 30s "

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/hms/analytics/framework/a/a;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;

    move-result-object v1

    const-string v2, "RecordMission"

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    sget-object v3, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGELENGTH:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v4, "userEvent.db"

    invoke-interface {v1, v3, v4}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v1, "db file reach max limited length,clear db file"

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteAll()V

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->insertEx(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-interface {v0, v3}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->count(Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-nez v5, :cond_1

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->insertEx(Ljava/util/List;)V

    const-string p1, "record event size: 1"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-wide/16 v5, 0x1388

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    const-string v1, "db file reach max limited size,clear db file"

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteByTag(Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->insertEx(Ljava/util/List;)V

    return-void

    :cond_2
    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->insertEx(Ljava/util/List;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->count(Ljava/lang/String;)J

    move-result-wide v3

    const-string p1, "record evt size : "

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->STORAGESIZE:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    invoke-interface {v1, p1, v3, v4}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;J)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;->NETWORK:Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;

    const-string v0, ""

    invoke-interface {v1, p1, v0}, Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy;->decide(Lcom/huawei/hms/analytics/framework/policy/IStoragePolicy$PolicyType;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "ready to auto report!"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/hms/analytics/framework/c/d;->a()V

    :cond_3
    return-void

    :cond_4
    const-string p1, "storageHandler is null!"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    const-string v0, "^eventId"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "^id"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "^pid"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "f"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-direct {v4}, Lcom/huawei/hms/analytics/core/storage/Event;-><init>()V

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/huawei/hms/analytics/core/storage/Event;->setServiceTag(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/huawei/hms/analytics/core/storage/Event;->setEvtType(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/huawei/hms/analytics/core/storage/Event;->setEvtId(Ljava/lang/String;)V

    iget-wide v5, p0, Lcom/huawei/hms/analytics/framework/c/d;->e:J

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/analytics/core/storage/Event;->setEvtTime(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->h:Z

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/analytics/core/storage/Event;->setSessionid(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->g:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hms/analytics/core/storage/Event;->setSessionName(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lcom/huawei/hms/analytics/core/storage/Event;->setAssociationid(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lcom/huawei/hms/analytics/core/storage/Event;->setPid(Ljava/lang/String;)V

    if-eqz v3, :cond_0

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4, v3}, Lcom/huawei/hms/analytics/core/storage/Event;->setPushEvtFlag(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->a:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lcom/huawei/hms/analytics/framework/c/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v4, p2}, Lcom/huawei/hms/analytics/core/storage/Event;->setContent(Ljava/lang/String;)V

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final run()V
    .locals 10

    const-string v0, "RecordMission"

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v1

    const-string v2, "region_change"

    const-wide/16 v3, 0x7d0

    invoke-virtual {v1, v2, v3, v4}, Lcom/huawei/hms/analytics/framework/SyncManager;->await(Ljava/lang/String;J)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v1

    const-string v2, "aaid_task"

    invoke-virtual {v1, v2, v3, v4}, Lcom/huawei/hms/analytics/framework/SyncManager;->await(Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "wait sync error"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/d;->i:Ljava/util/List;

    const-string v4, "$LaunchApp"

    const/4 v5, 0x0

    const-string v6, "$AppFirstOpen"

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v7}, Lcom/huawei/hms/analytics/core/storage/Event;->getEvtId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {v7}, Lcom/huawei/hms/analytics/core/storage/Event;->getEvtId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/d;->f:Ljava/util/List;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    const-string v8, "^eventId"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_3
    const/4 v5, 0x1

    :cond_4
    :goto_1
    invoke-interface {v1, v2, v5}, Lcom/huawei/hms/analytics/framework/config/ICallback;->isAAIDChanged(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "aaid changed"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->i:Ljava/util/List;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/core/storage/Event;->getContent()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/hms/analytics/framework/c/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/core/storage/Event;->setContent(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/framework/c/d;->a(Ljava/util/List;)V

    return-void

    :cond_7
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/d;->f:Ljava/util/List;

    if-nez v0, :cond_8

    return-void

    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/d;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONObject;

    invoke-virtual {p0, v0, v2}, Lcom/huawei/hms/analytics/framework/c/d;->a(Ljava/util/List;Lorg/json/JSONObject;)V

    goto :goto_3

    :cond_9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_a

    return-void

    :cond_a
    iget-boolean v1, p0, Lcom/huawei/hms/analytics/framework/c/d;->a:Z

    if-eqz v1, :cond_b

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->b()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/analytics/framework/c/k;

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/d;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/d;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/d;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/huawei/hms/analytics/framework/c/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_b
    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/framework/c/d;->a(Ljava/util/List;)V

    return-void
.end method
