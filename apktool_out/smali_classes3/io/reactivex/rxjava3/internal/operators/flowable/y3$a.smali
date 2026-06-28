.class final Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;
.super Ljava/util/ArrayDeque;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/y3;
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
        "Ljava/util/ArrayDeque<",
        "TT;>;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x34d6eda843bdac95L


# instance fields
.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final skip:I

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->downstream:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->skip:I

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

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->upstream:Lorg/reactivestreams/q;

    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    return-void
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->downstream:Lorg/reactivestreams/p;

    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->downstream:Lorg/reactivestreams/p;

    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->skip:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->downstream:Lorg/reactivestreams/p;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->upstream:Lorg/reactivestreams/q;

    .line 20
    .line 21
    const-wide/16 v1, 0x1

    .line 22
    .line 23
    invoke-interface {v0, v1, v2}, Lorg/reactivestreams/q;->request(J)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 27
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->upstream:Lorg/reactivestreams/q;

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
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->downstream:Lorg/reactivestreams/p;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y3$a;->upstream:Lorg/reactivestreams/q;

    invoke-interface {v0, p1, p2}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method
