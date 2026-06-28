.class final Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;
.super Lio/reactivex/rxjava3/internal/subscriptions/i;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/u2;
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
        "Lio/reactivex/rxjava3/internal/subscriptions/i;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x3865630f1b3455e1L


# instance fields
.field done:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final nextSupplier:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lorg/reactivestreams/o<",
            "+TT;>;>;"
        }
    .end annotation
.end field

.field once:Z

.field produced:J


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lm3/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lm3/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lorg/reactivestreams/o<",
            "+TT;>;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/i;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->downstream:Lorg/reactivestreams/p;

    .line 6
    .line 7
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->nextSupplier:Lm3/o;

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
.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->done:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->once:Z

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->downstream:Lorg/reactivestreams/p;

    .line 12
    .line 13
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

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

.method public onError(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->once:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->done:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->downstream:Lorg/reactivestreams/p;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->once:Z

    .line 21
    .line 22
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->nextSupplier:Lm3/o;

    .line 23
    .line 24
    invoke-interface {v1, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "The nextSupplier returned a null Publisher"

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    check-cast v1, Lorg/reactivestreams/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->produced:J

    .line 36
    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    cmp-long p1, v2, v4

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v2, v3}, Lio/reactivex/rxjava3/internal/subscriptions/i;->produced(J)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-interface {v1, p0}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    invoke-static {v1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->downstream:Lorg/reactivestreams/p;

    .line 55
    .line 56
    new-instance v3, Lio/reactivex/rxjava3/exceptions/a;

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    aput-object p1, v4, v5

    .line 63
    .line 64
    aput-object v1, v4, v0

    .line 65
    .line 66
    invoke-direct {v3, v4}, Lio/reactivex/rxjava3/exceptions/a;-><init>([Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, v3}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    return-void
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
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->once:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->produced:J

    .line 11
    .line 12
    const-wide/16 v2, 0x1

    .line 13
    .line 14
    add-long/2addr v0, v2

    .line 15
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->produced:J

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/u2$a;->downstream:Lorg/reactivestreams/p;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/i;->setSubscription(Lorg/reactivestreams/q;)V

    return-void
.end method
