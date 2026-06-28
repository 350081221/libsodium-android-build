.class public final Lio/reactivex/rxjava3/internal/operators/mixed/u;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/mixed/u$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/i0<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final c:Z


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/i0;Lm3/o;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/i0<",
            "TT;>;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/d0<",
            "+TR;>;>;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->a:Lio/reactivex/rxjava3/core/i0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->b:Lm3/o;

    .line 7
    .line 8
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->c:Z

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
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->a:Lio/reactivex/rxjava3/core/i0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->b:Lm3/o;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lio/reactivex/rxjava3/internal/operators/mixed/w;->b(Ljava/lang/Object;Lm3/o;Lio/reactivex/rxjava3/core/p0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->a:Lio/reactivex/rxjava3/core/i0;

    .line 12
    .line 13
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/mixed/u$a;

    .line 14
    .line 15
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->b:Lm3/o;

    .line 16
    .line 17
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/mixed/u;->c:Z

    .line 18
    .line 19
    invoke-direct {v1, p1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/mixed/u$a;-><init>(Lio/reactivex/rxjava3/core/p0;Lm3/o;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/i0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
.end method
