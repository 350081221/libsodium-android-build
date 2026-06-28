.class final Lio/reactivex/rxjava3/internal/operators/completable/b0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/completable/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/completable/b0$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/t<",
        "Lio/reactivex/rxjava3/core/i;",
        ">;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x1d42b216fe3a6372L


# instance fields
.field final delayErrors:Z

.field final downstream:Lio/reactivex/rxjava3/core/f;

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final maxConcurrency:I

.field final set:Lio/reactivex/rxjava3/disposables/c;

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/f;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->maxConcurrency:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->delayErrors:Z

    .line 9
    .line 10
    new-instance p1, Lio/reactivex/rxjava3/disposables/c;

    .line 11
    .line 12
    invoke-direct {p1}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 16
    .line 17
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 18
    .line 19
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method innerComplete(Lio/reactivex/rxjava3/internal/operators/completable/b0$a$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/disposables/c;->c(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->maxConcurrency:I

    .line 21
    .line 22
    const v0, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-eq p1, v0, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->upstream:Lorg/reactivestreams/q;

    .line 28
    .line 29
    const-wide/16 v0, 0x1

    .line 30
    .line 31
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
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

.method innerError(Lio/reactivex/rxjava3/internal/operators/completable/b0$a$a;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/disposables/c;->c(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->delayErrors:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->upstream:Lorg/reactivestreams/q;

    .line 11
    .line 12
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-lez p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 36
    .line 37
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 58
    .line 59
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->maxConcurrency:I

    .line 66
    .line 67
    const p2, 0x7fffffff

    .line 68
    .line 69
    .line 70
    if-eq p1, p2, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->upstream:Lorg/reactivestreams/q;

    .line 73
    .line 74
    const-wide/16 v0, 0x1

    .line 75
    .line 76
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onComplete()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 8
    .line 9
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->delayErrors:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/reactivex/rxjava3/disposables/c;->dispose()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-lez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 26
    .line 27
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 48
    .line 49
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/f;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
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
.end method

.method public onNext(Lio/reactivex/rxjava3/core/i;)V
    .locals 2

    .line 2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 3
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a$a;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/completable/b0$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/completable/b0$a;)V

    .line 4
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->set:Lio/reactivex/rxjava3/disposables/c;

    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/disposables/c;->b(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 5
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lio/reactivex/rxjava3/core/i;

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->onNext(Lio/reactivex/rxjava3/core/i;)V

    return-void
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->downstream:Lio/reactivex/rxjava3/core/f;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b0$a;->maxConcurrency:I

    .line 17
    .line 18
    const v1, 0x7fffffff

    .line 19
    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const-wide v0, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    int-to-long v0, v0

    .line 33
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
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
