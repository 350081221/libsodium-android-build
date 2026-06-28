.class final Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;
.super Lio/reactivex/rxjava3/internal/subscriptions/f;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/a3;
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
        "Lio/reactivex/rxjava3/internal/subscriptions/f<",
        "TT;>;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x40b970e193918fd6L


# instance fields
.field final reducer:Lm3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/c<",
            "TT;TT;TT;>;"
        }
    .end annotation
.end field

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Lm3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Lm3/c<",
            "TT;TT;TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/f;-><init>(Lorg/reactivestreams/p;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->reducer:Lm3/c;

    .line 5
    .line 6
    return-void
    .line 7
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
    invoke-super {p0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->cancel()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 5
    .line 6
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    .line 10
    .line 11
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 12
    .line 13
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

.method public onComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->value:Ljava/lang/Object;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/subscriptions/f;->complete(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 19
    .line 20
    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 12
    .line 13
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->value:Ljava/lang/Object;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->value:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->reducer:Lm3/c;

    .line 16
    .line 17
    invoke-interface {v1, v0, p1}, Lm3/c;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "The reducer returned a null value"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->value:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 34
    .line 35
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->onError(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void
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
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a3$a;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/f;->downstream:Lorg/reactivestreams/p;

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
