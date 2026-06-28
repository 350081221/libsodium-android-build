.class final Lio/reactivex/rxjava3/internal/operators/completable/f$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/completable/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6e8ac9652ad7cd50L


# instance fields
.field final downstream:Lio/reactivex/rxjava3/core/f;

.field final sd:Lio/reactivex/rxjava3/internal/disposables/f;

.field final sources:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/f;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/f;",
            "Ljava/util/Iterator<",
            "+",
            "Lio/reactivex/rxjava3/core/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->sources:Ljava/util/Iterator;

    .line 7
    .line 8
    new-instance p1, Lio/reactivex/rxjava3/internal/disposables/f;

    .line 9
    .line 10
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/disposables/f;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 14
    .line 15
    return-void
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


# virtual methods
.method next()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/disposables/f;->isDisposed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->sources:Ljava/util/Iterator;

    .line 18
    .line 19
    :cond_2
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 20
    .line 21
    invoke-virtual {v1}, Lio/reactivex/rxjava3/internal/disposables/f;->isDisposed()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    return-void

    .line 28
    :cond_3
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    if-nez v1, :cond_4

    .line 33
    .line 34
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 35
    .line 36
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/f;->onComplete()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_4
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "The CompletableSource returned is null"

    .line 45
    .line 46
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    check-cast v1, Lio/reactivex/rxjava3/core/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    invoke-interface {v1, p0}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 66
    .line 67
    invoke-interface {v1, v0}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 76
    .line 77
    invoke-interface {v1, v0}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-void
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

.method public onComplete()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->next()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->downstream:Lio/reactivex/rxjava3/core/f;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/f$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method
