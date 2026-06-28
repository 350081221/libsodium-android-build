.class public final Lcom/huawei/hms/analytics/cy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/cy$lmn;,
        Lcom/huawei/hms/analytics/cy$klm;
    }
.end annotation


# static fields
.field private static lmn:Lcom/huawei/hms/analytics/cy;


# instance fields
.field private ikl:Ljava/lang/String;

.field private klm:Lcom/huawei/hmf/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/hmf/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    return-void
.end method

.method private static declared-synchronized hij()V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/cy;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/cy;->lmn:Lcom/huawei/hms/analytics/cy;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/cy;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/cy;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/cy;->lmn:Lcom/huawei/hms/analytics/cy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static ijk()V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->a:Lcom/huawei/hms/analytics/k;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    const-string v1, "_openness_config_tag"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/k;

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/k;-><init>(Lcom/huawei/hms/analytics/bh;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object v1, v0, Lcom/huawei/hms/analytics/at;->a:Lcom/huawei/hms/analytics/k;

    move-object v0, v1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->abc:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/k;->lmn()V

    :cond_1
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/k;->lmn([Ljava/lang/String;)V

    return-void
.end method

.method public static lmn()Lcom/huawei/hms/analytics/cy;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/cy;->lmn:Lcom/huawei/hms/analytics/cy;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->hij()V

    :cond_0
    sget-object v0, Lcom/huawei/hms/analytics/cy;->lmn:Lcom/huawei/hms/analytics/cy;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized ikl()Lcom/huawei/hmf/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/huawei/hmf/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/cy;->klm:Lcom/huawei/hmf/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized ikl(Landroid/content/Context;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object v0

    const-string v1, "aaid_task"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/framework/SyncManager;->start(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, Lcom/huawei/hms/aaid/HmsInstanceId;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/aaid/HmsInstanceId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/aaid/HmsInstanceId;->deleteAAID()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v0, "AAIDAssignment"

    const-string v1, "IE-005"

    const-string v2, "Missing hms opendevice sdk, delete aaid failed, Please upgrade the hms version"

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    const-string v0, "AAIDAssignment"

    const-string v1, "delete aaid ApiException"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/cy;->lmn(Landroid/content/Context;)V

    invoke-static {}, Lcom/huawei/hms/analytics/framework/SyncManager;->getInstance()Lcom/huawei/hms/analytics/framework/SyncManager;

    move-result-object p1

    const-string v0, "aaid_task"

    invoke-virtual {p1, v0}, Lcom/huawei/hms/analytics/framework/SyncManager;->countDown(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized klm()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized klm(Landroid/content/Context;)Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v1, 0x0

    :try_start_1
    invoke-static {p1}, Lcom/huawei/hms/aaid/HmsInstanceId;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/aaid/HmsInstanceId;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/aaid/HmsInstanceId;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_1

    :try_start_3
    new-instance v0, Lcom/huawei/hms/analytics/cy$lmn;

    iget-object v2, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Lcom/huawei/hms/analytics/cy$lmn;-><init>(Ljava/lang/String;B)V

    invoke-static {v0}, Lcom/huawei/hmf/tasks/m;->f(Ljava/util/concurrent/Callable;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/cy;->klm:Lcom/huawei/hmf/tasks/Task;

    new-instance v1, Lcom/huawei/hms/analytics/cy$klm;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/cy$klm;-><init>()V

    invoke-virtual {v0, v1}, Lcom/huawei/hmf/tasks/Task;->k(Lcom/huawei/hmf/tasks/i;)Lcom/huawei/hmf/tasks/Task;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_1
    move v1, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_4
    const-string v0, "AAIDAssignment"

    const-string v2, "IE-005"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    monitor-exit p0

    return v1

    :catchall_1
    move-exception p1

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized lmn(Landroid/content/Context;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    const-string v0, "1"

    const-string v1, ""

    const-string v2, "HmsInstanceId#getId()"

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v3, "AAIDAssignment"

    const-string v4, "begin sync aaid from opendevice sdk"

    invoke-static {v3, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/hms/aaid/HmsInstanceId;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/aaid/HmsInstanceId;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/aaid/HmsInstanceId;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "AAIDAssignment"

    const-string v3, "SE-002"

    const-string v4, "Failed to obtain AAID  from hms core sdk"

    invoke-static {p1, v3, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, ""

    iput-object p1, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    const-string v1, "SE-002"

    goto :goto_0

    :cond_0
    const-string p1, "AAIDAssignment"

    const-string v3, "get aaid success"

    invoke-static {p1, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "0"

    :goto_0
    new-instance p1, Lcom/huawei/hms/analytics/cy$lmn;

    iget-object v3, p0, Lcom/huawei/hms/analytics/cy;->ikl:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {p1, v3, v4}, Lcom/huawei/hms/analytics/cy$lmn;-><init>(Ljava/lang/String;B)V

    invoke-static {p1}, Lcom/huawei/hmf/tasks/m;->f(Ljava/util/concurrent/Callable;)Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/cy;->klm:Lcom/huawei/hmf/tasks/Task;

    new-instance v3, Lcom/huawei/hms/analytics/cy$klm;

    invoke-direct {v3}, Lcom/huawei/hms/analytics/cy$klm;-><init>()V

    invoke-virtual {p1, v3}, Lcom/huawei/hmf/tasks/Task;->k(Lcom/huawei/hmf/tasks/i;)Lcom/huawei/hmf/tasks/Task;
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iput-object v0, v2, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object v1, v2, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_3
    const-string v3, "AAIDAssignment"

    const-string v4, "SE-002"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to obtain AAID from hms core sdk,unknown exception: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v4, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "SE-002"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iput-object v0, v2, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object p1, v2, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-void

    :catch_1
    :try_start_5
    const-string p1, "AAIDAssignment"

    const-string v3, "IE-005"

    const-string v4, "Missing hms opendevice sdk,get aaid failed.Please upgrade the hms version"

    invoke-static {p1, v3, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "IE-005"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iput-object v0, v2, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object p1, v2, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit p0

    return-void

    :goto_1
    :try_start_7
    iput-object v0, v2, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    iput-object v1, v2, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method
