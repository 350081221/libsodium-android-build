.class public final Lcom/huawei/hms/analytics/framework/c/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation
.end field

.field d:Lcom/huawei/hms/analytics/framework/config/ICallback;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/k;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/k;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/c/k;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/huawei/hms/analytics/framework/c/k;->d:Lcom/huawei/hms/analytics/framework/config/ICallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    new-instance v0, Lcom/huawei/hms/analytics/framework/c/a/a;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/c/a/a;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/k;->a:Ljava/lang/String;

    iput-object v2, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/k;->b:Ljava/lang/String;

    iput-object v2, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/k;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v2

    invoke-interface {v2}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getRegion()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/k;->d:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-interface {v2}, Lcom/huawei/hms/analytics/framework/config/ICallback;->isStopEvent()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/k;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/k;->b:Ljava/lang/String;

    invoke-static {v2, v4, v1}, Lcom/huawei/hms/analytics/framework/c/c;->a(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/k;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v1, :cond_0

    :goto_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/k;->c:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/k;->c:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/core/storage/Event;->getPushEvtFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v4}, Lcom/huawei/hms/analytics/core/storage/Event;->getPushEvtFlag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/k;->c:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    :goto_2
    new-instance v1, Lcom/huawei/hms/analytics/framework/c/j;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/k;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/k;->d:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-direct {v1, v2, v0, v4}, Lcom/huawei/hms/analytics/framework/c/j;-><init>(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/framework/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, ""

    invoke-virtual {v1, v3, v0}, Lcom/huawei/hms/analytics/framework/c/a;->a(ZLjava/lang/String;)V

    :try_start_0
    invoke-virtual {v1}, Lcom/huawei/hms/analytics/framework/c/a;->c()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v2, "ReportAssignment"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/huawei/hms/analytics/framework/c/a;->a(J)V

    return-void
.end method
