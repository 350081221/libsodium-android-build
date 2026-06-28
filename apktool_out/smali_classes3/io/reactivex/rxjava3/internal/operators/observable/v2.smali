.class public final Lio/reactivex/rxjava3/internal/operators/observable/v2;
.super Lio/reactivex/rxjava3/internal/operators/observable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/v2$a;
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
.field final b:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "Ljava/lang/Object;",
            ">;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/n0;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "TT;>;",
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "Ljava/lang/Object;",
            ">;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/a;-><init>(Lio/reactivex/rxjava3/core/n0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/v2;->b:Lm3/o;

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
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lio/reactivex/rxjava3/subjects/e;->O8()Lio/reactivex/rxjava3/subjects/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/reactivex/rxjava3/subjects/i;->M8()Lio/reactivex/rxjava3/subjects/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/v2;->b:Lm3/o;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "The handler returned a null ObservableSource"

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lio/reactivex/rxjava3/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;

    .line 23
    .line 24
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/a;->a:Lio/reactivex/rxjava3/core/n0;

    .line 25
    .line 26
    invoke-direct {v2, p1, v0, v3}, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;-><init>(Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/subjects/i;Lio/reactivex/rxjava3/core/n0;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v2}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v2, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;->inner:Lio/reactivex/rxjava3/internal/operators/observable/v2$a$a;

    .line 33
    .line 34
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/operators/observable/v2$a;->subscribeNext()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;)V

    .line 46
    .line 47
    .line 48
    return-void
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
