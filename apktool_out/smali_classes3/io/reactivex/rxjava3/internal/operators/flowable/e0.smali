.class public final Lio/reactivex/rxjava3/internal/operators/flowable/e0;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$f;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$c;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$e;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$d;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$h;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$g;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;,
        Lio/reactivex/rxjava3/internal/operators/flowable/e0$i;
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
.field final b:Lio/reactivex/rxjava3/core/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/r<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Lio/reactivex/rxjava3/core/b;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/r;Lio/reactivex/rxjava3/core/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/r<",
            "TT;>;",
            "Lio/reactivex/rxjava3/core/b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0;->b:Lio/reactivex/rxjava3/core/r;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0;->c:Lio/reactivex/rxjava3/core/b;

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
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0;->c:Lio/reactivex/rxjava3/core/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$c;

    .line 24
    .line 25
    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$c;-><init>(Lorg/reactivestreams/p;I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$f;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$f;-><init>(Lorg/reactivestreams/p;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$d;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$d;-><init>(Lorg/reactivestreams/p;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$e;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$e;-><init>(Lorg/reactivestreams/p;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e0$g;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$g;-><init>(Lorg/reactivestreams/p;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-interface {p1, v0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/e0;->b:Lio/reactivex/rxjava3/core/r;

    .line 60
    .line 61
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/r;->a(Lio/reactivex/rxjava3/core/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/e0$b;->onError(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_1
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
