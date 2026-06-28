.class final Lcom/huawei/hms/analytics/bcd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/bcd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ikl:Lcom/huawei/hms/analytics/bcd;

.field final synthetic klm:J

.field final synthetic lmn:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/bcd;Landroid/app/Activity;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/bcd$2;->ikl:Lcom/huawei/hms/analytics/bcd;

    iput-object p2, p0, Lcom/huawei/hms/analytics/bcd$2;->lmn:Landroid/app/Activity;

    iput-wide p3, p0, Lcom/huawei/hms/analytics/bcd$2;->klm:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd$2;->ikl:Lcom/huawei/hms/analytics/bcd;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bcd;->klm(Lcom/huawei/hms/analytics/bcd;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "isExitDelayed = true"

    const-string v1, "ActivityStatCommander"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd$2;->ikl:Lcom/huawei/hms/analytics/bcd;

    iget-wide v2, p0, Lcom/huawei/hms/analytics/bcd$2;->klm:J

    invoke-virtual {v0, v2, v3}, Lcom/huawei/hms/analytics/bcd;->lmn(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onScreenExit error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
