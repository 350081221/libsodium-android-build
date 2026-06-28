.class final Lio/reactivex/rxjava3/internal/operators/completable/b$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/f;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/completable/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/f;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x38ec1727c243e8a6L


# instance fields
.field final actualObserver:Lio/reactivex/rxjava3/core/f;

.field final next:Lio/reactivex/rxjava3/core/i;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/f;Lio/reactivex/rxjava3/core/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b$b;->actualObserver:Lio/reactivex/rxjava3/core/f;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/completable/b$b;->next:Lio/reactivex/rxjava3/core/i;

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

.method public onComplete()V
    .locals 3

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b$b;->next:Lio/reactivex/rxjava3/core/i;

    new-instance v1, Lio/reactivex/rxjava3/internal/operators/completable/b$a;

    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/completable/b$b;->actualObserver:Lio/reactivex/rxjava3/core/f;

    invoke-direct {v1, p0, v2}, Lio/reactivex/rxjava3/internal/operators/completable/b$a;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/core/f;)V

    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/i;->a(Lio/reactivex/rxjava3/core/f;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/completable/b$b;->actualObserver:Lio/reactivex/rxjava3/core/f;

    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/f;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/completable/b$b;->actualObserver:Lio/reactivex/rxjava3/core/f;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/f;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
