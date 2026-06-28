.class final Lio/reactivex/rxjava3/internal/operators/observable/b$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Ljava/util/Iterator;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5cea3901b29dcb72L


# instance fields
.field final condition:Ljava/util/concurrent/locks/Condition;

.field volatile done:Z

.field volatile error:Ljava/lang/Throwable;

.field final lock:Ljava/util/concurrent/locks/Lock;

.field final queue:Lio/reactivex/rxjava3/internal/queue/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/queue/c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/c;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->condition:Ljava/util/concurrent/locks/Condition;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public dispose()V
    .locals 0

    .line 1
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->signalConsumer()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
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

.method public hasNext()Z
    .locals 3

    .line 1
    :goto_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->isDisposed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->error:Ljava/lang/Throwable;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    throw v0

    .line 18
    :cond_1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->done:Z

    .line 19
    .line 20
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 21
    .line 22
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/queue/c;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->error:Ljava/lang/Throwable;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    throw v0

    .line 40
    :cond_3
    if-eqz v2, :cond_5

    .line 41
    .line 42
    :try_start_0
    invoke-static {}, Lio/reactivex/rxjava3/internal/util/e;->b()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :goto_1
    :try_start_1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->done:Z

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 55
    .line 56
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->isDisposed()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->condition:Ljava/util/concurrent/locks/Condition;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    :try_start_2
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 84
    .line 85
    .line 86
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 87
    :catch_0
    move-exception v0

    .line 88
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->signalConsumer()V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    throw v0

    .line 99
    :cond_5
    const/4 v0, 0x1

    .line 100
    return v0
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->isDisposed(Lio/reactivex/rxjava3/disposables/e;)Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/queue/c;->poll()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->done:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->signalConsumer()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->error:Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->done:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->signalConsumer()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->queue:Lio/reactivex/rxjava3/internal/queue/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/queue/c;->offer(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->signalConsumer()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method signalConsumer()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->condition:Ljava/util/concurrent/locks/Condition;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/b$a;->lock:Ljava/util/concurrent/locks/Lock;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 21
    .line 22
    .line 23
    throw v0
.end method
