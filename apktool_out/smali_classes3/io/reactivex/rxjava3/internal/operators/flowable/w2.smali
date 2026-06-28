.class public final Lio/reactivex/rxjava3/internal/operators/flowable/w2;
.super Lio/reactivex/rxjava3/flowables/a;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/internal/fuseable/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;,
        Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/flowables/a<",
        "TT;>;",
        "Lio/reactivex/rxjava3/internal/fuseable/j<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/o<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:I

.field final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/flowable/w2$b<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/reactivestreams/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/o<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/flowables/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->b:Lorg/reactivestreams/o;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->c:I

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

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
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;

    .line 12
    .line 13
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->c:I

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :cond_1
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;

    .line 31
    .line 32
    invoke-direct {v1, p1, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;-><init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->add(Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    invoke-virtual {v1}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;->isCancelled()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->remove(Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->drain()V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    :cond_3
    iget-object p1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->error:Ljava/lang/Throwable;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;->downstream:Lorg/reactivestreams/p;

    .line 63
    .line 64
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    iget-object p1, v1, Lio/reactivex/rxjava3/internal/operators/flowable/w2$a;->downstream:Lorg/reactivestreams/p;

    .line 69
    .line 70
    invoke-interface {p1}, Lorg/reactivestreams/p;->onComplete()V

    .line 71
    .line 72
    .line 73
    :goto_2
    return-void
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

.method public r9(Lm3/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->isDisposed()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    :cond_0
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;

    .line 18
    .line 19
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->c:I

    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v0, v1

    .line 36
    :cond_2
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->connect:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->connect:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    move v2, v3

    .line 55
    :cond_3
    :try_start_0
    invoke-interface {p1, v0}, Lm3/g;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->b:Lorg/reactivestreams/o;

    .line 61
    .line 62
    invoke-interface {p1, v0}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 63
    .line 64
    .line 65
    :cond_4
    return-void

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/k;->i(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    throw p1
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

.method public source()Lorg/reactivestreams/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/reactivestreams/o<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->b:Lorg/reactivestreams/o;

    return-object v0
.end method

.method public y9()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/w2$b;->isDisposed()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/w2;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v1, v0, v2}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
