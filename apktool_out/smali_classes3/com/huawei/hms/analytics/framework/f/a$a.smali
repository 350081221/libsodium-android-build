.class final Lcom/huawei/hms/analytics/framework/f/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/framework/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/f/a$a;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/f/a$a;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object v1

    const-string v2, "_openness_config_tag"

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->handlerThrowable(Ljava/lang/Throwable;)V

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "other error :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MissionThread"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
