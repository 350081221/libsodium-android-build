.class public Lcom/huawei/hms/analytics/HiAnalyticsInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static ikl:Z

.field private static klm:Lcom/huawei/hms/analytics/bi;

.field private static lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ikl(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/hij;
    .locals 7

    new-instance v6, Lcom/huawei/hms/analytics/hij;

    new-instance v2, Lcom/huawei/hms/analytics/klm;

    const-string v0, "UNKNOWN"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {v2, v0, p1}, Lcom/huawei/hms/analytics/klm;-><init>(ZLjava/lang/String;)V

    const-string v3, "_openness_config_tag"

    const-string v5, "init_task_openness"

    move-object v0, v6

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/analytics/hij;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/klm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method static synthetic klm()Lcom/huawei/hms/analytics/bi;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    return-object v0
.end method

.method private static klm(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/bi;
    .locals 7

    const-string v0, "SE-001"

    const-string v1, "HiAnalyticsCreation"

    const-string v2, "_openness_config_tag"

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, p0

    :goto_0
    const-string v4, "HiAnalyticsInstance#getInstance(Context)"

    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v4

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v5

    check-cast v5, Lcom/huawei/hms/analytics/ghi;

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    invoke-static {p0}, Lcom/huawei/hms/analytics/fgh;->klm(Landroid/content/Context;)V

    new-instance v5, Lcom/huawei/hms/analytics/ghi;

    invoke-direct {v5, v3}, Lcom/huawei/hms/analytics/ghi;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v6

    invoke-virtual {v6, v2, v5}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/bh;)V

    invoke-static {p0, p1, v5}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/analytics/ghi;)V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    invoke-static {v3, v5}, Lcom/huawei/hms/analytics/fgh;->lmn(Landroid/content/Context;Lcom/huawei/hms/analytics/bh;)V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    invoke-static {v3}, Lcom/huawei/hms/analytics/fgh;->lmn(Landroid/content/Context;)V

    :goto_1
    const-string p0, "0"

    iput-object p0, v4, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    const/4 p0, 0x1

    sput-boolean p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->ikl:Z
    :try_end_0
    .catch Lcom/huawei/hms/analytics/bc$lmn; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-object v5

    :catchall_0
    move-exception p0

    :try_start_1
    const-string p1, "SE-001:003"

    iput-object p1, v4, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {p0}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "Exception "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_2
    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    goto :goto_3

    :catchall_1
    move-exception p0

    goto :goto_4

    :catch_0
    move-exception p0

    :try_start_2
    const-string p1, "DBException"

    invoke-static {v1, v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "SE-001:002"

    iput-object p1, v4, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {p0}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v3}, Lcom/huawei/hms/utils/HMSBIInitializer;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSBIInitializer;

    move-result-object p0

    invoke-virtual {p0}, Lcom/huawei/hms/utils/HMSBIInitializer;->initBI()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->klm(Lcom/huawei/hms/analytics/cc;)Lcom/huawei/hms/analytics/database/APIEvent;

    move-result-object p0

    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    move-result-object p1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/database/APIEvent;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/database/APIEvent;->toMap()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p1, v3, v0, p0}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_2

    :catch_1
    const-string p0, "APIEvtRecordHolder"

    const-string p1, "init hms BISDK failed"

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :goto_3
    const/4 p0, 0x0

    return-object p0

    :goto_4
    invoke-static {v4}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw p0
.end method

