.class public final Lio/reactivex/rxjava3/internal/operators/observable/y2;
.super Lio/reactivex/rxjava3/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/y2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/observable/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:Lm3/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/r<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final c:J


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/i0;JLm3/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/i0<",
            "TT;>;J",
            "Lm3/r<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/a;-><init>(Lio/reactivex/rxjava3/core/n0;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/y2;->b:Lm3/r;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/y2;->c:J

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
.method public l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v5, Lio/reactivex/rxjava3/internal/disposables/f;

    .line 2
    .line 3
    invoke-direct {v5}, Lio/reactivex/rxjava3/internal/disposables/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v5}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 7
    .line 8
    .line 9
    new-instance v7, Lio/reactivex/rxjava3/internal/operators/observable/y2$a;

    .line 10
    .line 11
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/y2;->c:J

    .line 12
    .line 13
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/y2;->b:Lm3/r;

    .line 14
    .line 15
    iget-object v6, p0, Lio/reactivex/rxjava3/internal/operators/observable/a;->a:Lio/reactivex/rxjava3/core/n0;

    .line 16
    .line 17
    move-object v0, v7

    .line 18
    move-object v1, p1

    .line 19
    invoke-direct/range {v0 .. v6}, Lio/reactivex/rxjava3/internal/operators/observable/y2$a;-><init>(Lio/reactivex/rxjava3/core/p0;JLm3/r;Lio/reactivex/rxjava3/internal/disposables/f;Lio/reactivex/rxjava3/core/n0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7}, Lio/reactivex/rxjava3/internal/operators/observable/y2$a;->subscribeNext()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
.end method
