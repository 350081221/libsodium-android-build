.class public final Lcom/huawei/hms/analytics/framework/c/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/huawei/hms/analytics/framework/config/ICallback;

.field private d:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/h;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/c/h;->c:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/h;->d:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "report running, serviceTag: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReportMission"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/h;->c:Lcom/huawei/hms/analytics/framework/config/ICallback;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/h;->a:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Lcom/huawei/hms/analytics/framework/config/ICallback;->isAAIDChanged(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "aaid changed"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/h;->d:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/c/h;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/h;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/analytics/framework/c/c;->a(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/h;->d:Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    invoke-interface {v1, v0}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->insertEx(Ljava/util/List;)V

    :cond_2
    new-instance v0, Lcom/huawei/hms/analytics/framework/c/a/a;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/framework/c/a/a;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/h;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hms/analytics/framework/c/h;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->b:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/h;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v1

    invoke-interface {v1}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getRegion()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/hms/analytics/framework/c/a/a;->c:Ljava/lang/String;

    new-instance v1, Lcom/huawei/hms/analytics/framework/c/g;

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/h;->c:Lcom/huawei/hms/analytics/framework/config/ICallback;

    invoke-direct {v1, v0, v2}, Lcom/huawei/hms/analytics/framework/c/g;-><init>(Lcom/huawei/hms/analytics/framework/c/a/a;Lcom/huawei/hms/analytics/framework/config/ICallback;)V

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/framework/c/g;->d()V

    return-void
.end method
