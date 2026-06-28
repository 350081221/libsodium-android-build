.class final Lio/reactivex/rxjava3/internal/operators/mixed/l$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/mixed/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# static fields
.field static final INNER_DISPOSED:Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x4af86f46b0766842L


# instance fields
.field volatile cancelled:Z

.field final delayErrors:Z

.field volatile done:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TR;>;"
        }
    .end annotation
.end field

.field emitted:J

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final inner:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a<",
            "TR;>;>;"
        }
    .end annotation
.end field

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/mixed/l$a;)V

    sput-object v0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->INNER_DISPOSED:Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    return-void
.end method

.method constructor <init>(Lorg/reactivestreams/p;Lm3/o;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TR;>;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->mapper:Lm3/o;

    .line 7
    .line 8
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->delayErrors:Z

    .line 9
    .line 10
    new-instance p1, Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    invoke-direct {p1}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 16
    .line 17
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 23
    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    return-void
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
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->cancelled:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->upstream:Lorg/reactivestreams/q;

    .line 5
    .line 6
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->disposeInner()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method disposeInner()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->INNER_DISPOSED:Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;->dispose()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method drain()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->downstream:Lorg/reactivestreams/p;

    .line 9
    .line 10
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    iget-wide v4, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->emitted:J

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    move v7, v6

    .line 20
    :cond_1
    :goto_0
    iget-boolean v8, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->cancelled:Z

    .line 21
    .line 22
    if-eqz v8, :cond_2

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    if-eqz v8, :cond_3

    .line 30
    .line 31
    iget-boolean v8, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->delayErrors:Z

    .line 32
    .line 33
    if-nez v8, :cond_3

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    iget-boolean v8, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->done:Z

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 46
    .line 47
    if-nez v9, :cond_4

    .line 48
    .line 49
    move v10, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    const/4 v10, 0x0

    .line 52
    :goto_1
    if-eqz v8, :cond_5

    .line 53
    .line 54
    if-eqz v10, :cond_5

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_5
    if-nez v10, :cond_7

    .line 61
    .line 62
    iget-object v8, v9, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;->item:Ljava/lang/Object;

    .line 63
    .line 64
    if-eqz v8, :cond_7

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 67
    .line 68
    .line 69
    move-result-wide v10

    .line 70
    cmp-long v8, v4, v10

    .line 71
    .line 72
    if-nez v8, :cond_6

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_6
    const/4 v8, 0x0

    .line 76
    invoke-static {v2, v9, v8}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object v8, v9, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;->item:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-interface {v0, v8}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const-wide/16 v8, 0x1

    .line 85
    .line 86
    add-long/2addr v4, v8

    .line 87
    goto :goto_0

    .line 88
    :cond_7
    :goto_2
    iput-wide v4, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->emitted:J

    .line 89
    .line 90
    neg-int v7, v7

    .line 91
    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_1

    .line 96
    .line 97
    return-void
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

.method innerError(Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a<",
            "TR;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->delayErrors:Z

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->upstream:Lorg/reactivestreams/q;

    .line 23
    .line 24
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->disposeInner()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->drain()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p2}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    :goto_0
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
.end method

.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->done:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->drain()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->delayErrors:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->disposeInner()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->done:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->drain()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;->dispose()V

    .line 12
    .line 13
    .line 14
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->mapper:Lm3/o;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "The mapper returned a null SingleSource"

    .line 21
    .line 22
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    check-cast p1, Lio/reactivex/rxjava3/core/x0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;-><init>(Lio/reactivex/rxjava3/internal/operators/mixed/l$a;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 39
    .line 40
    sget-object v2, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->INNER_DISPOSED:Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 46
    .line 47
    invoke-static {v2, v1, v0}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/x0;->a(Lio/reactivex/rxjava3/core/u0;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->upstream:Lorg/reactivestreams/q;

    .line 62
    .line 63
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->inner:Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->INNER_DISPOSED:Lio/reactivex/rxjava3/internal/operators/mixed/l$a$a;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->onError(Ljava/lang/Throwable;)V

    .line 74
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
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->downstream:Lorg/reactivestreams/p;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public request(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/mixed/l$a;->drain()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method
