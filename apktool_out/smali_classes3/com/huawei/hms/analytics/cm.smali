.class public final Lcom/huawei/hms/analytics/cm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private klm:Ljava/lang/String;

.field private lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/hms/analytics/cm;->klm:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/hms/analytics/cm;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "SyncTokenBaseMission"

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v2, p0, Lcom/huawei/hms/analytics/cm;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v0

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/au;->ikl:Z

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "SyncToken task is running"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/dn;->klm()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/dn;->lmn()Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3

    invoke-virtual {v0, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Interrupted Exception"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    new-instance v0, Lcom/huawei/hms/analytics/do;

    new-instance v1, Lcom/huawei/hms/analytics/bz;

    iget-object v2, p0, Lcom/huawei/hms/analytics/cm;->lmn:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hms/analytics/cm;->klm:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/huawei/hms/analytics/bz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/do;-><init>(Lcom/huawei/hms/analytics/cb;)V

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/dn;->ikl()V

    new-instance v0, Lcom/huawei/hms/analytics/do;

    invoke-static {}, Lcom/huawei/hms/analytics/dn;->lmn()Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/analytics/bz;

    iget-object v3, p0, Lcom/huawei/hms/analytics/cm;->lmn:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/hms/analytics/cm;->klm:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/huawei/hms/analytics/bz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/analytics/do;-><init>(Ljava/util/concurrent/CountDownLatch;Lcom/huawei/hms/analytics/cb;)V

    :goto_1
    invoke-virtual {v0}, Lcom/huawei/hms/analytics/do;->lmn()Ljava/lang/String;

    return-void

    :cond_2
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "The Analytics Kit is disabled, serviceTag:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/hms/analytics/cm;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
