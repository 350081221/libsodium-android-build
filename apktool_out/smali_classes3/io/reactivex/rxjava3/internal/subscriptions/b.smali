.class public final Lio/reactivex/rxjava3/internal/subscriptions/b;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lorg/reactivestreams/q;
.implements Lio/reactivex/rxjava3/disposables/e;


# static fields
.field private static final serialVersionUID:J = 0x618aba5ea1440227L


# instance fields
.field final actual:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/reactivestreams/q;",
            ">;"
        }
    .end annotation
.end field

.field final resource:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->resource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->actual:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Lio/reactivex/rxjava3/internal/subscriptions/b;-><init>()V

    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->resource:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/subscriptions/b;->dispose()V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->actual:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/subscriptions/j;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->resource:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 9
    .line 10
    .line 11
    return-void
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
    .locals 2

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->actual:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public replaceResource(Lio/reactivex/rxjava3/disposables/e;)Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->resource:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    move-result p1

    return p1
.end method

.method public request(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->actual:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method

.method public setResource(Lio/reactivex/rxjava3/disposables/e;)Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->resource:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->set(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    move-result p1

    return p1
.end method

.method public setSubscription(Lorg/reactivestreams/q;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/subscriptions/b;->actual:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->deferredSetOnce(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;Lorg/reactivestreams/q;)Z

    return-void
.end method
