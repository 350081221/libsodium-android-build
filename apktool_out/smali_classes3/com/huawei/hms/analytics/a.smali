.class public Lcom/huawei/hms/analytics/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static ijk:Lcom/huawei/hms/analytics/a;


# instance fields
.field private def:Z

.field private efg:J

.field private fgh:Ljava/lang/Runnable;

.field private final ghi:Landroid/os/Handler;

.field private hij:Z

.field public ikl:Lcom/huawei/hms/analytics/bh;

.field public klm:Z

.field public lmn:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/a;->lmn:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/huawei/hms/analytics/a;->hij:Z

    iput-boolean v1, p0, Lcom/huawei/hms/analytics/a;->klm:Z

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/huawei/hms/analytics/a;->ghi:Landroid/os/Handler;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/huawei/hms/analytics/a;->efg:J

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/a;->def:Z

    return-void
.end method

.method static synthetic ijk(Lcom/huawei/hms/analytics/a;)Lcom/huawei/hms/analytics/bh;
    .locals 0

    iget-object p0, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    return-object p0
.end method

.method static synthetic ikl(Lcom/huawei/hms/analytics/a;)Z
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/a;->lmn:Z

    return v0
.end method

.method static synthetic klm(Lcom/huawei/hms/analytics/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/huawei/hms/analytics/a;->hij:Z

    return p0
.end method

.method public static lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/a;
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/a;->ijk:Lcom/huawei/hms/analytics/a;

    if-nez v1, :cond_2

    new-instance v1, Lcom/huawei/hms/analytics/a;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/a;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/a;->ijk:Lcom/huawei/hms/analytics/a;

    instance-of v1, p0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast p0, Landroid/app/Application;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/dg;->lmn()Landroid/app/Application;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    sget-object v1, Lcom/huawei/hms/analytics/a;->ijk:Lcom/huawei/hms/analytics/a;

    invoke-virtual {p0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto :goto_1

    :cond_1
    const-string p0, "LifecycleRingback"

    const-string v1, "application is null.register activity lifecycle failed"

    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p0, Lcom/huawei/hms/analytics/a;->ijk:Lcom/huawei/hms/analytics/a;

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/a;J)V
    .locals 2

    const-string v0, "Background. Pause time: "

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "LifecycleRingback"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/huawei/hms/analytics/bh;->klm(J)V

    :cond_0
    iget-boolean p1, p0, Lcom/huawei/hms/analytics/a;->klm:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/huawei/hms/analytics/bh;->lmn()V

    iget-object p0, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    invoke-interface {p0}, Lcom/huawei/hms/analytics/bh;->klm()V

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object p0

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/fgh;->klm()V

    :cond_2
    return-void
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/huawei/hms/analytics/a;->lmn:Z

    return p0
.end method


# virtual methods
.method public final lmn()V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/a;->def:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/a;->def:Z

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/a$3;

    invoke-direct {v1, p0}, Lcom/huawei/hms/analytics/a$3;-><init>(Lcom/huawei/hms/analytics/a;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 11

    const-string v0, "onActivityPaused called."

    const-string v1, "LifecycleRingback"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/a;->hij:Z

    iget-object v2, p0, Lcom/huawei/hms/analytics/a;->fgh:Ljava/lang/Runnable;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/huawei/hms/analytics/a;->ghi:Landroid/os/Handler;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v4

    iget-wide v4, v4, Lcom/huawei/hms/analytics/bcd;->ghi:J

    iget-wide v6, p0, Lcom/huawei/hms/analytics/a;->efg:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_2

    cmp-long v8, v4, v8

    if-eqz v8, :cond_2

    cmp-long v6, v4, v6

    if-lez v6, :cond_1

    cmp-long v4, v4, v2

    if-lez v4, :cond_2

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v4, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    const-string v4, "Clear previous page info"

    invoke-static {v1, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v4, p0, Lcom/huawei/hms/analytics/a;->ghi:Landroid/os/Handler;

    new-instance v5, Lcom/huawei/hms/analytics/a$2;

    invoke-direct {v5, p0, v2, v3}, Lcom/huawei/hms/analytics/a$2;-><init>(Lcom/huawei/hms/analytics/a;J)V

    iput-object v5, p0, Lcom/huawei/hms/analytics/a;->fgh:Ljava/lang/Runnable;

    const-wide/16 v6, 0xc8

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v4

    iget-object v4, v4, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v4, v4, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v4, :cond_3

    const-string p1, "auto collect is closed"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v1

    if-nez v1, :cond_4

    return-void

    :cond_4
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v1

    const-string v4, "onScreenExitDelayed with time: "

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "ActivityStatCommander"

    invoke-static {v5, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v0, v1, Lcom/huawei/hms/analytics/bcd;->fgh:Z

    iget-object v0, v1, Lcom/huawei/hms/analytics/bcd;->efg:Landroid/os/Handler;

    new-instance v4, Lcom/huawei/hms/analytics/bcd$2;

    invoke-direct {v4, v1, p1, v2, v3}, Lcom/huawei/hms/analytics/bcd$2;-><init>(Lcom/huawei/hms/analytics/bcd;Landroid/app/Activity;J)V

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 6

    const-string v0, "onActivityResumed called."

    const-string v1, "LifecycleRingback"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/huawei/hms/analytics/a;->efg:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/a;->hij:Z

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/a;->lmn:Z

    const/4 v4, 0x1

    xor-int/2addr v0, v4

    iput-boolean v4, p0, Lcom/huawei/hms/analytics/a;->lmn:Z

    iget-object v4, p0, Lcom/huawei/hms/analytics/a;->fgh:Ljava/lang/Runnable;

    if-eqz v4, :cond_0

    iget-object v5, p0, Lcom/huawei/hms/analytics/a;->ghi:Landroid/os/Handler;

    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    if-eqz v0, :cond_1

    const-string v0, "foreground. Resume time: "

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    invoke-interface {v0, v2, v3}, Lcom/huawei/hms/analytics/bh;->lmn(J)V

    goto :goto_0

    :cond_1
    const-string v0, "still foreground."

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/a;->lmn()V

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/ba;->lmn()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/huawei/hms/analytics/bcd;->lmn(Landroid/app/Activity;Landroid/os/Bundle;J)V

    return-void

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/analytics/a$1;

    invoke-direct {v1, p0, p1, v2, v3}, Lcom/huawei/hms/analytics/a$1;-><init>(Lcom/huawei/hms/analytics/a;Landroid/app/Activity;J)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
