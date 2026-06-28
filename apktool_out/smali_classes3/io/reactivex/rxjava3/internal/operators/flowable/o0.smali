.class public final Lio/reactivex/rxjava3/internal/operators/flowable/o0;
.super Lio/reactivex/rxjava3/internal/operators/flowable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/flowable/o0$a;,
        Lio/reactivex/rxjava3/internal/operators/flowable/o0$b;
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
.field final c:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/o;Lm3/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;",
            "Lm3/g<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/a;-><init>(Lio/reactivex/rxjava3/core/o;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o0;->c:Lm3/g;

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
.method protected O6(Lorg/reactivestreams/p;)V
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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 6
    .line 7
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/o0$a;

    .line 8
    .line 9
    check-cast p1, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 10
    .line 11
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o0;->c:Lm3/g;

    .line 12
    .line 13
    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/o0$a;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;Lm3/g;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/a;->b:Lio/reactivex/rxjava3/core/o;

    .line 21
    .line 22
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/flowable/o0$b;

    .line 23
    .line 24
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/o0;->c:Lm3/g;

    .line 25
    .line 26
    invoke-direct {v1, p1, v2}, Lio/reactivex/rxjava3/internal/operators/flowable/o0$b;-><init>(Lorg/reactivestreams/p;Lm3/g;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/core/o;->N6(Lio/reactivex/rxjava3/core/t;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
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
