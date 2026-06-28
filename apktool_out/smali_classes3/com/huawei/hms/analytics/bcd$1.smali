.class final Lcom/huawei/hms/analytics/bcd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/bcd;->lmn(Landroid/app/Activity;Landroid/os/Bundle;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic hij:Lcom/huawei/hms/analytics/bcd;

.field final synthetic ijk:J

.field final synthetic ikl:Landroid/os/Bundle;

.field final synthetic klm:Lcom/huawei/hms/analytics/bcd$lmn;

.field final synthetic lmn:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/bcd;Landroid/app/Activity;Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/bcd$1;->hij:Lcom/huawei/hms/analytics/bcd;

    iput-object p2, p0, Lcom/huawei/hms/analytics/bcd$1;->lmn:Landroid/app/Activity;

    iput-object p3, p0, Lcom/huawei/hms/analytics/bcd$1;->klm:Lcom/huawei/hms/analytics/bcd$lmn;

    iput-object p4, p0, Lcom/huawei/hms/analytics/bcd$1;->ikl:Landroid/os/Bundle;

    iput-wide p5, p0, Lcom/huawei/hms/analytics/bcd$1;->ijk:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd$1;->hij:Lcom/huawei/hms/analytics/bcd;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bcd;->lmn(Lcom/huawei/hms/analytics/bcd;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "isEnterDelayed = true, no override screen event..."

    const-string v1, "ActivityStatCommander"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd$1;->hij:Lcom/huawei/hms/analytics/bcd;

    iget-object v2, p0, Lcom/huawei/hms/analytics/bcd$1;->klm:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v3, p0, Lcom/huawei/hms/analytics/bcd$1;->ikl:Landroid/os/Bundle;

    iget-wide v4, p0, Lcom/huawei/hms/analytics/bcd$1;->ijk:J

    invoke-static {v0, v2, v3, v4, v5}, Lcom/huawei/hms/analytics/bcd;->lmn(Lcom/huawei/hms/analytics/bcd;Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onScreenEnter error: "

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
