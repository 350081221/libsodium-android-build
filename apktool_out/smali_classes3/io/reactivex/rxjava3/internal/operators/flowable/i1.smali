.class public final Lio/reactivex/rxjava3/internal/operators/flowable/i1;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/i1$a;,
        Lio/reactivex/rxjava3/internal/operators/flowable/i1$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/i1$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i1;->b:[Ljava/lang/Object;

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
.end method


# virtual methods
.method public O6(Lorg/reactivestreams/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/i1$a;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 9
    .line 10
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i1;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/i1$a;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/i1$b;

    .line 20
    .line 21
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/i1;->b:[Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/i1$b;-><init>(Lorg/reactivestreams/p;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 27
    .line 28
    .line 29
    :goto_0
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
