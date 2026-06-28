.class public final Lcom/bytedance/sdk/openadsdk/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/e/a$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/bytedance/sdk/openadsdk/e/a;


# instance fields
.field private volatile b:Ljava/util/concurrent/ExecutorService;

.field private volatile c:Ljava/util/concurrent/ThreadPoolExecutor;

.field private volatile d:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/bytedance/sdk/openadsdk/e/a;
    .locals 2

    .line 3
    sget-object v0, Lcom/bytedance/sdk/openadsdk/e/a;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    if-nez v0, :cond_0

    .line 4
    const-class v0, Lcom/bytedance/sdk/openadsdk/e/a;

    monitor-enter v0

    .line 5
    :try_start_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/e/a;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/e/a;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/e/a;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    .line 6
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_0
    :goto_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/e/a;->a:Lcom/bytedance/sdk/openadsdk/e/a;

    return-object v0
.end method

.method private a(Z)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->b:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/e/a;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/e/a;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    :goto_0
    return-object p1

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/e/a;->b:Ljava/util/concurrent/ExecutorService;

    return-object p1
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/e/a;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p0
.end method

.method static synthetic a(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

.method private a(Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 3

    const-wide/16 v0, 0x1

    .line 16
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->setKeepAliveTime(JLjava/util/concurrent/TimeUnit;)V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    :cond_0
    :goto_0
    const-wide/16 v0, 0x64

    .line 18
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 22
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void
.end method

.method private b()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Lcom/bytedance/sdk/openadsdk/e/a$a;

    const-string v1, "init"

    invoke-direct {v8, v1}, Lcom/bytedance/sdk/openadsdk/e/a$a;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method static synthetic b(Lcom/bytedance/sdk/openadsdk/e/a;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p0
.end method

.method static synthetic b(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/e/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p1
.end method

.method private b(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/e/a$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/e/a$1;-><init>(Lcom/bytedance/sdk/openadsdk/e/a;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private c()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x2

    const/4 v3, 0x5

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Lcom/bytedance/sdk/openadsdk/e/a$a;

    invoke-direct {v8}, Lcom/bytedance/sdk/openadsdk/e/a$a;-><init>()V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method static synthetic c(Lcom/bytedance/sdk/openadsdk/e/a;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/e/a;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 8
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public a(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 13
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/e/a;->b:Ljava/util/concurrent/ExecutorService;

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/e/a;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/e/a;->b(Ljava/util/concurrent/ExecutorService;)V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/e/a;->a(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
