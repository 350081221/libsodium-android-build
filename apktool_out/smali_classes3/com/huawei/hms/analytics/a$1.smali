.class final Lcom/huawei/hms/analytics/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ikl:Lcom/huawei/hms/analytics/a;

.field final synthetic klm:J

.field final synthetic lmn:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/a;Landroid/app/Activity;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/a$1;->ikl:Lcom/huawei/hms/analytics/a;

    iput-object p2, p0, Lcom/huawei/hms/analytics/a$1;->lmn:Landroid/app/Activity;

    iput-wide p3, p0, Lcom/huawei/hms/analytics/a$1;->klm:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/a$1;->lmn:Landroid/app/Activity;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-wide v3, p0, Lcom/huawei/hms/analytics/a$1;->klm:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/hms/analytics/bcd;->lmn(Landroid/app/Activity;Landroid/os/Bundle;J)V

    return-void

    :cond_0
    const-string v0, "LifecycleRingback"

    const-string v1, "opennessInitComplete is false"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
