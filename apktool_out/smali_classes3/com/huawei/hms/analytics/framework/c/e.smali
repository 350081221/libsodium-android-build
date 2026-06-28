.class public final Lcom/huawei/hms/analytics/framework/c/e;
.super Lcom/huawei/hms/analytics/framework/c/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/c/a/a;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/analytics/framework/c/a;-><init>(Ljava/util/List;Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    return-void
.end method

.method private e()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/framework/c/a;->b(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-interface {v2, v3}, Lcom/huawei/hms/analytics/framework/config/ICallback;->setStopEventReport(Z)V

    :goto_0
    int-to-long v4, v3

    cmp-long v2, v4, v0

    if-gez v2, :cond_0

    mul-int/lit16 v2, v3, 0x12c

    invoke-virtual {p0, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(I)Ljava/util/List;

    move-result-object v2

    :try_start_0
    invoke-virtual {p0, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v4, "regionProcess"

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/framework/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iget-object v0, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/analytics/framework/c/a;->a(ZLjava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hms/analytics/framework/c/a;->a()Lcom/huawei/hms/analytics/core/storage/Event;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->d:Lcom/huawei/hms/analytics/framework/c/a/a;

    iput-boolean v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->e:Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/a;->b:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/framework/config/ICallback;->setStopEventReport(Z)V

    invoke-virtual {p0, v2}, Lcom/huawei/hms/analytics/framework/c/a;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/analytics/framework/c/e;->e()V

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "regionProcess"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
