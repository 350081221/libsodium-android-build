.class public final Lio/reactivex/rxjava3/internal/observers/t;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4b2db39073b2fa8dL


# instance fields
.field volatile done:Z

.field fusionMode:I

.field final parent:Lio/reactivex/rxjava3/internal/observers/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/observers/u<",
            "TT;>;"
        }
    .end annotation
.end field

.field final prefetch:I

.field queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/internal/observers/u;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/observers/u<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->parent:Lio/reactivex/rxjava3/internal/observers/u;

    .line 5
    .line 6
    iput p2, p0, Lio/reactivex/rxjava3/internal/observers/t;->prefetch:I

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
.method public dispose()V
    .locals 0

    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->isDisposed(Lio/reactivex/rxjava3/disposables/e;)Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->done:Z

    return v0
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->parent:Lio/reactivex/rxjava3/internal/observers/u;

    invoke-interface {v0, p0}, Lio/reactivex/rxjava3/internal/observers/u;->innerComplete(Lio/reactivex/rxjava3/internal/observers/t;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->parent:Lio/reactivex/rxjava3/internal/observers/u;

    invoke-interface {v0, p0, p1}, Lio/reactivex/rxjava3/internal/observers/u;->innerError(Lio/reactivex/rxjava3/internal/observers/t;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->fusionMode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->parent:Lio/reactivex/rxjava3/internal/observers/u;

    .line 6
    .line 7
    invoke-interface {v0, p0, p1}, Lio/reactivex/rxjava3/internal/observers/u;->innerNext(Lio/reactivex/rxjava3/internal/observers/t;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->parent:Lio/reactivex/rxjava3/internal/observers/u;

    .line 12
    .line 13
    invoke-interface {p1}, Lio/reactivex/rxjava3/internal/observers/u;->drain()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iput v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->fusionMode:I

    .line 22
    .line 23
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 24
    .line 25
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/observers/t;->done:Z

    .line 26
    .line 27
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->parent:Lio/reactivex/rxjava3/internal/observers/u;

    .line 28
    .line 29
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/internal/observers/u;->innerComplete(Lio/reactivex/rxjava3/internal/observers/t;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 v1, 0x2

    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    iput v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->fusionMode:I

    .line 37
    .line 38
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->prefetch:I

    .line 42
    .line 43
    neg-int p1, p1

    .line 44
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/util/v;->c(I)Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/observers/t;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 49
    .line 50
    :cond_2
    return-void
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

.method public queue()Lio/reactivex/rxjava3/internal/fuseable/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    return-object v0
.end method

.method public setDone()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/observers/t;->done:Z

    return-void
.end method
