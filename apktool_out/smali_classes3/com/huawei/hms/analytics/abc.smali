.class public Lcom/huawei/hms/analytics/abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static lmn:Lcom/huawei/hms/analytics/abc;


# instance fields
.field private ijk:Landroid/content/Context;

.field private ikl:Z

.field private klm:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/abc;->klm:Z

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/abc;->ikl:Z

    return-void
.end method

.method public static lmn()Lcom/huawei/hms/analytics/abc;
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/abc;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/abc;->lmn:Lcom/huawei/hms/analytics/abc;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/abc;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/abc;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/abc;->lmn:Lcom/huawei/hms/analytics/abc;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/huawei/hms/analytics/abc;->lmn:Lcom/huawei/hms/analytics/abc;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final lmn(Landroid/app/Application;)V
    .locals 2

    const-string v0, "InitializeCallback"

    if-eqz p1, :cond_0

    iget-boolean v1, p0, Lcom/huawei/hms/analytics/abc;->ikl:Z

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/abc;->ijk:Landroid/content/Context;

    sget-object v1, Lcom/huawei/hms/analytics/abc;->lmn:Lcom/huawei/hms/analytics/abc;

    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/abc;->ikl:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "register lifecycle callback failed"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "application is null or has registered."

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object p2, p0, Lcom/huawei/hms/analytics/abc;->ijk:Landroid/content/Context;

    const-string v0, "global_v2"

    const-string v1, "is_analytics_enabled"

    const/4 v2, 0x1

    invoke-static {p2, v0, v1, v2}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Lcom/huawei/hms/analytics/cz;->lmn(Landroid/app/Activity;)Lcom/huawei/hms/analytics/bw;

    move-result-object p2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/abc;->klm:Z

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/cz;->lmn(Landroid/app/Activity;Lcom/huawei/hms/analytics/bw;)V

    iput-boolean v2, p0, Lcom/huawei/hms/analytics/abc;->klm:Z

    :cond_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/abc;->ijk:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/f;->lmn(Landroid/content/Context;Lcom/huawei/hms/analytics/bw;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "InitializeCallback"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/abc;->ijk:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/huawei/hms/analytics/di;->lmn(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

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
