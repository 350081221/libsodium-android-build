.class public final Lcom/huawei/hms/analytics/framework/c/g;
.super Lcom/huawei/hms/analytics/framework/c/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hms/analytics/framework/c/a/a;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/huawei/hms/analytics/framework/c/a;-><init>(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    return-void
.end method

.method private e()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/framework/config/ICallback;->setStopEventReport(Z)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v2, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->count(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/framework/c/a;->b(J)J

    move-result-wide v2

    :goto_0
    int-to-long v4, v1

    cmp-long v0, v4, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v5, v4, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    iget-object v4, v4, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    const/16 v6, 0x12c

    invoke-interface {v0, v5, v4, v6}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->readEvents(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x1

    invoke-virtual {p0, v0, v4}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;Z)V

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 4

    const-string v0, "ReportAssignment"

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/framework/c/a;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(ZLjava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hms/analytics/framework/c/a;->a()Lcom/huawei/hms/analytics/core/storage/Event;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iput-boolean v3, v1, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-interface {v1, v3}, Lcom/huawei/hms/analytics/framework/config/ICallback;->setStopEventReport(Z)V

    invoke-virtual {p0, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(J)V

    :cond_0
    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/a;->c:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/analytics/framework/c/g;->e()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    const-string v1, "upload data failed."

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
