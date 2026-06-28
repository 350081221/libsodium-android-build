.class public Lcom/huawei/hms/analytics/connector/ConnectorManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ikl:Ljava/lang/String;

.field private klm:Lcom/huawei/hms/analytics/ak;

.field private lmn:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "UNKNOWN"

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic klm(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Lcom/huawei/hms/analytics/ak;
    .locals 0

    iget-object p0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    return-object p0
.end method

.method private klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    new-instance v7, Lcom/huawei/hms/analytics/hij;

    new-instance v3, Lcom/huawei/hms/analytics/klm;

    const-string v1, "UNKNOWN"

    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-direct {v3, v1, p4}, Lcom/huawei/hms/analytics/klm;-><init>(ZLjava/lang/String;)V

    const-string v6, "init_task_connector"

    move-object v1, v7

    move-object v2, p1

    move-object v4, p2

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hms/analytics/hij;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/klm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/huawei/hms/analytics/fgh;->lmn(Lcom/huawei/hms/analytics/hij;)V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object p4

    invoke-virtual {p4, p2}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object p4

    if-nez p4, :cond_1

    new-instance p4, Lcom/huawei/hms/analytics/ak;

    invoke-direct {p4, v0, p2}, Lcom/huawei/hms/analytics/ak;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-virtual {p4, p3}, Lcom/huawei/hms/analytics/ak;->ikl(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object p3

    iget-object p4, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-virtual {p3, p2, p4}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/bh;)V

    goto :goto_1

    :cond_1
    check-cast p4, Lcom/huawei/hms/analytics/ak;

    iput-object p4, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    :goto_1
    invoke-static {p1}, Lcom/huawei/hms/analytics/a;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/a;

    return-void
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/connector/ConnectorManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->ikl:Ljava/lang/String;

    return-object p0
.end method

.method private lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/dq;->lmn()Lcom/huawei/hms/analytics/dq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/dq;->lmn(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "InteractionManager"

    if-nez v0, :cond_0

    const-string p1, "user unlock"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x100

    if-gt v0, v2, :cond_2

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    iput-object p2, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->ikl:Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "other exception,init connector instance error "

    invoke-static {v1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    :goto_0
    const-string p1, "connectManager param is not right"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getUserProfiles(Z)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->ikl:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/ba;->klm(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/ijk;->lmn(Z)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v0

    const-string v1, "init_task_connector"

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/framework/SyncManager;->await(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/ijk;->lmn(Z)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "InteractionManager"

    const-string v0, "getUserProfiles Interrupted Exception"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z

    if-eqz v0, :cond_0

    const-string v0, "InteractionManager"

    const-string v1, "connectManager onEvent"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/huawei/hms/analytics/dd;->lmn(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/connector/ConnectorManager$1;-><init>(Lcom/huawei/hms/analytics/connector/ConnectorManager;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onReport()V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z

    if-eqz v0, :cond_0

    const-string v0, "InteractionManager"

    const-string v1, "connectManager onReport"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/connector/ConnectorManager$2;

    invoke-direct {v1, p0}, Lcom/huawei/hms/analytics/connector/ConnectorManager$2;-><init>(Lcom/huawei/hms/analytics/connector/ConnectorManager;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setAnalyticsEnabled(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/analytics/ak$1;

    invoke-direct {v2, v0, p1}, Lcom/huawei/hms/analytics/ak$1;-><init>(Lcom/huawei/hms/analytics/ak;Z)V

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setEnableAndroidID(Ljava/lang/Boolean;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v0, v0, Lcom/huawei/hms/analytics/ijk;->hij:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v0

    iput-boolean p1, v0, Lcom/huawei/hms/analytics/au;->lmn:Z

    :cond_0
    return-void
.end method

.method public syncOaid(Lcom/huawei/hms/analytics/instance/CallBack;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "InteractionManager"

    const-string v0, "callback is null"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->lmn:Z

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->ikl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " init failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x65

    invoke-interface {p1, v1, v0}, Lcom/huawei/hms/analytics/instance/CallBack;->onResult(ILjava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/analytics/connector/ConnectorManager;->klm:Lcom/huawei/hms/analytics/ak;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/ak;->lmn(Lcom/huawei/hms/analytics/instance/CallBack;)V

    return-void
.end method
