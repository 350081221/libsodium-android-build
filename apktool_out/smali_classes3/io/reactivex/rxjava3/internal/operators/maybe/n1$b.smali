.class final Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/a0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x52a56ffc3eeb9b77L


# instance fields
.field final downstream:Lio/reactivex/rxjava3/core/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final fallback:Lio/reactivex/rxjava3/core/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/d0<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final other:Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/n1$c<",
            "TT;TU;>;"
        }
    .end annotation
.end field

.field final otherObserver:Lio/reactivex/rxjava3/internal/operators/maybe/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/n1$a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/a0;Lio/reactivex/rxjava3/core/d0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 5
    .line 6
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;-><init>(Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->other:Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;

    .line 12
    .line 13
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->fallback:Lio/reactivex/rxjava3/core/d0;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    new-instance p2, Lio/reactivex/rxjava3/internal/operators/maybe/n1$a;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/n1$a;-><init>(Lio/reactivex/rxjava3/core/a0;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->otherObserver:Lio/reactivex/rxjava3/internal/operators/maybe/n1$a;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->other:Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;

    .line 5
    .line 6
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->otherObserver:Lio/reactivex/rxjava3/internal/operators/maybe/n1$a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->isDisposed(Lio/reactivex/rxjava3/disposables/e;)Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->other:Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;

    .line 2
    .line 3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/a0;->onComplete()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->other:Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;

    .line 2
    .line 3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
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

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->other:Lio/reactivex/rxjava3/internal/operators/maybe/n1$c;

    .line 2
    .line 3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onSuccess(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public otherComplete()V
    .locals 2

    .line 1
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->fallback:Lio/reactivex/rxjava3/core/d0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 12
    .line 13
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->otherObserver:Lio/reactivex/rxjava3/internal/operators/maybe/n1$a;

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
    .line 28
    .line 29
    .line 30
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

.method public otherError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/n1$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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
