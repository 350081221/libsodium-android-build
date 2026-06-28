.class public final Lio/reactivex/rxjava3/internal/operators/flowable/y4;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/y4$a;,
        Lio/reactivex/rxjava3/internal/operators/flowable/y4$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/flowable/a<",
        "TT;",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final c:Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/o<",
            "TB;>;"
        }
    .end annotation
.end field

.field final d:I


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lorg/reactivestreams/o;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lorg/reactivestreams/o<",
            "TB;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y4;->c:Lorg/reactivestreams/o;

    .line 5
    .line 6
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y4;->d:I

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
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/y4$b;

    .line 2
    .line 3
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y4;->d:I

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/y4$b;-><init>(Lorg/reactivestreams/p;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/flowable/y4$b;->innerNext()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/y4;->c:Lorg/reactivestreams/o;

    .line 15
    .line 16
    iget-object v1, v0, Lio/reactivex/rxjava3/internal/operators/flowable/y4$b;->boundarySubscriber:Lio/reactivex/rxjava3/internal/operators/flowable/y4$a;

    .line 17
    .line 18
    invoke-interface {p1, v1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
.end method
