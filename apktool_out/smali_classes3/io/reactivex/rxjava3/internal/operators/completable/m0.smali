.class public final Lio/reactivex/rxjava3/internal/operators/completable/m0;
.super Lio/reactivex/rxjava3/core/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/completable/m0$a;
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/core/i;

.field final b:Lio/reactivex/rxjava3/core/q0;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/core/i;Lio/reactivex/rxjava3/core/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/m0;->a:Lio/reactivex/rxjava3/core/i;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/m0;->b:Lio/reactivex/rxjava3/core/q0;

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
.method protected Y0(Lio/reactivex/rxjava3/core/f;)V
    .locals 2

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/completable/m0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/completable/m0;->a:Lio/reactivex/rxjava3/core/i;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lio/reactivex/rxjava3/internal/operators/completable/m0$a;-><init>(Lio/reactivex/rxjava3/core/f;Lio/reactivex/rxjava3/core/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/m0;->b:Lio/reactivex/rxjava3/core/q0;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lio/reactivex/rxjava3/core/q0;->e(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/operators/completable/m0$a;->task:Lio/reactivex/rxjava3/internal/disposables/f;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/f;->replace(Lio/reactivex/rxjava3/disposables/e;)Z

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
