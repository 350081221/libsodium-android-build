.class public final Lio/reactivex/rxjava3/internal/operators/flowable/c4;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/c4$a;
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
.field final c:Lio/reactivex/rxjava3/core/q0;

.field final d:Z


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lio/reactivex/rxjava3/core/q0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lio/reactivex/rxjava3/core/q0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/c4;->c:Lio/reactivex/rxjava3/core/q0;

    .line 5
    .line 6
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/c4;->d:Z

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
.method public O6(Lorg/reactivestreams/p;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/c4;->c:Lio/reactivex/rxjava3/core/q0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/rxjava3/core/q0;->c()Lio/reactivex/rxjava3/core/q0$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/c4$a;

    .line 8
    .line 9
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 10
    .line 11
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/c4;->d:Z

    .line 12
    .line 13
    invoke-direct {v1, p1, v0, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/c4$a;-><init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/core/q0$c;Lorg/reactivestreams/o;Z)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/q0$c;->b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

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
