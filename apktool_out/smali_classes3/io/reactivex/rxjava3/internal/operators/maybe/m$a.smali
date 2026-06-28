.class final Lio/reactivex/rxjava3/internal/operators/maybe/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/a0;
.implements Lio/reactivex/rxjava3/disposables/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/maybe/m;
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
        "Ljava/lang/Object;",
        "Lio/reactivex/rxjava3/core/a0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/maybe/m$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Lorg/reactivestreams/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/o<",
            "TU;>;"
        }
    .end annotation
.end field

.field c:Lio/reactivex/rxjava3/disposables/e;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/a0;Lorg/reactivestreams/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/a0<",
            "-TT;>;",
            "Lorg/reactivestreams/o<",
            "TU;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lio/reactivex/rxjava3/internal/operators/maybe/m$b;-><init>(Lio/reactivex/rxjava3/core/a0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    .line 10
    .line 11
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->b:Lorg/reactivestreams/o;

    .line 12
    .line 13
    return-void
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
.method a()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->b:Lorg/reactivestreams/o;

    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    invoke-interface {v0, v1}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 7
    .line 8
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    .line 11
    .line 12
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 13
    .line 14
    .line 15
    return-void
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
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/reactivex/rxjava3/internal/subscriptions/j;->CANCELLED:Lio/reactivex/rxjava3/internal/subscriptions/j;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 2
    .line 3
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a()V

    .line 6
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 2
    .line 3
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    .line 6
    .line 7
    iput-object p1, v0, Lio/reactivex/rxjava3/internal/operators/maybe/m$b;->error:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a()V

    .line 10
    .line 11
    .line 12
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    .line 12
    .line 13
    iget-object p1, p1, Lio/reactivex/rxjava3/internal/operators/maybe/m$b;->downstream:Lio/reactivex/rxjava3/core/a0;

    .line 14
    .line 15
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/a0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 2
    .line 3
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->c:Lio/reactivex/rxjava3/disposables/e;

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a:Lio/reactivex/rxjava3/internal/operators/maybe/m$b;

    .line 6
    .line 7
    iput-object p1, v0, Lio/reactivex/rxjava3/internal/operators/maybe/m$b;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/maybe/m$a;->a()V

    .line 10
    .line 11
    .line 12
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
