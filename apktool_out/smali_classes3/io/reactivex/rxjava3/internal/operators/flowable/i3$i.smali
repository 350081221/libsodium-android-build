.class final Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/i3;
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
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lorg/reactivestreams/q;",
        ">;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field static final EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

.field static final TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

.field private static final serialVersionUID:J = 0x6442c5ce7145e104L


# instance fields
.field final buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
            "TT;>;"
        }
    .end annotation
.end field

.field done:Z

.field final management:Ljava/util/concurrent/atomic/AtomicInteger;

.field requestedFromUpstream:J

.field final shouldConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final subscribers:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$c<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 3
    .line 4
    sput-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 5
    .line 6
    new-array v0, v0, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 7
    .line 8
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 9
    .line 10
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

.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$f<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->management:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    sget-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->shouldConnect:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    return-void
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
.end method


# virtual methods
.method add(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$c<",
            "TT;>;)Z"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 8
    .line 9
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    array-length v1, v0

    .line 16
    add-int/lit8 v3, v1, 0x1

    .line 17
    .line 18
    new-array v3, v3, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 19
    .line 20
    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    aput-object p1, v3, v1

    .line 24
    .line 25
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-static {v1, v0, v3}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1
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

.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

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

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method manageRequests()V
    .locals 12

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->management:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->isDisposed()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lorg/reactivestreams/q;

    .line 23
    .line 24
    if-eqz v2, :cond_4

    .line 25
    .line 26
    iget-wide v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->requestedFromUpstream:J

    .line 27
    .line 28
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 35
    .line 36
    array-length v6, v5

    .line 37
    const/4 v7, 0x0

    .line 38
    move-wide v8, v3

    .line 39
    :goto_0
    if-ge v7, v6, :cond_3

    .line 40
    .line 41
    aget-object v10, v5, v7

    .line 42
    .line 43
    iget-object v10, v10, Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;->totalRequested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 44
    .line 45
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 46
    .line 47
    .line 48
    move-result-wide v10

    .line 49
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    add-int/lit8 v7, v7, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sub-long v3, v8, v3

    .line 57
    .line 58
    const-wide/16 v5, 0x0

    .line 59
    .line 60
    cmp-long v5, v3, v5

    .line 61
    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    iput-wide v8, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->requestedFromUpstream:J

    .line 65
    .line 66
    invoke-interface {v2, v3, v4}, Lorg/reactivestreams/q;->request(J)V

    .line 67
    .line 68
    .line 69
    :cond_4
    neg-int v1, v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    return-void
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
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->done:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 9
    .line 10
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->complete()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 22
    .line 23
    array-length v1, v0

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_0

    .line 26
    .line 27
    aget-object v3, v0, v2

    .line 28
    .line 29
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 30
    .line 31
    invoke-interface {v4, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->replay(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
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

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->done:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->error(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    sget-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->TERMINATED:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 22
    .line 23
    array-length v0, p1

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-ge v1, v0, :cond_1

    .line 26
    .line 27
    aget-object v2, p1, v1

    .line 28
    .line 29
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 30
    .line 31
    invoke-interface {v3, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->replay(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->done:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->next(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_0

    .line 21
    .line 22
    aget-object v2, p1, v1

    .line 23
    .line 24
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 25
    .line 26
    invoke-interface {v3, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->replay(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lorg/reactivestreams/q;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->manageRequests()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_0

    .line 21
    .line 22
    aget-object v2, p1, v1

    .line 23
    .line 24
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->buffer:Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;

    .line 25
    .line 26
    invoke-interface {v3, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i3$f;->replay(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
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

.method remove(Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/i3$c<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_3

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    const/4 v3, -0x1

    .line 30
    :goto_1
    if-gez v3, :cond_4

    .line 31
    .line 32
    return-void

    .line 33
    :cond_4
    const/4 v4, 0x1

    .line 34
    if-ne v1, v4, :cond_5

    .line 35
    .line 36
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_5
    add-int/lit8 v5, v1, -0x1

    .line 40
    .line 41
    new-array v5, v5, [Lio/reactivex/rxjava3/internal/operators/flowable/i3$c;

    .line 42
    .line 43
    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v3, 0x1

    .line 47
    .line 48
    sub-int/2addr v1, v3

    .line 49
    sub-int/2addr v1, v4

    .line 50
    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    move-object v1, v5

    .line 54
    :goto_2
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i3$i;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 55
    .line 56
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    return-void
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
