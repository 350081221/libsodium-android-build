.class final Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/p4;
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
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# instance fields
.field final a:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-",
            "Lio/reactivex/rxjava3/schedulers/d<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field final b:Ljava/util/concurrent/TimeUnit;

.field final c:Lio/reactivex/rxjava3/core/q0;

.field d:Lorg/reactivestreams/q;

.field e:J


# direct methods
.method constructor <init>(Lorg/reactivestreams/p;Ljava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Lio/reactivex/rxjava3/schedulers/d<",
            "TT;>;>;",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->a:Lorg/reactivestreams/p;

    .line 5
    .line 6
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->c:Lio/reactivex/rxjava3/core/q0;

    .line 7
    .line 8
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->b:Ljava/util/concurrent/TimeUnit;

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
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->d:Lorg/reactivestreams/q;

    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    return-void
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->a:Lorg/reactivestreams/p;

    invoke-interface {v0}, Lorg/reactivestreams/p;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->a:Lorg/reactivestreams/p;

    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->c:Lio/reactivex/rxjava3/core/q0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->b:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/q0;->d(Ljava/util/concurrent/TimeUnit;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->e:J

    .line 10
    .line 11
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->e:J

    .line 12
    .line 13
    sub-long/2addr v0, v2

    .line 14
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->a:Lorg/reactivestreams/p;

    .line 15
    .line 16
    new-instance v3, Lio/reactivex/rxjava3/schedulers/d;

    .line 17
    .line 18
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->b:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    invoke-direct {v3, p1, v0, v1, v4}, Lio/reactivex/rxjava3/schedulers/d;-><init>(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v2, v3}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->d:Lorg/reactivestreams/q;

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->c:Lio/reactivex/rxjava3/core/q0;

    .line 10
    .line 11
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->b:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/q0;->d(Ljava/util/concurrent/TimeUnit;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->e:J

    .line 18
    .line 19
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->d:Lorg/reactivestreams/q;

    .line 20
    .line 21
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->a:Lorg/reactivestreams/p;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
    .line 27
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/p4$a;->d:Lorg/reactivestreams/q;

    invoke-interface {v0, p1, p2}, Lorg/reactivestreams/q;->request(J)V

    return-void
.end method
