.class public final Lio/reactivex/rxjava3/disposables/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicReference;
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/g;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/rxjava3/disposables/e;
    .locals 2
    .annotation build Ll3/g;
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    .line 8
    .line 9
    sget-object v1, Lio/reactivex/rxjava3/internal/disposables/c;->DISPOSED:Lio/reactivex/rxjava3/internal/disposables/c;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lio/reactivex/rxjava3/disposables/e;->h()Lio/reactivex/rxjava3/disposables/e;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public b(Lio/reactivex/rxjava3/disposables/e;)Z
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/g;
        .end annotation
    .end param

    iget-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    move-result p1

    return p1
.end method

.method public c(Lio/reactivex/rxjava3/disposables/e;)Z
    .locals 1
    .param p1    # Lio/reactivex/rxjava3/disposables/e;
        .annotation build Ll3/g;
        .end annotation
    .end param

    iget-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->set(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/rxjava3/disposables/e;)Z

    move-result p1

    return p1
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/disposables/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/rxjava3/disposables/e;

    invoke-static {v0}, Lio/reactivex/rxjava3/internal/disposables/c;->isDisposed(Lio/reactivex/rxjava3/disposables/e;)Z

    move-result v0

    return v0
.end method
