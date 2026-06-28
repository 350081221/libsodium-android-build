.class public final Lcom/huawei/hms/analytics/framework/c/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/huawei/hms/analytics/framework/c/a/a;

.field private final b:Lcom/huawei/hms/analytics/framework/config/ICallback;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/f;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/analytics/framework/c/a/a;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/analytics/framework/c/a/a;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/f;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/c/f;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/f;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->a()Lcom/huawei/hms/analytics/framework/e/a;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v3, v3, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;J)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/framework/e/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/huawei/hms/analytics/framework/e/b;->b()Z

    move-result v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/f;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/json/JSONObject;

    const-string v7, "^eventId"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "^id"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, "^pid"

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    new-instance v10, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-direct {v10}, Lcom/huawei/hms/analytics/core/storage/Event;-><init>()V

    iget-object v11, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v11, v11, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/huawei/hms/analytics/core/storage/Event;->setServiceTag(Ljava/lang/String;)V

    iget-object v11, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v11, v11, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/huawei/hms/analytics/core/storage/Event;->setEvtType(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Lcom/huawei/hms/analytics/core/storage/Event;->setEvtId(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Lcom/huawei/hms/analytics/core/storage/Event;->setEvtTime(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Lcom/huawei/hms/analytics/core/storage/Event;->setSessionid(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Lcom/huawei/hms/analytics/core/storage/Event;->setSessionName(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Lcom/huawei/hms/analytics/core/storage/Event;->setAssociationid(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Lcom/huawei/hms/analytics/core/storage/Event;->setPid(Ljava/lang/String;)V

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Lcom/huawei/hms/analytics/core/storage/Event;->setContent(Ljava/lang/String;)V

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->readEvents(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1, v0}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteByTag(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "no have last region data. tag: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v1, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "regionReport"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const/4 v4, 0x0

    :cond_4
    :goto_2
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v0

    const-string v1, "region_change"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/SyncManager;->countDown(Ljava/lang/String;)V

    if-eqz v4, :cond_5

    new-instance v0, Lcom/huawei/hms/analytics/framework/c/e;

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/f;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-direct {v0, v4, v1, v2}, Lcom/huawei/hms/analytics/framework/c/e;-><init>(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/framework/c/e;->d()V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/f;->a:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2, v0}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->serviceListener(ZLjava/lang/String;)V

    return-void
.end method
