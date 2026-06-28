.class public Lorg/jdeferred/d;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/FutureTask<",
        "TD;>;"
    }
.end annotation


# instance fields
.field protected final a:Lorg/jdeferred/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdeferred/b<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation
.end field

.field protected final b:Lorg/jdeferred/e$a;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 5
    new-instance p1, Lorg/jdeferred/impl/d;

    invoke-direct {p1}, Lorg/jdeferred/impl/d;-><init>()V

    iput-object p1, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 6
    sget-object p1, Lorg/jdeferred/e$a;->DEFAULT:Lorg/jdeferred/e$a;

    iput-object p1, p0, Lorg/jdeferred/d;->b:Lorg/jdeferred/e$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "TD;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 2
    new-instance p1, Lorg/jdeferred/impl/d;

    invoke-direct {p1}, Lorg/jdeferred/impl/d;-><init>()V

    iput-object p1, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 3
    sget-object p1, Lorg/jdeferred/e$a;->DEFAULT:Lorg/jdeferred/e$a;

    iput-object p1, p0, Lorg/jdeferred/d;->b:Lorg/jdeferred/e$a;

    return-void
.end method

.method public constructor <init>(Lorg/jdeferred/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/c<",
            "TD;TP;>;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 8
    invoke-virtual {p1}, Lorg/jdeferred/c;->a()Lorg/jdeferred/b;

    move-result-object v0

    iput-object v0, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 9
    invoke-virtual {p1}, Lorg/jdeferred/c;->b()Lorg/jdeferred/e$a;

    move-result-object p1

    iput-object p1, p0, Lorg/jdeferred/d;->b:Lorg/jdeferred/e$a;

    return-void
.end method

.method public constructor <init>(Lorg/jdeferred/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdeferred/f<",
            "TP;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1}, Lorg/jdeferred/f;->a()Lorg/jdeferred/b;

    move-result-object v0

    iput-object v0, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 12
    invoke-virtual {p1}, Lorg/jdeferred/f;->b()Lorg/jdeferred/e$a;

    move-result-object p1

    iput-object p1, p0, Lorg/jdeferred/d;->b:Lorg/jdeferred/e$a;

    return-void
.end method


# virtual methods
.method public a()Lorg/jdeferred/e$a;
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/d;->b:Lorg/jdeferred/e$a;

    return-object v0
.end method

.method public b()Lorg/jdeferred/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdeferred/p<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    invoke-interface {v0}, Lorg/jdeferred/b;->c()Lorg/jdeferred/p;

    move-result-object v0

    return-object v0
.end method

.method protected done()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 8
    .line 9
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lorg/jdeferred/b;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 22
    .line 23
    invoke-interface {v1, v0}, Lorg/jdeferred/b;->g(Ljava/lang/Object;)Lorg/jdeferred/b;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    iget-object v1, p0, Lorg/jdeferred/d;->a:Lorg/jdeferred/b;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v1, v0}, Lorg/jdeferred/b;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 35
    .line 36
    .line 37
    :catch_1
    :goto_0
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