.method static declared-synchronized lmn()Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    .locals 3

    const-class v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    const/4 v1, 0x0

    sput-boolean v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->ikl:Z

    const-string v1, "_openness_config_tag"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/ba;->lmn(Ljava/lang/String;Ljava/lang/Boolean;)V

    sget-object v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method static declared-synchronized lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    monitor-enter v0

    :try_start_0
    const-string v1, "UNKNOWN"

    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static declared-synchronized lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    .locals 4

    const-class v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/dq;->lmn()Lcom/huawei/hms/analytics/dq;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/huawei/hms/analytics/dq;->lmn(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    if-nez v1, :cond_1

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_0

    const-string v1, "HiAnalyticsCreation"

    const-string v2, "IE-001"

    const-string v3, "init must be called in the main thread"

    invoke-static {v1, v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_5

    :cond_1
    if-nez p0, :cond_2

    const-string p0, "HiAnalyticsCreation"

    const-string p1, "PE-001"

    const-string v1, "context is null, failed to initialize the Analytics Kit."

    invoke-static {p0, p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "_openness_config_tag"

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/ba;->lmn(Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_1

    :cond_2
    sget-boolean v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->ikl:Z

    if-nez v1, :cond_3

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/bi;

    move-result-object p0

    sput-object p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    goto :goto_1

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result p0

    if-nez p0, :cond_4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    sget-object v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    check-cast v1, Lcom/huawei/hms/analytics/ghi;

    invoke-static {p0, p1, v1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/analytics/ghi;)V

    goto :goto_1

    :cond_4
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    const-string p0, "_openness_config_tag"

    invoke-static {p1, p0}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->ikl(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/hij;

    move-result-object p0

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    invoke-static {p0}, Lcom/huawei/hms/analytics/fgh;->lmn(Lcom/huawei/hms/analytics/hij;)V

    :cond_5
    :goto_1
    sget-object p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    if-nez p0, :cond_6

    new-instance p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;

    invoke-direct {p0}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;-><init>()V

    sput-object p0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->lmn:Lcom/huawei/hms/analytics/HiAnalyticsInstance;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_6
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static lmn(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/analytics/ghi;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->ikl(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/hij;

    move-result-object p0

    new-instance p1, Lcom/huawei/hms/analytics/ikl;

    invoke-direct {p1, p2}, Lcom/huawei/hms/analytics/ikl;-><init>(Lcom/huawei/hms/analytics/bh;)V

    iput-object p1, p0, Lcom/huawei/hms/analytics/hij;->lmn:Lcom/huawei/hms/analytics/ikl;

    const-string p1, "HiAnalyticsInstance#initTask"

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/hij;->klm:Lcom/huawei/hms/analytics/cc;

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    invoke-static {p0}, Lcom/huawei/hms/analytics/fgh;->lmn(Lcom/huawei/hms/analytics/hij;)V

    return-void
.end method


# virtual methods
.method public addDefaultEventParams(Landroid/os/Bundle;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/huawei/hms/analytics/dd;->lmn(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$22;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$22;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public clearCachedData()V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$12;

    invoke-direct {v1, p0}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$12;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public getAAID()Lcom/huawei/hmf/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/huawei/hmf/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bi;->fgh()Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v0

    const-string v1, "init_task_openness"

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/framework/SyncManager;->await(Ljava/lang/String;J)V

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bi;->fgh()Lcom/huawei/hmf/tasks/Task;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "HiAnalyticsCreation"

    const-string v1, "getAAID Interrupted Exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

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

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/bi;->lmn(Z)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v0

    const-string v1, "init_task_openness"

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/framework/SyncManager;->await(Ljava/lang/String;J)V

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/bi;->lmn(Z)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "HiAnalyticsCreation"

    const-string v0, "getAAID Interrupted Exception"

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public isRestrictionEnabled()Z
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bi;->ijk()Z

    move-result v0

    return v0

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->ijk()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isRestrictionShared()Z
    .locals 4

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bi;->hij()Z

    move-result v0

    return v0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v0

    const-string v1, "init_task_openness"

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/framework/SyncManager;->await(Ljava/lang/String;J)V

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bi;->hij()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-string v0, "HiAnalyticsCreation"

    const-string v1, "isRestrictionShared Interrupted Exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/huawei/hms/analytics/dd;->lmn(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$6;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$18;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$18;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public pageEnd(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$25;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$25;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public pageStart(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$24;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$24;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public regHmsSvcEvent()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setAnalyticsEnabled(Z)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$19;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$19;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setAutoCollectionEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setChannel(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$15;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$15;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setCollectAdsIdEnabled(Z)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$5;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setCurrentActivity(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$14;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$14;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setCustomReferrer(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$1;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setMinActivitySessions(J)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$20;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$20;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;J)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setPropertyCollection(Ljava/lang/String;Z)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$17;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setPushToken(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$3;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$3;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setPushTokenCollectionEnabled(Z)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$16;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$16;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setReportPolicies(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/huawei/hms/analytics/type/ReportPolicy;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object p1

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$8;

    invoke-direct {v1, p0, v0}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$8;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/util/Set;)V

    invoke-virtual {p1, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setRestrictionEnabled(Z)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$4;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setRestrictionShared(Z)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$9;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$9;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setSessionDuration(J)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$21;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$21;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;J)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$2;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setUserProfile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$23;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$23;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setWXAppId(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$13;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$13;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setWXOpenId(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$11;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$11;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public setWXUnionId(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$10;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$10;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public unRegHmsSvcEvent()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public writeLog(Lcom/huawei/hms/analytics/type/HALogConfig;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "HiAnalyticsCreation"

    const-string p2, "log config is null"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/hms/analytics/type/HALogConfig;

    invoke-direct {v0, p1}, Lcom/huawei/hms/analytics/type/HALogConfig;-><init>(Lcom/huawei/hms/analytics/type/HALogConfig;)V

    sget-object p1, Lcom/huawei/hms/analytics/HiAnalyticsInstance;->klm:Lcom/huawei/hms/analytics/bi;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object p1

    new-instance v1, Lcom/huawei/hms/analytics/HiAnalyticsInstance$7;

    invoke-direct {v1, p0, v0, p2}, Lcom/huawei/hms/analytics/HiAnalyticsInstance$7;-><init>(Lcom/huawei/hms/analytics/HiAnalyticsInstance;Lcom/huawei/hms/analytics/type/HALogConfig;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
