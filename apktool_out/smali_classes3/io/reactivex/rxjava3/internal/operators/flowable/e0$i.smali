.class final Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/q<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x43c4fdd95fbcd5c6L


# instance fields
.field volatile done:Z

.field final emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/e0$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final queue:Lio/reactivex/rxjava3/internal/fuseable/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/e0$b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    .line 5
    .line 6
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 7
    .line 8
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 12
    .line 13
    new-instance p1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method drain()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->drainLoop()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method drainLoop()V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 4
    .line 5
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    move v4, v3

    .line 9
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->isCancelled()Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/k;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iget-boolean v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->done:Z

    .line 33
    .line 34
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/p;->poll()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    move v7, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const/4 v7, 0x0

    .line 43
    :goto_1
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eqz v7, :cond_4

    .line 46
    .line 47
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->onComplete()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    if-eqz v7, :cond_5

    .line 52
    .line 53
    neg-int v4, v4

    .line 54
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    return-void

    .line 61
    :cond_5
    invoke-interface {v0, v6}, Lio/reactivex/rxjava3/core/k;->onNext(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->done:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->done:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->drain()V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->tryOnError(Ljava/lang/Throwable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->done:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-string p1, "onNext called with a null value."

    .line 17
    .line 18
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/k;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->onError(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    .line 41
    .line 42
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/k;->onNext(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 53
    .line 54
    monitor-enter v0

    .line 55
    :try_start_0
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->drainLoop()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p1

    .line 73
    :cond_4
    :goto_0
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public requested()J
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->requested()J

    move-result-wide v0

    return-wide v0
.end method

.method public serialize()Lio/reactivex/rxjava3/core/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/q<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method

.method public setCancellable(Lm3/f;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->setCancellable(Lm3/f;)V

    return-void
.end method

.method public setDisposable(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->setDisposable(Lio/reactivex/rxjava3/disposables/e;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public tryOnError(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->emitter:Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->done:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    const-string p1, "onError called with a null Throwable."

    .line 18
    .line 19
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/k;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowable(Ljava/lang/Throwable;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->done:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;->drain()V

    .line 35
    .line 36
    .line 37
    return p1

    .line 38
    :cond_2
    :goto_0
    return v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
