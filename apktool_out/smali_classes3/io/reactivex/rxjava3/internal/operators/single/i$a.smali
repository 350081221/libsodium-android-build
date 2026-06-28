.class final Lio/reactivex/rxjava3/internal/operators/single/i$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/single/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/rxjava3/disposables/e;",
        ">;",
        "Lio/reactivex/rxjava3/core/t<",
        "TU;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x76ddf7e9b08d21a8L


# instance fields
.field done:Z

.field final downstream:Lio/reactivex/rxjava3/core/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/u0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final source:Lio/reactivex/rxjava3/core/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/x0<",
            "TT;>;"
        }
    .end annotation
.end field

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/u0;Lio/reactivex/rxjava3/core/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/u0<",
            "-TT;>;",
            "Lio/reactivex/rxjava3/core/x0<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->source:Lio/reactivex/rxjava3/core/x0;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 7
    .line 8
    .line 9
    return-void
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

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->done:Z

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->source:Lio/reactivex/rxjava3/core/x0;

    .line 10
    .line 11
    new-instance v1, Lio/reactivex/rxjava3/internal/observers/a0;

    .line 12
    .line 13
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, Lio/reactivex/rxjava3/internal/observers/a0;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/core/u0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lio/reactivex/rxjava3/core/x0;->a(Lio/reactivex/rxjava3/core/u0;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->done:Z

    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/core/u0;->onError(Ljava/lang/Throwable;)V

    .line 15
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
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/single/i$a;->onComplete()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/single/i$a;->downstream:Lio/reactivex/rxjava3/core/u0;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lio/reactivex/rxjava3/core/u0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method
