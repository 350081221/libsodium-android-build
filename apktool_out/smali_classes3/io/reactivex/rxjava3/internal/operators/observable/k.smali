.class public final Lio/reactivex/rxjava3/internal/operators/observable/k;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/observables/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/observables/a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final b:I

.field final c:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/observables/a;ILm3/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/observables/a<",
            "+TT;>;I",
            "Lm3/g<",
            "-",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->a:Lio/reactivex/rxjava3/observables/a;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->c:Lm3/g;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    return-void
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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->a:Lio/reactivex/rxjava3/observables/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/core/i0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->b:I

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->a:Lio/reactivex/rxjava3/observables/a;

    .line 17
    .line 18
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/k;->c:Lm3/g;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/observables/a;->M8(Lm3/g;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method
