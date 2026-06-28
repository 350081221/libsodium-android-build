.class final Lcom/huawei/hms/analytics/a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/a;->onActivityPaused(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic klm:Lcom/huawei/hms/analytics/a;

.field final synthetic lmn:J


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/a;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/a$2;->klm:Lcom/huawei/hms/analytics/a;

    iput-wide p2, p0, Lcom/huawei/hms/analytics/a$2;->lmn:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/a$2;->klm:Lcom/huawei/hms/analytics/a;

    invoke-static {v0}, Lcom/huawei/hms/analytics/a;->lmn(Lcom/huawei/hms/analytics/a;)Z

    move-result v0

    const-string v1, "LifecycleRingback"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/a$2;->klm:Lcom/huawei/hms/analytics/a;

    invoke-static {v0}, Lcom/huawei/hms/analytics/a;->klm(Lcom/huawei/hms/analytics/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/a$2;->klm:Lcom/huawei/hms/analytics/a;

    invoke-static {v0}, Lcom/huawei/hms/analytics/a;->ikl(Lcom/huawei/hms/analytics/a;)Z

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/a$2;->klm:Lcom/huawei/hms/analytics/a;

    iget-wide v2, p0, Lcom/huawei/hms/analytics/a$2;->lmn:J

    invoke-static {v0, v2, v3}, Lcom/huawei/hms/analytics/a;->lmn(Lcom/huawei/hms/analytics/a;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v2, "lifecycle callback onReport error"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/analytics/di;->lmn(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const-string v0, "still foreground"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
