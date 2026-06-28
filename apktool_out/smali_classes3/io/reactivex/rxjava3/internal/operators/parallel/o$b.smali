.class final Lio/reactivex/rxjava3/internal/operators/parallel/o$b;
.super Lio/reactivex/rxjava3/internal/subscriptions/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/parallel/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscriptions/f<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4a8674a85e439ebdL


# instance fields
.field final current:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/parallel/o$c<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field final error:Lio/reactivex/rxjava3/internal/util/c;

.field final reducer:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "TT;TT;TT;>;"
        }
    .end annotation
.end field

.field final remaining:Ljava/util/concurrent/atomic/AtomicInteger;

.field final subscribers:[Lio/reactivex/rxjava3/internal/operators/parallel/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/operators/parallel/o$a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;ILm3/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;I",
            "Lm3/c<",
            "TT;TT;TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/f;-><init>(Lorg/reactivestreams/p;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->remaining:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 19
    .line 20
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 24
    .line 25
    new-array p1, p2, [Lio/reactivex/rxjava3/internal/operators/parallel/o$a;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-ge v0, p2, :cond_0

    .line 29
    .line 30
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/parallel/o$a;

    .line 31
    .line 32
    invoke-direct {v1, p0, p3}, Lio/reactivex/rxjava3/internal/operators/parallel/o$a;-><init>(Lio/reactivex/rxjava3/internal/operators/parallel/o$b;Lm3/c;)V

    .line 33
    .line 34
    .line 35
    aput-object v1, p1, v0

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->subscribers:[Lio/reactivex/rxjava3/internal/operators/parallel/o$a;

    .line 41
    .line 42
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->reducer:Lm3/c;

    .line 43
    .line 44
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->remaining:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    .line 47
    .line 48
    .line 49
    return-void
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
.method addValue(Ljava/lang/Object;)Lio/reactivex/rxjava3/internal/operators/parallel/o$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lio/reactivex/rxjava3/internal/operators/parallel/o$c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;

    .line 13
    .line 14
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    invoke-static {v2, v1, v0}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->tryAcquireSlot()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-gez v2, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-nez v2, :cond_2

    .line 39
    .line 40
    iput-object p1, v0, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->first:Ljava/lang/Object;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput-object p1, v0, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->second:Ljava/lang/Object;

    .line 44
    .line 45
    :goto_1
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->releaseSlot()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-static {p1, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_3
    return-object v1
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

.method public cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->subscribers:[Lio/reactivex/rxjava3/internal/operators/parallel/o$a;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/operators/parallel/o$a;->cancel()V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method innerComplete(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->addValue(Ljava/lang/Object;)Lio/reactivex/rxjava3/internal/operators/parallel/o$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->reducer:Lm3/c;

    .line 10
    .line 11
    iget-object v1, p1, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->first:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->second:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Lm3/c;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "The reducer returned a null value"

    .line 20
    .line 21
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->innerError(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->remaining:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;

    .line 48
    .line 49
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/parallel/o$c;->first:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/f;->complete(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 64
    .line 65
    invoke-interface {p1}, Lorg/reactivestreams/p;->onComplete()V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_1
    return-void
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

.method innerError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->cancel()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/o$b;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eq p1, v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
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
.end method
