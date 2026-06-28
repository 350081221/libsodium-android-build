.class public final Lcom/huawei/hms/analytics/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/k$lmn;
    }
.end annotation


# instance fields
.field private klm:Z

.field private final lmn:Lcom/huawei/hms/analytics/h;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/bh;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/huawei/hms/analytics/h;

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    new-instance v2, Lcom/huawei/hms/analytics/k$lmn;

    invoke-direct {v2}, Lcom/huawei/hms/analytics/k$lmn;-><init>()V

    invoke-direct {v0, v1, p1, v2}, Lcom/huawei/hms/analytics/h;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/bh;Lcom/huawei/hms/analytics/cc$lmn;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/k;->lmn:Lcom/huawei/hms/analytics/h;

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 2

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/hms/analytics/k;->klm:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/k;->lmn:Lcom/huawei/hms/analytics/h;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/h;->lmn()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/k;->klm:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    const-string v0, "ServiceWatcher"

    const-string v1, "service unbind exception"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final varargs lmn([Ljava/lang/String;)V
    .locals 9

    const-string v0, "HAServiceCommander"

    const-string v1, "service bind"

    const-string v2, "ServiceWatcher"

    invoke-static {v2, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-boolean v1, p0, Lcom/huawei/hms/analytics/k;->klm:Z

    if-nez v1, :cond_5

    iget-object v6, p0, Lcom/huawei/hms/analytics/k;->lmn:Lcom/huawei/hms/analytics/h;

    const-string v1, "bindService is running"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v1, v1, Lcom/huawei/hms/analytics/at;->abc:Z

    if-eqz v1, :cond_0

    const-string p1, "Service is already bind, when want to bind."

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v1, v6, Lcom/huawei/hms/analytics/h;->klm:Landroid/content/Context;

    const v3, 0x2625a00

    invoke-static {v1, v3}, Lcom/huawei/hms/api/HuaweiMobileServicesUtil;->isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I

    move-result v1

    if-eqz v1, :cond_1

    const-string p1, "IE-005"

    const-string v1, "Missing hms core sdk,or HMS version is too low"

    invoke-static {v0, p1, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v6, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    if-eqz p1, :cond_3

    const-string v0, "3"

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/cc$lmn;->lmn(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    array-length v0, p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, ""

    const/4 v3, 0x1

    if-ne v0, v3, :cond_2

    const/4 v0, 0x0

    :try_start_1
    aget-object p1, p1, v0

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    iget-object v0, v6, Lcom/huawei/hms/analytics/h;->hij:Lcom/huawei/hms/analytics/j;

    iput-object p1, v0, Lcom/huawei/hms/analytics/j;->lmn:Ljava/lang/String;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p1, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, v6, Lcom/huawei/hms/analytics/h;->lmn:Ljava/util/concurrent/CountDownLatch;

    iget-object p1, v6, Lcom/huawei/hms/analytics/h;->ikl:Lcom/huawei/hms/analytics/o;

    const-string v0, "hianalytics.analyticsEvtService"

    new-instance v3, Lcom/huawei/hms/analytics/t;

    invoke-direct {v3, v0, v1}, Lcom/huawei/hms/analytics/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Lcom/huawei/hms/common/HuaweiApi;->doWrite(Lcom/huawei/hms/common/internal/TaskApiCall;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v4

    new-instance p1, Lcom/huawei/hms/analytics/h$lmn;

    iget-object v0, v6, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    iget-object v1, v6, Lcom/huawei/hms/analytics/h;->lmn:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p1, v0, v1}, Lcom/huawei/hms/analytics/h$lmn;-><init>(Lcom/huawei/hms/analytics/cc$lmn;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v4, p1}, Lcom/huawei/hmf/tasks/Task;->h(Lcom/huawei/hmf/tasks/h;)Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    new-instance v0, Lcom/huawei/hms/analytics/h$klm;

    iget-object v5, v6, Lcom/huawei/hms/analytics/h;->klm:Landroid/content/Context;

    iget-object v7, v6, Lcom/huawei/hms/analytics/h;->ijk:Lcom/huawei/hms/analytics/cc$lmn;

    iget-object v8, v6, Lcom/huawei/hms/analytics/h;->lmn:Ljava/util/concurrent/CountDownLatch;

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/huawei/hms/analytics/h$klm;-><init>(Lcom/huawei/hmf/tasks/Task;Landroid/content/Context;Landroid/content/ServiceConnection;Lcom/huawei/hms/analytics/cc$lmn;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/Task;->k(Lcom/huawei/hmf/tasks/i;)Lcom/huawei/hmf/tasks/Task;

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/huawei/hms/analytics/k;->lmn:Lcom/huawei/hms/analytics/h;

    iget-object p1, p1, Lcom/huawei/hms/analytics/h;->lmn:Ljava/util/concurrent/CountDownLatch;

    if-eqz p1, :cond_4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1f4

    invoke-virtual {p1, v3, v4, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    :cond_4
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p1

    iget-object p1, p1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean p1, p1, Lcom/huawei/hms/analytics/at;->abc:Z

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/k;->klm:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_5
    return-void

    :catch_0
    const-string p1, "service bind exception"

    invoke-static {v2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
