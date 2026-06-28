.class public final Lcom/huawei/hms/analytics/framework/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/c/a/a;
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/framework/c/a/a;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/c/a/a;-><init>()V

    iput-object p2, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    iget-object p2, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    iput-object p1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->f:Z

    return-object v0
.end method


# virtual methods
.method public final clearCacheData(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/framework/d/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final onBackground(J)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->a()Lcom/huawei/hms/analytics/framework/e/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/hms/analytics/framework/e/b;->c:Z

    iput-wide p1, v0, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    return-void
.end method

.method public final onEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    return-void
.end method

.method public final onEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            "J)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V

    return-void
.end method

.method public final onEvent(Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    return-void
.end method

.method public final onEventRecord(Ljava/lang/String;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;J)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V

    return-void
.end method

.method public final onForeground(J)V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->a()Lcom/huawei/hms/analytics/framework/e/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object v0

    iget-wide v1, v0, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    iget-wide v1, v0, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    sub-long/2addr p1, v1

    iget-wide v1, v0, Lcom/huawei/hms/analytics/framework/e/b;->b:J

    cmp-long p1, p1, v1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lcom/huawei/hms/analytics/framework/e/b;->c:Z

    iput-wide v3, v0, Lcom/huawei/hms/analytics/framework/e/b;->d:J

    :cond_1
    return-void
.end method

.method public final onReport(Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/framework/c/h;

    invoke-direct {v1, v0, p1, p2}, Lcom/huawei/hms/analytics/framework/c/h;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->b()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final onReport(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/analytics/framework/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/c/a/a;

    move-result-object p1

    iget-object p2, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {p2}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object p2

    const-string v0, "region_change"

    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/framework/SyncManager;->start(Ljava/lang/String;)V

    new-instance p2, Lcom/huawei/hms/analytics/framework/c/f;

    invoke-direct {p2, p1, p3}, Lcom/huawei/hms/analytics/framework/c/f;-><init>(Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/framework/c/f;->run()V

    return-void

    :cond_0
    iget-object p2, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {p2}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p3, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-interface {p2, p3}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteByTag(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object p2

    iget-object p3, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object p2

    const/4 p3, 0x1

    iget-object p1, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    invoke-interface {p2, p3, p1}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->serviceListener(ZLjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onReport(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/analytics/framework/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/c/a/a;

    move-result-object p1

    iget-object p2, p1, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    invoke-static {p2}, Lcom/huawei/hms/analytics/framework/d/a;->a(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lcom/huawei/hms/analytics/framework/c/f;

    invoke-direct {p2, p1, p3, p4}, Lcom/huawei/hms/analytics/framework/c/f;-><init>(Lcom/huawei/hms/analytics/framework/c/a/a;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/f/a;->b()Lcom/huawei/hms/analytics/framework/f/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/huawei/hms/analytics/framework/f/a;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final onStreamEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-static {v0, p1, p2, p3}, Lcom/huawei/hms/analytics/framework/d/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    return-void
.end method

.method public final onStreamEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            "J)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/framework/d/a;->a()Lcom/huawei/hms/analytics/framework/d/a;

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lcom/huawei/hms/analytics/framework/d/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V

    return-void
.end method

.method public final setMinSessionDuration(J)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->a()Lcom/huawei/hms/analytics/framework/e/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object v0

    iput-wide p1, v0, Lcom/huawei/hms/analytics/framework/e/b;->b:J

    return-void
.end method

.method public final setNeedRefreshSession(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/huawei/hms/analytics/framework/b/b;->b(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/b/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-boolean p1, v0, Lcom/huawei/hms/analytics/framework/b/c;->a:Z

    :cond_0
    return-void
.end method

.method public final setSessionTimeoutDuration(J)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/framework/e/a;->a()Lcom/huawei/hms/analytics/framework/e/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/e/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/e/b;

    move-result-object v0

    iput-wide p1, v0, Lcom/huawei/hms/analytics/framework/e/b;->a:J

    return-void
.end method
