.class final Lio/reactivex/rxjava3/internal/operators/flowable/o3$a;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/o3;
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
        "Lio/reactivex/rxjava3/core/o<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final c:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TR;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o3$a;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o3$a;->c:Lm3/o;

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
.method public O6(Lorg/reactivestreams/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o3$a;->c:Lm3/o;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o3$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "The mapper returned a null Publisher"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    check-cast v0, Lorg/reactivestreams/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    instance-of v1, v0, Lm3/s;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :try_start_1
    check-cast v0, Lm3/s;

    .line 21
    .line 22
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->complete(Lorg/reactivestreams/p;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance v1, Lio/reactivex/rxjava3/internal/subscriptions/h;

    .line 33
    .line 34
    invoke-direct {v1, p1, v0}, Lio/reactivex/rxjava3/internal/subscriptions/h;-><init>(Lorg/reactivestreams/p;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-interface {v0, p1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :catchall_1
    move-exception v0

    .line 54
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 58
    .line 59
    .line 60
    return-void
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
