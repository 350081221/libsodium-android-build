.class final Lcom/huawei/hms/analytics/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/a;->lmn()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lmn:Lcom/huawei/hms/analytics/a;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/a$3;->lmn:Lcom/huawei/hms/analytics/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "LifecycleRingback"

    if-nez v0, :cond_0

    const-string v0, "auto collect is closed"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/a$3;->lmn:Lcom/huawei/hms/analytics/a;

    invoke-static {v0}, Lcom/huawei/hms/analytics/a;->ijk(Lcom/huawei/hms/analytics/a;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hms/analytics/ghi;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->d:Ljava/lang/String;

    const-string v3, "$StartType"

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/huawei/hms/analytics/dj;

    const-string v3, "$LaunchApp"

    invoke-direct {v2, v3, v0}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/a$3;->lmn:Lcom/huawei/hms/analytics/a;

    invoke-static {v0}, Lcom/huawei/hms/analytics/a;->ijk(Lcom/huawei/hms/analytics/a;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/analytics/ghi;

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v3, v2, v4, v5}, Lcom/huawei/hms/analytics/ijk;->klm(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    const-string v0, "onLaunchAppEvent"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "is OpennessInit Complete: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
