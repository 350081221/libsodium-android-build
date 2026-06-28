.class public final Lio/reactivex/rxjava3/internal/operators/observable/h0;
.super Lio/reactivex/rxjava3/core/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/h0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/i0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/n0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/n0<",
            "+TT;>;"
        }
    .end annotation
.end field

.field final b:Lio/reactivex/rxjava3/core/n0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/n0<",
            "TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/n0;Lio/reactivex/rxjava3/core/n0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TT;>;",
            "Lio/reactivex/rxjava3/core/n0<",
            "TU;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/i0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h0;->a:Lio/reactivex/rxjava3/core/n0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/h0;->b:Lio/reactivex/rxjava3/core/n0;

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
.method public l6(Lio/reactivex/rxjava3/core/p0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/disposables/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/disposables/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lio/reactivex/rxjava3/internal/operators/observable/h0$a;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/h0$a;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/h0;Lio/reactivex/rxjava3/internal/disposables/f;Lio/reactivex/rxjava3/core/p0;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/h0;->b:Lio/reactivex/rxjava3/core/n0;

    .line 15
    .line 16
    invoke-interface {p1, v1}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
