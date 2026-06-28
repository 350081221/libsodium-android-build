.class final Lio/reactivex/rxjava3/internal/operators/maybe/x$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/x;
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
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# instance fields
.field final downstream:Lio/reactivex/rxjava3/core/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final isEqual:Lm3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/d<",
            "-TT;-TT;>;"
        }
    .end annotation
.end field

.field final observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/x$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field final observer2:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/x$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/u0;Lm3/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Lm3/d<",
            "-TT;-TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 6
    .line 7
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->isEqual:Lm3/d;

    .line 8
    .line 9
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;-><init>(Lio/reactivex/rxjava3/internal/operators/maybe/x$a;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 15
    .line 16
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;-><init>(Lio/reactivex/rxjava3/internal/operators/maybe/x$a;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer2:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;->dispose()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer2:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;->dispose()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method done()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 8
    .line 9
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;->value:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer2:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 12
    .line 13
    iget-object v1, v1, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;->value:Ljava/lang/Object;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    :try_start_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->isEqual:Lm3/d;

    .line 20
    .line 21
    invoke-interface {v2, v0, v1}, Lm3/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v1, v0}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 40
    .line 41
    invoke-interface {v1, v0}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v2, v0}, Lio/reactivex/rxjava3/core/u0;->onSuccess(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    return-void
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

.method error(Lio/reactivex/rxjava3/internal/operators/maybe/x$b;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/maybe/x$b<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-lez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer2:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 13
    .line 14
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;->dispose()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/maybe/x$b;->dispose()V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 22
    .line 23
    invoke-interface {p1, p2}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {p2}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_1
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
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->isDisposed(Lio/reactivex/rxjava3/disposables/e;)Z

    move-result v0

    return v0
.end method

.method subscribe(Lio/reactivex/rxjava3/core/d0;Lio/reactivex/rxjava3/core/d0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TT;>;",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer1:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/x$a;->observer2:Lio/reactivex/rxjava3/internal/operators/maybe/x$b;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    .line 9
    .line 10
    .line 11
    return-void
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
