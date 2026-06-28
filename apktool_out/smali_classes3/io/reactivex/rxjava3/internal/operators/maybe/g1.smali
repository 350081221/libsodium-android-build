.class public final Lio/reactivex/rxjava3/internal/operators/maybe/g1;
.super Lio/reactivex/rxjava3/internal/operators/maybe/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/maybe/g1$a;,
        Lio/reactivex/rxjava3/internal/operators/maybe/g1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/internal/operators/maybe/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:Lio/reactivex/rxjava3/core/q0;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/d0;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/d0<",
            "TT;>;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/a;-><init>(Lio/reactivex/rxjava3/core/d0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/g1;->b:Lio/reactivex/rxjava3/core/q0;

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
.method protected U1(Lio/reactivex/rxjava3/core/a0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/g1$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/g1$a;-><init>(Lio/reactivex/rxjava3/core/a0;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, Lio/reactivex/rxjava3/internal/operators/maybe/g1$a;->task:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 10
    .line 11
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/g1;->b:Lio/reactivex/rxjava3/core/q0;

    .line 12
    .line 13
    new-instance v2, Lio/reactivex/rxjava3/internal/operators/maybe/g1$b;

    .line 14
    .line 15
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/maybe/a;->a:Lio/reactivex/rxjava3/core/d0;

    .line 16
    .line 17
    invoke-direct {v2, v0, v3}, Lio/reactivex/rxjava3/internal/operators/maybe/g1$b;-><init>(Lio/reactivex/rxjava3/core/a0;Lio/reactivex/rxjava3/core/d0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lio/reactivex/rxjava3/core/q0;->e(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method
