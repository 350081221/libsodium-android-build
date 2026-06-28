.class public final Lio/reactivex/rxjava3/internal/operators/maybe/p0;
.super Lio/reactivex/rxjava3/core/x;
.source "SourceFile"

# interfaces
.implements Lm3/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/x<",
        "TT;>;",
        "Lm3/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lm3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/s<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm3/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/s<",
            "+TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/p0;->a:Lm3/s;

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
.end method


# virtual methods
.method protected U1(Lio/reactivex/rxjava3/core/a0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lio/reactivex/rxjava3/disposables/e;->j()Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    :try_start_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/p0;->a:Lm3/s;

    .line 15
    .line 16
    invoke-interface {v1}, Lm3/s;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Lio/reactivex/rxjava3/core/a0;->onComplete()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p1, v1}, Lio/reactivex/rxjava3/core/a0;->onSuccess(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    invoke-static {v1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->isDisposed()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-interface {p1, v1}, Lio/reactivex/rxjava3/core/a0;->onError(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-static {v1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
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

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/p0;->a:Lm3/s;

    invoke-interface {v0}, Lm3/s;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
