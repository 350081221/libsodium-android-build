.class final Lio/reactivex/rxjava3/internal/jdk8/a0$b;
.super Lio/reactivex/rxjava3/internal/subscriptions/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/jdk8/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "A:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/subscriptions/f<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4a8674a85e439ebdL


# instance fields
.field final current:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/jdk8/a0$c<",
            "TA;>;>;"
        }
    .end annotation
.end field

.field final error:Lio/reactivex/rxjava3/internal/util/c;

.field final finisher:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "TA;TR;>;"
        }
    .end annotation
.end field

.field final remaining:Ljava/util/concurrent/atomic/AtomicInteger;

.field final subscribers:[Lio/reactivex/rxjava3/internal/jdk8/a0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/jdk8/a0$a<",
            "TT;TA;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;ILjava/util/stream/Collector;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;I",
            "Ljava/util/stream/Collector<",
            "TT;TA;TR;>;)V"
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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->remaining:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 19
    .line 20
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->error:Lio/reactivex/rxjava3/internal/util/c;

    .line 24
    .line 25
    invoke-interface {p3}, Ljava/util/stream/Collector;->finisher()Ljava/util/function/Function;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->finisher:Ljava/util/function/Function;

    .line 30
    .line 31
    new-array p1, p2, [Lio/reactivex/rxjava3/internal/jdk8/a0$a;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :goto_0
    if-ge v0, p2, :cond_0

    .line 35
    .line 36
    new-instance v1, Lio/reactivex/rxjava3/internal/jdk8/a0$a;

    .line 37
    .line 38
    invoke-interface {p3}, Ljava/util/stream/Collector;->supplier()Ljava/util/function/Supplier;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {p3}, Ljava/util/stream/Collector;->accumulator()Ljava/util/function/BiConsumer;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {p3}, Ljava/util/stream/Collector;->combiner()Ljava/util/function/BinaryOperator;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-direct {v1, p0, v2, v3, v4}, Lio/reactivex/rxjava3/internal/jdk8/a0$a;-><init>(Lio/reactivex/rxjava3/internal/jdk8/a0$b;Ljava/lang/Object;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;)V

    .line 55
    .line 56
    .line 57
    aput-object v1, p1, v0

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->subscribers:[Lio/reactivex/rxjava3/internal/jdk8/a0$a;

    .line 63
    .line 64
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->remaining:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    .line 67
    .line 68
    .line 69
    return-void
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
.method addValue(Ljava/lang/Object;)Lio/reactivex/rxjava3/internal/jdk8/a0$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)",
            "Lio/reactivex/rxjava3/internal/jdk8/a0$c<",
            "TA;>;"
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/jdk8/a0$c;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lio/reactivex/rxjava3/internal/jdk8/a0$c;

    .line 13
    .line 14
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/jdk8/a0$c;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

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
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->tryAcquireSlot()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-gez v2, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

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
    iput-object p1, v0, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->first:Ljava/lang/Object;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput-object p1, v0, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->second:Ljava/lang/Object;

    .line 44
    .line 45
    :goto_1
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->releaseSlot()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->subscribers:[Lio/reactivex/rxjava3/internal/jdk8/a0$a;

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
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/jdk8/a0$a;->cancel()V

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

.method innerComplete(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Ljava/util/function/BinaryOperator<",
            "TA;>;)V"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->addValue(Ljava/lang/Object;)Lio/reactivex/rxjava3/internal/jdk8/a0$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p1, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->first:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->second:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {p2, v0, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->innerError(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->remaining:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lio/reactivex/rxjava3/internal/jdk8/a0$c;

    .line 39
    .line 40
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->current:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :try_start_1
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->finisher:Ljava/util/function/Function;

    .line 47
    .line 48
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/jdk8/a0$c;->first:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string p2, "The finisher returned a null value"

    .line 55
    .line 56
    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/f;->complete(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->innerError(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_1
    return-void
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

.method innerError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->error:Lio/reactivex/rxjava3/internal/util/c;

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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->cancel()V

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/a0$b;->error:Lio/reactivex/rxjava3/internal/util/c;

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
