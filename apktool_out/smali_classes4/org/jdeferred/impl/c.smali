.class public Lorg/jdeferred/impl/c;
.super Lorg/jdeferred/impl/a;
.source "SourceFile"


# static fields
.field public static final d:Z = true


# instance fields
.field private final b:Ljava/util/concurrent/ExecutorService;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/jdeferred/impl/a;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/jdeferred/impl/c;->c:Z

    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Lorg/jdeferred/impl/a;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/jdeferred/impl/c;->c:Z

    .line 6
    iput-object p1, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lorg/jdeferred/impl/c;->c:Z

    return v0
.end method

.method protected q(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method protected r(Ljava/util/concurrent/Callable;)V
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public s(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public t()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    return v0
.end method

.method public v()Z
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v0

    return v0
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/jdeferred/impl/c;->c:Z

    return-void
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/c;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
