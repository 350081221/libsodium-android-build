.class public Lcom/uyumao/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uyumao/s$b;
    }
.end annotation


# static fields
.field public static volatile a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public static volatile b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/uyumao/s$a;

    invoke-direct {v0}, Lcom/uyumao/s$a;-><init>()V

    sput-object v0, Lcom/uyumao/s;->c:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    .line 10
    :try_start_0
    sget-object v0, Lcom/uyumao/s;->b:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 11
    const-class v0, Lcom/uyumao/s;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    sget-object v1, Lcom/uyumao/s;->b:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    .line 13
    sget-object v1, Lcom/uyumao/s;->c:Ljava/util/concurrent/ThreadFactory;

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    sput-object v1, Lcom/uyumao/s;->b:Ljava/util/concurrent/ExecutorService;

    .line 14
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    .line 15
    :cond_1
    :goto_0
    sget-object v0, Lcom/uyumao/s;->b:Ljava/util/concurrent/ExecutorService;

    .line 16
    new-instance v1, Lcom/uyumao/s$b;

    invoke-direct {v1, p0}, Lcom/uyumao/s$b;-><init>(Ljava/lang/Runnable;)V

    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object p0

    :catchall_1
    move-exception p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static a()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 5

    .line 1
    sget-object v0, Lcom/uyumao/s;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/uyumao/s;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/uyumao/s;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 5
    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v3, Lcom/uyumao/s;->c:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v2, v1, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v2, Lcom/uyumao/s;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 6
    sget-object v1, Lcom/uyumao/s;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3

    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->setKeepAliveTime(JLjava/util/concurrent/TimeUnit;)V

    .line 7
    sget-object v1, Lcom/uyumao/s;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 8
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_0
    sget-object v0, Lcom/uyumao/s;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object v0
.end method

.method public static a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    .line 19
    :try_start_0
    invoke-static {}, Lcom/uyumao/s;->a()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_0
    return-void
.end method
