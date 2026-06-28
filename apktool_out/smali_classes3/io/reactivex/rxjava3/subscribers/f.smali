.class public Lio/reactivex/rxjava3/subscribers/f;
.super Lio/reactivex/rxjava3/observers/a;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/subscribers/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/observers/a<",
        "TT;",
        "Lio/reactivex/rxjava3/subscribers/f<",
        "TT;>;>;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# instance fields
.field private final i:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field private volatile j:Z

.field private final k:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/reactivestreams/q;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/subscribers/f$a;->INSTANCE:Lio/reactivex/rxjava3/subscribers/f$a;

    const-wide v1, 0x7fffffffffffffffL

    invoke-direct {p0, v0, v1, v2}, Lio/reactivex/rxjava3/subscribers/f;-><init>(Lorg/reactivestreams/p;J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .line 2
    sget-object v0, Lio/reactivex/rxjava3/subscribers/f$a;->INSTANCE:Lio/reactivex/rxjava3/subscribers/f$a;

    invoke-direct {p0, v0, p1, p2}, Lio/reactivex/rxjava3/subscribers/f;-><init>(Lorg/reactivestreams/p;J)V

    return-void
.end method

.method public constructor <init>(Lorg/reactivestreams/p;)V
    .locals 2
    .param p1    # Lorg/reactivestreams/p;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    const-wide v0, 0x7fffffffffffffffL

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lio/reactivex/rxjava3/subscribers/f;-><init>(Lorg/reactivestreams/p;J)V

    return-void
.end method

.method public constructor <init>(Lorg/reactivestreams/p;J)V
    .locals 2
    .param p1    # Lorg/reactivestreams/p;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;J)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Lio/reactivex/rxjava3/observers/a;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    .line 5
    iput-object p1, p0, Lio/reactivex/rxjava3/subscribers/f;->i:Lorg/reactivestreams/p;

    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/reactivex/rxjava3/subscribers/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative initial request not allowed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static L()Lio/reactivex/rxjava3/subscribers/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/rxjava3/subscribers/f<",
            "TT;>;"
        }
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/subscribers/f;

    invoke-direct {v0}, Lio/reactivex/rxjava3/subscribers/f;-><init>()V

    return-object v0
.end method

.method public static M(J)Lio/reactivex/rxjava3/subscribers/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J)",
            "Lio/reactivex/rxjava3/subscribers/f<",
            "TT;>;"
        }
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/subscribers/f;

    invoke-direct {v0, p0, p1}, Lio/reactivex/rxjava3/subscribers/f;-><init>(J)V

    return-object v0
.end method

.method public static N(Lorg/reactivestreams/p;)Lio/reactivex/rxjava3/subscribers/f;
    .locals 1
    .param p0    # Lorg/reactivestreams/p;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)",
            "Lio/reactivex/rxjava3/subscribers/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/subscribers/f;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/subscribers/f;-><init>(Lorg/reactivestreams/p;)V

    return-object v0
.end method


# virtual methods
.method protected final K()Lio/reactivex/rxjava3/subscribers/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/subscribers/f<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "Not subscribed!"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/observers/a;->G(Ljava/lang/String;)Ljava/lang/AssertionError;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final O()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final P()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/subscribers/f;->j:Z

    return v0
.end method

.method protected Q()V
    .locals 0

    return-void
.end method

.method public final R(J)Lio/reactivex/rxjava3/subscribers/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lio/reactivex/rxjava3/subscribers/f<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lio/reactivex/rxjava3/subscribers/f;->request(J)V

    return-object p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/subscribers/f;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/subscribers/f;->j:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

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

.method protected final dispose()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/subscribers/f;->cancel()V

    return-void
.end method

.method protected final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/subscribers/f;->j:Z

    return v0
.end method

.method public onComplete()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/a;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v2, "onSubscribe not called in proper order"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/a;->e:Ljava/lang/Thread;

    .line 33
    .line 34
    iget-wide v0, p0, Lio/reactivex/rxjava3/observers/a;->d:J

    .line 35
    .line 36
    const-wide/16 v2, 0x1

    .line 37
    .line 38
    add-long/2addr v0, v2

    .line 39
    iput-wide v0, p0, Lio/reactivex/rxjava3/observers/a;->d:J

    .line 40
    .line 41
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->i:Lorg/reactivestreams/p;

    .line 42
    .line 43
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    iget-object v1, p0, Lio/reactivex/rxjava3/observers/a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 56
    .line 57
    .line 58
    throw v0
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
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/a;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v2, "onSubscribe not called in proper order"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/a;->e:Ljava/lang/Thread;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string v2, "onError received a null Throwable"

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->i:Lorg/reactivestreams/p;

    .line 55
    .line 56
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lio/reactivex/rxjava3/observers/a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->a:Ljava/util/concurrent/CountDownLatch;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 69
    .line 70
    .line 71
    throw p1
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
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/observers/a;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/observers/a;->f:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v2, "onSubscribe not called in proper order"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/a;->e:Ljava/lang/Thread;

    .line 33
    .line 34
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->b:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string v2, "onNext received a null value"

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->i:Lorg/reactivestreams/p;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
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
    .locals 5
    .param p1    # Lorg/reactivestreams/q;
        .annotation build Ll3/f;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lio/reactivex/rxjava3/observers/a;->e:Ljava/lang/Thread;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/NullPointerException;

    .line 12
    .line 13
    const-string v1, "onSubscribe received a null Subscription"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v0, v1, p1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    .line 41
    .line 42
    if-eq v0, v1, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lio/reactivex/rxjava3/observers/a;->c:Ljava/util/List;

    .line 45
    .line 46
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v3, "onSubscribe received multiple subscriptions: "

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :cond_2
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->i:Lorg/reactivestreams/p;

    .line 73
    .line 74
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 78
    .line 79
    const-wide/16 v1, 0x0

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    cmp-long v0, v3, v1

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-interface {p1, v3, v4}, Lorg/reactivestreams/q;->request(J)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {p0}, Lio/reactivex/rxjava3/subscribers/f;->Q()V

    .line 93
    .line 94
    .line 95
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public final request(J)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/subscribers/f;->k:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lio/reactivex/rxjava3/subscribers/f;->l:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method

.method protected bridge synthetic t()Lio/reactivex/rxjava3/observers/a;
    .locals 1

    invoke-virtual {p0}, Lio/reactivex/rxjava3/subscribers/f;->K()Lio/reactivex/rxjava3/subscribers/f;

    move-result-object v0

    return-object v0
.end method
