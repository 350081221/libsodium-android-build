.class public final Lio/reactivex/rxjava3/internal/operators/single/w;
.super Lio/reactivex/rxjava3/core/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/single/w$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/r0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/x0<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/core/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/x0<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/x0;Lio/reactivex/rxjava3/core/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TT;>;",
            "Lio/reactivex/rxjava3/core/x0<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/r0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/w;->a:Lio/reactivex/rxjava3/core/x0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/w;->b:Lio/reactivex/rxjava3/core/x0;

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
.method protected M1(Lio/reactivex/rxjava3/core/u0;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v7, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object v1, v7, v0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object v1, v7, v0

    .line 15
    .line 16
    new-instance v8, Lio/reactivex/rxjava3/disposables/c;

    .line 17
    .line 18
    invoke-direct {v8}, Lio/reactivex/rxjava3/disposables/c;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v8}, Lio/reactivex/rxjava3/core/u0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 22
    .line 23
    .line 24
    iget-object v9, p0, Lio/reactivex/rxjava3/internal/operators/single/w;->a:Lio/reactivex/rxjava3/core/x0;

    .line 25
    .line 26
    new-instance v10, Lio/reactivex/rxjava3/internal/operators/single/w$a;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    move-object v0, v10

    .line 30
    move-object v2, v8

    .line 31
    move-object v3, v7

    .line 32
    move-object v4, p1

    .line 33
    move-object v5, v6

    .line 34
    invoke-direct/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/operators/single/w$a;-><init>(ILio/reactivex/rxjava3/disposables/c;[Ljava/lang/Object;Lio/reactivex/rxjava3/core/u0;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v9, v10}, Lio/reactivex/rxjava3/core/x0;->a(Lio/reactivex/rxjava3/core/u0;)V

    .line 38
    .line 39
    .line 40
    iget-object v9, p0, Lio/reactivex/rxjava3/internal/operators/single/w;->b:Lio/reactivex/rxjava3/core/x0;

    .line 41
    .line 42
    new-instance v10, Lio/reactivex/rxjava3/internal/operators/single/w$a;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    move-object v0, v10

    .line 46
    invoke-direct/range {v0 .. v5}, Lio/reactivex/rxjava3/internal/operators/single/w$a;-><init>(ILio/reactivex/rxjava3/disposables/c;[Ljava/lang/Object;Lio/reactivex/rxjava3/core/u0;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v9, v10}, Lio/reactivex/rxjava3/core/x0;->a(Lio/reactivex/rxjava3/core/u0;)V

    .line 50
    .line 51
    .line 52
    return-void
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
