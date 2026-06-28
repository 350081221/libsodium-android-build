.class public final Lio/reactivex/rxjava3/internal/operators/maybe/z0;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/maybe/z0$a;,
        Lio/reactivex/rxjava3/internal/operators/maybe/z0$c;,
        Lio/reactivex/rxjava3/internal/operators/maybe/z0$d;,
        Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;
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
.field final b:[Lio/reactivex/rxjava3/core/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Lio/reactivex/rxjava3/core/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0;->b:[Lio/reactivex/rxjava3/core/d0;

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
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/z0;->b:[Lio/reactivex/rxjava3/core/d0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {}, Lio/reactivex/rxjava3/core/o;->c0()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-gt v1, v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/maybe/z0$c;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/maybe/z0$a;

    .line 17
    .line 18
    invoke-direct {v2}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$a;-><init>()V

    .line 19
    .line 20
    .line 21
    :goto_0
    new-instance v3, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;

    .line 22
    .line 23
    invoke-direct {v3, p1, v1, v2}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;-><init>(Lorg/reactivestreams/p;ILio/reactivex/rxjava3/internal/operators/maybe/z0$d;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v3}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v3, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 30
    .line 31
    array-length v1, v0

    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_1
    if-ge v2, v1, :cond_2

    .line 34
    .line 35
    aget-object v4, v0, v2

    .line 36
    .line 37
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/operators/maybe/z0$b;->isCancelled()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    invoke-interface {v4, v3}, Lio/reactivex/rxjava3/core/d0;->a(Lio/reactivex/rxjava3/core/a0;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_2
    return-void
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
