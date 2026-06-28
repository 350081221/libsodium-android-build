.class final Lio/reactivex/rxjava3/internal/operators/observable/f2$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/f2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field static final OTHER_STATE_CONSUMED_OR_EMPTY:I = 0x2

.field static final OTHER_STATE_HAS_VALUE:I = 0x1

.field private static final serialVersionUID:J = -0x3fbd8a98db8e76f7L


# instance fields
.field volatile disposed:Z

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final mainDisposable:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;"
        }
    .end annotation
.end field

.field volatile mainDone:Z

.field final otherObserver:Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field volatile otherState:I

.field volatile queue:Lio/reactivex/rxjava3/internal/fuseable/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TT;>;"
        }
    .end annotation
.end field

.field singleItem:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/p0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDisposable:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/f2$a;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherObserver:Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;

    .line 19
    .line 20
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 21
    .line 22
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->disposed:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDisposable:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherObserver:Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;

    .line 10
    .line 11
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 27
    .line 28
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->singleItem:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->drainLoop()V

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
    .locals 9

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move v2, v1

    .line 5
    :cond_0
    :goto_0
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->disposed:Z

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->singleItem:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->singleItem:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 26
    .line 27
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherState:I

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-ne v3, v1, :cond_3

    .line 37
    .line 38
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->singleItem:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->singleItem:Ljava/lang/Object;

    .line 41
    .line 42
    iput v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherState:I

    .line 43
    .line 44
    invoke-interface {v0, v3}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move v3, v5

    .line 48
    :cond_3
    iget-boolean v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDone:Z

    .line 49
    .line 50
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 51
    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    invoke-interface {v7}, Lio/reactivex/rxjava3/internal/fuseable/p;->poll()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    goto :goto_1

    .line 59
    :cond_4
    move-object v7, v4

    .line 60
    :goto_1
    if-nez v7, :cond_5

    .line 61
    .line 62
    move v8, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    const/4 v8, 0x0

    .line 65
    :goto_2
    if-eqz v6, :cond_6

    .line 66
    .line 67
    if-eqz v8, :cond_6

    .line 68
    .line 69
    if-ne v3, v5, :cond_6

    .line 70
    .line 71
    iput-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 72
    .line 73
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/p0;->onComplete()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_6
    if-eqz v8, :cond_7

    .line 78
    .line 79
    neg-int v2, v2

    .line 80
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_0

    .line 85
    .line 86
    return-void

    .line 87
    :cond_7
    invoke-interface {v0, v7}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0
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

.method getOrCreateQueue()Lio/reactivex/rxjava3/internal/fuseable/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/c;

    .line 6
    .line 7
    invoke-static {}, Lio/reactivex/rxjava3/core/i0;->Z()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 15
    .line 16
    :cond_0
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDisposable:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->isDisposed(Lio/reactivex/rxjava3/disposables/e;)Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDone:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->drain()V

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
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherObserver:Lio/reactivex/rxjava3/internal/operators/observable/f2$a$a;

    .line 10
    .line 11
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->drain()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->getOrCreateQueue()Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->drainLoop()V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDisposable:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method

.method otherError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->mainDisposable:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->drain()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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

.method otherSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherState:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->singleItem:Ljava/lang/Object;

    .line 19
    .line 20
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->otherState:I

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/f2$a;->drainLoop()V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
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
