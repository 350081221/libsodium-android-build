.class final Lio/reactivex/rxjava3/internal/operators/completable/e$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/completable/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6e8ac9652ad7cd50L


# instance fields
.field final downstream:Lio/reactivex/rxjava3/core/f;

.field index:I

.field final sd:Lio/reactivex/rxjava3/internal/disposables/f;

.field final sources:[Lio/reactivex/rxjava3/core/i;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/f;[Lio/reactivex/rxjava3/core/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->sources:[Lio/reactivex/rxjava3/core/i;

    .line 7
    .line 8
    new-instance p1, Lio/reactivex/rxjava3/internal/disposables/f;

    .line 9
    .line 10
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/disposables/f;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->sources:[Lio/reactivex/rxjava3/core/i;

    .line 18
    .line 19
    :cond_2
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

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
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->index:I

    .line 29
    .line 30
    add-int/lit8 v2, v1, 0x1

    .line 31
    .line 32
    iput v2, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->index:I

    .line 33
    .line 34
    array-length v2, v0

    .line 35
    if-ne v1, v2, :cond_4

    .line 36
    .line 37
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 38
    .line 39
    invoke-interface {v0}, Lio/reactivex/rxjava3/core/f;->onComplete()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_4
    aget-object v1, v0, v1

    .line 44
    .line 45
    invoke-interface {v1, p0}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    return-void
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

.method public onComplete()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->next()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->downstream:Lio/reactivex/rxjava3/core/f;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/e$a;->sd:Lio/reactivex/rxjava3/internal/disposables/f;

    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    return-void
.end method
