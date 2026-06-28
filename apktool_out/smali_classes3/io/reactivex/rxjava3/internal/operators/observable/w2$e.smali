.class final Lio/reactivex/rxjava3/internal/operators/observable/w2$e;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/w2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "+",
            "Lio/reactivex/rxjava3/observables/a<",
            "TU;>;>;"
        }
    .end annotation
.end field

.field private final b:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "TU;>;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm3/s;Lm3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/s<",
            "+",
            "Lio/reactivex/rxjava3/observables/a<",
            "TU;>;>;",
            "Lm3/o<",
            "-",
            "Lio/reactivex/rxjava3/core/i0<",
            "TU;>;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "TR;>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w2$e;->a:Lm3/s;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w2$e;->b:Lm3/o;

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
.method protected l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w2$e;->a:Lm3/s;

    .line 2
    .line 3
    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "The connectableFactory returned a null ConnectableObservable"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast v0, Lio/reactivex/rxjava3/observables/a;

    .line 13
    .line 14
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w2$e;->b:Lm3/o;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "The selector returned a null ObservableSource"

    .line 21
    .line 22
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    check-cast v1, Lio/reactivex/rxjava3/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/observable/s4;

    .line 28
    .line 29
    invoke-direct {v2, p1}, Lio/reactivex/rxjava3/internal/operators/observable/s4;-><init>(Lio/reactivex/rxjava3/core/p0;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lio/reactivex/rxjava3/internal/operators/observable/w2$c;

    .line 36
    .line 37
    invoke-direct {p1, v2}, Lio/reactivex/rxjava3/internal/operators/observable/w2$c;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/s4;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/observables/a;->M8(Lm3/g;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/d;->error(Ljava/lang/Throwable;Lio/reactivex/rxjava3/core/p0;)V

    .line 49
    .line 50
    .line 51
    return-void
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
