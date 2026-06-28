.class final Lio/reactivex/rxjava3/processors/b$a;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/q;
.implements Lio/reactivex/rxjava3/internal/util/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/processors/b;
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
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "Lorg/reactivestreams/q;",
        "Lio/reactivex/rxjava3/internal/util/a$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2db3b5785ea03c8eL


# instance fields
.field volatile cancelled:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field emitting:Z

.field fastPath:Z

.field index:J

.field next:Z

.field queue:Lio/reactivex/rxjava3/internal/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/util/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final state:Lio/reactivex/rxjava3/processors/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/processors/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/processors/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/processors/b<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/processors/b$a;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/processors/b$a;->state:Lio/reactivex/rxjava3/processors/b;

    .line 7
    .line 8
    return-void
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
.method public cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/b$a;->state:Lio/reactivex/rxjava3/processors/b;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/processors/b;->y9(Lio/reactivex/rxjava3/processors/b$a;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

.method emitFirst()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->next:Z

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :cond_2
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/b$a;->state:Lio/reactivex/rxjava3/processors/b;

    .line 20
    .line 21
    iget-object v1, v0, Lio/reactivex/rxjava3/processors/b;->d:Ljava/util/concurrent/locks/Lock;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 24
    .line 25
    .line 26
    iget-wide v2, v0, Lio/reactivex/rxjava3/processors/b;->h:J

    .line 27
    .line 28
    iput-wide v2, p0, Lio/reactivex/rxjava3/processors/b$a;->index:J

    .line 29
    .line 30
    iget-object v0, v0, Lio/reactivex/rxjava3/processors/b;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    move v2, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v2, 0x0

    .line 45
    :goto_0
    iput-boolean v2, p0, Lio/reactivex/rxjava3/processors/b$a;->emitting:Z

    .line 46
    .line 47
    iput-boolean v1, p0, Lio/reactivex/rxjava3/processors/b$a;->next:Z

    .line 48
    .line 49
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/processors/b$a;->test(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/processors/b$a;->emitLoop()V

    .line 60
    .line 61
    .line 62
    :cond_5
    return-void

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v0
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

.method emitLoop()V
    .locals 2

    .line 1
    :goto_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/b$a;->queue:Lio/reactivex/rxjava3/internal/util/a;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->emitting:Z

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :cond_1
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lio/reactivex/rxjava3/processors/b$a;->queue:Lio/reactivex/rxjava3/internal/util/a;

    .line 18
    .line 19
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/internal/util/a;->d(Lio/reactivex/rxjava3/internal/util/a$a;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
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

.method emitNext(Ljava/lang/Object;J)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->fastPath:Z

    .line 7
    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :cond_1
    iget-wide v0, p0, Lio/reactivex/rxjava3/processors/b$a;->index:J

    .line 18
    .line 19
    cmp-long p2, v0, p2

    .line 20
    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :cond_2
    iget-boolean p2, p0, Lio/reactivex/rxjava3/processors/b$a;->emitting:Z

    .line 26
    .line 27
    if-eqz p2, :cond_4

    .line 28
    .line 29
    iget-object p2, p0, Lio/reactivex/rxjava3/processors/b$a;->queue:Lio/reactivex/rxjava3/internal/util/a;

    .line 30
    .line 31
    if-nez p2, :cond_3

    .line 32
    .line 33
    new-instance p2, Lio/reactivex/rxjava3/internal/util/a;

    .line 34
    .line 35
    const/4 p3, 0x4

    .line 36
    invoke-direct {p2, p3}, Lio/reactivex/rxjava3/internal/util/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lio/reactivex/rxjava3/processors/b$a;->queue:Lio/reactivex/rxjava3/internal/util/a;

    .line 40
    .line 41
    :cond_3
    invoke-virtual {p2, p1}, Lio/reactivex/rxjava3/internal/util/a;->c(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :cond_4
    const/4 p2, 0x1

    .line 47
    iput-boolean p2, p0, Lio/reactivex/rxjava3/processors/b$a;->next:Z

    .line 48
    .line 49
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    iput-boolean p2, p0, Lio/reactivex/rxjava3/processors/b$a;->fastPath:Z

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1

    .line 56
    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/processors/b$a;->test(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
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

.method public isFull()Z
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public request(J)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/processors/b$a;->cancelled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->isComplete(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lio/reactivex/rxjava3/processors/b$a;->downstream:Lorg/reactivestreams/p;

    .line 14
    .line 15
    invoke-interface {p1}, Lorg/reactivestreams/p;->onComplete()V

    .line 16
    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->isError(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/b$a;->downstream:Lorg/reactivestreams/p;

    .line 26
    .line 27
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->getError(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    cmp-long v0, v2, v4

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    iget-object v0, p0, Lio/reactivex/rxjava3/processors/b$a;->downstream:Lorg/reactivestreams/p;

    .line 46
    .line 47
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/q;->getValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-wide v0, 0x7fffffffffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long p1, v2, v0

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    .line 64
    .line 65
    .line 66
    :cond_3
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    :cond_4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/processors/b$a;->cancel()V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lio/reactivex/rxjava3/processors/b$a;->downstream:Lorg/reactivestreams/p;

    .line 72
    .line 73
    new-instance v0, Lio/reactivex/rxjava3/exceptions/c;

    .line 74
    .line 75
    const-string v2, "Could not deliver value due to lack of requests"

    .line 76
    .line 77
    invoke-direct {v0, v2}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    return v1
    .line 84
    .line 85
.end method
