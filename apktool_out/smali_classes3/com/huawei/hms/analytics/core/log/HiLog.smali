.class public Lcom/huawei/hms/analytics/core/log/HiLog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/core/log/HiLog$ErrorCode;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/hms/analytics/core/log/LogAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Z
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->isLoggable(I)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static b()Z
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->isLoggable(I)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static c()Z
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    if-eqz v0, :cond_0

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->isLoggable(I)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x3

    invoke-interface {v0, v1, p0, p1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x3

    invoke-interface {v0, v1, p0, p1, p2}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static d()Z
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    if-eqz v0, :cond_0

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->isLoggable(I)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x6

    invoke-interface {v0, v1, p0, p1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x6

    invoke-interface {v0, v1, p0, p1, p2}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x4

    invoke-interface {v0, v1, p0, p1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x4

    invoke-interface {v0, v1, p0, p1, p2}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static varargs i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v0, 0x4

    invoke-interface {p2, v0, p0, p1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static declared-synchronized init(ILjava/lang/String;)V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/core/log/HiLog;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/core/log/a;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/core/log/a;-><init>()V

    sput-object v1, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    :cond_0
    sget-object v1, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    invoke-interface {v1, p0, p1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->init(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x5

    invoke-interface {v0, v1, p0, p1}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/core/log/HiLog;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hms/analytics/core/log/HiLog;->a:Lcom/huawei/hms/analytics/core/log/LogAdapter;

    const/4 v1, 0x5

    invoke-interface {v0, v1, p0, p1, p2}, Lcom/huawei/hms/analytics/core/log/LogAdapter;->println(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
