.class public final Lio/reactivex/rxjava3/internal/operators/flowable/h3;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/h3$a;,
        Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;,
        Lio/reactivex/rxjava3/internal/operators/flowable/h3$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final c:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/lang/Object;",
            ">;+",
            "Lorg/reactivestreams/o<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/o<",
            "Ljava/lang/Object;",
            ">;+",
            "Lorg/reactivestreams/o<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h3;->c:Lm3/o;

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
.method public O6(Lorg/reactivestreams/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/subscribers/e;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/subscribers/e;-><init>(Lorg/reactivestreams/p;)V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-static {v1}, Lio/reactivex/rxjava3/processors/h;->u9(I)Lio/reactivex/rxjava3/processors/h;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lio/reactivex/rxjava3/processors/c;->r9()Lio/reactivex/rxjava3/processors/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :try_start_0
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/h3;->c:Lm3/o;

    .line 17
    .line 18
    invoke-interface {v2, v1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "handler returned a null Publisher"

    .line 23
    .line 24
    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    check-cast v2, Lorg/reactivestreams/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    new-instance v3, Lio/reactivex/rxjava3/internal/operators/flowable/h3$b;

    .line 30
    .line 31
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 32
    .line 33
    invoke-direct {v3, v4}, Lio/reactivex/rxjava3/internal/operators/flowable/h3$b;-><init>(Lorg/reactivestreams/o;)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lio/reactivex/rxjava3/internal/operators/flowable/h3$a;

    .line 37
    .line 38
    invoke-direct {v4, v0, v1, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/h3$a;-><init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/processors/c;Lorg/reactivestreams/q;)V

    .line 39
    .line 40
    .line 41
    iput-object v4, v3, Lio/reactivex/rxjava3/internal/operators/flowable/h3$b;->subscriber:Lio/reactivex/rxjava3/internal/operators/flowable/h3$c;

    .line 42
    .line 43
    invoke-interface {p1, v4}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v2, v3}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v3, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/h3$b;->onNext(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 63
    .line 64
    .line 65
    return-void
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
