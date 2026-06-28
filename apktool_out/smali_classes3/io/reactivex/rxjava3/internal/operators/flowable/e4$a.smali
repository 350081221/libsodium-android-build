.class final Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/e4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lorg/reactivestreams/q;",
        ">;",
        "Lio/reactivex/rxjava3/core/t<",
        "TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3540c639803a63b9L


# instance fields
.field final bufferSize:I

.field volatile done:Z

.field fusionMode:I

.field final index:J

.field final parent:Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/flowable/e4$b<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field volatile queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;JI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/e4$b<",
            "TT;TR;>;JI)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->index:J

    .line 7
    .line 8
    iput p4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->bufferSize:I

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
.method public cancel()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onComplete()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->index:J

    .line 4
    .line 5
    iget-wide v3, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->unique:J

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->done:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->index:J

    .line 4
    .line 5
    iget-wide v3, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->unique:J

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowable(Ljava/lang/Throwable;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-boolean p1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->delayErrors:Z

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->upstream:Lorg/reactivestreams/q;

    .line 25
    .line 26
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 27
    .line 28
    .line 29
    iput-boolean v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->done:Z

    .line 30
    .line 31
    :cond_0
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->done:Z

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
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
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->index:J

    .line 4
    .line 5
    iget-wide v3, v0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->unique:J

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->fusionMode:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 16
    .line 17
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 24
    .line 25
    const-string v0, "Queue full?!"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->onError(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

    .line 35
    .line 36
    .line 37
    :cond_1
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
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lorg/reactivestreams/q;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/n;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lio/reactivex/rxjava3/internal/fuseable/n;

    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->fusionMode:I

    .line 23
    .line 24
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 25
    .line 26
    iput-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->done:Z

    .line 27
    .line 28
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->parent:Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e4$b;->drain()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 v2, 0x2

    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    iput v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->fusionMode:I

    .line 38
    .line 39
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 40
    .line 41
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->bufferSize:I

    .line 42
    .line 43
    int-to-long v0, v0

    .line 44
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 49
    .line 50
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->bufferSize:I

    .line 51
    .line 52
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 56
    .line 57
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->bufferSize:I

    .line 58
    .line 59
    int-to-long v0, v0

    .line 60
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
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

.method public request(J)V
    .locals 2

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e4$a;->fusionMode:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lorg/reactivestreams/q;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Lorg/reactivestreams/q;->request(J)V

    .line 13
    .line 14
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
